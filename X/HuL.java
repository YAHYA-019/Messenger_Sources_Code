package X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: HuL.class */
public final class HuL {
    public Activity A00;
    public HVY A01;
    public GR0 A02;
    public final 1Br A03;

    public HuL(Context context) {
        11T.A0F(context, 1);
        this.A03 = 1Bu.A01(context, 115674);
    }

    public Fragment A00(String str) {
        GR0 gr0 = this.A02;
        if (gr0 == null) {
            11T.A0L("fragmentManagerProvider");
            throw 0Q8.createAndThrow();
        }
        06Z A00 = gr0.A00();
        if (A00 != null) {
            return A00.A0b(str);
        }
        return null;
    }

    public void A01(0D2 r302, String str) {
        String str2;
        11T.A0F(r302, 0);
        HVY hvy = this.A01;
        if (hvy == null) {
            str2 = "callback";
        } else {
            Object obj = hvy.A00.A0O;
            if (obj != null) {
                ((Activity) obj).setShowWhenLocked(false);
            }
            GR0 gr0 = this.A02;
            if (gr0 != null) {
                06Z A00 = gr0.A00();
                if (A00 != null) {
                    r302.A0m(A00, str);
                    A00.A0t();
                    return;
                }
                return;
            }
            str2 = "fragmentManagerProvider";
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    public void A02(JGQ jgq) {
        HoH hoH = (HoH) 1Br.A0B(this.A03);
        Activity activity = this.A00;
        if (activity == null) {
            11T.A0L("callActivity");
            throw 0Q8.createAndThrow();
        }
        hoH.A00(activity, new HbV(this, jgq));
    }

    public boolean A03() {
        return ((KeyguardManager) ((HoH) 1Br.A0B(this.A03)).A02.get()).isDeviceLocked();
    }
}
