package X;

import java.io.Serializable;

/* renamed from: X.01h, reason: invalid class name */
/* loaded from: 01h.class */
public final class C01h implements C01i, Serializable {
    public C00m initializer;
    public volatile Object _value = C01j.A00;
    public final Object lock = this;

    public C01h(C00m c00m) {
        this.initializer = c00m;
    }

    private final Object writeReplace() {
        return new 0Dd(getValue());
    }

    @Override // X.C01i
    public Object getValue() {
        Object obj;
        Object obj2 = this._value;
        C01j c01j = C01j.A00;
        if (obj2 != c01j) {
            return obj2;
        }
        synchronized (this.lock) {
            obj = this._value;
            if (obj == c01j) {
                C00m c00m = this.initializer;
                11T.A0D(c00m);
                obj = c00m.invoke();
                this._value = obj;
                this.initializer = null;
            }
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
