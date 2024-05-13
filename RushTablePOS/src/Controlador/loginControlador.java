
package Controlador;

import Vista.gerenteForm;
import Vista.meseroForm;
import Vista.prodForm;
import Vista.superForm;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Supervisor;

public class loginControlador {
    Empleado local;
    int contador;
    boolean bandera = false;
    
    
    public void permitido(int id, int usercode, JFrame login){
        for (contador = 0; contador < main.restaurante.empleados.size(); contador++) {
            if(id==main.restaurante.empleados.get(contador).getId()){
                for (int j = 0; j < main.restaurante.empleados.size(); j++) {
                    if(usercode==main.restaurante.empleados.get(j).getUserCode()){
                        local = main.restaurante.empleados.get(j);
                        bandera = true;
                        
                        if(local.getRol()=="Supervisor"){
                            new superForm().setVisible(true);
                            login.dispose();
                        }else if(local.getRol()=="Gerente"){
                            new gerenteForm().setVisible(true);
                            login.dispose();
                        }else if(local.getRol()=="Mesero"){
                            new meseroForm().setVisible(true);
                            login.dispose();
                        }else if(local.getRol()=="Cocinero"){
                            new prodForm().setVisible(true);
                            login.dispose();
                        }else if(local.getRol()=="Bartender"){
                            new prodForm().setVisible(true);
                            login.dispose();
                        }else {
                            JOptionPane.showMessageDialog(null, "Usuario sin rol", "Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        
                    } 
                }
            }
        }
        if(contador==main.restaurante.empleados.size() && bandera==false){
            JOptionPane.showMessageDialog(null, "Las credenciales no estan registradas", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
