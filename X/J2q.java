package X;

import com.google.common.collect.ImmutableList;

/* loaded from: J2q.class */
public final class J2q implements Runnable {
    public static final String __redex_internal_original_name = "MontageViewerDataManager$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ ICk A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    public J2q(ICk iCk, ImmutableList immutableList, Integer num, long j, boolean z) {
        this.A01 = iCk;
        this.A00 = j;
        this.A02 = immutableList;
        this.A03 = num;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.A0B(this.A02, this.A03, this.A00, this.A04);
    }
}
