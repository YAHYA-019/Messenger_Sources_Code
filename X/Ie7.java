package X;

import java.util.Collections;
import java.util.List;

/* loaded from: Ie7.class */
public final class Ie7 implements JGJ {
    public final int A00;

    public Ie7(int i) {
        this.A00 = i;
    }

    public int[] B4M(List list, int i) {
        11T.A0F(list, 1);
        Object min = Collections.min(list, new J4j(this, 2));
        11T.A0A(min);
        return (int[]) min;
    }
}
