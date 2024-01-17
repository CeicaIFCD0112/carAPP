public class VehiculoMotororizado extends Vehiculo {

    String combust;

    public <Combust> VehiculoMotororizado(String marca, String modelo, int year, String combust) {
        super(marca, modelo, year);
        this.combust = combust;
}

@Override
public void verDetalles(){
    System.out.println("VehiculoMotorizado(){" + "combust='" + combust + "marca='" + marca + "modelo='" + modelo + "year='" + year }
    }
}

