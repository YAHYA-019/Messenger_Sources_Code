package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.7zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 7zw.class */
public final class C12297zw implements InterfaceC12197zl {
    public final Context A00 = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);

    @Override // X.InterfaceC12197zl
    public String AKz(C12167zi c12167zi) {
        6Ay BCm;
        ArE BEO;
        String str = c12167zi.A02;
        if (str == null || (BCm = c12167zi.A01.BCm()) == null || (BEO = BCm.BEO()) == null) {
            return "";
        }
        String A0r = BCm.A0r(-2061635299);
        if (TextUtils.isEmpty(A0r)) {
            A0r = this.A00.getString(2131953667, str, BEO.A0r(204158082));
        }
        return A0r;
    }

    @Override // X.InterfaceC12197zl
    public boolean Cx8() {
        return false;
    }
}
