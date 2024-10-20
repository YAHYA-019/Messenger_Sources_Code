package X;

import com.google.common.collect.ImmutableList;

/* loaded from: D82.class */
public final class D82 implements Runnable {
    public static final String __redex_internal_original_name = "M4OmnipickerAddGroupMemberFragment$19$1";
    public final /* synthetic */ D4G A00;
    public final /* synthetic */ ImmutableList A01;

    public D82(D4G d4g, ImmutableList immutableList) {
        this.A00 = d4g;
        this.A01 = immutableList;
    }

    @Override // java.lang.Runnable
    public void run() {
        D4G d4g = this.A00;
        B7E b7e = (B7E) d4g.A01;
        CGk cGk = (CGk) b7e.A0L.get();
        ImmutableList immutableList = this.A01;
        boolean A1P = AnonymousClass001.A1P(b7e.A06.A01);
        11T.A0F(immutableList, 0);
        B7E.A0C(b7e, cGk.A00(immutableList, (String) null, A1P, false), d4g.A03);
    }
}
