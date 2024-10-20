package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: Ltv.class */
public final class Ltv implements ThreadFactory {
    public final int A00;

    public Ltv(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        switch (this.A00) {
            case 0:
                str = "BrowserLiteFragment-executor";
                return new Thread(runnable, str);
            case 1:
                str = "com.facebook.papaya.scheduling_thread";
                return new Thread(runnable, str);
            case 2:
                str = "com.facebook.papaya.random_thread";
                return new Thread(runnable, str);
            default:
                return null;
        }
    }
}
