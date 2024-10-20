package X;

/* loaded from: J2o.class */
public final class J2o implements Runnable {
    public static final String __redex_internal_original_name = "CameraFocusAnimation$AnimationRunnable";
    public float A00;
    public float A01;
    public final C66i A02;
    public final Runnable A03 = new Iql(this);
    public final /* synthetic */ HzL A04;

    public J2o(HzL hzL) {
        this.A04 = hzL;
        C66i A0W = AbstractC2326GOr.A0W(hzL.A02);
        A0W.A09(HzL.A05);
        A0W.A06 = true;
        this.A02 = A0W;
        A0W.A0A(new H05(this));
    }

    @Override // java.lang.Runnable
    public void run() {
        2Wo r0 = this.A04.A04;
        r0.A01().setX(this.A00 - (r0.A01().getWidth() / 2));
        r0.A01().setY(this.A01 - (r0.A01().getHeight() / 2));
        C66i c66i = this.A02;
        c66i.A06(0.0d);
        c66i.A04();
    }
}
