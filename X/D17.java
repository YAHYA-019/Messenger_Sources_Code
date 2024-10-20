package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: D17.class */
public final class D17 implements C29M, Serializable, Cloneable {
    public final Long broadcastId;
    public final Rxr layoutInfo;
    public final String negotiationToken;
    public static final C29O A03 = AbF.A0u();
    public static final C29Q A02 = AbI.A0h("negotiationToken", (byte) 11);
    public static final C29Q A00 = AbI.A0i("broadcastId", (byte) 10);
    public static final C29Q A01 = AbI.A0j("layoutInfo", (byte) 12);

    public D17(Rxr rxr, Long l, String str) {
        this.negotiationToken = str;
        this.broadcastId = l;
        this.layoutInfo = rxr;
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        return CQq.A05(this, i, z);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.negotiationToken != null) {
            r302.A0V(A02);
            r302.A0Z(this.negotiationToken);
        }
        if (this.broadcastId != null) {
            r302.A0V(A00);
            AbG.A1T(r302, this.broadcastId);
        }
        if (this.layoutInfo != null) {
            r302.A0V(A01);
            this.layoutInfo.DAs(r302);
        }
        r302.A0N();
        r302.A0P();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof D17)) {
                return false;
            }
            D17 d17 = (D17) obj;
            String str = this.negotiationToken;
            boolean A1T = AnonymousClass001.A1T(str);
            String str2 = d17.negotiationToken;
            if (!CQq.A0H(str, str2, A1T, AnonymousClass001.A1T(str2))) {
                return false;
            }
            Long l = this.broadcastId;
            boolean A1T2 = AnonymousClass001.A1T(l);
            Long l2 = d17.broadcastId;
            if (!CQq.A0F(l, l2, A1T2, AnonymousClass001.A1T(l2))) {
                return false;
            }
            Rxr rxr = this.layoutInfo;
            boolean A1T3 = AnonymousClass001.A1T(rxr);
            Rxr rxr2 = d17.layoutInfo;
            if (!CQq.A09(rxr, rxr2, A1T3, AnonymousClass001.A1T(rxr2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.negotiationToken, this.broadcastId, this.layoutInfo});
    }

    public String toString() {
        return CQq.A04(this);
    }
}
