package X;

import java.util.HashMap;

/* loaded from: Ff5.class */
public final class Ff5 implements 5SG {
    public String A00;
    public final boolean A01;
    public final /* synthetic */ 4Yx A02;

    public Ff5(4Yx r302, String str, boolean z) {
        this.A02 = r302;
        this.A01 = z;
        this.A00 = str;
    }

    public void Bxs(int i, Throwable th) {
        4Yx r0 = this.A02;
        int i2 = 4Yx.A0B;
        synchronized (r0.A08) {
            4Yy r02 = r0.A01;
            if (r02.A01 != this) {
                r0.A03.A02("onFailure_HeadwindProgram", this.A00);
            } else {
                r02.A01 = null;
                r0.A03.A06(this.A00, String.valueOf(i), th, true, true);
            }
        }
    }

    public void COq(String str, int i) {
        4Yx r0 = this.A02;
        int i2 = 4Yx.A0B;
        synchronized (r0.A08) {
            4Yy r02 = r0.A01;
            if (r02.A01 != this) {
                r0.A03.A02("onSuccess_HeadwindProgram", this.A00);
                return;
            }
            r02.A01 = null;
            4Ys r03 = r0.A03;
            String str2 = this.A00;
            boolean z = this.A01;
            r03.A00.A02(str2, 0S2.A07, (String) null);
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("ping_type", "headwind");
            A0u.put("immediate", String.valueOf(z));
            r03.A01.A04("msisdn_fetch_success", A0u);
            r0.A02.A03(r0.A00.now(), true);
            4Yx.A02(r0);
            if (z) {
                int i3 = 4Yx.A0B + 1;
                4Yx.A0B = i3;
                if (i3 < 4) {
                    r0.A06(0Pz.A0T("headwind_immediate_", i3));
                }
            }
        }
    }
}
