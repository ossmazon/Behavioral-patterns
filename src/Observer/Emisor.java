package Observer;

import java.util.ArrayList;

public class Emisor {
    private ArrayList<Receptor>receptor= new ArrayList<>();

    public void meterReceptor(Receptor receptor){
        this.receptor.add(receptor);
    }

    public void emite(){
        for (Receptor receptor: receptor
             ) {
            receptor.recibe();
        }
    }
}
