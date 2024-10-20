package X;

import android.os.SystemClock;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.facebook.acra.constants.ActionId;
import java.nio.MappedByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0pu, reason: invalid class name */
/* loaded from: 0pu.class */
public final class C0pu {
    public static AtomicReference A03 = new AtomicReference();
    public String A00;
    public final C0pe A01;
    public final Object A02;

    public C0pu(C0pe c0pe) {
        String str;
        Object A0R = AnonymousClass001.A0R();
        this.A02 = A0R;
        this.A01 = c0pe;
        if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(A03, null, this)) {
            A03(this, 0S2.A02, null, null, "", ' ', '0', false, true, false, false, false);
            A0B(C0h0.A0Z);
            A06(' ');
            synchronized (this.A02) {
                this.A01.A00.put(205, (byte) 32);
                A02(this);
            }
            synchronized (this.A02) {
                this.A01.A00.put(206, (byte) 48);
                A02(this);
            }
            A0C("", 0L, false);
            A07(-1);
            str = "unknown";
            int i = 0;
            str = str.length() > 1000 ? str.substring(0, 1000) : "unknown";
            synchronized (this.A02) {
                MappedByteBuffer mappedByteBuffer = this.A01.A00;
                mappedByteBuffer.putShort(753, (short) 0);
                byte[] bytes = str.getBytes();
                while (true) {
                    int length = bytes.length;
                    if (i < length) {
                        mappedByteBuffer.put(i + 755, bytes[i]);
                        i++;
                    } else {
                        mappedByteBuffer.putShort(753, (short) length);
                        A02(this);
                    }
                }
            }
            A0A(0L, 0L, true);
            A09(0L, 0L, true);
            synchronized (A0R) {
                c0pe.A00.put(2242, (byte) 0);
            }
            synchronized (this.A02) {
                this.A01.A00.putLong(1769, 0L);
                A02(this);
            }
        }
    }

    private void A00(int i, int i2, long j, long j2) {
        boolean z = false;
        if (i2 != -103) {
            z = true;
            if (i2 < 0) {
                throw AnonymousClass001.A0L(String.format("Offset %d cannot be negative", AnonymousClass001.A1a(i2)));
            }
        }
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        synchronized (this.A02) {
            MappedByteBuffer mappedByteBuffer = this.A01.A00;
            mappedByteBuffer.put(i, (byte) 1);
            if (z) {
                mappedByteBuffer.put(i2, (byte) 1);
            }
            mappedByteBuffer.putLong(i + 1, j);
            if (z) {
                mappedByteBuffer.putLong(i2 + 1, j);
            }
            mappedByteBuffer.putLong(i + 9, j2);
            if (z) {
                mappedByteBuffer.putLong(i2 + 9, j2);
            }
            mappedByteBuffer.put(i, (byte) 0);
            if (z) {
                mappedByteBuffer.put(i2, (byte) 0);
            }
        }
    }

    public static void A01(long j) {
        if (j < 0) {
            throw AnonymousClass001.A0L(String.format("Timestamp %d is invalid since it is negative", Long.valueOf(j)));
        }
    }

    public static void A02(C0pu c0pu) {
        c0pu.A08(System.currentTimeMillis());
    }

    public static void A03(C0pu c0pu, Integer num, Integer num2, Integer num3, String str, char c, char c2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        char A00 = 0WD.A00(num);
        if (c < 0 || c > 127) {
            throw AnonymousClass001.A0N("State byte should be ASCII");
        }
        synchronized (c0pu.A02) {
            MappedByteBuffer mappedByteBuffer = c0pu.A01.A00;
            mappedByteBuffer.put(1, (byte) A00);
            mappedByteBuffer.put(196, (byte) c2);
            mappedByteBuffer.put(2, (byte) c);
            int i = 49;
            int i2 = 48;
            if (z) {
                i2 = 49;
            }
            mappedByteBuffer.put(198, (byte) i2);
            if (z2 || num.compareTo(0S2.A0Y) < 0) {
                mappedByteBuffer.put(202, (byte) 48);
                mappedByteBuffer.put(200, (byte) 48);
            }
            byte b = -1;
            int i3 = 127;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue > 127) {
                    intValue = 127;
                }
                mappedByteBuffer.put(203, (byte) intValue);
            } else {
                mappedByteBuffer.put(203, (byte) -1);
            }
            if (num3 != null) {
                int intValue2 = num3.intValue();
                if (intValue2 <= 127) {
                    i3 = intValue2;
                }
                b = (byte) i3;
            }
            mappedByteBuffer.put(204, b);
            if (z3) {
                int i4 = 48;
                if (z4) {
                    i4 = 49;
                }
                mappedByteBuffer.put(1985, (byte) i4);
                if (!z5) {
                    i = 48;
                }
                mappedByteBuffer.put(1986, (byte) i);
            }
            if (str != null) {
                A04(c0pu, str, 1987, 255);
            }
            A02(c0pu);
        }
    }

    public static void A04(C0pu c0pu, String str, int i, int i2) {
        int i3 = 0;
        if (str.length() > i2) {
            str = str.substring(0, i2);
        }
        synchronized (c0pu.A02) {
            MappedByteBuffer mappedByteBuffer = c0pu.A01.A00;
            mappedByteBuffer.put(i, (byte) 0);
            byte[] bytes = str.getBytes();
            while (true) {
                int length = bytes.length;
                if (i3 < length) {
                    mappedByteBuffer.put(i + 1 + i3, bytes[i3]);
                    i3++;
                } else {
                    mappedByteBuffer.put(i, (byte) length);
                }
            }
        }
    }

    public static void A05(C0pu c0pu, String str, int i, int i2, boolean z) {
        if (str == null) {
            str = "";
        }
        synchronized (c0pu.A02) {
            c0pu.A01.A00.put(i, z ? (byte) 1 : (byte) 0);
            A04(c0pu, str, i2, 128);
            A02(c0pu);
        }
    }

    public void A06(char c) {
        synchronized (this.A02) {
            this.A01.A00.put(ActionId.DISPLAYED_ON_SCREEN, (byte) c);
            A02(this);
        }
    }

    public void A07(int i) {
        synchronized (this.A02) {
            MappedByteBuffer mappedByteBuffer = this.A01.A00;
            mappedByteBuffer.putInt(749, i);
            mappedByteBuffer.putLong(1753, System.currentTimeMillis());
            mappedByteBuffer.putLong(1761, SystemClock.uptimeMillis());
            A02(this);
        }
    }

    public void A08(long j) {
        synchronized (this.A02) {
            A04(this, Long.toString(j), 180, 15);
        }
    }

    public void A09(long j, long j2, boolean z) {
        A01(j);
        A01(j2);
        int i = -103;
        if (z) {
            i = 258;
        }
        A00(241, i, j, j2);
        synchronized (this.A02) {
            A02(this);
        }
    }

    public void A0A(long j, long j2, boolean z) {
        A01(j);
        A01(j2);
        int i = -103;
        if (z) {
            i = 224;
        }
        A00(207, i, j, j2);
        synchronized (this.A02) {
            A02(this);
        }
    }

    public void A0B(C0h0 c0h0) {
        char c = c0h0.mSymbol;
        if (c < 0 || c > 127) {
            throw AnonymousClass001.A0N("State byte should be ASCII");
        }
        synchronized (this.A02) {
            this.A01.A00.put(0, (byte) c);
            A02(this);
        }
    }

    public void A0C(String str, long j, boolean z) {
        int i = 48;
        if (z) {
            i = 49;
        }
        synchronized (this.A02) {
            MappedByteBuffer mappedByteBuffer = this.A01.A00;
            mappedByteBuffer.put(275, (byte) i);
            mappedByteBuffer.putLong(276, j);
            A04(this, str, 284, 80);
            A02(this);
        }
    }
}
