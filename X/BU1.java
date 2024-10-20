package X;

import android.content.res.Resources;
import java.util.Arrays;

/* loaded from: BU1.class */
public abstract class BU1 {
    public static final String A00(Resources resources, C6jR c6jR, Object[] objArr, int i, int i2) {
        int ordinal = c6jR.ordinal();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String string = ordinal != 1 ? resources.getString(i2, copyOf) : resources.getString(i, copyOf);
        11T.A0A(string);
        return string;
    }
}
