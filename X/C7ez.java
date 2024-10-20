package X;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: X.7ez, reason: invalid class name */
/* loaded from: 7ez.class */
public final class C7ez extends 5IO implements MFL {
    public void ALj(int i, ByteBuffer byteBuffer) {
        byte[] A07 = RiA.A07(byteBuffer, i, 0);
        if (A07 == null) {
            throw AnonymousClass001.A0L("manifest cannot be null");
        }
        ((5IO) this).A03 = A07;
        ((5IO) this).A01 = RiA.A03(Q9t.class, byteBuffer, i, 1);
        5IQ[] A0A = RiA.A0A(QAB.class, byteBuffer, i, 2);
        if (A0A == null) {
            throw AnonymousClass001.A0L("scenes cannot be null");
        }
        ((5IO) this).A05 = A0A;
        int i2 = 0;
        int A02 = RiA.A02(byteBuffer, i, 3);
        if (A02 != 0) {
            i2 = byteBuffer.getInt(A02);
        }
        ((5IO) this).A00 = i2;
        RiA.A06(byteBuffer, i, 4);
        ((5IO) this).A04 = RiA.A0A(LWC.class, byteBuffer, i, 5);
        ((5IO) this).A02 = new HashMap();
        5IQ[] r0 = ((5IO) this).A05;
        int length = r0.length;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length) {
                return;
            }
            r0[i4].A02.A01(((5IO) this).A02, ((5IO) this).A04);
            i3 = i4 + 1;
        }
    }
}
