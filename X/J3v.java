package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;

/* loaded from: J3v.class */
public final class J3v implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayerLogger$logStartBuffering$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ GPn A02;
    public final /* synthetic */ 6Ud A03;
    public final /* synthetic */ 6Uc A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public J3v(GPn gPn, 6Ud r303, 6Uc r304, String str, int i, long j, boolean z, boolean z2) {
        this.A02 = gPn;
        this.A00 = i;
        this.A06 = z;
        this.A03 = r303;
        this.A04 = r304;
        this.A07 = z2;
        this.A01 = j;
        this.A05 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i;
        String str2;
        GPn gPn = this.A02;
        gPn.A04 = gPn.A0W.now();
        String A03 = GPn.A03(gPn);
        11T.A0D(A03);
        VideoPlayerParams videoPlayerParams = gPn.A0b;
        str = "";
        String str3 = videoPlayerParams.A0k;
        if (str3 == null) {
            str3 = str;
        }
        GPn.A07(gPn, "START_BUFFERING: playerId %s for vid %s", new Object[]{A03, str3});
        5TF r0 = gPn.A0a;
        String A032 = GPn.A03(gPn);
        11T.A0D(A032);
        PlayerOrigin playerOrigin = gPn.A0G;
        6TN r02 = gPn.A0E;
        Integer num = gPn.A0p;
        int i2 = this.A00;
        boolean z = videoPlayerParams.A1N;
        6Uz r03 = gPn.A0J;
        if (r03 != null) {
            i = r03.bitrate;
            str2 = r03.codecs;
        } else {
            i = gPn.A03;
            str2 = null;
        }
        String A0z = GOo.A0z(r03);
        String A0z2 = GOo.A0z(gPn.A0I);
        float A00 = GPn.A00(gPn);
        boolean z2 = this.A06;
        C52j c52j = z2 ? C52j.A2E : C52j.A2Y;
        GPm gPm = gPn.A0d;
        11T.A0D(gPm);
        String A0A = gPm.A0A();
        6Ud r04 = this.A03;
        int i3 = r04.A00;
        long j = -1;
        r0.A0A(r02, c52j, playerOrigin, num, str3, A032, str2, A0z, A0z2, A0A, A00, i2, i, i3, 0L, j, z);
        if (4qV.A00(gPn.A0X).AZk(36326408190055996L)) {
            5Kt r05 = gPn.A0c;
            6TN r06 = gPn.A0E;
            String A01 = 6V0.A01(gPn.A0p);
            6Uz r07 = gPn.A0J;
            6Uz r08 = gPn.A0I;
            int i4 = gPn.A02;
            6Uc r09 = this.A04;
            long j2 = r09.A08;
            int i5 = gPn.A0m;
            PlayerOrigin playerOrigin2 = gPn.A0G;
            String str4 = gPn.A0F.value;
            String str5 = 6AB.A05.value;
            String A04 = GPn.A04(gPn);
            boolean z3 = gPn.A0S;
            boolean z4 = gPn.A0P;
            long j3 = r04.A02;
            long j4 = r04.A06;
            long j5 = i3;
            long j6 = r04.A01;
            boolean z5 = this.A07;
            boolean z6 = gPm.A0B;
            long j7 = r09.A0K;
            long j8 = r09.A0A;
            float A002 = GPn.A00(gPn);
            gPn.A0C = r05.A0U(r06, playerOrigin2, videoPlayerParams, r07, r08, A01, str3, str4, str5, A04, gPn.A0L, z2 ? C52j.A2E.value : "", this.A05, gPm.A0A(), A002, i4, i5, j2, j3, j4, j5, j6, j7, j8, j, this.A01, z3, z4, z5, z6, true, gPn.A0Q);
        }
        I8K i8k = gPn.A0H;
        if (i8k != null) {
            I8K.A01(gPn.A0E, gPn.A0G, i8k, "live_video_start_buffering", I8K.A00(i2, 0, 0), (java.util.Map) null);
        }
    }
}
