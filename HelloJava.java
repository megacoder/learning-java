import java.awt.*;
import javax.swing.*;

class HelloComponent extends JComponent	{
	public void paintComponent( Graphics g )	{
		g.drawString( "Eat moore moose", 25, 75 );
	}
}

public class HelloJava {
	public static void main( String[] args ) {
		// System.out.println( "Hello, World!" );
		JFrame frame = new JFrame( "Hello, Java!" );
		HelloComponent hello = new HelloComponent();
		frame.getContentPane().add( hello );
		frame.setSize( 200, 150 );
		frame.setVisible( true );
	}
}
