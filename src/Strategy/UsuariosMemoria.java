package Strategy;

import java.util.ArrayList;

public class UsuariosMemoria implements User{

    private ArrayList<String> usuarios =new ArrayList<>();

    @Override
    public void crear(String nombre){
        usuarios.add(nombre);
    }

    @Override
    public ArrayList<String> lista(){
        return usuarios;
    }
}
