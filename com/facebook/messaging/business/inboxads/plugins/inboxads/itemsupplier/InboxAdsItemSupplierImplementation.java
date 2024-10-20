package com.facebook.messaging.business.inboxads.plugins.inboxads.itemsupplier;

import X.0fH;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1He;
import X.1Lo;
import X.1MV;
import X.1QB;
import X.1Qc;
import X.1Qd;
import X.2Si;
import X.2UL;
import X.2UM;
import X.2UT;
import X.2UU;
import X.2UV;
import X.2UZ;
import X.2Ua;
import X.2Ud;
import X.2Ue;
import X.2Uf;
import X.2Ug;
import X.2yD;
import X.4aL;
import X.C1F6;
import X.C47j;
import X.C47r;
import X.C7z0;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.business.inboxads.common.InboxAdsItem;
import com.facebook.messaging.business.inboxads.plugins.inboxads.itemsupplier.InboxAdsItemSupplierImplementation;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.TimeUnit;

/* loaded from: InboxAdsItemSupplierImplementation.class */
public final class InboxAdsItemSupplierImplementation {
    public MessagingPerformanceLogger A00;
    public 2UZ A01;
    public 2Ud A02;
    public 2UL A03;
    public 2UM A04;
    public 2UU A05;
    public 2Ug A06;
    public 2Ua A07;
    public 1QB A0A;
    public 1Qd A0B;
    public 1Qc A0C;
    public 2Si A0D;
    public final Context A0E;
    public final FbUserSession A0F;
    public ImmutableList A08 = InboxAdsItem.A01;
    public boolean A09 = false;
    public final 2UT A0G = new 2UT(this);

    public InboxAdsItemSupplierImplementation(Context context, FbUserSession fbUserSession, 1QB r304, 2UL r305, 2UM r306, 2Si r307) {
        this.A0E = context;
        this.A0F = fbUserSession;
        this.A0D = r307;
        C1F6 c1f6 = (C1F6) 1Bn.A0E(context, (1BY) null, 17164);
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.A00.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            2UU r0 = new 2UU(context, fbUserSession, c1f6);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A05 = r0;
            this.A01 = (2UZ) 1Bi.A03(17034);
            this.A07 = (2Ua) 1Bi.A03(66469);
            this.A03 = r305;
            this.A0C = (1Qc) 1Bi.A03(65837);
            this.A0B = (1Qd) 1Bi.A03(65839);
            this.A0A = r304;
            this.A00 = (MessagingPerformanceLogger) 1Bi.A03(85048);
            this.A02 = (2Ud) 1Bi.A03(99705);
            this.A04 = r306;
            Context context2 = this.A0E;
            Integer num = 1Lo.A05;
            ((2UV) this.A05).A01 = new 2Ue(fbUserSession, new 1MV(context2, fbUserSession, 17059), this);
            this.A03.A01 = new 2Uf(this);
            this.A06 = new 2Ug(fbUserSession, this);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.business.inboxads.plugins.inboxads.itemsupplier.InboxAdsItemSupplierImplementation r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.business.inboxads.plugins.inboxads.itemsupplier.InboxAdsItemSupplierImplementation.A00(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.business.inboxads.plugins.inboxads.itemsupplier.InboxAdsItemSupplierImplementation, java.lang.String):void");
    }

    public static void A01(final InboxAdsItemSupplierImplementation inboxAdsItemSupplierImplementation, final boolean z) {
        boolean A06 = inboxAdsItemSupplierImplementation.A0B.A06();
        0fH.A0g(Boolean.valueOf(A06), "InboxAdsItemSupplierImplementation", "startLoad criticalPathActive=%b");
        2Ud r0 = inboxAdsItemSupplierImplementation.A02;
        long A00 = inboxAdsItemSupplierImplementation.A04.A00();
        if (((2yD) r0.A01.A00.get()).AZk(36310783111136391L)) {
            C7z0 c7z0 = r0.A00;
            boolean z2 = false;
            if (c7z0 != null) {
                z2 = true;
            }
            if (c7z0 != null) {
                c7z0.BYH("overlap");
                r0.A00 = null;
            }
            C47r A02 = ((C47j) r0.A03.A00.get()).A02(523838724);
            r0.A00 = A02;
            A02.Bci("after_an_overlap", z2);
            A02.A7A("inbox_ads_query", TimeUnit.MINUTES, A00);
            A02.Bcg("inbox_ads_init", A00);
        }
        if (!A06) {
            A02(inboxAdsItemSupplierImplementation, z);
            return;
        }
        1Qc r02 = inboxAdsItemSupplierImplementation.A0C;
        1QB r03 = inboxAdsItemSupplierImplementation.A0A;
        r03.A01 = new Runnable() { // from class: X.2ep
            public static final String __redex_internal_original_name = "InboxAdsItemSupplierImplementation$5";

            @Override // java.lang.Runnable
            public void run() {
                InboxAdsItemSupplierImplementation.A02(InboxAdsItemSupplierImplementation.this, z);
            }
        };
        r03.A04("InboxAdsLoader");
        r03.A03("ForNonUiThread");
        r02.A03(r03.A01(), "ReplaceExisting");
    }

    public static void A02(InboxAdsItemSupplierImplementation inboxAdsItemSupplierImplementation, boolean z) {
        inboxAdsItemSupplierImplementation.A00.A0d("ads_load_begin");
        C7z0 c7z0 = inboxAdsItemSupplierImplementation.A02.A00;
        if (c7z0 != null) {
            c7z0.Bcr("inbox_ads_fetch_start");
        }
        inboxAdsItemSupplierImplementation.A05.A05(new 4aL(z ? 1He.A02 : 1He.A05));
    }
}
