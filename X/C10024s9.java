package X;

/* renamed from: X.4s9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4s9.class */
public final class C10024s9 extends AbstractC10034sA {
    public C10014s8 A00;
    public boolean A01;

    public C10024s9(C10014s8 c10014s8, boolean z) {
        this.A00 = c10014s8;
        this.A01 = z;
    }

    public C10014s8 A00() {
        C10014s8 c10014s8;
        synchronized (this) {
            c10014s8 = this.A00;
        }
        return c10014s8;
    }

    public boolean BWL() {
        return this.A01;
    }

    public void close() {
        synchronized (this) {
            C10014s8 c10014s8 = this.A00;
            if (c10014s8 == null) {
                return;
            }
            this.A00 = null;
            synchronized (c10014s8) {
                2EU.A04(c10014s8.A00);
                c10014s8.A00 = null;
                2EU.A05(c10014s8.A03);
                c10014s8.A03 = null;
            }
        }
    }

    public int getHeight() {
        int height;
        synchronized (this) {
            C10014s8 c10014s8 = this.A00;
            height = c10014s8 == null ? 0 : c10014s8.A04.getHeight();
        }
        return height;
    }

    public int getSizeInBytes() {
        int sizeInBytes;
        synchronized (this) {
            C10014s8 c10014s8 = this.A00;
            sizeInBytes = c10014s8 == null ? 0 : c10014s8.A04.getSizeInBytes();
        }
        return sizeInBytes;
    }

    public int getWidth() {
        int width;
        synchronized (this) {
            C10014s8 c10014s8 = this.A00;
            width = c10014s8 == null ? 0 : c10014s8.A04.getWidth();
        }
        return width;
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A00 == null) {
                z = true;
            }
        }
        return z;
    }
}
