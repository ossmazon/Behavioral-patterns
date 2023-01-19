package Observer;

public class TersterMain {

    public static void main(String[] args) {

        Emisor emisor =new Emisor();

        ReceptorRadio radio =new ReceptorRadio();
        ReceptorTv tv =new ReceptorTv();
        ReceptorSatelite satelite=new ReceptorSatelite();

        emisor.meterReceptor(radio);
        emisor.meterReceptor(tv);
        emisor.meterReceptor(satelite);
        emisor.emite();
    }




}

