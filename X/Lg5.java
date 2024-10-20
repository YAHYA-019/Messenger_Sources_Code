package X;

import java.io.IOException;

/* loaded from: Lg5.class */
public abstract class Lg5 implements MQo {
    public int memoizedHashCode = 0;

    public static Kq9 A08(KPV kpv, KDF kdf, Class cls, String str) {
        return new Kq9(kpv, kdf.A0G(), cls, str);
    }

    public static KDC A09(Lfu lfu) {
        KCb A0F = KDC.DEFAULT_INSTANCE.A0F();
        A0F.A08(lfu.A05);
        A0F.A07(lfu.A02);
        A0F.A06(lfu.A00);
        return A0F.A04();
    }

    public static KCc A0A() {
        return KDD.DEFAULT_INSTANCE.A0F();
    }

    public static Object A0B(KDF kdf, Integer num) {
        return kdf.A0H(num);
    }

    public int A0C(ML1 ml1) {
        int i;
        KDF kdf = (KDF) this;
        int i2 = kdf.memoizedSerializedSize;
        int i3 = (-1) << (-1);
        if ((i2 & i3) != 0) {
            if (ml1 == null) {
                ml1 = JQy.A0e(kdf);
            }
            i = ml1.BA4(kdf);
            if (i < 0) {
                throw 4YV.A0h("serialized size must be non-negative, was ", i);
            }
        } else {
            int i4 = (-1) >>> 1;
            i = i2 & i4;
            if (i == i4) {
                if (ml1 == null) {
                    ml1 = JQy.A0e(kdf);
                }
                int BA4 = ml1.BA4(kdf);
                if (BA4 < 0) {
                    throw 4YV.A0h("serialized size must be non-negative, was ", BA4);
                }
                kdf.memoizedSerializedSize = (i4 & BA4) | (kdf.memoizedSerializedSize & i3);
                return BA4;
            }
        }
        return i;
    }

    public KBy A0D() {
        try {
            int A0C = A0C(null);
            Lj4 lj4 = Lj4.A00;
            byte[] bArr = new byte[A0C];
            KBw kBw = new KBw(bArr, A0C);
            ML1 A0e = JQy.A0e(this);
            Kp1 kp1 = kBw.A01;
            if (kp1 == null) {
                new Kp1(kBw);
            }
            A0e.DBK(kp1, this);
            if (kBw.A02 - kBw.A00 == 0) {
                return new KBy(bArr);
            }
            throw AnonymousClass001.A0N("Did not write as much data as expected.");
        } catch (IOException e) {
            throw 1BK.A0s(0Pz.A0z("Serializing ", AnonymousClass001.A0Y(this), " to a ", "ByteString", " threw an IOException (should never happen)."), e);
        }
    }

    public byte[] A0E() {
        try {
            int A0C = A0C(null);
            byte[] bArr = new byte[A0C];
            KBw kBw = new KBw(bArr, A0C);
            ML1 A0e = JQy.A0e(this);
            Kp1 kp1 = kBw.A01;
            if (kp1 == null) {
                new Kp1(kBw);
            }
            A0e.DBK(kp1, this);
            if (kBw.A02 - kBw.A00 == 0) {
                return bArr;
            }
            throw AnonymousClass001.A0N("Did not write as much data as expected.");
        } catch (IOException e) {
            throw 1BK.A0s(0Pz.A0z("Serializing ", AnonymousClass001.A0Y(this), " to a ", "byte array", " threw an IOException (should never happen)."), e);
        }
    }
}
