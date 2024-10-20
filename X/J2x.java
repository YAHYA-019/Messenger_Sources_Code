package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.rsys.call.gen.CallModel;

/* loaded from: J2x.class */
public final class J2x implements Runnable {
    public static final String __redex_internal_original_name = "MediaDelayController$maybeShowDelayToast$1";
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Hpt A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    public J2x(Activity activity, View view, Hpt hpt, Integer num, boolean z) {
        this.A02 = hpt;
        this.A03 = num;
        this.A04 = z;
        this.A00 = activity;
        this.A01 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        View findViewById;
        int i;
        Hpt hpt = this.A02;
        Integer num = this.A03;
        boolean z = this.A04;
        11T.A0F(num, 0);
        CallModel A0S = AbstractC2326GOr.A0S(hpt.A00);
        int intValue = num.intValue();
        boolean z2 = true;
        if (intValue != 1) {
            if (A0S != null) {
                z2 = IFr.A0F(A0S);
            }
        } else if (A0S != null) {
            z2 = IFr.A0H(A0S);
        }
        if (1BK.A1X(Boolean.valueOf(z2), z) || (activity = this.A00) == null || (findViewById = activity.findViewById(2131362780)) == null) {
            return;
        }
        6LF r0 = (6LF) 1Br.A0B(hpt.A02);
        View view = this.A01;
        MigColorScheme A0m = 7zQ.A0m(hpt.A01);
        Resources resources = view.getResources();
        if (intValue != 1) {
            i = 2131967623;
            if (!z) {
                i = 2131962018;
            }
        } else {
            i = 2131967458;
            if (!z) {
                i = 2131967457;
            }
        }
        r0.A00((View.OnClickListener) null, view, findViewById, A0m, (KT3) null, 4YU.A0t(resources, i), (CharSequence) null, resources.getInteger(2131427361), 1);
    }
}
