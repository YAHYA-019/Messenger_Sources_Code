package X;

import java.nio.ByteBuffer;

/* loaded from: Kxk.class */
public abstract class Kxk {
    public static final byte[] A00 = new byte[0];

    public static byte[] A00(KDE kde) {
        int i;
        ByteBuffer allocate;
        byte b;
        KPX A002 = KPX.A00(kde.outputPrefixType_);
        if (A002 == null) {
            A002 = KPX.A06;
        }
        int ordinal = A002.ordinal();
        if (ordinal == 2 || ordinal == 4) {
            i = kde.keyId_;
            allocate = ByteBuffer.allocate(5);
            b = 0;
        } else {
            b = 1;
            if (ordinal != 1) {
                if (ordinal == 3) {
                    return A00;
                }
                throw JQx.A10("unknown output prefix type");
            }
            i = kde.keyId_;
            allocate = ByteBuffer.allocate(5);
        }
        allocate.put(b);
        allocate.putInt(i);
        return L4o.A00(allocate.array()).A01();
    }
}
