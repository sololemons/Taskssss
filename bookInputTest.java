import java.util.Scanner;



public class bookInputTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Book book=new Book();






        System.out.println("Enter The title");
        String Title= scanner.nextLine();
        System.out.println("Enter The Authors Name");
        String Author=scanner.nextLine();
        System.out.println("Enter The No Of Pages");
        int Pages= scanner.nextInt();


        book.Title=Title;
        book.Author=Author;
        book.numberOfPages=Pages;


        System.out.println("The Authors Of this Book Is"+Author);
        System.out.println("The Title of this Book is "+Title);
        System.out.println("The Number of Pages In this Book Is"+Pages);


    }
}
