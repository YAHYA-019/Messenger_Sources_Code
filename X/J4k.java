package X;

import java.util.Comparator;

/* loaded from: J4k.class */
public final class J4k implements Comparator {
    public int A00;
    public int A01;
    public final Object A02;
    public final /* synthetic */ IFH A03;

    public J4k(IFH ifh, Object obj) {
        this.A03 = ifh;
        this.A02 = obj;
    }

    public void A00(Hqd hqd) {
        int intValue;
        synchronized (this.A02) {
            if (hqd != null) {
                Integer num = hqd.A0A;
                if (num != null) {
                    intValue = num.intValue();
                    this.A01 = intValue;
                    this.A00 = intValue;
                }
            }
            intValue = 30;
            this.A01 = intValue;
            this.A00 = intValue;
        }
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int[] iArr = (int[]) obj;
        int[] iArr2 = (int[]) obj2;
        int i = iArr[1];
        int i2 = iArr2[1];
        return i == i2 ? iArr[0] - iArr2[0] : i - i2;
    }
}
