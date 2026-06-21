import java.util.Arrays;
import java.util.Comparator;

public class SearchLibrary {

    public static Book linearSearch(Book[] books, String target) {

        for (Book book : books) {

            if (book.title.equalsIgnoreCase(target)) {
                return book;
            }
        }

        return null;
    }

    public static Book binarySearch(Book[] books, String target) {

        Arrays.sort(books, Comparator.comparing(book -> book.title));

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int comparison = books[mid].title.compareToIgnoreCase(target);

            if (comparison == 0) {
                return books[mid];
            }

            else if (comparison < 0) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return null;
    }
}
