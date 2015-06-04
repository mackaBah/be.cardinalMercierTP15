/**
 * 
 */
package be.cardinalmercier.tp15_Exo3;

/**
 * @author Macka
 *
 */
import javax.swing.*;

import java.awt.event.*;
public class FenetreClic extends JFrame implements MouseListener {
	
	public FenetreClic(){
		setTitle("Gestion de Clic");
		setBounds(10,20,300,150);
		addMouseListener(this);
		
	}
	public void mouseClicked(MouseEvent ev){
		int x = ev.getX();
		int y = ev.getY();
		System.out.println("On a cliqué en ( x = " 
		+ x + " y = " + y +")");
	}
	@Override
	public void mouseEntered(MouseEvent ev) {
		int x = ev.getX();
		int y = ev.getY();
		System.out.println("La souri est revenue dans la JPannel en ( x = " 
		+ x + " y = " + y +")");
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent ev) {
		int x = ev.getX();
		int y = ev.getY();
		System.out.println("La souris à quitée la JPannel en( x = " 
		+ x + " y = " + y +")");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		FenetreClic fen = new FenetreClic();
		Fen2Boutons fen1 = new Fen2Boutons() ;
		fen1.setVisible(true) ;
		fen.setVisible(true);
	}
}