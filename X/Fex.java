package X;

import com.facebook.quicksilver.webviewprocess.QuicksilverWebViewActivity;
import com.facebook.quicksilver.webviewservice.QuicksilverWebviewService;

/* loaded from: Fex.class */
public final class Fex implements GEm {
    public final int A00;
    public final Object A01;

    public Fex(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.GEm
    public void CLP() {
        Eyq eyq;
        switch (this.A00) {
            case 0:
                GEm gEm = ((EzQ) this.A01).A02;
                if (gEm != null) {
                    gEm.CLP();
                    return;
                }
                return;
            case 1:
                eyq = (Eyq) this.A01;
                eyq.A02();
                return;
            case 2:
                QuicksilverWebviewService quicksilverWebviewService = ((E8O) this.A01).A00;
                if (quicksilverWebviewService != null) {
                    quicksilverWebviewService.A0B(null, EOz.A0A);
                    return;
                }
                return;
            default:
                eyq = ((QuicksilverWebViewActivity) this.A01).A03;
                if (eyq == null) {
                    return;
                }
                eyq.A02();
                return;
        }
    }
}
