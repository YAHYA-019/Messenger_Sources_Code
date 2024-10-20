package X;

import android.net.Uri;
import com.facebook.acra.constants.ActionId;

/* renamed from: X.5kx, reason: invalid class name */
/* loaded from: 5kx.class */
public final class C5kx implements C5kd {
    public static final C5kx A00 = new Object();
    public static final C5g3 A01 = C5ky.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A01;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        String str = null;
        if (c5pu == null) {
            return null;
        }
        1qX r0 = (1qX) c5pu;
        if (r0.mResultSet.getCount() == 0 || c5pu.AXc(0) != 7) {
            return null;
        }
        String string = r0.mResultSet.getString(0, 97);
        String string2 = r0.mResultSet.getString(0, ActionId.LEGACY_MARKER);
        String string3 = r0.mResultSet.getString(0, ActionId.ACTION_BAR_COMPLETE);
        if (string == null) {
            return null;
        }
        try {
            Uri A03 = C0A2.A03(string);
            11T.A0D(A03);
            if (!6C7.A03(A03) && !6C7.A02(A03) && !6C7.A04(A03) && !4FS.A00(A03) && !4FS.A02(A03)) {
                return null;
            }
            2yD r02 = (2yD) 1Bi.A03(16385);
            boolean AZk = r02.AZk(36322912085624910L);
            boolean AZk2 = r02.AZk(36322912085559373L);
            if (string2 == null || string2.length() == 0 || !AZk) {
                string2 = null;
            }
            if (string3 != null && string3.length() != 0 && AZk2) {
                str = string3;
            }
            return new C82k(string2, str, 1);
        } catch (SecurityException unused) {
            return null;
        }
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
