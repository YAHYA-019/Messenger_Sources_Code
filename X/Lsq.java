package X;

import java.util.Iterator;

/* loaded from: Lsq.class */
public final class Lsq implements Iterator, AnonymousClass116 {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    public Lsq(C2818Jaa c2818Jaa, int i) {
        int i2;
        this.A02 = i;
        this.A03 = c2818Jaa;
        switch (i) {
            case 0:
                this.A00 = -1;
                this.A01 = 0AM.A0B(new Lzx(c2818Jaa, this, null, 0));
                return;
            case 1:
                i2 = 0;
                this.A01 = 0AM.A0B(new Lzt(c2818Jaa, null, i2));
                this.A00 = -1;
                return;
            default:
                i2 = 1;
                this.A01 = 0AM.A0B(new Lzt(c2818Jaa, null, i2));
                this.A00 = -1;
                return;
        }
    }

    public Lsq(C2820Jac c2820Jac) {
        this.A02 = 3;
        this.A03 = c2820Jac;
        this.A00 = -1;
        this.A01 = 0AM.A0B(new Lzx(c2820Jac, this, null, 1));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return ((Iterator) this.A01).hasNext();
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        int A0F;
        Object[] objArr;
        int i = this.A02;
        Iterator it = (Iterator) this.A01;
        switch (i) {
            case 1:
                A0F = DKE.A0F(it);
                this.A00 = A0F;
                objArr = ((Kui) this.A03).A03;
                break;
            case 2:
                A0F = DKE.A0F(it);
                this.A00 = A0F;
                objArr = ((Kui) this.A03).A04;
                break;
            default:
                return it.next();
        }
        return objArr[A0F];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // java.util.Iterator
    public void remove() {
        int i;
        int i2 = this.A02;
        int i3 = this.A00;
        switch (i2) {
            case 0:
                i = -1;
                if (i3 != -1) {
                    ((C2818Jaa) this.A03).A06(i3);
                    this.A00 = i;
                    return;
                }
                return;
            case 3:
                i = -1;
                if (i3 != -1) {
                    ((C2820Jac) this.A03).A07(i3);
                    this.A00 = i;
                    return;
                }
                return;
            default:
                if (i3 >= 0) {
                    ((C2818Jaa) this.A03).A06(i3);
                    i = -1;
                    this.A00 = i;
                    return;
                }
                return;
        }
    }
}
