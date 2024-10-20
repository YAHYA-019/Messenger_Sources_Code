package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: Gqw.class */
public final class Gqw extends GS2 {
    public boolean A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final JLm A08;
    public final Set A09;
    public final Context A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqw(FbUserSession fbUserSession, Context context) {
        super("DrawerContentPagerPresenter");
        1BL.A1F(fbUserSession, context);
        this.A01 = fbUserSession;
        this.A0A = context;
        this.A09 = 7zL.A15();
        this.A02 = GOn.A0Y(context, fbUserSession);
        this.A05 = 1Bu.A01(context, 114925);
        this.A04 = 1Bu.A01(context, 85227);
        this.A03 = 1Bu.A01(context, 114982);
        this.A06 = GOn.A0W(context, fbUserSession);
        this.A07 = GOn.A0P();
        this.A08 = GpZ.A00(this, 13);
    }

    /* JADX WARN: Type inference failed for: r309v2, types: [java.lang.Object, X.HhZ] */
    public static final void A00(Gqw gqw) {
        HhZ hhZ;
        1Br r0 = gqw.A02;
        boolean z = GOp.A0Q(r0).A0C;
        JOL jol = GOp.A0Q(r0).A08;
        boolean z2 = true;
        if (jol == null || !jol.BT9()) {
            z2 = false;
        }
        ArrayList AoS = GOp.A0Q(r0).AoS();
        JDB jdb = ((GS2) gqw).A01;
        if (AbM.A1a(jdb)) {
            Object A0r = AbM.A0r(jdb);
            if (A0r == null) {
                throw 1BK.A0h();
            }
            IZp iZp = (IZp) A0r;
            ?? obj = new Object();
            ((HhZ) obj).A02 = AnonymousClass001.A0v();
            iZp.getClass();
            ((HhZ) obj).A00 = iZp.A00;
            ((HhZ) obj).A01 = iZp.A01;
            ((HhZ) obj).A03 = iZp.A03;
            ((HhZ) obj).A04 = iZp.A04;
            ((HhZ) obj).A02 = AbF.A1E(iZp.A02);
            hhZ = obj;
        } else {
            hhZ = new HhZ();
        }
        hhZ.A03 = z;
        hhZ.A04 = z2;
        hhZ.A00 = GOp.A0Q(r0).A08;
        hhZ.A01 = AoS;
        C1pq.A08("availablePlugins", AoS);
        if (!hhZ.A02.contains("availablePlugins")) {
            HashSet A1E = AbF.A1E(hhZ.A02);
            hhZ.A02 = A1E;
            A1E.add("availablePlugins");
        }
        gqw.A0Z(new IZp(hhZ));
    }
}
