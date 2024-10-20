package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.7zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 7zz.class */
public final class C12327zz implements InterfaceC12197zl {
    public final Context A00 = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);

    @Override // X.InterfaceC12197zl
    public String AKz(C12167zi c12167zi) {
        6Ay BCm;
        ArE BEO;
        Context context;
        int i;
        Object[] objArr;
        String str = c12167zi.A02;
        if (str == null || (BCm = c12167zi.A01.BCm()) == null || (BEO = BCm.BEO()) == null) {
            return "";
        }
        String A0r = BEO.A0r(204158082);
        if (!TextUtils.isEmpty(A0r)) {
            String A0r2 = BEO.A0r(-133689903);
            if (!TextUtils.isEmpty(A0r2)) {
                context = this.A00;
                i = 2131953669;
                objArr = new Object[]{str, A0r, A0r2};
                return context.getString(i, objArr);
            }
        }
        context = this.A00;
        i = 2131953670;
        objArr = new Object[]{str};
        return context.getString(i, objArr);
    }

    @Override // X.InterfaceC12197zl
    public boolean Cx8() {
        return false;
    }
}
