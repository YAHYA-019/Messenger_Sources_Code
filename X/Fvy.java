package X;

import android.content.Context;
import com.facebook.zero.service.ZeroInterstitialEligibilityManager;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.CancellationException;

/* loaded from: Fvy.class */
public final class Fvy implements 1K9 {
    public final /* synthetic */ ZeroInterstitialEligibilityManager A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public Fvy(ZeroInterstitialEligibilityManager zeroInterstitialEligibilityManager, String str, boolean z) {
        this.A00 = zeroInterstitialEligibilityManager;
        this.A02 = z;
        this.A01 = str;
    }

    public void onFailure(Throwable th) {
        if (th instanceof CancellationException) {
            0fH.A0j(ZeroInterstitialEligibilityManager.A0N, "Cancelled zero interstitial eligibility fetch.");
            return;
        }
        ZeroInterstitialEligibilityManager zeroInterstitialEligibilityManager = this.A00;
        F8r f8r = (F8r) zeroInterstitialEligibilityManager.A07.get();
        4YV.A0Z(f8r.A01).flowEndFail(f8r.A00, "optin_graphql_fetch_failure", "GraphQL fetch failure");
        f8r.A00 = 0L;
        0fH.A0g(th.getMessage(), ZeroInterstitialEligibilityManager.A0N, "Exception fetching zero interstitial eligibility request: %s");
        1BK.A09(zeroInterstitialEligibilityManager.A03).softReport("zero_rating", "Error fetching zero interstitial request", th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        2JY A0K;
        2JX A0L;
        C00i c00i;
        AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
        String str = ZeroInterstitialEligibilityManager.A0N;
        0fH.A0j(str, "fetchZeroOptinEligibility: graphql success");
        ZeroInterstitialEligibilityManager zeroInterstitialEligibilityManager = this.A00;
        C00i c00i2 = zeroInterstitialEligibilityManager.A07;
        ((F8r) c00i2.get()).A02("optin_graphql_fetch_success");
        boolean z = this.A02;
        String str2 = this.A01;
        0fH.A0j(str, "Fetched zero interstitial eligibility request");
        if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null || (A0K = AbF.A0K((2JY) obj2, 2JX.class, 205093244)) == null || (A0L = 1BL.A0L(A0K, -997810495, 175042524)) == null) {
            0fH.A0j(str, "User has no eligible optin");
            ((F8r) c00i2.get()).A01("optin_graphql_fetch_not_eligible_for_optin");
            C00i c00i3 = zeroInterstitialEligibilityManager.A02;
            c00i3.get();
            C00i c00i4 = zeroInterstitialEligibilityManager.A04;
            1Ql A0V = 1BL.A0V(c00i4);
            A0V.CfI(DKC.A0b(((1Ky) 1Bn.A0A(98565)).A0E));
            A0V.commit();
            c00i3.get();
            1Ql A0V2 = 1BL.A0V(c00i4);
            A0V2.CfI(DKC.A0b(((1Ky) 1Bn.A0A(98565)).A0G));
            A0V2.commit();
            c00i3.get();
            1Ql A0V3 = 1BL.A0V(c00i4);
            A0V3.CfI(DKC.A0b(((1Ky) 1Bn.A0A(98565)).A03));
            A0V3.commit();
            return;
        }
        0fH.A0j(str, "onFetchZeroInterstitialEligibilitySuccess: attempt to prefetch flex optin screen");
        zeroInterstitialEligibilityManager.A09.get();
        C00i c00i5 = zeroInterstitialEligibilityManager.A02;
        c00i5.get();
        String A0W = 0Pz.A0W(A0L.A0r(1332059137), "_new");
        String typeName = A0L.getTypeName() != null ? A0L.getTypeName() : "";
        if ("ZeroAutoFlexOptin".equals(typeName) || "ZeroOlympusOptin".equals(typeName)) {
            Context A04 = 1BK.A04(c00i5);
            c00i = zeroInterstitialEligibilityManager.A04;
            FG8 fg8 = new FG8(A0L, 1BK.A0R(c00i));
            ((ED7) fg8).A0B = "";
            ((ED7) fg8).A04 = "";
            ((ED7) fg8).A05 = "";
            ((ED7) fg8).A06 = "";
            ((ED7) fg8).A0A = "";
            ((ED7) fg8).A08 = "";
            ((ED7) fg8).A02 = "";
            ((ED7) fg8).A01 = "";
            ((ED7) fg8).A09 = "";
            ((ED7) fg8).A07 = "";
            ((ED7) fg8).A03 = "";
            ((ED7) fg8).A0C = "";
            ((ED7) fg8).A00 = A04;
            String A0o = A0L.A0o();
            if (A0o == null) {
                A0o = "";
            }
            ((ED7) fg8).A0B = A0o;
            String A0r = A0L.A0r(507156368);
            if (A0r == null) {
                A0r = "";
            }
            ((ED7) fg8).A04 = A0r;
            String A0r2 = A0L.A0r(-1458021726);
            if (A0r2 == null) {
                A0r2 = "";
            }
            ((ED7) fg8).A05 = A0r2;
            String A0r3 = A0L.A0r(-1458021725);
            if (A0r3 == null) {
                A0r3 = "";
            }
            ((ED7) fg8).A06 = A0r3;
            String A0r4 = A0L.A0r(740313396);
            if (A0r4 == null) {
                A0r4 = "";
            }
            ((ED7) fg8).A0A = A0r4;
            String A0r5 = A0L.A0r(1932263261);
            if (A0r5 == null) {
                A0r5 = "";
            }
            ((ED7) fg8).A08 = A0r5;
            String A0r6 = A0L.A0r(1687144399);
            if (A0r6 == null) {
                A0r6 = "";
            }
            ((ED7) fg8).A02 = A0r6;
            String A0r7 = A0L.A0r(544498023);
            if (A0r7 == null) {
                A0r7 = "";
            }
            ((ED7) fg8).A01 = A0r7;
            String A0r8 = A0L.A0r(-2060497896);
            if (A0r8 == null) {
                A0r8 = "";
            }
            ((ED7) fg8).A09 = A0r8;
            String A0r9 = A0L.A0r(-877823861);
            if (A0r9 == null) {
                A0r9 = "";
            }
            ((ED7) fg8).A07 = A0r9;
            String A0r10 = A0L.A0r(2097666357);
            if (A0r10 == null) {
                A0r10 = "";
            }
            ((ED7) fg8).A03 = A0r10;
            String typeName2 = A0L.getTypeName();
            if (typeName2 == null) {
                typeName2 = "";
            }
            ((ED7) fg8).A0C = typeName2;
            fg8.A0E();
            if (((InterfaceC07234jG) zeroInterstitialEligibilityManager.A0B.get()).BQp()) {
                A0W = AbstractC00603o4.A00(512);
            }
        } else if ("ZeroDialtoneOptin".equals(typeName)) {
            Context A042 = 1BK.A04(c00i5);
            c00i = zeroInterstitialEligibilityManager.A04;
            FG8 fg82 = new FG8(A0L, 1BK.A0R(c00i));
            ((ED5) fg82).A00 = A042;
            ((ED5) fg82).A08 = DKG.A18(A0L, -877823861);
            ((ED5) fg82).A07 = DKG.A18(A0L, 1680240221);
            ImmutableList A0Z = A0L.A0Z(27465611);
            if (A0Z == null) {
                A0Z = ImmutableList.of();
            }
            ((ED5) fg82).A01 = A0Z;
            ((ED5) fg82).A09 = A0L.getBooleanValue(1128249003);
            ((ED5) fg82).A06 = DKG.A18(A0L, 861951438);
            ((ED5) fg82).A03 = DKG.A18(A0L, 1022281458);
            ((ED5) fg82).A04 = DKG.A18(A0L, 1816521811);
            ((ED5) fg82).A05 = DKG.A18(A0L, 2128760645);
            ((ED5) fg82).A02 = DKG.A18(A0L, 1251480369);
            fg82.A0E();
        } else {
            Context A043 = 1BK.A04(c00i5);
            c00i = zeroInterstitialEligibilityManager.A04;
            FG8 fg83 = new FG8(A0L, 1BK.A0R(c00i));
            ((ED6) fg83).A00 = A043;
            ((ED6) fg83).A08 = DKG.A18(A0L, -2060497896);
            ((ED6) fg83).A03 = DKG.A18(A0L, -877823861);
            ((ED6) fg83).A0A = A0L.getBooleanValue(883189145);
            ((ED6) fg83).A02 = DKG.A18(A0L, 1680240221);
            ImmutableList A0Z2 = A0L.A0Z(27465611);
            if (A0Z2 == null) {
                A0Z2 = ImmutableList.of();
            }
            ((ED6) fg83).A01 = A0Z2;
            ((ED6) fg83).A05 = DKG.A18(A0L, 1932247292);
            ((ED6) fg83).A04 = DKG.A18(A0L, 933194854);
            ((ED6) fg83).A07 = DKG.A18(A0L, 1687128430);
            ((ED6) fg83).A06 = DKG.A18(A0L, 1597169752);
            ((ED6) fg83).A09 = A0L.getBooleanValue(673895027);
            fg83.A0E();
            ((F8r) c00i2.get()).A02("optin_interstitial_initiated");
            A0W = "fbinternal://zero_flex_optin_interstitial_redesign";
        }
        1Ky A0w = DKG.A0w();
        1Ql A0V4 = 1BL.A0V(c00i);
        A0V4.CaH(DKC.A0b(A0w.A0q), 1BL.A08(zeroInterstitialEligibilityManager.A01));
        A0V4.CaL(DKC.A0b(A0w.A0r), typeName);
        A0V4.CaL(DKC.A0b(A0w.A0s), DKC.A0i(zeroInterstitialEligibilityManager.A06).A08(1QE.A02));
        A0V4.commit();
        ZeroInterstitialEligibilityManager.A01(zeroInterstitialEligibilityManager, A0W, typeName, str2, z);
    }
}
