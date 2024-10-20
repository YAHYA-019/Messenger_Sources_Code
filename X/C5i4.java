package X;

import java.util.ArrayList;

/* renamed from: X.5i4, reason: invalid class name */
/* loaded from: 5i4.class */
public final class C5i4 {
    public final ArrayList A00 = new ArrayList();
    public final ArrayList A02 = new ArrayList();
    public final ArrayList A01 = new ArrayList();

    public static void A00(C5i7 c5i7, C5i7 c5i72, String str) {
        if (!c5i7.A02.remove(c5i72)) {
            throw AnonymousClass001.A0T("Tried to remove non-existent input!");
        }
        java.util.Map map = c5i72.A03;
        if (map == null || map.remove(str) == null) {
            throw 0Pz.A08("Tried to remove non-existent input with name: ", str);
        }
    }
}
