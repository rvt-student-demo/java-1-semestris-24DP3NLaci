package rvt;

public class Chapter60 {
    public static void main(String[] args) {
       uzd1(); 
       System.out.println();

       uzd2();
       System.out.println();

       uzd3();
       System.out.println();

       uzd4();
       System.out.println();
    
       uzd5();
    }

    public static void uzd1() {
        int[] val = {0, 1, 2, 3}; 

        int sum = 0;
        for (int i = 0; i < val.length;i++) {
            sum += val[i];
        }
 


        System.out.println( "Summa = " + sum );
    }

    public static void uzd2() {
        int[] val = {13, -4, 82, 17};

        int[] twice;

    
        System.out.println( "Masivs: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
        twice = new int[val.length];
        for (int i = 0; i < val.length;i++) {
            twice[i] = 2 * val[i];

        }


        System.out.println( "Jauns masivs: "  + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
    }

    public static void uzd3() {
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  0,   0,   0,   0};
    
        for (int i = 0; i < valA.length;i++) {
            sum[i] = valA[i] + valB[i];
        }
 
        System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }

    public static void uzd4() {
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {  0,   0,   0,   0};

        for(int i = 0; i < valA.length;i++){
            valB[i] = 25 - valA[i];
        }
 
    System.out.println( "valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );

 
    System.out.println( "valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );


    System.out.println( "sum:  "  + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );


    }

    public static void uzd5() {
        int[] val = {0, 1, 2, 3}; 

        int temp;
 


    System.out.println( "Masivs: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );


        temp = val[0];

        val[0] = val[3];

        val[3] = temp;

        temp = val[1];

        val[1] = val[2];

        val[2] = temp;
        
        
    System.out.println( "Masivs otradāk: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    }
}