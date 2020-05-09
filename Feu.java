package simutation_feux;

import java.awt.*;

public class Feu extends Thread {
       private int num;
       private Color clr;
       int x,y,duree;
       public Feu(int num, Color clr, int duree, int x, int y) {
             this.num = num;
             this.clr = clr;
             this.x = x;
             this.y = y;
       }
       public int getNum() {
             return num;
       }
       public void setId(int num) {
             this.num = num;
       }
       public Color getClr() {  
    			 return clr;
       }
       public void setClr(Color clr) {
            this.clr = clr;
       } 
    public int getX() {
             return x;
       }
       public void setX(int x) {
             this.x = x;
       }
       public int getY() {
             return y;
       }
       public void setY(int y) {
             this.y = y;
       }
 /*    public void run()
       {
             while(true)
             {
             try {
                    sleep(duree);
             } catch (InterruptedException e) {
                    e.printStackTrace();
             }
             if(clr==Color.gray)
                    clr=Color.green;
             else
                    clr=Color.gray;
             try {
                    sleep(duree);
             } catch (InterruptedException e) {
                    e.printStackTrace();
             }
             if(clr==Color.gray)
                    clr=Color.green;
             else
                    clr=Color.green;
           }  }*/
      public void time() {
   		try {
   			Thread.sleep(1000);	
   		}
   		catch(Exception e) {	
   		}
        }
   /*    Color go = Color.gray;
   	Color slow = Color.gray;
   	Color stop = Color.gray;
   	String activelight = "red";
   	public void changeColor() {
		go = Color.gray;
		slow = Color.gray;
		stop = Color.gray;
		if (activelight.contentEquals("red")){
			activelight = "green";
			slow = Color.red;
		}else if (activelight.contentEquals("green")) {
			activelight = "yellow";
			go = Color.green;	
		}else {
			activelight = "red";
			stop = Color.red;
		}
		repaint();
   	}*/
	private void repaint() {
		// TODO Auto-generated method stub
		
	}	
}