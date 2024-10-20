package X;

import com.facebook.quicksilver.webviewservice.QuicksilverWebviewService;

/* loaded from: Fpa.class */
public final class Fpa implements GIU {
    public final /* synthetic */ QuicksilverWebviewService A00;

    public Fpa(QuicksilverWebviewService quicksilverWebviewService) {
        this.A00 = quicksilverWebviewService;
    }

    public void CIV() {
        Ezv ezv = this.A00.A0X;
        if (ezv != null) {
            ezv.A04();
        }
    }

    public void CIW() {
        QuicksilverWebviewService quicksilverWebviewService = this.A00;
        DKG.A0r(quicksilverWebviewService).A05();
        DKG.A0q(quicksilverWebviewService).A0G("webview_service_start_fail", "SDK info fetching failed");
        quicksilverWebviewService.stopSelf();
    }
}
