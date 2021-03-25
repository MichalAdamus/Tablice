class OneDimensionArray_Zadanie3{
    public static void main(String args[]){
        // deklaracja i alokacja
        char[] student = new char[6];
        double[] grades = {3.5, 5, 1, 2, 6, 4.5}; 

        // inicjalizacja
        student[0] = '2';
        student[1] = '0';
        student[2] = '2';
        student[3] = '1';
        student[4] = '0';
        student[5] = '1';

        System.out.println("-------------------------");

        System.out.print("student: ");
        System.out.print(student[0]);
        System.out.print(student[1]);
        System.out.print(student[2]);
        System.out.print(student[3]);
        System.out.print(student[4]);
        System.out.print(student[5]);
        System.out.println();
        System.out.print("Oceny z Informatyki: ");
        System.out.print(grades[0]);
		System.out.print(",");
        System.out.print(grades[1]);
		System.out.print(",");
        System.out.print(grades[2]);
        System.out.print(",");
        System.out.print(grades[3]);
        System.out.print(",");
        System.out.print(grades[4]);
        System.out.print(",");
        System.out.print(grades[5]);
        System.out.println();
        System.out.println("-------------------------");
    }
}