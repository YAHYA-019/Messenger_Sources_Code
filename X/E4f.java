package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: E4f.class */
public final class E4f extends Fkh {
    public final F4M A00;
    public final WeakReference A01;

    public E4f(Fwl fwl, F4M f4m) {
        this.A01 = 7zL.A14(fwl);
        this.A00 = f4m;
    }

    public boolean Bgg(GKG gkg) {
        Fwl fwl = (Fwl) this.A01.get();
        if (fwl == null) {
            return false;
        }
        Object BIm = gkg.BIm(fwl, this.A00);
        Iterator it = super.A00.iterator();
        while (it.hasNext()) {
            ((GI1) it.next()).Bgb(BIm);
        }
        return true;
    }
}
