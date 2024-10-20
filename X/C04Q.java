package X;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.04Q, reason: invalid class name */
/* loaded from: 04Q.class */
public final class C04Q implements C01i, Serializable {
    public static final AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C04Q.class, Object.class, "_value");
    public volatile Object _value;

    /* renamed from: final, reason: not valid java name */
    public final Object f0final;
    public volatile C00m initializer;

    public C04Q(C00m c00m) {
        this.initializer = c00m;
        C01j c01j = C01j.A00;
        this._value = c01j;
        this.f0final = c01j;
    }

    private final Object writeReplace() {
        return new 0Dd(getValue());
    }

    @Override // X.C01i
    public Object getValue() {
        Object obj = this._value;
        C01j c01j = C01j.A00;
        if (obj == c01j) {
            C00m c00m = this.initializer;
            if (c00m != null) {
                obj = c00m.invoke();
                if (04T.A00(this, c01j, obj, A00)) {
                    this.initializer = null;
                }
            }
            return this._value;
        }
        return obj;
    }

    @Override // X.C01i
    public boolean isInitialized() {
        boolean z = false;
        if (this._value != C01j.A00) {
            z = true;
        }
        return z;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
