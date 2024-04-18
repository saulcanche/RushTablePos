package modelo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Cuenta {
    private Mesero mesero;
    private String id;
    private double subtotal;
    private double IVA;
    private double total;
    private LocalDate date;
    private LocalTime time;
    private String area;
    private boolean isPayed;
    private Payment payment;
    private ArrayList<ItemMenu> itemsConsumidos;
    //funciones especiales

    public void incrementarSubtotal(double cantidadAumento){
        setSubtotal(getSubtotal()+cantidadAumento);

    }
    public void incrementarTotal(double cantidaAumento){
        setTotal(getTotal()+cantidaAumento);
    }
    public void incrementarIVA(double cantidadAumento){
        setIVA(getIVA()+cantidadAumento);
    }

    }
    public void agregarItemCuenta(itemMenu item){
        itemsConsumidos.add(item);
        incrementarSubtotal(item.getPrecio());
        incrementarIVA(item.getPrecio * 0.16);
        incrementarTotal(item.getPrecio + item.getPrecio * 0.16);
    }

    // Constructor
    public Cuenta(String id, LocalDate date, LocalTime time) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.itemsConsumidos = new ArrayList<>();
    }
    //setter 

    public void setWaiter(Mesero waiter) {
        this.mesero = waiter;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setItemsConsumidos(ArrayList<ItemMenu> itemsConsumidos) {
        this.itemsConsumidos = itemsConsumidos;
    }
    
    //getters

    public Mesero getMesero() {
        return mesero;
    }

    public String getId() {
        return id;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getIVA() {
        return IVA;
    }

    public double getTotal() {
        return total;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getArea() {
        return area;
    }

    public boolean isIsPayed() {
        return isPayed;
    }

    public Payment getPayment() {
        return payment;
    }

    public ArrayList<ItemMenu> getItemsConsumidos() {
        return itemsConsumidos;
    }
    
}

