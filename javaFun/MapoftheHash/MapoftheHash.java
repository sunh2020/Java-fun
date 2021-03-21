import java.util.HashMap;
import java.util.Set;
public class MapoftheHash {
    public void trackList(){
    
    // Create a trackList of type HashMap

    // Add in at least 4 songs that are stored by title
    
    // Pull out one of the songs by its track title

    // Print out all the track names and lyrics in the format Track: Lyrics

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Song one", "Lyrics for song one");
        trackList.put("Song two", "Lyrics for song two");
        trackList.put("Song three", "Lyrics for song three");
        trackList.put("Song four", "Lyrics for song four");
        String m = trackList.get("Song three");
        System.out.println(m);

        // get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
        
        }
    }
   

