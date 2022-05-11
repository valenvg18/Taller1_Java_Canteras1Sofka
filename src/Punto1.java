import javax.swing.JOptionPane;

public class Punto1 {
    
    String nombre, apellido;

    public void pedirDatos () {

        nombre = JOptionPane.showInputDialog("Por favor digita tu nombre");
        apellido = JOptionPane.showInputDialog("Por favor digita tus apellidos");
    }

    
}
