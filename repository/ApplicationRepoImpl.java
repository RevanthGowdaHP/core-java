package com.xworkz.applications.repository;

import com.xworkz.applications.dto.ApplicationMembers;

import java.sql.*;

public class ApplicationRepoImpl implements ApplicationRepoInterface{
    @Override
    public void saveApp(ApplicationMembers application) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loading Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url= "jdbc:mysql://localhost:3306/SOFTWAREE";
        String username = "root";
        String password = "4MC19EE083";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sqlQuery = "insert into app(name,size,company_name,type) values(?,?,?,?)";

        try {
           connection=  DriverManager.getConnection(url,username,password);
            System.out.println("Connecting......");
           preparedStatement= connection.prepareStatement(sqlQuery);
            System.out.println("Preparing statement .........");
           preparedStatement.setString(1,application.getName());
           preparedStatement.setInt(2,application.getSize());
           preparedStatement.setString(3,application.getCompany_name());
           preparedStatement.setString(4,application.getType());
           preparedStatement.execute();
            System.out.println("Inserted successfully.......");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
               if (connection!=null){
                   connection.close();
               }
            } catch (SQLException e) {
//                throw new RuntimeException(e);
            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
//                throw new RuntimeException(e);
            }
        }


    }

    @Override
    public void getAppDetails(ApplicationMembers appDetails) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url= "jdbc:mysql://localhost:3306/SOFTWAREE";
        String username = "root";
        String password = "4MC19EE083";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sqlQuery = "Select * from app ";

        try {
            connection=  DriverManager.getConnection(url,username,password);
            System.out.println("Connecting......");
            preparedStatement= connection.prepareStatement(sqlQuery);
            System.out.println("Preparing statement .........");

           ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Here is the Application details: ");
          while(resultSet.next()){
              System.out.println("\nApplication id :"+resultSet.getInt("id"));
              System.out.println("Application name: "+resultSet.getString("name"));
              System.out.println("Application size: "+resultSet.getInt("size"));
              System.out.println("Application Company name: "+resultSet.getString("company_name"));
              System.out.println("Application type: "+resultSet.getString("type"));

          }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
//                throw new RuntimeException(e);
            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
//                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public ApplicationMembers getAppDetailsByName(String name) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url= "jdbc:mysql://localhost:3306/SOFTWAREE";
        String username = "root";
        String password = "4MC19EE083";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet;
        String sqlQuery = "Select * from app where name=?";
         ApplicationMembers applicationMembers = new ApplicationMembers();
        try {
            connection =DriverManager.getConnection(url,username,password);
            preparedStatement =connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,name);
            resultSet= preparedStatement.executeQuery();

            if (resultSet.next()){
             applicationMembers.setName(resultSet.getString("name"));
             applicationMembers.setCompany_name(resultSet.getString("company_name"));
             applicationMembers.setType(resultSet.getString("type"));
             applicationMembers.setSize(resultSet.getInt("size"));
             return  applicationMembers;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
//                throw new RuntimeException(e);
            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
//                throw new RuntimeException(e);
            }
        }

       return null;
    }

    @Override
    public int updateSizeByAppName(int size ,String name) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url= "jdbc:mysql://localhost:3306/SOFTWAREE";
        String username = "root";
        String password = "4MC19EE083";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet;
        String sqlQuery = "Update app set size =? where name =?";
        try {
            connection =DriverManager.getConnection(url,username,password);
            preparedStatement =connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,size);
            preparedStatement.setString(2,name);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return size;
    }

    @Override
    public void deleteAppDetailsByType(String type) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/softwaree";
        String username= "root";
        String password = "4MC19EE083";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sqlQuery = "Delete from app where type=?";
        try {
           connection= DriverManager.getConnection(url,username,password);
           preparedStatement=connection.prepareStatement(sqlQuery);
           preparedStatement.setString(1,type);
           preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
