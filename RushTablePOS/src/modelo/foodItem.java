package modelo;

public class foodItem extends ItemMenu {
    private String alergia;
    private boolean isSomeoneAlergic;

    // Constructor
    public foodItem(String id, String name, String category, Duration timeForPreparation, double precio, String alergia, boolean isSomeoneAlergic) {
        super(id, name, category, timeForPreparation, precio);
        this.alergia = alergia;
        this.isSomeoneAlergic = isSomeoneAlergic;
    }
}
