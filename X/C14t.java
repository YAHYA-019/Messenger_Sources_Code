package X;

import android.os.Debug;
import java.io.File;
import java.util.List;
import java.util.Properties;
import java.util.Random;

/* renamed from: X.14t, reason: invalid class name */
/* loaded from: 14t.class */
public final class C14t implements 0vO, 0Wk, 0XE {
    public byte A00;
    public long A01;
    public long A02;
    public C14f A03;
    public final byte A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final 0hR A0A;
    public final 0vK A0C;
    public final 0XF A0D;
    public final C0pe A0E;
    public final 0hN A0F;
    public final 0hV A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final byte[] A0K;
    public final Class[] A0L;
    public final Class[] A0M;
    public boolean A04 = false;
    public final Random A0B = new Random();

    /* JADX WARN: Type inference failed for: r0v73, types: [X.0XF, java.lang.Object] */
    public C14t(C0Wy c0Wy, C0v7 c0v7, 0hK r304, File file, List list) {
        Class<?> cls;
        int i = 0;
        for (Integer num : 0S2.A00(8)) {
            if (i < A00(num)) {
                i = A00(num);
            }
        }
        this.A0K = new byte[i - 1];
        this.A0F = new 0hN() { // from class: X.0uo
            public byte AaV(int i2) {
                if (i2 == 4) {
                    return C14t.this.A05;
                }
                if (i2 == 6) {
                    return (byte) 0;
                }
                throw 0Pz.A04("Not a byte field:", i2);
            }

            public int ArV(int i2) {
                if (i2 == 0) {
                    return C14t.this.A06;
                }
                if (i2 == 1) {
                    return C14t.this.A08;
                }
                if (i2 == 2) {
                    return C14t.this.A07;
                }
                throw 0Pz.A04("Not an int field: ", i2);
            }

            public long Av3(int i2) {
                if (i2 == 3) {
                    return C14t.this.A09;
                }
                if (i2 == 5) {
                    return -1;
                }
                throw 0Pz.A04("Not a long field: ", i2);
            }

            public int Azk() {
                return 7;
            }

            public short BAW(int i2) {
                throw AnonymousClass001.A0L("No short field");
            }

            public int BBA(int i2) {
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                        return 4;
                    case 3:
                    case 5:
                        return 8;
                    case 4:
                    case 6:
                        return 1;
                    default:
                        throw 0Pz.A04("Invalid field id ", i2);
                }
            }
        };
        this.A0H = "ufad_looper_history";
        if (c0Wy.A0K()) {
            File A0D = AnonymousClass001.A0D(file, "looper.bin");
            if (A0D.exists()) {
                throw AnonymousClass001.A0N(0Pz.A0W("File exists: ", A0D.getName()));
            }
            this.A0E = r304.AIX(A0D, (int) c0Wy.A01());
        } else {
            this.A0E = null;
        }
        this.A06 = (int) c0Wy.A01();
        this.A08 = (int) c0Wy.A02();
        this.A07 = c0Wy.A0N() ? (int) c0Wy.A00() : 0;
        this.A0J = c0Wy.A0M();
        this.A0I = c0Wy.A0L();
        this.A0C = c0Wy.A0N() ? new 0vK(this, c0Wy, c0v7, list) : null;
        long currentTimeMillis = System.currentTimeMillis();
        this.A09 = currentTimeMillis;
        byte b = 0Wm.A02.A01.get() ? (byte) 1 : (byte) 2;
        this.A05 = b;
        this.A00 = b;
        this.A02 = currentTimeMillis;
        this.A0G = new 0hV(file, false);
        this.A0D = new Object();
        0Wo r0 = 0Wo.A03;
        Class<?> cls2 = r0.A00;
        if (cls2 == null) {
            try {
                cls = Class.forName("android.app.ActivityThread$H");
                cls2 = cls;
            } catch (Throwable unused) {
                cls = null;
                cls2 = null;
            }
            r0.A00 = cls;
        }
        this.A0M = new Class[]{cls2};
        this.A0L = r0.A00();
        if (this.A0E == null) {
            this.A0A = null;
            return;
        }
        Integer[] A00 = 0S2.A00(8);
        int length = A00.length;
        int[] iArr = new int[length - 1];
        for (int i2 = 1; i2 < length; i2++) {
            iArr[i2 - 1] = A00(A00[i2]);
        }
        0hR r02 = new 0hR(this.A0F, this.A0E.A00, iArr, (byte) 11, (int) c0Wy.A01(), c0Wy.A04());
        this.A0A = r02;
        this.A01 = r02.A0A();
        0Wm.A02.A00(this);
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 35;
            case 2:
                return 26;
            case 3:
            case 7:
                return 10;
            case 4:
            case 6:
                return 677;
            case 5:
                return 702;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        if (r0 == X.0S2.A0N) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01(X.C14f r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A08
            long r0 = (long) r0
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.A05(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L4b
            r0 = r301
            java.lang.Class[] r0 = r0.A0M
            r306 = r0
            r0 = r306
            int r0 = r0.length
            r307 = r0
            r0 = 0
            r308 = r0
        L20:
            r0 = r308
            r1 = r307
            if (r0 >= r1) goto L5a
            r0 = r306
            r1 = r308
            r0 = r0[r1]
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L51
            r0 = r302
            java.lang.Class r0 = r0.A09
            r310 = r0
            r0 = r310
            r1 = r309
            if (r0 != r1) goto L51
            r0 = r302
            java.lang.Class r0 = r0.A07
            r310 = r0
            r0 = r310
            if (r0 != 0) goto L51
        L4b:
            r0 = 1
            r308 = r0
        L4e:
            r0 = r308
            return r0
        L51:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            goto L20
        L5a:
            r0 = r301
            java.lang.Class[] r0 = r0.A0L
            r306 = r0
            r0 = r306
            int r0 = r0.length
            r307 = r0
            r0 = 0
            r308 = r0
        L68:
            r0 = r308
            r1 = r307
            if (r0 >= r1) goto L94
            r0 = r306
            r1 = r308
            r0 = r0[r1]
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L8b
            r0 = r302
            java.lang.Class r0 = r0.A07
            r310 = r0
            r0 = r310
            r1 = r309
            if (r0 != r1) goto L8b
            goto L4b
        L8b:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            goto L68
        L94:
            r0 = r302
            java.lang.Integer r0 = r0.A08
            r309 = r0
            java.lang.Integer r0 = X.0S2.A01
            r310 = r0
            r0 = r309
            r1 = r310
            if (r0 == r1) goto L4b
            java.lang.Integer r0 = X.0S2.A0N
            r310 = r0
            r0 = 0
            r308 = r0
            r0 = r309
            r1 = r310
            if (r0 != r1) goto L4e
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14t.A01(X.14f):boolean");
    }

    public void AQk(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        0hR r0 = this.A0A;
        if (r0 != null) {
            byte b = 2;
            if (z) {
                b = 1;
            }
            synchronized (r0) {
                r0.A0D(b, 4);
                r0.A0E(3, currentTimeMillis);
                r0.A0D(this.A00, 6);
                r0.A0E(5, this.A02);
            }
            this.A00 = b;
            this.A02 = currentTimeMillis;
        }
    }

    public C14f Afh() {
        C14f c14f;
        synchronized (this) {
            c14f = this.A03;
        }
        return c14f;
    }

    public String BCE(long j) {
        throw AnonymousClass001.A0p();
    }

    public final void BeB(C14f c14f) {
        Integer num;
        byte[] bArr;
        int intValue;
        synchronized (c14f) {
            this.A03 = null;
            0hR r0 = this.A0A;
            if (r0 != null) {
                Integer num2 = c14f.A08;
                synchronized (r0) {
                    if (A01(c14f)) {
                        num = 0S2.A01;
                        if (num2 != num) {
                            if (num2 == 0S2.A00 || num2 == 0S2.A0Y) {
                                0XF r02 = this.A0D;
                                bArr = this.A0K;
                                intValue = r02.A03(c14f, this.A0G, bArr, this.A01).intValue();
                            } else {
                                if (num2 == 0S2.A0N) {
                                    r0.A0B();
                                }
                                0hV r03 = this.A0G;
                                bArr = this.A0K;
                                intValue = 3;
                                if (0XF.A02(c14f, r03, bArr, 0)) {
                                    intValue = 4;
                                }
                            }
                            try {
                                r0.A0F(intValue, bArr);
                            } catch (IllegalStateException unused) {
                                try {
                                    r0.A0C();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    } else {
                        if (num2 == 0S2.A0C) {
                            r0.A0B();
                        }
                        num = 0S2.A00;
                    }
                    c14f.A08(num);
                }
            }
        }
    }

    public void BeE(C14f c14f) {
        Integer num;
        synchronized (c14f) {
            0hR r0 = this.A0A;
            if (r0 != null && this.A0I) {
                Integer num2 = c14f.A08;
                Integer num3 = 0S2.A01;
                if (num2 != num3 && ((0Wp) c14f).A05 == -1) {
                    synchronized (r0) {
                        C14f c14f2 = this.A03;
                        if (c14f2 != null && c14f2 == c14f) {
                            Integer num4 = c14f2.A08;
                            Integer num5 = 0S2.A0N;
                            if (num4 == num5) {
                                r0.A0B();
                            } else if (num4 == 0S2.A00 || num4 == 0S2.A0Y) {
                                0XF r02 = this.A0D;
                                byte[] bArr = this.A0K;
                                r02.A03(c14f2, this.A0G, bArr, this.A01);
                                Integer num6 = 0S2.A0C;
                                try {
                                    r0.A0F(2, bArr);
                                } catch (IllegalStateException unused) {
                                    try {
                                        r0.A0C();
                                    } catch (Exception unused2) {
                                    }
                                }
                                this.A03.A08(num6);
                            }
                            C14f c14f3 = this.A03;
                            0hV r03 = this.A0G;
                            byte[] bArr2 = this.A0K;
                            0XF.A01(bArr2, 0, c14f3.A01());
                            0XF.A01(bArr2, 4, c14f3.A00());
                            if (0Wm.A02.A01.get()) {
                                num3 = 0S2.A0C;
                            }
                            bArr2[8] = 1 - num3.intValue() != 0 ? (byte) 1 : (byte) 2;
                            List list = c14f3.A0A;
                            if (list == null || list.isEmpty()) {
                                num = 0S2.A15;
                            } else {
                                0XF.A00(c14f3, r03, bArr2, 9);
                                num = 0S2.A0u;
                            }
                            try {
                                r0.A0F(num.intValue(), bArr2);
                            } catch (IllegalStateException unused3) {
                                try {
                                    r0.A0C();
                                } catch (Exception unused4) {
                                }
                            }
                            this.A03.A08(num5);
                        }
                    }
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final void BeF(X.C14f r302) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14t.BeF(X.14f):void");
    }

    public void BjY(String str) {
        if (this.A04 || this.A0A == null) {
            return;
        }
        this.A04 = true;
        0hV r0 = this.A0G;
        String[] strArr = {"nativePollOnce:bg", "nativePollOnce", "android.view.Choreographer$FrameHandler", "android.view.Choreographer$FrameDisplayEventReceiver", "android.os.Handler", "android.app.ActivityThread$H", "android.os.Handler", "android.os.BinderProxy", "android.view.ViewRootImpl$ViewRootHandler", "android.app.ActivityThread$ContextCleanupInfo", "android.app.ActivityThread$CreateServiceData", "android.app.ActivityThread$BindServiceData"};
        synchronized (r0) {
            int i = 0;
            do {
                String str2 = strArr[i];
                Properties properties = r0.A04;
                if (properties.getProperty(str2) == null) {
                    short s = (short) (r0.A00 + 1);
                    r0.A00 = s;
                    properties.setProperty(str2, Short.toString(s));
                }
                i++;
            } while (i < 12);
            0hV.A00(r0);
        }
        0vK r02 = this.A0C;
        if (r02 == null || Debug.isDebuggerConnected()) {
            return;
        }
        r02.A00(0L, false);
    }

    public String getName() {
        return this.A0H;
    }
}
