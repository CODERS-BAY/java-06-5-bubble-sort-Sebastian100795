public class main {
    public static void main(String[] args){
        
        int[] sortieren= {55, 26, 78, 46, 3, 15};
        int temp;


        for (int i = 1; i < sortieren.length ; i++) {
            for (int j = 0; j < sortieren.length - i ; j++) {
                if (sortieren[j]>sortieren[j+1]){
                        temp=sortieren[j];
                        sortieren[j]=sortieren[j+1];
                        sortieren[j+1]=temp;
                }
            }
        }
        System.out.println(sortieren[0]);
        System.out.println(sortieren[1]);
        System.out.println(sortieren[2]);
        System.out.println(sortieren[3]);
        System.out.println(sortieren[4]);
        System.out.println(sortieren[5]);
    }
}
