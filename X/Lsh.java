package X;

import java.util.Iterator;

/* loaded from: Lsh.class */
public final class Lsh implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ Lj7 A02;

    public Lsh() {
    }

    public Lsh(Lj7 lj7) {
        this.A02 = lj7;
        this.A00 = 0;
        this.A01 = lj7.A03();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A01);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i >= this.A01) {
            throw AnonymousClass001.A10();
        }
        this.A00 = i + 1;
        K6N k6n = (K6O) this.A02;
        if (k6n instanceof K6N) {
            K6N k6n2 = k6n;
            b = ((K6O) k6n2).zza[k6n2.zzc + i];
        } else {
            b = ((K6O) k6n).zza[i];
        }
        return Byte.valueOf(b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AnonymousClass001.A0p();
    }
}
