package X;

import java.util.Iterator;

/* loaded from: Lsk.class */
public final class Lsk implements Iterator {
    public int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public Lsk(int i) {
        this.A01 = i;
    }

    public Lsk(Lj4 lj4) {
        this.A01 = 0;
        this.A03 = lj4;
        this.A00 = 0;
        this.A02 = lj4.A02();
    }

    public Lsk(Lj5 lj5) {
        this.A01 = 1;
        this.A03 = lj5;
        this.A00 = 0;
        this.A02 = lj5.A02();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A02);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        int i;
        byte[] bArr;
        byte[] bArr2;
        int i2;
        byte b;
        switch (this.A01) {
            case 0:
                i = this.A00;
                if (i >= this.A02) {
                    throw AnonymousClass001.A10();
                }
                this.A00 = i + 1;
                KBx kBx = (KBy) ((Lj4) this.A03);
                if (!(kBx instanceof KBx)) {
                    bArr = ((KBy) kBx).bytes;
                    b = bArr[i];
                    return Byte.valueOf(b);
                }
                KBx kBx2 = kBx;
                bArr2 = ((KBy) kBx2).bytes;
                i2 = kBx2.bytesOffset;
                b = bArr2[i2 + i];
                return Byte.valueOf(b);
            case 1:
                i = this.A00;
                if (i >= this.A02) {
                    throw AnonymousClass001.A10();
                }
                this.A00 = i + 1;
                KEA kea = (KEB) ((Lj5) this.A03);
                if (!(kea instanceof KEA)) {
                    bArr = ((KEB) kea).bytes;
                    b = bArr[i];
                    return Byte.valueOf(b);
                }
                KEA kea2 = kea;
                bArr2 = ((KEB) kea2).bytes;
                i2 = kea2.bytesOffset;
                b = bArr2[i2 + i];
                return Byte.valueOf(b);
            default:
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A01) {
            case 0:
                throw AnonymousClass001.A0p();
            case 1:
                throw AnonymousClass001.A0p();
            default:
                return;
        }
    }
}
