package X;

import com.google.common.collect.ImmutableList;

/* loaded from: D9q.class */
public final class D9q implements Runnable {
    public static final String __redex_internal_original_name = "NeueContactPickerCombinedInviteLoader$5";
    public final /* synthetic */ CnX A00;
    public final /* synthetic */ Bwo A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ boolean A03;

    public D9q(CnX cnX, Bwo bwo, ImmutableList immutableList, boolean z) {
        this.A00 = cnX;
        this.A03 = z;
        this.A01 = bwo;
        this.A02 = immutableList;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = this.A03;
        2TV r0 = this.A00.A00;
        Bwo bwo = this.A01;
        ImmutableList immutableList = this.A02;
        if (z) {
            CCC.A00(r0, immutableList, bwo);
        } else {
            r0.C9D(bwo, new CCC(immutableList));
        }
    }
}
