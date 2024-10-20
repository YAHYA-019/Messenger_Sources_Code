package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: J3k.class */
public final /* synthetic */ class J3k implements Runnable {
    public static final String __redex_internal_original_name = "MontageComposerController$CanvasListener$$ExternalSyntheticLambda2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Uri A03;
    public final /* synthetic */ C2608Gix A04;
    public final /* synthetic */ I9K A05;
    public final /* synthetic */ C5eq A06;

    public /* synthetic */ J3k(Uri uri, C2608Gix c2608Gix, I9K i9k, C5eq c5eq, int i, int i2, int i3) {
        this.A05 = i9k;
        this.A03 = uri;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A06 = c5eq;
        this.A04 = c2608Gix;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9K i9k = this.A05;
        Uri uri = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        C5eq c5eq = this.A06;
        C2608Gix c2608Gix = this.A04;
        IQ1 iq1 = i9k.A00;
        CallerContext callerContext = IQ1.A1m;
        iq1.A1Q.CTn(uri, c2608Gix, c5eq, i, i2, i3);
    }
}
