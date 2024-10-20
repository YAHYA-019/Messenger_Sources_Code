package X;

import java.util.Iterator;

/* renamed from: X.9dL, reason: invalid class name */
/* loaded from: 9dL.class */
public abstract class C9dL {
    public static final C96y A00(int i) {
        Object obj;
        Iterator it = C96y.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C96y) obj).modeId == i) {
                break;
            }
        }
        return (C96y) obj;
    }

    public static final C96y A01(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1848957518) {
            if (str.equals("SIMPLE")) {
                return C96y.A04;
            }
            return null;
        }
        if (hashCode == 77867646) {
            if (str.equals("RETRO")) {
                return C96y.A03;
            }
            return null;
        }
        if (hashCode == 320532812 && str.equals("MESSAGES")) {
            return C96y.A02;
        }
        return null;
    }
}
