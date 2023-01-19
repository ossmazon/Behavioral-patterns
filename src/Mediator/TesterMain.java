package Mediator;

public class TesterMain {

    //comunicar un mensaje con ontros y el que emite no recibe el mensaje
    //se comunican de una forma centralizada y cooerente
    //objetivo comunincar clases
    public static void main(String[] args) {
        Mediator mediator= new MediadorConcreto();

        Colega colega1 =new ColegaConcreto();
        Colega colega2 =new ColegaConcreto2();
        Colega colega3 =new ColegaConcreto3();

        mediator.registra(colega1);
        mediator.registra(colega2);
        mediator.registra(colega3);
        colega3.envia();
    }
}
