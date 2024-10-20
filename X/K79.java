package X;

/* loaded from: K79.class */
public final class K79 extends K7A {
    public int A00;
    public final int A01;
    public final K75 A02;

    public K79(int i, int i2) {
        LBh.A02(i2, i);
        this.A01 = i;
        this.A00 = i2;
    }

    public K79(K75 k75, int i) {
        this(k75.size(), i);
        this.A02 = k75;
    }

    private final Object A00(int i) {
        return this.A02.get(i);
    }

    public final boolean hasNext() {
        return AnonymousClass001.A1R(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return AnonymousClass001.A1P(this.A00);
    }

    public final Object next() {
        if (!hasNext()) {
            throw AnonymousClass001.A10();
        }
        int i = this.A00;
        this.A00 = i + 1;
        return A00(i);
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final Object previous() {
        if (!hasPrevious()) {
            throw AnonymousClass001.A10();
        }
        int i = this.A00 - 1;
        this.A00 = i;
        return A00(i);
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }
}
