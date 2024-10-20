package X;

import java.util.LinkedList;

/* renamed from: X.4kT, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kT.class */
public final class C07624kT extends LinkedList {
    public final 4kS mFixer;

    public C07624kT(4kS r302) {
        this.mFixer = r302;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        4kS r0;
        if (obj == null || (r0 = this.mFixer) == null || r0.A00 == null) {
            return true;
        }
        synchronized (r0.A02) {
            r0.A01.add(obj);
            r0.A00.sendEmptyMessageDelayed(1, 100);
        }
        return true;
    }
}
