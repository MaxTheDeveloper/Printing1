/**
 * Created by Anatoliy on 23.03.2017.
 */
public class PaperTray {
    private int pages;

    void addPaper(int count) {
        pages += count;
    }

    void usePage() {
        pages--;
    }

    boolean isEmpty() {
        if (pages == 0)
            return true;
        else
            return false;
    }
}
