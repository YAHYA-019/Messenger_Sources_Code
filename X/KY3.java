package X;

import android.text.Spannable;

/* loaded from: KY3.class */
public abstract class KY3 {
    public static void A00(Spannable spannable, Object obj, int i, int i2) {
        Object[] spans = spannable.getSpans(i, i2, obj.getClass());
        int length = spans.length;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length) {
                spannable.setSpan(obj, i, i2, 33);
                return;
            }
            Object obj2 = spans[i4];
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
            i3 = i4 + 1;
        }
    }
}
