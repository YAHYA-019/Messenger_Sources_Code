package X;

import android.net.Uri;
import android.os.Parcelable;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.google.common.base.Optional;

/* loaded from: J3u.class */
public final class J3u implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayerLogger$logError$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ GPn A02;
    public final /* synthetic */ Hzz A03;
    public final /* synthetic */ 7uY A04;
    public final /* synthetic */ 6Ud A05;
    public final /* synthetic */ 6Uc A06;
    public final /* synthetic */ String A07;

    public J3u(GPn gPn, Hzz hzz, 7uY r304, 6Ud r305, 6Uc r306, String str, int i, int i2) {
        this.A01 = i;
        this.A02 = gPn;
        this.A06 = r306;
        this.A05 = r305;
        this.A03 = hzz;
        this.A00 = i2;
        this.A04 = r304;
        this.A07 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        int i2;
        int i3 = this.A01;
        if (i3 >= 0) {
            GPn gPn = this.A02;
            if (gPn.A0R) {
                gPn.A0A("error");
                6Uc r0 = this.A06;
                6Ud r02 = this.A05;
                Hzz hzz = this.A03;
                long j = this.A00;
                Integer num = gPn.A0p;
                String str = this.A04.A02;
                String str2 = this.A07;
                11T.A0F(num, 5);
                GPn.A06(gPn, new J4I(gPn, hzz, r02, r0, num, str2, (String) null, str, (String) null, i3, 0L, j));
            }
        }
        GPn gPn2 = this.A02;
        gPn2.A0R = false;
        7uY r03 = this.A04;
        String str3 = r03.A02;
        6TN r04 = gPn2.A0E;
        VideoPlayerParams videoPlayerParams = gPn2.A0b;
        String str4 = videoPlayerParams.A0k;
        0fH.A14("FbHeroPlayerLogger", "HeroPlayer error[%s] playerType[%s] videoId[%s]", new Object[]{str3, r04, str4});
        String A0W = 0Pz.A0W("HeroPlayer error:", str3);
        5Kt r05 = gPn2.A0c;
        6TN r06 = gPn2.A0E;
        VideoDataSource videoDataSource = videoPlayerParams.A0V;
        Uri uri = videoDataSource != null ? videoDataSource.A03 : null;
        String str5 = gPn2.A0F.value;
        PlayerOrigin playerOrigin = gPn2.A0G;
        HCJ hcj = r03.A01;
        HCA hca = r03.A00;
        String str6 = r03.A03;
        String A01 = 6V0.A01(gPn2.A0p);
        6Uc r07 = this.A06;
        if (r07 != null) {
            i = r07.A05;
            i2 = r07.A04;
        } else {
            i = 0;
            i2 = 0;
        }
        6Uz r08 = gPn2.A0J;
        6Uz r09 = gPn2.A0I;
        boolean z = this.A05.A0B;
        boolean z2 = gPn2.A0Q;
        String A03 = GPn.A03(gPn2);
        String str7 = this.A07;
        String str8 = gPn2.A0N;
        6Uz r010 = gPn2.A0J;
        String str9 = r010 != null ? r010.codecs : null;
        6Uz r011 = gPn2.A0I;
        String str10 = r011 != null ? r011.codecs : null;
        Parcelable.Creator creator = VideoDataSource.CREATOR;
        6A9 r012 = new 6A9();
        r012.A03 = uri;
        r05.A0b(r06, playerOrigin, new VideoDataSource(r012), videoPlayerParams, r08, r09, Optional.fromNullable(hcj), Optional.fromNullable(hca), (Exception) null, A0W, str4, str5, str6, "heroplayer2", A01, A03, str7, str8, (String) null, str9, str10, i, i2, i3, 0L, -1, z, z2, false, false);
        6TV r013 = gPn2.A0e;
        11T.A09(hcj);
        11T.A09(hca);
        r013.A04(hca, hcj, "FbHeroPlayerLogger", str4, A0W);
        I8K i8k = gPn2.A0H;
        if (i8k != null) {
            i8k.A02(gPn2.A0E, gPn2.A0G, str3, i3);
        }
    }
}
