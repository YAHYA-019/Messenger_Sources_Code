package X;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.common.network.FbNetworkManager;
import java.util.List;

/* loaded from: I8l.class */
public final class I8l {
    public 1BY A00;
    public final PowerManager A02;
    public final Context A05;
    public final C4A7 A06;
    public final List A04 = AbF.A1F();
    public boolean A01 = false;
    public final C00i A03 = AbH.A0S();
    public final FbNetworkManager A07 = (FbNetworkManager) 1Bi.A03(16687);

    public I8l(1BO r302) {
        Context A0J = 7zP.A0J();
        this.A05 = A0J;
        this.A02 = (PowerManager) 1Hv.A02(A0J, 100179);
        this.A06 = (C4A7) 1Bi.A03(99410);
        this.A00 = 7zL.A0Q(r302);
    }

    public static final I8l A00(1BO r301) {
        return new I8l(r301);
    }

    private void A01() {
        synchronized (this) {
            List list = this.A04;
            list.clear();
            String A3a = 1BK.A0R(this.A03).A3a(C1ly.A04, "");
            if (!A3a.matches("([01][01])*")) {
                A3a = "";
            }
            int i = 0;
            while (true) {
                int i2 = i;
                boolean z = true;
                if (i2 < (A3a.length() / 2) * 2) {
                    boolean A1Q = AnonymousClass001.A1Q(A3a.charAt(i2), 49);
                    if (A3a.charAt(i2 + 1) != '1') {
                        z = false;
                    }
                    list.add(new RLb(this, A1Q, z));
                    i = i2 + 2;
                } else {
                    this.A01 = true;
                }
            }
        }
    }

    public Integer A02() {
        Integer num;
        synchronized (this) {
            if (!this.A01) {
                A01();
            }
            List<RLb> list = this.A04;
            if (list.size() < 50) {
                num = 0S2.A0C;
            } else {
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (RLb rLb : list) {
                    if (rLb.A00) {
                        i3++;
                        if (rLb.A01) {
                            i4++;
                        }
                    } else {
                        i++;
                        if (rLb.A01) {
                            i2++;
                        }
                    }
                }
                if (i < 10) {
                    num = 0S2.A0C;
                } else {
                    double d = (i2 * 1.0d) / i;
                    if (d > 0.18d) {
                        num = 0S2.A01;
                    } else if (i3 < 10) {
                        num = 0S2.A0C;
                    } else {
                        double d2 = (i4 * 1.0d) / i3;
                        num = d2 < 0.5d ? 0S2.A0C : d2 / d > 5.0d ? 0S2.A00 : 0S2.A0C;
                    }
                }
            }
        }
        return num;
    }

    public void A03(boolean z, boolean z2) {
        synchronized (this) {
            if (!this.A01) {
                A01();
            }
            if (!this.A07.A0K() && !this.A02.isPowerSaveMode()) {
                C4A7 c4a7 = this.A06;
                if (c4a7.A01() >= 0.0f && !c4a7.A04(20)) {
                    List<RLb> list = this.A04;
                    list.add(new RLb(this, z, z2));
                    if (list.size() > 100) {
                        list.remove(0);
                    }
                    StringBuilder A0k = AnonymousClass001.A0k();
                    for (RLb rLb : list) {
                        A0k.append(rLb.A00 ? '1' : '0');
                        A0k.append(rLb.A01 ? '1' : '0');
                    }
                    1Ql A0V = 1BL.A0V(this.A03);
                    A0V.CaL(C1ly.A04, A0k.toString());
                    A0V.commit();
                }
            }
        }
    }
}
