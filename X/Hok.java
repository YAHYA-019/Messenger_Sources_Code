package X;

import java.util.List;

/* loaded from: Hok.class */
public final class Hok {
    public int A01;
    public int A00 = 0;
    public List A02 = AbF.A1F();
    public List A03 = AbF.A1F();

    public void A00() {
        synchronized (this) {
            this.A02.clear();
            this.A03.clear();
            this.A01 = 0;
        }
    }
}
