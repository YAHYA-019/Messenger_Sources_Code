package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;

/* loaded from: Ck6.class */
public final class Ck6 implements 7Yx {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 06Z A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ 6vO A03;
    public final /* synthetic */ DFY A04;
    public final /* synthetic */ CNl A05;
    public final /* synthetic */ 1Kn A06;
    public final /* synthetic */ CIh A07;
    public final /* synthetic */ C5fr A08;
    public final /* synthetic */ boolean A09;

    public Ck6(Context context, 06Z r303, FbUserSession fbUserSession, 6vO r305, DFY dfy, CNl cNl, 1Kn r308, CIh cIh, C5fr c5fr, boolean z) {
        this.A06 = r308;
        this.A07 = cIh;
        this.A05 = cNl;
        this.A02 = fbUserSession;
        this.A00 = context;
        this.A04 = dfy;
        this.A09 = z;
        this.A01 = r303;
        this.A08 = c5fr;
        this.A03 = r305;
    }

    public final void CHY(User user) {
        1Kn r0;
        if (user == null || (r0 = this.A06) == null) {
            return;
        }
        int ordinal = r0.ordinal();
        if (ordinal == 5) {
            this.A07.A03("ADD_FRIEND");
            CNl cNl = this.A05;
            FbUserSession fbUserSession = this.A02;
            cNl.A03(this.A00, 3yU.A0C, 3yV.A0P, fbUserSession, this.A04, new CoR(this.A03, 0), user, "MESSENGER_THREADVIEW", this.A09);
            return;
        }
        if (ordinal == 4) {
            CNl cNl2 = this.A05;
            FbUserSession fbUserSession2 = this.A02;
            cNl2.A02(this.A00, 3yU.A0C, 3yV.A0P, fbUserSession2, this.A04, new CoR(this.A03, 1), user, "MESSENGER_THREADVIEW", this.A09);
            return;
        }
        if (ordinal == 3) {
            CIh cIh = this.A07;
            cIh.A03("RESPOND_FRIEND");
            this.A05.A04(this.A01, EnumC3497Mfs.A02, 3yU.A0C, 3yV.A0P, this.A04, new CoR(this.A03, 2), user, cIh, this.A09);
            return;
        }
        if (ordinal == 2) {
            Context context = this.A00;
            11T.A0F(context, 1);
            1Hv.A02(context, 83091);
            CNl cNl3 = this.A05;
            FbUserSession fbUserSession3 = this.A02;
            cNl3.A05(this.A01, 3yU.A0C, 3yV.A0P, fbUserSession3, this.A04, AbG.A03(this.A08.A06), this.A09);
        }
    }
}
