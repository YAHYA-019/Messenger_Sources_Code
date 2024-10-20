package X;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: Ksq.class */
public final class Ksq {
    public long A00 = 0;
    public final WritableByteChannel A01;

    public Ksq(WritableByteChannel writableByteChannel) {
        this.A01 = writableByteChannel;
    }

    public void A00() {
        long j = this.A00 % 8;
        if (j != 0) {
            A02(ByteBuffer.wrap(new byte[8 - ((int) j)]));
        }
    }

    public void A01(int i) {
        A02(ByteBuffer.wrap(new byte[]{(byte) (i >>> 0), (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)}));
    }

    public void A02(ByteBuffer byteBuffer) {
        long remaining = byteBuffer.remaining();
        while (byteBuffer.hasRemaining()) {
            this.A01.write(byteBuffer);
        }
        this.A00 += remaining;
    }
}
