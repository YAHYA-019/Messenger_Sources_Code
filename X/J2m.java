package X;

import com.facebook.common.callercontext.CallerContext;

/* loaded from: J2m.class */
public final /* synthetic */ class J2m implements Runnable {
    public static final String __redex_internal_original_name = "MontageComposerController$CanvasListener$$ExternalSyntheticLambda0";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 2EU A01;
    public final /* synthetic */ C2608Gix A02;
    public final /* synthetic */ I9K A03;
    public final /* synthetic */ C5eq A04;

    public /* synthetic */ J2m(2EU r302, C2608Gix c2608Gix, I9K i9k, C5eq c5eq, int i) {
        this.A03 = i9k;
        this.A01 = r302;
        this.A04 = c5eq;
        this.A00 = i;
        this.A02 = c2608Gix;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9K i9k = this.A03;
        2EU r0 = this.A01;
        C5eq c5eq = this.A04;
        int i = this.A00;
        C2608Gix c2608Gix = this.A02;
        IQ1 iq1 = i9k.A00;
        CallerContext callerContext = IQ1.A1m;
        iq1.A1Q.CBT(r0, c2608Gix, c5eq, 3, i);
    }
}
