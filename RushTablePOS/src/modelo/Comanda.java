package modelo;

import java.time.LocalTime;
import java.util.ArrayList;
import modelo.FoodItem;
import modelo.ItemMenu;
import modelo.Restaurante;

public class Comanda {
    private String estado;
    private String id;
    private LocalTime tiempoEnvio;
    public ArrayList<ItemMenu> itemsComanda;
    public Mesero mesero;

    // Constructor
    public Comanda(String id, Mesero mesero) {
        this.id = id;
        this.itemsComanda = new ArrayList<>();
        this.mesero = mesero;
    }

    // Métodos especiales

    public ItemMenu buscarElementoPorId(String id) {
        for (ItemMenu item : itemsComanda) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null; // Null si no existe
    }

    // Método para determinar si un elemento es comida o bebida
    public boolean esComida(ItemMenu item) {
        return item instanceof FoodItem;
    }

    // Método para enviar la comanda al restaurante
   public void mandarComanda(Restaurante restaurante, Comanda comanda, Mesero mesero) {
    try {
        Comanda comandaCocina = new Comanda("Cocina-" + id, mesero);
        Comanda comandaBarra = new Comanda("Barra-" + id, mesero);

        for (ItemMenu item : comanda.itemsComanda) {
            if (esComida(item)) {
                comandaCocina.agregarElemento(item);
            } else {
                comandaBarra.agregarElemento(item);
            }
        }

        if (!comandaCocina.itemsComanda.isEmpty()) {
            restaurante.getCocina().add(comandaCocina);
        }

        if (!comandaBarra.itemsComanda.isEmpty()) {
            restaurante.getBarra().add(comandaBarra);
        }

        // Actualizar el estado de la comanda después de enviarla
        setEstado("Enviado");
        setTiempoEnvio(LocalTime.now());
    } catch (Exception e) {
        System.out.println("Error al enviar la comanda: " + e.getMessage());
    }
} 

    // Método para agregar un elemento a la comanda
    public void agregarElemento(ItemMenu item) {
        try {
            itemsComanda.add(item);
        } catch (Exception e) {
            System.out.println("Error al agregar un elemento a la comanda: " + e.getMessage());
        }
    }

    // Método para eliminar un elemento de la comanda
    public void eliminarElemento(String id) {
        try {
            ItemMenu item = buscarElementoPorId(id);
            if (item != null) {
                itemsComanda.remove(item);
            } else {
                System.out.println("El elemento con ID " + id + " no se encuentra en la comanda.");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar un elemento de la comanda: " + e.getMessage());
        }
    }


    // Getters y setters
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalTime getTiempoEnvio() {
        return tiempoEnvio;
    }

    public void setTiempoEnvio(LocalTime tiempoEnvio) {
        this.tiempoEnvio = tiempoEnvio;
    }

    public String toString() {
        return "Comanda : " + getId() +  " " + getEstado() + " " + getTiempoEnvio();
    }
}
