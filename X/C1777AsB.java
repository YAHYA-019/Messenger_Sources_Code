package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.AsB, reason: case insensitive filesystem */
/* loaded from: AsB.class */
public final class C1777AsB extends C04v {
    public final BOM A00;
    public final ThreadKey A01;
    public final BNT A02;
    public final BNJ A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C1777AsB(BOM bom, ThreadKey threadKey, BNT bnt, BNJ bnj, Long l, String str, String str2, String str3, boolean z) {
        4YV.A1M(str, 2, str3);
        this.A08 = z;
        this.A07 = str;
        this.A01 = threadKey;
        this.A02 = bnt;
        this.A03 = bnj;
        this.A06 = str2;
        this.A05 = str3;
        this.A00 = bom;
        this.A04 = l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1777AsB)) {
                return false;
            }
            C1777AsB c1777AsB = (C1777AsB) obj;
            if (this.A08 != c1777AsB.A08 || !11T.A0O(this.A07, c1777AsB.A07) || !11T.A0O(this.A01, c1777AsB.A01) || this.A02 != c1777AsB.A02 || this.A03 != c1777AsB.A03 || !11T.A0O(this.A06, c1777AsB.A06) || !11T.A0O(this.A05, c1777AsB.A05) || this.A00 != c1777AsB.A00 || !11T.A0O(this.A04, c1777AsB.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A00, AnonymousClass002.A07(this.A05, (((AnonymousClass002.A05(this.A02, (AnonymousClass002.A07(this.A07, AnonymousClass002.A00(this.A08 ? 1 : 0) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + 1BL.A05(this.A06)) * 31)) + 4YU.A03(this.A04);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BlockParams(isBlockOp=");
        A0k.append(this.A08);
        A0k.append(", userId=");
        A0k.append(this.A07);
        A0k.append(", threadKey=");
        A0k.append(this.A01);
        A0k.append(", entryPoint=");
        A0k.append(this.A02);
        A0k.append(", source=");
        A0k.append(this.A03);
        A0k.append(", userDisplayOrFullName=");
        A0k.append(this.A06);
        A0k.append(DKB.A00(11));
        A0k.append(this.A05);
        A0k.append(", sourceType=");
        A0k.append(this.A00);
        A0k.append(", consistentThreadFbId=");
        return AnonymousClass002.A0K(this.A04, A0k);
    }
}
