public class Drawing_Shapes {
    public static void main(String[] args){

        Drawing_Shapes r = new Drawing_Shapes();
        r.drawFilledRectangle(7,10);
        System.out.println("\n");
        r.drawVoidRectangle(7,10);
        System.out.println("\n");
        r.drawFilledTriangle(20);
    }
    public void drawFilledRectangle(int row,int column){

        for (int i = 0; i < row ;i++){
            for (int j = 0;j < column; j++ ){
                System.out.print("*");
                if (j == column - 1){
                    System.out.println();
                }
            }
        }
    }
    public void drawVoidRectangle(int row,int column){

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if (i == 0 || i == row-1){
                    System.out.print("*");
                }
                else {
                    if (j == 0){
                        System.out.print("*");
                    }
                    else if (j == column-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                if (j == column-1){
                    System.out.println();
                }
            }
        }
    }
    public void drawFilledTriangle(int row){

        for (int i=1; i<row; i++) {
            for(int j=i; j<row;j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {

                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}