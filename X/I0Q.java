package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: I0Q.class */
public final class I0Q {
    public BLV A00;
    public BLV A01;
    public BLG A02;
    public I3s A03;
    public String A04;
    public List A05;
    public Set A06 = AnonymousClass001.A0v();
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public static void A00(I0Q i0q, String str) {
        if (i0q.A06.contains(str)) {
            return;
        }
        HashSet A1E = AbF.A1E(i0q.A06);
        i0q.A06 = A1E;
        A1E.add(str);
    }
}
