package X;

import java.io.Serializable;

/* renamed from: X.00q, reason: invalid class name */
/* loaded from: 00q.class */
public abstract class C00q implements C00r, Serializable {
    public final int arity;

    public C00q(int i) {
        this.arity = i;
    }

    @Override // X.C00r
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String A00 = 11H.A00(this);
        11T.A0A(A00);
        return A00;
    }
}
