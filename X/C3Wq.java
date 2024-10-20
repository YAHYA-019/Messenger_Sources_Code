package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Wq, reason: invalid class name */
/* loaded from: 3Wq.class */
public final class C3Wq implements C1pw {
    public final /* synthetic */ 3Ib A00;

    public C3Wq(3Ib r302) {
        this.A00 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v0, types: [X.3pw] */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v2, types: [X.1pz] */
    @Override // X.C1pw
    public void C3R(Collection collection) {
        List<C1q2> list;
        ?? A00 = C01083pw.A00();
        synchronized (A00) {
            try {
                List list2 = A00.A0G;
                if (A00.A06 == null) {
                    0T9.A02("MemoryManager.getMemoryLeakListeners", 314540183);
                    A00.A06 = AnonymousClass001.A0t(list2.size());
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        A00.A06.add((C1q2) ((C15h) it.next()).get());
                    }
                    0T9.A00(1490351465);
                }
                list = A00.A06;
            } catch (Throwable th) {
                throw th;
            }
        }
        for (C1q2 c1q2 : list) {
            if (c1q2.isEnabled()) {
                c1q2.C3Q(collection);
            }
        }
        if (4DC.A00()) {
            A00 = this.A00.A00;
            synchronized (A00) {
                0fH.A0A(C1pz.class, "Clearing all leaks");
                A00.A02.clear();
            }
        }
    }

    @Override // X.C1pw
    public void C9V() {
    }
}
