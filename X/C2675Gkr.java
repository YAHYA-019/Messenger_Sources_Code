package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.engine.api.VideoPlayerParams;

/* renamed from: X.Gkr, reason: case insensitive filesystem */
/* loaded from: Gkr.class */
public final class C2675Gkr extends 1LH {
    public final GjW A00;
    public final String A01;

    public C2675Gkr(GjW gjW, String str) {
        1BL.A1F(str, gjW);
        this.A01 = str;
        this.A00 = gjW;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        6A9 r0 = new 6A9();
        r0.A04 = 6AB.A05;
        GjW gjW = this.A00;
        r0.A07 = gjW.A05;
        String str = gjW.A04;
        if (str != null) {
            Uri uri = null;
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
            }
            r0.A03 = uri;
        }
        6TA r02 = new 6TA();
        r02.A03(this.A01);
        r02.A0L = (int) gjW.A02;
        r02.A1k = true;
        r02.A1h = true;
        r02.A0k = true;
        r02.A0U = new VideoDataSource(r0);
        1Iw r03 = c2k5.A05;
        FbUserSession A01 = 1Fw.A01(r03.A0D);
        6TF r04 = new 6TF();
        r04.A03 = new VideoPlayerParams(r02);
        r04.A01 = A01;
        GR2 gr2 = new GR2();
        gr2.A07 = true;
        GR6 A00 = GR5.A00(r03);
        A00.A2a(gr2);
        A00.A2c(true);
        A00.A2Y(6TN.A09);
        A00.A2Z((PlayerOrigin) gjW.A03);
        A00.A01.A0R = true;
        A00.A2b(r04.A01());
        A00.A2X(gjW.A00);
        return A00.A2W();
    }
}
