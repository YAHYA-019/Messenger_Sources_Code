package X;

import android.os.Bundle;

/* renamed from: X.6E2, reason: invalid class name */
/* loaded from: 6E2.class */
public final class C6E2 implements Runnable {
    public static final String __redex_internal_original_name = "MessagesSyncQueueOperationStarter$1";
    public final /* synthetic */ 1Ho A00;
    public final /* synthetic */ 6E0 A01;

    public C6E2(1Ho r302, 6E0 r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        6E0 r0 = this.A01;
        r0.A02.poll();
        r0.A02(new Bundle(this.A00.A0D));
    }
}
