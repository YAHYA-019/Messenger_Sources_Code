package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: X.1Aw, reason: invalid class name */
/* loaded from: 1Aw.class */
public final class C1Aw implements C04G {
    public final C0l9 A00;
    public final C04G[] A01;
    public final boolean A02;

    public C1Aw(C0l9 c0l9, C04G[] c04gArr, boolean z) {
        this.A00 = c0l9;
        this.A01 = c04gArr;
        this.A02 = z;
    }

    public static boolean A00(C1Aw c1Aw, int i) {
        boolean z = false;
        if (Arrays.binarySearch(c1Aw.A00.A00, i) >= 0) {
            z = true;
        }
        return z;
    }

    @Override // X.C04G
    public long BCg() {
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = i;
            C04G[] c04gArr = this.A01;
            if (i2 >= 2) {
                return j;
            }
            j += c04gArr[i2].BCg();
            i = i2 + 1;
        }
    }

    @Override // X.C04G
    public Integer BCh() {
        return 0S2.A0C;
    }

    @Override // X.C04G
    public int BCi() {
        return 0;
    }

    @Override // X.C04G
    public void BPS(File file, String str) {
        if (this.A02) {
            try {
                RandomAccessFile A0I = AnonymousClass001.A0I(0Pz.A02("qpl_resilience_storage", str, file));
                try {
                    BPT(A0I, 0L);
                    A0I.close();
                    return;
                } finally {
                }
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        int i = 0;
        while (true) {
            int i2 = i;
            C04G[] c04gArr = this.A01;
            if (i2 >= 2) {
                return;
            }
            C04G c04g = c04gArr[i2];
            String str2 = str;
            if (str.isEmpty()) {
                str2 = String.valueOf(i2);
            } else if (i2 != 0) {
                str2 = AnonymousClass001.A0e("_", AnonymousClass001.A0n(str), i2);
            }
            c04g.BPS(file, str2);
            i = i2 + 1;
        }
    }

    @Override // X.C04G
    public void BPT(RandomAccessFile randomAccessFile, long j) {
        try {
            randomAccessFile.seek(j);
            C04G[] c04gArr = this.A01;
            randomAccessFile.writeInt(2);
            long j2 = j + 4 + 32;
            int i = 0;
            do {
                randomAccessFile.seek((i * 16) + 4);
                randomAccessFile.writeLong(j2);
                randomAccessFile.writeInt(c04gArr[i].BCh().intValue());
                randomAccessFile.writeInt(c04gArr[i].BCi());
                c04gArr[i].BPT(randomAccessFile, j2);
                j2 += c04gArr[i].BCg();
                i++;
            } while (i < 2);
        } catch (IOException unused) {
        }
    }

    @Override // X.C04H
    public void Cd0(int i, int i2, String str, int i3) {
        this.A01[A00(this, i) ? 1 : 0].Cd0(i, i2, str, i3);
    }

    @Override // X.C04H
    public void Cd1(int i, int i2, String str, String str2) {
        this.A01[A00(this, i) ? 1 : 0].Cd1(i, i2, str, str2);
    }

    @Override // X.C04H
    public void Cd2(int i, int i2) {
        this.A01[A00(this, i) ? 1 : 0].Cd2(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C04H
    public void Cd3(int i, int i2) {
        C04G[] c04gArr = this.A01;
        byte b = false;
        if (Arrays.binarySearch(this.A00.A00, i) >= 0) {
            b = true;
        }
        c04gArr[b == true ? 1 : 0].Cd3(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C04H
    public void Cd4(int i, int i2, String str) {
        C04G[] c04gArr = this.A01;
        byte b = false;
        if (Arrays.binarySearch(this.A00.A00, i) >= 0) {
            b = true;
        }
        c04gArr[b == true ? 1 : 0].Cd4(i, i2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C04H
    public void Cd5(int i, int i2, boolean z) {
        C04G[] c04gArr = this.A01;
        byte b = false;
        if (Arrays.binarySearch(this.A00.A00, i) >= 0) {
            b = true;
        }
        c04gArr[b == true ? 1 : 0].Cd5(i, i2, z);
    }

    @Override // X.C04H
    public void Cd6() {
        C04G[] c04gArr = this.A01;
        int i = 0;
        do {
            c04gArr[i].Cd6();
            i++;
        } while (i < 2);
    }

    @Override // X.C04H
    public void Cd7(int i, int i2, boolean z) {
        this.A01[A00(this, i) ? 1 : 0].Cd7(i, i2, z);
    }

    @Override // X.C04H
    public void Ctc(QuickPerformanceLogger quickPerformanceLogger) {
        C04G[] c04gArr = this.A01;
        int i = 0;
        do {
            c04gArr[i].Ctc(quickPerformanceLogger);
            i++;
        } while (i < 2);
    }
}
