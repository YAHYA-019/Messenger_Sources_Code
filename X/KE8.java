package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: KE8.class */
public final class KE8 extends LyC implements MRL, RandomAccess {
    public static final MRL A01;
    public static final KE8 A02;
    public final List A00;

    static {
        KE8 ke8 = new KE8();
        A02 = ke8;
        ((LyC) ke8).A00 = false;
        A01 = ke8;
    }

    public KE8() {
        this(AnonymousClass001.A0t(10));
    }

    public KE8(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MRL
    public void A51(Lj5 lj5) {
        A01();
        this.A00.add(lj5);
        ((AbstractList) this).modCount++;
    }

    @Override // X.MRL
    public Object B5n(int i) {
        return this.A00.get(i);
    }

    @Override // X.MRL
    public List BHv() {
        return Collections.unmodifiableList(this.A00);
    }

    @Override // X.MRL
    public MRL BI3() {
        return ((LyC) this).A00 ? new LyD(this) : this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ MRR Bel(int i) {
        if (i < size()) {
            throw JQx.A0n();
        }
        ArrayList A0t = AnonymousClass001.A0t(i);
        A0t.addAll(this.A00);
        return new KE8(A0t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof MRL) {
            collection = ((MRL) collection).BHv();
        }
        boolean addAll = this.A00.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public void clear() {
        A01();
        this.A00.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        int A03;
        List list = this.A00;
        Object obj = list.get(i);
        if (!(obj instanceof String)) {
            if (obj instanceof Lj5) {
                KEB keb = (Lj5) obj;
                obj = keb.A04();
                KEB keb2 = keb;
                int A06 = keb2.A06();
                A03 = Kxt.A00.A03(keb2.bytes, A06, keb2.A02() + A06);
            } else {
                byte[] bArr = (byte[]) obj;
                obj = new String(bArr, Kyu.A04);
                A03 = Kxt.A00.A03(bArr, 0, bArr.length);
            }
            if (A03 == 0) {
                list.set(i, obj);
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        ((AbstractList) this).modCount++;
        if (!(remove instanceof String)) {
            if (!(remove instanceof Lj5)) {
                return new String((byte[]) remove, Kyu.A04);
            }
            remove = ((Lj5) remove).A04();
        }
        return remove;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A01();
        Object obj2 = this.A00.set(i, obj);
        if (!(obj2 instanceof String)) {
            if (!(obj2 instanceof Lj5)) {
                return new String((byte[]) obj2, Kyu.A04);
            }
            obj2 = ((Lj5) obj2).A04();
        }
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.A00.size();
    }
}
