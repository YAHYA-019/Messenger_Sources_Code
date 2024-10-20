package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: Fki.class */
public final class Fki implements GKG {
    public GKG A00;
    public List A01;

    public static F4M A00(Fki fki, F4M f4m) {
        ArrayList arrayList = new ArrayList(fki.A01);
        arrayList.addAll(Arrays.asList(f4m.A00));
        return F4M.A00(arrayList);
    }

    public void A6B(Fwl fwl, GFH gfh) {
        this.A00.A6B(fwl, new Rt3(fwl, this, this, gfh));
    }

    public boolean ARR(Fwl fwl, F4M f4m) {
        return this.A00.ARR(fwl, A00(this, f4m));
    }

    public Object AqD(Fwl fwl) {
        return this.A00.BIm(fwl, F4M.A00(this.A01));
    }

    public Object BIm(Fwl fwl, F4M f4m) {
        return this.A00.BIm(fwl, A00(this, f4m));
    }

    public Object Cvz(Fwl fwl, F4M f4m, Object obj) {
        return this.A00.Cvz(fwl, A00(this, f4m), obj);
    }

    public void D7o(Object obj) {
        this.A00.D7o(obj);
    }
}
