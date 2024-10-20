package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: Hpe.class */
public final class Hpe {
    public final Hrp A00;
    public final HoA A01;
    public final JDW A02;
    public final String A03;
    public final Collection A04;

    public Hpe(Hrp hrp, HoA hoA, JDW jdw, String str, Collection collection) {
        this.A01 = hoA;
        this.A00 = hrp;
        this.A04 = collection;
        this.A02 = jdw;
        this.A03 = str;
    }

    public final void A00(String str) {
        try {
            HoA hoA = this.A01;
            Hrp hrp = this.A00;
            I96 A00 = hoA.A00(hrp);
            java.util.Map map = I96.A05;
            Iterator it = A00.A01("").iterator();
            while (it.hasNext()) {
                hrp.A00((GjE) it.next(), 0S2.A02, null, str, null, null);
            }
        } catch (Throwable th) {
            0fH.A0p("MediaAccuracySnapshotUploader", "Failed to send media accuracy skip events", th);
        }
    }
}
