package X;

import android.content.Context;
import com.google.common.base.Platform;

/* renamed from: X.7zv, reason: invalid class name and case insensitive filesystem */
/* loaded from: 7zv.class */
public final class C12287zv implements InterfaceC12197zl {
    public 1BY A00;
    public final Context A01 = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);

    public C12287zv(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    @Override // X.InterfaceC12197zl
    public String AKz(C12167zi c12167zi) {
        6Ay BCm;
        String str = c12167zi.A02;
        if (str == null || (BCm = c12167zi.A01.BCm()) == null || BCm.BEO() == null) {
            return "";
        }
        String A0r = BCm.A0r(-2061635299);
        if (Platform.stringIsNullOrEmpty(A0r)) {
            A0r = 1BK.A0v(this.A01, str, 2131968198);
        }
        return A0r;
    }

    @Override // X.InterfaceC12197zl
    public boolean Cx8() {
        return false;
    }
}
