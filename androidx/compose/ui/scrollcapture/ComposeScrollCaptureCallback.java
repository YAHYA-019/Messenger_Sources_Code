package androidx.compose.ui.scrollcapture;

import X.2aG;
import X.2aI;
import X.2aK;
import X.3kB;
import X.7zU;
import X.C2aj;
import X.L4J;
import X.LBT;
import X.LG1;
import X.LOG;
import X.M6m;
import X.MEU;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* loaded from: ComposeScrollCaptureCallback.class */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public final RelativeScroller A00;
    public final LBT A01;
    public final MEU A02;
    public final L4J A03;
    public final 2aI A04;

    public ComposeScrollCaptureCallback(MEU meu, LBT lbt, L4J l4j, 2aI r305) {
        this.A01 = lbt;
        this.A03 = l4j;
        this.A02 = meu;
        this.A04 = 2aG.A03(LOG.A00, r305);
        this.A00 = new RelativeScroller(new ComposeScrollCaptureCallback$scrollTracker$1(this, null), l4j.A00 - l4j.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d6, code lost:
    
        if (r323 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object A03(android.view.ScrollCaptureSession r301, androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback r302, X.L4J r303, X.0DR r304) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.A03(android.view.ScrollCaptureSession, androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback, X.L4J, X.0DR):java.lang.Object");
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureEnd(Runnable runnable) {
        2aK.A03((Integer) null, 3kB.A00, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, null), this.A04, 2);
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C2aj A04 = 2aK.A04(new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(rect, scrollCaptureSession, this, consumer, null), this.A04);
        A04.BQH(M6m.A00(cancellationSignal, 34));
        cancellationSignal.setOnCancelListener(new LG1(A04));
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        L4J l4j = this.A03;
        consumer.accept(new Rect(l4j.A01, l4j.A03, l4j.A02, l4j.A00));
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.A00.A00 = 0.0f;
        7zU.A13(this.A02.A00, true);
        runnable.run();
    }
}
