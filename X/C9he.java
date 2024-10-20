package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.quicklog.reliability.UserFlowConfig;
import java.util.WeakHashMap;

/* renamed from: X.9he, reason: invalid class name */
/* loaded from: 9he.class */
public final class C9he {
    public final 1Br A00 = 7zM.A0T();
    public final java.util.Map A01 = new WeakHashMap();

    public static final void A00(ThreadKey threadKey, C9he c9he) {
        java.util.Map map = c9he.A01;
        synchronized (map) {
            map.remove(threadKey);
        }
    }

    public final CJ2 A01(C5nv c5nv, ThreadKey threadKey, int i) {
        StringBuilder A0k;
        String str;
        java.util.Map map = this.A01;
        synchronized (map) {
            CJ2 cj2 = (CJ2) map.get(threadKey);
            if (cj2 != null) {
                return cj2;
            }
            long generateNewFlowId = c5nv.A00() ? 4YV.A0Z(this.A00).generateNewFlowId(392445811) : c5nv == C5nv.A03 ? 4YV.A0Z(this.A00).generateNewFlowId(975580492) : 0L;
            String str2 = threadKey.A0z() ? "armadillo_thread" : "open_thread";
            if (i == 2) {
                A0k = AnonymousClass001.A0k();
                str = "inbox_";
            } else if (i == 3) {
                A0k = AnonymousClass001.A0k();
                str = "search_";
            } else if (i == 4) {
                A0k = AnonymousClass001.A0k();
                str = "chat_head_";
            } else if (i == 5) {
                A0k = AnonymousClass001.A0k();
                str = "notification_";
            } else if (i != 6) {
                A0k = AnonymousClass001.A0k();
                str = "unknown_";
            } else {
                A0k = AnonymousClass001.A0k();
                str = "new_message_";
            }
            CJ2 cj22 = new CJ2(c5nv, threadKey, this, new UserFlowConfig(1BL.A0u(str, str2, A0k), false), 4YV.A0Z(this.A00), generateNewFlowId);
            map.put(threadKey, cj22);
            return cj22;
        }
    }

    public final CJ2 A02(ThreadKey threadKey) {
        CJ2 cj2;
        java.util.Map map = this.A01;
        synchronized (map) {
            cj2 = (CJ2) map.get(threadKey);
        }
        return cj2;
    }
}
