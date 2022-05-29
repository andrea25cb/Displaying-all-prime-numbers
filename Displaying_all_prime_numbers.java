package trabajos_programacion_def;

import java.util.Scanner;

public class Displaying_all_prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i= count
		//j= divisor
		//number= número primo (dividendo)
		
		System.out.println("Los números primos son: ");
		
	int count=0;
	int divisor;
	int number=1;
	
	while(count<50) {
		boolean primo = true;
		for (divisor=2; divisor<number;divisor++) {
			if(number%divisor==0) //(si el resto es 0)
				primo = false;
	}
	
	if(primo) {
		++count;
		System.out.println(number);
		}
    ++number;
        }
	}}

