package X;

import android.util.SparseArray;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.IntBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Av, reason: invalid class name */
/* loaded from: 1Av.class */
public final class C1Av implements C04G {
    public final SparseArray A00 = new SparseArray();
    public final C15h A01;
    public final List A02;

    public C1Av(C15h c15h, 15U[] r303) {
        this.A01 = c15h;
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        do {
            A0s.add(r303[i].A03.getValue());
            i++;
        } while (i < 2);
        this.A02 = 0QD.A0V(A0s);
    }

    private final void A00(RandomAccessFile randomAccessFile, long j) {
        try {
            try {
                randomAccessFile.seek(j);
                randomAccessFile.writeInt(2);
                long j2 = j + 4;
                for (15X r0 : this.A02) {
                    randomAccessFile.seek(j2);
                    int i = r0.A01;
                    randomAccessFile.writeInt(i);
                    randomAccessFile.writeInt(r0.A03);
                    randomAccessFile.writeInt(0);
                    randomAccessFile.writeInt(0);
                    long j3 = 8;
                    long j4 = j2 + j3;
                    FileChannel channel = randomAccessFile.getChannel();
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    IntBuffer asIntBuffer = channel.map(mapMode, j4, j3).asIntBuffer();
                    long j5 = j2 + 16;
                    int i2 = r0.A00 * r0.A02;
                    long j6 = i2;
                    MappedByteBuffer map = randomAccessFile.getChannel().map(mapMode, j5, j6);
                    j2 = j5 + j6;
                    11T.A0D(map);
                    15T r02 = new 15T(r0, map, i2);
                    11T.A0D(asIntBuffer);
                    this.A00.put(i, new C0fp(r02, r0, asIntBuffer, this.A01));
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    @Override // X.C04G
    public long BCg() {
        Iterator it = this.A02.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2 + 4;
            }
            15X r0 = (15X) it.next();
            11T.A0F(r0, 0);
            i = i2 + (r0.A00 * r0.A02) + 16;
        }
    }

    @Override // X.C04G
    public Integer BCh() {
        return 15R.A00;
    }

    @Override // X.C04G
    public int BCi() {
        return 1;
    }

    @Override // X.C04G
    public void BPS(File file, String str) {
        11T.A0H(file, str);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(0Pz.A0j(file.getCanonicalPath(), "/qpl_higher_guarantee_", str), "rw");
            try {
                A00(randomAccessFile, 0L);
                randomAccessFile.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    @Override // X.C04G
    public void BPT(RandomAccessFile randomAccessFile, long j) {
        A00(randomAccessFile, j);
    }

    @Override // X.C04H
    public void Cd0(int i, int i2, String str, int i3) {
        C0fp c0fp = (C0fp) this.A00.get(i);
        if (c0fp != null) {
            c0fp.Cd0(i, i2, str, i3);
        }
    }

    @Override // X.C04H
    public void Cd1(int i, int i2, String str, String str2) {
        C0fp c0fp = (C0fp) this.A00.get(i);
        if (c0fp != null) {
            c0fp.Cd1(i, i2, str, str2);
        }
    }

    @Override // X.C04H
    public void Cd2(int i, int i2) {
        C0fp c0fp = (C0fp) this.A00.get(i);
        if (c0fp != null) {
            c0fp.Cd2(i, i2);
        }
    }

    @Override // X.C04H
    public void Cd3(int i, int i2) {
        C0fp c0fp = (C0fp) this.A00.get(i);
        if (c0fp != null) {
            c0fp.Cd3(i, i2);
        }
    }

    @Override // X.C04H
    public void Cd4(int i, int i2, String str) {
        this.A00.get(i);
    }

    @Override // X.C04H
    public void Cd5(int i, int i2, boolean z) {
        C0fp c0fp = (C0fp) this.A00.get(i);
        if (c0fp != null) {
            c0fp.Cd5(i, i2, z);
        }
    }

    @Override // X.C04H
    public void Cd6() {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((C0fp) sparseArray.get(sparseArray.keyAt(i2))).Cd6();
            i = i2 + 1;
        }
    }

    @Override // X.C04H
    public void Cd7(int i, int i2, boolean z) {
        C0fp c0fp = (C0fp) this.A00.get(i);
        if (c0fp != null) {
            c0fp.Cd7(i, i2, z);
        }
    }

    @Override // X.C04H
    public void Ctc(QuickPerformanceLogger quickPerformanceLogger) {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            sparseArray.get(sparseArray.keyAt(i2));
            i = i2 + 1;
        }
    }
}
