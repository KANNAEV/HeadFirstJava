package LogicalOperators;

public class LogicalOperators {

    String andExample(int price) {
        String camera;
        if (price >= 300 && price < 400) {
            camera = "Sony";
        }
        else {
            camera = "BQ";
        }
        return camera;
    }

    void orExample(String brand) {
        if (brand.equals("Sony") || brand.equals("BQ")) {
            System.out.println("Хорошие камеры");
        } else {
            System.out.println("Не советую покупать");;
        }
    }

    void longBoolean(String zoomType, int zoomDegree) {
        if ((zoomType.equals("optical")
                && (zoomDegree >= 3 && zoomDegree <= 8))
                || (zoomType.equals("digital")
                && (zoomDegree >= 5 && zoomDegree <= 12))) {
            // do appropriate zoom stuff
        }
    }

    void notEqualInt(int model) {
        if (model != 2000) {
            //  do non-model 2000 stuff
        }
    }

    void notEqualString(String brand) {
        if (!brand.equals("X")) {
            // do non-brand X stuff
        }
    }

    void shortCircuit(SomeType refVar) {
        if (refVar != null
                && refVar.isValidType()) {
            // do ‘got a valid type’ stuff
        }
    }

    void arrayListComparedToArray(String[] myList) {
        String b = new String("Frog");

        boolean isIn = false;
        for (String item : myList) {
            if (b.equals(item)) {
                isIn = true;
                break;
            }
        }
    }

    private class SomeType {

        public boolean isValidType() {
            return false;
        }
    }

}
