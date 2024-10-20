package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;

/* loaded from: Cpx.class */
public final class Cpx implements DIW {
    public 5O6 A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 2eN A05;
    public final C1325Ae3 A06 = new C1325Ae3();
    public final Integer A07;

    public Cpx(Context context, FbUserSession fbUserSession, Integer num) {
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A07 = num;
        this.A04 = 1Bu.A01(context, 147991);
        this.A03 = 1Bu.A01(context, 147990);
        this.A05 = (2eN) 1Bn.A0E(context, (1BY) null, 84334);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [android.content.Context, X.53M, com.facebook.auth.usersession.FbUserSession, boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.content.Context, int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.content.Context, X.53M, com.facebook.auth.usersession.FbUserSession, boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.Context, X.53M, com.facebook.auth.usersession.FbUserSession, boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.RrR, boolean] */
    public final ImmutableList A00(boolean z) {
        this.A07.intValue();
        if (3 == 3) {
            1Br.A0C(this.A03);
            Context context = this.A01;
            FbUserSession fbUserSession = this.A02;
            ?? r0 = 53M.A0Q;
            ?? rrR = new RrR((Context) r0, (FbUserSession) r0, (53M) r0, (boolean) r0);
            return rrR.A00((ByH) null, (boolean) rrR);
        }
        if (2 != 2) {
            ?? r02 = this.A01;
            1Bu.A06((Context) r02, (int) r02);
            FbUserSession fbUserSession2 = this.A02;
            ?? r03 = 53M.A0Q;
            return (r03 != 0 ? new Cq4(r03, r03, r03, r03, r03, z) : new Cq4(r03, r03, r03, false, r03, z)).A05();
        }
        1Br.A0C(this.A04);
        Context context2 = this.A01;
        FbUserSession fbUserSession3 = this.A02;
        ?? r04 = 53M.A0Q;
        return new Cq3(r04, r04, r04, r04).A04(null, false);
    }

    public void A5L(DFe dFe) {
        11T.A0F(dFe, 0);
        this.A06.A00(dFe);
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    public /* bridge */ /* synthetic */ C1323Ae1 Cpm(ByH byH, Object obj) {
        EnumC1297Ada enumC1297Ada;
        Resources resources;
        int i;
        C96 c96 = (C96) obj;
        if (c96 != null && c96.A02 != BP5.A04) {
            return C1323Ae1.A04;
        }
        FbUserSession fbUserSession = this.A02;
        Context context = this.A01;
        Long l = ((AcP) 1Lm.A05(context, fbUserSession, 84248)).A0G.A02;
        if (l != null && byH != null) {
            String valueOf = String.valueOf(l);
            String str = byH.A04;
            11T.A0A(str);
            String A00 = 53M.A00(byH.A00);
            11T.A0A(A00);
            int intValue = this.A07.intValue();
            5O6 A0R = AbK.A0R(intValue != 3 ? intValue != 2 ? intValue != 0 ? ClientDataSourceIdentifier.A0Z : ClientDataSourceIdentifier.A0e : ClientDataSourceIdentifier.A0N : ClientDataSourceIdentifier.A0a, valueOf, str, A00);
            this.A00 = A0R;
            this.A05.A01(A0R, "search started");
        }
        ImmutableList A002 = A00(false);
        if (!A002.isEmpty() && this.A00 != null) {
            ((AcX) A002.get(0)).A01 = this.A00;
        }
        5O6 r0 = this.A00;
        if (r0 != null) {
            AbF.A1S(r0, A002);
            this.A05.A01(this.A00, "search ended");
        }
        int intValue2 = this.A07.intValue();
        if (intValue2 == 3) {
            enumC1297Ada = EnumC1297Ada.A0x;
            resources = context.getResources();
            i = 2131959908;
        } else if (intValue2 == 2) {
            enumC1297Ada = EnumC1297Ada.A0Y;
            resources = context.getResources();
            i = 2131959891;
        } else if (intValue2 != 0) {
            enumC1297Ada = EnumC1297Ada.A11;
            resources = context.getResources();
            i = 2131959906;
        } else {
            enumC1297Ada = EnumC1297Ada.A15;
            resources = context.getResources();
            i = 2131959911;
        }
        return AbG.A0n(ImmutableList.of((Object) new C1333AeN(enumC1297Ada, A002, resources.getString(i))));
    }

    public String getFriendlyName() {
        return "SuggestedChannelsTabDataSource";
    }
}
