package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.User;

/* loaded from: Cto.class */
public final class Cto implements DIZ {
    public final Context A00;
    public final FbUserSession A01;

    public Cto(Context context, FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    public void AG1(06Z r302, BLX blx, User user, String str, String str2, String str3, int i, int i2) {
        C8c c8c = (C8c) 1Bi.A03(84183);
        Integer num = 0S2.A0N;
        c8c.A01(blx, num, str, str2, str3, i, i2);
        C1r A0d = AbM.A0d();
        Context context = this.A00;
        A0d.A00(context).A04(blx, num, str, str2, str3, i, i2);
        7EN r0 = (7EN) 1Bu.A06(context, 50188);
        Rs8 rs8 = new Rs8(c8c);
        CwG cwG = new CwG(c8c, 2);
        if (user == null) {
            throw 1BK.A0h();
        }
        r0.A08(r302, BNT.A09, BNJ.A0K, rs8, (DGC) null, cwG, user);
    }

    public void AG2(BLX blx, String str, String str2, String str3, int i, int i2) {
        C1r A0d = AbM.A0d();
        Context context = this.A00;
        CJ7 A00 = A0d.A00(context);
        Integer num = 0S2.A0C;
        A00.A04(blx, num, str, str2, str3, i, i2);
        A00.A03(blx, num, str, str2, str3, i, i2);
        BDS bds = (BDS) 1Lm.A05(context, this.A01, 82470);
        1Um AQV = bds.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new CzX(A0P, bds, str, i2, 3), A0P, false);
    }

    public void AG3(ThreadKey threadKey, BLX blx, String str, String str2, String str3, int i, int i2) {
        1BK.A1K(threadKey, 0, str);
        C8c c8c = (C8c) 1Bi.A03(84183);
        Integer num = 0S2.A01;
        c8c.A01(blx, num, str, str2, str3, i, i2);
        C1r A0d = AbM.A0d();
        Context context = this.A00;
        A0d.A00(context).A04(blx, num, str, str2, str3, i, i2);
        ((6HS) 7zR.A0o(context, 50024)).A07(threadKey, "content_discovery_life_event");
    }

    public void AG4(06Z r302, ThreadKey threadKey, ThreadSummary threadSummary, BLX blx, MigColorScheme migColorScheme, String str, String str2, String str3, int i, int i2) {
        C8c c8c = (C8c) 1Bi.A03(84183);
        Integer num = 0S2.A0Y;
        c8c.A01(blx, num, str, str2, str3, i, i2);
        C1r A0d = AbM.A0d();
        Context context = this.A00;
        A0d.A00(context).A04(blx, num, str, str2, str3, i, i2);
        1Bn.A0A(67527);
        DR6 A01 = C5ic.A01(context, migColorScheme);
        A01.A00(2131958625);
        A01.A06(2131958627);
        A01.A0C(Rip.A00, 2131958626);
        A01.A05();
    }
}
