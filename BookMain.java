import java.util.Scanner;

class Book{
    String title,author,edition;
    Book(){
        this.title=" ";
        this.author=" ";
        this.edition=" ";
    }
    Book(String a, String b, String c){
        this.title=a;
        this.author=b;
        this.edition=c;
    }
    void Display(){
        System.out.println(this.title+"\t"+this.author+"\t"+this.edition);
    }
    void DisplayHarry(){
        if(this.author.equalsIgnoreCase("Harry"))
            System.out.println(this.title+"\t"+this.author+"\t"+this.edition);
        else
            ;
    }
}

class BookMain {
     public static void main(String args[]){
         Scanner br=new Scanner(System.in);
         Book[] obj = new Book[6];
         int i;
         String name,author,edition;
         System.out.print("Enter the name author and edition of the 3 books");
         for(i=0;i<6;i++){
             name=br.nextLine();
             author=br.nextLine();
             edition=br.nextLine();
             obj[i] = new Book(name,author,edition);
         }
         System.out.println("Name\tAuthor\tEdition");
         for(i=0;i<6;i++){
             obj[i].Display();
         }
         System.out.println("\nThe Books by author Harry:\nName\tAuthor\tEdition");
         for(i=0;i<6;i++){
             obj[i].DisplayHarry();
         }
     }         
}
