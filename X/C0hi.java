package X;

import java.nio.ByteBuffer;

/* renamed from: X.0hi, reason: invalid class name */
/* loaded from: 0hi.class */
public final class C0hi implements 15H {
    public int A00;

    public void Cav(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer.getInt();
    }

    public void DAw(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.A00);
    }

    public String toString() {
        return String.valueOf(this.A00);
    }
}
