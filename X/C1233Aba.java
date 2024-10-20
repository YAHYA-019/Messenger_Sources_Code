package X;

import com.facebook.messaging.notify.analytics.qpl.sync.OpenMessagingSyncPathHybrid;

/* renamed from: X.Aba, reason: case insensitive filesystem */
/* loaded from: Aba.class */
public final class C1233Aba {
    public final 1Br A00;
    public final OpenMessagingSyncPathHybrid A01;
    public final boolean A02;

    public C1233Aba() {
        1Br A0C = 1BK.A0C();
        this.A00 = A0C;
        this.A02 = 1Br.A07(A0C).AZk(36324144740191710L);
        this.A01 = new OpenMessagingSyncPathHybrid();
    }

    public final void A00(DLB dlb, String str, String str2) {
        Integer num = null;
        if (str2 != null) {
            try {
                num = Integer.valueOf(Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
            }
        }
        if (!this.A02 || dlb == null || str == null || str.length() == 0 || num == null) {
            return;
        }
        this.A01.markMessageDropped(str, num.intValue(), dlb.A02);
    }

    public final void A01(DLB dlb, String str, String str2, boolean z) {
        Integer num = null;
        if (str2 != null) {
            try {
                num = Integer.valueOf(Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
            }
        }
        if (!this.A02 || dlb == null || str == null || str.length() == 0 || num == null) {
            return;
        }
        this.A01.markRender(str, num.intValue(), z, dlb.A00);
    }
}
