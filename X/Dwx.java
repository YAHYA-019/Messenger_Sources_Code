package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.fxcal.identity.model.AccountProfileModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Dwx.class */
public final class Dwx extends C1rj {
    public 06Z A00;
    public FbUserSession A01;
    public 2JX A02;
    public Edo A03;
    public GF3 A04;
    public MigColorScheme A05;
    public ImmutableList A06;
    public ImmutableList A07;
    public String A08;

    public Dwx() {
        super("FxImPhotoSettingLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A05, this.A01, this.A00, this.A06, this.A02, this.A07, this.A08, this.A03, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FbUserSession fbUserSession = this.A01;
        MigColorScheme migColorScheme = this.A05;
        06Z r0 = this.A00;
        ImmutableList immutableList = this.A06;
        2JX r02 = this.A02;
        GF3 gf3 = this.A04;
        Edo edo = this.A03;
        ImmutableList immutableList2 = this.A07;
        String str = this.A08;
        if (immutableList.isEmpty() || r02 == null) {
            return 7zL.A0Y();
        }
        1Du it = immutableList.iterator();
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                2cM A01 = 2cK.A01(r302, (String) null, 0);
                7zM.A1O(A01, migColorScheme);
                A01.A0R();
                C2ki A00 = C2kV.A00(r302);
                7zL.A1K(r302);
                E0l e0l = new E0l();
                e0l.A01 = fbUserSession;
                e0l.A05 = migColorScheme;
                e0l.A00 = r0;
                e0l.A02 = r02;
                e0l.A06 = immutableList;
                e0l.A08 = Boolean.valueOf(z2);
                e0l.A03 = edo;
                e0l.A04 = gf3;
                e0l.A07 = immutableList2;
                e0l.A09 = str;
                A00.A01.A0L = e0l;
                A00.A02.set(0);
                A00.A2j(true);
                A00.A0R();
                return 7zL.A0V(A01, A00.A2W());
            }
            z = z2 & ((AccountProfileModel) it.next()).A0E;
        }
    }
}
