class BottleSong {
    public static void main(String[] args) {
        int BottleNum = 10;
        String bottleStr = " бутылок";
        String bottleColor = " зеленых";

        while (BottleNum > 0) {
            if (BottleNum == 1) {
                bottleStr = " бутылка";
                bottleColor = " зеленая";
            }
            System.out.println(BottleNum + bottleColor + bottleStr + " на стене");
            System.out.println(BottleNum + bottleColor + bottleStr + " на стене");
            System.out.println("И если одна бутылка случайно упадёт");
            BottleNum = BottleNum - 1;

            if (BottleNum > 0) {
                System.out.println("Останется " + BottleNum + bottleStr + " на стене");
            } else {
                System.out.println("Не осталось зеленых бутылок на стене");
            }
        }

    }
}
