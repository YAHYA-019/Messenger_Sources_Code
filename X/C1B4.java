package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/* renamed from: X.1B4, reason: invalid class name */
/* loaded from: 1B4.class */
public final class C1B4 implements C04G {
    public static final Integer A0F = 0S2.A00;
    public IntBuffer A03;
    public 15B A04;
    public 15N A05;
    public final int A06;
    public final int A07;
    public final C15h A08;
    public final int A09;
    public final 0EO A0A;
    public final 0EO A0B;
    public final C15h A0C;
    public final boolean A0D;
    public final boolean A0E;
    public int A02 = 1;
    public int A00 = 0;
    public int A01 = 0;

    public C1B4(C15h c15h, C15h c15h2, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        0EO r310;
        this.A0E = z2;
        this.A0D = z3;
        this.A09 = i3;
        this.A07 = i * 3 * 12;
        this.A06 = i2 * 3 * ActionId.RTMP_CONNECTION_RELEASE;
        this.A08 = c15h;
        this.A0C = c15h2;
        if (z) {
            this.A0B = new 0EO();
            r310 = new 0EO();
        } else {
            r310 = null;
            this.A0B = null;
        }
        this.A0A = r310;
    }

    private int A00(int i, int i2, String str) {
        15N r0 = this.A05;
        if (r0 != null) {
            C0j2 c0j2 = r0.A02;
            c0j2.A01 = i;
            c0j2.A00 = i2;
            15I r02 = r0.A01;
            C0hi c0hi = r0.A03;
            int i3 = 0;
            while (true) {
                int A00 = ((i3 * r02.A03) + 15I.A00(c0j2, r02, i3)) * r02.A02;
                ByteBuffer byteBuffer = r02.A06;
                byteBuffer.position(A00);
                15E r03 = r02.A04;
                r03.Cav(byteBuffer);
                if (r03.isEmpty() || !c0j2.equals(r03)) {
                    i3++;
                    if (i3 >= 3) {
                        break;
                    }
                } else {
                    c0hi.Cav(byteBuffer);
                    int i4 = c0hi.A00;
                    if (i4 != 0) {
                        int i5 = (1879048192 & i4) >>> 28;
                        if (i5 < 5) {
                            int i6 = i4 & ((-1) >>> 4);
                            int i7 = (-1) << (-1);
                            int i8 = i6 | ((i5 + 1) << 28);
                            if (AnonymousClass001.A1N(i4 & i7)) {
                                i8 |= i7;
                            }
                            this.A05.A00(i, i2, i8);
                            return i8;
                        }
                        C15h c15h = this.A08;
                        if (c15h != null) {
                            ((02R) c15h.get()).Cg6(i, str, "exceeded number of annotations per event");
                        }
                    }
                }
            }
        }
        return -1;
    }

    private void A01(int i, int i2) {
        0EO r0;
        0EO r02 = this.A0A;
        if (r02 == null || (r0 = this.A0B) == null) {
            return;
        }
        if (r0.A01(i, i2)) {
            this.A01--;
        }
        if (r02.A01(i, i2)) {
            this.A00--;
        }
        IntBuffer intBuffer = this.A03;
        if (intBuffer != null) {
            intBuffer.put(2, this.A00 + this.A01);
        }
    }

    private void A02(int i, int i2, boolean z) {
        0EO r0;
        0EO r02 = this.A0A;
        if (r02 == null || (r0 = this.A0B) == null) {
            return;
        }
        if (z) {
            this.A01++;
            r0.A00(i, i2);
        } else {
            this.A00++;
            r02.A00(i, i2);
        }
        IntBuffer intBuffer = this.A03;
        if (intBuffer != null) {
            intBuffer.put(2, this.A00 + this.A01);
        }
    }

    private void A03(int i, String str, int i2) {
        C15h c15h = this.A08;
        if (c15h != null) {
            if ((i2 & 2) != 0) {
                ((02R) c15h.get()).Cg9(i, str, "key");
            }
            if ((i2 & 4) != 0) {
                ((02R) c15h.get()).Cg9(i, str, "value");
            }
        }
    }

    public static void A04(C1B4 c1b4, int i, int i2) {
        synchronized (c1b4) {
            if (c1b4.A04 != null) {
                while (i2 > 0) {
                    15B r0 = c1b4.A04;
                    15J r02 = r0.A00;
                    r02.A01 = i;
                    r02.A00 = i2;
                    r0.A02.A03(r02, r0.A01);
                    i2--;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0kw] */
    private void A05(RandomAccessFile randomAccessFile, long j) {
        synchronized (this) {
            int i = ((int) j) + 16;
            int i2 = this.A07;
            int i3 = i2 + i;
            try {
                randomAccessFile.seek(j);
                randomAccessFile.writeInt(4);
                randomAccessFile.writeInt(i3);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeInt(-1);
                FileChannel channel = randomAccessFile.getChannel();
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                this.A03 = channel.map(mapMode, j, 16).asIntBuffer();
                if (i2 > 0) {
                    15N r0 = new 15N(randomAccessFile.getChannel().map(mapMode, i, i2));
                    this.A05 = r0;
                    int i4 = this.A09;
                    15I r02 = r0.A01;
                    r02.A00 = i4;
                    r02.A01 = this.A0E;
                }
                int i5 = this.A06;
                if (i5 > 0) {
                    15B r03 = new 15B(randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, i3, i5));
                    this.A04 = r03;
                    int i6 = this.A09;
                    15I r04 = r03.A02;
                    r04.A00 = i6;
                    r04.A01 = this.A0D;
                }
            } catch (IOException unused) {
            }
            15N r05 = this.A05;
            if (r05 != null) {
                final 0gU r06 = new 0gU(this);
                r05.A00 = new Object() { // from class: X.0kw
                };
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0350, code lost:
    
        r342 = r342 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C07K[] A06(X.07J r301, java.io.RandomAccessFile r302, long r303, long r305) {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B4.A06(X.07J, java.io.RandomAccessFile, long, long):X.07K[]");
    }

    @Override // X.C04G
    public long BCg() {
        int i = 0;
        int i2 = (this.A05 != null ? this.A07 : 0) + 16;
        if (this.A04 != null) {
            i = this.A06;
        }
        return i2 + i;
    }

    @Override // X.C04G
    public Integer BCh() {
        return A0F;
    }

    @Override // X.C04G
    public int BCi() {
        return 3;
    }

    @Override // X.C04G
    public void BPS(File file, String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(0Pz.A0v(file.getAbsolutePath(), "/", "qpl_v3_", str), "rw");
            try {
                A05(randomAccessFile, 0L);
                randomAccessFile.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    @Override // X.C04G
    public void BPT(RandomAccessFile randomAccessFile, long j) {
        A05(randomAccessFile, j);
    }

    @Override // X.C04H
    public void Cd0(int i, int i2, String str, int i3) {
        synchronized (this) {
            if ((i != 0 || i2 != 0) && str != null) {
                int A00 = A00(i, i2, str);
                if (A00 != -1) {
                    15B r0 = this.A04;
                    if (r0 != null) {
                        int i4 = A00 & ((-1) >>> 4);
                        int i5 = (A00 & 1879048192) >>> 28;
                        if (i4 == 0) {
                            throw AnonymousClass001.A0L("EventId 0 is reserved for internal purpose and can't be used");
                        }
                        15J r02 = r0.A00;
                        r02.A01 = i4;
                        r02.A00 = i5;
                        0lT r03 = r0.A01;
                        int A002 = 0lT.A00(r03, str);
                        r03.A02 = -1;
                        r03.A00 = i3;
                        r0.A02.A02(r02, r03, (C0kw) null);
                        A03(i, str, A002);
                    }
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd1(int i, int i2, String str, String str2) {
        synchronized (this) {
            if ((i != 0 || i2 != 0) && str != null) {
                if (str2 == null) {
                    str2 = "null";
                }
                int A00 = A00(i, i2, str);
                if (A00 != -1) {
                    15B r0 = this.A04;
                    if (r0 != null) {
                        int i3 = A00 & ((-1) >>> 4);
                        int i4 = (A00 & 1879048192) >>> 28;
                        if (i3 == 0) {
                            throw AnonymousClass001.A0L("EventId 0 is reserved for internal purpose and can't be used");
                        }
                        15J r02 = r0.A00;
                        r02.A01 = i3;
                        r02.A00 = i4;
                        0lT r03 = r0.A01;
                        int A002 = 0lT.A00(r03, str);
                        ByteBuffer encode = StandardCharsets.UTF_8.encode(str2);
                        if (encode != null) {
                            if (encode.limit() > 50) {
                                A002 |= 4;
                            }
                            int min = Math.min(encode.limit(), 50);
                            r03.A02 = min;
                            encode.get(r03.A04, 0, min);
                        } else {
                            r03.A02 = 0;
                        }
                        r0.A02.A02(r02, r03, (C0kw) null);
                        A03(i, str, A002);
                    }
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd2(int i, int i2) {
        Cd3(i, i2);
    }

    @Override // X.C04H
    public void Cd3(int i, int i2) {
        synchronized (this) {
            15N r0 = this.A05;
            if (r0 != null && (i != 0 || i2 != 0)) {
                C0j2 c0j2 = r0.A02;
                c0j2.A01 = i;
                c0j2.A00 = i2;
                15I r02 = r0.A01;
                C0hi c0hi = r0.A03;
                if (r02.A03(c0j2, c0hi)) {
                    int i3 = c0hi.A00;
                    if (i3 != 0) {
                        A04(this, i3 & ((-1) >>> 4), (i3 & 1879048192) >>> 28);
                    }
                }
                A01(i, i2);
            }
        }
    }

    @Override // X.C04H
    public void Cd4(int i, int i2, String str) {
    }

    @Override // X.C04H
    public void Cd5(int i, int i2, boolean z) {
        synchronized (this) {
            15N r0 = this.A05;
            if (r0 != null && (i != 0 || i2 != 0)) {
                int i3 = this.A02 + 1;
                this.A02 = i3;
                if ((1879048192 & i3) != 0) {
                    this.A02 = 1;
                    i3 = 1;
                }
                if (z) {
                    i3 |= (-1) << (-1);
                }
                r0.A00(i, i2, i3);
                A02(i, i2, z);
            }
        }
    }

    @Override // X.C04H
    public void Cd6() {
        synchronized (this) {
            15N r0 = this.A05;
            if (r0 != null) {
                15I r02 = r0.A01;
                ByteBuffer byteBuffer = r02.A06;
                byteBuffer.position(0);
                int i = 0;
                do {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        int i4 = r02.A03;
                        if (i3 >= i4) {
                            break;
                        }
                        int i5 = (i * i4) + i3;
                        int i6 = r02.A02;
                        byteBuffer.position(i5 * i6);
                        15E r03 = r02.A04;
                        r03.Cav(byteBuffer);
                        if (!r03.isEmpty()) {
                            15H r04 = r02.A05;
                            r04.Cav(byteBuffer);
                            int i7 = ((C0hi) r04).A00;
                            if ((((-1) << (-1)) & i7) != 0) {
                                A04(this, i7 & ((-1) >>> 4), (i7 & 1879048192) >>> 28);
                                int position = byteBuffer.position();
                                byteBuffer.position(((i * i4) + i3) * i6);
                                byteBuffer.put(r02.A07);
                                byteBuffer.position(position);
                            }
                        }
                        i2 = i3 + 1;
                    }
                    i++;
                } while (i < 3);
                if (this.A0A != null) {
                    0EO r05 = this.A0B;
                    if (r05 != null) {
                        this.A01 = 0;
                        r05.A00 = 0;
                        IntBuffer intBuffer = this.A03;
                        if (intBuffer != null) {
                            intBuffer.put(2, this.A00);
                        }
                    }
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd7(int i, int i2, boolean z) {
        synchronized (this) {
            15N r0 = this.A05;
            if (r0 != null && (i != 0 || i2 != 0)) {
                C0j2 c0j2 = r0.A02;
                c0j2.A01 = i;
                c0j2.A00 = i2;
                15I r02 = r0.A01;
                C0hi c0hi = r0.A03;
                if (r02.A03(c0j2, c0hi)) {
                    int i3 = c0hi.A00;
                    if (i3 != 0) {
                        int i4 = i3 & ((-1) >>> 4);
                        int i5 = (i3 & 1879048192) >>> 28;
                        15N r03 = this.A05;
                        int i6 = i4 | (i5 << 28);
                        if (z) {
                            i6 |= (-1) << (-1);
                        }
                        r03.A00(i, i2, i6);
                    }
                }
                A01(i, i2);
                A02(i, i2, z);
            }
        }
    }

    @Override // X.C04H
    public void Ctc(QuickPerformanceLogger quickPerformanceLogger) {
    }
}
