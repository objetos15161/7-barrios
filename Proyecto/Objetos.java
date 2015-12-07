import greenfoot.*;

/**
 * Escribe una descrición de la clase Objetos aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Objetos extends Escenario
{
    //Metodo que verifica segun la variable que imagen se selecciona para el objeto
    public void creaObjetos(int num){
        if(num==1)
        {
          setImage("Exterior/40I.png");//Num40I
        }
        if(num==2)
        {
          setImage("Exterior/40D.png");//Num40D
        }
        if(num==3)
        {
           setImage("Exterior/Carro.png");//Carro
        }
        if(num==4)
        {
           setImage("Exterior/40Ab.png");//Num40Ab
        }
        if(num==5)
        {
           setImage("Exterior/50I.png");//Num50I
        }
        if(num==6)
        {
           setImage("Exterior/40Ar.png");//Num40Ar
        }
        if(num==7)
        {
           setImage("Exterior/50D.png");//Num50D
        }
        if(num==8)
        {
           setImage("Exterior/50Ab.png");//Num50Ab
        }
        if(num==9)
        {
           setImage("Exterior/50Ar.png");//Num50Ar
        }
        if(num==10)
        {
            setImage("Enter.png");
        }
        if(num==11)
        {
            setImage("Flechas.png");
        }
    }
}
