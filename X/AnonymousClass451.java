package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.451, reason: invalid class name */
/* loaded from: 451.class */
public final class AnonymousClass451 implements C2a6 {
    public final C44y A00;
    public volatile /* synthetic */ Object _exceptionsHolder$volatile;
    public volatile /* synthetic */ int _isCompleting$volatile = 0;
    public volatile /* synthetic */ Object _rootCause$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass451.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass451.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass451.class, Object.class, "_exceptionsHolder$volatile");

    public AnonymousClass451(Throwable th, C44y c44y) {
        this.A00 = c44y;
        this._rootCause$volatile = th;
    }

    public final void A00(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj != null) {
            if (th == obj) {
                return;
            }
            atomicReferenceFieldUpdater = A02;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != null) {
                if (!(obj2 instanceof Throwable)) {
                    if (!(obj2 instanceof ArrayList)) {
                        throw 1BL.A0h(obj2, "State is ", AnonymousClass001.A0k());
                    }
                    ((AbstractCollection) obj2).add(th);
                    return;
                } else {
                    if (th != obj2) {
                        ArrayList A0t = AnonymousClass001.A0t(4);
                        A0t.add(obj2);
                        A0t.add(th);
                        atomicReferenceFieldUpdater.set(this, A0t);
                        return;
                    }
                    return;
                }
            }
        }
        atomicReferenceFieldUpdater.set(this, th);
    }

    @Override // X.C2a6
    public C44y Atz() {
        return this.A00;
    }

    @Override // X.C2a6
    public boolean BQN() {
        boolean z = false;
        if (A03.get(this) == null) {
            z = true;
        }
        return z;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Finishing[cancelling=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        A0k.append(AnonymousClass001.A1T(atomicReferenceFieldUpdater.get(this)));
        A0k.append(", completing=");
        A0k.append(AnonymousClass001.A1N(A01.get(this)));
        A0k.append(", rootCause=");
        A0k.append(atomicReferenceFieldUpdater.get(this));
        A0k.append(", exceptions=");
        A0k.append(A02.get(this));
        A0k.append(", list=");
        A0k.append(this.A00);
        return AnonymousClass001.A0g(A0k, ']');
    }
}
