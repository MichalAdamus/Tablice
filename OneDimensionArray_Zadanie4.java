class OneDimensionArray_Zadanie4{
    public static void main(String args[]){
        // deklaracja i alokacja
        char[]StudentGrades = new char [5];
        
		StudentGrades[0] = '5';
		StudentGrades[1] = '6';
		StudentGrades[2] = '1';
		StudentGrades[3] = '2';
		StudentGrades[4] = '3';
			
		char tmp = StudentGrades[1];
		StudentGrades[1] = StudentGrades[4];
		StudentGrades[4] = tmp;	
		
        // wyświetlenie 3 ostatnich ocen
        
        System.out.println("-------------------------");

        System.out.print("Oceny z Informatyki: ");
        System.out.print(StudentGrades[0]);
		System.out.print(StudentGrades[1]);
		System.out.print(StudentGrades[2]);
		System.out.print(StudentGrades[3]);
        System.out.print(StudentGrades[4]);
        System.out.println();
        System.out.println("-------------------------");
		
		
		
    }
}