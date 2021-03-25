class OneDimensionArray_Zadanie4{
    public static void main(String args[]){
        // deklaracja i alokacja
        double[]studentGrades = {3.5, 3, 1, 2, 6, 4.5};
        
		studentGrades[1] = 5; 
				
		System.out.println("-------------------------");

        System.out.print("Oceny z Informatyki: ");
        System.out.print(studentGrades[0]);
		System.out.print(",");
		System.out.print(studentGrades[1]);
		System.out.print(",");
		System.out.print(studentGrades[2]);
		System.out.print(",");
		System.out.print(studentGrades[3]);
		System.out.print(",");
        System.out.print(studentGrades[4]);
        System.out.println();
        System.out.println("-------------------------");
		
		
		double tmp = studentGrades[0];
		studentGrades[0] = studentGrades[2];
		studentGrades[2] = tmp;	
		
		tmp = studentGrades[1];
		studentGrades[1] = studentGrades[3];
		studentGrades[3] = tmp;	
				
        // wyświetlenie 3 ostatnich ocen
        
        System.out.println("-------------------------");

        System.out.print("Oceny z Informatyki: ");
        System.out.print(studentGrades[0]);
		System.out.print(",");
		System.out.print(studentGrades[1]);
		System.out.print(",");
		System.out.print(studentGrades[2]);
		System.out.print(",");
		System.out.print(studentGrades[3]);
		System.out.print(",");
        System.out.print(studentGrades[4]);
        System.out.println();
        System.out.println("-------------------------");
		
		
		
    }
}