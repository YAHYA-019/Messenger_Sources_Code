package X;

import java.util.List;

/* renamed from: X.At9, reason: case insensitive filesystem */
/* loaded from: At9.class */
public final class C1800At9 extends C04v implements JDB {
    public final JOL A00;
    public final JOL A01;
    public final Boolean A02;
    public final List A03;

    public C1800At9(JOL jol, JOL jol2, Boolean bool, List list) {
        this.A03 = list;
        this.A00 = jol;
        this.A01 = jol2;
        this.A02 = bool;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1800At9)) {
                return false;
            }
            C1800At9 c1800At9 = (C1800At9) obj;
            if (!11T.A0O(this.A03, c1800At9.A03) || !11T.A0O(this.A00, c1800At9.A00) || !11T.A0O(this.A01, c1800At9.A01) || !11T.A0O(this.A02, c1800At9.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A00, 1BL.A03(this.A03)) + AnonymousClass001.A02(this.A01)) * 31) + 4YU.A03(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("HaloDrawerPagerViewState(activePlugins=");
        A0k.append(this.A03);
        A0k.append(", currentPlugin=");
        A0k.append(this.A00);
        A0k.append(", previousPlugin=");
        A0k.append(this.A01);
        A0k.append(", goingForward=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }
}
