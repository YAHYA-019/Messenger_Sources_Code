package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;

/* loaded from: J49.class */
public final class J49 implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayerLogger$logCancelledEvent$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ GPn A02;
    public final /* synthetic */ 6Ud A03;
    public final /* synthetic */ 6Uc A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public J49(GPn gPn, 6Ud r303, 6Uc r304, String str, String str2, String str3, String str4, int i, long j) {
        this.A02 = gPn;
        this.A04 = r304;
        this.A08 = str;
        this.A00 = i;
        this.A06 = str2;
        this.A07 = str3;
        this.A05 = str4;
        this.A03 = r303;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        GPn gPn = this.A02;
        gPn.A0R = false;
        6UX r0 = gPn.A0Y;
        r0.A03();
        String A03 = GPn.A03(gPn);
        if (A03 == null) {
            A03 = "";
        }
        VideoPlayerParams videoPlayerParams = gPn.A0b;
        String str = videoPlayerParams.A0k;
        if (str == null) {
            str = "";
        }
        GPn.A07(gPn, "CANCELLED: playerId %s may end stall for vid %s , current %.2fs stall time, total %d stalls", new Object[]{A03, str, Float.valueOf(r0.A00().A02), Integer.valueOf(r0.A00().A04)});
        5Kt r02 = gPn.A0c;
        C03353xs c03353xs = videoPlayerParams.A0Y;
        6TN r03 = gPn.A0E;
        String A01 = 6V0.A01(gPn.A0p);
        String str2 = gPn.A0o.value;
        6Uc r04 = this.A04;
        int A00 = (int) r04.A00();
        String str3 = 6AB.A05.value;
        String str4 = this.A08;
        PlayerOrigin playerOrigin = gPn.A0G;
        String str5 = gPn.A0F.value;
        7sB A002 = r0.A00();
        int i = this.A00;
        String A04 = GPn.A04(gPn);
        int i2 = videoPlayerParams.A0M;
        GPm gPm = gPn.A0d;
        11T.A0D(gPm);
        boolean z = gPm.A0B;
        I8K i8k = gPn.A0H;
        6TS r336 = i8k != null ? i8k.A02 : null;
        String str6 = this.A06;
        String str7 = this.A07;
        String str8 = this.A05;
        boolean z2 = gPn.A0Q;
        String A02 = GPn.A02(gPn);
        String str9 = gPn.A0N;
        int A08 = gPm.A07.A08();
        long j = -1;
        r02.A0Z(A002, r03, playerOrigin, r336, videoPlayerParams, c03353xs, A01, str2, str3, str, str4, str5, "heroplayer2", A04, str6, str7, str8, A02, str9, 4YU.A14(gPm), A00, i, i2, A08, 0L, j, z, z2, false, false);
        5TF r05 = gPn.A0a;
        String A032 = GPn.A03(gPn);
        if (A032 == null) {
            A032 = "";
        }
        r05.A08(r0, gPn.A0E, gPn.A0o, gPn.A0G, gPn.A0p, str, A032, str6, str7, str4, 0L, j, videoPlayerParams.A1N);
        gPn.A08(r0, this.A03, r04, (String) null, this.A01, true);
        if (i8k != null) {
            I8K.A01(gPn.A0E, gPn.A0G, i8k, "live_video_cancelled", I8K.A00((int) r04.A00(), 0, 0), (java.util.Map) null);
        }
        r0.A02();
    }
}
