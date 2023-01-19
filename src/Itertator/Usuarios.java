package Itertator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Usuarios implements UserIterator{


    private LinkedList<Usuario> usuarios =new LinkedList<>();
    private int posicion=0;
    public void Crear( Usuario usuario){
        usuarios.add(usuario);

    }

    @Override
    public boolean hayMas() {
        return posicion<usuarios.size();
    }

    @Override
    public void reinicia() {
        posicion=0;

    }

    @Override
    public Usuario siguiente() {

        Usuario usuario =this.usuarios.get(posicion);
        posicion=posicion+1;
        return usuario;
    }
}
