package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLLivingRoomEntrySource;
import com.facebook.messaging.cowatch.launcher.parameters.CoWatchLauncherParams;
import com.facebook.messaging.cowatch.launcher.parameters.VideoInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: I46.class */
public final class I46 {
    public static final Handler A0I = AnonymousClass001.A07();
    public Context A00;
    public String A01;
    public String A02;
    public String A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 2JM A0E;
    public final 2QY A0F;
    public final FbUserSession A0G;
    public final 1De A0H;

    public I46(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0H = r303;
        this.A0G = fbUserSession;
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 33088);
        this.A05 = GOo.A0N(r0);
        this.A0C = GOn.A0k(fbUserSession, r0);
        this.A08 = 1Lm.A03(fbUserSession, r0, 115519);
        this.A06 = 1Lm.A03(fbUserSession, r0, 115514);
        this.A0A = 1Bu.A03(r0, 984);
        this.A0D = 1Lm.A03(fbUserSession, r0, 83326);
        this.A0B = 1Lm.A03(fbUserSession, r0, 114853);
        this.A09 = 1Bu.A03(r0, 115728);
        this.A07 = 1Bu.A03(r0, 67593);
        this.A0E = IY8.A01(this, 21);
        this.A0F = Gys.A00(this, 12);
    }

    public void A00(String str, String str2, String str3) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public void A01(String str, String str2, String str3) {
        11T.A0F(str, 0);
        if (this.A00 != null) {
            GP5.A02(GOp.A0K(this.A05), "cowatch_promo_call_started", str2, null, str, null);
            long Auy = ICR.A00(this.A07).Auy(36595865847401297L);
            if (((Hq9) 1Br.A0B(this.A0B)).A00()) {
                if (1Br.A0B(this.A09) != null) {
                    A0I.postDelayed(new J1y(this, str2, str, str3), Auy);
                    return;
                }
                return;
            }
            AbR A0J = AbJ.A0J(this.A0A);
            Context context = this.A00;
            11T.A0D(context);
            Hsa A0I2 = A0J.A0I(context);
            FbUserSession fbUserSession = this.A0G;
            ThreadKey A00 = ((HpT) 1Br.A0B(this.A0D)).A00();
            A0I2.A01(fbUserSession, new CoWatchLauncherParams(GraphQLLivingRoomEntrySource.A01, new VideoInfo(null, null, null, str, null), A00, null, null, false));
        }
    }
}
