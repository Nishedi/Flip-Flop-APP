package pack;


import java.io.*;
import java.util.ArrayList;

public class Load {
    public static ArrayList<String> read() {
        //URL url = pack.Main.class.getResource("config"+".csv");
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedReader ReadF = null;
            ReadF = new BufferedReader(new FileReader("config.csv"));
            String numstring = ReadF.readLine();
            try {
                while (numstring != null) {
                    list.add(numstring);
                    numstring = ReadF.readLine();
                }
            } catch (Exception er) {
                return null;
            }
            ReadF.close();
        }catch (Exception x) {
            return null;
        }
        return list;
    }
    public static void save(ArrayList<String> data, String filename) throws IOException {
        PrintWriter zapis = new PrintWriter(filename);
        for(String s:data){
            zapis.println(s);
        }
        zapis.close();
    }
}
