package pack;

import java.io.IOException;
import java.util.ArrayList;

public class JK {
    public void JKdoner() throws IOException {

        Load czytaj = new Load();
        ArrayList<String> wczytane = czytaj.read();
        ArrayList<String> doobrobienia=new ArrayList<>();

        for(String s: wczytane){
            String[] tablica = s.split(";");
            String[] tablicadowyslania=new String[4];
            if(tablica[0].compareTo(String.valueOf(0))==0&&tablica[1].compareTo(String.valueOf(0))==0){
                tablicadowyslania[0]=tablica[0];
                tablicadowyslania[1]=tablica[1];
                tablicadowyslania[2]="0";
                tablicadowyslania[3]="-";
            }
            if(tablica[0].compareTo(String.valueOf(0))==0&&tablica[1].compareTo(String.valueOf(1))==0){
                tablicadowyslania[0]=tablica[0];
                tablicadowyslania[1]=tablica[1];
                tablicadowyslania[2]="1";
                tablicadowyslania[3]="-";
            }
            if(tablica[0].compareTo(String.valueOf(1))==0&&tablica[1].compareTo(String.valueOf(0))==0){
                tablicadowyslania[0]=tablica[0];
                tablicadowyslania[1]=tablica[1];
                tablicadowyslania[2]="-";
                tablicadowyslania[3]="1";
            }
            if(tablica[0].compareTo(String.valueOf(1))==0&&tablica[1].compareTo(String.valueOf(1))==0){
                tablicadowyslania[0]=tablica[0];
                tablicadowyslania[1]=tablica[1];
                tablicadowyslania[2]="-";
                tablicadowyslania[3]="0";
            }
            if(tablica[0].compareTo(String.valueOf(1))==0&&tablica[1].compareTo(String.valueOf(2))==0){
                tablicadowyslania[0]=tablica[0];
                tablicadowyslania[1]=tablica[1];
                tablicadowyslania[2]="k";
                tablicadowyslania[3]="k";
            }
            if(tablica[0].compareTo("X")==0){
                tablicadowyslania[0]="nowa";
                tablicadowyslania[1]=" ";
                tablicadowyslania[2]="linia";
                tablicadowyslania[3]="\n";
            }
            String str =tablicadowyslania[0]+";"+tablicadowyslania[1]+";"+tablicadowyslania[2]+";"+tablicadowyslania[3];
            doobrobienia.add(str);
        }
        czytaj.save(doobrobienia,"results.csv");
    }
}
