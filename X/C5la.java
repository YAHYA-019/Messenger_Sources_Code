package X;

import android.net.Uri;

/* renamed from: X.5la, reason: invalid class name */
/* loaded from: 5la.class */
public final class C5la implements C5kd {
    public static final C5la A00 = new Object();
    public static final C5g3 A01 = C5lb.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A01;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        String string;
        String str;
        11T.A0F(c5to, 5);
        C82c c82c = null;
        if (c5pu != null) {
            1qX r0 = (1qX) c5pu;
            if (r0.mResultSet.getCount() != 0 && c5pu.AXc(0) == 7 && (string = r0.mResultSet.getString(0, 97)) != null) {
                try {
                    Uri A03 = C0A2.A03(string);
                    if (A03 != null && ((6C7.A03(A03) || 6C7.A02(A03) || 4FS.A00(A03) || 4FS.A02(A03)) && (str = c5to.A06) != null && str.length() != 0)) {
                        c82c = new C82c(str, 5);
                    }
                } catch (SecurityException unused) {
                }
            }
        }
        return c82c;
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
