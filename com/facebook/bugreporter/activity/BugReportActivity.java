package com.facebook.bugreporter.activity;

import X.06Z;
import X.0Gm;
import X.11T;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1iF;
import X.1lN;
import X.4YU;
import X.4YV;
import X.7zP;
import X.AbF;
import X.C00i;
import X.C0D1;
import X.C0et;
import X.C1io;
import X.C3o5;
import X.DE0;
import X.DKF;
import X.DKG;
import X.DKH;
import X.DZO;
import X.EPO;
import X.EhO;
import X.ExV;
import X.FAc;
import X.FFl;
import X.FbE;
import X.G1x;
import X.GEC;
import X.GHX;
import X.GKR;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.base.fragment.NavigableFragment;
import com.facebook.bugreporter.ConstBugReporterConfig;
import com.facebook.bugreporter.core.model.BugReport;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.meta.flytrap.attachment.model.BugReportAttachment;

/* loaded from: BugReportActivity.class */
public class BugReportActivity extends FbFragmentActivity implements 1lN, DE0, C1io {
    public int A00;
    public ConstBugReporterConfig A01;
    public ExV A02;
    public BugReportAttachment A03;
    public GHX A04;
    public DZO A05;
    public final C00i A06 = 1BQ.A02(100175);
    public final C00i A0A = 1BQ.A02(100306);
    public final C00i A07 = 1BQ.A00();
    public final C00i A0B = 1BQ.A02(100321);
    public final C00i A09 = 1BQ.A02(114693);
    public final C00i A0D = 1BV.A00(114689);
    public final C00i A0C = AbF.A0Q(this, 100202);
    public final C00i A0E = 1BQ.A02(83604);
    public final GEC A08 = new FbE(this);

    public static Intent A12(Context context, GKR gkr, BugReport bugReport) {
        Intent A0D = C3o5.A0D(context, BugReportActivity.class);
        A0D.putExtra("anrreport", bugReport);
        A0D.putExtra("local_bug_report_id", bugReport.A06);
        A0D.putExtra("client_server_join_key", bugReport.A0V);
        A0D.putExtra("reporter_config", gkr instanceof ConstBugReporterConfig ? (ConstBugReporterConfig) gkr : new ConstBugReporterConfig(gkr));
        if (bugReport.A0B == EPO.A0K) {
            A0D.addFlags(268435456);
        }
        return A0D;
    }

    public static void A15(BugReportActivity bugReportActivity, boolean z) {
        EhO ehO = (EhO) bugReportActivity.A0C.get();
        ehO.A01.remove(bugReportActivity.A08);
        Intent A05 = AbF.A05();
        A05.putExtra("from_bug_report_activity", true);
        A05.putExtra("isSendClickedFlag", z);
        bugReportActivity.setResult(-1, A05);
        bugReportActivity.finish();
    }

    public static boolean A16(BugReportActivity bugReportActivity, EPO epo) {
        boolean z = false;
        if (!C0et.A0U.equals(bugReportActivity.A0E.get()) && epo == EPO.A0X && 1BK.A0N(bugReportActivity.A07).AZk(2342157464508440530L)) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A1D(com.facebook.bugreporter.activity.BugReportActivity r301, java.lang.Integer r302, boolean r303, boolean r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bugreporter.activity.BugReportActivity.A1D(com.facebook.bugreporter.activity.BugReportActivity, java.lang.Integer, boolean, boolean, boolean):boolean");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c2, code lost:
    
        if (r306 == null) goto L11;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bugreporter.activity.BugReportActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    public String AWg() {
        return "bug_report";
    }

    public Long Am7() {
        return 573103416622074L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        long j = this.A02.A06;
        try {
            06Z BDe = BDe();
            if (C0D1.A01(BDe)) {
                if (BDe.A1V()) {
                    for (Fragment fragment : BDe.A0T.A0A()) {
                        if (fragment.isVisible() && fragment.mTag != null) {
                            if (fragment instanceof NavigableFragment) {
                                ((NavigableFragment) fragment).Crb(this.A04);
                            }
                            DKF.A0G(this.A0B).A01(j, fragment.mTag);
                            return;
                        }
                    }
                    return;
                }
                FFl fFl = (FFl) this.A0A.get();
                1BK.A1E(fFl.A02).execute(new G1x(this.A02.A09, fFl));
                UserFlowLogger A0Z = 4YV.A0Z(DKF.A0G(this.A0B).A00);
                A0Z.flowEndCancel(DKH.A06(A0Z, j), "back_pressed");
                FAc A0H = DKF.A0H(this.A09);
                String valueOf = String.valueOf(j);
                EPO epo = this.A02.A0B;
                11T.A0F(epo, 1);
                4YU.A1P(7zP.A0e(A0H.A00).markEventBuilder(30539800, "back_button_exit").annotate("bug_report_id", valueOf), Property.SYMBOL_Z_ORDER_SOURCE, epo.name);
            }
            finish();
        } catch (IllegalStateException unused) {
            UserFlowLogger A0Z2 = 4YV.A0Z(DKF.A0G(this.A0B).A00);
            A0Z2.flowEndCancel(DKH.A06(A0Z2, j), "back_pressed");
            super.onBackPressed();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("reporter_config", 0Gm.A00(this.A01));
        bundle.putParcelable("anrreport", new OpaqueParcelable(new BugReport(this.A02)));
    }
}
