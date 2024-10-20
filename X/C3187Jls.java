package X;

import java.nio.ByteBuffer;

/* renamed from: X.Jls, reason: case insensitive filesystem */
/* loaded from: Jls.class */
public final class C3187Jls extends LTb {
    public void A07(Kgx kgx, int i) {
        if (i < 0) {
            throw new Exception("Index cannot be negative!");
        }
        int i2 = kgx.A00;
        A06(i, 0);
        LTb.A03(this, i);
        ((LTb) this).A00 = i - 1;
        A06(i, i2);
        L5w.A02(i, ((LTb) this).A04);
        int i3 = i * 4;
        int i4 = ((LTb) this).A03.getInt(i3);
        int i5 = (i + 1) * 4;
        ((LTb) this).A03.putInt(i5, i4 + i2);
        byte[] bArr = kgx.A01;
        LTb.A03(this, i);
        L5w.A02(i, ((LTb) this).A04);
        int i6 = ((LTb) this).A03.getInt(i3);
        ((LTb) this).A03.position(i5);
        int i7 = i6 + i2;
        ((LTb) this).A03.putInt(i7);
        ByteBuffer byteBuffer = ((LTb) this).A05;
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            byteBuffer.put(i6 + i8, bArr[i9]);
            i8++;
        }
        byteBuffer.position(i7);
        ((LTb) this).A00 = i;
        ((LTb) this).A00 = i;
    }
}
