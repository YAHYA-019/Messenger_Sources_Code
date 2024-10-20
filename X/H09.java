package X;

import android.widget.ProgressBar;
import com.facebook.fbui.widget.glyph.GlyphButton;
import com.facebook.messaging.montage.viewer.replystatus.MontageViewerReplyStatusView;

/* loaded from: H09.class */
public final class H09 extends C66m {
    public final /* synthetic */ MontageViewerReplyStatusView A00;

    public H09(MontageViewerReplyStatusView montageViewerReplyStatusView) {
        this.A00 = montageViewerReplyStatusView;
    }

    @Override // X.C66m, X.C66n
    public void CMP(C66i c66i) {
        boolean A1N = AnonymousClass001.A1N((c66i.A01 > 0.0d ? 1 : (c66i.A01 == 0.0d ? 0 : -1)));
        MontageViewerReplyStatusView montageViewerReplyStatusView = this.A00;
        (A1N ? montageViewerReplyStatusView.A07 : montageViewerReplyStatusView.A05).setVisibility(0);
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        boolean A1N = AnonymousClass001.A1N((c66i.A01 > 0.0d ? 1 : (c66i.A01 == 0.0d ? 0 : -1)));
        MontageViewerReplyStatusView montageViewerReplyStatusView = this.A00;
        (A1N ? montageViewerReplyStatusView.A05 : montageViewerReplyStatusView.A07).setVisibility(8);
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float f = 1.0f;
        float f2 = 0.0f;
        if (AnonymousClass001.A1N((c66i.A01 > 0.0d ? 1 : (c66i.A01 == 0.0d ? 0 : -1)))) {
            f2 = 1.0f;
        }
        MontageViewerReplyStatusView montageViewerReplyStatusView = this.A00;
        GlyphButton glyphButton = montageViewerReplyStatusView.A07;
        glyphButton.setScaleX(f2);
        glyphButton.setScaleY(f2);
        if (c66i.A01 != 0.0d) {
            f = 0.0f;
        }
        ProgressBar progressBar = montageViewerReplyStatusView.A05;
        progressBar.setScaleX(f);
        progressBar.setScaleY(f);
    }
}
