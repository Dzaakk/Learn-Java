public class AplikasiTodolist {
    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodolist();
    }

    public static void showTodolist(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i ++ ){
            var todo = model[i];
            var no = i+1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodolist(){
        model[0] = "Membaca buku 5 halaman";
        model[1] = "Belajar Java";
        showTodolist();
    }

    public static void addTodolist(String todo){
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null){
                isFull = false;
                break;
            }
        }

        if (isFull) {
            var temp = model;
            model = new String[model.length + 10];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodolist(){
        for (int i = 1; i <= 25; i++) {
            addTodolist("Contoh Todo ke-"+i);
        }

        showTodolist();

    }

    public static boolean removeTodolist(Integer number){
            if ((number-1) >= model.length){
                return false;
            } else if (model[number-1] == null){
                return false;
            } else {
                for (int i = (number-1); i < model.length ; i++) {
                    if (i == (model.length-1)) {
                        model[i] = null;
                    } else {
                        model[i] = model[i + 1];
                    }
                }
                return true;
            }
    }

    public static void testRemoveTodolist(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");

        var result = removeTodolist(20);
        System.out.println(result);

        result = removeTodolist(8);
        System.out.println(result);

        result = removeTodolist(3);
        System.out.println(result);

        showTodolist();
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hello " + name);
    }

    public static void viewShowTodolist(){
        while (true){
            showTodolist();

            System.out.println("==MENU==");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih : ");

            if (input.equals("1")){
                viewAddTodolist();
            } else if (input.equals("2")) {
                viewRemoveTodolist();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void testViewTodolist(){
        addTodolist("satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");

        viewShowTodolist();
    }
    public static void viewAddTodolist(){
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo (x Jika Batal)");

        if (todo.equals("x")){
            // batal
        } else {
            addTodolist(todo);
        }
    }
    public static void testViewAddTodolist() {
        addTodolist("satu");
        addTodolist("dua");

        viewAddTodolist();

        showTodolist();
    }
    public static void viewRemoveTodolist(){
        System.out.println("MENGHAPUS TODOLIST");

        var number = input("Nomor yang Dihapus (x Jika Batal)");

        if (number.equals("X")){
            // batal
        } else {
            boolean success = removeTodolist(Integer.valueOf(number));
            if (!success){
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }

    public static void testViewRemoveTodolist(){
        addTodolist("satu");
        addTodolist("dua");
        addTodolist("tiga");
        addTodolist("empat");

        showTodolist();

        viewRemoveTodolist();

        showTodolist();
    }

}
