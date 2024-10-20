package X;

import android.graphics.Rect;
import java.util.Iterator;

/* loaded from: Lgi.class */
public final class Lgi implements GHE {
    public final /* synthetic */ LCt A00;

    public Lgi(LCt lCt) {
        this.A00 = lCt;
    }

    public final void Acs(Rect rect) {
        LCt lCt = this.A00;
        if (LCt.A03(lCt)) {
            Iterator it = lCt.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("getRemainingHeight");
            }
        }
        rect.setEmpty();
    }
}
