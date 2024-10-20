package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: C5x.class */
public final class C5x {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;

    public C5x(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A07 = 7zM.A0e(context);
        this.A02 = AbG.A0M();
        this.A06 = 1Bq.A00(84011);
        this.A05 = 7zM.A0M();
        this.A04 = AbG.A0Y();
        this.A03 = 1Bu.A00(68733);
        this.A01 = AbG.A0J();
    }

    public void A00(Uri uri) {
        C08f c08f;
        2FT A0K;
        11T.A0F(uri, 0);
        GJL gjl = (GJL) 1Br.A0B(this.A06);
        Context context = this.A00;
        Intent Ard = gjl.Ard(context, uri.toString());
        if (Ard == null) {
            Ard = 4YU.A09(uri);
            Ard.addFlags(268435456);
        }
        if (!(context instanceof Activity)) {
            Ard.addFlags(268435456);
        }
        try {
            Uri data = Ard.getData();
            if (!0Pw.A00(uri) || (!(data == null || 0Pw.A00(data)) || Ard.getBooleanExtra("force_external_browser", false))) {
                c08f = 69J.A00(uri) ? (C08f) ((08O) 1Br.A0B(this.A05)).A03.get() : (C08f) ((08O) 1Br.A0B(this.A05)).A01.get();
                11T.A0D(c08f);
            } else {
                if ("fb-service".equals(uri.getScheme())) {
                    AbN.A0Z(this.A05).A0C(context, Ard);
                    return;
                }
                if (0Pw.A03(uri)) {
                    c08f = AbK.A0r(this.A05).A0D("MESSENGER_VIDEO_CALL");
                } else if (0Pw.A04(uri)) {
                    c08f = AbK.A0r(this.A05).A0D("MESSENGER_MEETUP_REQUEST");
                } else {
                    if (!AnonymousClass000.A00(195).equals(uri.getScheme()) || !"fb_mib".equals(uri.getAuthority())) {
                        FbUserSession A03 = 1Br.A03(this.A07);
                        if ("fb".equals(uri.getScheme()) && 1Br.A0B(this.A04) == C0et.A0P) {
                            C67Q c67q = (C67Q) 1Bu.A06(context, 49963);
                            A0K = 2FP.A01(new D2u(1, context, uri, c67q), c67q.A04(context, A03));
                        } else {
                            A0K = C3o5.A0K(false);
                        }
                        1Kd.A0F(new D4o(Ard, this, 11), A0K, ((CG7) 1Br.A0B(this.A03)).A01() ? 4YV.A11(this.A01) : 1JU.A01);
                        return;
                    }
                    c08f = AbK.A0r(this.A05).A0D("FACEBOOK_MIB_FRIENDING_URI");
                }
            }
            c08f.A0A(context, Ard);
        } catch (ActivityNotFoundException | SecurityException e) {
            1Br.A04(this.A02).softReport("QuickPromotion_action", e);
        }
    }
}
