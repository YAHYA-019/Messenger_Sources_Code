package X;

import android.os.ConditionVariable;

/* loaded from: Ij3.class */
public final class Ij3 implements JKX {
    public final /* synthetic */ Icn A00;

    public Ij3(Icn icn) {
        this.A00 = icn;
    }

    public HC9 B75() {
        return HC9.A0K;
    }

    public void disable() {
        Icf icf = this.A00.A0L;
        if (icf == null || !icf.A02) {
            return;
        }
        IHB ihb = icf.A04;
        ihb.A0G = false;
        ihb.A08.post(ihb.A0A);
        Icw icw = icf.A00;
        if (icw != null) {
            icf.A01.A03(icw);
        }
        icf.A02 = false;
    }

    public void enable() {
        Icf icf = this.A00.A0L;
        if (icf == null || icf.A02) {
            return;
        }
        IHB ihb = icf.A04;
        ihb.A0G = true;
        ihb.A08.post(ihb.A09);
        if (ihb.A05) {
            ConditionVariable conditionVariable = ihb.A07;
            conditionVariable.block();
            conditionVariable.close();
        }
        Icw icw = icf.A00;
        if (icw != null) {
            Ici ici = icf.A01;
            ici.A01(ici.A01, icw);
        }
        icf.A02 = true;
        icf.A03 = false;
    }
}
