class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy(); // Эта строка создает объект класса XCopy
        int y = x.go(orig); // Нестатические методы нужно вызывать на конкретном объекте
        System.out.println("orig: " + orig);
        System.out.println("y: " + y);
    }

    int go(int arg) { // Метод go() НЕ является статическим (нельзя вызвать просто по имени класса)
        arg = arg * 2;
        return arg;
    }

}
