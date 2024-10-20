package X;

import java.nio.ByteBuffer;

/* loaded from: Kzi.class */
public final class Kzi {
    public ByteBuffer A00;
    public final int A01;

    public Kzi(int i, ByteBuffer byteBuffer) {
        this.A01 = i;
        if (!byteBuffer.isDirect()) {
            throw AnonymousClass001.A0N("Bytes buffer must be direct");
        }
        this.A00 = byteBuffer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Kzi(int r302, byte... r303) {
        /*
            r301 = this;
            r0 = r303
            r1 = 2
            X.11T.A0F(r0, r1)
            r0 = r303
            int r0 = r0.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r304 = r0
            r0 = r304
            r1 = r303
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r304
            java.nio.Buffer r0 = r0.flip()
            r0 = r301
            r1 = r302
            r2 = r304
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kzi.<init>(int, byte[]):void");
    }
}
