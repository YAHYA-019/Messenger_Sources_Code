package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: F88.class */
public final class F88 {
    public static final long A05 = TimeUnit.DAYS.toSeconds(1);
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A04;
    public final 1BP A03 = FbInjector.A00;
    public final 1Br A00 = 1Bq.A00(115592);

    public F88(1De r302) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 98417);
        this.A02 = 1Bu.A03(r0, 83719);
    }

    public final void A00(FbUserSession fbUserSession, GHh gHh, String str, String str2, boolean z) {
        boolean A1X = 1BL.A1X(fbUserSession, str);
        java.util.Map A00 = FGY.A00(7zL.A09(), (GKc) 1De.A00(this.A04, 83003));
        11T.A0A(A00);
        GraphQlCallInput A002 = F24.A00(A00);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        A0M.A01(A002, "device_capabilities");
        A0M.A05(GOm.A00(62), str2);
        A0M.A05("thumbnail_shape", "SQUARE");
        A0M.A04("preview_video_effect_thumbnail_width", Integer.valueOf(DKD.A08().widthPixels));
        A0M.A04("preview_video_effect_thumbnail_height", Integer.valueOf(DKD.A08().heightPixels));
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "SingleEffectQuery", (String) null, "fbandroid", -2030478371, 0, 3588633723L, 3588633723L, false, A1X));
        if (z) {
            long j = A05;
            A0L.A0A(j);
            A0L.A09(j);
        } else {
            ((C3sb) A0L).A03 = 0L;
        }
        1FV A09 = 7zT.A09(this.A02).A09(A0L);
        FwG fwG = new FwG(gHh, this, str, 0);
        Hyp hyp = (Hyp) 1Br.A0B(this.A01);
        Hyp.A00(hyp);
        Executor executor = hyp.A01;
        if (executor == null) {
            throw 1BK.A0h();
        }
        1Kd.A0F(fwG, A09, executor);
    }
}
