package X;

import android.net.Uri;

/* renamed from: X.5l4, reason: invalid class name */
/* loaded from: 5l4.class */
public final class C5l4 implements C5l5 {
    public static final C5l4 A00 = new Object();

    @Override // X.C5l5
    public String Axh(C5pu c5pu, int i) {
        1qX r0 = (1qX) c5pu;
        String string = r0.mResultSet.getString(i, 28);
        if (!5wV.A00(string)) {
            string = r0.mResultSet.getString(i, 20);
        }
        return string;
    }

    @Override // X.C5l5
    public String B2p(C5pu c5pu, int i) {
        5wX r0 = (5wX) 1Bi.A03(67176);
        String str = null;
        Uri A01 = 5wV.A00(((1qX) c5pu).mResultSet.getString(i, 28)) ? r0.A01(c5pu, i) : r0.A00(c5pu, i);
        if (A01 != null) {
            str = A01.toString();
        }
        return str;
    }

    @Override // X.C5l5
    public String BFe(C5pu c5pu, int i) {
        Uri A01 = ((5wX) 1Bi.A03(67176)).A01(c5pu, i);
        if (A01 != null) {
            return A01.toString();
        }
        return null;
    }
}
