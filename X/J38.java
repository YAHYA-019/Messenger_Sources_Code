package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;
import java.util.List;

/* loaded from: J38.class */
public final class J38 implements Runnable {
    public static final String __redex_internal_original_name = "FbHeroPlayerLogger$logPlaybackSpeedChanged$1";
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ GPn A02;
    public final /* synthetic */ 6dG A03;
    public final /* synthetic */ 6Uc A04;

    public J38(GPn gPn, 6dG r303, 6Uc r304, float f, int i) {
        this.A02 = gPn;
        this.A00 = f;
        this.A01 = i;
        this.A03 = r303;
        this.A04 = r304;
    }

    @Override // java.lang.Runnable
    public void run() {
        GPm gPm;
        GPn gPn = this.A02;
        5Kt r0 = gPn.A0c;
        if (!r0.A0j || (gPm = gPn.A0d) == null) {
            return;
        }
        float f = this.A00;
        int i = this.A01;
        6dG r02 = this.A03;
        6Uc r03 = this.A04;
        List A0G = gPm.A07.A0G();
        if (A0G == null) {
            A0G = C0ty.A00;
        }
        VideoPlayerParams videoPlayerParams = gPn.A0b;
        6TN r04 = gPn.A0E;
        String str = videoPlayerParams.A0k;
        long j = i;
        String A01 = 6V0.A01(gPn.A0p);
        int i2 = gPn.A0m;
        PlayerOrigin playerOrigin = gPn.A0G;
        String str2 = gPn.A0F.value;
        boolean z = gPn.A0Q;
        if (r02 != null) {
            r02.A02();
            r02.A01();
        }
        boolean z2 = gPn.A0S;
        boolean z3 = gPn.A0P;
        6Uz r05 = gPn.A0J;
        6Uz r06 = gPn.A0I;
        int i3 = r03.A05;
        int i4 = r03.A04;
        int A08 = gPm.A07.A08();
        6UZ r07 = gPm.A07;
        r0.A0d(r04, playerOrigin, videoPlayerParams, r05, r06, str, "heroplayer2", A01, str2, r07.A0U() ? GOo.A0h(r07).A0a : null, A0G, f, i2, i3, i4, A08, j, z, z2, z3);
    }
}
