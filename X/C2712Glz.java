package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.model.GraphQLMedia;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.engine.api.VideoPlayerParams;
import java.util.List;

/* renamed from: X.Glz, reason: case insensitive filesystem */
/* loaded from: Glz.class */
public final class C2712Glz extends 2Yv {
    public 1gM A00;
    public HFL A01;
    public GRS A02;
    public HkR A03;
    public GRD A04;
    public List A05;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        if (c2l4.A00 == 0) {
            GRD grd = this.A04;
            HFL hfl = (HFL) objArr[0];
            FbUserSession fbUserSession = (FbUserSession) objArr[1];
            if (hfl != null && grd != null) {
                6A9 r0 = new 6A9();
                r0.A04 = 6AB.A05;
                Uri uri = null;
                try {
                    uri = C0A2.A03(hfl.A04);
                } catch (SecurityException unused) {
                }
                r0.A03 = uri;
                6TA r02 = new 6TA();
                String str = hfl.A03;
                r02.A03(str);
                r02.A1h = false;
                r02.A0U = new VideoDataSource(r0);
                r02.A1G = false;
                r02.A0L = hfl.A01;
                r02.A0J = 0;
                r02.A1g = false;
                r02.A1d = false;
                r02.A1k = true;
                VideoPlayerParams videoPlayerParams = new VideoPlayerParams(r02);
                MSn A02 = GraphQLMedia.A02("Video");
                A02.A1Y(3355, str);
                GraphQLMedia A1v = A02.A1v();
                grd.A0D = A1v;
                6TF r03 = new 6TF();
                r03.A03 = videoPlayerParams;
                r03.A01 = fbUserSession;
                r03.A03(A1v, "GraphQLMedia");
                grd.A0K = r03.A01();
            }
            this.A01 = hfl;
            this.A04 = grd;
        }
    }
}
