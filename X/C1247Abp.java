package X;

import android.content.Context;

/* renamed from: X.Abp, reason: case insensitive filesystem */
/* loaded from: Abp.class */
public final class C1247Abp {
    public final DGW A00;

    public C1247Abp(Context context, String str) {
        C1249Abr ccA;
        if (str.equals("XApp")) {
            ccA = new CcA(context);
        } else {
            if (!str.equals("AiBotPluginImplementations")) {
                throw 1BL.A0l(str);
            }
            ccA = new C1249Abr(context);
        }
        this.A00 = ccA;
    }
}
