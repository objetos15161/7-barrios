import greenfoot.*;
import javax.swing.JOptionPane;
/**
 * Escribe una descrición de la clase Letrero2 aquí.
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany)
 * @versión (Un número de versión o una fecha)
 */
public class Letrero2 extends Nivel
{
    /**
     * Act - hace lo que Letrero2 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        setImage("Exterior/Letrero2.png");
         if(isTouching(Male.class) && Greenfoot.isKeyDown("enter") )//Pregunta Montecillo
        {
            String inputValue = JOptionPane.showInputDialog("La actual iglesia, originalmente en forma de cruz latina y la fachada hacia el poniente, se empezo en ___ y se concluyo en __\n a) 1810 y 1827   b) 1730 y 1747   c) 1780 y 1790");   
            if(inputValue.equals("b")|| inputValue.equals("B"))
            {
                String input = JOptionPane.showInputDialog("¡Correcto!\n Presiona aceptar para continuar");
            }
            else
            {
                 String input = JOptionPane.showInputDialog("Incorrecto intenta de nuevo\n Presiona aceptar para continuar");
            }
        }  
    }    
}
