package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Lqt.class */
public final class Lqt implements Runnable {
    public static final String __redex_internal_original_name = "ConnectionControllerImpl$12";
    public final /* synthetic */ int A00;
    public final /* synthetic */ LVb A01;
    public final /* synthetic */ Rfu A02;
    public final /* synthetic */ Rfu A03;
    public final /* synthetic */ ImmutableList A04;

    public Lqt(LVb lVb, Rfu rfu, Rfu rfu2, ImmutableList immutableList, int i) {
        this.A01 = lVb;
        this.A04 = immutableList;
        this.A00 = i;
        this.A03 = rfu;
        this.A02 = rfu2;
    }

    @Override // java.lang.Runnable
    public void run() {
        LVb lVb = this.A01;
        synchronized (lVb.A0P) {
            lVb.A0H.BsV(this.A03, this.A02, this.A04, this.A00);
        }
    }
}
