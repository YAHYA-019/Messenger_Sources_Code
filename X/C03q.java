package X;

import java.io.Serializable;

/* renamed from: X.03q, reason: invalid class name */
/* loaded from: 03q.class */
public final class C03q implements C01i, Serializable {
    public Object _value;
    public C00m initializer;

    private final Object writeReplace() {
        return new 0Dd(getValue());
    }

    @Override // X.C01i
    public Object getValue() {
        Object obj = this._value;
        if (obj == C01j.A00) {
            C00m c00m = this.initializer;
            11T.A0D(c00m);
            obj = c00m.invoke();
            this._value = obj;
            this.initializer = null;
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
