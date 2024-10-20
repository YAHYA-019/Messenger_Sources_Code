package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: Lu0.class */
public final class Lu0 implements ThreadFactory {
    public final int A00;
    public final String A01;

    public Lu0(String str, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = str;
        } else {
            this.A01 = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ?? r0;
        int i;
        int i2 = this.A00;
        String str = this.A01;
        if (str != null) {
            new Thread(runnable, str);
            r0 = 3;
            i = 3;
        } else {
            new Thread(runnable, str);
            r0 = 10;
            i = 10;
        }
        r0.setPriority(i);
        return r0;
    }
}
