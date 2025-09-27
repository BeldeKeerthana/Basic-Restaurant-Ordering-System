import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("welcome to CMR Restaurant\nHI ,Plz enter your name:");
		String name=sc.nextLine();
		System.out.println("hey "+name+",What do you like to have?");
		System.out.println("1.Dal fry--40\n2.Paneer butter masala--100\n3.Chicken curry--120\n4.fish fry--100\n5.tomato currry--30\nSelect from the menu:");
		int op=sc.nextInt();
		System.out.println("plz enter quatity:");
		int q=sc.nextInt();
		int total=0;
		switch(op){
		    case 1 :{
		        total=40*q;
		        System.out.println("You selected Dal fry:"+(40*q));
		        break;
		
		    }
		    case 2:{
		         total=100*q;
		        System.out.println("You selected Paneer butter masala:"+(100*q));
		        break;
		    }
		case 3:{
		     total=120*q;
		    System.out.println("You selected Chicken curry:"+(120*q));
		    break;
		}
		case 4:{
		     total=100*q;
	         System.out.println("You selected fish fry:"+(100*q));
		    break;
		}
	     case 5:{
	          total=30*q;
	         System.out.println("You selected tomato curry:"+(30*q));
		    break;
	     }
		  default:System.out.println("Invalid option!");
		}
		int mon=sc.nextInt();
		if(total==mon){
		    System.out.println("order placed kindly wait");
		}
		else{
		     System.out.println("Invalid amount paid!!");
		}
	}
}
