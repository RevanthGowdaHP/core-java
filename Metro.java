class Metro
{
 public static void main(String met[])
 {
  String cityName = "Banglore";
  String purpleLaneStart = "Mysore Road";
  String purpleLaneEnd   = "Baiyappanahalli";
  String greenLaneStart = "Nagasandra";
  String greenLaneEnd  = "Puttenahalli";
  int noOfBoggies = 10;
  int purflatNo  = 1;
  int greflatNo = 2 ;
  String purRoute = " Deependranagar , Attiguppe , Vijayanagar , Hosalli , MagadiRoad , City RailwayStation , Majestic , Sir.M. Vishveshwaraya , Vidhana Soudha, Cubbon park , Mahatma Ghandi road , Trinity, Halasuru , Indiranagar, Swami Vivekanada road ";
  String greRoute = "Dasarahalli , Jalahalli , Peenya industry , Peenya, Yeshwantahpura industry, Yeshwantahpura, Sandal Soap Factory , Mahalakshmi , Rajajinagar, Kuvempu Road , Srirampura, Sampige Road , Chikpete, Krishna Rajendra Market, National College, Lallbagh , Southern Circle , Jayanagar , RV road , Bansakari,  Jayaprakash nagar ";
  String commonRoute = "Majestic";
  System.out.println(" Name of the Metro City " + cityName);
  System.out.println(" Number of Boggies in each Metro train " + noOfBoggies);
  System.out.println(" Purple lane Starts from " +purpleLaneStart + " ends at " + purpleLaneEnd );
    System.out.println(" Metro Stations under Purple lane are " + purRoute);
	 System.out.println(" Green lane Starts from " +greenLaneStart + " ends at " + greenLaneEnd );
 System.out.println("Metro Stations under Green lane are " + greRoute + "ends at" +greenLaneEnd);
   System.out.println(" Flatform number for Purple lane " + purflatNo);
   System.out.println(" Flatform number for Green lane " + greflatNo);
   }
   }
  