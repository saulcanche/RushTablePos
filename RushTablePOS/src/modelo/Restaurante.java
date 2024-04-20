
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
      this.Barra = Queue();
      this.Cocina = Queue();
   }


   private Queue<Comanda> Queue() {
      return new Queue<Comanda>() {
         @Override
         public boolean add(Comanda comanda) {
            return false;
         }

         @Override
         public boolean offer(Comanda comanda) {
            return false;
         }

         @Override
         public Comanda remove() {
            return null;
         }

         @Override
         public Comanda poll() {
            return null;
         }

         @Override
         public Comanda element() {
            return null;
         }

         @Override
         public Comanda peek() {
            return null;
         }

         @Override
         public int size() {
            return 0;
         }

         @Override
         public boolean isEmpty() {
            return false;
         }

         @Override
         public boolean contains(Object o) {
            return false;
         }

         @Override
         public Iterator<Comanda> iterator() {
            return null;
         }

         @Override
         public Object[] toArray() {
            return new Object[0];
         }

         @Override
         public <T> T[] toArray(T[] a) {
            return null;
         }

         @Override
         public boolean remove(Object o) {
            return false;
         }

         @Override
         public boolean containsAll(Collection<?> c) {
            return false;
         }

         @Override
         public boolean addAll(Collection<? extends Comanda> c) {
            return false;
         }

         @Override
         public boolean removeAll(Collection<?> c) {
            return false;
         }

         @Override
         public boolean retainAll(Collection<?> c) {
            return false;
         }

         @Override
         public void clear() {

         }
      };
   } // Falta implementar los métodos específicos de la cola para la clase Comanda

   public void AgregarEmpleado(String nombre, String apellido, String NSS, String rol) {
      try {
         // generar new id y new userCode
         int new_id = 0;
         int new_userCode = 0;
         Autoridad aut = Autoridad.LOW;

         if (Objects.equals(rol, "Supervisor") ) aut = Autoridad.HIGH;
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

}



class Test {
   Restaurante restaurante = new Restaurante();

   /*
   Programar un conjunto de test que prueben todos los métodos
   de la clase restaurante para comprobar su correcto
   funcionamiento.
    */



}
