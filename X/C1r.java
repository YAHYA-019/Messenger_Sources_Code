package X;

import android.content.Context;

/* loaded from: C1r.class */
public final class C1r {
    public final 0QO A00 = new 0QO(0);

    public final CJ7 A00(Context context) {
        CJ7 cj7;
        synchronized (this) {
            boolean A1N = AnonymousClass001.A1N(1XU.A00(context) ? 1 : 0);
            0QO r0 = this.A00;
            Integer valueOf = Integer.valueOf(A1N ? 1 : 0);
            cj7 = (CJ7) r0.get(valueOf);
            if (cj7 == null) {
                cj7 = (CJ7) 1Bn.A0A(84182);
                r0.put(valueOf, cj7);
            }
        }
        return cj7;
    }
}
