package X;

import android.net.Uri;

/* renamed from: X.AsA, reason: case insensitive filesystem */
/* loaded from: AsA.class */
public final class C1776AsA extends C04v {
    public final int A00;
    public final Uri A01;
    public final GjT A02;
    public final String A03;
    public final boolean A04;

    public C1776AsA(Uri uri, GjT gjT, String str, int i, boolean z) {
        this.A03 = str;
        this.A01 = uri;
        this.A02 = gjT;
        this.A00 = i;
        this.A04 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1776AsA)) {
                return false;
            }
            C1776AsA c1776AsA = (C1776AsA) obj;
            if (!11T.A0O(this.A03, c1776AsA.A03) || !11T.A0O(this.A01, c1776AsA.A01) || !11T.A0O(this.A02, c1776AsA.A02) || this.A00 != c1776AsA.A00 || this.A04 != c1776AsA.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((1BL.A05(this.A03) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 4YU.A03(this.A02)) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FoldersMetaData(title=");
        A0k.append(this.A03);
        A0k.append(", profileUri=");
        A0k.append(this.A01);
        A0k.append(", foldersBadgeInfo=");
        A0k.append(this.A02);
        A0k.append(AbstractC00603o4.A00(324));
        A0k.append(this.A00);
        A0k.append(", isDisableRequested=");
        A0k.append(this.A04);
        return 4YV.A0x(A0k);
    }
}
