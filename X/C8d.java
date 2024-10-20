package X;

import android.view.View;
import java.util.List;

/* loaded from: C8d.class */
public final class C8d {
    public final View.OnClickListener A00;
    public final View.OnClickListener A01;
    public final DGF A02;
    public final DGG A03;
    public final CharSequence A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public C8d(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, DGF dgf, DGG dgg, CharSequence charSequence, String str, String str2, String str3, List list) {
        this.A02 = dgf;
        this.A03 = dgg;
        this.A00 = onClickListener;
        C1pq.A08("primaryButtonText", str);
        this.A05 = str;
        this.A01 = onClickListener2;
        C1pq.A08("secondaryButtonText", str2);
        this.A06 = str2;
        this.A04 = charSequence;
        AbF.A1V(str3);
        this.A07 = str3;
        this.A08 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8d)) {
                return false;
            }
            C8d c8d = (C8d) obj;
            if (!11T.A0O(this.A02, c8d.A02) || !11T.A0O(this.A03, c8d.A03) || !11T.A0O(this.A00, c8d.A00) || !11T.A0O(this.A05, c8d.A05) || !11T.A0O(this.A01, c8d.A01) || !11T.A0O(this.A06, c8d.A06) || !11T.A0O(this.A04, c8d.A04) || !11T.A0O(this.A07, c8d.A07) || !11T.A0O(this.A08, c8d.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A04, C1pq.A04(this.A06, C1pq.A04(this.A01, C1pq.A04(this.A05, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A02)))))))));
    }
}
