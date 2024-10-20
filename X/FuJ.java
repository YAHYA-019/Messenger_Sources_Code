package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: FuJ.class */
public final class FuJ implements 5Y3 {
    public final /* synthetic */ Fud A00;
    public final /* synthetic */ 1QE A01;

    public FuJ(Fud fud, 1QE r303) {
        this.A00 = fud;
        this.A01 = r303;
    }

    public /* bridge */ /* synthetic */ void CKJ(Object obj) {
        if (AnonymousClass001.A05(obj) != 0) {
            Fud fud = this.A00;
            Throwable th = new Throwable();
            1QE r0 = this.A01;
            Set set = fud.A07;
            synchronized (set) {
                new HashSet(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((2BS) it.next()).ByR(r0, "", th);
                }
            }
        }
    }
}
