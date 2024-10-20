package X;

import com.facebook.foa.session.FbMetaSessionImpl;

/* loaded from: Ez4.class */
public final class Ez4 {
    public final int A00;
    public final FbMetaSessionImpl A01;
    public final GDm A02;
    public final Eyf A03;
    public final Object A04;

    public Ez4(FbMetaSessionImpl fbMetaSessionImpl, GDm gDm, Eyf eyf, Object obj, int i) {
        this.A03 = eyf;
        this.A04 = obj;
        this.A02 = gDm;
        this.A01 = fbMetaSessionImpl;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ez4)) {
                return false;
            }
            Ez4 ez4 = (Ez4) obj;
            if (!11T.A0O(this.A03, ez4.A03) || !11T.A0O(this.A04, ez4.A04) || !11T.A0O(this.A02, ez4.A02) || !11T.A0O(this.A01, ez4.A01) || this.A00 != ez4.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A04, 1BL.A03(this.A03)))) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CdsBottomSheetOpenContainerArgsScreens(screen=");
        A0k.append(this.A03);
        A0k.append(", args=");
        A0k.append(this.A04);
        A0k.append(", dataSource=");
        A0k.append(this.A02);
        A0k.append(", foaUserSession=");
        A0k.append(this.A01);
        A0k.append(", keyboardSoftInputMode=");
        return DKH.A0p(A0k, this.A00);
    }
}
