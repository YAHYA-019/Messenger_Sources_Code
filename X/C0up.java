package X;

import android.os.Looper;
import android.os.Message;

/* renamed from: X.0up, reason: invalid class name */
/* loaded from: 0up.class */
public final class C0up implements 0Wr {
    public static final C0up A00 = new Object();

    public void AT4(Message message) {
        if (0V0.A01()) {
            0V1.A00();
        }
    }

    public void AT7() {
        if (0V0.A01()) {
            0V1.A00();
        }
    }

    public void D1b(Message message) {
        String A02;
        11T.A0F(message, 0);
        if (0V0.A01()) {
            StringBuilder A0k = AnonymousClass001.A0k();
            if (message.getTarget() != null) {
                A0k.append(AnonymousClass001.A0Y(message.getTarget()));
            }
            if (message.getCallback() != null) {
                A0k.append("/");
                A0k.append(AnonymousClass001.A0Y(message.getCallback()));
            } else {
                A0k.append("/what:");
                A0k.append(message.what);
            }
            if (A0k.length() > 127) {
                A02 = A0k.substring(0, 127);
                11T.A0D(A02);
            } else {
                A02 = 11T.A02(A0k);
            }
            0V0.A00(A02);
        }
    }

    public void D1n(Looper looper, String str) {
    }

    public void D1x() {
        if (0V0.A01()) {
            0V0.A00("nativePollOnce");
        }
    }
}
