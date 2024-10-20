package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.2ao, reason: invalid class name */
/* loaded from: 2ao.class */
public final class C2ao extends C2ap implements 0DR, 0DS {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(C2ao.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final String __redex_internal_original_name = "DispatchedContinuation";
    public Object A00;
    public final Object A01;
    public final 0DR A02;
    public final 2Zs A03;
    public volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public C2ao(0DR r302, 2Zs r303) {
        ((C2ap) this).A00 = -1;
        this.A03 = r303;
        this.A02 = r302;
        this.A00 = C2ar.A01;
        this.A01 = C2as.A01(r302.getContext());
    }

    public 0DS getCallerFrame() {
        0DS r0 = this.A02;
        if (r0 instanceof 0DS) {
            return r0;
        }
        return null;
    }

    public 0DE getContext() {
        return this.A02.getContext();
    }

    public void resumeWith(Object obj) {
        0DR r0 = this.A02;
        0DE context = r0.getContext();
        Object obj2 = obj;
        Throwable A00 = 0DU.A00(obj);
        if (A00 != null) {
            obj2 = new C2s6(A00, false);
        }
        2Zs r02 = this.A03;
        if (r02.isDispatchNeeded(context)) {
            this.A00 = obj2;
            ((C2ap) this).A00 = 0;
            r02.dispatch(context, this);
            return;
        }
        C2ai A002 = 44Y.A00();
        long j = A002.A00;
        if (j >= 4294967296L) {
            this.A00 = obj2;
            ((C2ap) this).A00 = 0;
            A002.A03(this);
            return;
        }
        A002.A00 = j + 4294967296L;
        try {
            0DE context2 = r0.getContext();
            Object A003 = C2as.A00(this.A01, context2);
            try {
                r0.resumeWith(obj);
                C2as.A02(A003, context2);
                do {
                } while (A002.A05());
            } catch (Throwable th) {
                C2as.A02(A003, context2);
                throw th;
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append(this.A03);
        sb.append(", ");
        sb.append(3HR.A00(this.A02));
        sb.append(']');
        return sb.toString();
    }
}
