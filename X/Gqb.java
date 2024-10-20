package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.rtc.links.api.VideoChatLink;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;

/* loaded from: Gqb.class */
public abstract class Gqb extends GS2 {
    public void A0d(MigColorScheme migColorScheme) {
        GpY gpY = (GpY) this;
        11T.A0F(migColorScheme, 0);
        1Br A00 = 1Lm.A00(gpY.A06, gpY.A07, 17016);
        if (GS2.A07(gpY)) {
            C00i c00i = A00.A00;
            if (AbG.A0m(c00i).A06 != null) {
                FragmentActivity A0A = 4YV.A0A(((JPN) GS2.A05(gpY)).getContext());
                VideoChatLink videoChatLink = AbG.A0m(c00i).A06;
                if (videoChatLink == null) {
                    throw 1BK.A0h();
                }
                String str = videoChatLink.A0L;
                UserKey A08 = AbG.A0m(c00i).A08();
                if (A0A == null || A08 == null || str == null) {
                    return;
                }
                6In r0 = (6In) 1Br.A0B(gpY.A0B);
                ThreadKey A082 = ThreadKey.A08(0L);
                06Z BDe = A0A.BDe();
                11T.A0A(BDe);
                r0.Czj(BDe, C5yq.A0o, A082, migColorScheme, A08, C5yl.A0L, str);
            }
        }
    }

    public void A0e(MigColorScheme migColorScheme) {
        GpY gpY = (GpY) this;
        11T.A0F(migColorScheme, 0);
        1Br A00 = 1Lm.A00(gpY.A06, gpY.A07, 17016);
        if (GS2.A07(gpY)) {
            C00i c00i = A00.A00;
            if (AbG.A0m(c00i).A06 != null) {
                FragmentActivity A0A = 4YV.A0A(((JPN) GS2.A05(gpY)).getContext());
                VideoChatLink videoChatLink = AbG.A0m(c00i).A06;
                if (videoChatLink == null) {
                    throw 1BK.A0h();
                }
                String str = videoChatLink.A0J;
                UserKey A08 = AbG.A0m(c00i).A08();
                if (A0A == null || A08 == null || str == null) {
                    return;
                }
                6In r0 = (6In) 1Br.A0B(gpY.A0B);
                ThreadKey A082 = ThreadKey.A08(0L);
                06Z BDe = A0A.BDe();
                11T.A0A(BDe);
                r0.Czj(BDe, C5yq.A0o, A082, migColorScheme, A08, C5yl.A0A, str);
            }
        }
    }

    public boolean A0f() {
        return GpY.A00((GpY) this).A0R();
    }
}
