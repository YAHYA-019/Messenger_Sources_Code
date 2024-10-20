package X;

import android.os.SystemClock;
import com.facebook.acra.constants.ActionId;
import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0pf, reason: invalid class name */
/* loaded from: 0pf.class */
public final class C0pf implements 0hJ {
    public static final java.util.Map A0I;
    public int A01;
    public int A02;
    public long A03;
    public 0hR A04;
    public Boolean A05;
    public ScheduledExecutorService A06;
    public ScheduledFuture A07;
    public boolean A08;
    public boolean A09;
    public final 0WC A0A;
    public final C0pe A0D;
    public final C0jQ A0E;
    public final short A0G;
    public int A00 = 0;
    public final C0pj A0B = new C0pj(this);
    public final C0pi A0C = new C0pi(this);
    public final Runnable A0F = new 0hI(this);
    public final 0hN A0H = new 0hN() { // from class: X.0pg
        public byte AaV(int i) {
            if (i == 2) {
                return (byte) 0;
            }
            throw 0Pz.A04("Not a byte field: ", i);
        }

        public int ArV(int i) {
            if (i == 0) {
                return 0;
            }
            throw 0Pz.A04("Not an int field: ", i);
        }

        public long Av3(int i) {
            throw AnonymousClass001.A0L("No long field");
        }

        public int Azk() {
            return 3;
        }

        public short BAW(int i) {
            if (i == 1) {
                return C0pf.this.A0G;
            }
            throw 0Pz.A04("Not a short field: ", i);
        }

        public int BBA(int i) {
            int i2 = 4;
            if (i != 0) {
                i2 = 2;
                if (i != 1) {
                    if (i == 2) {
                        return 1;
                    }
                    throw new IllegalArgumentException();
                }
            }
            return i2;
        }
    };

    static {
        HashMap A0u = AnonymousClass001.A0u();
        A0I = A0u;
        AnonymousClass001.A1A(100, A0u, 0);
        AnonymousClass001.A1A(125, A0u, 1);
        AnonymousClass001.A1A(Integer.valueOf(ActionId.APP_DID_FINISH_LAUNCHING), A0u, 2);
        AnonymousClass001.A1A(150, A0u, 3);
        AnonymousClass001.A1A(200, A0u, 4);
        AnonymousClass001.A1A(230, A0u, 5);
        AnonymousClass001.A1A(300, A0u, 6);
        AnonymousClass001.A1A(325, A0u, 7);
        AnonymousClass001.A1A(350, A0u, 8);
        AnonymousClass001.A1A(400, A0u, 9);
        AnonymousClass001.A1A(500, A0u, 10);
        AnonymousClass001.A1A(1000, A0u, 11);
    }

    public C0pf(0WC r302, 0hK r303, C0jQ c0jQ, File file, int i) {
        int i2;
        int i3 = (-1) >>> 1;
        this.A01 = i3;
        this.A02 = i3;
        this.A0E = c0jQ;
        if (file != null) {
            File A0D = AnonymousClass001.A0D(file, "hist.bin");
            if (A0D.exists()) {
                throw AnonymousClass001.A0N(0Pz.A0W("File exists: ", A0D.getName()));
            }
            C0pe AIX = r303.AIX(A0D, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
            this.A0D = AIX;
            if (AIX != null) {
                Integer[] A00 = 0S2.A00(25);
                int length = A00.length;
                int[] iArr = new int[length - 1];
                int i4 = 1;
                while (true) {
                    int i5 = i4;
                    if (i5 < length) {
                        int i6 = i5 - 1;
                        switch (A00[i5].intValue()) {
                            case 1:
                            case 7:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                                i2 = 7;
                                break;
                            case 2:
                            case 4:
                            case 5:
                            case 9:
                            case 10:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 21:
                            case 22:
                                i2 = 5;
                                break;
                            case 3:
                                i2 = 8;
                                break;
                            case 6:
                            case 19:
                            case 20:
                            case 23:
                                i2 = 6;
                                break;
                            case 8:
                                i2 = 10;
                                break;
                            case 24:
                                i2 = 11;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        iArr[i6] = i2;
                        i4 = i5 + 1;
                    } else {
                        this.A04 = new 0hR(this.A0H, this.A0D.A00, iArr, (byte) -7, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE, false);
                    }
                }
            }
        }
        this.A0G = i <= 32767 ? (short) i : Short.MAX_VALUE;
        this.A0A = r302;
        this.A05 = new Boolean(false);
    }

    public static void A00(C0pf c0pf) {
        synchronized (c0pf) {
            0hR r0 = c0pf.A04;
            if (r0 != null) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis() - c0pf.A03;
                    if (uptimeMillis > 2147483647L) {
                        uptimeMillis = 2147483647L;
                    }
                    int i = (int) uptimeMillis;
                    try {
                        0hR.A05(r0);
                        int i2 = r0.A0B[0];
                        MappedByteBuffer mappedByteBuffer = r0.A08;
                        int position = mappedByteBuffer.position();
                        try {
                            mappedByteBuffer.position(i2);
                            mappedByteBuffer.putInt(i);
                            mappedByteBuffer.position(position);
                        } catch (Throwable th) {
                            th = th;
                            mappedByteBuffer.position(position);
                            throw th;
                        }
                    } catch (Exception e) {
                        C0iy.A00().Bwu("AppLiftcycleUpdateLastTS", e, null);
                        A01(c0pf, e, "Exception writing timestamp");
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    public static void A01(C0pf c0pf, Exception exc, String str) {
        synchronized (c0pf) {
            c0pf.A03(exc, str, 0, 0);
        }
    }

    public static void A02(C0pf c0pf, Integer num, byte... bArr) {
        synchronized (c0pf) {
            0hR r0 = c0pf.A04;
            if (r0 != null) {
                long uptimeMillis = SystemClock.uptimeMillis() - c0pf.A03;
                if (uptimeMillis > 2147483647L) {
                    uptimeMillis = 2147483647L;
                }
                int i = (int) uptimeMillis;
                int length = bArr.length;
                byte[] bArr2 = new byte[length + 4];
                0hR.A03(i, bArr2, 0);
                System.arraycopy(bArr, 0, bArr2, 4, length);
                try {
                    r0.A0F(num.intValue(), bArr2);
                } catch (Exception e) {
                    C0iy.A00().Bwu("AppLiftcycleWrite", e, null);
                    c0pf.A03(e, "Exception writing record", num.intValue(), length);
                    try {
                        r0.A0C();
                    } catch (Exception e2) {
                        C0iy.A00().Bwu("AppLiftcycleResetBuf", e2, null);
                        A01(c0pf, e2, "Exception resetting buffer");
                    }
                }
            }
        }
    }

    private void A03(Exception exc, String str, int i, int i2) {
        synchronized (this) {
            0hR r0 = this.A04;
            if (r0 != null) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Read position: ");
                A0k.append(r0.A02);
                A0k.append(" cycle counter: ");
                A0k.append((int) r0.A00);
                A0k.append(" write position: ");
                A0k.append(r0.A08.position());
                A0k.append(" last record start: ");
                A0k.append(r0.A01);
                A0k.append(" last cycled: ");
                A0k.append(r0.A03);
                A0k.append(" record size: ");
                A0k.append(i);
                A0k.append(" space: ");
                A0k.append(i2);
                new StringBuilder();
                synchronized (r0) {
                }
                DirectReports.A01(null, null, null, null, str, A0k.toString(), exc);
            }
        }
    }

    public void A04(Integer num, Object obj) {
        synchronized (this) {
            char c = '!';
            0WC r0 = this.A0A;
            if (r0 != null) {
                c = r0.A00(0W9.A01(obj));
            }
            Integer num2 = 0S2.A0H;
            byte b = (byte) c;
            byte A00 = (byte) 0WD.A00(num);
            int hashCode = obj.hashCode();
            byte[] bArr = new byte[6];
            bArr[0] = b;
            bArr[1] = A00;
            bArr[2] = (byte) ((hashCode >>> 24) & 255);
            bArr[3] = (byte) ((hashCode >>> 16) & 255);
            bArr[4] = (byte) ((hashCode >>> 8) & 255);
            bArr[5] = (byte) (hashCode & 255);
            A02(this, num2, bArr);
        }
    }

    public void BzS(boolean z) {
        synchronized (this) {
            if (this.A08) {
                Boolean bool = this.A05;
                if (bool == null || bool.booleanValue() != z) {
                    Integer num = z ? 0S2.A1J : 0S2.A02;
                    this.A05 = new Boolean(z);
                    AnonymousClass001.A14(this, num);
                    if (z && this.A07 == null) {
                        short s = this.A0G;
                        if (s > 0) {
                            ScheduledExecutorService scheduledExecutorService = this.A06;
                            if (scheduledExecutorService != null) {
                                long j = s;
                                this.A07 = scheduledExecutorService.scheduleWithFixedDelay(this.A0F, j, j, TimeUnit.MILLISECONDS);
                            }
                        }
                    }
                } else {
                    A00(this);
                }
            }
        }
    }
}
