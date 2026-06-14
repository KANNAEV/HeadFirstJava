class Books {
    String title;
    String author;
}

class BookTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[2];
        myBooks[0] = new Books();
        myBooks[1] = new Books();

        myBooks[0].title = "Привет мир";
        myBooks[0].author = "Боб";

        myBooks[1].title = "Садовые штуки";
        myBooks[1].author = "Рэй";

        int x = 0;

        while (x < 2) {
            System.out.print(myBooks[x].title);
            System.out.print(": ");
            System.out.print(myBooks[x].author);
            System.out.print("\n");
            x = x + 1;
        }

    }
}