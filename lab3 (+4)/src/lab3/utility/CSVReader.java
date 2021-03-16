package lab3.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {

    public static List<List<String>> readFile(String file){
        List<List<String>> toReturn = new ArrayList<>();

        String line;
        BufferedReader br = null; // trebuie neaparat initializat la null?
        try{
            br = new BufferedReader(new FileReader(file));
            while( (line = br.readLine()) != null){
                
                String[] data = line.split(",");
                toReturn.add(Arrays.asList(data));
                /*
                for(List<String> elem : toReturn)
                    System.out.println(elem);
*/
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            if(br != null){
                try{
                    br.close();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return toReturn;
    }

}
