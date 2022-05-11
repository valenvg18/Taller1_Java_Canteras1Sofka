import javax.swing.JOptionPane;

public class Punto2 {

    String nombre, apellidos;
    int edad;
    double estatura;

    public void pedirDatos () {

        nombre = JOptionPane.showInputDialog("Por favor digita tu nombre");
        apellidos = JOptionPane.showInputDialog("Por favor digita tus apellidos");
        edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es tu edad?"));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto mides de estatura? (Escribir el número en metros, sepáralo con un punto)"));
    }
    
}
