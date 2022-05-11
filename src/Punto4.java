import javax.swing.JOptionPane;

public class Punto4 {

    String capital, pais;

    public void pedirDatos () {

        pais = JOptionPane.showInputDialog("¿Cuál es el país que te gusta?");
        capital = JOptionPane.showInputDialog("¿Cuál es la capital de ese país?");
    }

    public void mostrarMensaje () {
        JOptionPane.showMessageDialog(null, "La ciudad " + capital + " es la capital del país " + pais + ".");
    }
    
}
