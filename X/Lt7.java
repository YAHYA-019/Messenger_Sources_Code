package X;

import java.util.ListIterator;

/* loaded from: Lt7.class */
public abstract class Lt7 implements ListIterator, AnonymousClass116 {
    public int A00;
    public int A01;

    @Override // java.util.ListIterator
    public void add(Object obj) {
        if (!(this instanceof C2853JbU)) {
            throw AnonymousClass002.A0O();
        }
        C2853JbU c2853JbU = (C2853JbU) this;
        C2853JbU.A00(c2853JbU);
        LzA lzA = c2853JbU.A03;
        lzA.add(((Lt7) c2853JbU).A00, obj);
        ((Lt7) c2853JbU).A00++;
        ((Lt7) c2853JbU).A01 = lzA.size();
        c2853JbU.A00 = lzA.A0O();
        c2853JbU.A01 = -1;
        C2853JbU.A01(c2853JbU);
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
        C2853JbU c2853JbU;
        JbT jbT;
        Object[] objArr;
        int i;
        if (this instanceof JbT) {
            JbT jbT2 = (JbT) this;
            if (!jbT2.hasNext()) {
                throw AnonymousClass001.A10();
            }
            int i2 = jbT2.A00 & 31;
            Object obj = jbT2.A02[jbT2.A00 - 1];
            11T.A0I(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            Object obj2 = ((Object[]) obj)[i2];
            int i3 = jbT2.A00 + 1;
            jbT2.A00 = i3;
            if (i3 == jbT2.A01) {
                jbT2.A01 = true;
            } else {
                int i4 = 0;
                while (((i3 >> i4) & 31) == 0) {
                    i4 += 5;
                }
                if (i4 > 0) {
                    JbT.A00(jbT2, i3, ((jbT2.A00 - 1) - (i4 / 5)) + 1);
                    return obj2;
                }
            }
            return obj2;
        }
        if (this instanceof JbR) {
            JbR jbR = (JbR) this;
            if (!jbR.hasNext()) {
                throw AnonymousClass001.A10();
            }
            jbR.A00++;
            return jbR.A00;
        }
        if (this instanceof C2853JbU) {
            c2853JbU = (C2853JbU) this;
            C2853JbU.A00(c2853JbU);
            if (!c2853JbU.hasNext()) {
                throw AnonymousClass001.A10();
            }
            i = ((Lt7) c2853JbU).A00;
            c2853JbU.A01 = i;
            jbT = c2853JbU.A02;
            if (jbT == null) {
                Object[] objArr2 = c2853JbU.A03.A04;
                ((Lt7) c2853JbU).A00 = i + 1;
                return objArr2[i];
            }
            if (jbT.hasNext()) {
                ((Lt7) c2853JbU).A00 = i + 1;
                return jbT.next();
            }
            objArr = c2853JbU.A03.A04;
        } else {
            if (!(this instanceof JbS)) {
                JbQ jbQ = (JbQ) this;
                if (!jbQ.hasNext()) {
                    throw AnonymousClass001.A10();
                }
                Object[] objArr3 = jbQ.A00;
                int i5 = jbQ.A00;
                jbQ.A00 = i5 + 1;
                return objArr3[i5];
            }
            c2853JbU = (JbS) this;
            if (!c2853JbU.hasNext()) {
                throw AnonymousClass001.A10();
            }
            jbT = ((JbS) c2853JbU).A00;
            if (jbT.hasNext()) {
                ((Lt7) c2853JbU).A00++;
                return jbT.next();
            }
            objArr = ((JbS) c2853JbU).A01;
            i = ((Lt7) c2853JbU).A00;
        }
        ((Lt7) c2853JbU).A00 = i + 1;
        return objArr[i - jbT.A01];
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
        if (!(this instanceof C2853JbU)) {
            throw AnonymousClass002.A0O();
        }
        C2853JbU c2853JbU = (C2853JbU) this;
        C2853JbU.A00(c2853JbU);
        int i = c2853JbU.A01;
        if (i == -1) {
            throw JQx.A0o();
        }
        LzA lzA = c2853JbU.A03;
        lzA.remove(i);
        int i2 = c2853JbU.A01;
        if (i2 < ((Lt7) c2853JbU).A00) {
            ((Lt7) c2853JbU).A00 = i2;
        }
        ((Lt7) c2853JbU).A01 = lzA.size();
        c2853JbU.A00 = lzA.A0O();
        c2853JbU.A01 = -1;
        C2853JbU.A01(c2853JbU);
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        if (!(this instanceof C2853JbU)) {
            throw AnonymousClass002.A0O();
        }
        C2853JbU c2853JbU = (C2853JbU) this;
        C2853JbU.A00(c2853JbU);
        int i = c2853JbU.A01;
        if (i == -1) {
            throw JQx.A0o();
        }
        LzA lzA = c2853JbU.A03;
        lzA.set(i, obj);
        c2853JbU.A00 = lzA.A0O();
        C2853JbU.A01(c2853JbU);
    }
}
