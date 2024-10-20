package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.5tp, reason: invalid class name */
/* loaded from: 5tp.class */
public abstract class C5tp {
    public static final int A00(ThreadKey threadKey) {
        int i;
        11T.A0F(threadKey, 0);
        if (ThreadKey.A0Y(threadKey)) {
            i = 11;
            if (threadKey.A06 == C1yg.CARRIER_MESSAGING_ONE_TO_ONE) {
                i = 10;
            }
        } else {
            if (ThreadKey.A0n(threadKey)) {
                return 7;
            }
            if (ThreadKey.A0U(threadKey)) {
                if (threadKey.A0x() || threadKey.A06 == C1yg.OCCAMADILLO_ONE_TO_ONE) {
                    return 15;
                }
                i = 16;
                if (threadKey.A1H()) {
                    return 15;
                }
            } else if (ThreadKey.A0k(threadKey)) {
                i = 2;
                if (ThreadKey.A0j(threadKey)) {
                    return 1;
                }
            } else {
                i = 0;
                if (ThreadKey.A0R(threadKey)) {
                    return 201;
                }
            }
        }
        return i;
    }

    public static final int A01(InterfaceC07874l5 interfaceC07874l5) {
        1qX r0 = (1qX) interfaceC07874l5;
        if (r0.mResultSet.getCount() > 0) {
            return r0.mResultSet.getInteger(0, 1);
        }
        return 0;
    }
}
