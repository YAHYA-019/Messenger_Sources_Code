package X;

import java.util.HashMap;

/* loaded from: C3j.class */
public final class C3j {
    public final 1De A00;
    public final 1Br A01;
    public final HashMap A02 = AnonymousClass001.A0u();

    public C3j(1De r302) {
        this.A00 = r302;
        this.A01 = 7zM.A0h(r302, 81947);
    }

    public final boolean A00(long j) {
        boolean containsKey;
        synchronized (this) {
            containsKey = this.A02.containsKey(Long.valueOf(j));
        }
        return containsKey;
    }
}
