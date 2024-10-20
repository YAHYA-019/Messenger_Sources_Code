package X;

import android.util.LruCache;
import com.facebook.auth.usersession.FbUserSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.1yi, reason: invalid class name */
/* loaded from: 1yi.class */
public final class C1yi implements C1yj {
    public static final SimpleDateFormat A02 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
    public final LruCache A01 = new LruCache(300);
    public final 1Br A00 = 1Bq.A00(99390);

    public static final void A00(C1yi c1yi, final String str) {
        final long now = ((C0dp) c1yi.A00.A00.get()).now();
        Object obj = new Object(now, str) { // from class: X.1yk
            public final long A00;
            public final String A01;

            {
                11T.A0F(str, 2);
                this.A00 = now;
                this.A01 = str;
            }

            public String toString() {
                return 0Pz.A0j(C1yi.A02.format(Long.valueOf(this.A00)), ": ", this.A01);
            }
        };
        c1yi.A01.put(obj, obj);
    }

    public static final void A01(C1yi c1yi, String str, String str2) {
        A00(c1yi, 0Pz.A0j("[mqtt]", str, str2 == null ? "" : 0Pz.A0W(": ", str2)));
    }

    @Override // X.C1yj
    public String Agd(FbUserSession fbUserSession) {
        ArrayList A17 = 1BK.A17(this.A01.snapshot().keySet());
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator it = A17.iterator();
        while (it.hasNext()) {
            A0k.append(it.next());
            A0k.append('\n');
        }
        return 11T.A02(A0k);
    }

    @Override // X.C1yj
    public String Age() {
        return "msys_android_debug_events.txt";
    }
}
