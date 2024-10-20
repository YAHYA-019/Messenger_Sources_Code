package X;

import java.util.List;
import java.util.Set;

/* loaded from: Fkl.class */
public final class Fkl implements GFI {
    public GFI A00;
    public String A01;
    public final F6R A02;
    public final F7l A03;
    public final FFX A04;
    public final FyG A05;
    public final List A06;
    public final List A07;

    public Fkl(F6R f6r, F7l f7l, FFX ffx, GFI gfi, FyG fyG) {
        this.A07 = AbF.A1F();
        this.A06 = AbF.A1F();
        this.A05 = fyG;
        this.A03 = f7l;
        this.A04 = ffx;
        this.A00 = gfi;
        this.A02 = f6r;
    }

    public Fkl(FyG fyG) {
        this(new F6R(), FJ3.A03(fyG).A01, FJ3.A04(fyG), null, fyG);
    }

    public F6U A00(List list) {
        FwU fwU;
        if (list.isEmpty() || !((FwU) list.get(0)).A01) {
            fwU = new FwU(56, 10, false);
            fwU.put(32, list);
        } else {
            fwU = new FwU(56, 10, false);
            fwU.put(32, list);
            fwU.A01 = true;
            fwU.A03 = EaO.A00.incrementAndGet();
        }
        F7l f7l = this.A03;
        List list2 = this.A07;
        List list3 = this.A06;
        FFX ffx = this.A04;
        F6R f6r = this.A02;
        Set set = f6r.A05;
        String str = f6r.A02;
        if (str == null) {
            str = "null";
        }
        return new F6U(f7l, ffx, fwU, str, list2, list3, set);
    }

    public Object AaK(String str) {
        GFI gfi = this.A00;
        if (gfi == null) {
            return null;
        }
        return gfi.AaK(str);
    }
}
