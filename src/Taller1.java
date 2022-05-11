import javax.swing.JOptionPane;

public class Taller1 {
    public static void main(String[] args) throws Exception {

        
        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál punto del taller 1 desea ver?"));
         

        switch (opcion) {
            case 1:
                Punto1 punto1 = new Punto1();
                punto1.pedirDatos();
                mostrarCorrecto(); 
                
                break;

            case 2:
                Punto2 punto2 = new Punto2();
                punto2.pedirDatos();
                mostrarCorrecto(); 

                break;

            case 3:
                Punto3 punto3 = new Punto3();
                punto3.pedirDatos();
                punto3.mostrarMensaje();

                break;

            case 4:
                Punto4 punto4 = new Punto4();
                punto4.pedirDatos();
                punto4.mostrarMensaje();

                break;

            case 5:
                Punto5 punto5 = new Punto5();
                punto5.pedirDatos();
                punto5.mostrarMensaje();

                break;
        
            default:
            JOptionPane.showMessageDialog(null, "Esa opción no hace parte del menú"); 
                break;
        }
    }

    public static void mostrarCorrecto () {
        JOptionPane.showMessageDialog(null, "¡Gracias! Ingresó correctamente los datos"); 
    }
}
