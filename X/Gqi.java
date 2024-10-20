package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gqi.class */
public final class Gqi extends GS2 {
    public boolean A00;
    public int[] A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final JFn A0A;
    public final Context A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqi(FbUserSession fbUserSession, Context context) {
        super(7zK.A00(178));
        1BL.A1F(fbUserSession, context);
        this.A02 = fbUserSession;
        this.A0B = context;
        this.A03 = GOn.A0Z(context, fbUserSession);
        this.A06 = GOn.A0U(context, fbUserSession);
        this.A08 = GOn.A0T(context, fbUserSession);
        this.A09 = 1Bu.A01(context, 85079);
        this.A07 = 1Lm.A00(context, fbUserSession, 85166);
        this.A04 = 1Bq.A00(99793);
        this.A05 = AbG.A0V();
        this.A0A = new GqG(this, 3);
        this.A01 = I6p.A00();
    }
}
