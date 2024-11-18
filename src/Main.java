public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Aleksandr", "Pushkin" );
        Author tolstoy = new Author("Leo", "Tolstoy" );
        Book dubrovskiy = new Book("Дубровский", pushkin, 1841);
        Book warAndPeace = new Book("Война и мир", tolstoy, 1863);

        System.out.println(dubrovskiy);
        System.out.println(warAndPeace);

        dubrovskiy.setYear(1234);
        System.out.println(dubrovskiy);

    }
}