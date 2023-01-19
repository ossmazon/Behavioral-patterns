package Strategy;

import java.util.ArrayList;

public class TesterMain {
    public static void main(String[] args) {
        //envoltorio para varias funciones
        //un mismo codigo se pueda utilizar de formas diferentes

        //UsuariosFichero usuarios = new UsuariosFichero();
        UsuariosMemoria usuarios = new UsuariosMemoria();
        crear(usuarios,"uno");
        crear(usuarios,"Dos");
        crear(usuarios,"Tres");
        crear(usuarios,"Cuatro");
        crear(usuarios,"Sinco");
        crear(usuarios,"Seis");

        for (String usuario : usuarios.lista()
             ) {
            System.out.println(usuario);
            
        }
    }

    public static void crear(User user,String nombre){
        user.crear(nombre);
    }
    public static ArrayList<String>Lista(User user){
        return user.lista();
    }
}
