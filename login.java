import java.util.Scanner;
public class scanning {
    public static void main(String[] args) {
        String user1, password1, user, password;

        //data loginnya
        user1 = "abc";
        password1 = "def";

        user2 = "kaswa";
        password1 = "kaswa";

        //scanner untuk meng-input data yang akan di-cek
        Scanner abc = new Scanner(System. in );

        //formulir
        System.out.println("masukkan Username: ");
        user = abc.nextLine();
        System.out.println("masukkan Password: ");
        password = abc.nextLine();

        //pilihan yang diberikan
        if (user1.equals(user) && password1.equals(password)) {
            System.out.println("login berhasil");
        } else {
            System.out.println("login gagal");
        }
    }
}