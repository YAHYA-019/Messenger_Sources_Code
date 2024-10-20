package X;

import java.util.List;

/* renamed from: X.Git, reason: case insensitive filesystem */
/* loaded from: Git.class */
public final class C2604Git extends C04v {
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;
    public boolean A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2604Git)) {
                return false;
            }
            C2604Git c2604Git = (C2604Git) obj;
            if (!11T.A0O(this.A03, c2604Git.A03) || !11T.A0O(this.A0A, c2604Git.A0A) || !11T.A0O(this.A0B, c2604Git.A0B) || !11T.A0O(this.A08, c2604Git.A08) || !11T.A0O(this.A06, c2604Git.A06) || !11T.A0O(this.A05, c2604Git.A05) || !11T.A0O(this.A07, c2604Git.A07) || this.A00 != c2604Git.A00 || !11T.A0O(this.A02, c2604Git.A02) || !11T.A0O(this.A04, c2604Git.A04) || !11T.A0O(this.A01, c2604Git.A01) || !11T.A0O(this.A09, c2604Git.A09) || this.A0D != c2604Git.A0D || !11T.A0O(this.A0C, c2604Git.A0C)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((1BL.A05(this.A03) * 31) + 1BL.A05(this.A0A)) * 31) + 1BL.A05(this.A0B)) * 31) + 1BL.A05(this.A08)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A07)) * 31) + this.A00) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A01)) * 31) + 1BL.A05(this.A09)) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + 4YU.A03(this.A0C);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ReelsMetadataUnit(effectsTitle=");
        A0k.append(this.A03);
        A0k.append(", soundtrackTitle=");
        A0k.append(this.A0A);
        A0k.append(", title=");
        A0k.append(this.A0B);
        A0k.append(7zK.A00(5));
        A0k.append(this.A08);
        A0k.append(", ownerName=");
        A0k.append(this.A06);
        A0k.append(", ownerId=");
        A0k.append(this.A05);
        A0k.append(", privacyScopeLabel=");
        A0k.append(this.A07);
        A0k.append(", reelsMediaSource=");
        A0k.append(this.A00);
        A0k.append(", cowatchMediaSource=");
        A0k.append(this.A02);
        A0k.append(", likeCount=");
        A0k.append(this.A04);
        A0k.append(", commentCount=");
        A0k.append(this.A01);
        A0k.append(", shareCount=");
        A0k.append(this.A09);
        A0k.append(", isViewerLiked=");
        A0k.append(this.A0D);
        A0k.append(", hashtags=");
        return AnonymousClass002.A0K(this.A0C, A0k);
    }
}
