package X;

import java.util.List;

/* loaded from: Kij.class */
public final class Kij {
    public final List A00;
    public final List A01;
    public final List A02;

    public Kij(List list) {
        this.A01 = list;
        this.A00 = AbJ.A1B(list);
        this.A02 = AbJ.A1B(list);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return;
            }
            this.A00.add(new JjY(((LSO) ((Kk2) list.get(i2)).A01).A00));
            this.A02.add(new LBU(((LSO) ((Kk2) list.get(i2)).A00).A00));
            i = i2 + 1;
        }
    }
}
