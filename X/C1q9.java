package X;

/* renamed from: X.1q9, reason: invalid class name */
/* loaded from: 1q9.class */
public final class C1q9 implements C0dp {
    public long A00;

    public void A00(long j) {
        synchronized (this) {
            this.A00 = Math.max(j, this.A00);
        }
    }

    @Override // X.C0dp
    public long now() {
        long currentTimeMillis;
        synchronized (this) {
            currentTimeMillis = System.currentTimeMillis();
            long j = this.A00;
            if (currentTimeMillis <= j) {
                currentTimeMillis = j + 1;
                this.A00 = currentTimeMillis;
            }
        }
        return currentTimeMillis;
    }
}
