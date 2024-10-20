package X;

import java.util.ArrayList;

/* renamed from: X.1ct, reason: invalid class name */
/* loaded from: 1ct.class */
public final class C1ct implements Runnable {
    public static final String __redex_internal_original_name = "PushBugReportBuffer$1";
    public final /* synthetic */ 1PI A00;
    public final /* synthetic */ ArrayList A01;

    public C1ct(1PI r302, ArrayList arrayList) {
        this.A00 = r302;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        1PI.A02(this.A00, this.A01);
    }
}
