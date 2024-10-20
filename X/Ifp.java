package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.List;

/* loaded from: Ifp.class */
public final class Ifp implements JMS {
    public final /* synthetic */ GQy A00;

    public Ifp(GQy gQy) {
        this.A00 = gQy;
    }

    public void BjI() {
        GQy.A07(this.A00);
    }

    public /* synthetic */ void CF7(Context context, String str, List list) {
    }

    public void CPY(int i) {
        GrS grS = this.A00.A0I;
        if (grS == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        grS.A02 = true;
        JFq jFq = ((GS2) grS).A00;
        if (AbM.A1a(jFq)) {
            Fragment A0b = ((Fragment) AbM.A0r(jFq)).getChildFragmentManager().A0b(new String[]{"AvatarUpsell"}[0]);
            if (A0b == null || !A0b.isVisible()) {
                GQy gQy = (GQy) GS2.A05(grS);
                GQy.A07(gQy);
                GQy.A08(gQy);
            }
        }
    }

    public void CPZ(Context context, String str, String str2, String str3, int i) {
        String str4;
        GQy gQy = this.A00;
        if (gQy.A0I == null) {
            str4 = "presenter";
        } else {
            Hlr hlr = (Hlr) 1Br.A0B(gQy.A0v);
            FbUserSession fbUserSession = gQy.A09;
            str4 = "fbUserSession";
            if (fbUserSession != null) {
                if (!hlr.A00(fbUserSession, 1Br.A00(gQy.A0y))) {
                    return;
                }
                I7P A0S = GOp.A0S(gQy.A0t);
                FbUserSession fbUserSession2 = gQy.A09;
                if (fbUserSession2 != null) {
                    I7P.A00(fbUserSession2, A0S, "avatar_end_call_upsell_visible", "call_end_promo");
                    return;
                }
            }
        }
        11T.A0L(str4);
        throw 0Q8.createAndThrow();
    }

    public void CTQ(Integer num) {
        GQy.A09(this.A00, "survey_timeout", LocationComponentOptions.STALE_STATE_DELAY_MS);
    }

    public void D0G() {
    }

    public void D0M(int i, String str) {
    }
}
