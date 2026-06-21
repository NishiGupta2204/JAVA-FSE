public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java", "Herbert Schildt"),
                new Book(102, "Python", "Mark Lutz"),
                new Book(103, "C++", "Bjarne Stroustrup"),
                new Book(104, "DSA", "Narasimha Karumanchi")
        };

        Book linearResult = SearchLibrary.linearSearch(books, "Python");

        System.out.println("Result using Linear Search:");

        if (linearResult != null) {
            System.out.println(linearResult);
        }

        Book binaryResult = SearchLibrary.binarySearch(books, "Python");

        System.out.println("\nResult using Binary Search:");

        if (binaryResult != null) {
            System.out.println(binaryResult);
        }
    }
}
