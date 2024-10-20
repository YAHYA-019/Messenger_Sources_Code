package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.auth.protocol.InstagramUserInfo;
import com.facebook.auth.protocol.UserTypeResult;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.litho.LithoView;
import com.facebook.messaging.accountlogin.AccountLoginActivity;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueCredentials;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSSOFacebook;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSSOInstagram;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueTwoFacAuth;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: B2z.class */
public abstract class B2z extends AlJ {
    public static final String __redex_internal_original_name = "AccountLoginBaseLithoFragment";
    public LithoView A00;
    public boolean A01;
    public final C7xz A02 = new CZk(this, 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.AlJ, X.B2q, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v128, types: [com.facebook.mig.scheme.interfaces.MigColorScheme] */
    /* JADX WARN: Type inference failed for: r0v288, types: [X.AlJ, X.B2p, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r310v12, types: [X.Ate] */
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        AzV azV;
        BitSet bitSet;
        C1807Atg c1807Atg;
        BitSet bitSet2;
        C1807Atg c1807Atg2;
        C1807Atg c1807Atg3;
        String str;
        String str2;
        if (this instanceof B2p) {
            ?? r0 = (B2p) this;
            AccountLoginSegueTwoFacAuth accountLoginSegueTwoFacAuth = (AccountLoginSegueTwoFacAuth) ((AlJ) r0).A01;
            String str3 = null;
            if (accountLoginSegueTwoFacAuth.A08) {
                String str4 = accountLoginSegueTwoFacAuth.A06;
                if (str4 != null) {
                    str2 = accountLoginSegueTwoFacAuth.A05;
                    if (str2 != null) {
                        str3 = str4;
                        str = str3;
                        str3 = str2;
                    }
                }
                str2 = null;
                str = str3;
                str3 = str2;
            } else if (1Br.A07(r0.A01.A03).AZk(18300013834870711L)) {
                str3 = r0.getString(2131952234);
                AccountLoginSegueTwoFacAuth accountLoginSegueTwoFacAuth2 = (AccountLoginSegueTwoFacAuth) ((AlJ) r0).A01;
                str = accountLoginSegueTwoFacAuth2.A00 != null ? accountLoginSegueTwoFacAuth2.A05 : r0.getString(2131952233);
            } else {
                str = null;
            }
            MigColorScheme migColorScheme = (MigColorScheme) 7zO.A0l((Fragment) r0, 16981);
            ?? c1805Ate = new C1805Ate(r303, new AzV());
            CHq A06 = AlJ.A06();
            azV = c1805Ate.A01;
            azV.A03 = A06;
            BitSet bitSet3 = c1805Ate.A02;
            bitSet3.set(1);
            azV.A06 = str3;
            azV.A05 = str;
            azV.A00 = c7xz;
            azV.A01 = r0.A08;
            azV.A02 = r0.A09;
            bitSet3.set(2);
            azV.A04 = migColorScheme;
            bitSet3.set(0);
            C1rs.A03(bitSet3, c1805Ate.A03);
            c1807Atg3 = c1805Ate;
        } else {
            if (this instanceof B2g) {
                B2g b2g = (B2g) this;
                UserTypeResult userTypeResult = ((InstagramUserInfo) ((AccountLoginSegueSSOInstagram) ((AlJ) b2g).A01).A01).A00;
                String str5 = userTypeResult.A03;
                BKr bKr = "messenger_only".equals(userTypeResult.A01) ? BKr.A03 : BKr.A01;
                FbUserSession A0C = 4YV.A0C(r303.A0D);
                C1807Atg c1807Atg4 = new C1807Atg(r303, new B19());
                azV = c1807Atg4.A01;
                azV.A01 = A0C;
                bitSet2 = c1807Atg4.A02;
                bitSet2.set(1);
                azV.A04 = AlJ.A06();
                bitSet2.set(2);
                azV.A06 = str5;
                azV.A03 = bKr;
                azV.A02 = b2g.A04;
                azV.A05 = AbF.A0p(b2g.A03);
                c1807Atg2 = c1807Atg4;
            } else {
                if (!(this instanceof B2k)) {
                    ?? r02 = (B2q) this;
                    BoQ boQ = r02.A0r;
                    AccountLoginSegueCredentials accountLoginSegueCredentials = (AccountLoginSegueCredentials) ((AlJ) r02).A01;
                    String str6 = accountLoginSegueCredentials.A09;
                    Bbm bbm = boQ.A01;
                    if (str6 != null) {
                        bbm.A00 = str6;
                    }
                    boQ.A02.A00 = accountLoginSegueCredentials.A0C;
                    boQ.A00 = accountLoginSegueCredentials.A0I;
                    C1802Atb c1802Atb = new C1802Atb(r303, new C2023Azk());
                    azV = c1802Atb.A01;
                    azV.A03 = boQ;
                    BitSet bitSet4 = c1802Atb.A02;
                    bitSet4.set(10);
                    azV.A00 = c7xz;
                    DEf dEf = ((AlJ) r02).A02;
                    azV.A05 = dEf != null ? ((AccountLoginActivity) dEf).A0B : LightColorScheme.A00();
                    bitSet4.set(0);
                    azV.A04 = AlJ.A06();
                    bitSet4.set(7);
                    bitSet4.set(9);
                    boolean z = true;
                    if (r02.A1X() == BLS.A06) {
                        z = false;
                    }
                    azV.A0B = z;
                    bitSet4.set(8);
                    r02.A0Z.get();
                    azV.A06 = "";
                    bitSet4.set(3);
                    String str7 = ((AccountLoginSegueCredentials) ((AlJ) r02).A01).A0G;
                    boolean z2 = false;
                    if (str7 != null && !str7.isEmpty()) {
                        z2 = true;
                    }
                    azV.A0A = !z2;
                    bitSet4.set(6);
                    azV.A01 = r02.A0l;
                    azV.A08 = r02.A0E;
                    bitSet4.set(1);
                    azV.A09 = r02.A0F;
                    bitSet4.set(2);
                    azV.A07 = r02.A0C;
                    bitSet4.set(5);
                    azV.A02 = r02;
                    bitSet4.set(4);
                    7zP.A1A(c1802Atb, bitSet4, c1802Atb.A03);
                    if (r02.mFragmentManager.A0U() > 1) {
                        2cM A0f = AbH.A0f(r303, 0);
                        C5yw A0b = 7zN.A0b(r303, false);
                        DEf dEf2 = ((AlJ) r02).A02;
                        A0b.A2b(dEf2 != null ? ((AccountLoginActivity) dEf2).A0B : LightColorScheme.A00());
                        A0b.A2h(false);
                        A0b.A2i(false);
                        CxE.A01(A0b, (Object) r02, 0);
                        AbH.A1Q(A0f, A0b);
                        return 7zL.A0V(A0f, azV);
                    }
                    return azV;
                }
                B2k b2k = (B2k) this;
                CQH A0V = AbF.A0V(b2k.A05);
                int size = b2k.A01.size();
                1UG A00 = CQH.A00(A0V);
                if (A00.isSampled()) {
                    HashMap A0u = AnonymousClass001.A0u();
                    AbG.A1Y("num_accounts", A0u, size);
                    AbK.A1J(A00, BMG.A2r.name, A0u);
                }
                FbUserSession A0C2 = 4YV.A0C(r303.A0D);
                if (b2k.A01.size() == 1) {
                    ((AccountLoginSegueSSOFacebook) ((AlJ) b2k).A01).A02 = (FirstPartySsoSessionInfo) b2k.A01.get(0);
                    C1807Atg c1807Atg5 = new C1807Atg(r303, new B19());
                    B19 b19 = c1807Atg5.A01;
                    b19.A01 = A0C2;
                    bitSet = c1807Atg5.A02;
                    bitSet.set(1);
                    b19.A04 = AlJ.A06();
                    bitSet.set(2);
                    b19.A03 = BKr.A01;
                    b19.A06 = ((AccountLoginSegueSSOFacebook) ((AlJ) b2k).A01).A02.A06;
                    b19.A07 = AbI.A0F(b2k, 0).A08;
                    b19.A00 = ((AccountLoginSegueSSOFacebook) ((AlJ) b2k).A01).A00;
                    b19.A09 = false;
                    c1807Atg = c1807Atg5;
                } else {
                    C1807Atg c1807Atg6 = new C1807Atg(r303, new B19());
                    B19 b192 = c1807Atg6.A01;
                    b192.A01 = A0C2;
                    bitSet = c1807Atg6.A02;
                    bitSet.set(1);
                    b192.A04 = AlJ.A06();
                    bitSet.set(2);
                    b192.A03 = BKr.A02;
                    b192.A08 = b2k.A01;
                    b192.A09 = true;
                    c1807Atg = c1807Atg6;
                }
                bitSet.set(3);
                DIj dIj = b2k.A09;
                azV = c1807Atg.A01;
                azV.A02 = dIj;
                azV.A05 = AbF.A0p(b2k.A04);
                bitSet2 = c1807Atg.A02;
                c1807Atg2 = c1807Atg;
            }
            bitSet2.set(0);
            C1rs.A02(bitSet2, c1807Atg2.A03);
            c1807Atg3 = c1807Atg2;
        }
        c1807Atg3.A0J();
        return azV;
    }

    public void A1d() {
        1LI A1c;
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            1Iw r0 = lithoView.A09;
            2cM A0N = AbK.A0N(r0);
            A0N.A2K("component_test_key");
            if ((this instanceof B2h) || (this instanceof B2g) || (this instanceof B2j) || (this instanceof B2o) || (this instanceof B2n) || (this instanceof B2v) || (this instanceof B2u) || (this instanceof B2r) || (this instanceof B2t) || (this instanceof B2x) || (this instanceof B2w) || (this instanceof B2s) || (this instanceof B2m) || (this instanceof B2k) || (this instanceof B2q) || (this instanceof B2i)) {
                A1c = A1c(this.A02, r0);
            } else {
                Dud A01 = Dzc.A01(r0);
                A01.A0R();
                C7xz c7xz = this.A02;
                A01.A01.A02 = c7xz;
                A1c = 7zM.A0w(A1c(c7xz, r0), A01);
            }
            AbH.A1P(A0N, A1c, lithoView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1980043908);
        LithoView A0O = AbK.A0O(this);
        this.A00 = A0O;
        0FI.A08(1637969586, A02);
        return A0O;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-395248958);
        super.onDestroyView();
        this.A00 = null;
        0FI.A08(-1037375888, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A1d();
    }
}
