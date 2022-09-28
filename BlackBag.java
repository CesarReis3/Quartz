import java.util.ArrayList;
import java.util.Collections;

public class BlackBag {
    //private String[] crystals = new String[68];
    private ArrayList<String> crystals = new ArrayList<String>(68);


    public BlackBag(){
        int indice = 0;
        for(int i = 0;i<15;i++){
            crystals.add(i,"Quartzo     ");
            indice = i+1;
        }
        for(int i = indice;i<27;i++){
            crystals.add(i,"Rubelita    ");
            indice = i+1;

        }
        for(int i = indice;i<37;i++){
            crystals.add(i,"Esmeralda   ");
            indice = i+1;

        }
        for(int i = indice;i<44;i++){
            crystals.add(i,"Safira      ");
            indice = i+1;

        }
        for(int i = indice;i<48;i++){
            crystals.add(i,"Rubi        ");
            indice = i+1;

        }
        for(int i = indice;i<50;i++){
            crystals.add(i,"Âmbar       ");
            indice = i+1;

        }
        for(int i = indice;i<68;i++){
            crystals.add(i,"Autunita    ");
            indice = i+1;

        }
        shuffleCrystals();

    }

   //Metodo para embaralhar a Bag.
    public void shuffleCrystals() {
        Collections.shuffle(crystals);
    }


    //Metodo para mostrar os cristais dentro da Bag
    public void showCrystals(){

        //FOREACH
        for(String crystals:crystals){
            System.out.println(crystals);
        }
        //Quantos itens ainda restam na Bag
        System.out.println(crystals.size());

        }

    public String mine() {
        String minedCrystal = crystals.get(0);
        System.out.println("Você acabou de mineirar: " + crystals.get(0));
        crystals.remove(0);
        shuffleCrystals();
        return minedCrystal;
    }
}



