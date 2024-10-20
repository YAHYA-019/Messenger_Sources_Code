package X;

import com.facebook.video.exoserviceclient.FbVpsController;

/* loaded from: Ito.class */
public final class Ito implements Runnable {
    public static final String __redex_internal_original_name = "FbVpsController$1$onAppLeftForeground$1";
    public final /* synthetic */ FbVpsController A00;

    public Ito(FbVpsController fbVpsController) {
        this.A00 = fbVpsController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FbVpsController fbVpsController = this.A00;
        if (GOp.A1a(fbVpsController.A0K)) {
            I81.A08.A01(fbVpsController.A01);
        }
    }
}
