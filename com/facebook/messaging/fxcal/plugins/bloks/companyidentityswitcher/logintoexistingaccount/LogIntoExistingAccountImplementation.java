package com.facebook.messaging.fxcal.plugins.bloks.companyidentityswitcher.logintoexistingaccount;

import X.11T;
import X.1BK;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1G1;
import X.1UG;
import X.2Vz;
import X.4YV;
import X.7zQ;
import X.AnonymousClass001;
import X.BsP;
import X.C02;
import X.CIw;
import X.CS5;
import X.CSG;
import X.DKB;
import X.DR6;
import X.Fwk;
import X.InterfaceC09434q3;
import android.content.Context;
import com.facebook.messaging.accountlogin.AccountLoginActivity;

/* loaded from: LogIntoExistingAccountImplementation.class */
public final class LogIntoExistingAccountImplementation {
    public final Object A00(Fwk fwk) {
        11T.A0F(fwk, 0);
        Context context = fwk.A00;
        boolean A1V = AnonymousClass001.A1V(1Bn.A0A(83441));
        1G1 A0F = 4YV.A0F(context);
        if (A1V && !7zQ.A0v().A2D) {
            ((C02) 1Bn.A0A(85289)).A00(context, CSG.A00(context, 68)).show();
            return null;
        }
        if (!((InterfaceC09434q3) 1Bi.A03(66417)).BNP()) {
            2Vz r0 = (2Vz) 1Bu.A06(context, 17037);
            CIw cIw = (CIw) 1Bn.A0A(84023);
            r0.A0A(false);
            cIw.A03("company_identity_switcher_add_new");
            1BK.A0W().A0A(context, AccountLoginActivity.A15(context, "company_identity_switcher_entry_point"));
            return null;
        }
        BsP bsP = (BsP) 1Bn.A0A(84006);
        11T.A0F(A0F, 0);
        1UG A08 = 1BK.A08(1Br.A02(bsP.A02), "switcher_limit_reached");
        if (A08.isSampled()) {
            A08.A7R("exception", "Account limit reached.");
            1G1 r02 = A0F;
            A08.A6H(DKB.A00(423), 1BK.A0n(r02.A04));
            A08.A6H("initiator_identity_id", 1BK.A0n(r02.A02));
            A08.BZL();
        }
        DR6 A02 = 7zQ.A0l().A02(context);
        A02.A0K(true);
        A02.A00(2131962719);
        A02.A06(2131962718);
        A02.A0D(CS5.A00, 2131955702);
        A02.A05();
        return null;
    }
}
