package Mediator;

public class ColegaConcreto3 extends  Colega{
    @Override
    void recibe() {
        System.out.println("He recibido el mensaje colega3");

    }

    @Override
    void envia() {
        System.out.println("Soy colegaConcreto3, envio un mensaje");
        mediator.reenvia(this);

    }
}
