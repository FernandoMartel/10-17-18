package Vehiculo;

public class Utilitario extends Automovil {
    private String caja;

    public Utilitario (Double pre, Boolean ent,String caja){
        super(pre,ent);
        this.caja = caja;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }
}
