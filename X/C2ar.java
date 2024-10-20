package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.2ar, reason: invalid class name */
/* loaded from: 2ar.class */
public abstract class C2ar {
    public static final 0DJ A01 = new 0DJ("UNDEFINED");
    public static final 0DJ A00 = new 0DJ("REUSABLE_CLAIMED");

    public static final void A00(Object obj, 0DR r302) {
        if (!(r302 instanceof C2ao)) {
            r302.resumeWith(obj);
            return;
        }
        C2ao c2ao = (C2ao) r302;
        Object obj2 = obj;
        Throwable A002 = 0DU.A00(obj);
        if (A002 != null) {
            obj2 = new C2s6(A002, false);
        }
        2Zs r0 = c2ao.A03;
        0DR r02 = c2ao.A02;
        boolean isDispatchNeeded = r0.isDispatchNeeded(r02.getContext());
        if (isDispatchNeeded) {
            c2ao.A00 = obj2;
            ((C2ap) c2ao).A00 = 1;
            r0.dispatch(r02.getContext(), c2ao);
            return;
        }
        C2ai A003 = 44Y.A00();
        long j = A003.A00;
        if (j >= 4294967296L) {
            c2ao.A00 = obj2;
            ((C2ap) c2ao).A00 = 1;
            A003.A03(c2ao);
            return;
        }
        A003.A00 = j + 4294967296L;
        try {
            C2a2 c2a2 = (C2a2) r02.getContext().get(C2a2.A00);
            if (c2a2 == null || c2a2.BQN()) {
                Object obj3 = c2ao.A01;
                0DE context = r02.getContext();
                Object A004 = C2as.A00(obj3, context);
                32P A03 = A004 != C2as.A00 ? 2aL.A03(A004, r02, context) : null;
                try {
                    r02.resumeWith(obj);
                    if (A03 == null || A03.A0U()) {
                        C2as.A02(A004, context);
                    }
                } catch (Throwable th) {
                    if (A03 == null || A03.A0U()) {
                        C2as.A02(A004, context);
                    }
                    throw th;
                }
            } else {
                CancellationException AbX = c2a2.AbX();
                c2ao.A09(AbX);
                c2ao.resumeWith(new 0DV(AbX));
            }
            do {
            } while (A003.A05());
        } finally {
            try {
            } finally {
            }
        }
    }
}
