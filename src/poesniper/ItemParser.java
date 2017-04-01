/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poesniper;

import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.*;
 /**
 *
 * @author Arthur
 */
public class ItemParser {
     WebsiteParser parser;
    public ItemParser() throws IOException {
        this.parser = new WebsiteParser();
       
    }
   
    protected Item searchForItem(String itemName)
    {
        JSONArray stashList;
        
 
        String itemList = parser.getJsonobject().getString("name");
        stashList = (JSONArray) parser.getJsonobject().getJSONArray("stashes");
        stashList.toList();
        parser.getJsonobject().
       
        
        return stashList;
  / }
}
