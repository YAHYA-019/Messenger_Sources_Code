package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;

/* loaded from: J37.class */
public final class J37 implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayerLogger$logEndBuffering$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ GPn A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public J37(GPn gPn, int i, long j, boolean z, boolean z2) {
        this.A02 = gPn;
        this.A00 = i;
        this.A01 = j;
        this.A03 = z;
        this.A04 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        String str;
        GPn gPn = this.A02;
        long now = gPn.A0W.now();
        String A03 = GPn.A03(gPn);
        11T.A0D(A03);
        VideoPlayerParams videoPlayerParams = gPn.A0b;
        String str2 = videoPlayerParams.A0k;
        if (str2 == null) {
            str2 = "";
        }
        GPn.A07(gPn, "STOP_BUFFERING: playerId %s for vid %s", new Object[]{A03, str2});
        long j = gPn.A06;
        long j2 = -1;
        if (j == j2) {
            gPn.A06 = this.A00;
            gPn.A07 = gPn.A04;
            gPn.A05 = now;
        }
        int i2 = this.A00;
        gPn.A09 = i2;
        gPn.A0A = gPn.A04;
        gPn.A08 = now;
        gPn.A04 = j2;
        5TF r0 = gPn.A0a;
        String A032 = GPn.A03(gPn);
        11T.A0D(A032);
        PlayerOrigin playerOrigin = gPn.A0G;
        6TN r02 = gPn.A0E;
        Integer num = gPn.A0p;
        boolean z = videoPlayerParams.A1N;
        6Uz r03 = gPn.A0J;
        if (r03 != null) {
            i = r03.bitrate;
            str = r03.codecs;
        } else {
            i = gPn.A03;
            str = null;
        }
        String A0z = GOo.A0z(r03);
        String A0z2 = GOo.A0z(gPn.A0I);
        float A00 = GPn.A00(gPn);
        GPm gPm = gPn.A0d;
        11T.A0D(gPm);
        r0.A0C(r02, playerOrigin, num, str2, A032, str, A0z, A0z2, gPm.A0A(), A00, i2, i, 0L, j2, z);
        2R2 r04 = gPn.A0C;
        if (r04 != null) {
            I07.A00(r04, this.A01, this.A03, this.A04);
            gPn.A0C = null;
        }
        I8K i8k = gPn.A0H;
        if (i8k != null) {
            I8K.A01(gPn.A0E, gPn.A0G, i8k, "live_video_end_buffering", I8K.A00(i2, 1, (int) this.A01), (java.util.Map) null);
        }
    }
}
