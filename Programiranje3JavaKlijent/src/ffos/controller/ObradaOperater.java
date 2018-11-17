/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ffos.model.Operater;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaOperater {
    
    private static final String PUTANJA_API="http://localhost/Programiranje3API/";
    private static Gson gson;

    public ObradaOperater() {
        gson = new GsonBuilder().setDateFormat("yyyy-mm-dd HH:mm:ss").create();
    }
    
    public List<Operater> getOperateri(){
        return gson.fromJson(getAPI("read", "GET"), new TypeToken<List<Operater>>(){}.getType());
    }

    private String getAPI(String ruta, String metoda) {
        
        try{
            URL url = new URL(PUTANJA_API + ruta);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(metoda);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.connect();
            
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linija=null;
            StringBuilder sb = new StringBuilder();
            while((linija=br.readLine())!=null){
                sb.append(linija);
            }
            br.close();
            is.close();
            return sb.toString();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return"";
    }
    
}
