
package modelo;

import java.util.*;

/**
 * @author Octavio
 **/

public class Restaurante {

   public ArrayList<Empleado> empleados;
   public ArrayList<Cuenta> cuentasAbiertas;
   public ArrayList<Cuenta> cuentasHoy;
   public ArrayList<Descuento> descuentos;
   public Queue<Comanda> Barra;
   public Queue<Comanda> Cocina;

   public Restaurante() {

      this.empleados = new ArrayList<>();
      this.cuentasAbiertas = new ArrayList<>();
      this.cuentasHoy = new ArrayList<>();
      this.descuentos = new ArrayList<>();
      this.Barra = new LinkedList<>();
      this.Cocina = new LinkedList<>();

   }

   public Restaurante
           (ArrayList<Empleado> empleados, ArrayList<Cuenta> cuentasAbiertas, ArrayList<Cuenta> cuentasHoy,
            ArrayList<Descuento> descuentos, Queue<Comanda> Barra, Queue<Comanda> Cocina)
   {
      /*
      Este constructor servirá para cuando ya existen datos previos de un restaurante
      Se crearon setters y getters para comprobar que los elementos usados sean validos
      para el uso general del programa.
       */
      setEmpleados(empleados);
      setCuentasAbiertas(cuentasAbiertas);
      setCuentasHoy(cuentasHoy);
      setDescuentos(descuentos);
      setBarra(Barra);
      setCocina(Cocina);
   }

   public void setEmpleados(ArrayList<Empleado> E) {
      if (!Objects.deepEquals(E, null)) {
         this.empleados = E;
         return;
      }
      System.out.println("Error al crear restaurante: Empleados = null !!!.\n");
      System.exit(-1);
   }

   public void setCuentasAbiertas(ArrayList<Cuenta> C) {
      if (!Objects.deepEquals(C, null)) {
         this.cuentasAbiertas = C;
         return;
      }
      System.out.println("Error al crear restaurante: CuentasAbiertas = null !!!.\n");
      System.exit(-1);
   }

   public void setCuentasHoy(ArrayList<Cuenta> C) {
      if (!Objects.deepEquals(C, null)) {
         this.cuentasHoy = C;
         return;
      }
      System.out.println("Error al crear restaurante: CuentasHoy = null !!!!");
      System.exit(-1);
   }

   public void setDescuentos(ArrayList<Descuento> D) {
      if (!Objects.deepEquals(D, null)) {
         this.descuentos = D;
         return;
      }
      System.out.println("Error al crear restaurante : Descuentos = null !!!");
      System.exit(-1);
   }

   public void setBarra(Queue<Comanda> B) {
      if (!Objects.deepEquals(B, null)) {
         this.Barra = B;
         return;
      }
      System.out.println("Error al crear restaurante : Barra = null !!!");
      System.exit(-1);
   }

   public void setCocina(Queue<Comanda> C) {
      if (!Objects.deepEquals(C, null)) {
         this.Cocina = C;
         return;
      }
      System.out.println("Error al crear restaurante : Cocina = null !!!");
      System.exit(-1);
   }

   public void AgregarEmpleado(String nombre, String apellido, String NSS, String rol) {
      try {
         // generar new id y new userCode
         int new_id = 0;
         int new_userCode = 0;
         Autoridad aut = Autoridad.LOW;

         if (Objects.equals(rol, "Supervisor")) aut = Autoridad.HIGH;
         else if (Objects.equals(rol, "Gerente")) aut = Autoridad.MID;

         empleados.add (
                 new Empleado (
                         new_id,
                         new_userCode,
                         nombre,
                         apellido,
                         NSS,
                         aut,
                         0,
                         1,
                         rol
                 )
         );

      }
      catch (Exception e) { System.out.println("Error al agregar empleado: " + e.getMessage()); }
   }

   public void EliminarEmpleado(int id) {
      try { if (!empleados.removeIf(a -> a.getId() == id)) System.out.println("No existe el empleado.\n"); }
      catch (Exception e) { System.out.println("Error al eliminar empleado: " + e.getMessage()); }
   }

   public Empleado getEmpleado(int id) {
      try{
         return empleados
                 .stream()
                 .filter(empleado -> empleado.getId() == id)
                 .findFirst()
                 .orElse(null);
      }
      catch (Exception e) { System.out.println("Error al buscar empleado : " + e.getMessage()); }
      return null;
   }

   public void GenerarInformeDeVentas() {
      /*
         Cómo vamos a manejar el informe de ventas ????
       */
   }

   public void ActualizarInventario() {
      /*
         Hace falta un conjunto de datos que guarde el inventario
         del restaurante.
       */
   }

   public void ModificarMenu() {
      /*
         Llama a una función que modifica la vista de menu y
         el inventario disponible para preparar las comidas
         y bebidas ????
       */
   }

}

class Test {
   /*
      Programar un conjunto de test que prueben todos los métodos
      de la clase restaurante para comprobar su correcto
      funcionamiento.
    */
   public static void main(String[] args) {
      // Prueba de Linked List como Queue
      Restaurante restaurante = new Restaurante();
      Queue<Comanda> C =  restaurante.Cocina;

      C.add(new Comanda("Comida 1"));
      C.add(new Comanda("Comida 2"));

      System.out.println(C.peek());
      C.remove();
      System.out.println(C.peek());

      /*
      Parece que hay múltiples implementaciones de linked list
      y con eso se suple Queue y Stack. Funciona bien.
      */
   }
}
