package X;

import android.content.res.Resources;
import android.text.Spannable;

/* renamed from: X.5mv, reason: invalid class name */
/* loaded from: 5mv.class */
public final class C5mv implements C5mw {
    public static final C5mv A01 = new Object();
    public static final 1Br A00 = 1Bq.A00(67196);

    @Override // X.C5mw
    public boolean A5b(Spannable spannable, C22a c22a, int i, boolean z) {
        11T.A0F(c22a, 0);
        return c22a.BWc(spannable, 3) ? c22a.A7N(spannable, ((Resources) A00.A00.get()).getDimensionPixelSize(2132279326)) : z ? ((2KY) c22a).A5r(spannable, 0, spannable.length()) : c22a.A7O(spannable, i);
    }
}
