package State;

public class EstadoBloqueado extends Estado{
    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiarEstado(new EstadoDesbloqueado(telefono));
        return "Telofono desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "La camara esta bloqueada";
    }

    @Override
    public String hacerFoto() {
        return "No se pueden hacer fotos, la camara esta bloqueda";
    }
}
