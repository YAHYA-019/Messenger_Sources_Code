package X;

/* loaded from: D8e.class */
public final class D8e implements Runnable {
    public static final String __redex_internal_original_name = "ThreadTitleView$init$listener$1$1";
    public final /* synthetic */ BIf A00;
    public final /* synthetic */ 5Cz A01;

    public D8e(BIf bIf, 5Cz r303) {
        this.A00 = bIf;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BIf bIf = this.A00;
        5Cz r0 = this.A01;
        if (bIf.A06 != r0) {
            2Iq r02 = bIf.A01;
            11T.A0D(r02);
            r02.A01("canonical_new_presence_push");
            bIf.A06 = r0;
            if (bIf.A00 != null) {
                BIf.A01(bIf);
            }
        }
    }
}
