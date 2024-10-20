package X;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: Huq.class */
public final class Huq {
    public ImU A00;
    public final int A01;
    public final String A02;
    public final TreeSet A04 = new TreeSet();
    public final ArrayList A03 = AnonymousClass001.A0s();

    public Huq(ImU imU, String str, int i) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = imU;
    }

    public long A00(long j, long j2) {
        6DP.A03(1BL.A1S((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        6DP.A03(j2 >= 0);
        H7F A01 = A01(j, j2);
        if (!((5N6) A01).A07) {
            long j3 = ((5N6) A01).A03;
            return -Math.min(j3 != -1 ? j3 : Long.MAX_VALUE, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = ((5N6) A01).A04 + ((5N6) A01).A03;
        if (j6 < j5) {
            for (5N6 r0 : this.A04.tailSet(A01, false)) {
                long j7 = r0.A04;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + r0.A03);
                if (j6 >= j5) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public H7F A01(long j, long j2) {
        long j3 = j2;
        String str = this.A02;
        long j4 = -1;
        5N6 r0 = new 5N6((File) null, str, j, j4, -9223372036854775807L);
        TreeSet treeSet = this.A04;
        H7F h7f = (H7F) treeSet.floor(r0);
        if (h7f != null && ((5N6) h7f).A04 + ((5N6) h7f).A03 > j) {
            return h7f;
        }
        5N6 r02 = (5N6) treeSet.ceiling(r0);
        if (r02 != null) {
            long j5 = r02.A04 - j;
            j3 = j2 == j4 ? j5 : Math.min(j5, j3);
        }
        return new 5N6((File) null, str, j, j3, -9223372036854775807L);
    }

    public void A02(long j) {
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = this.A03;
            if (i2 >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((Hcm) arrayList.get(i2)).A01 == j) {
                arrayList.remove(i2);
                return;
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        r306 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(long r302, long r304) {
        /*
            r301 = this;
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
        L6:
            r0 = r301
            java.util.ArrayList r0 = r0.A03
            r308 = r0
            r0 = r308
            int r0 = r0.size()
            r309 = r0
            r0 = r307
            r1 = r309
            if (r0 >= r1) goto L52
            r0 = r308
            r1 = r307
            java.lang.Object r0 = r0.get(r1)
            X.Hcm r0 = (X.Hcm) r0
            r310 = r0
            r0 = r310
            long r0 = r0.A00
            r311 = r0
            r0 = -1
            long r0 = (long) r0
            r313 = r0
            r0 = r311
            r1 = r313
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 != 0) goto L55
            r0 = r310
            long r0 = r0.A01
            r313 = r0
            r0 = r302
            r1 = r313
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 < 0) goto L8d
        L4f:
            r0 = 1
            r306 = r0
        L52:
            r0 = r306
            return r0
        L55:
            r0 = r304
            r1 = r313
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L8d
            r0 = r310
            long r0 = r0.A01
            r315 = r0
            r0 = r315
            r1 = r302
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 > 0) goto L8d
            r0 = r302
            r1 = r304
            long r0 = r0 + r1
            r313 = r0
            r0 = r315
            r1 = r311
            long r0 = r0 + r1
            r315 = r0
            r0 = r313
            r1 = r315
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 > 0) goto L8d
            goto L4f
        L8d:
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Huq.A03(long, long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061 A[LOOP:0: B:2:0x0006->B:11:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009b A[EDGE_INSN: B:12:0x009b->B:13:0x009b BREAK  A[LOOP:0: B:2:0x0006->B:11:0x0061], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(long r302, long r304) {
        /*
            r301 = this;
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
        L6:
            r0 = r301
            java.util.ArrayList r0 = r0.A03
            r308 = r0
            r0 = r308
            int r0 = r0.size()
            r309 = r0
            r0 = r307
            r1 = r309
            if (r0 >= r1) goto L84
            r0 = r308
            r1 = r307
            java.lang.Object r0 = r0.get(r1)
            X.Hcm r0 = (X.Hcm) r0
            r308 = r0
            r0 = r308
            long r0 = r0.A01
            r310 = r0
            r0 = -1
            long r0 = (long) r0
            r312 = r0
            r0 = r310
            r1 = r302
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 > 0) goto L6a
            r0 = r308
            long r0 = r0.A00
            r314 = r0
            r0 = r314
            r1 = r312
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L9b
            r0 = r310
            r1 = r314
            long r0 = r0 + r1
            r310 = r0
            r0 = r310
            r1 = r302
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r316 = r0
        L5c:
            r0 = r316
            if (r0 > 0) goto L9b
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L6
        L6a:
            r0 = r304
            r1 = r312
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L9b
            r0 = r302
            r1 = r304
            long r0 = r0 + r1
            r317 = r0
            r0 = r317
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r316 = r0
            goto L5c
        L84:
            X.Hcm r0 = new X.Hcm
            r319 = r0
            r0 = r319
            r1 = r302
            r2 = r304
            r0.<init>(r1, r2)
            r0 = r308
            r1 = r319
            boolean r0 = r0.add(r1)
            r0 = 1
            r306 = r0
        L9b:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Huq.A04(long, long):boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Huq huq = (Huq) obj;
            if (this.A01 != huq.A01 || !this.A02.equals(huq.A02) || !this.A04.equals(huq.A04) || !this.A00.equals(huq.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A07(this.A02, this.A01 * 31));
    }
}
