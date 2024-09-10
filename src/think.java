public class think {


    /*public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

            }
        }
    }*/


   /* public class PrintDouble {
        Double aDouble;

        PrintDouble(Double aDouble) {
            this.aDouble = aDouble;
        }

        public void printWithSemicolon() {
            System.out.println("aDouble = " + aDouble);
        }
    }

    public class Print<T> {
        T things;

        Print(T things) {
            this.things = things;
        }

        public void printWithSemicolon() {
            System.out.println("things = " + things);
        }
    }

    public void main(String[] args) {
        Print<Integer> printer = new Print<>(15);
    }*/


   /* Integer[] integers = {1, 2, 3, 4, 5, 6, 7};
    Double[] doubles = {6.3, 2.3, 6.8, 1.0};
    String [] strings = {"John", "Alex", "Max", "Taylor"};
    Character[] characters = {'H', 'E', 'L', 'F', 'O'};*/



    public static String[] split(String s, String regex){
        String text = "ab#12#453";
        String[] arr = text.split(" ");

        for (String word : arr){
            System.out.println("word = " + word);
        }

    }

}
