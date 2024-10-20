package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.messaging.fxcal.identity.model.AccountProfileModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: Dwv.class */
public final class Dwv extends C1rj {
    public FbUserSession A00;
    public 2JX A01;
    public Eok A02;
    public MigColorScheme A03;
    public ImmutableList A04;
    public ImmutableList A05;

    public Dwv() {
        super("FxImSettingsFlowLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A00, this.A02, this.A04, this.A01, this.A05};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        ImmutableList copyOf;
        String str;
        CJ4 cj4;
        int i;
        String A0r;
        FbUserSession fbUserSession = this.A00;
        Eok eok = this.A02;
        2JX r0 = this.A01;
        ImmutableList immutableList = this.A04;
        ImmutableList immutableList2 = this.A05;
        MigColorScheme migColorScheme = this.A03;
        Context context = r302.A0D;
        Erq erq = (Erq) 1Bn.A0E(context, (1BY) null, 99817);
        Bdp bdp = (Bdp) 1Bn.A0A(84948);
        2fZ r02 = (2fZ) 1Lo.A04(context, C54z.A00(r302), (1BY) null, 17067);
        2cM A0M = 7zN.A0M(r302, (String) null);
        8T0 A00 = 8mB.A00(r302);
        if (r0 == null || immutableList.isEmpty()) {
            copyOf = ImmutableList.copyOf((Collection) AnonymousClass001.A0s());
        } else {
            ImmutableList.Builder builder = ImmutableList.builder();
            String A0r2 = r0.A0r(58009652);
            String A0r3 = r0.A0r(-1337429164);
            String str2 = !immutableList.isEmpty() ? DKF.A0U(immutableList, 0).A08 : "";
            StringBuilder A0k = AnonymousClass001.A0k();
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                A0k.append(DKF.A0U(immutableList, i2).A0B);
                A0k.append(", ");
            }
            if (A0k.length() > 2) {
                A0k.deleteCharAt(A0k.length() - 2);
            }
            ImmutableList A0c = r0.A0c(1218662232, 2JX.class, -250758388);
            builder.m11011add((Object) F1u.A00(r02, migColorScheme, immutableList, str2, A0k.toString(), immutableList2.contains("PROFILE_PHOTO")));
            if (!1JF.A0B(A0r2)) {
                7sZ r03 = new 7sZ();
                r03.A07 = A0r2;
                r03.A04 = migColorScheme;
                builder.m11011add((Object) r03.A00());
            }
            1Du it = A0c.iterator();
            while (it.hasNext()) {
                2JY A0P = 7zL.A0P(it);
                String A0t = A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLMAIdentitySyncField", 97427706);
                if (A0t != null) {
                    if (A0t.equals("NAME")) {
                        String A0r4 = A0P.A0r(43736178);
                        if (A0r4 != null) {
                            cj4 = new CJ4();
                            cj4.A04(A0r4);
                            cj4.A07 = migColorScheme;
                            i = 7;
                            cj4.A01 = new Fjz(eok, i);
                            builder.m11011add((Object) cj4.A01());
                        }
                    } else if (A0t.equals("PROFILE_PHOTO")) {
                        String A0r5 = A0P.A0r(43736178);
                        if (A0r5 != null) {
                            cj4 = new CJ4();
                            cj4.A04(A0r5);
                            cj4.A07 = migColorScheme;
                            i = 8;
                            cj4.A01 = new Fjz(eok, i);
                            builder.m11011add((Object) cj4.A01());
                        }
                    } else if (A0t.equals("AVATAR") && 2yD.A03(1BK.A0N(bdp.A00), 36314408049254326L) && (A0r = A0P.A0r(43736178)) != null) {
                        cj4 = new CJ4();
                        cj4.A04(A0r);
                        cj4.A07 = migColorScheme;
                        i = 9;
                        cj4.A01 = new Fjz(eok, i);
                        builder.m11011add((Object) cj4.A01());
                    }
                }
            }
            if (!1JF.A0B(A0r3)) {
                7sZ r04 = new 7sZ();
                r04.A07 = A0r3;
                r04.A04 = migColorScheme;
                builder.m11011add((Object) r04.A00());
            }
            1Du it2 = immutableList.iterator();
            while (it2.hasNext()) {
                AccountProfileModel accountProfileModel = (AccountProfileModel) it2.next();
                String str3 = accountProfileModel.A0A;
                if (str3 != null && accountProfileModel.A08 != null && (str = accountProfileModel.A0B) != null) {
                    55D A002 = erq.A00(fbUserSession, migColorScheme, accountProfileModel.A0D, str);
                    AnonymousClass557 anonymousClass557 = new AnonymousClass557();
                    anonymousClass557.A05 = A002;
                    anonymousClass557.A08(str3);
                    anonymousClass557.A07(str);
                    anonymousClass557.A01 = new Fk2(eok, accountProfileModel, 1);
                    anonymousClass557.A05(migColorScheme);
                    builder.m11011add((Object) anonymousClass557.A00());
                }
            }
            copyOf = builder.build();
        }
        A00.A2Y(copyOf);
        A00.A0R();
        A00.A0J();
        return 7zL.A0V(A0M, A00.A01);
    }
}
