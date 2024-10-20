package com.facebook.messaging.nativepagereply.adcreation.interstitial;

import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1UG;
import X.2QF;
import X.2cK;
import X.2cM;
import X.4YU;
import X.4YV;
import X.7zL;
import X.7zQ;
import X.AbH;
import X.B0u;
import X.C1910Awb;
import X.C1u2;
import X.C3RD;
import X.C5yv;
import X.C5yw;
import X.CYr;
import X.CxE;
import X.EWO;
import X.FFk;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;
import java.util.Map;

/* loaded from: MessagingAdsInterstitialActivity.class */
public final class MessagingAdsInterstitialActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public final 1Br A01 = 1Bu.A01(this, 68282);

    public static final Integer A12(MessagingAdsInterstitialActivity messagingAdsInterstitialActivity) {
        Integer num;
        Integer[] A00 = 0S2.A00(11);
        int length = A00.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                num = 0S2.A0C;
                break;
            }
            num = A00[i2];
            if (11T.A0O(EWO.A00(num), messagingAdsInterstitialActivity.getIntent().getStringExtra("entry_point"))) {
                break;
            }
            i = i2 + 1;
        }
        return num;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        MigColorScheme migColorScheme;
        2cM A00;
        C1910Awb c1910Awb;
        BitSet bitSet;
        int i;
        super.A2y(bundle);
        this.A00 = 7zQ.A0N().A05(this);
        C3RD c3rd = (C3RD) 1Br.A0B(this.A01);
        1UG A08 = 1BK.A08(1Br.A02(c3rd.A01), "biim_ad_creation_imp_interstitial");
        if (C3RD.A00(c3rd) != null && A08.isSampled()) {
            4YU.A1H(A08, Long.parseLong((String) c3rd.A02.getValue()));
            String str = C3RD.A00(c3rd).mUserId;
            11T.A0A(str);
            A08.A6H("admin_id", 1BK.A0n(str));
            A08.A6J("extra_data", (Map) null);
            A08.BZL();
        }
        1Iw A0W = 7zL.A0W(this);
        Context A0A = 7zL.A0A(A0W);
        1BV A0R = 7zL.A0R(A0A, 16979);
        C1u2 A0I = 4YV.A0I();
        FFk fFk = (FFk) 1Bn.A0E(A0A, (1BY) null, 99777);
        1BV A002 = 1BV.A00(66596);
        if (this.A00 == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        fFk.A03(A0A, 0S2.A0C);
        if (A12(this) != 0S2.A1G) {
            2QF r0 = (2QF) A002.get();
            if (r0.A03(false) && 2QF.A00(r0).AZk(36321546285564374L)) {
                migColorScheme = (MigColorScheme) A0R.get();
                A00 = 2cK.A00(A0W);
                C5yw A003 = C5yv.A00(A0W);
                A003.A2b(migColorScheme);
                A003.A2j(false);
                A003.A2i(false);
                CxE.A01(A003, this, 66);
                AbH.A1Q(A00, A003);
                c1910Awb = new C1910Awb(A0W, new B0u());
                String string = A0A.getString(2131958390);
                B0u b0u = c1910Awb.A01;
                b0u.A0H = string;
                bitSet = c1910Awb.A02;
                bitSet.set(14);
                b0u.A0B = A0A.getString(2131958377);
                bitSet.set(8);
                b0u.A0C = A0A.getString(2131958379);
                bitSet.set(9);
                b0u.A0D = A0A.getString(2131958381);
                bitSet.set(10);
                b0u.A08 = A0A.getString(2131958371);
                bitSet.set(2);
                b0u.A09 = A0A.getString(2131958373);
                bitSet.set(3);
                b0u.A0A = A0A.getString(2131958375);
                C1910Awb.A06(A0A, A0I, c1910Awb, b0u, bitSet);
                b0u.A0E = A0A.getString(2131958386);
                b0u.A0F = A0A.getString(2131958388);
                bitSet.set(13);
                i = 17;
                CYr cYr = new CYr(i, A0W, fFk, this);
                B0u b0u2 = c1910Awb.A01;
                b0u2.A05 = cYr;
                bitSet.set(12);
                b0u2.A07 = migColorScheme;
                bitSet.set(0);
                setContentView(LithoView.A00(this, 7zL.A0U(A00, c1910Awb)));
            }
        }
        migColorScheme = (MigColorScheme) A0R.get();
        A00 = 2cK.A00(A0W);
        C5yw A004 = C5yv.A00(A0W);
        A004.A2b(migColorScheme);
        A004.A2j(false);
        A004.A2i(false);
        CxE.A01(A004, this, 65);
        AbH.A1Q(A00, A004);
        c1910Awb = new C1910Awb(A0W, new B0u());
        String string2 = A0A.getString(2131958389);
        B0u b0u3 = c1910Awb.A01;
        b0u3.A0H = string2;
        bitSet = c1910Awb.A02;
        bitSet.set(14);
        b0u3.A0B = A0A.getString(2131958376);
        bitSet.set(8);
        b0u3.A0C = A0A.getString(2131958378);
        bitSet.set(9);
        b0u3.A0D = A0A.getString(2131958380);
        bitSet.set(10);
        b0u3.A08 = A0A.getString(2131958370);
        bitSet.set(2);
        b0u3.A09 = A0A.getString(2131958372);
        bitSet.set(3);
        b0u3.A0A = A0A.getString(2131958374);
        C1910Awb.A06(A0A, A0I, c1910Awb, b0u3, bitSet);
        b0u3.A0E = A0A.getString(2131958385);
        b0u3.A0F = A0A.getString(2131958387);
        bitSet.set(13);
        i = 16;
        CYr cYr2 = new CYr(i, A0W, fFk, this);
        B0u b0u22 = c1910Awb.A01;
        b0u22.A05 = cYr2;
        bitSet.set(12);
        b0u22.A07 = migColorScheme;
        bitSet.set(0);
        setContentView(LithoView.A00(this, 7zL.A0U(A00, c1910Awb)));
    }
}
