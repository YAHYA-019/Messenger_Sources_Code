package X;

import java.io.Serializable;

/* loaded from: Jzp.class */
public final class Jzp extends L1J implements Serializable {
    public static final long serialVersionUID = 1;
    public final L1J _t1;
    public final L1J _t2;

    public Jzp(L1J l1j, L1J l1j2) {
        this._t1 = l1j;
        this._t2 = l1j2;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[ChainedTransformer(");
        JR0.A1G(A0k, this._t1);
        A0k.append(this._t2);
        return AnonymousClass001.A0d(")]", A0k);
    }
}
