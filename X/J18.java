package X;

/* loaded from: J18.class */
public final class J18 implements Runnable {
    public static final String __redex_internal_original_name = "RtcExpressionCircularEffectsAdapter$remoteEffectSharedStateListener$1$onPeerEffectChanged$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ IML A01;
    public final /* synthetic */ GWo A02;

    public J18(IML iml, GWo gWo, long j) {
        this.A01 = iml;
        this.A00 = j;
        this.A02 = gWo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A08(this.A01.A0A(Long.valueOf(this.A00)));
    }
}
