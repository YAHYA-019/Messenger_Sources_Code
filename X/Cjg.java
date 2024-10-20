package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.customthreads.name.dialog.ThreadNameSettingDialogFragment;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Cjg.class */
public final /* synthetic */ class Cjg implements C5xz {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ CallerContext A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ Cjg(06Z r302, CallerContext callerContext, String str) {
        this.A02 = str;
        this.A01 = callerContext;
        this.A00 = r302;
    }

    @Override // X.C5xz
    public final void CHX(ThreadSummary threadSummary) {
        String str = this.A02;
        CallerContext callerContext = this.A01;
        06Z r0 = this.A00;
        if (threadSummary != null) {
            if (!1JF.A0B(str)) {
                C1zm A0g = AbF.A0g(threadSummary);
                A0g.A20 = str;
                threadSummary = AbF.A0i(A0g);
            }
            ThreadNameSettingDialogFragment.A05(r0, callerContext, threadSummary);
        }
    }
}
