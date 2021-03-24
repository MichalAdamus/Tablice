class OneDimensionArray{
    public static void main(String args[]){
        // deklaracja i alokacja
        char[] Student = new char[6];
        char[] Grades = new char[10];

        // inicjalizacja
        Student[0] = '2';
        Student[1] = '0';
        Student[2] = '2';
        Student[3] = '1';
        Student[4] = '0';
        Student[5] = '1';

        Grades[0] = '3';
        Grades[1] = '.';
        Grades[2] = '5';

        Grades[3] = '5';
        Grades[4] = '1';
        Grades[5] = '2';
        Grades[6] = '6';
		
        Grades[7] = '4';
        Grades[8] = '.';
        Grades[9] = '5';


        System.out.println("-------------------------");

        System.out.print("Student: ");
        System.out.print(Student[0]);
        System.out.print(Student[1]);
        System.out.print(Student[2]);
        System.out.print(Student[3]);
        System.out.print(Student[4]);
        System.out.print(Student[5]);
        System.out.println();
        System.out.print("Oceny z Informatyki: ");
        System.out.print(Grades[0]);
        System.out.print(Grades[1]);
        System.out.print(Grades[2]);
        System.out.print(",");
        System.out.print(Grades[3]);
        System.out.print(",");
        System.out.print(Grades[4]);
        System.out.print(",");
        System.out.print(Grades[5]);
        System.out.print(",");
        System.out.print(Grades[6]);
        System.out.print(",");
        System.out.print(Grades[7]);
        System.out.print(Grades[8]);
        System.out.print(Grades[9]);
        System.out.println();
        System.out.println("-------------------------");
    }
}