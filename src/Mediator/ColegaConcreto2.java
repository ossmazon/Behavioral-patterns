package Mediator;

public class ColegaConcreto2 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibido el mensaje colega2");

    }

    @Override
    void envia() {
        System.out.println("Soy colegaConcreto2, envio un mensaje");
        mediator.reenvia(this);

    }
}
