package X;

import java.util.Iterator;

/* loaded from: Lsr.class */
public abstract class Lsr implements Iterator, AnonymousClass116 {
    public int A00;
    public boolean A01 = true;
    public final Lsl[] A02;

    public Lsr(LES les, Lsl[] lslArr) {
        this.A02 = lslArr;
        Lsl lsl = lslArr[0];
        Object[] objArr = les.A02;
        int bitCount = Integer.bitCount(les.A00) * 2;
        lsl.A02 = objArr;
        lsl.A00 = bitCount;
        lsl.A01 = 0;
        this.A00 = 0;
        A02();
    }

    private final int A01(int i) {
        Lsl lsl;
        Object[] objArr;
        int bitCount;
        Lsl[] lslArr = this.A02;
        Lsl lsl2 = lslArr[i];
        int i2 = lsl2.A01;
        if (i2 >= lsl2.A00) {
            Object[] objArr2 = lsl2.A02;
            if (i2 >= objArr2.length) {
                return -1;
            }
            Object obj = objArr2[i2];
            11T.A0I(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
            LES les = (LES) obj;
            if (i == 6) {
                lsl = lslArr[7];
                objArr = les.A02;
                bitCount = objArr.length;
            } else {
                lsl = lslArr[i + 1];
                objArr = les.A02;
                bitCount = Integer.bitCount(les.A00) * 2;
            }
            lsl.A02 = objArr;
            lsl.A00 = bitCount;
            lsl.A01 = 0;
            i = A01(i + 1);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A02() {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lsr.A02():void");
    }

    public final Object A03() {
        if (!hasNext()) {
            throw AnonymousClass001.A10();
        }
        Lsl lsl = this.A02[this.A00];
        return lsl.A02[lsl.A01];
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.A01;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw AnonymousClass001.A10();
        }
        Object next = this.A02[this.A00].next();
        A02();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        LzC lzC;
        if (!(this instanceof C2861Jbe)) {
            throw AnonymousClass002.A0O();
        }
        C2861Jbe c2861Jbe = (C2861Jbe) this;
        if (!c2861Jbe.A02) {
            throw JQx.A0o();
        }
        if (c2861Jbe.hasNext()) {
            Object A03 = c2861Jbe.A03();
            lzC = c2861Jbe.A03;
            C0B7.A02(lzC).remove(c2861Jbe.A01);
            C2861Jbe.A00(c2861Jbe, lzC.A03, A03, AnonymousClass002.A04(A03), 0);
        } else {
            lzC = c2861Jbe.A03;
            C0B7.A02(lzC).remove(c2861Jbe.A01);
        }
        c2861Jbe.A01 = null;
        c2861Jbe.A02 = false;
        c2861Jbe.A00 = lzC.A00;
    }
}
