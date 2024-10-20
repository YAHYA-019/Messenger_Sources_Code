package X;

import java.util.ListIterator;

/* loaded from: Lt8.class */
public abstract class Lt8 implements ListIterator, AnonymousClass116 {
    public int A00;
    public int A01;

    @Override // java.util.ListIterator
    public void add(Object obj) {
        if (!(this instanceof M9R)) {
            throw AnonymousClass002.A0O();
        }
        M9R m9r = (M9R) this;
        M9R.A00(m9r);
        LzB lzB = m9r.A03;
        lzB.add(m9r.A00, obj);
        m9r.A00++;
        m9r.A01 = lzB.size();
        m9r.A00 = lzB.A0O();
        m9r.A01 = -1;
        M9R.A01(m9r);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A01);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return AnonymousClass001.A1P(this.A00);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        M9R m9r;
        M9Q m9q;
        Object[] objArr;
        int i;
        if (this instanceof M9Q) {
            M9Q m9q2 = (M9Q) this;
            if (!m9q2.hasNext()) {
                throw AnonymousClass001.A10();
            }
            int i2 = m9q2.A00 & 31;
            Object obj = m9q2.A02[m9q2.A00 - 1];
            11T.A0I(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            Object obj2 = ((Object[]) obj)[i2];
            int i3 = m9q2.A00 + 1;
            m9q2.A00 = i3;
            if (i3 == m9q2.A01) {
                m9q2.A01 = true;
            } else {
                int i4 = 0;
                while (((i3 >> i4) & 31) == 0) {
                    i4 += 5;
                }
                if (i4 > 0) {
                    M9Q.A00(m9q2, i3, ((m9q2.A00 - 1) - (i4 / 5)) + 1);
                    return obj2;
                }
            }
            return obj2;
        }
        if (this instanceof M9O) {
            M9O m9o = (M9O) this;
            if (!m9o.hasNext()) {
                throw AnonymousClass001.A10();
            }
            m9o.A00++;
            return m9o.A00;
        }
        if (this instanceof M9R) {
            m9r = (M9R) this;
            M9R.A00(m9r);
            if (!m9r.hasNext()) {
                throw AnonymousClass001.A10();
            }
            i = m9r.A00;
            m9r.A01 = i;
            m9q = m9r.A02;
            if (m9q == null) {
                Object[] objArr2 = m9r.A03.A05;
                m9r.A00 = i + 1;
                return objArr2[i];
            }
            if (m9q.hasNext()) {
                m9r.A00 = i + 1;
                return m9q.next();
            }
            objArr = m9r.A03.A05;
        } else {
            if (!(this instanceof M9P)) {
                M9N m9n = (M9N) this;
                if (!m9n.hasNext()) {
                    throw AnonymousClass001.A10();
                }
                Object[] objArr3 = m9n.A00;
                int i5 = m9n.A00;
                m9n.A00 = i5 + 1;
                return objArr3[i5];
            }
            m9r = (M9P) this;
            if (!m9r.hasNext()) {
                throw AnonymousClass001.A10();
            }
            m9q = ((M9P) m9r).A00;
            if (m9q.hasNext()) {
                m9r.A00++;
                return m9q.next();
            }
            objArr = ((M9P) m9r).A01;
            i = m9r.A00;
        }
        m9r.A00 = i + 1;
        return objArr[i - m9q.A01];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.A00 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        if (!(this instanceof M9R)) {
            throw AnonymousClass002.A0O();
        }
        M9R m9r = (M9R) this;
        M9R.A00(m9r);
        int i = m9r.A01;
        if (i == -1) {
            throw JQx.A0o();
        }
        LzB lzB = m9r.A03;
        lzB.remove(i);
        int i2 = m9r.A01;
        if (i2 < m9r.A00) {
            m9r.A00 = i2;
        }
        m9r.A01 = lzB.size();
        m9r.A00 = lzB.A0O();
        m9r.A01 = -1;
        M9R.A01(m9r);
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        if (!(this instanceof M9R)) {
            throw AnonymousClass002.A0O();
        }
        M9R m9r = (M9R) this;
        M9R.A00(m9r);
        int i = m9r.A01;
        if (i == -1) {
            throw JQx.A0o();
        }
        LzB lzB = m9r.A03;
        lzB.set(i, obj);
        m9r.A00 = lzB.A0O();
        M9R.A01(m9r);
    }
}
