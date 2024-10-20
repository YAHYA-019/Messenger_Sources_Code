package X;

import java.util.List;

/* loaded from: F27.class */
public abstract class F27 {
    public static FwU A00(GL7 gl7, Object obj, int i) {
        FJ5.A08(((FwU) gl7).A01);
        FwU ACy = gl7.ACy();
        ACy.put(i, obj);
        return ACy;
    }

    public static boolean A01(Object obj, int i, int i2) {
        if ((i != 50456 && FGa.A00(i, i2)) || !(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        return !list.isEmpty() && (list.get(0) instanceof GL7);
    }
}
