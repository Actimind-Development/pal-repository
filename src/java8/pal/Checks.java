package pal;
//::imports

//::module checks
public class Checks {
    //::function isTrue
    //@@depends valid, invalid
    public static boolean isTrue(boolean condition, String comment) {
        return condition ? valid() : invalid(comment);
    }

    //::function isDefined
    //@@depends valid, invalid
    public static boolean isDefined(Object o, String name) {
        return o == null ? invalid("undefined: " + name) : valid();
    }

    //::function isPositive
    //@@depends valid, invalid
    public static boolean isPositive(Integer nr) {
        return nr < 0 ? invalid("negative: " + nr) : valid();
    }

    //::function invalid
    public static boolean invalid(String error) {
        throw new IllegalArgumentException(error);
    }

    //::function valid
    public static boolean valid() {
        return true;
    }

     //::function isNegative
     //@@depends valid, invalid
     public static boolean isNegative(Integer nr) {
         return nr > 0 ? invalid("positive: " + nr) : valid();
     }

    //::addbefore
}