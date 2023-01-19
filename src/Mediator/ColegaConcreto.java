package Mediator;

public class ColegaConcreto extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibido el mensaje colega1");

    }

    @Override
    void envia() {
        System.out.println("Soy colegaConcreto, envio un mensaje");
        mediator.reenvia(this);

    }
}
