package numeros;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, res=0;
		String sel=null;
		@SuppressWarnings("resource")
		Scanner tec=new Scanner(System.in);
		System.out.println("Seleccionamos la opcion\n");
		System.out.println("+: Suma"
				+"\n-: Resta"
				+"\n*: Multiplicacion"
				+"\n/: Division");
		sel=tec.next();
		switch(sel){
		case"+":
			System.out.println("ha seleccionado suma\nIngrese los valores");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo numero");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;
		case"-":
			System.out.println("ha seleccionado resta\nIngrese los valores");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo numero");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;
		case"*":
			System.out.println("ha seleccionado multiplicacion\nIngrese los valores");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo numero");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
		case"/":
			System.out.println("ha seleccionado division\nIngrese los valores");
			System.out.println("ingrese el primer numero");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo numero");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a+"/"+b+"="+res);
			break;
		default:
			System.out.println("esa opcion no esta permitida");
		}
		

	}

}
