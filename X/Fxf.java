package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: Fxf.class */
public final class Fxf implements GJi {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    @Override // X.GJi
    public void BiV(DKc dKc, GJj gJj, Object obj, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((GJi) it.next()).BiV(dKc, gJj, obj, str);
        }
    }

    @Override // X.GJi
    public void BlJ(DKc dKc, GJj gJj, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((GJi) it.next()).BlJ(dKc, gJj, str);
        }
    }

    @Override // X.GJi
    public void CJ4(G8M g8m, GJj gJj) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((GJi) it.next()).CJ4(g8m, gJj);
        }
    }
}
