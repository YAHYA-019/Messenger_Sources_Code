package X;

import com.google.common.collect.BoundType;
import com.google.common.collect.Multisets$ImmutableEntry;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.TreeMultiset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: K9e.class */
public abstract class K9e extends AbstractC10624u0 implements MQm {
    public transient MQm A00;
    public final Comparator comparator;

    public K9e() {
        this(NaturalOrdering.A02);
    }

    public K9e(Comparator comparator) {
        comparator.getClass();
        this.comparator = comparator;
    }

    @Override // X.AbstractC10624u0
    public /* bridge */ /* synthetic */ Set A02() {
        return new KAq(this);
    }

    @Override // X.MQm
    public MQm AMu() {
        MQm mQm = this.A00;
        if (mQm == null) {
            mQm = new K9v(this);
            this.A00 = mQm;
        }
        return mQm;
    }

    @Override // X.AbstractC10624u0, X.C4u1
    /* renamed from: APA */
    public NavigableSet APB() {
        return (NavigableSet) super.APB();
    }

    @Override // X.MQm
    public C5ps ATE() {
        Iterator A08 = A08();
        if (A08.hasNext()) {
            return (C5ps) A08.next();
        }
        return null;
    }

    @Override // X.MQm
    public C5ps BXi() {
        LsX lsX = new LsX((TreeMultiset) this, 1);
        if (lsX.hasNext()) {
            return (C5ps) lsX.next();
        }
        return null;
    }

    @Override // X.MQm
    public C5ps CXh() {
        Iterator A08 = A08();
        if (!A08.hasNext()) {
            return null;
        }
        C5ps c5ps = (C5ps) A08.next();
        Multisets$ImmutableEntry multisets$ImmutableEntry = new Multisets$ImmutableEntry(c5ps.A01(), c5ps.A00());
        A08.remove();
        return multisets$ImmutableEntry;
    }

    @Override // X.MQm
    public C5ps CXi() {
        LsX lsX = new LsX((TreeMultiset) this, 1);
        if (!lsX.hasNext()) {
            return null;
        }
        C5ps c5ps = (C5ps) lsX.next();
        Multisets$ImmutableEntry multisets$ImmutableEntry = new Multisets$ImmutableEntry(c5ps.A01(), c5ps.A00());
        lsX.remove();
        return multisets$ImmutableEntry;
    }

    @Override // X.MQm
    public MQm D39(BoundType boundType, BoundType boundType2, Object obj, Object obj2) {
        boundType.getClass();
        boundType2.getClass();
        return D3y(boundType, obj).BNq(boundType2, obj2);
    }

    @Override // X.MQm
    public Comparator comparator() {
        return this.comparator;
    }
}
