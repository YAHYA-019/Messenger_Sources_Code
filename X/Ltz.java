package X;

import java.util.concurrent.ThreadFactory;

/* loaded from: Ltz.class */
public final class Ltz implements ThreadFactory {
    public final int A00;
    public final String A01;

    public Ltz(String str, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = str;
        } else {
            this.A01 = str;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.A00;
        String str = this.A01;
        return i != 0 ? new Thread(runnable, str) : new Thread(runnable, str);
    }
}
