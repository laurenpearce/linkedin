import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Scanner;


public class Linkedin{

	private String name;

    public Linkedin(){
    	this.name=name;
    }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("What is your name? ");
       String name= sc.nextLine();
       System.out.print("Hi " + name + "! My name is Lauren Pearce, I'm a Mathematics major and \n Computer Science minor at the University of Arkansas, and I'm looking for job \n opportunities in Texas. I designed this GitHub page to introduce myself and \n display my skills in Java. I'm also well-versed in C++, Javascript, HTML, \n LaTex, and Python. I'm a quick learner, responsible, and extremely loyal. I'm a very hard worker and I'm looking for an employer that will help me get my foot in the door of the STEM industry. \n");
         JFrame frame = new JFrame();
		  ImageIcon icon = new ImageIcon("linkedin.jpg");
		  JLabel label = new JLabel(icon);
		  frame.add(label);
		  frame.setDefaultCloseOperation
		         (JFrame.EXIT_ON_CLOSE);
		  frame.pack();
		  frame.setVisible(true);
    }
}

