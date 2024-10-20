package X;

import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;

/* loaded from: Cq9.class */
public abstract class Cq9 implements DFf {
    public String A00(Object obj) {
        if (this instanceof B7u) {
            return (String) ((C1301Ade) obj).A04(B7u.A00);
        }
        if (this instanceof B7t) {
            DHV dhv = (DHV) obj;
            11T.A0F(dhv, 0);
            return dhv.getId();
        }
        if (this instanceof B7r) {
            return ((C4U) obj).A03;
        }
        if (this instanceof B7q) {
            return ((C2U) obj).A01;
        }
        AoS aoS = ((BlM) obj).A00;
        if (aoS instanceof AoS) {
            return aoS.A07.A13;
        }
        return null;
    }

    @Override // X.DFf
    public ImmutableList Ben(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        LinkedHashMap A1C = 1BK.A1C();
        int size = immutableList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return 1BL.A0a(A1C.values());
            }
            Object obj = immutableList.get(i2);
            String A00 = A00(obj);
            if (A00 == null) {
                A00 = 1BK.A0t();
            }
            if (A1C.containsKey(A00)) {
                0fH.A0g(A00, "FirstMatchingKeyWinsDedupMutateFunction", "item already exists in map for key: %s");
            } else {
                A1C.put(A00, obj);
            }
            i = i2 + 1;
        }
    }

    public String toString() {
        return "FirstMatchingKeyWinsDedupMutateFunction";
    }
}
