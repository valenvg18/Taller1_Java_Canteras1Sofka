import javax.swing.JOptionPane;

public class Punto3 {

    String nombre, apellidos, nombreMama, nombrePapa;


    public void pedirDatos () {

        nombre = JOptionPane.showInputDialog("Por favor digita tu nombre");
        apellidos = JOptionPane.showInputDialog("Por favor digita tus apellidos");
        nombreMama = JOptionPane.showInputDialog("Por favor digita nombre y apellidos de tu madre");
        nombrePapa = JOptionPane.showInputDialog("Por favor digita nombre y apellidos de tu padre:");
    }

    public void mostrarMensaje () {

        JOptionPane.showMessageDialog(null, "Yo " + nombre + " " + apellidos + " soy hija de " + nombreMama + " y " + nombrePapa + ".");
    }
    
}
