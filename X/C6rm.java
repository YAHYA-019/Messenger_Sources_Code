package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.6rm, reason: invalid class name */
/* loaded from: 6rm.class */
public final class C6rm extends 0KB {
    public final /* synthetic */ 2Oe A00;

    public C6rm(2Oe r302) {
        this.A00 = r302;
    }

    public void A01(Context context, Fragment fragment, 06Z r304) {
        11T.A0F(context, 2);
        if (fragment instanceof 2Oe) {
            return;
        }
        2Oe r0 = this.A00;
        6tF r02 = r0.threadSettingsLauncherStrategy;
        if (r02 == null) {
            11T.A0L("threadSettingsLauncherStrategy");
            throw 0Q8.createAndThrow();
        }
        r02.BdA(fragment, r0, 2Oe.A03(r0));
    }
}
