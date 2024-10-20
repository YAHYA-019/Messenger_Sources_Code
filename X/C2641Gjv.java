package X;

import com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel;
import java.util.List;

/* renamed from: X.Gjv, reason: case insensitive filesystem */
/* loaded from: Gjv.class */
public final class C2641Gjv extends C04v implements JDB {
    public final CowatchMediaInfoModel A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C2641Gjv(CowatchMediaInfoModel cowatchMediaInfoModel, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A07 = z;
        this.A03 = list;
        this.A00 = cowatchMediaInfoModel;
        this.A05 = z2;
        this.A02 = str;
        this.A04 = z3;
        this.A01 = str2;
        this.A08 = z4;
        this.A06 = z5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2641Gjv)) {
                return false;
            }
            C2641Gjv c2641Gjv = (C2641Gjv) obj;
            if (this.A07 != c2641Gjv.A07 || !11T.A0O(this.A03, c2641Gjv.A03) || !11T.A0O(this.A00, c2641Gjv.A00) || this.A05 != c2641Gjv.A05 || !11T.A0O(this.A02, c2641Gjv.A02) || this.A04 != c2641Gjv.A04 || !11T.A0O(this.A01, c2641Gjv.A01) || this.A08 != c2641Gjv.A08 || this.A06 != c2641Gjv.A06) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass002.A05(this.A03, AnonymousClass002.A00(this.A07 ? 1 : 0) * 31) + AnonymousClass001.A02(this.A00)) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31) + 1BL.A05(this.A02)) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + 7zN.A05(this.A01)) * 31) + AnonymousClass002.A00(this.A08 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MediaSyncChainingViewState(isDrawerGestureAllowed=");
        A0k.append(this.A07);
        A0k.append(", contentList=");
        A0k.append(this.A03);
        A0k.append(", currentItem=");
        A0k.append(this.A00);
        A0k.append(", hasSwipedRecently=");
        A0k.append(this.A05);
        A0k.append(", tabSource=");
        A0k.append(this.A02);
        A0k.append(", chicletMode=");
        A0k.append(this.A04);
        A0k.append(", adminMessageActorProfilePictureUrl=");
        A0k.append(this.A01);
        A0k.append(", shouldShowNux=");
        A0k.append(this.A08);
        A0k.append(", initialNux=");
        return DKH.A0q(A0k, this.A06);
    }
}
