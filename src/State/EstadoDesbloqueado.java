package State;

public class EstadoDesbloqueado extends Estado{

    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "Telefono ya esta desbloqueado";
    }

    @Override
    public String abrirCamara() {

        telefono.cambiarEstado(new EstadoCamaraAbierta(telefono));
        return "Puedes hacer la foto";
    }

    @Override
    public String hacerFoto() {
        return "No se puede hacer una foto sin abrir la camara";
    }
}
