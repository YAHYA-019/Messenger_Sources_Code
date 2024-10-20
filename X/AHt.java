package X;

/* loaded from: AHt.class */
public final class AHt implements 2aI, AutoCloseable {
    public final 0DE A00;

    public AHt(0DE r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        C5x7.A00(null, this.A00);
    }

    public 0DE getCoroutineContext() {
        return this.A00;
    }
}
