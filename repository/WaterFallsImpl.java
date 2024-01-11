package com.xworkz.waterfalls.repository;

import com.xworkz.waterfalls.dto.WaterFalls;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WaterFallsImpl implements WaterFallsRepository{
    @Override
    public void waterFalls(WaterFalls waterFalls) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/waterfalls";
        String username ="root";
        String password = "4MC19EE083";
        Connection connection = null;
        String sqlQuery = "insert into waterfall (id,name,place,river,state) values(?,?,?,?,?)";
        try {
            connection= DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,waterFalls.getId());
            preparedStatement.setString(2,waterFalls.getName());
            preparedStatement.setString(3,waterFalls.getPlace());
            preparedStatement.setString(4,waterFalls.getRiver());
            preparedStatement.setString(5,waterFalls.getState());
            preparedStatement.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

    @Override
    public void waterFalls(List<WaterFalls> waterFalls) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/waterfalls";
        String username ="root";
        String password = "4MC19EE083";
        Connection connection = null;
        String sqlQuery = "insert into waterfall (id,name,place,river,state) values (?,?,?,?,?)";
         PreparedStatement preparedStatement= null;
        try {
            connection=DriverManager.getConnection(url,username,password);
           preparedStatement= connection.prepareStatement(sqlQuery);
            for (WaterFalls water :waterFalls) {
                System.out.println("WaterFall name :"+ water.getName());
                preparedStatement.setInt(1,water.getId());
                preparedStatement.setString(2,water.getName());
                preparedStatement.setString(3,water.getPlace());
                preparedStatement.setString(4,water.getRiver());
                preparedStatement.setString(5,water.getState());
                preparedStatement.executeUpdate();
            }
            System.out.println("Added successfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                assert preparedStatement != null;
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void updateRiverName(String riverName, String place) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        String url = "jdbc:mysql://localhost:3306/waterfalls";
        String username ="root";
        String password = "4MC19EE083";
        Connection connection = null;
        String sqlQuery = "update waterfall set name= ? where place=?";
        PreparedStatement preparedStatement= null;

        try {
            connection=DriverManager.getConnection(url,username,password);
            preparedStatement= connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,riverName);
            preparedStatement.setString(2,place);
            preparedStatement.executeUpdate();
            System.out.println("River name updated successfully.......");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection != null) {
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

    @Override
    public void updatePlaceName(List<WaterFalls> waterFalls) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        String url = "jdbc:mysql://localhost:3306/waterfalls";
        String username ="root";
        String password = "4MC19EE083";
        Connection connection = null;
        String sqlQuery = "update waterfall set name= ? where place=?";
        PreparedStatement preparedStatement= null;

        try {
            connection=DriverManager.getConnection(url,username,password);
            preparedStatement= connection.prepareStatement(sqlQuery);
            for (WaterFalls water:waterFalls) {
                preparedStatement.setString(1, water.getName());
                preparedStatement.setString(2, water.getPlace());
                System.out.println(water.getName());
                System.out.println(water.getPlace());
                preparedStatement.executeUpdate();
            }
            System.out.println("River name updated successfully.......");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection != null) {
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

    @Override
    public boolean deleteStateName(String stateName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        String url = "jdbc:mysql://localhost:3306/waterfalls";
        String username = "root";
        String password = "4MC19EE083";
        Connection connection = null;
        String sqlQuery = "delete from waterfall where state=?";
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, stateName);
            preparedStatement.executeUpdate();
            System.out.println("State name deleted successfully.......");
            return  true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (connection != null) {
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

    @Override
    public WaterFalls getWaterFallByName(String name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loading......");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/waterfalls";
        String username = "root";
        String password = "4MC19EE083";
        String sqlQuery ="Select * from waterfall where name =?";

        Connection connection =null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet;
        WaterFalls waterFalls = new WaterFalls();
        try {
            connection =DriverManager.getConnection(url,username,password);
            preparedStatement= connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,name);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                waterFalls.setId(resultSet.getInt(1));
                waterFalls.setName(resultSet.getString(2));
                waterFalls.setPlace(resultSet.getString(3));
                waterFalls.setRiver(resultSet.getString(4));
                waterFalls.setState(resultSet.getString(5));
            }
            return waterFalls;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection != null) {
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

    @Override
    public List<WaterFalls> getWaterFallDetailsByName(String name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/waterfalls";
        String username = "root";
        String password = "4MC19EE083";
        String sqlQuery ="Select * from waterfall where name =?";

        Connection connection =null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet;
        WaterFalls waterFalls = new WaterFalls();
        try {
            connection =DriverManager.getConnection(url,username,password);
            preparedStatement= connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,name);
            resultSet = preparedStatement.executeQuery();
            List<WaterFalls> list = new ArrayList<>();
            if (resultSet.next()){
                waterFalls.setId(resultSet.getInt(1));
                waterFalls.setName(resultSet.getString(2));
                waterFalls.setPlace(resultSet.getString(3));
                waterFalls.setRiver(resultSet.getString(4));
                waterFalls.setState(resultSet.getString(5));
                list.add(waterFalls);
                return list;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection != null) {
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
        return null;
    }

    @Override
    public List<WaterFalls> getAllDetails() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/waterfalls";
        String username = "root";
        String password = "4MC19EE083";
        String sqlQuery ="Select * from waterfall";

        Connection connection =null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet;
        WaterFalls waterFalls = new WaterFalls();
        try {
            connection =DriverManager.getConnection(url,username,password);
            preparedStatement= connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();
            List<WaterFalls> list = new ArrayList<>();
            while(resultSet.next()){
                waterFalls.setId(resultSet.getInt(1));
                waterFalls.setName(resultSet.getString(2));
                waterFalls.setPlace(resultSet.getString(3));
                waterFalls.setRiver(resultSet.getString(4));
                waterFalls.setState(resultSet.getString(5));
                list.add(waterFalls);
                return list;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (connection != null) {
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
        return null;
    }
}
