package modelo;

public class Payment {
    private String metodoPago;
    private double monto;

    public Payment(String metodoPago, double monto) {
        this.metodoPago = metodoPago;
        this.monto = monto;
    }

    // Métodos getter y setter
    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
