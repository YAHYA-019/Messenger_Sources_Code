package X;

/* renamed from: X.357, reason: invalid class name */
/* loaded from: 357.class */
public final class AnonymousClass357 extends AbstractRunnableC00191ad {
    public static final String __redex_internal_original_name = "JobOrchestratorImpl$1$1";
    public final /* synthetic */ C1vi A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass357(C1vi c1vi, boolean z) {
        super("JobOrchestratorManagementThread", "LoginLogoutUpdateMgmtJob");
        this.A00 = c1vi;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = this.A01;
        Boolean valueOf = Boolean.valueOf(z);
        C00j.A07("JobOrchestrator/mgmt/LoginLogoutUpdate/[%b]", valueOf, -1089293522);
        try {
            0fH.A0g(valueOf, "JobOrchestrator", "LoginLogoutUpdateMgmtJob [%b] Started...");
            C1vh c1vh = this.A00.A00;
            c1vh.A02.A02(z);
            c1vh.A01.A02(z);
            0fH.A0g(valueOf, "JobOrchestrator", "LoginLogoutUpdateMgmtJob [%b] Finished");
            C00j.A01(404318697);
        } catch (Throwable th) {
            C00j.A01(-482384092);
            throw th;
        }
    }
}
