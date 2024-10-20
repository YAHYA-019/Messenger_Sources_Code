package X;

import com.facebook.common.callercontext.CallerContext;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* loaded from: J3j.class */
public final class J3j implements Runnable {
    public static final String __redex_internal_original_name = "VideoSegmentTranscodeUploadOperation$2";
    public final /* synthetic */ long A00;
    public final /* synthetic */ HFM A01;
    public final /* synthetic */ IPx A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ CountDownLatch A06;

    public J3j(HFM hfm, IPx iPx, File file, Integer num, String str, CountDownLatch countDownLatch, long j) {
        this.A02 = iPx;
        this.A04 = num;
        this.A03 = file;
        this.A00 = j;
        this.A05 = str;
        this.A01 = hfm;
        this.A06 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            IPx iPx = this.A02;
            CallerContext callerContext = IPx.A0T;
            try {
                C09694qx c09694qx = (C09694qx) iPx.A09.get();
                Roq roq = iPx.A0O;
                String str = iPx.A04;
                ((1Rl) c09694qx.A01.get()).A06(IPx.A0T, roq, (C04033zm) null, new RNj(this.A03, this.A04, str, this.A05, this.A00));
                this.A01.A04 = true;
            } catch (Exception e) {
                0fH.A0N(IPx.class, "Upload failed at transfer stage with sessionId %s and streamId %s", e, new Object[]{iPx.A03, iPx.A04});
            }
        } finally {
            this.A06.countDown();
        }
    }
}
