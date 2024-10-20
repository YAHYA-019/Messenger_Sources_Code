package X;

import com.facebook.quicksilver.webviewservice.QuicksilverWebviewService;

/* loaded from: Fq4.class */
public final class Fq4 implements GGI {
    public final int A00;
    public final Object A01;

    public Fq4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onFailure(Throwable th) {
        FIT A00;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A00 = F9N.A00((DZW) this.A01);
                if (A00 != null) {
                    str = "native_templates_error";
                    str2 = "Error rendering NT Player Invite Dialog";
                    A00.A0I(str, str2, th);
                    return;
                }
                return;
            case 1:
                A00 = F9N.A00((DZW) this.A01);
                if (A00 != null) {
                    str = "native_templates_error";
                    str2 = "Error rendering NT GS Share Dialog";
                    A00.A0I(str, str2, th);
                    return;
                }
                return;
            case 2:
            case 3:
            default:
                A00 = F9N.A00((DZW) this.A01);
                if (A00 != null) {
                    str = "native_templates_error";
                    str2 = "Error rendering NT Community Hud Dialog";
                    A00.A0I(str, str2, th);
                    return;
                }
                return;
            case 4:
                A00 = F9N.A00(((Fpy) this.A01).A00);
                if (A00 != null) {
                    str = "native_templates_error";
                    str2 = "Error rendering NT Context Choose Dialog";
                    A00.A0I(str, str2, th);
                    return;
                }
                return;
            case 5:
                A00 = F9N.A00(((Fpy) this.A01).A00);
                if (A00 != null) {
                    str = "native_templates_error";
                    str2 = "Error rendering NT Context Switch Dialog";
                    A00.A0I(str, str2, th);
                    return;
                }
                return;
            case 6:
                A00 = F9N.A00(((Fpy) this.A01).A00);
                if (A00 != null) {
                    str = "native_templates_error";
                    str2 = "Error rendering NT Context Create Dialog";
                    A00.A0I(str, str2, th);
                    return;
                }
                return;
            case 7:
                A00 = F9N.A00(((Fpy) this.A01).A00);
                if (A00 != null) {
                    str = "native_templates_error";
                    str2 = "Error rendering NT Game Switch Dialog";
                    A00.A0I(str, str2, th);
                    return;
                }
                return;
            case 8:
                QuicksilverWebviewService quicksilverWebviewService = (QuicksilverWebviewService) this.A01;
                F9N f9n = quicksilverWebviewService.A0f;
                if (f9n != null) {
                    f9n.A01();
                    FI3.A03(DKG.A0r(quicksilverWebviewService).A06);
                }
                quicksilverWebviewService.A0n = null;
                quicksilverWebviewService.A0m = null;
                A00 = DKG.A0q(quicksilverWebviewService);
                str = "native_templates_error";
                str2 = "Error rendering NT Dialog";
                A00.A0I(str, str2, th);
                return;
        }
    }
}
