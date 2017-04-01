/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poesniper;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class WebsiteParser {
    Gson parser = new Gson();
    ChangeID changeId;
    String currentchangeid;
    private static String readUrl(String urlString) throws MalformedURLException, IOException 
    {
        BufferedReader reader = null;
        
        URL url;
        url = new URL(urlString);
        reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder buffer;
        buffer = new StringBuilder();
        ArrayList chars;  
        chars = new ArrayList<Character>();
     //    char[] chars = new char;
        int read; 
      
        
        
           while(chars.add((char) reader.read()) && chars.size() <=200);
           
       // reader.
    //    while ((read = reader.read(chars)) != 1 && chars[read] != '}')
    //        buffer.append(chars, 0, read); 
    //    buffer.append(chars);
        buffer.insert(0,chars);
        System.out.println(buffer.toString());
        return buffer.toString();
    
         
    }

    private String getChangeId() throws MalformedURLException, IOException 
    {
        BufferedReader reader = null;
    
        URL url;
        url = new URL("http://www.pathofexile.com/api/public-stash-tabs");
        reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder buffer;
        buffer = new StringBuilder();
         char[] chars = new char[55];
        int read; 
      
        reader.read(chars);
        
          buffer.insert(0,chars);
          ;
        //  buffer.append("}");
          currentchangeid = buffer.substring(19, 43);

//        System.out.println(currentchangeid);
        return currentchangeid;
        
         
    }
    public WebsiteParser() throws IOException {
        String jsonstring = readUrl("http://www.pathofexile.com/api/public-stash-tabs") + "?id=" +  getChangeId();
       
        parser = new Gson();
//        parser.fromJson(jsonstring, Item.class);
   //   System.out.println(parser.toString());
        //  String changeid = parser.getString("next_change_id");
        System.out.print(getChangeId());
        
        
    }
    
    
    
    
       // (http://www.pathofexile.com/api/public-stash-tabs?id=56860210-60152224-56353052-65539738-60863191);
   //JSONArray json = new JSONArray("http://www.pathofexile.com/api/public-stash-tabs?id=56860210-60152224-56353052-65539738-60863191");
   // public JSonParser()
            
    
//     JSONObject getJsonobject()
//    {
//        return parser;
//    }
             
    
    void print()
    {
        
        
        System.out.print(parser.toString());
    }
    
    
}