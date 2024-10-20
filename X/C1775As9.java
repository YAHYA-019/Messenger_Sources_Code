package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.As9, reason: case insensitive filesystem */
/* loaded from: As9.class */
public final class C1775As9 extends C04v {
    public Integer A02 = null;
    public Boolean A01 = null;
    public String A03 = null;
    public ImmutableList A00 = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1775As9)) {
                return false;
            }
            C1775As9 c1775As9 = (C1775As9) obj;
            if (!11T.A0O(this.A02, c1775As9.A02) || !11T.A0O(this.A01, c1775As9.A01) || !11T.A0O(this.A03, c1775As9.A03) || !11T.A0O(this.A00, c1775As9.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass001.A02(this.A02) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 1BL.A05(this.A03)) * 31) + 4YU.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Builder(status=");
        A0k.append(this.A02);
        A0k.append(", hasNextPage=");
        A0k.append(this.A01);
        A0k.append(", nextPageCursor=");
        A0k.append(this.A03);
        A0k.append(", threadMessages=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
