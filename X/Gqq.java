package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* loaded from: Gqq.class */
public final class Gqq extends GS2 {
    public final 1Br A00;
    public final 1Br A01;
    public final JLm A02;
    public final HUx A03;
    public final Context A04;
    public final FbUserSession A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqq(FbUserSession fbUserSession, Context context) {
        super("HaloDrawerPagerPresenter");
        1BL.A1F(fbUserSession, context);
        this.A05 = fbUserSession;
        this.A04 = context;
        this.A01 = 1Bq.A00(115777);
        this.A00 = GOn.A0Y(context, fbUserSession);
        this.A02 = GpZ.A00(this, 14);
        this.A03 = new HUx(this);
    }

    public static final void A00(Gqq gqq, Boolean bool) {
        C00i c00i = gqq.A00.A00;
        JOS jos = (JOS) c00i.get();
        Object peek = ((HbM) 1Br.A0B(gqq.A01)).A01.peek();
        11T.A0A(peek);
        JOL B3j = jos.B3j(AnonymousClass001.A03(peek));
        if (B3j != null) {
            List A12 = C0s8.A12((JOL) 1Br.A0B(GOq.A0Z(c00i).A0Q));
            JDB jdb = ((GS2) gqq).A01;
            gqq.A0Z(new C1800At9(B3j, AbM.A1a(jdb) ? ((C1800At9) AbM.A0r(jdb)).A00 : null, bool, A12));
        }
    }
}
