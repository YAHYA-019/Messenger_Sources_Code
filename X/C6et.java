package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;

/* renamed from: X.6et, reason: invalid class name */
/* loaded from: 6et.class */
public final class C6et implements Runnable {
    public static final String __redex_internal_original_name = "ThreadViewFragment$18";
    public final /* synthetic */ 2OZ A00;
    public final /* synthetic */ String A01;

    public C6et(2OZ r302, String str) {
        this.A00 = r302;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        2OZ r0 = this.A00;
        r0.A0M.AFx(r0.A0H, this.A01);
        UserKey A0L = ThreadKey.A0L(r0.A0H);
        if (A0L != null) {
            r0.A0M.AFY(A0L.id);
        }
    }
}
