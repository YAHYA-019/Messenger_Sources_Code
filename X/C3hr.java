package X;

import com.facebook.auth.viewercontext.ViewerContext;

/* renamed from: X.3hr, reason: invalid class name */
/* loaded from: 3hr.class */
public final /* synthetic */ class C3hr implements Runnable {
    public static final String __redex_internal_original_name = "MessengerMsysBootstrap$$ExternalSyntheticLambda9";
    public final /* synthetic */ ViewerContext A00;
    public final /* synthetic */ 1MZ A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C3hr(ViewerContext viewerContext, 1MZ r303, boolean z) {
        this.A01 = r303;
        this.A02 = z;
        this.A00 = viewerContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        1MZ r0 = this.A01;
        boolean z = this.A02;
        ViewerContext viewerContext = this.A00;
        if (!z) {
            r0.A0C.A01();
        }
        1MZ.A01(viewerContext, r0);
    }
}
