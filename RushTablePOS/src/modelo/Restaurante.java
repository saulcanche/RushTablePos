
package modelo;

import Controlador.main;
import java.util.*;
import javax.swing.plaf.synth.SynthGraphicsUtils;

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
   private static int userCodeCounter = 1000;

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
      Este constructor servirá para cuando ya existan datos previos de un restaurante
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
           
   public ItemMenu getItemMenu(String mesa){
       ArrayList<Mesero> listaMeseros = new ArrayList<Mesero>();
       for(int i = 0; i<empleados.size(); i++){
           if(empleados.get(i).getRol()=="Mesero"){
               listaMeseros.add((Mesero)empleados.get(i));
           }
       }
       for(int i = 0; i<listaMeseros.size() ;i++){
           for(int j = 0; j<listaMeseros.get(i).getItemsVendidos().size(); j++){
               if(listaMeseros.get(i).getItemsVendidos().get(j).getId()==mesa){
                   return listaMeseros.get(i).getItemsVendidos().get(j);
               }
           }
       }
       return null;
   }

   public ArrayList<Cuenta> getCuentasAbiertas() { return cuentasAbiertas; }
   public Queue<Comanda> getCocina() { return Cocina; }
   public Queue<Comanda> getBarra() { return Barra; }
   public ArrayList<Cuenta> getCuentasHoy() { return cuentasHoy; }
   public ArrayList<Descuento> getDescuentos() { return descuentos; }
   public ArrayList<Empleado> getEmpleados() { return empleados; }


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
   
   public void agregarCuenta(Cuenta cuenta){
       this.cuentasAbiertas.add(cuenta);
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

         Random random_generator = new Random();
         int new_id = random_generator.nextInt(2999999);
         int new_userCode = userCodeCounter++;
         Autoridad aut = Autoridad.LOW;

         if (Objects.equals(rol, "Supervisor")) aut = Autoridad.HIGH;
         else if (Objects.equals(rol, "Gerente")) aut = Autoridad.MID;

          switch (rol) {
              case "Supervisor":
                  empleados.add(new Supervisor(new_id, new_userCode, nombre, apellido, NSS,aut,0,1));
                  break;
              case "Gerente":
                  empleados.add(new Gerente(0, 0, this, new_id, new_userCode, nombre, apellido, NSS, aut, 0, 1));
                  break;
              case "Cocinero":
                  empleados.add(new Cocinero(100,new_id,new_userCode,nombre,apellido,NSS,aut,0,1)); 
                  break;
              case "Bartender":
                  empleados.add(new Bartender(100,new_id,new_userCode,nombre,apellido,NSS,aut,0,1));
                  break;
              case "Mesero":
                  empleados.add(new Mesero(100,new_id,new_userCode,nombre,apellido,NSS,aut,0,1));
                  break;
              default:
                  throw new AssertionError();
          }

         System.out.println("Your new employee has the id : " + new_id + " and its user code is : " + new_userCode);

      }
      catch (Exception e) { System.out.println("Error al agregar empleado: " + e.getMessage()); }
   }
   
   public void AgregarEmpleado(String nombre, String apellido, String NSS, String rol, int idLocal) {
      try {
         
         int new_userCode = userCodeCounter++;
         Autoridad aut = Autoridad.LOW;

         if (Objects.equals(rol, "Supervisor")) aut = Autoridad.HIGH;
         else if (Objects.equals(rol, "Gerente")) aut = Autoridad.MID;

          switch (rol) {
              case "Supervisor":
                  empleados.add(new Supervisor(idLocal, new_userCode, nombre, apellido, NSS,aut,0,1));
                  break;
              case "Gerente":
                  empleados.add(new Gerente(0, 0, this, idLocal, new_userCode, nombre, apellido, NSS, aut, 0, 1));
                  break;
              case "Cocinero":
                  empleados.add(new Cocinero(100,idLocal,new_userCode,nombre,apellido,NSS,aut,0,1)); 
                  break;
              case "Bartender":
                  empleados.add(new Bartender(100,idLocal,new_userCode,nombre,apellido,NSS,aut,0,1));
                  break;
              case "Mesero":
                  empleados.add(new Mesero(100,idLocal,new_userCode,nombre,apellido,NSS,aut,0,1));
                  break;
              default:
                  throw new AssertionError();
          }

         System.out.println("Your new employee has the id : " + idLocal + " and its user code is : " + new_userCode);

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

   public Empleado getEmpleado(String nombre, String apellido) {
      try {
         return empleados
                 .stream()
                 .filter(
                         empleado ->
                         Objects.equals(empleado.getNombre(), nombre) && Objects.equals(empleado.getApellido(), apellido)
                 )
                 .findFirst()
                 .orElse(null);
      }
      catch (Exception e) {
         System.out.println("Error while searching employee by name.");
         return null;
      }
   }
   
   public ArrayList<Mesero> getMeseros(){
       ArrayList<Mesero> lista = new ArrayList<Mesero>();
       for(int i = 0; i < main.restaurante.getEmpleados().size(); i++){
           if(main.restaurante.getEmpleados().get(i).getRol()=="Mesero"){
               lista.add((Mesero) main.restaurante.getEmpleados().get(i));
           }
       }
       return lista;
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
      
      Empleado empleado = new Empleado (
         100,
         0,
         null,
         null,
         null,
         null,
         0,
         0,
         null
      );

      // Prueba de Linked List como Queue
      Restaurante restaurante = new Restaurante();
      Queue<Comanda> C =  restaurante.getCocina();

      // C.add(new Comanda("Comida 1"));
      // C.add(new Comanda("Comida 2"));

      restaurante.AgregarEmpleado( // Agregar Empleado
              "Angel",
              "Castillo",
              "NASDAS12349",
              "Cocinero"
      );

      System.out.println(restaurante.getEmpleado("Angel", "Castillo")); // Busqueda por Nombre y Apellido

      /*
      Parece que hay múltiples implementaciones de linked list
      y con eso se suple Queue y Stack. Funciona bien.
      */
   }
}
