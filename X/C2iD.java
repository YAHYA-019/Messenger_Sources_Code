package X;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.2iD, reason: invalid class name */
/* loaded from: 2iD.class */
public final class C2iD {
    public 3lU A00;
    public boolean A01;
    public final Function A03 = 2iE.A00;
    public final 0WH A02 = new 0WH(0);

    public static final void A00(C2iD c2iD) {
        3lU r0 = c2iD.A00;
        if (r0 == null) {
            throw AnonymousClass001.A0N("setCallback() was not called.");
        }
        ImmutableSet A07 = ImmutableSet.A07(c2iD.A02);
        11T.A0A(A07);
        r0.CKD(A07);
    }

    public final void A01(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        this.A02.addAll(1JW.A04(this.A03, immutableList));
        A00(this);
    }
}
