package X;

import android.view.View;
import android.view.WindowManager;
import com.facebook.quicksilver.webviewprocess.QuicksilverWebViewActivity;
import com.facebook.quicksilver.webviewservice.QuicksilverWebviewService;
import java.lang.ref.WeakReference;

/* loaded from: Few.class */
public final class Few implements GEl {
    public final int A00;
    public final Object A01;

    public Few(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.GEl
    public void BuB() {
        Eyq eyq;
        WeakReference weakReference;
        WindowManager windowManager;
        switch (this.A00) {
            case 0:
                EzQ ezQ = (EzQ) this.A01;
                if (ezQ.A06 && (weakReference = ezQ.A04) != null && weakReference.get() != null && (windowManager = ezQ.A08) != null) {
                    ezQ.A06 = false;
                    View A0G = DKC.A0G(weakReference);
                    if (A0G.isShown()) {
                        A0G.setVisibility(8);
                        try {
                            windowManager.removeView(A0G);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                GEl gEl = ezQ.A01;
                if (gEl != null) {
                    gEl.BuB();
                    return;
                }
                return;
            case 1:
                eyq = (Eyq) this.A01;
                eyq.A00();
                return;
            case 2:
                QuicksilverWebviewService quicksilverWebviewService = ((E8O) this.A01).A00;
                if (quicksilverWebviewService != null) {
                    quicksilverWebviewService.A0B(null, EOz.A08);
                    return;
                }
                return;
            default:
                eyq = ((QuicksilverWebViewActivity) this.A01).A03;
                if (eyq == null) {
                    return;
                }
                eyq.A00();
                return;
        }
    }
}
