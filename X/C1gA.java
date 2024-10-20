package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ExecutorService;

/* renamed from: X.1gA, reason: invalid class name */
/* loaded from: 1gA.class */
public final class C1gA {
    public int A00;
    public boolean A01;
    public final String A02;
    public final int A03;
    public final Object A04;
    public final Object[] A05;
    public final String[] A06;
    public final /* synthetic */ C1fy A07;

    public C1gA(C1fy c1fy, Object obj, String str, Object[] objArr, String[] strArr, int i) {
        11T.A0F(strArr, 4);
        this.A07 = c1fy;
        this.A02 = str;
        this.A03 = i;
        this.A06 = strArr;
        this.A04 = obj;
        this.A05 = objArr;
    }

    public static final boolean A00(String str, String[] strArr, int i) {
        Collection A07 = 07C.A07(i, strArr.length);
        if (!(A07 instanceof Collection) || !A07.isEmpty()) {
            07I it = A07.iterator();
            while (it.hasNext()) {
                if (11T.A0O(strArr[it.A00()], str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void A01() {
        if (!this.A01) {
            this.A00 = C1fy.A00(this.A07, this.A04, "run_all_ops", this.A05, this.A06, this.A00);
            this.A01 = true;
        }
        0Xp.A00();
    }

    public void A02(Runnable runnable, String str, boolean z) {
        String[] strArr = this.A06;
        if (A00(str, strArr, this.A00)) {
            return;
        }
        C1fy c1fy = this.A07;
        this.A00 = C1fy.A00(c1fy, this.A04, str, this.A05, strArr, this.A00);
        String format = String.format("StartOp:%s", Arrays.copyOf(new Object[]{c1fy.A05(str)}, 1));
        11T.A0A(format);
        0Xq.A00(format);
        if (z) {
            ((ExecutorService) 1Br.A0B(c1fy.A01)).submit(runnable);
        } else {
            runnable.run();
        }
        0Xp.A00();
        this.A00++;
        ((1KR) c1fy.A02.A00.get()).A07.getAndAdd(1);
    }

    public void A03(String str) {
        String[] strArr = this.A06;
        if (A00(str, strArr, this.A00)) {
            return;
        }
        C1fy c1fy = this.A07;
        int A00 = C1fy.A00(c1fy, this.A04, str, this.A05, strArr, this.A00);
        this.A00 = A00;
        this.A00 = A00 + 1;
        ((1KR) c1fy.A02.A00.get()).A07.getAndAdd(1);
    }

    public final void finalize() {
        int A03 = 0FI.A03(-128940827);
        if (!this.A01) {
            0fH.A14("StartOpDispatcherImpl", "Sequence %s's complete() was not invoked!", new Object[]{this.A02});
        }
        0FI.A09(-33264608, A03);
    }
}
