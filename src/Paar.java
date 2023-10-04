import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Paar {
    private String wort;
    private String url;
    private Map<Integer, String> map = new HashMap<>();

    // Konstruktor
    public Paar(String pfadToJson) throws Exception {



        try {
            if(pfadToJson == null){
                map.put(0, "Hund" + " - " + "https://creazilla-store.fra1.digitaloceanspaces.com/cliparts/6007/dog-clipart-md.png");
                map.put(1, "Baum" + " - " + "https://i.pinimg.com/originals/c5/17/da/c517da1b29ac7d142f40f489fb9d32ce.jpg");
            }else {
                JSONTokener tokener = new JSONTokener(new FileReader(pfadToJson));
                JSONArray jsonArray = new JSONArray(tokener);


                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    int id = jsonObject.getInt("id");
                    String wort = jsonObject.getString("wort");
                    String url = jsonObject.getString("url");

                    map.put(id, wort + " - " + url);
                }
            }
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                int id = entry.getKey();
                String data = entry.getValue();
                System.out.println("ID: " + id + ", Data: " + data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setWort(String wort){
        this.wort = wort;
    }

    public String getWort() {
        return wort;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }


    public String zufallsauswahl() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(map.size());
        String i = map.get(randomIndex);
        return i;
    }

    public String bestimmtesPaar(int index){
        String s = map.get(index);
        System.out.println(s);
        return s;
    }

    public Map<Integer, String> getMap(){
        return this.map;
    }


}

