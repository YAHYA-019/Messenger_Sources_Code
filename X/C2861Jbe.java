package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.Jbe, reason: case insensitive filesystem */
/* loaded from: Jbe.class */
public class C2861Jbe extends Lsr implements Iterator, AnonymousClass116 {
    public int A00;
    public Object A01;
    public boolean A02;
    public final LzC A03;

    public C2861Jbe(LzC lzC, Lsl[] lslArr) {
        super(lzC.A03, lslArr);
        this.A03 = lzC;
        this.A00 = lzC.A00;
    }

    public static final void A00(C2861Jbe c2861Jbe, LES les, Object obj, int i, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            Lsl[] lslArr = ((Lsr) c2861Jbe).A02;
            Lsl lsl = lslArr[i2];
            Object[] objArr = les.A02;
            int length = objArr.length;
            int i4 = 0;
            lsl.A02 = objArr;
            lsl.A00 = length;
            while (true) {
                lsl.A01 = i4;
                if (JQz.A1Z(obj, lsl.A02, i4)) {
                    break;
                }
                lsl = lslArr[i2];
                i4 = lsl.A01 + 2;
            }
        } else {
            int i5 = 1 << ((i >> i3) & 31);
            int i6 = les.A00;
            if ((i5 & i6) == 0) {
                int A0F = les.A0F(i5);
                LES A0H = les.A0H(A0F);
                Lsl lsl2 = ((Lsr) c2861Jbe).A02[i2];
                Object[] objArr2 = les.A02;
                int bitCount = Integer.bitCount(les.A00) * 2;
                lsl2.A02 = objArr2;
                lsl2.A00 = bitCount;
                lsl2.A01 = A0F;
                A00(c2861Jbe, A0H, obj, i, i2 + 1);
                return;
            }
            int A0E = les.A0E(i5);
            Lsl lsl3 = ((Lsr) c2861Jbe).A02[i2];
            Object[] objArr3 = les.A02;
            int bitCount2 = Integer.bitCount(i6) * 2;
            lsl3.A02 = objArr3;
            lsl3.A00 = bitCount2;
            lsl3.A01 = A0E;
        }
        ((Lsr) c2861Jbe).A00 = i2;
    }

    @Override // X.Lsr, java.util.Iterator
    public Object next() {
        if (this.A03.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        this.A01 = A03();
        this.A02 = true;
        return super.next();
    }
}
