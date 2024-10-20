package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.inject.FbInjector;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: Hsb.class */
public final class Hsb {
    public 1BY A00;
    public final 1ED A06 = (1ED) 1Bi.A03(16431);
    public final 5Hf A04 = (5Hf) 1Bi.A03(115303);
    public final 5HX A02 = (5HX) 1Bn.A0B(49643);
    public final I77 A03 = (I77) 1Bi.A03(116175);
    public final C00i A01 = 1BQ.A02(116150);
    public final C00i A05 = FbInjector.A00;

    public Hsb(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public long A00(MediaResource mediaResource) {
        try {
            HYr hYr = (HYr) J5V.A01(this.A06, mediaResource, this, 7).get(300L, TimeUnit.MILLISECONDS);
            return hYr == null ? -1 : hYr.A00;
        } catch (InterruptedException e) {
            0fH.A0H(Hsb.class, "Timed out.", e);
            return -2;
        } catch (Exception e2) {
            0fH.A0H(Hsb.class, "Cannot estimate num bytes in Media.", e2);
            return -3;
        }
    }

    public long A01(MediaResource mediaResource) {
        this.A01.get();
        HfH A00 = HvQ.A00();
        try {
            Uri uri = mediaResource.A0E;
            Context A04 = 1BK.A04(this.A05);
            Double valueOf = Double.valueOf(mediaResource.A02 / 1000.0d);
            Double valueOf2 = Double.valueOf(mediaResource.A01 / 1000.0d);
            11T.A0G(uri, 0, A04);
            Hqj A01 = IFS.A01(A04, uri, false);
            if (A01 != null) {
                return I6J.A00(A01, A00, valueOf, valueOf2);
            }
            IOException A0G = AnonymousClass001.A0G("Extract media metadata is null");
            0fH.A0r("VideoEstimator", "estimateVideoSize: input video file not found", A0G);
            throw A0G;
        } catch (IOException e) {
            0fH.A0H(Hsb.class, "Cannot estimate num bytes in Media.", e);
            return -3;
        }
    }
}
