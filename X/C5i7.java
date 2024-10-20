package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5i7, reason: invalid class name */
/* loaded from: 5i7.class */
public abstract class C5i7 {
    public float A00;
    public java.util.Map A03 = null;
    public ArrayList A02 = null;
    public long A01 = 0;

    public C5i7 A02(String str) {
        String A0j;
        C5i7 c5i7;
        java.util.Map map = this.A03;
        if (map != null && (c5i7 = (C5i7) map.get(str)) != null) {
            return c5i7;
        }
        java.util.Map map2 = this.A03;
        if (map2 == null) {
            A0j = "[]";
        } else {
            Iterator A1B = 1BK.A1B(map2);
            String str2 = "";
            while (A1B.hasNext()) {
                str2 = 0Pz.A0v(str2, "'", AnonymousClass001.A0i(A1B), "'");
                if (!A1B.hasNext()) {
                    str2 = 0Pz.A0W(str2, ", ");
                }
            }
            A0j = 0Pz.A0j("[", str2, "]");
        }
        throw AnonymousClass001.A0T(0Pz.A0v("Tried to get non-existent input '", str, "'. Node only has these inputs: ", A0j));
    }
}
