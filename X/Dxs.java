package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.fxcal.identity.model.AccountProfileModel;
import com.facebook.mig.deprecated.bottomsheet.LegacyMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Dxs.class */
public final class Dxs extends C1rj {
    public FbUserSession A00;
    public GF3 A01;
    public LegacyMigBottomSheetDialogFragment A02;
    public MigColorScheme A03;
    public ImmutableList A04;
    public String A05;
    public String A06;
    public String A07;

    public Dxs() {
        super("FxImBottomSheet");
    }

    public final Object[] A0k() {
        return new Object[]{this.A05, this.A03, this.A00, this.A01, this.A02, this.A04, this.A06, this.A07};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2AW A0Z;
        2AW A0Z2;
        ImmutableList of;
        E09 e09 = (E09) 4YU.A0P(r302);
        FbUserSession fbUserSession = this.A00;
        MigColorScheme migColorScheme = this.A03;
        GF3 gf3 = this.A01;
        ImmutableList immutableList = this.A04;
        LegacyMigBottomSheetDialogFragment legacyMigBottomSheetDialogFragment = this.A02;
        String str = this.A07;
        String str2 = this.A06;
        String str3 = this.A05;
        String str4 = e09.A00;
        String str5 = e09.A01;
        Erq erq = (Erq) 1Bn.A0E(r302.A0D, (1BY) null, 99817);
        2cM A0M = 7zN.A0M(r302, (String) null);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        if (1JF.A0B(str)) {
            A0Z = 7zL.A0Y();
        } else {
            2KD A00 = 2K3.A00(r302);
            A00.A2g();
            A00.A2b();
            A00.A2X();
            7zO.A1E(A00, 2RH.A06);
            A00.A2z(str);
            A0Z = 7zN.A0Z(migColorScheme, A00);
        }
        A01.A2e(A0Z);
        if (1JF.A0B(str2)) {
            A0Z2 = 7zL.A0Y();
        } else {
            2KD A002 = 2K3.A00(r302);
            A002.A2n();
            A002.A2d();
            A002.A2Y();
            A002.A2z(str2);
            4YU.A1L(A002, 2RH.A06);
            A002.A1A(4YU.A00(2RH.A03));
            A0Z2 = 7zN.A0Z(migColorScheme, A002);
        }
        A01.A2e(A0Z2);
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            AccountProfileModel accountProfileModel = (AccountProfileModel) it.next();
            55D A003 = erq.A00(fbUserSession, migColorScheme, accountProfileModel.A0D, null);
            StringBuilder A0k = AnonymousClass001.A0k();
            String str6 = accountProfileModel.A0B;
            A0k.append(str6);
            String str7 = accountProfileModel.A0C;
            if (!1JF.A0B(str7)) {
                A0k.append(" · ");
                A0k.append(str7);
            }
            55N A004 = 55M.A00(r302);
            AnonymousClass557 anonymousClass557 = new AnonymousClass557();
            String str8 = accountProfileModel.A0A;
            String str9 = str8;
            if (str8 == null) {
                str8 = "";
            }
            anonymousClass557.A08(str8);
            anonymousClass557.A07(A0k);
            boolean z = accountProfileModel.A0E;
            boolean z2 = true;
            anonymousClass557.A0C = !z;
            anonymousClass557.A05 = A003;
            anonymousClass557.A01 = new Fk2(r302, accountProfileModel, 0);
            anonymousClass557.A05(migColorScheme);
            if (str4 == null || z || !str4.equals(str6)) {
                of = ImmutableList.of();
            } else {
                C1u3 c1u3 = C1u3.A1U;
                C1u4 c1u4 = C1u4.SIZE_32;
                C1ut c1ut = C1ut.A0B;
                11T.A0F(migColorScheme, 0);
                of = ImmutableList.of((Object) new 5AM(c1u3, c1u4, c1ut, migColorScheme, (CharSequence) null));
            }
            anonymousClass557.A06(of);
            if (str4 == null || z || !str4.equals(str6)) {
                z2 = false;
            }
            if (str9 == null) {
                str9 = accountProfileModel.A08;
            }
            String obj = A0k.toString();
            int i = 2131952178;
            if (z2) {
                i = 2131952164;
            }
            anonymousClass557.A0A = r302.A0E(i, new Object[]{str9, obj});
            A004.A2X(anonymousClass557.A00());
            A01.A2e(A004.A2W());
        }
        if (!1JF.A0B(str3)) {
            8Ti A012 = 8oM.A01(r302);
            A012.A2a(str3);
            A012.A2Z(migColorScheme);
            A012.A2Y(new Cwv(gf3, legacyMigBottomSheetDialogFragment, str4, str5, 0));
            A01.A2e(A012.A2W());
        }
        7zL.A1G(A01, A0M);
        return A0M.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        String str;
        E09 e09 = (E09) r303;
        ImmutableList immutableList = this.A04;
        int i = -1;
        if (!immutableList.isEmpty()) {
            i = 0;
            int i2 = 1;
            while (true) {
                int i3 = i2;
                if (i3 >= immutableList.size()) {
                    break;
                }
                if (DKF.A0U(immutableList, i3).A00 > DKF.A0U(immutableList, i).A00 && !DKF.A0U(immutableList, i3).A0E) {
                    i = i3;
                }
                i2 = i3 + 1;
            }
        }
        String str2 = "";
        if (i >= 0) {
            str = DKF.A0U(immutableList, i).A0B != null ? DKF.A0U(immutableList, i).A0B : str2;
            if (DKF.A0U(immutableList, i).A0D != null) {
                str2 = DKF.A0U(immutableList, i).A0D;
            }
        } else {
            str = str2;
        }
        e09.A00 = str;
        e09.A01 = str2;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
