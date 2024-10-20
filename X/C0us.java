package X;

import android.os.Looper;
import android.os.Message;
import com.facebook.fury.context.ReqContext;

/* renamed from: X.0us, reason: invalid class name */
/* loaded from: 0us.class */
public final class C0us implements 0Wr {
    public Class A00;
    public Class A01;
    public ReqContext A02;

    public void AT4(Message message) {
        ReqContext reqContext = this.A02;
        if (reqContext != null) {
            reqContext.close();
            1EK.A03();
            this.A02 = null;
        }
    }

    public void AT7() {
    }

    public void D1b(Message message) {
        11T.A0F(message, 0);
        if (message.getCallback() != null) {
            Class<?> cls = message.getCallback().getClass();
            if (11T.A0O(cls, this.A00) || 11T.A0O(cls, this.A01)) {
                return;
            }
        }
        if (message.getCallback() == null || !(message.getCallback() instanceof 0GI)) {
            1EK.A02();
            this.A02 = AnonymousClass018.A04("MessageQueueInterceptor", 0);
        }
    }

    public void D1n(Looper looper, String str) {
        0Wo r0 = 0Wo.A03;
        Class<?> cls = r0.A01;
        if (cls == null) {
            try {
                cls = Class.forName("android.view.View$PerformClick");
            } catch (Throwable unused) {
                cls = null;
            }
            r0.A01 = cls;
        }
        this.A00 = cls;
        Class<?> cls2 = r0.A02;
        if (cls2 == null) {
            try {
                cls2 = Class.forName("android.view.View$PerformLongClick");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            r0.A02 = cls2;
        }
        this.A01 = cls2;
    }

    public void D1x() {
    }
}
