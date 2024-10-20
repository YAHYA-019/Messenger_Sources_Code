package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* renamed from: X.2ap, reason: invalid class name */
/* loaded from: 2ap.class */
public abstract class C2ap extends C2aq {
    public static final String __redex_internal_original_name = "DispatchedTask";
    public int A00;

    public void A09(Throwable th) {
        if (this instanceof C2ao) {
            return;
        }
        C2s7 c2s7 = (C2s7) this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2s7.A04;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c2s7);
            if (obj instanceof 2sH) {
                throw AnonymousClass001.A0N("Not completed");
            }
            if (obj instanceof C2s6) {
                return;
            }
            if (obj instanceof 45D) {
                45D r0 = (45D) obj;
                if (r0.A02 != null) {
                    throw AnonymousClass001.A0N("Must be called at most once");
                }
                Object obj2 = r0.A01;
                AnonymousClass457 anonymousClass457 = r0.A04;
                Function1 function1 = r0.A03;
                if (C2am.A00(c2s7, obj, new 45D(obj2, r0.A00, th, function1, anonymousClass457), atomicReferenceFieldUpdater)) {
                    if (anonymousClass457 != null) {
                        c2s7.A0J(th, anonymousClass457);
                    }
                    if (function1 != null) {
                        c2s7.A0I(th, function1);
                        return;
                    }
                    return;
                }
            } else if (C2am.A00(c2s7, obj, new 45D(obj, (Object) null, th, (Function1) null, (AnonymousClass457) null), atomicReferenceFieldUpdater)) {
                return;
            }
        }
    }

    public final void A0A(Throwable th, Throwable th2) {
        if (th == null) {
            if (th2 == null) {
                return;
            } else {
                th = th2;
            }
        } else if (th2 != null) {
            C0ra.A01(th, th2);
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Fatal exception in coroutines machinery for ");
        A0k.append(this);
        EZF.A00((this instanceof C2ao ? (C2ao) this : ((C2s7) this).A00).getContext(), new Error(AnonymousClass001.A0d(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", A0k), th));
    }

    public Throwable A0B(Object obj) {
        C2s6 c2s6;
        Throwable th = null;
        if ((obj instanceof C2s6) && (c2s6 = (C2s6) obj) != null) {
            th = c2s6.A00;
        }
        return th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        0DV r305;
        Object obj;
        boolean z = this instanceof C2ao;
        try {
            0DR r304 = z ? (C2ao) this : ((C2s7) this).A00;
            11T.A0I(r304, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2ao c2ao = (C2ao) r304;
            0DR r0 = c2ao.A02;
            Object obj2 = c2ao.A01;
            0DE context = r0.getContext();
            Object A00 = C2as.A00(obj2, context);
            32P A03 = A00 != C2as.A00 ? 2aL.A03(A00, r0, context) : null;
            try {
                0DE context2 = r0.getContext();
                if (z) {
                    C2ao c2ao2 = (C2ao) this;
                    obj = c2ao2.A00;
                    c2ao2.A00 = C2ar.A01;
                } else {
                    obj = C2s7.A04.get(this);
                }
                Throwable A0B = A0B(obj);
                if (A0B == null) {
                    int i = this.A00;
                    if (i == 1 || i == 2) {
                        C2a2 c2a2 = (C2a2) context2.get(C2a2.A00);
                        if (c2a2 != null && !c2a2.BQN()) {
                            CancellationException AbX = c2a2.AbX();
                            A09(AbX);
                            r0.resumeWith(new 0DV(AbX));
                        }
                    }
                    if ((this instanceof C2s7) && (obj instanceof 45D)) {
                        obj = ((45D) obj).A01;
                    }
                    r0.resumeWith(obj);
                } else {
                    r0.resumeWith(new 0DV(A0B));
                }
                A0A(null, 0DU.A00(04S.A00));
            } finally {
                if (A03 == null || A03.A0U()) {
                    C2as.A02(A00, context);
                }
            }
        } catch (Throwable th) {
            try {
                r305 = 04S.A00;
            } catch (Throwable th2) {
                r305 = new 0DV(th2);
            }
            A0A(th, 0DU.A00(r305));
        }
    }
}
