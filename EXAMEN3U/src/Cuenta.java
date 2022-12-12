public class Cuenta {
    private String nombreCliente;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNumero_de_Cuenta() {
        return numero_de_Cuenta;
    }

    private String numero_de_Cuenta;
    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cuenta(String nombreCliente, String numero_de_Cuenta, double monto) {
        this.nombreCliente = nombreCliente;
        this.numero_de_Cuenta = numero_de_Cuenta;
        this.monto = monto;
    }


}
