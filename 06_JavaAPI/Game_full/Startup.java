package Game_full;


import java.util.ArrayList;

// Класс для хранения имени стартапа
//   A B C D E F G
// 0 - - - - - - -
// 1 - - - - - - -
// 2 - - - - - - -
// 3 - - - - - - -
// 4 - - - - - - -
// 5 - - - - - - -
// 6 - - - - - - -

public class Startup {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "   : ( ");
            } else {
                result = "hit";
            } // end if
        } // end outer if
        return result;
    } // end method
} // close class
