package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.endtoend.EndToEnd;
import com.facebook.forker.Process;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.payments.p2p.awareness.PaymentAwarenessActivity;
import java.io.Serializable;

/* loaded from: Euy.class */
public final class Euy {
    public 1BY A00;
    public final C00i A04 = 1BV.A01((1BY) null, 99119);
    public final C00i A01 = 1BQ.A02(98768);
    public final C00i A03 = 1BV.A01((1BY) null, 67860);
    public final C15h A02 = G7K.A01(this, 90);

    public Euy(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public Intent A00(Context context, Intent intent, EMw eMw) {
        if (!EndToEnd.isRunningEndToEndTest()) {
            C00i c00i = this.A03;
            if (!2yD.A03(DKH.A0T(c00i), 36312870457447519L)) {
                if (eMw == null) {
                    eMw = EMw.A04;
                }
                if (!DKH.A0T(c00i).AZk(36312870452728905L) && FI2.A02(this.A04) && ((C2t1) this.A01.get()).A0O(new InterstitialTrigger(Process.SD_BLACK_HOLE, (String) null), C1749Arj.class) != null) {
                    Intent A0D = C3o5.A0D(context, PaymentAwarenessActivity.class);
                    A0D.putExtra("payment_awareness_mode", (Serializable) eMw);
                    A0D.putExtra("thread_summary", (Parcelable) null);
                    A0D.putExtra("payment_awareness_post_nux_intent", intent);
                    return A0D;
                }
            }
        }
        return intent;
    }
}
