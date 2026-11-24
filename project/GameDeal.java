import java.util.*;
import java.net.*;
import java.io.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GameDeal {

  public static void main(String[] args){
    new GameDeal();
  } // end of main


  public GameDeal(){
    String query = "https://www.cheapshark.com/api/1.0/deals?storeID=1&upperPrice=15";
    String result = readStringFromURL(query);
    System.out.println(result);
  } // end of GameDeal

 
  public String readStringFromURL(String query){
    String result = "";

    try {
      URL url = new URL(query);

      InputStreamReader iReader = new InputStreamReader(url.openStream());
      BufferedReader reader = new BufferedReader(iReader);
    
      String line;
      while ((line = reader.readLine()) != null){
        result += line + "\n";
      } // end while
      
      reader.close();
      iReader.close();
    } catch (IOException e){
      System.out.println("Something went wrong...");
    } // end try
    return result;
  } // end readString


} // end of GameDeal class

class Game {
  String internalName;
  String title;
  String gameID;
  String salePrice;
  String normalPrice;
  String savings;
  String steamRatingText;
  String steamRatingPercent;
  String steamRatingCount;
  String steamAppID;

} // end of Game //place holder, work on later
