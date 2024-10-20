package X;

import com.facebook.common.callercontext.CallerContext;

/* loaded from: J1r.class */
public final class J1r implements Runnable {
    public static final String __redex_internal_original_name = "FbFrescoVitoImageSpec$1";
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ 4iF A01;
    public final /* synthetic */ C5cl A02;
    public final /* synthetic */ C5bj A03;

    public J1r(CallerContext callerContext, 4iF r303, C5cl c5cl, C5bj c5bj) {
        this.A02 = c5cl;
        this.A01 = r303;
        this.A00 = callerContext;
        this.A03 = c5bj;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5cl c5cl = this.A02;
        C5bc.A0L(this.A00, this.A01, c5cl, this.A03);
    }
}
