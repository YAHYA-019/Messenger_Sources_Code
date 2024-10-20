package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.800, reason: invalid class name */
/* loaded from: 800.class */
public final class AnonymousClass800 implements InterfaceC12197zl {
    public final Context A00 = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);

    @Override // X.InterfaceC12197zl
    public String AKz(C12167zi c12167zi) {
        6Ay BCm;
        ArE BEO;
        String str = c12167zi.A02;
        if (str == null || (BCm = c12167zi.A01.BCm()) == null || (BEO = BCm.BEO()) == null) {
            return "";
        }
        String A0r = BEO.A0r(-2061635299);
        if (TextUtils.isEmpty(A0r)) {
            A0r = 1BK.A0v(this.A00, str, 2131953665);
        }
        return A0r;
    }

    @Override // X.InterfaceC12197zl
    public boolean Cx8() {
        return false;
    }
}
