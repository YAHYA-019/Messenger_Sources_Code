package X;

import java.util.List;

/* loaded from: J3q.class */
public final class J3q implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerLogger$logRepresentationEnded$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ IHX A03;
    public final /* synthetic */ 6Uz A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public J3q(IHX ihx, 6Uz r303, String str, List list, int i, long j, long j2) {
        this.A03 = ihx;
        this.A00 = i;
        this.A04 = r303;
        this.A05 = str;
        this.A02 = j;
        this.A01 = j2;
        this.A06 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JNa jNa = this.A03.A02;
        int i = this.A00;
        jNa.BbK(this.A04, this.A05, this.A06, i, this.A02, this.A01);
    }
}
