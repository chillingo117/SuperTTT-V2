package validation;

public class Validation {

    public static boolean isValidCoord (String coord){
        try{
            System.out.println(coord);
            int coordAsInt = Integer.parseInt(coord);
            if(coordAsInt < 1 || coordAsInt > 9){
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException e){
            return false;
        }
    }
}
