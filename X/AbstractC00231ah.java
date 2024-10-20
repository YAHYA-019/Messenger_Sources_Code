package X;

import java.util.LinkedHashMap;

/* renamed from: X.1ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1ah.class */
public abstract class AbstractC00231ah {
    public static LinkedHashMap A00(String[] strArr) {
        LinkedHashMap linkedHashMap;
        if (strArr != null) {
            linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= strArr.length) {
                    break;
                }
                linkedHashMap.put(strArr[i2], Integer.valueOf(i2));
                i = i2 + 1;
            }
        } else {
            linkedHashMap = null;
        }
        return linkedHashMap;
    }
}
