package X;

/* renamed from: X.4i6, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4i6.class */
public final class RunnableC06874i6 implements Runnable {
    public static final String __redex_internal_original_name = "AbstractDataSource$1";
    public final /* synthetic */ 1OV A00;
    public final /* synthetic */ 2rJ A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public RunnableC06874i6(1OV r302, 2rJ r303, boolean z, boolean z2) {
        this.A00 = r302;
        this.A03 = z;
        this.A01 = r303;
        this.A02 = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.A03) {
            this.A01.BxY(this.A00);
            return;
        }
        boolean z = this.A02;
        2rJ r0 = this.A01;
        1OV r02 = this.A00;
        if (z) {
            r0.Bn3(r02);
        } else {
            r0.C92(r02);
        }
    }
}
