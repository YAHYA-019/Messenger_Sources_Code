package X;

import com.facebook.messaging.montage.viewer.replystatus.MontageViewerReplyStatusView;

/* loaded from: Ir6.class */
public final class Ir6 implements Runnable {
    public static final String __redex_internal_original_name = "MontageViewerReplyStatusView$1";
    public final /* synthetic */ MontageViewerReplyStatusView A00;

    public Ir6(MontageViewerReplyStatusView montageViewerReplyStatusView) {
        this.A00 = montageViewerReplyStatusView;
    }

    @Override // java.lang.Runnable
    public void run() {
        MontageViewerReplyStatusView montageViewerReplyStatusView = this.A00;
        C5ed c5ed = montageViewerReplyStatusView.A00;
        if (c5ed.A0B == 0S2.A0C) {
            c5ed.A04();
        }
        montageViewerReplyStatusView.A09.A07(0.0d);
    }
}
