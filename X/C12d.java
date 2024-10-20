package X;

import java.io.Serializable;

/* renamed from: X.12d, reason: invalid class name */
/* loaded from: 12d.class */
public final class C12d implements Serializable {
    public static final long serialVersionUID = 0;
    public final 0DE[] elements;

    public C12d(0DE[] r302) {
        this.elements = r302;
    }

    private final Object readResolve() {
        0DE[] r0 = this.elements;
        0DE r303 = 0DL.A00;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return r303;
            }
            r303 = r303.plus(r0[i2]);
            i = i2 + 1;
        }
    }
}
