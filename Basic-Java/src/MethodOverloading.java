public class MethodOverloading {
    /*method overloading
        - kemampuna membuat method dengan nama yang sama lebih dari sekali
        - data parameter di method tersebut harus
          berbeda-beda, enta jumlah atau tipe data parameternya
    */
    public static void main(String[] args) {
        sayHello();
        sayHello("mikasa");
        sayHello("mikasa", "eren");
    }

    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    static void sayHello(String name1, String name2 ){
        System.out.println("Hello " + name1 + " and " + name2);
    }
}
