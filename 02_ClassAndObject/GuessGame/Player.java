class Player {
    int number; // Число, которое игрок загадывает

    // Метод, который позволяет игроку загадывать число
    void guess() {
        number = (int) (Math.random() * 10);
    }
}
