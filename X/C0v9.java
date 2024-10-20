package X;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;

/* renamed from: X.0v9, reason: invalid class name */
/* loaded from: 0v9.class */
public final class C0v9 implements 0XB {
    public final MessageQueue A00 = Looper.getMainLooper().getQueue();
    public final 0Wt A01 = 0Wt.A04;

    public void AEO(0XC r302, StackTraceElement[] stackTraceElementArr) {
        Message message;
        int i;
        Message message2;
        0Wt r0 = this.A01;
        if (r0 != null) {
            MessageQueue messageQueue = this.A00;
            synchronized (messageQueue) {
                try {
                    message = (Message) r0.A00.get(messageQueue);
                } catch (Throwable unused) {
                    message = null;
                }
                int i2 = 0;
                while (true) {
                    i = i2;
                    if (message != null) {
                        try {
                            message2 = (Message) r0.A01.get(message);
                        } catch (Throwable unused2) {
                            message2 = null;
                        }
                        message = message2;
                        i2 = i + 1;
                    }
                }
            }
            r302.A00 = i;
        }
    }

    public void D6O() {
    }

    public String getName() {
        return "queue_size";
    }
}
