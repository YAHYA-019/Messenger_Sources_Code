package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Cmy.class */
public final class Cmy implements DFP {
    public final /* synthetic */ B8C A00;

    public Cmy(B8C b8c) {
        this.A00 = b8c;
    }

    public final void Bq7(ImmutableList immutableList) {
        B8C b8c = this.A00;
        int i = 0;
        ((B8A) b8c).A01 = AbJ.A1U(immutableList.size(), 10);
        Integer num = b8c.A00;
        if (num != null) {
            i = num.intValue();
        }
        b8c.A00 = Integer.valueOf(i + immutableList.size());
        C1d c1d = b8c.A05;
        if (c1d != null) {
            c1d.A00(immutableList);
        }
        b8c.A06(immutableList);
    }
}
