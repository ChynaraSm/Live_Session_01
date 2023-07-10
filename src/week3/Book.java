package week3;

public class Book {
    public static void main(String[] args) {
        String genre="Science fiction";
        int pageLength=0, profit=0, sequels=0, countries=0;
        boolean isValid=true;

        switch (genre){
            default://changing the boolean to be false when no case is matched
                isValid=false;
                break;
            case "Fantasy":
                pageLength=500;
                profit=1_000_000;
                sequels=5;
                countries=50;
                break;
            case "Detective":
                pageLength=350;
                profit=700_000;
                sequels=3;
                countries=45;
                break;
            case "Science fiction":
                pageLength=720;
                profit=900_000;
                sequels=1;
                countries=40;
                break;
            case "Short Story":
                pageLength=150;
                profit=300_000;
                sequels=4;
                countries=30;
                break;

        }
        if (isValid) {
            String message = "The " + genre + " genre usually has profits of $" + profit + " being sold in " + countries + " different countries. The " + genre + " books often have " + sequels + " sequels with each book roughly being around " + pageLength + " page.";//this statement will print even when genre is not listed therefore we used boolean and if else statement bellow
            System.out.println(message);
        } else{
            System.out.println("Sorry we don't have information for the " +genre+ " genre.");
        }
    }
}
