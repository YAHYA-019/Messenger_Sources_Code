package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Set;

/* renamed from: X.1pj, reason: invalid class name */
/* loaded from: 1pj.class */
public abstract class C1pj {
    public boolean A00;
    public final BroadcastReceiver A01 = new BroadcastReceiver() { // from class: X.1pk
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i;
            int A01 = 0FI.A01(-2030859356);
            C1pj c1pj = C1pj.this;
            if (c1pj.A00) {
                c1pj.A01(context, intent);
                i = -465189111;
            } else {
                0fH.A0B(C1pj.class, "Called onReceive after it was unregistered.");
                i = 2000886822;
            }
            0FI.A0D(i, A01, intent);
        }
    };
    public final IntentFilter A02;
    public final 1Mg A03;

    public C1pj(Context context, IntentFilter intentFilter) {
        this.A03 = 1Mg.A00(context);
        this.A02 = intentFilter;
    }

    public void A00() {
        if (this.A00) {
            0fH.A0B(C1pj.class, "Called registerNotificationReceiver twice.");
            return;
        }
        1Mg r0 = this.A03;
        r0.A01.A01(this.A01, this.A02);
        this.A00 = true;
    }

    public void A01(Context context, Intent intent) {
        C2yj c2yj = (C2yj) this;
        11T.A0F(intent, 1);
        1iZ r0 = c2yj.A01;
        Set set = 1iZ.A0T;
        if (r0.A0Q.get()) {
            Ebk ebk = (Ebk) r0.A0C.A00.get();
            Activity activity = c2yj.A00;
            if (intent.getBooleanExtra("retain_activity_on_logout", false)) {
                return;
            }
            if ((activity instanceof FragmentActivity) && (!((1CQ) ebk.A00.A00.get()).A09(4, false))) {
                List<C05w> A0A = ((FragmentActivity) activity).BDe().A0T.A0A();
                11T.A0A(A0A);
                for (C05w c05w : A0A) {
                    if (c05w instanceof C4Fn) {
                        ((C4Fn) c05w).C54();
                        return;
                    }
                }
            }
            activity.finish();
        }
    }
}
