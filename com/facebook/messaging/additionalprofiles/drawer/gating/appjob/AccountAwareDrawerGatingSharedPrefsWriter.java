package com.facebook.messaging.additionalprofiles.drawer.gating.appjob;

import X.11T;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1G2;
import X.1GD;
import X.1Nq;
import X.1QB;
import X.1Qc;
import X.1Ql;
import X.2yD;
import X.5H7;

/* loaded from: AccountAwareDrawerGatingSharedPrefsWriter.class */
public final class AccountAwareDrawerGatingSharedPrefsWriter implements 1Nq {
    public final 1Br A02 = 1Bq.A00(66351);
    public final 1Br A03 = 1Bq.A00(16385);
    public final 1Br A01 = 1Bq.A00(33013);
    public final 1Br A00 = 1Bq.A00(65837);

    public static final void A00(AccountAwareDrawerGatingSharedPrefsWriter accountAwareDrawerGatingSharedPrefsWriter) {
        1QB r0 = (1QB) 1Bn.A0A(65841);
        5H7 r02 = new 5H7(accountAwareDrawerGatingSharedPrefsWriter);
        1Qc r03 = (1Qc) accountAwareDrawerGatingSharedPrefsWriter.A00.A00.get();
        r0.A02(r02);
        r0.A04("AdditionalProfileWriteDrawerGatingConfig");
        r0.A03("ForNonUiThread");
        r0.A04 = "AccountAwareDrawerGatingSharedPrefsWriter";
        r03.A03(r0.A01(), "ReplaceExisting");
    }

    public static final void A01(AccountAwareDrawerGatingSharedPrefsWriter accountAwareDrawerGatingSharedPrefsWriter, 1Ql r302, 1G2 r303, String str, long j) {
        1G2 A0D = r303.A0D(str);
        1GD r0 = 1GD.A05;
        11T.A0B(r0);
        r302.putBoolean(A0D, ((2yD) accountAwareDrawerGatingSharedPrefsWriter.A03.A00.get()).AZr(r0, j));
    }

    public int Adi() {
        return 53695;
    }

    public void BqJ(int i) {
        A00(this);
    }
}
