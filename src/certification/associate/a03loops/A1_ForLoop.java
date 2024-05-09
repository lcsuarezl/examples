package certification.associate.a03loops;

public class A1_ForLoop {


    public static void main(String args[]){


        System.out.println("Nested For loop with break mark");
        int[][] array = {{1,2,3}, {4,0,6}, {7,8,9}};

        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[row].length; col++){
                if(array[row][col]==0){
                    break;
                }
                System.out.println(array[row][col]);
            }
        }

        System.out.println("For loop with break and end mark");
        end:
        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[row].length; col++){
                if(array[row][col]==0){
                    break end;
                }
                System.out.println(array[row][col]);
            }
        }

        System.out.println("For loop with continue and end mark");
        end:
        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[row].length; col++){
                if(array[row][col]==0){
                    continue end;
                }
                System.out.println(array[row][col]);
            }
        }
    }
}
