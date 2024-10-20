package X;

import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;

/* renamed from: X.9dH, reason: invalid class name */
/* loaded from: 9dH.class */
public abstract class C9dH {
    public static C5by A00(HighlightsFeedContent highlightsFeedContent) {
        return A01(Integer.valueOf(highlightsFeedContent.A05));
    }

    public static final C5by A01(Integer num) {
        C5by[] values = C5by.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return null;
            }
            C5by c5by = values[i2];
            int i3 = c5by.value;
            if (num != null && i3 == num.intValue()) {
                return c5by;
            }
            i = i2 + 1;
        }
    }
}
