package X;

import com.facebook.msys.mca.MailboxFeature;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.20u, reason: invalid class name */
/* loaded from: 20u.class */
public final class C20u {
    public boolean A00;
    public final C20v A01;
    public final java.util.Map A02 = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.msys.mca.MailboxFeature, X.20v] */
    public C20u(1Uj r302) {
        this.A01 = new MailboxFeature(r302);
    }

    public 29E A00(int i) {
        java.util.Map map = this.A02;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            map.put(valueOf, new 29E());
        }
        return (29E) map.get(valueOf);
    }
}
