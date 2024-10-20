package X;

import java.util.Set;

/* renamed from: X.1c5, reason: invalid class name */
/* loaded from: 1c5.class */
public abstract class C1c5 {
    public Object A02(Class cls) {
        C1bj A04 = A04(cls);
        if (A04 == null) {
            return null;
        }
        return A04.get();
    }

    public Set A03(Class cls) {
        return (Set) A05(cls).get();
    }

    public C1bj A04(Class cls) {
        1dR r0 = (1dR) this;
        if (r0.A01.contains(cls)) {
            return r0.A00.A04(cls);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    public C1bj A05(Class cls) {
        1dR r0 = (1dR) this;
        if (r0.A02.contains(cls)) {
            return r0.A00.A05(cls);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
