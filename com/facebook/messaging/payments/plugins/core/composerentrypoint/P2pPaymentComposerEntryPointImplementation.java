package com.facebook.messaging.payments.plugins.core.composerentrypoint;

import X.07S;
import X.0Mt;
import X.0S2;
import X.11T;
import X.1BJ;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1CO;
import X.1CQ;
import X.1Lo;
import X.1VX;
import X.2oI;
import X.2yD;
import X.4YU;
import X.4YV;
import X.5Dh;
import X.5II;
import X.5yY;
import X.6Gx;
import X.6J6;
import X.6QS;
import X.6Qf;
import X.6Qh;
import X.6gJ;
import X.6gL;
import X.6gN;
import X.6gO;
import X.AbstractC00603o4;
import X.AbstractC05414dq;
import X.C00i;
import X.C01643sd;
import X.C6fo;
import X.C6gM;
import X.C7ej;
import X.DLz;
import X.DM1;
import X.DM2;
import X.DM3;
import X.DM4;
import X.DUC;
import X.ER3;
import X.EaG;
import X.FHR;
import android.content.Context;
import android.util.Pair;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.Constants;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.math.BigDecimal;
import java.util.HashSet;

/* loaded from: P2pPaymentComposerEntryPointImplementation.class */
public final class P2pPaymentComposerEntryPointImplementation {
    public 1BY A00;
    public final C00i A07;
    public final C00i A03 = new 1BQ(99939);
    public final C00i A02 = new 1BV((1BY) null, 99163);
    public final C00i A05 = new 1BQ(68025);
    public final C00i A06 = new 1BQ(50013);
    public final C00i A04 = new 1BV((1BY) null, 67860);
    public final C00i A01 = new 1BV((1BY) null, 82079);

    public P2pPaymentComposerEntryPointImplementation(1BO r302) {
        1Bi.A03(83604);
        this.A07 = new 1BQ(68302);
        this.A00 = new 1BY(r302);
    }

    private void A00(Context context, 6Qh r303, C6fo c6fo, ThreadKey threadKey, ThreadSummary threadSummary, Integer num, Object obj) {
        if (c6fo == C6fo.A04 && ((2yD) ((5yY) this.A04.get()).A00.get()).AZk(36312870452139079L)) {
            6Gx r0 = (6Gx) this.A06.get();
            FHR A04 = DUC.A04();
            A04.A08("p2p_composer_drawer_click");
            A04.A04(ER3.A0a);
            r0.A05(A04);
        }
        if (6QS.A0a(r303.A00)) {
            return;
        }
        6J6 r02 = (6J6) this.A02.get();
        BigDecimal bigDecimal = CurrencyAmount.A02;
        CurrencyAmount currencyAmount = new CurrencyAmount("USD", EaG.A00);
        DM3 dm3 = DM3.A0M;
        DM4 dm4 = DM4.A0K;
        if (!dm4.mValue.equals(obj)) {
            dm4 = DM4.A09;
        }
        r02.A02(context, threadKey, threadSummary, currencyAmount, dm3, dm4, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0080, code lost:
    
        if (r307 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C6g3 A01(android.content.Context r302, com.facebook.auth.usersession.FbUserSession r303, X.C6fo r304, com.facebook.messaging.model.threadkey.ThreadKey r305, com.facebook.messaging.model.threads.ThreadSummary r306) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.payments.plugins.core.composerentrypoint.P2pPaymentComposerEntryPointImplementation.A01(android.content.Context, com.facebook.auth.usersession.FbUserSession, X.6fo, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.model.threads.ThreadSummary):X.6g3");
    }

    public void A02(Context context, FbUserSession fbUserSession, 6Qh r304, 6Qf r305, C6fo c6fo, ThreadKey threadKey, ThreadSummary threadSummary) {
        ((5II) this.A05.get()).A0A(AbstractC00603o4.A00(467));
        if (4YU.A0K(this.A03).A0S()) {
            r305.ADP(c6fo == C6fo.A02 ? 0S2.A1G : 0S2.A15, (Object) null, 1BJ.A00(97));
        } else {
            A00(context, r304, c6fo, threadKey, threadSummary, c6fo == C6fo.A02 ? ((6gJ) 1Lo.A04((Context) null, fbUserSession, this.A00, 82505)).A00(threadKey, threadSummary) : 0S2.A00, null);
        }
    }

    public void A03(FbUserSession fbUserSession, C6fo c6fo) {
        if (c6fo == C6fo.A04 && ((2yD) ((5yY) this.A04.get()).A00.get()).AZk(36312870452139079L)) {
            C00i c00i = this.A06;
            6Gx r0 = (6Gx) c00i.get();
            DM2 dm2 = DM2.A01;
            r0.A02(fbUserSession, DM4.A01, DM1.A06, dm2);
            6Gx r02 = (6Gx) c00i.get();
            FHR A04 = DUC.A04();
            A04.A08("p2p_composer_drawer_impression");
            A04.A04(ER3.A0a);
            r02.A05(A04);
        }
    }

    public boolean A04(Context context, FbUserSession fbUserSession, 6Qh r304, C6fo c6fo, ThreadKey threadKey, ThreadSummary threadSummary, Integer num, Object obj) {
        if (num != (c6fo == C6fo.A02 ? 0S2.A1G : 0S2.A15)) {
            return false;
        }
        4YU.A0K(this.A03).A0I("upgrade_to_paid_from_payments");
        A00(context, r304, c6fo, threadKey, threadSummary, num == 0S2.A1G ? ((6gJ) 1Lo.A04(context, fbUserSession, (1BY) null, 82505)).A00(threadKey, threadSummary) : 0S2.A00, obj);
        return true;
    }

    public boolean A05(Context context, FbUserSession fbUserSession, C6fo c6fo, ThreadKey threadKey, ThreadSummary threadSummary, Capabilities capabilities) {
        boolean z = false;
        if (!2oI.A03(threadSummary)) {
            if (c6fo == C6fo.A02) {
                6gJ r0 = (6gJ) 1Lo.A04(context, fbUserSession, (1BY) null, 82505);
                6gL r02 = (6gL) this.A07.get();
                11T.A0F(fbUserSession, 0);
                Context A00 = FbInjector.A00();
                C6gM c6gM = (C6gM) r02.A00.A00.get();
                11T.A0D(A00);
                C00i c00i = r02.A01.A00;
                c00i.get();
                String valueOf = String.valueOf(6gO.A00());
                synchronized (c6gM) {
                    11T.A0F(A00, 0);
                    if ("receipt_reported_outcomes_in_inbox_android_universe".length() != 0 && valueOf != null && valueOf.length() != 0 && (!valueOf.equals(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL) || !((1CO) c6gM.A00.A00.get()).AZk(2342167347227283048L))) {
                        Pair pair = new Pair(valueOf, "receipt_reported_outcomes_in_inbox_android_universe");
                        HashSet hashSet = c6gM.A01;
                        if (!hashSet.contains(pair)) {
                            hashSet.add(pair);
                            07S A0J = 4YU.A0J(GraphQlCallInput.A02, valueOf, "page_id");
                            GraphQlQueryParamSet A0N = 4YU.A0N(A0J, "receipt_reported_outcomes_in_inbox_android_universe", "qe_universe");
                            4YV.A1A(A0J, A0N, "input");
                            AbstractC05414dq A05 = 1VX.A05(A00, fbUserSession);
                            5Dh A002 = 5Dh.A00(A0N, new C01643sd(C7ej.class, "FBPagesExposureLoggingMutationMutation", null, "input", "fbandroid", 723331157, 384, 1772292954L, 1772292954L, false, true));
                            4YU.A1J(A002, 391254665174029L);
                            A05.A06(A002);
                        }
                    }
                }
                6gN r03 = (6gN) c00i.get();
                c00i.get();
                if (!r03.A01("receipt_reported_outcomes_enabled", 6gO.A00()) && r0.A00(threadKey, threadSummary) != 0S2.A00) {
                    return true;
                }
            } else {
                if (((1CQ) 1Bi.A03(131252)).A09(16, false) && capabilities.A00.get(0)) {
                    z = true;
                }
                1Bi.A03(Constants.LOAD_RESULT_PGO);
                String valueOf2 = String.valueOf(0Mt.A00());
                if (z) {
                    6Gx r04 = (6Gx) 1Bi.A03(50013);
                    r04.A00 = 6Gx.A00(fbUserSession, DM1.A06, r04, DM2.A01, valueOf2, DLz.A00(DM3.A0M).mValue);
                }
            }
        }
        return z;
    }
}
