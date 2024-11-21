public class p {
    static int a = 5;

public static void main(String[] args) {
    int b = 10;

    display(b);

    System.out.println("Nilai a di fungsi main:" + a);
    System.out.println("Nilai di fungsi main:" + b );
}
private static void display(int b) {
    a = a+1;
    b= b+1;
    
    System.out.println("Nilai a di fungsi display:" + a);
    System.out.println("Nilai b di fungsi display:" + b);
}
}
