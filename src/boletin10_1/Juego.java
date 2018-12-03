package boletin10_1;

import javax.swing.JOptionPane;

public class Juego {

    private int num;
    private int intentos;
    private int respuesta;
    
    public int setNum(){
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 y 50"));
            if(num <= 0 | num > 50)
                JOptionPane.showMessageDialog(null,"El numero introducido es incorrecto, intentalo de nuevo");
        }while(num <=0 | num > 50);    
        return num;    
    }
    
    public int setIntentos(){
        do{
            intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de intentos que el jugador 2 tendrá para acertar el numero: "));
            if(intentos <= 0 | intentos >= 50)
                JOptionPane.showMessageDialog(null, "No puedes dar 0 intentos o 50 o más intentos. Intentalo de nuevo");
        }while(intentos <= 0 | intentos >= 50);
        return intentos;
    }
    
    public int setRespuesta(){
        do{
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 y 50"));
            if(respuesta <= 0 | respuesta > 50)
                JOptionPane.showMessageDialog(null,"El numero introducido es incorrecto, intentalo de nuevo");
        }while(respuesta <=0 | respuesta > 50);    
        return respuesta;    
    }
       
    public void jugar(){
        for(int i = 1; i <= intentos; i++){
            respuesta = setRespuesta();
            if(respuesta < num)
                JOptionPane.showMessageDialog(null, "El numero tecleado es menor al numero a adivinar. \nTe quedan " +(intentos - i)+ " intentos");
            else if(respuesta > num)
                JOptionPane.showMessageDialog(null, "El numero tecleado es mayor al numero a adivinar. \nTe quedan " +(intentos - i)+ " intentos");
            else{
                JOptionPane.showMessageDialog(null, "Enhorabuena!!! \nHas adivinado el numero. Respuesta: " + num);
                i = intentos;    
            }
        }
        }
}
