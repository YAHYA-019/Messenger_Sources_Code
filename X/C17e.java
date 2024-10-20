package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.17e, reason: invalid class name */
/* loaded from: 17e.class */
public final class C17e implements Runnable {
    public static final String __redex_internal_original_name = "FbnsConnectionManager$CallbackHandler$1";
    public final /* synthetic */ C0kv A00;

    public C17e(C0kv c0kv) {
        this.A00 = c0kv;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList A0s;
        C0kv c0kv = this.A00;
        C17n c17n = c0kv.A02;
        c17n.A0N.onConnectSent();
        if (c0kv.A01) {
            C0kv.A00(c0kv);
            18Q r0 = c17n.A14;
            18Q r02 = c0kv.A00;
            if (r0 == r02) {
                0fH.A0j(c17n.A0Y, "FastSend enabled");
                c17n.A0K();
                c17n.A0N.Bqp();
                synchronized (r02) {
                    A0s = AnonymousClass001.A0s();
                    List list = r02.A01;
                    if (list != null) {
                        A0s.addAll(list);
                    }
                }
                c17n.A0W(A0s);
            }
        }
    }
}
