import java.applet.Applet;
import java.util.Scanner;
import java.awt.Graphics;

public class rectangle extends Applet{
	
		
	public void paint (Graphics g){
		Scanner input = new Scanner(System.in);
					
			System.out.println("Enter width");
							
		       int width = input.nextInt();
									
			System.out.println("Enter length");
											
			int length = input.nextInt();
													
		        g.drawRect(0,0,width,length);
																	

																		}

																		}
