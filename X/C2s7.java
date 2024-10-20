package X;

import com.facebook.acra.constants.ActionId;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* renamed from: X.2s7, reason: invalid class name */
/* loaded from: 2s7.class */
public class C2s7 extends C2ap implements C2s8, C2s9, 0DS {
    public static final String __redex_internal_original_name = "CancellableContinuationImpl";
    public final 0DR A00;
    public final 0DE A01;
    public volatile /* synthetic */ int _decisionAndIndex$volatile;
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(C2s7.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(C2s7.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03 = AtomicReferenceFieldUpdater.newUpdater(C2s7.class, Object.class, "_parentHandle$volatile");

    public C2s7(int i, 0DR r303) {
        ((C2ap) this).A00 = i;
        this.A00 = r303;
        this.A01 = r303.getContext();
        this._decisionAndIndex$volatile = (-1) >>> 3;
        this._state$volatile = 2sG.A00;
    }

    public static final Object A00(Object obj, Function1 function1, 2sH r303, int i) {
        if ((obj instanceof C2s6) || (!(i == 1 || i == 2) || (function1 == null && !(r303 instanceof AnonymousClass457)))) {
            return obj;
        }
        return new 45D(obj, (Object) null, (Throwable) null, function1, r303 instanceof AnonymousClass457 ? (AnonymousClass457) r303 : null);
    }

    private final C2a8 A01() {
        C2a2 c2a2 = (C2a2) this.A01.get(C2a2.A00);
        if (c2a2 == null) {
            return null;
        }
        C2a8 BQI = c2a2.BQI(new 2aB(this) { // from class: X.2sI
            public final C2s7 A00;

            {
                this.A00 = this;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                A05((Throwable) obj);
                return 04S.A00;
            }
        }, true, true);
        C2am.A00(this, null, BQI, A03);
        return BQI;
    }

    public static final 0DJ A02(Object obj, Function1 function1, C2s7 c2s7) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj2 = atomicReferenceFieldUpdater.get(c2s7);
            if (!(obj2 instanceof 2sH)) {
                return null;
            }
        } while (!C2am.A00(c2s7, obj2, A00(obj, function1, (2sH) obj2, ((C2ap) c2s7).A00), atomicReferenceFieldUpdater));
        if (!A08(c2s7)) {
            c2s7.A0G();
        }
        return 5RX.A00;
    }

    private final void A03(Object obj, Function1 function1, int i) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof 2sH)) {
                if (obj2 instanceof C04944cd) {
                    C2s6 c2s6 = (C2s6) obj2;
                    if (C04944cd.A00.compareAndSet(c2s6, 0, 1)) {
                        if (function1 != null) {
                            A0I(c2s6.A00, function1);
                            return;
                        }
                        return;
                    }
                }
                throw 1BL.A0h(obj, "Already resumed, but proposed with update ", AnonymousClass001.A0k());
            }
        } while (!C2am.A00(this, obj2, A00(obj, function1, (2sH) obj2, i), atomicReferenceFieldUpdater));
        if (!A08(this)) {
            A0G();
        }
        A07(this, i);
    }

    public static final void A04(Object obj, C2s7 c2s7) {
        45D r306;
        boolean A00;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            Object obj2 = atomicReferenceFieldUpdater.get(c2s7);
            if (!(obj2 instanceof 2sG)) {
                if (!(obj2 instanceof AnonymousClass457) && !(obj2 instanceof 45B)) {
                    if (obj2 instanceof C2s6) {
                        C2s6 c2s6 = (C2s6) obj2;
                        if (C2s6.A01.compareAndSet(c2s6, 0, 1)) {
                            if (obj2 instanceof C04944cd) {
                                Throwable th = c2s6.A00;
                                if (obj instanceof AnonymousClass457) {
                                    c2s7.A0J(th, (AnonymousClass457) obj);
                                    return;
                                } else {
                                    11T.A0I(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                    c2s7.A05(th, (45B) obj);
                                    return;
                                }
                            }
                            return;
                        }
                    } else {
                        if (obj2 instanceof 45D) {
                            45D r0 = (45D) obj2;
                            if (r0.A04 == null) {
                                if (obj instanceof 45B) {
                                    return;
                                }
                                11T.A0I(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                                AnonymousClass457 anonymousClass457 = (AnonymousClass457) obj;
                                Throwable th2 = r0.A02;
                                if (th2 != null) {
                                    c2s7.A0J(th2, anonymousClass457);
                                    return;
                                } else {
                                    r306 = new 45D(r0.A01, r0.A00, th2, r0.A03, anonymousClass457);
                                }
                            }
                        } else {
                            if (obj instanceof 45B) {
                                return;
                            }
                            11T.A0I(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            r306 = new 45D(obj2, (Object) null, (Throwable) null, (Function1) null, (AnonymousClass457) obj);
                        }
                        A00 = C2am.A00(c2s7, obj2, r306, atomicReferenceFieldUpdater);
                    }
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("It's prohibited to register multiple handlers, tried to register ");
                A0k.append(obj);
                throw 1BL.A0h(obj2, ", already has ", A0k);
            }
            A00 = C2am.A00(c2s7, obj2, obj, atomicReferenceFieldUpdater);
        } while (!A00);
    }

    private final void A05(Throwable th, 45B r303) {
        int i = (-1) >>> 3;
        int i2 = A02.get(this) & i;
        if (i2 == i) {
            throw AnonymousClass001.A0N("The index for Segment.onCancellation(..) is broken");
        }
        try {
            r303.A06(th, this.A01, i2);
        } catch (Throwable th2) {
            EZF.A00(this.A01, new RuntimeException(AnonymousClass001.A0Z(this, "Exception in invokeOnCancellation handler for ", AnonymousClass001.A0k()), th2));
        }
    }

    /* JADX WARN: Finally extract failed */
    public static final void A06(0DR r301, C2ap c2ap, boolean z) {
        Object obj;
        if (c2ap instanceof C2ao) {
            C2ao c2ao = (C2ao) c2ap;
            obj = c2ao.A00;
            c2ao.A00 = C2ar.A01;
        } else {
            obj = A04.get(c2ap);
        }
        Throwable A0B = c2ap.A0B(obj);
        if (A0B != null) {
            obj = new 0DV(A0B);
        } else if ((c2ap instanceof C2s7) && (obj instanceof 45D)) {
            obj = ((45D) obj).A01;
        }
        if (!z) {
            r301.resumeWith(obj);
            return;
        }
        11T.A0I(r301, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C2ao c2ao2 = (C2ao) r301;
        0DR r0 = c2ao2.A02;
        Object obj2 = c2ao2.A01;
        0DE context = r0.getContext();
        Object A00 = C2as.A00(obj2, context);
        32P A032 = A00 != C2as.A00 ? 2aL.A03(A00, r0, context) : null;
        try {
            r0.resumeWith(obj);
            if (A032 == null || A032.A0U()) {
                C2as.A02(A00, context);
            }
        } catch (Throwable th) {
            if (A032 == null || A032.A0U()) {
                C2as.A02(A00, context);
            }
            throw th;
        }
    }

    public static final void A07(C2s7 c2s7, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(c2s7);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw AnonymousClass001.A0N(AnonymousClass000.A00(ActionId.MQTT_CONNECTING));
                }
                boolean z = true;
                0DR r0 = c2s7.A00;
                if (i != 4) {
                    z = false;
                    if (r0 instanceof C2ao) {
                        boolean z2 = true;
                        if (i != 1 && i != 2) {
                            z2 = false;
                        }
                        int i4 = ((C2ap) c2s7).A00;
                        boolean z3 = true;
                        if (i4 != 1 && i4 != 2) {
                            z3 = false;
                        }
                        if (z2 == z3) {
                            2Zs r02 = ((C2ao) r0).A03;
                            0DE context = r0.getContext();
                            if (r02.isDispatchNeeded(context)) {
                                r02.dispatch(context, c2s7);
                                return;
                            }
                            C2ai A00 = 44Y.A00();
                            long j = A00.A00;
                            if (j >= 4294967296L) {
                                A00.A03(c2s7);
                                return;
                            }
                            A00.A00 = j + 4294967296L;
                            try {
                                A06(r0, c2s7, true);
                                do {
                                } while (A00.A05());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                }
                A06(r0, c2s7, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c2s7, i2, 1073741824 + (((-1) >>> 3) & i2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (X.C2ao.A04.get(r0) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A08(X.C2s7 r301) {
        /*
            r0 = r301
            int r0 = r0.A00
            r302 = r0
            r0 = 2
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L2a
            r0 = r301
            X.0DR r0 = r0.A00
            r304 = r0
            r0 = r304
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"
            X.11T.A0I(r0, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C2ao.A04
            r305 = r0
            r0 = r305
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L2f
        L2a:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L2f:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2s7.A08(X.2s7):boolean");
    }

    @Override // X.C2ap
    public Throwable A0B(Object obj) {
        Throwable A0B = super.A0B(obj);
        if (A0B == null) {
            A0B = null;
        }
        return A0B;
    }

    public final Object A0C() {
        int i;
        C2a2 c2a2;
        boolean A08 = A08(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw AnonymousClass001.A0N("Already suspended");
                }
                if (A08) {
                    A0H();
                }
                Object obj = A04.get(this);
                if (obj instanceof C2s6) {
                    throw ((C2s6) obj).A00;
                }
                int i3 = ((C2ap) this).A00;
                if ((i3 != 1 && i3 != 2) || (c2a2 = (C2a2) this.A01.get(C2a2.A00)) == null || c2a2.BQN()) {
                    if (obj instanceof 45D) {
                        obj = ((45D) obj).A01;
                    }
                    return obj;
                }
                CancellationException AbX = c2a2.AbX();
                A09(AbX);
                throw AbX;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (((-1) >>> 3) & i)));
        if (A03.get(this) == null) {
            A01();
        }
        if (A08) {
            A0H();
        }
        return 0Ds.A02;
    }

    public String A0D() {
        return "CancellableContinuation";
    }

    public Throwable A0E(C2a2 c2a2) {
        return c2a2.AbX();
    }

    public void A0F() {
        C2a8 A01 = A01();
        if (A01 == null || !BRC()) {
            return;
        }
        A01.dispose();
        A03.set(this, C2a7.A00);
    }

    public final void A0G() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        C2a8 c2a8 = (C2a8) atomicReferenceFieldUpdater.get(this);
        if (c2a8 != null) {
            c2a8.dispose();
            atomicReferenceFieldUpdater.set(this, C2a7.A00);
        }
    }

    public final void A0H() {
        0DJ r0;
        0DR r02 = this.A00;
        if (!(r02 instanceof C2ao) || r02 == null) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2ao.A04;
        do {
            Object obj = atomicReferenceFieldUpdater.get(r02);
            r0 = C2ar.A00;
            if (obj != r0) {
                if (!(obj instanceof Throwable)) {
                    throw 1BL.A0h(obj, "Inconsistent state ", AnonymousClass001.A0k());
                }
                if (!C2am.A00(r02, obj, null, atomicReferenceFieldUpdater)) {
                    throw AnonymousClass001.A0L("Failed requirement.");
                }
                Throwable th = (Throwable) obj;
                if (th != null) {
                    A0G();
                    AE2(th);
                    return;
                }
                return;
            }
        } while (!C2am.A00(r02, r0, this, atomicReferenceFieldUpdater));
    }

    public final void A0I(Throwable th, Function1 function1) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            EZF.A00(this.A01, new RuntimeException(AnonymousClass001.A0Z(this, "Exception in resume onCancellation handler for ", AnonymousClass001.A0k()), th2));
        }
    }

    public final void A0J(Throwable th, AnonymousClass457 anonymousClass457) {
        try {
            anonymousClass457.A05(th);
        } catch (Throwable th2) {
            EZF.A00(this.A01, new RuntimeException(AnonymousClass001.A0Z(this, "Exception in invokeOnCancellation handler for ", AnonymousClass001.A0k()), th2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.2s6, X.4cd, java.lang.Object] */
    @Override // X.C2s8
    public boolean AE2(Throwable th) {
        Object obj;
        boolean z;
        ?? c2s6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            boolean z2 = false;
            if (!(obj instanceof 2sH)) {
                return false;
            }
            z = obj instanceof AnonymousClass457;
            if (z || (obj instanceof 45B)) {
                z2 = true;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C04944cd.A00;
            Throwable th2 = th;
            if (th == null) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Continuation ");
                A0k.append(this);
                th2 = new CancellationException(AnonymousClass001.A0d(" was cancelled normally", A0k));
            }
            c2s6 = new C2s6(th2, z2);
            c2s6._resumed$volatile = 0;
        } while (!C2am.A00(this, obj, c2s6, atomicReferenceFieldUpdater));
        if (z) {
            A0J(th, (AnonymousClass457) obj);
        } else if (obj instanceof 45B) {
            A05(th, (45B) obj);
        }
        if (!A08(this)) {
            A0G();
        }
        A07(this, ((C2ap) this).A00);
        return true;
    }

    @Override // X.C2s8
    public void AGx(Object obj) {
        A07(this, ((C2ap) this).A00);
    }

    @Override // X.C2s8
    public void BQE(final Function1 function1) {
        if (!(function1 instanceof AnonymousClass457)) {
            function1 = new AnonymousClass457(function1) { // from class: X.4kK
                public final Function1 A00;

                {
                    this.A00 = function1;
                }

                @Override // X.AnonymousClass458
                public void A05(Throwable th) {
                    this.A00.invoke(th);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    A05((Throwable) obj);
                    return 04S.A00;
                }

                public String toString() {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("InvokeOnCancel[");
                    A0k.append(AnonymousClass001.A0X(this.A00));
                    A0k.append('@');
                    return 4YW.A07(Integer.toHexString(System.identityHashCode(this)), A0k);
                }
            };
        }
        A04(function1, this);
    }

    @Override // X.C2s9
    public void BQF(45B r302, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = (-1) >>> 3;
            if ((i2 & i3) != i3) {
                throw AnonymousClass001.A0N("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        A04(r302, this);
    }

    @Override // X.C2s8
    public boolean BQN() {
        return A04.get(this) instanceof 2sH;
    }

    @Override // X.C2s8
    public boolean BRC() {
        return !(A04.get(this) instanceof 2sH);
    }

    @Override // X.C2s8
    public void CiL(Function1 function1, Object obj) {
        A03(obj, function1, ((C2ap) this).A00);
    }

    @Override // X.C2s8
    public void CiQ(Object obj, 2Zs r303) {
        C2ao c2ao;
        0DR r0 = this.A00;
        2Zs r307 = null;
        if ((r0 instanceof C2ao) && (c2ao = (C2ao) r0) != null) {
            r307 = c2ao.A03;
        }
        A03(obj, null, r307 == r303 ? 4 : ((C2ap) this).A00);
    }

    @Override // X.C2s8
    public Object D5M(Object obj, Object obj2, Function1 function1) {
        return A02(obj, function1, this);
    }

    public 0DS getCallerFrame() {
        0DS r0 = this.A00;
        if (r0 instanceof 0DS) {
            return r0;
        }
        return null;
    }

    public 0DE getContext() {
        return this.A01;
    }

    public void resumeWith(Object obj) {
        Throwable A00 = 0DU.A00(obj);
        if (A00 != null) {
            obj = new C2s6(A00, false);
        }
        A03(obj, null, ((C2ap) this).A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A0D());
        sb.append('(');
        sb.append(3HR.A00(this.A00));
        sb.append("){");
        Object obj = A04.get(this);
        sb.append(obj instanceof 2sH ? "Active" : obj instanceof C04944cd ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
