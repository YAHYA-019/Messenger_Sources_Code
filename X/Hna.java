package X;

import android.view.View;
import com.facebook.messaging.montage.viewer.reaction.MontageViewerReactionsOverlayView;
import java.util.LinkedList;

/* loaded from: Hna.class */
public final class Hna {
    public final LinkedList A00 = AbF.A1F();
    public final /* synthetic */ MontageViewerReactionsOverlayView A01;

    public Hna(MontageViewerReactionsOverlayView montageViewerReactionsOverlayView) {
        this.A01 = montageViewerReactionsOverlayView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A00(JD2 jd2) {
        GVW gvw = (GVW) jd2;
        gvw.A00 = null;
        6ON r0 = (6ON) gvw.A02.getValue();
        if (r0 != null) {
            r0.Ce1();
            if (r0.isPlaying()) {
                r0.stop();
            }
        }
        ((View) jd2).setVisibility(8);
        this.A00.add(jd2);
    }
}
