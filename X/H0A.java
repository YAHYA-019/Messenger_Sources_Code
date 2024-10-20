package X;

import com.facebook.messaging.montage.viewer.replystatus.MontageViewerReplyStatusView;

/* loaded from: H0A.class */
public final class H0A extends C66m {
    public final /* synthetic */ MontageViewerReplyStatusView A00;

    public H0A(MontageViewerReplyStatusView montageViewerReplyStatusView) {
        this.A00 = montageViewerReplyStatusView;
    }

    @Override // X.C66m, X.C66n
    public void CMP(C66i c66i) {
        if (c66i.A01 != 0.0d) {
            this.A00.setVisibility(0);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        if (c66i.A01 == 0.0d) {
            this.A00.setVisibility(8);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float f = (float) c66i.A09.A00;
        MontageViewerReplyStatusView montageViewerReplyStatusView = this.A00;
        int i = -(montageViewerReplyStatusView.A04 + montageViewerReplyStatusView.getPaddingTop() + montageViewerReplyStatusView.getPaddingBottom());
        montageViewerReplyStatusView.setTranslationY(GOn.A03(i, 1.0f - f));
    }
}
