package X;

import java.util.HashSet;
import java.util.Set;

/* loaded from: C5k.class */
public final class C5k {
    public BOf A00;
    public BOG A01;
    public BOd A02;
    public BOc A03;
    public String A04;
    public String A05;
    public Set A06 = AnonymousClass001.A0v();

    public void A00(BOG bog) {
        this.A01 = bog;
        if (this.A06.contains("creationVersion")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A06);
        this.A06 = A1E;
        A1E.add("creationVersion");
    }
}
