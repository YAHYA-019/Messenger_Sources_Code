package X;

import android.content.Context;
import com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;
import java.io.IOException;

/* loaded from: GtU.class */
public final class GtU extends C1iw {
    public static final String __redex_internal_original_name = "DefaultMediaTranscoder$6";
    public final /* synthetic */ long A00;
    public final /* synthetic */ VideoSizeEstimatorCompletionCallback A01;
    public final /* synthetic */ DefaultMediaTranscoder A02;
    public final /* synthetic */ Double A03;
    public final /* synthetic */ Double A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GtU(VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, Double d, Double d2, String str, long j) {
        super("estimateVideoSize");
        this.A02 = defaultMediaTranscoder;
        this.A00 = j;
        this.A05 = str;
        this.A04 = d;
        this.A03 = d2;
        this.A01 = videoSizeEstimatorCompletionCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        Hqj A01;
        try {
            0fH.A0g(Long.valueOf(this.A00), "DefaultMediaTranscoder", "Target max resolution: %s");
            String str = this.A05;
            DefaultMediaTranscoder defaultMediaTranscoder = this.A02;
            HFF hff = defaultMediaTranscoder.A05;
            HfH hfH = new HfH(hff.A02, hff.A00, hff.A01);
            Context context = defaultMediaTranscoder.A00;
            Double d = this.A04;
            Double d2 = this.A03;
            4YV.A1N(str, context);
            try {
                A01 = IFS.A01(context, I6J.A02(str), false);
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                e = e;
                0fH.A0r("VideoEstimator", "transcodeVideo: Error with source Uri", e);
            }
            if (A01 != null) {
                this.A01.success(I6J.A00(A01, hfH, d, d2));
            } else {
                e = AnonymousClass001.A0G("Extract media metadata is null");
                0fH.A0r("VideoEstimator", "estimateVideoSize: input video file not found", e);
                throw e;
            }
        } catch (IOException | IllegalArgumentException | SecurityException e2) {
            this.A01.failure(this.A00, e2);
        }
    }
}
