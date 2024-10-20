package X;

/* loaded from: J14.class */
public final class J14 implements Runnable {
    public static final String __redex_internal_original_name = "RtcCircularEffectViewHolder$setData$1$1";
    public final /* synthetic */ double A00;
    public final /* synthetic */ HAR A01;
    public final /* synthetic */ GXq A02;

    public J14(HAR har, GXq gXq, double d) {
        this.A02 = gXq;
        this.A01 = har;
        this.A00 = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A0A(this.A01, this.A00);
    }
}
