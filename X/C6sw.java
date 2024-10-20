package X;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.6sw, reason: invalid class name */
/* loaded from: 6sw.class */
public final class C6sw implements 1Vf {
    public final Context A00;
    public final 1Br A01 = 1Bu.A00(16838);
    public final 2Qs A02 = (2Qs) 1Bi.A03(66602);

    public C6sw(Context context) {
        this.A00 = context;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        Activity activity;
        Window window;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreate")) {
            throw 4YV.A0f(str);
        }
        Context context = this.A00;
        if (!(context instanceof Activity) || (activity = (Activity) context) == null || (window = activity.getWindow()) == null) {
            return;
        }
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E(activity, (1BY) null, 16979);
        if (!this.A02.A00()) {
            ((1tC) this.A01.A00.get()).A03(window, migColorScheme);
            return;
        }
        C3Qv c3Qv = (C3Qv) 1Hv.A02(activity, 84231);
        11T.A0F(migColorScheme, 1);
        c3Qv.A01(window, migColorScheme.BDl(), migColorScheme.BDl());
    }
}
