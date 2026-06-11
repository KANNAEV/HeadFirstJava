class DoWhileTestDrive {
    public static void main(String[] args) {
        int x = 0;
        do {
            x = x + 1;
            System.out.println(x);
        } while (x <= 9);
    }
}

// 1 2 3 4 5 6 7 8 9 10
// 10 тоже выведет так как у нас условие проверяется после выполнения блока кода