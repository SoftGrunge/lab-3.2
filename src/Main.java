public class Main {

    public static void main(String[] args) {
    List list = new List();
    int [] array = {3,4,5,6,2,1,0,23,565};
    int [] array2={99,98,97};


    list.addArrayFirst(array);
    list.addArrayLast(array2);
    list.addFirst(333);
    list.addLast(999);

    list.printAllE();

       list.printAll();
    }
}
