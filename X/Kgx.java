package X;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: Kgx.class */
public final class Kgx {
    public int A00;
    public byte[] A01;

    public Kgx(String str) {
        ByteBuffer allocate;
        try {
            allocate = ByteBuffer.wrap(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            allocate = ByteBuffer.allocate(0);
        }
        ByteBuffer order = allocate.order(ByteOrder.LITTLE_ENDIAN);
        this.A01 = order.array();
        this.A00 = order.limit();
    }
}
