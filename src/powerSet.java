public class powerSet {

    public static void powerSet(String[] arrayPass) {
        //Prints out the super set
        String[][] returnArray = new String[][]{{}};
        for (String entry : arrayPass) {
            for (String[] entrySecond : returnArray) {
                String[] temp = new String[]{entry};
                temp = pythonsque.functions.extend(entrySecond, temp);
                returnArray = pythonsque.functions.append(returnArray, temp);
            }
        }
        pythonsque.functions.displayArrays(returnArray);
    }

    public static String[][] returnPowerSet(String[] arrayPass) {
        //returns an array of arrays of strings
        String[][] returnArray = new String[][]{{}};
        for (String entry : arrayPass) {
            for (String[] entrySecond : returnArray) {
                String[] temp = new String[]{entry};
                temp = pythonsque.functions.extend(entrySecond, temp);
                returnArray = pythonsque.functions.append(returnArray, temp);
            }
        }
        return returnArray;
    }

    public static void main(String[] args) {
        //===========[Examples]===========
        String[][] superSetList = returnPowerSet(new String[]{"1","2","3","4"});
        pythonsque.functions.displayArrays(superSetList);
        powerSet(new String[]{"1","2","3","4"});

    }
}
