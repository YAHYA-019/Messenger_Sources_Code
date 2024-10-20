package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.04F, reason: invalid class name */
/* loaded from: 04F.class */
public final class C04F implements C04G {
    public static final Integer A0C = 0S2.A00;
    public IntBuffer A03;
    public AnonymousClass076 A04;
    public AnonymousClass078 A05;
    public final int A06;
    public final int A07;
    public final 0EO A08;
    public final 0EO A09;
    public final C15h A0A;
    public final C15h A0B;
    public int A02 = 1;
    public int A00 = 0;
    public int A01 = 0;

    public C04F(C15h c15h, C15h c15h2, int i, int i2, boolean z) {
        0EO r307;
        this.A07 = i * 2 * 3 * 4;
        this.A06 = i2;
        this.A0A = c15h;
        this.A0B = c15h2;
        if (z) {
            this.A09 = new 0EO();
            r307 = new 0EO();
        } else {
            r307 = null;
        }
        this.A08 = r307;
    }

    private int A00(int i, int i2, String str) {
        AnonymousClass076 anonymousClass076 = this.A04;
        if (anonymousClass076 != null) {
            int i3 = 0;
            while (true) {
                int A01 = ((anonymousClass076.A00 * i3) + AnonymousClass076.A01(anonymousClass076, i, i2, i3)) * 3;
                IntBuffer intBuffer = anonymousClass076.A01;
                intBuffer.position(A01);
                int i4 = intBuffer.get();
                int i5 = intBuffer.get();
                if (i != i4 || i2 != i5) {
                    i3++;
                    if (i3 >= 2) {
                        break;
                    }
                } else {
                    int i6 = intBuffer.get();
                    if (i6 != 0) {
                        int i7 = (1879048192 & i6) >>> 28;
                        if (i7 < 5) {
                            int i8 = i6 & ((-1) >>> 4);
                            int i9 = (-1) << (-1);
                            boolean z = false;
                            if ((i6 & i9) != 0) {
                                z = true;
                            }
                            AnonymousClass076 anonymousClass0762 = this.A04;
                            int i10 = ((i7 + 1) << 28) | i8;
                            if (z) {
                                i10 |= i9;
                            }
                            anonymousClass0762.A03(i, i2, i10);
                            return i8;
                        }
                        C15h c15h = this.A0A;
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
        0EO r02 = this.A08;
        if (r02 == null || (r0 = this.A09) == null) {
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
        0EO r02 = this.A08;
        if (r02 == null || (r0 = this.A09) == null) {
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
        C15h c15h = this.A0A;
        if (c15h != null) {
            if ((i2 & 2) != 0) {
                ((02R) c15h.get()).Cg9(i, str, "key");
            }
            if ((i2 & 4) != 0) {
                ((02R) c15h.get()).Cg9(i, str, "value");
            }
        }
    }

    private void A04(RandomAccessFile randomAccessFile, long j) {
        synchronized (this) {
            int i = ((int) j) + 16;
            int i2 = this.A07;
            int i3 = i2 + i;
            try {
                randomAccessFile.seek(j);
                randomAccessFile.writeInt(3);
                randomAccessFile.writeInt(i3);
                randomAccessFile.writeInt(-1);
                randomAccessFile.writeInt(-1);
                FileChannel channel = randomAccessFile.getChannel();
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                this.A03 = channel.map(mapMode, j, 16).asIntBuffer();
                if (i2 > 0) {
                    this.A04 = new AnonymousClass076(randomAccessFile.getChannel().map(mapMode, i, i2));
                }
                int i4 = this.A06;
                if (i4 > 12) {
                    this.A05 = new AnonymousClass078(i4, randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, i3, i4));
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x02fb A[Catch: all -> 0x0583, IOException -> 0x0591, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0583, blocks: (B:3:0x002e, B:5:0x0033, B:8:0x0042, B:11:0x0047, B:12:0x004d, B:15:0x007b, B:16:0x0080, B:18:0x0094, B:21:0x00bc, B:22:0x00c3, B:24:0x00d2, B:25:0x00d9, B:26:0x00de, B:28:0x00e8, B:30:0x00ef, B:32:0x00f6, B:34:0x00fd, B:37:0x0108, B:40:0x0116, B:41:0x011d, B:42:0x0124, B:48:0x014b, B:49:0x0152, B:51:0x015d, B:53:0x0166, B:54:0x016e, B:64:0x0192, B:65:0x0197, B:66:0x019c, B:69:0x01a3, B:70:0x01a8, B:71:0x01af, B:75:0x01c4, B:79:0x01d2, B:81:0x01da, B:84:0x01e8, B:154:0x01f4, B:88:0x0202, B:90:0x020b, B:93:0x0214, B:95:0x0222, B:97:0x022a, B:98:0x022f, B:100:0x0236, B:102:0x023d, B:148:0x041e, B:149:0x0425, B:151:0x042e, B:128:0x028f, B:129:0x0296, B:131:0x029d, B:132:0x02a4, B:133:0x02ac, B:135:0x02b3, B:136:0x02b8, B:138:0x02c1, B:139:0x02c8, B:144:0x02d8, B:121:0x02df, B:106:0x0254, B:107:0x025b, B:109:0x0262, B:111:0x0269, B:113:0x0270, B:114:0x0277, B:119:0x0287, B:159:0x0312, B:161:0x02ed, B:164:0x02fb, B:231:0x0307, B:168:0x031d, B:170:0x0326, B:173:0x032f, B:175:0x033d, B:177:0x0345, B:178:0x034a, B:180:0x0351, B:182:0x0358, B:228:0x0407, B:229:0x040e, B:208:0x03aa, B:209:0x03b1, B:211:0x03b8, B:212:0x03bf, B:213:0x03c7, B:215:0x03ce, B:216:0x03d3, B:218:0x03dc, B:219:0x03e3, B:224:0x03f3, B:201:0x03fa, B:186:0x036f, B:187:0x0376, B:189:0x037d, B:191:0x0384, B:193:0x038b, B:194:0x0392, B:199:0x03a2, B:236:0x0431, B:237:0x0436, B:238:0x043f, B:241:0x044d, B:242:0x0456, B:243:0x045d, B:246:0x046a, B:248:0x0471, B:249:0x0476, B:251:0x047e, B:252:0x0487), top: B:2:0x002e }] */
    /* JADX WARN: Type inference failed for: r0v127, types: [X.07A, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x030d -> B:144:0x0310). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C07K[] A05(X.07J r301, java.io.RandomAccessFile r302, long r303, long r305) {
        /*
            Method dump skipped, instructions count: 1429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04F.A05(X.07J, java.io.RandomAccessFile, long, long):X.07K[]");
    }

    @Override // X.C04G
    public long BCg() {
        int i = 0;
        int i2 = (this.A04 != null ? this.A07 : 0) + 16;
        if (this.A05 != null) {
            i = this.A06;
        }
        return i2 + i;
    }

    @Override // X.C04G
    public Integer BCh() {
        return A0C;
    }

    @Override // X.C04G
    public int BCi() {
        return 2;
    }

    @Override // X.C04G
    public void BPS(File file, String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(0Pz.A0v(file.getAbsolutePath(), "/", "qpl_v2_", str), "rw");
            try {
                A04(randomAccessFile, 0L);
                randomAccessFile.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    @Override // X.C04G
    public void BPT(RandomAccessFile randomAccessFile, long j) {
        A04(randomAccessFile, j);
    }

    @Override // X.C04H
    public void Cd0(int i, int i2, String str, int i3) {
        synchronized (this) {
            int A00 = A00(i, i2, str);
            if (A00 != -1) {
                AnonymousClass078 anonymousClass078 = this.A05;
                if (anonymousClass078 != null) {
                    ByteBuffer byteBuffer = AnonymousClass078.A04;
                    byteBuffer.position(0);
                    byteBuffer.putInt(i3);
                    A03(i, str, AnonymousClass078.A00(anonymousClass078, str, byteBuffer.array(), A00, 1));
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd1(int i, int i2, String str, String str2) {
        synchronized (this) {
            int A00 = A00(i, i2, str);
            if (A00 != -1) {
                AnonymousClass078 anonymousClass078 = this.A05;
                if (anonymousClass078 != null) {
                    if (str2 == null) {
                        str2 = "null";
                    }
                    A03(i, str, AnonymousClass078.A00(anonymousClass078, str, str2.getBytes(), A00, 0));
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
            AnonymousClass076 anonymousClass076 = this.A04;
            if (anonymousClass076 != null) {
                anonymousClass076.A02(i, i2);
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
            AnonymousClass076 anonymousClass076 = this.A04;
            if (anonymousClass076 != null) {
                int i3 = this.A02 + 1;
                this.A02 = i3;
                if ((1879048192 & i3) != 0) {
                    this.A02 = 1;
                    i3 = 1;
                }
                if (z) {
                    i3 |= (-1) << (-1);
                }
                int A03 = anonymousClass076.A03(i, i2, i3);
                if (A03 != 0) {
                    C15h c15h = this.A0A;
                    if (c15h != null) {
                        ((02R) c15h.get()).Cg7(A03, 2, ((this.A07 / 4) / 3) / 2, this.A06);
                    }
                }
                A02(i, i2, z);
            }
        }
    }

    @Override // X.C04H
    public void Cd6() {
        synchronized (this) {
            AnonymousClass076 anonymousClass076 = this.A04;
            if (anonymousClass076 != null) {
                IntBuffer intBuffer = anonymousClass076.A01;
                intBuffer.position(0);
                int i = 0;
                do {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        int i4 = anonymousClass076.A00;
                        if (i3 >= i4) {
                            break;
                        }
                        int i5 = intBuffer.get();
                        intBuffer.get();
                        int i6 = intBuffer.get();
                        if (i5 != 0 && i6 != 0 && (i6 & ((-1) << (-1))) != 0) {
                            int position = intBuffer.position();
                            intBuffer.position(((i * i4) + i3) * 3);
                            intBuffer.put(AnonymousClass076.A02);
                            intBuffer.position(position);
                        }
                        i2 = i3 + 1;
                    }
                    i++;
                } while (i < 2);
                if (this.A08 != null) {
                    0EO r0 = this.A09;
                    if (r0 != null) {
                        this.A01 = 0;
                        r0.A00 = 0;
                        IntBuffer intBuffer2 = this.A03;
                        if (intBuffer2 != null) {
                            intBuffer2.put(2, this.A00);
                        }
                    }
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd7(int i, int i2, boolean z) {
        synchronized (this) {
            AnonymousClass076 anonymousClass076 = this.A04;
            if (anonymousClass076 != null) {
                int A02 = anonymousClass076.A02(i, i2);
                if (A02 != 0) {
                    int i3 = A02 & ((-1) >>> 4);
                    int i4 = (A02 & 1879048192) >>> 28;
                    AnonymousClass076 anonymousClass0762 = this.A04;
                    int i5 = i3 | (i4 << 28);
                    if (z) {
                        i5 |= (-1) << (-1);
                    }
                    anonymousClass0762.A03(i, i2, i5);
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
