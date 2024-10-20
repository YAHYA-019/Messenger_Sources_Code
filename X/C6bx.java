package X;

/* renamed from: X.6bx, reason: invalid class name */
/* loaded from: 6bx.class */
public final class C6bx extends C04v {
    public C1rn A00;
    public C6bw A01;
    public final C1rn A02;
    public final C1rn A03;
    public final C1rn A04;
    public final C1rn A05;
    public final C1rn A06;

    public C6bx(C1rn c1rn, C1rn c1rn2, C1rn c1rn3, C1rn c1rn4, C1rn c1rn5, C1rn c1rn6, C6bw c6bw) {
        this.A06 = c1rn;
        this.A05 = c1rn2;
        this.A02 = c1rn3;
        this.A03 = c1rn4;
        this.A04 = c1rn5;
        this.A01 = c6bw;
        this.A00 = c1rn6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C6bx)) {
                return false;
            }
            C6bx c6bx = (C6bx) obj;
            if (!11T.A0O(this.A06, c6bx.A06) || !11T.A0O(this.A05, c6bx.A05) || !11T.A0O(this.A02, c6bx.A02) || !11T.A0O(this.A03, c6bx.A03) || !11T.A0O(this.A04, c6bx.A04) || !11T.A0O(this.A01, c6bx.A01) || !11T.A0O(this.A00, c6bx.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A03, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A05, 1BL.A03(this.A06)))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TitleBarProfileImageDynamicState(translationY=");
        A0k.append(this.A06);
        A0k.append(", translationX=");
        A0k.append(this.A05);
        A0k.append(", scaleX=");
        A0k.append(this.A02);
        A0k.append(JQw.A00(43));
        A0k.append(this.A03);
        A0k.append(", shadowElevation=");
        A0k.append(this.A04);
        A0k.append(", viewOutlineProvider=");
        A0k.append(this.A01);
        A0k.append(", badgeAlpha=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
