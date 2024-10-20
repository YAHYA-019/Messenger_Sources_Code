package X;

import android.view.View;
import java.util.List;

/* renamed from: X.AsC, reason: case insensitive filesystem */
/* loaded from: AsC.class */
public final class C1778AsC extends C04v {
    public final View.OnClickListener A00;
    public final AnonymousClass553 A01;
    public final CharSequence A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;

    public C1778AsC(View.OnClickListener onClickListener, AnonymousClass553 anonymousClass553, CharSequence charSequence, String str, String str2, String str3, String str4, List list, boolean z) {
        this.A08 = z;
        this.A06 = str;
        this.A02 = charSequence;
        this.A07 = list;
        this.A01 = anonymousClass553;
        this.A05 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = onClickListener;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1778AsC)) {
                return false;
            }
            C1778AsC c1778AsC = (C1778AsC) obj;
            if (this.A08 != c1778AsC.A08 || !11T.A0O(this.A06, c1778AsC.A06) || !11T.A0O(this.A02, c1778AsC.A02) || !11T.A0O(this.A07, c1778AsC.A07) || !11T.A0O(this.A01, c1778AsC.A01) || !11T.A0O(this.A05, c1778AsC.A05) || !11T.A0O(this.A03, c1778AsC.A03) || !11T.A0O(this.A04, c1778AsC.A04) || !11T.A0O(this.A00, c1778AsC.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A03, AnonymousClass002.A07(this.A05, AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A07, AnonymousClass002.A05(this.A02, AnonymousClass002.A07(this.A06, AnonymousClass002.A00(this.A08 ? 1 : 0) * 31))))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RestrictedListViewModel(isLoading=");
        A0k.append(this.A08);
        A0k.append(", title=");
        A0k.append(this.A06);
        A0k.append(", subtitle=");
        A0k.append((Object) this.A02);
        A0k.append(", users=");
        A0k.append(this.A07);
        A0k.append(", addUserClickListener=");
        A0k.append(this.A01);
        A0k.append(", emptyStateHeader=");
        A0k.append(this.A05);
        A0k.append(", emptyStateBody=");
        A0k.append(this.A03);
        A0k.append(", emptyStateButtonLabel=");
        A0k.append(this.A04);
        A0k.append(", emptyStateOnClickListener=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
