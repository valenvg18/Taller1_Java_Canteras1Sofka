import javax.swing.JOptionPane;

public class Punto5 {

    String nombrePet, tipo, nombre;
    int edad;

    public void pedirDatos () {

        nombrePet = JOptionPane.showInputDialog("¿Cuál es el nombre de tu mascota?");
        edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la edad de tu mascota?"));
        tipo = JOptionPane.showInputDialog("¿Que raza es tu mascota?");
        nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre completo?");
    }

    public void mostrarMensaje () {

        JOptionPane.showMessageDialog(null, nombrePet + " es un(a) " + tipo + ", el cual, tiene " + edad + " año(s) de edad y " + nombre + " es actualmente su dueño(a)");
    }
    
}
