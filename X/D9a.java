package X;

import com.facebook.common.callercontext.CallerContext;

/* loaded from: D9a.class */
public final class D9a implements Runnable {
    public static final String __redex_internal_original_name = "SyncConnectionHandler$1";
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ C54o A01;
    public final /* synthetic */ 54V A02;

    public D9a(CallerContext callerContext, C54o c54o, 54V r304) {
        this.A02 = r304;
        this.A01 = c54o;
        this.A00 = callerContext;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            54V r0 = this.A02;
            C54o c54o = this.A01;
            CallerContext callerContext = this.A00;
            synchronized (r0) {
                0fH.A0d(c54o, callerContext, "SyncConnectionHandler", "startEnsureSyncInBlueService, %s, %s");
                r0.A01(r0.A09.A00(c54o), callerContext).addListener(new S9K(r0), 1JU.A01);
            }
        } catch (Exception e) {
            0fH.A0t("SyncConnectionHandler", "Error trying to call ensureSync from a delay", e);
        }
    }
}
