package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: I23.class */
public final class I23 {
    public static final Set A03;
    public 1PA A00;
    public 1BY A01;
    public final HxL A02 = new HxL();

    static {
        List asList = Arrays.asList(1F9.A0I, 1F9.A0M);
        0WH A07 = AbI.A07();
        if (asList != null) {
            A07.addAll(asList);
        }
        A03 = A07;
    }

    public I23(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
    }

    public void A00(1F9 r302, int i) {
        0WH A00 = HxL.A00(this.A02, i);
        0WH A07 = AbI.A07();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            HtT htT = (HtT) it.next();
            if (htT.A00 == r302) {
                A07.add(htT);
            }
        }
        Iterator it2 = A07.iterator();
        while (it2.hasNext()) {
            C2403Gc5.A06(((Grn) ((HtT) it2.next()).A01).A00);
        }
    }
}
