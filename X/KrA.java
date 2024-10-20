package X;

import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: KrA.class */
public final class KrA {
    public WebViewProviderBoundaryInterface A00;

    public KrA(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.A00 = webViewProviderBoundaryInterface;
    }

    public void A00() {
        this.A00.removeWebMessageListener(DKB.A00(390));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Lwe] */
    public void A01(MEd mEd, String str, String[] strArr) {
        WebViewProviderBoundaryInterface webViewProviderBoundaryInterface = this.A00;
        ?? obj = new Object();
        obj.A00 = mEd;
        webViewProviderBoundaryInterface.addWebMessageListener(str, strArr, new Lrn(obj));
    }
}
