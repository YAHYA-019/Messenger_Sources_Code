package X;

import java.nio.ByteBuffer;

/* loaded from: K0N.class */
public final class K0N extends 6We {
    public final 6Vt A00;

    public K0N(6Vt r302) {
        this.A00 = r302;
    }

    public 6Wf A02(6Wf r302) {
        return r302;
    }

    public void Cac(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining != 0) {
            this.A00.BLj(byteBuffer.asReadOnlyBuffer());
            ByteBuffer A03 = A03(remaining);
            A03.put(byteBuffer);
            A03.flip();
        }
    }
}
