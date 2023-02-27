import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Wczytaj czytaj = new Wczytaj();
        ArrayList<String> wczytane = czytaj.read();
        ArrayList<String> doobrobienia=new ArrayList<>();

        for(String s: wczytane){
            String[] tablica = s.split(";");
            String[] tablicadowysłania=new String[4];
            if(tablica[0].compareTo(String.valueOf(0))==0&&tablica[1].compareTo(String.valueOf(0))==0){
                tablicadowysłania[0]=tablica[0];
                tablicadowysłania[1]=tablica[1];
                tablicadowysłania[2]="0";
                tablicadowysłania[3]="-";
            }
            if(tablica[0].compareTo(String.valueOf(0))==0&&tablica[1].compareTo(String.valueOf(1))==0){
                tablicadowysłania[0]=tablica[0];
                tablicadowysłania[1]=tablica[1];
                tablicadowysłania[2]="1";
                tablicadowysłania[3]="-";
            }
            if(tablica[0].compareTo(String.valueOf(1))==0&&tablica[1].compareTo(String.valueOf(0))==0){
                tablicadowysłania[0]=tablica[0];
                tablicadowysłania[1]=tablica[1];
                tablicadowysłania[2]="-";
                tablicadowysłania[3]="1";
            }
            if(tablica[0].compareTo(String.valueOf(1))==0&&tablica[1].compareTo(String.valueOf(1))==0){
                tablicadowysłania[0]=tablica[0];
                tablicadowysłania[1]=tablica[1];
                tablicadowysłania[2]="-";
                tablicadowysłania[3]="0";
            }
            if(tablica[0].compareTo("X")==0){
                tablicadowysłania[0]="nowa";
                tablicadowysłania[1]=" ";
                tablicadowysłania[2]="linia";
                tablicadowysłania[3]="\n";
            }
            String str =tablicadowysłania[0]+";"+tablicadowysłania[1]+";"+tablicadowysłania[2]+";"+tablicadowysłania[3];
            doobrobienia.add(str);
        }
        czytaj.save(doobrobienia,"results.csv");
    }
}