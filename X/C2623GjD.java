package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.GjD, reason: case insensitive filesystem */
/* loaded from: GjD.class */
public final class C2623GjD extends C04v {
    public final long A00;
    public final BOp A01;
    public final ThreadKey A02;
    public final Long A03;
    public final String A04;
    public final String A05;

    public /* synthetic */ C2623GjD(BOp bOp, ThreadKey threadKey, Long l, String str, int i, long j) {
        threadKey = (i & 8) != 0 ? null : threadKey;
        String A0s = (i & 32) != 0 ? 7zR.A0s() : null;
        l = (i & 64) != 0 ? null : l;
        7zP.A1L(bOp, 3, A0s);
        this.A00 = j;
        this.A05 = str;
        this.A01 = bOp;
        this.A02 = threadKey;
        this.A04 = A0s;
        this.A03 = l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2623GjD)) {
                return false;
            }
            C2623GjD c2623GjD = (C2623GjD) obj;
            if (this.A00 != c2623GjD.A00 || !11T.A0O(this.A05, c2623GjD.A05) || this.A01 != c2623GjD.A01 || !11T.A0O(this.A02, c2623GjD.A02) || !11T.A0O(this.A04, c2623GjD.A04) || !11T.A0O(this.A03, c2623GjD.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A04, (AnonymousClass002.A05(this.A01, (7zQ.A02(this.A00) + 1BL.A05(this.A05)) * 31) + AnonymousClass001.A02(this.A02)) * 31 * 31) + 4YU.A03(this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MessengerRestrictParams(userId=");
        A0k.append(this.A00);
        A0k.append(AbE.A00(226));
        A0k.append(this.A05);
        A0k.append(", entryPoint=");
        A0k.append(this.A01);
        A0k.append(", threadKey=");
        A0k.append(this.A02);
        A0k.append(", source=");
        A0k.append((Object) null);
        A0k.append(DKB.A00(11));
        A0k.append(this.A04);
        A0k.append(AbE.A00(219));
        return AnonymousClass002.A0K(this.A03, A0k);
    }
}
