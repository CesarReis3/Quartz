import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<String>  coletedCrystals = new ArrayList<>();

    //setter
    public void setName(String playerName){
        this.name = playerName;
    }

    //Getter
    public String getName(){
        return name;
    }


    public void showMyCrystals(){
        System.out.println("Esses são seus cristais mineirados ");
        System.out.println(" ________________");
        for(String crystals:coletedCrystals){
            System.out.println("|  "+ crystals + "  |");
        }
        System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
    }

    public void mine(BlackBag saco){
        coletedCrystals.add(0, saco.mine());
    }


    public void useCard(){};

}
