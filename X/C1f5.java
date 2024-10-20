package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1f5, reason: invalid class name */
/* loaded from: 1f5.class */
public final class C1f5 {
    public static C1f5 A01;
    public final Handler A00;

    public C1f5(final Looper looper, final C1f7 c1f7, final C1e5 c1e5) {
        this.A00 = new Handler(looper, c1f7, c1e5) { // from class: X.1f8
            public C1e5 A00;
            public final C1f7 A01;

            {
                this.A00 = c1e5;
                this.A01 = c1f7;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Object obj = message.obj;
                if (obj instanceof 1fB) {
                    1fB r0 = (1fB) obj;
                    try {
                        if (r0.A06(true)) {
                            C1f7 c1f72 = this.A01;
                            if (c1f72 != null) {
                                c1f72.A00(r0, message.arg1, message.arg2, true);
                            }
                        }
                    } catch (Error | Exception e) {
                        this.A00.A03(r0, e);
                    }
                }
            }
        };
    }
}
