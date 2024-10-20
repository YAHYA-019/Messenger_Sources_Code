package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.bugreporter.core.model.BugReport;
import com.facebook.common.build.BuildConstants;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: Fw7.class */
public final class Fw7 implements 1K9 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Evi A02;
    public final /* synthetic */ ExV A03;
    public final /* synthetic */ E16 A04;
    public final /* synthetic */ 1K9 A05;

    public Fw7(Context context, Evi evi, ExV exV, E16 e16, 1K9 r306, long j) {
        this.A02 = evi;
        this.A00 = j;
        this.A03 = exV;
        this.A04 = e16;
        this.A01 = context;
        this.A05 = r306;
    }

    public void onFailure(Throwable th) {
        0fH.A0p("BugReportSender", "failure in finalizing bug report", th);
        Evi evi = this.A02;
        evi.A02.post(new Fze(evi));
        FAc A0H = DKF.A0H(evi.A07);
        long j = this.A00;
        A0H.A06(this.A03.A0B, String.valueOf(j), th, false);
        Ezd A0G = DKF.A0G(evi.A0D);
        String obj = th.toString();
        UserFlowLogger A0Z = 4YV.A0Z(A0G.A00);
        A0Z.flowEndFail(DKH.A06(A0Z, j), "finalize_bug_report_failed", obj);
        E16 e16 = this.A04;
        1Br r0 = e16.A00;
        e16.A07(4YV.A0Z(r0), "fail_reason", "failed to finalize bug report");
        e16.A05(4YV.A0Z(r0), "failed to finalize bug report");
        evi.A00(this.A01);
        this.A05.onFailure(th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        ExV exV = (ExV) obj;
        Evi evi = this.A02;
        FAc A0H = DKF.A0H(evi.A07);
        long j = this.A00;
        A0H.A06(this.A03.A0B, String.valueOf(j), (Throwable) null, true);
        DKF.A0G(evi.A0D).A00(j, "finalize_bug_report_succeeded");
        0fH.A0j("BugReportSender", "successfully finalized bug report");
        if (exV != null) {
            evi.A04.get();
            long A01 = BuildConstants.A01();
            String valueOf = A01 >= 0 ? String.valueOf(A01) : "";
            C00i c00i = evi.A03;
            exV.A0a = ((0dB) c00i.get()).A03;
            exV.A0N = valueOf;
            if (evi.A0H.get() == 0Zf.A03) {
                str = null;
                exV.A0O = null;
            } else {
                exV.A0O = ((0dB) c00i.get()).A01;
                str = ((0dB) c00i.get()).A02;
            }
            exV.A0Z = str;
            ImmutableList A0f = DKH.A0f(exV.A0t);
            if (A0f != null && A0f.size() > 1) {
                exV.A0t = 1BK.A17(ImmutableList.copyOf((Collection) 1JW.A05(A0f)));
            }
            1BK.A1E(evi.A0F).execute(new G1v(this, new BugReport(exV)));
            ((FH6) evi.A0B.get()).A03(ENN.A08);
            boolean A1b = 7zM.A1b(DKH.A0f(exV.A0t));
            boolean A1b2 = 7zM.A1b(DKH.A0f(exV.A0u));
            if (A1b || A1b2) {
                FFg.A01(DKF.A0Q(evi.A0E), "media_attached", "report_state");
            }
            E16 e16 = this.A04;
            e16.A02(4YV.A0Z(e16.A00));
        } else {
            E16 e162 = this.A04;
            e162.A05(4YV.A0Z(e162.A00), "Finalized bug report without BugReport instance");
        }
        evi.A00(this.A01);
        Intent A05 = AbF.A05();
        A05.putExtra("isSendClickedFlag", true);
        this.A05.onSuccess(A05);
    }
}
