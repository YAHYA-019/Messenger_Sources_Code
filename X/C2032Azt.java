package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Azt, reason: case insensitive filesystem */
/* loaded from: Azt.class */
public final class C2032Azt extends C1rj {
    public static final MigColorScheme A04 = LightColorScheme.A00();
    public FbUserSession A00;
    public Bgo A01;
    public MigColorScheme A02;
    public ImmutableList A03;

    public C2032Azt() {
        super("ViewJoinRequestsComponent");
        this.A02 = A04;
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A00, this.A01, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FbUserSession fbUserSession = this.A00;
        ImmutableList immutableList = this.A03;
        Bgo bgo = this.A01;
        MigColorScheme migColorScheme = this.A02;
        11T.A0F(r302, 0);
        11T.A0G(fbUserSession, 1, immutableList);
        11T.A0F(migColorScheme, 4);
        1Br A00 = 1Lm.A00(7zL.A0A(r302), fbUserSession, 17067);
        2cM A002 = 2cK.A00(r302);
        AwR A003 = B12.A00(r302);
        B12 b12 = A003.A01;
        b12.A06 = 7zL.A12(A003, 2131965246);
        A003.A02.set(0);
        A003.A2Y(true);
        b12.A08 = true;
        ImmutableList of = ImmutableList.of((Object) new RSX(0, 2131964764), (Object) new RSX(1, 2131965164));
        11T.A0A(of);
        b12.A03 = of;
        b12.A02 = new CZY(bgo, r302, 3);
        A002.A2e(A003.A2W());
        2fZ r0 = (2fZ) 1Br.A0B(A00);
        8OH A004 = C8m6.A00(r302);
        A004.A0R();
        A004.A0e();
        A004.A17(12.0f);
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(immutableList.size());
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            C84j c84j = (C84j) it.next();
            String str = c84j.A00;
            String str2 = c84j.A01;
            if (str2 == null || str2.length() == 0) {
                4zI.A03.A05("ViewJoinRequestsComponentSpec", "Skipping participant %s since name is not available", new Object[]{str});
            } else {
                AnonymousClass557 A0p = 7zL.A0p();
                A0p.A00 = Long.parseLong(str);
                A0p.A08 = r0.A0I(1BK.A0X(str));
                A0p.A08(str2);
                2MQ r02 = 2MQ.A0q;
                2Re r03 = 2Re.A02;
                ImmutableList of2 = ImmutableList.of((Object) COF.A00(r02, r03, new Cwo(bgo, str, 0), migColorScheme, r302.A0D(2131964767)), (Object) COF.A00(2MQ.A0z, r03, new Cwo(bgo, str, 1), migColorScheme, r302.A0D(2131965167)));
                11T.A0A(of2);
                A0p.A06(of2);
                A0p.A05(migColorScheme);
                A0p.A01 = new CvJ(str, bgo, 3);
                AbG.A1R(A0p, builderWithExpectedSize);
            }
        }
        A004.A2W(1Fj.A01(builderWithExpectedSize));
        return 7zL.A0V(A002, AbH.A0s(A004));
    }
}
