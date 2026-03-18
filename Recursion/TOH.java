package Recursion;

public class TOH {
    public static void main(String args[]){
        int n=3;        //For the number of disk;
        // char source= 'A';      place where the disk are located;
        // char destination= 'C';      place where the disk should go;
        // char auxiliary= 'B';        helper to travel the disk;

        System.out.println("The move for "+n+" disk are= ");
        solveTOH(n,'A','C','B');
    }

    private static void solveTOH(int n, char source, char destination, char auxiliary) {
        if(n==1){
            System.out.println("Move disk 1 from "+source+" to "+destination);
            return;
        }

        solveTOH(n-1, source, auxiliary, destination);
        System.out.println("Move disk "+n+" from "+source+" to "+destination);

        solveTOH(n-1, auxiliary, destination, source);
    }
}
