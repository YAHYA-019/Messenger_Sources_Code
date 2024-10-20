package X;

/* loaded from: Iy1.class */
public final class Iy1 implements Runnable {
    public static final String __redex_internal_original_name = "RtcExpressionCircularEffectsAdapter$pollForProgress$1$1";
    public final /* synthetic */ I5A A00;
    public final /* synthetic */ GWo A01;

    public Iy1(I5A i5a, GWo gWo) {
        this.A01 = gWo;
        this.A00 = i5a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GWo gWo = this.A01;
        gWo.A0A(gWo.A00.indexOf(this.A00), HAS.A04);
    }
}
