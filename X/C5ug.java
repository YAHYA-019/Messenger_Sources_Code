package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* renamed from: X.5ug, reason: invalid class name */
/* loaded from: 5ug.class */
public final class C5ug implements 5PP {
    public final Spannable A00;

    public C5ug(Spannable spannable) {
        C1pq.A08("text", spannable);
        this.A00 = spannable;
        if (spannable instanceof SpannableStringBuilder) {
            try {
                spannable.hashCode();
            } catch (NullPointerException e) {
                throw new IllegalArgumentException(1BJ.A00(876), e);
            }
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5ug) && 11T.A0O(this.A00, ((C5ug) obj).A00));
    }

    public int hashCode() {
        return C1pq.A04(this.A00, 1);
    }
}
