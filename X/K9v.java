package X;

import com.google.common.collect.BoundType;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: K9v.class */
public final class K9v extends K9w implements MQm {
    public transient Comparator A00;
    public transient NavigableSet A01;
    public transient Set A02;
    public final /* synthetic */ K9e A03;

    public K9v() {
    }

    public K9v(K9e k9e) {
        this.A03 = k9e;
    }

    public /* bridge */ /* synthetic */ Object A01() {
        return this.A03;
    }

    public /* bridge */ /* synthetic */ Collection A02() {
        return this.A03;
    }

    @Override // X.MQm
    public MQm AMu() {
        return this.A03;
    }

    @Override // X.C4u1
    /* renamed from: APA, reason: merged with bridge method [inline-methods] */
    public NavigableSet APB() {
        KAq kAq = this.A01;
        if (kAq == null) {
            kAq = new KAq(this);
            this.A01 = kAq;
        }
        return kAq;
    }

    @Override // X.MQm
    public C5ps ATE() {
        return this.A03.BXi();
    }

    @Override // X.MQm
    public MQm BNq(BoundType boundType, Object obj) {
        return this.A03.D3y(boundType, obj).AMu();
    }

    @Override // X.MQm
    public C5ps BXi() {
        return this.A03.ATE();
    }

    @Override // X.MQm
    public C5ps CXh() {
        return this.A03.CXi();
    }

    @Override // X.MQm
    public C5ps CXi() {
        return this.A03.CXh();
    }

    @Override // X.MQm
    public MQm D39(BoundType boundType, BoundType boundType2, Object obj, Object obj2) {
        return this.A03.D39(boundType2, boundType, obj2, obj).AMu();
    }

    @Override // X.MQm
    public MQm D3y(BoundType boundType, Object obj) {
        return this.A03.BNq(boundType, obj).AMu();
    }

    @Override // X.MQm
    public Comparator comparator() {
        Comparator comparator = this.A00;
        if (comparator == null) {
            comparator = C1zA.A00(this.A03.comparator).A03();
            this.A00 = comparator;
        }
        return comparator;
    }

    @Override // X.C4u1
    public Set entrySet() {
        KAs kAs = this.A02;
        if (kAs == null) {
            kAs = new KAs(this);
            this.A02 = kAs;
        }
        return kAs;
    }

    @Override // X.C4u1, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        MQm AMu = this.A03.AMu();
        return new Lsf(AMu, AMu.entrySet().iterator());
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return 1Dz.A01(this, objArr);
    }

    public String toString() {
        return entrySet().toString();
    }
}
