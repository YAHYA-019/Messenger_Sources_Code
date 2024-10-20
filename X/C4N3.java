package X;

import android.view.View;
import java.util.List;

/* renamed from: X.4N3, reason: invalid class name */
/* loaded from: 4N3.class */
public final class C4N3 extends C04v {
    public final View.OnClickListener A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public C4N3(View.OnClickListener onClickListener, Integer num, Integer num2, String str, String str2, String str3, List list) {
        11T.A0F(list, 3);
        this.A02 = num;
        this.A05 = str;
        this.A06 = list;
        this.A01 = num2;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = onClickListener;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4N3)) {
                return false;
            }
            C4N3 c4n3 = (C4N3) obj;
            if (this.A02 != c4n3.A02 || !11T.A0O(this.A05, c4n3.A05) || !11T.A0O(this.A06, c4n3.A06) || this.A01 != c4n3.A01 || !11T.A0O(this.A03, c4n3.A03) || !11T.A0O(this.A04, c4n3.A04) || !11T.A0O(this.A00, c4n3.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A02;
        int A05 = AnonymousClass002.A05(this.A06, AnonymousClass002.A07(this.A05, C3o5.A05(num, BUo.A00(num))));
        int intValue = this.A01.intValue();
        int i = 0;
        int hashCode = (((((A05 + (1 != intValue ? "LOADING" : "LOADED").hashCode() + intValue) * 31) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A04)) * 31;
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            i = onClickListener.hashCode();
        }
        return hashCode + i;
    }
}
