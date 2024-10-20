package X;

import com.facebook.messaging.model.messages.Message;

/* renamed from: X.62a, reason: invalid class name */
/* loaded from: 62a.class */
public final class C62a {
    public final 1Br A00 = 1Bq.A00(32769);
    public final 1Br A01 = 1Bq.A00(16385);

    public static final boolean A00(C62a c62a, AnonymousClass624 anonymousClass624) {
        boolean z = false;
        if (anonymousClass624 instanceof AnonymousClass623) {
            Message Awk = ((AnonymousClass623) anonymousClass624).Awk();
            if (Awk.A01() != 5Pa.A03) {
                if (!C1q7.A0Q(Awk)) {
                    return ((C00653oY) c62a.A00.A00.get()).A02(Awk);
                }
                if (!((7WM) anonymousClass624).A02) {
                    z = true;
                }
            }
        }
        return z;
    }
}
