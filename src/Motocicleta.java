class Motocicleta extends VehiculoMotororizado{
    private String marca;
    private String modelo;
    private int year;

    public Motocicleta(String marca, String modelo, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Motocileta [marca=" + marca + ", modelo=" + modelo + ", year=" + year + "]";
    }
}
