package X;

import com.google.common.collect.ImmutableList;

/* loaded from: C1c.class */
public final class C1c {
    public final /* synthetic */ Cc4 A00;

    public C1c(Cc4 cc4) {
        this.A00 = cc4;
    }

    public void A00(ImmutableList immutableList, Integer num) {
        11T.A0F(num, 1);
        Bh7 bh7 = this.A00.A02;
        if (bh7 != null) {
            int intValue = num.intValue();
            BP5 bp5 = intValue != 1 ? intValue != 3 ? BP5.A0F : BP5.A0N : BP5.A0X;
            C1531Akk c1531Akk = bh7.A00;
            if (bp5 == c1531Akk.A09) {
                1BK.A1E(c1531Akk.A0a).execute(new D8H(bh7, immutableList));
            }
        }
    }
}
