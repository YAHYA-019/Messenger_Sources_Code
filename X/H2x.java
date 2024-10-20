package X;

import android.content.Context;
import com.facebook.video.common.playerorigin.PlayerOrigin;

/* loaded from: H2x.class */
public final class H2x extends C6d6 {
    public static final PlayerOrigin A0C = new PlayerOrigin(6TL.A0F, "media_sync");
    public int A00;
    public int A01;
    public boolean A02;
    public final 1Br A03;
    public final I2b A04;
    public final HVQ A05;
    public final 6TJ A06;
    public final 6TJ A07;
    public final 6TJ A08;
    public final 6TJ A09;
    public final 6TJ A0A;
    public final 6TJ A0B;

    public H2x(Context context) {
        super(context, null, 0);
        this.A03 = 1Bu.A00(115728);
        this.A01 = -1;
        this.A00 = -1;
        GPl A00 = GPl.A00(this, 41);
        this.A09 = A00;
        GPl A002 = GPl.A00(this, 40);
        this.A08 = A002;
        GPl A003 = GPl.A00(this, 42);
        this.A0A = A003;
        GPl A004 = GPl.A00(this, 43);
        this.A0B = A004;
        GPl A005 = GPl.A00(this, 39);
        this.A07 = A005;
        GPl A006 = GPl.A00(this, 38);
        this.A06 = A006;
        HVQ hvq = new HVQ(this);
        this.A05 = hvq;
        this.A04 = new I2b(hvq);
        A0h(A00, A002, A003, A004, A005, A006);
    }

    public static final int A00(H2x h2x) {
        String str;
        GRX grx = ((C6d6) h2x).A09;
        int i = -1;
        if (grx == null || (str = ((C6d6) h2x).A0A) == null) {
            6Tu r0 = ((C6d6) h2x).A08;
            if (r0 != null) {
                return r0.Afn();
            }
        } else {
            i = grx.A02(A0C, str);
        }
        return i;
    }

    public static final void A01(H2x h2x, long j) {
        String str;
        GRS A05;
        6Tu r0 = ((C6d6) h2x).A08;
        GRX grx = ((C6d6) h2x).A09;
        if (grx == null || (str = ((C6d6) h2x).A0A) == null) {
            if (r0 != null) {
                long BJL = r0.BJL();
                if (1 <= BJL && BJL < j) {
                    j %= BJL;
                }
                if (Math.abs(r0.Afn() - j) > 1000) {
                    r0.CkD(C52j.A1h, (int) j);
                    return;
                }
                return;
            }
            return;
        }
        PlayerOrigin playerOrigin = A0C;
        long A03 = grx.A03(playerOrigin, str);
        if (1 <= A03 && A03 < j) {
            j %= A03;
        }
        if (Math.abs(grx.A02(playerOrigin, ((C6d6) h2x).A0A) - j) <= 1000 || (A05 = grx.A05(playerOrigin, ((C6d6) h2x).A0A)) == null) {
            return;
        }
        A05.CkD(C52j.A1h, (int) j);
    }

    @Override // X.C6d6
    public String A0H() {
        return "MediaSyncVideoSyncPlugin";
    }

    @Override // X.C6d6
    public void A0M() {
        this.A04.A01();
    }
}
