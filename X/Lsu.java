package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;

/* loaded from: Lsu.class */
public final class Lsu implements List, MJO, RandomAccess, C07c {
    public L2v A00;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.L2v, X.Jc3] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.L2v, X.Jc3] */
    public Lsu() {
        C2854JbV c2854JbV = C2854JbV.A01;
        ?? l2v = new L2v();
        l2v.A02 = c2854JbV;
        if (LEY.A05.A01() != null) {
            ?? l2v2 = new L2v();
            l2v2.A02 = c2854JbV;
            l2v2.A00 = 1;
            l2v.A01 = l2v2;
        }
        this.A00 = l2v;
    }

    private final C2882Jc3 A00() {
        L2v l2v = this.A00;
        11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C2882Jc3) LEY.A06(this, l2v);
    }

    public static void A01(MRG mrg, C2882Jc3 c2882Jc3, int i) {
        c2882Jc3.A02 = mrg;
        c2882Jc3.A01++;
        c2882Jc3.A00 = i + 1;
    }

    private final boolean A02(Function1 function1) {
        int i;
        MRG mrg;
        Object invoke;
        Snapshot A00;
        boolean z;
        do {
            Object obj = Kwx.A00;
            synchronized (obj) {
                L2v l2v = this.A00;
                C2882Jc3 A0Z = JR1.A0Z(l2v, l2v);
                i = A0Z.A00;
                mrg = A0Z.A02;
            }
            11T.A0D(mrg);
            LzA ACx = mrg.ACx();
            invoke = function1.invoke(ACx);
            MRG A0P = ACx.A0P();
            if (11T.A0O(A0P, mrg)) {
                break;
            }
            L2v l2v2 = this.A00;
            11T.A0I(l2v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (LEY.A07) {
                A00 = LEY.A00();
                C2882Jc3 c2882Jc3 = (C2882Jc3) LEY.A02(A00, this, l2v2);
                synchronized (obj) {
                    int i2 = c2882Jc3.A00;
                    z = true;
                    if (i2 == i) {
                        c2882Jc3.A02 = A0P;
                        c2882Jc3.A00 = i2 + 1;
                        c2882Jc3.A01++;
                    } else {
                        z = false;
                    }
                }
            }
            LEY.A0F(A00, this);
        } while (!z);
        return AnonymousClass001.A1V(invoke);
    }

    public final int A03() {
        L2v l2v = this.A00;
        11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C2882Jc3) LEY.A07(l2v)).A01;
    }

    @Override // X.MJO
    public L2v Amc() {
        return this.A00;
    }

    @Override // X.MJO
    public /* synthetic */ L2v Be9(L2v l2v, L2v l2v2, L2v l2v3) {
        return null;
    }

    @Override // X.MJO
    public void CZ0(L2v l2v) {
        l2v.A01 = this.A00;
        this.A00 = l2v;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        int i2;
        MRG mrg;
        Snapshot A00;
        boolean z;
        do {
            Object obj2 = Kwx.A00;
            synchronized (obj2) {
                L2v l2v = this.A00;
                C2882Jc3 A0Z = JR1.A0Z(l2v, l2v);
                i2 = A0Z.A00;
                mrg = A0Z.A02;
            }
            11T.A0D(mrg);
            MRG A58 = mrg.A58(obj, i);
            if (11T.A0O(A58, mrg)) {
                return;
            }
            L2v l2v2 = this.A00;
            11T.A0I(l2v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (LEY.A07) {
                A00 = LEY.A00();
                C2882Jc3 c2882Jc3 = (C2882Jc3) LEY.A02(A00, this, l2v2);
                synchronized (obj2) {
                    int i3 = c2882Jc3.A00;
                    z = true;
                    if (i3 == i2) {
                        A01(A58, c2882Jc3, i3);
                    } else {
                        z = false;
                    }
                }
            }
            LEY.A0F(A00, this);
        } while (!z);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        int i;
        MRG mrg;
        boolean z;
        Snapshot A00;
        do {
            Object obj2 = Kwx.A00;
            synchronized (obj2) {
                L2v l2v = this.A00;
                C2882Jc3 A0Z = JR1.A0Z(l2v, l2v);
                i = A0Z.A00;
                mrg = A0Z.A02;
            }
            11T.A0D(mrg);
            MRG A4w = mrg.A4w(obj);
            z = false;
            if (11T.A0O(A4w, mrg)) {
                return false;
            }
            L2v l2v2 = this.A00;
            11T.A0I(l2v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (LEY.A07) {
                A00 = LEY.A00();
                C2882Jc3 c2882Jc3 = (C2882Jc3) LEY.A02(A00, this, l2v2);
                synchronized (obj2) {
                    int i2 = c2882Jc3.A00;
                    if (i2 == i) {
                        A01(A4w, c2882Jc3, i2);
                        z = true;
                    }
                }
            }
            LEY.A0F(A00, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        return A02(new GAc(i, 1, collection));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153 A[SYNTHETIC] */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean addAll(java.util.Collection r302) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lsu.addAll(java.util.Collection):boolean");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot A00;
        L2v l2v = this.A00;
        11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (LEY.A07) {
            A00 = LEY.A00();
            C2882Jc3 c2882Jc3 = (C2882Jc3) LEY.A02(A00, this, l2v);
            synchronized (Kwx.A00) {
                c2882Jc3.A02 = C2854JbV.A01;
                c2882Jc3.A00++;
                c2882Jc3.A01++;
            }
        }
        LEY.A0F(A00, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return A00().A02.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return A00().A02.containsAll(collection);
    }

    @Override // java.util.List
    public Object get(int i) {
        return A00().A02.get(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return A00().A02.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return A00().A02.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return A00().A02.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new LtC(this, 0);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new LtC(this, i);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        int i2;
        MRG mrg;
        Snapshot A00;
        boolean z;
        Object obj = get(i);
        do {
            Object obj2 = Kwx.A00;
            synchronized (obj2) {
                L2v l2v = this.A00;
                C2882Jc3 A0Z = JR1.A0Z(l2v, l2v);
                i2 = A0Z.A00;
                mrg = A0Z.A02;
            }
            11T.A0D(mrg);
            MRG Ce4 = mrg.Ce4(i);
            if (11T.A0O(Ce4, mrg)) {
                return obj;
            }
            L2v l2v2 = this.A00;
            11T.A0I(l2v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (LEY.A07) {
                A00 = LEY.A00();
                C2882Jc3 c2882Jc3 = (C2882Jc3) LEY.A02(A00, this, l2v2);
                synchronized (obj2) {
                    int i3 = c2882Jc3.A00;
                    z = true;
                    if (i3 == i2) {
                        A01(Ce4, c2882Jc3, i3);
                    } else {
                        z = false;
                    }
                }
            }
            LEY.A0F(A00, this);
        } while (!z);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int i;
        MRG mrg;
        boolean z;
        Snapshot A00;
        do {
            Object obj2 = Kwx.A00;
            synchronized (obj2) {
                L2v l2v = this.A00;
                C2882Jc3 A0Z = JR1.A0Z(l2v, l2v);
                i = A0Z.A00;
                mrg = A0Z.A02;
            }
            11T.A0D(mrg);
            Lz5 lz5 = (Lz5) mrg;
            int indexOf = lz5.indexOf(obj);
            if (indexOf != -1) {
                lz5 = lz5.Ce4(indexOf);
            }
            z = false;
            if (11T.A0O(lz5, mrg)) {
                return false;
            }
            L2v l2v2 = this.A00;
            11T.A0I(l2v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (LEY.A07) {
                A00 = LEY.A00();
                C2882Jc3 c2882Jc3 = (C2882Jc3) LEY.A02(A00, this, l2v2);
                synchronized (obj2) {
                    int i2 = c2882Jc3.A00;
                    if (i2 == i) {
                        A01(lz5, c2882Jc3, i2);
                        z = true;
                    }
                }
            }
            LEY.A0F(A00, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        int i;
        MRG mrg;
        boolean z;
        Snapshot A00;
        do {
            Object obj = Kwx.A00;
            synchronized (obj) {
                L2v l2v = this.A00;
                C2882Jc3 A0Z = JR1.A0Z(l2v, l2v);
                i = A0Z.A00;
                mrg = A0Z.A02;
            }
            11T.A0D(mrg);
            MRG Cdv = mrg.Cdv(M6n.A00(collection, 47));
            z = false;
            if (11T.A0O(Cdv, mrg)) {
                return false;
            }
            L2v l2v2 = this.A00;
            11T.A0I(l2v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (LEY.A07) {
                A00 = LEY.A00();
                C2882Jc3 c2882Jc3 = (C2882Jc3) LEY.A02(A00, this, l2v2);
                synchronized (obj) {
                    int i2 = c2882Jc3.A00;
                    if (i2 == i) {
                        A01(Cdv, c2882Jc3, i2);
                        z = true;
                    }
                }
            }
            LEY.A0F(A00, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return A02(M6m.A00(collection, 3));
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        int i2;
        MRG mrg;
        Snapshot A00;
        boolean z;
        Object obj2 = get(i);
        do {
            Object obj3 = Kwx.A00;
            synchronized (obj3) {
                L2v l2v = this.A00;
                C2882Jc3 A0Z = JR1.A0Z(l2v, l2v);
                i2 = A0Z.A00;
                mrg = A0Z.A02;
            }
            11T.A0D(mrg);
            MRG ClS = mrg.ClS(obj, i);
            if (11T.A0O(ClS, mrg)) {
                return obj2;
            }
            L2v l2v2 = this.A00;
            11T.A0I(l2v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (LEY.A07) {
                A00 = LEY.A00();
                C2882Jc3 c2882Jc3 = (C2882Jc3) LEY.A02(A00, this, l2v2);
                synchronized (obj3) {
                    int i3 = c2882Jc3.A00;
                    z = true;
                    if (i3 == i2) {
                        c2882Jc3.A02 = ClS;
                        c2882Jc3.A00 = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            LEY.A0F(A00, this);
        } while (!z);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return A00().A02.size();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw AnonymousClass001.A0L("fromIndex or toIndex are out of bounds");
        }
        return new Lt0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return C0A5.A01(this, objArr);
    }

    public String toString() {
        L2v l2v = this.A00;
        11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        C2882Jc3 c2882Jc3 = (C2882Jc3) LEY.A07(l2v);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SnapshotStateList(value=");
        A0k.append(c2882Jc3.A02);
        A0k.append(")@");
        return GOn.A1B(A0k, hashCode());
    }
}
