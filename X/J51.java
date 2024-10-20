package X;

import java.util.concurrent.Callable;

/* loaded from: J51.class */
public final class J51 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 2EU A01;
    public final /* synthetic */ I89 A02;
    public final /* synthetic */ boolean A03;

    public J51(2EU r302, I89 i89, int i, boolean z) {
        this.A02 = i89;
        this.A01 = r302;
        this.A03 = z;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        try {
            2EU r0 = this.A01;
            Ha8 A00 = I89.A00(7zL.A0C(r0), this.A00, this.A03);
            r0.close();
            return A00;
        } catch (Throwable th) {
            2EU.A04(this.A01);
            throw th;
        }
    }
}
