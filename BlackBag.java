import java.util.ArrayList;
import java.util.Collections;

public class BlackBag {
    //private String[] crystals = new String[68];
    private ArrayList<String> crystals = new ArrayList<String>(68);


    public BlackBag(){
        int indice = 0;
        for(int i = 0;i<15;i++){
            crystals.add(i,"Quartzo");
            indice = i+1;
        }
        for(int i = indice;i<27;i++){
            crystals.add(i,"Rubelita");
            indice = i+1;

        }
        for(int i = indice;i<37;i++){
            crystals.add(i,"Esmeralda");
            indice = i+1;

        }
        for(int i = indice;i<44;i++){
            crystals.add(i,"Safira");
            indice = i+1;

        }
        for(int i = indice;i<48;i++){
            crystals.add(i,"Rubi");
            indice = i+1;

        }
        for(int i = indice;i<50;i++){
            crystals.add(i,"Âmbar");
            indice = i+1;

        }
        for(int i = indice;i<68;i++){
            crystals.add(i,"Autunita");
            indice = i+1;

        }
        shuffleCrystals();

    }

    public void shuffleCrystals() {
        Collections.shuffle(crystals);
    }

    public void showCrystals(){

        //FOREACH
        for(String crystals:crystals){
            System.out.println(crystals);
        }

        //for(int i=0;i<crystals.length;i++){
            //System.out.println(crystals[i]);}

        //System.out.println(Arrays.toString(crystals));
        }

}

