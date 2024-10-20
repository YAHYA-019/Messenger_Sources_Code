package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: L2a.class */
public final class L2a {
    public JgN A00;
    public Ktt A01;
    public final WeakReference A06;
    public Long A03 = null;
    public Integer A02 = null;
    public boolean A05 = false;
    public List A04 = AnonymousClass001.A0s();
    public final Handler A07 = AnonymousClass001.A07();

    public L2a(WeakReference weakReference) {
        this.A06 = weakReference;
    }

    public static int A00(JgN jgN, String str) {
        Integer num;
        String str2;
        if (jgN != null) {
            num = ((jgN instanceof AbstractC3226Jn3) || (jgN instanceof AbstractC3225Jn2)) ? 0S2.A01 : 0S2.A00;
        } else {
            int hashCode = str.hashCode();
            if (hashCode != -1459274090) {
                str2 = hashCode == 161743991 ? "BLOKS_HYBRID_PAYMENT_USAGE" : "BLOKS_PAYMENT_USAGE";
                num = 0S2.A0C;
            }
            if (str.equals(str2)) {
                num = 0S2.A0N;
            }
            num = 0S2.A0C;
        }
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
        }
    }

    public void A01(Context context, C11454wj c11454wj, C11474wl c11474wl, JgN jgN, Ktt ktt, Integer num, Integer num2, String str, List list) {
        int A00;
        synchronized (this) {
            Long l = this.A03;
            if (l == null) {
                this.A03 = Long.valueOf(SystemClock.elapsedRealtime());
                A00 = A00(jgN, str);
            } else {
                A00 = A00(jgN, str);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long longValue = elapsedRealtime - l.longValue();
                if (longValue < 1000) {
                    Integer num3 = this.A02;
                    if (num3 != null) {
                        C3243Jnf A0S = JQz.A0S(this.A06);
                        if (A0S != null) {
                            int i = (int) longValue;
                            int intValue = num3.intValue();
                            C11394wd c11394wd = A0S.A0c.A00.A08;
                            String str2 = c11394wd.A05;
                            String str3 = c11394wd.A01;
                            Bundle A06 = A0S.A06();
                            11T.A0F(str2, 0);
                            LDF.A00().A0B(A06, new L2l(null, (intValue == 0 || intValue == 2) ? intValue == A00 ? "MERGE_AUTOFILL_DIALOG_INTERVAL_CONTACT" : "MERGE_AUTOFILL_DIALOG_INTERVAL_CONTACT_PAYMENT" : (intValue == 1 || intValue == 3) ? intValue == A00 ? "MERGE_AUTOFILL_DIALOG_INTERVAL_PAYMENT" : "MERGE_AUTOFILL_DIALOG_INTERVAL_PAYMENT_CONTACT" : "MERGE_AUTOFILL_DIALOG_INTERVAL", str2, null, null, null, null, null, str3, null, null, null, null, null, null, null, null, null, 0, i, 0L, 0L, false, false, false, false).A01());
                        }
                    }
                }
                this.A03 = Long.valueOf(elapsedRealtime);
            }
            this.A02 = Integer.valueOf(A00);
            JgN jgN2 = this.A00;
            if (jgN2 != null) {
                Dialog dialog = ((0D2) jgN2).A01;
                if (dialog != null && dialog.isShowing() && !this.A00.mRemoving) {
                    c11454wj.A03(num, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                    c11454wj.A01(num, null, 772805755);
                }
            }
            if (this.A05) {
                this.A04.add(new Kku(jgN, ktt, num2, str));
            } else {
                this.A05 = true;
                List list2 = this.A04;
                list2.clear();
                list2.add(new Kku(jgN, ktt, num2, str));
                this.A07.postDelayed(new LrD(context, this, c11454wj, c11474wl, jgN, ktt, num, str, list), 200L);
            }
        }
    }
}
