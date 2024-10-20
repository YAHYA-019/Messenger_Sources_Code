package X;

/* renamed from: X.1j3, reason: invalid class name */
/* loaded from: 1j3.class */
public final /* synthetic */ class C1j3 implements Runnable {
    public static final String __redex_internal_original_name = "EventBuilder$$ExternalSyntheticLambda0";
    public final /* synthetic */ 1Rf A00;
    public final /* synthetic */ 1OH A01;
    public final /* synthetic */ 07S A02;
    public final /* synthetic */ StackTraceElement[] A03;

    public /* synthetic */ C1j3(1Rf r302, 1OH r303, 07S r304, StackTraceElement[] stackTraceElementArr) {
        this.A00 = r302;
        this.A01 = r303;
        this.A02 = r304;
        this.A03 = stackTraceElementArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        1Rf r0 = this.A00;
        1OH r02 = this.A01;
        07S r03 = this.A02;
        StackTraceElement[] stackTraceElementArr = this.A03;
        String str = r0.A0B;
        02W.A03("EventBuilder was not acquired: Event name null", str);
        1Rf.A03(r0, r02, r03, str, stackTraceElementArr);
    }
}
