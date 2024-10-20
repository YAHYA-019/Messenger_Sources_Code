package X;

import android.os.Process;
import android.os.SystemClock;
import java.io.File;

/* renamed from: X.0vW, reason: invalid class name */
/* loaded from: 0vW.class */
public final class C0vW extends 0Wj {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public final long[] A06;
    public final String A07;

    public C0vW() {
        this.A06 = new long[3];
        boolean z = true;
        this.A04 = true;
        String A0d = 0Pz.A0d("/proc/", "/schedstat", Process.myPid());
        this.A07 = A0d;
        File A0E = AnonymousClass001.A0E(A0d);
        this.A05 = (A0E.exists() && A0E.canRead()) ? z : false;
    }

    public C0vW(int i) {
        this.A06 = new long[3];
        boolean z = true;
        this.A04 = true;
        StringBuilder A1D = 0Pz.A1D("/proc/", "/task/", Process.myPid());
        A1D.append(i);
        String A0d = AnonymousClass001.A0d("/schedstat", A1D);
        this.A07 = A0d;
        File A0E = AnonymousClass001.A0E(A0d);
        this.A05 = (A0E.exists() && A0E.canRead()) ? z : false;
    }

    public static boolean A02(C0vW c0vW, long[] jArr) {
        try {
            String A00 = 0Wj.A00(AnonymousClass001.A0E(c0vW.A07));
            if (A00 == null) {
                return false;
            }
            String[] split = A00.split("\\s+");
            jArr[0] = Long.parseLong(split[0]);
            jArr[1] = Long.parseLong(split[1]);
            jArr[2] = Long.parseLong(split[2]);
            return true;
        } catch (Throwable unused) {
            c0vW.A05 = false;
            return false;
        }
    }

    public String A03() {
        String str = null;
        if (this.A05) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long[] jArr = this.A06;
            if (A02(this, jArr)) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = j - this.A01;
                long j5 = j2 - this.A02;
                long j6 = j3 - this.A00;
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append(j4);
                A0k.append(',');
                A0k.append(j5);
                A0k.append(',');
                A0k.append(j6);
                A0k.append(',');
                str = AnonymousClass001.A0h(A0k, uptimeMillis - this.A03);
            }
        }
        return str;
    }

    public void A04() {
        if (this.A05) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long[] jArr = this.A06;
            if (A02(this, jArr)) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                if (this.A04) {
                    this.A01 = j;
                    this.A02 = j2;
                    this.A00 = j3;
                } else {
                    this.A03 = uptimeMillis;
                    this.A01 = j;
                    this.A02 = j2;
                    this.A00 = j3;
                }
                this.A04 = false;
            }
        }
    }
}
