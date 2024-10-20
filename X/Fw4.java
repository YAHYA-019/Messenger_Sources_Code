package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.facebook.bugreporter.activity.BugReportActivity;
import com.facebook.bugreporter.core.model.BugReport;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.google.common.base.Optional;
import java.util.concurrent.CancellationException;

/* loaded from: Fw4.class */
public final class Fw4 implements 1K9 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ F6w A01;
    public final /* synthetic */ 5TL A02;
    public final /* synthetic */ GKR A03;
    public final /* synthetic */ String A04;

    public Fw4(F6w f6w, 5TL r303, GKR gkr, String str, long j) {
        this.A02 = r303;
        this.A03 = gkr;
        this.A01 = f6w;
        this.A00 = j;
        this.A04 = str;
    }

    public void onFailure(Throwable th) {
        F6w f6w = this.A01;
        GHa gHa = f6w.A03;
        if (gHa != null) {
            gHa.Blx();
        }
        5TL r0 = this.A02;
        for (GHa gHa2 : r0.A05.A00()) {
            if (gHa2 != null) {
                gHa2.Blx();
            }
        }
        FEF fef = (FEF) r0.A06.get();
        long j = this.A00;
        4YV.A0Z(fef.A00).flowMarkError(FEF.A00(fef, j), "BuildReportWriterFail", 4YV.A0u(th));
        if (!(th instanceof CancellationException)) {
            0fH.A0w("BugReporter.onBugReportFailure", "Failed to create bug report", th);
        }
        ((FAc) r0.A07.get()).A04(f6w.A05, this.A04, th.getMessage(), j, false);
        r0.A01 = false;
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        BugReport bugReport = (BugReport) obj;
        FbH fbH = this.A03;
        F6w f6w = this.A01;
        Optional optional = f6w.A07;
        if (optional.isPresent()) {
            fbH = new FbH(fbH, AnonymousClass001.A05(optional.get()));
        }
        5TL r0 = this.A02;
        FEF fef = (FEF) r0.A06.get();
        long j = this.A00;
        4YV.A0Z(fef.A00).flowMarkPoint(FEF.A00(fef, j), "LaunchBugReportActivity");
        Context context = (Context) f6w.A0K.get();
        if (context != null) {
            Intent A12 = BugReportActivity.A12(context, fbH, bugReport);
            A12.putExtra(1BJ.A00(13), Qyn.A00(bugReport));
            if (context instanceof Activity) {
                0LS.A07((Activity) context, A12, 18067);
            } else {
                try {
                    0LS.A0A(context, A12);
                } catch (ActivityNotFoundException e) {
                    0fH.A0s(AbstractC00603o4.A00(13), "Failed to launch BugReportActivity", e);
                    Ezd A0G = DKF.A0G(r0.A0C);
                    String obj2 = e.toString();
                    UserFlowLogger A0Z = 4YV.A0Z(A0G.A00);
                    A0Z.flowEndFail(DKH.A06(A0Z, j), "launch_bugreportactivity_failed", obj2);
                    FFg A0Q = DKF.A0Q(r0.A0E);
                    String obj3 = e.toString();
                    11T.A0F(obj3, 0);
                    FFg.A01(A0Q, "fail_reason", obj3);
                    A0Q.A04(e.toString());
                }
            }
        }
        ((FAc) r0.A07.get()).A04(f6w.A05, this.A04, (String) null, j, true);
        r0.A01 = false;
    }
}
