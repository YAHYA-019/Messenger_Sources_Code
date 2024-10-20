package X;

/* loaded from: AH1.class */
public final class AH1 implements Runnable {
    public static final String __redex_internal_original_name = "AiBotNullStateView$startDonutRotateAnimation$2";
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 8Cf A03;
    public final /* synthetic */ C00m A04;

    public AH1(8Cf r302, C00m c00m, float f, int i, long j) {
        this.A01 = i;
        this.A03 = r302;
        this.A00 = f;
        this.A02 = j;
        this.A04 = c00m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A01;
        if (i <= 1) {
            this.A04.invoke();
            return;
        }
        8Cf.A06(this.A03, this.A04, this.A00, i - 1, this.A02, 0L);
    }
}
