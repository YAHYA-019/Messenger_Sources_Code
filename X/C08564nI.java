package X;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* renamed from: X.4nI, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4nI.class */
public final class C08564nI {
    public Context A00;
    public 1BY A01;
    public final ContentResolver A02;

    public C08564nI(1BO r302) {
        Context context = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);
        this.A00 = context;
        this.A02 = (ContentResolver) 1Hv.A02(context, 100181);
        this.A01 = new 1BY(r302);
    }

    public boolean A00() {
        boolean z = true;
        if (Settings.Global.getInt(this.A02, "auto_time", 0) == 0) {
            z = false;
        }
        return z;
    }
}
