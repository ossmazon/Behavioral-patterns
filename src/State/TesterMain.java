package State;

public class TesterMain {

    //si no pasa una cosa no puede pasar otra cosa
    //gestionar tracking
    //gestionar work flow


    public static void main(String[] args) {

        Telefono tel =new Telefono();

        System.out.println(tel.estado.desbloquear());
        System.out.println(tel.estado.abrirCamara());
        System.out.println(tel.estado.hacerFoto());
    }


}
