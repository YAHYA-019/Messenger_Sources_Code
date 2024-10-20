package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6jk, reason: invalid class name */
/* loaded from: 6jk.class */
public final class C6jk {
    public volatile Set A00;

    public final boolean A00(String str) {
        if (str == null || 0CU.A0O(str)) {
            return false;
        }
        if (this.A00 == null) {
            HashSet hashSet = new HashSet();
            Iterator it = C6jl.A00(36873763115565235L).iterator();
            while (it.hasNext()) {
                Integer A0d = 0CW.A0d((String) it.next(), 16);
                if (A0d != null) {
                    int intValue = A0d.intValue();
                    if (Character.isValidCodePoint(intValue)) {
                        char[] chars = Character.toChars(intValue);
                        11T.A0A(chars);
                        hashSet.add(new String(chars));
                    }
                }
            }
            this.A00 = hashSet;
        }
        Set set = this.A00;
        if (set != null) {
            return set.contains(str);
        }
        throw 1BK.A0h();
    }
}
