package X;

/* loaded from: Kst.class */
public final class Kst {
    public long A00 = -1;
    public final MK5 A01;

    public Kst(MK5 mk5) {
        this.A01 = mk5;
    }

    public int A00(long j) {
        long A01 = A01();
        long j2 = 0;
        if (A01 != 0) {
            if (this.A01.getLoopCount() != 0 && j / A01 >= r0.getLoopCount()) {
                return -1;
            }
            j2 = j % A01;
        }
        int i = 0;
        long j3 = 0;
        do {
            j3 += this.A01.AnX(i);
            i++;
        } while (j2 >= j3);
        return i - 1;
    }

    public long A01() {
        long j = this.A00;
        if (j == -1) {
            this.A00 = 0L;
            int frameCount = this.A01.getFrameCount();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= frameCount) {
                    break;
                }
                this.A00 += r0.AnX(i2);
                i = i2 + 1;
            }
            j = this.A00;
        }
        return j;
    }

    public long A02(long j) {
        long A01 = A01();
        long j2 = -1;
        long j3 = 0;
        if (A01 != 0) {
            MK5 mk5 = this.A01;
            if (mk5.getLoopCount() == 0 || j / A01 < mk5.getLoopCount()) {
                long j4 = j % A01;
                int frameCount = mk5.getFrameCount();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= frameCount || j3 > j4) {
                        break;
                    }
                    j3 += mk5.AnX(i2);
                    i = i2 + 1;
                }
                return j + (j3 - j4);
            }
        }
        return j2;
    }
}
