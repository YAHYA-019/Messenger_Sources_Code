package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Az4, reason: case insensitive filesystem */
/* loaded from: Az4.class */
public final class C2009Az4 extends C1rj {
    public FbUserSession A00;
    public C57g A01;

    public C2009Az4() {
        super("MostLikelyToGameOptionLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FbUserSession fbUserSession = this.A00;
        C57g c57g = this.A01;
        C1rq A0L = AbJ.A0L(r302);
        A0L.A2b();
        C1912Awd A06 = C1912Awd.A06(fbUserSession, r302);
        A06.A2W(2RK.A07);
        C26z c26z = C26z.START;
        2RH r0 = 2RH.A07;
        7zO.A1M(A06, r0, c26z);
        ThreadParticipant threadParticipant = c57g.A01;
        A06.A01.A04 = ImmutableList.of((Object) C28p.A01(threadParticipant));
        A0L.A2e(A06);
        C1rs A00 = 2K3.A00(r302);
        A00.A2l();
        A00.A2b();
        String A02 = C28p.A02(threadParticipant);
        A02.getClass();
        A00.A2z(A02);
        MigColorScheme migColorScheme = c57g.A03;
        A00.A2x(migColorScheme);
        A00.A0R();
        2RH r02 = 2RH.A04;
        7zO.A1M(A00, r02, c26z);
        7zO.A1I(A00, 2RH.A03);
        A0L.A2e(A00);
        boolean z = c57g.A05;
        C1rs A002 = Dyc.A00(r302);
        A002.A2Y(z);
        7zO.A1L(A002, r0);
        7zN.A1D(A002, r302, C2009Az4.class, "MostLikelyToGameOptionLayout", -1850725627);
        A002.A2X(migColorScheme);
        A0L.A2e(A002);
        4YU.A1O(A0L, r02, c26z);
        A0L.A0R();
        7zN.A1D(A0L, r302, C2009Az4.class, "MostLikelyToGameOptionLayout", -1850725627);
        return A0L.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1850725627) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((3xC) obj).A00;
        C57g c57g = ((C2009Az4) r0).A01;
        view.performHapticFeedback(1);
        IXl iXl = c57g.A02;
        ThreadParticipant threadParticipant = c57g.A01;
        boolean z = !c57g.A05;
        ICJ icj = (ICJ) ((HzU) iXl.A01).A04.A00.A00.get();
        icj.A0C.put(threadParticipant, Boolean.valueOf(z));
        ICJ.A01(icj);
        icj.A03();
        return null;
    }
}
