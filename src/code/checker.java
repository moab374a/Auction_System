package code;

import java.util.Objects;

public class checker {

    public static void checkString(String string){
        Objects.requireNonNull(string);
        if (string.isEmpty()) throw new IllegalArgumentException();
    }

        public static void checkLong(long param){
            if (param <= 0) throw new IllegalArgumentException();
    }

        public static void checkObject(Object Object){
        Objects.requireNonNull(Object);

    }




}
