package X;

import com.facebook.scaledtextureview.ScaledTextureView;

/* loaded from: Ivj.class */
public final class Ivj implements Runnable {
    public static final String __redex_internal_original_name = "LiteCameraViewCoordinator457$setPreviewView$1";
    public final /* synthetic */ IRK A00;
    public final /* synthetic */ HqE A01;

    public Ivj(IRK irk, HqE hqE) {
        this.A00 = irk;
        this.A01 = hqE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScaledTextureView scaledTextureView;
        JQ1 jq1 = (JQ1) JOX.A01(JQ1.A00, IRK.A00(this.A00));
        HqE hqE = this.A01;
        if (hqE == null) {
            0fH.A0j("LiteCameraViewCoordinator457", "setPreviewView: null");
            scaledTextureView = null;
        } else {
            scaledTextureView = hqE.A05;
            if (scaledTextureView == null) {
                return;
            } else {
                0fH.A0g(scaledTextureView, "LiteCameraViewCoordinator457", "setPreviewView: %s");
            }
        }
        jq1.CtI(scaledTextureView);
    }
}
