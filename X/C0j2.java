package X;

import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.0j2, reason: invalid class name */
/* loaded from: 0j2.class */
public final class C0j2 implements 15E {
    public int A00;
    public int A01;

    public int BNn(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            if (i != 0) {
                if (i == 1) {
                    i2 = this.A01;
                    i4 = this.A00 * 37;
                } else if (i == 2) {
                    i2 = this.A01;
                    i4 = this.A00 * 43;
                }
                return i2 + i4;
            }
            i2 = this.A01;
            i3 = this.A00;
            i4 = i3 * 31;
            return i2 + i4;
        }
        if (i == 2) {
            i2 = this.A00;
            i3 = this.A01;
            i4 = i3 * 31;
            return i2 + i4;
        }
        i2 = this.A01;
        i3 = this.A00;
        i4 = i3 * 31;
        return i2 + i4;
    }

    public void Cav(ByteBuffer byteBuffer) {
        this.A01 = byteBuffer.getInt();
        this.A00 = byteBuffer.getInt();
    }

    public void DAw(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.A01);
        byteBuffer.putInt(this.A00);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C0j2) {
            C0j2 c0j2 = (C0j2) obj;
            if (this.A01 == c0j2.A01 && this.A00 == c0j2.A00) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A00 != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isEmpty() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L16
        L14:
            r0 = 0
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0j2.isEmpty():boolean");
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "%d,%d", AnonymousClass001.A1b(Integer.valueOf(this.A01), this.A00));
    }
}
