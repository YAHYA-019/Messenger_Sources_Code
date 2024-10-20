package X;

import com.google.common.base.Preconditions;

/* renamed from: X.2J6, reason: invalid class name */
/* loaded from: 2J6.class */
public final class C2J6 implements Runnable {
    public static final String __redex_internal_original_name = "CombinedQueue$2";
    public final /* synthetic */ 1DA A00;
    public final /* synthetic */ 1ET A01;

    public C2J6(1DA r302, 1ET r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        1DA r0 = this.A00;
        1ET r02 = this.A01;
        1DD r03 = r0.A06;
        r03.A00();
        try {
            r03.A01();
            1E2 ARN = r02.ARN();
            if (ARN.A0B(r02)) {
                1Cz r04 = ARN.A09;
                int i = r04.A00;
                boolean z = false;
                if (i >= 1) {
                    z = true;
                }
                Preconditions.checkState(z);
                r04.A00 = i - 1;
                ARN.A04();
            } else {
                ARN.A09.A05.remove(r02);
            }
        } finally {
            r03.A02();
        }
    }
}
