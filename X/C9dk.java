package X;

import android.text.Spannable;
import android.text.util.Linkify;
import android.widget.TextView;
import java.util.regex.Pattern;

/* renamed from: X.9dk, reason: invalid class name */
/* loaded from: 9dk.class */
public abstract class C9dk {
    public static void A00(Spannable spannable, C5um c5um, C5n1 c5n1, int i) {
        try {
            C53t.A05(spannable, c5um, c5n1, i);
        } catch (RuntimeException e) {
            0fH.A0y("SafeLinkifier", "unable to linkify: %s", e, new Object[]{e.getMessage()});
        }
    }

    public static void A01(Linkify.TransformFilter transformFilter, TextView textView, Pattern pattern) {
        try {
            Linkify.addLinks(textView, pattern, (String) null, (Linkify.MatchFilter) null, transformFilter);
        } catch (RuntimeException e) {
            0fH.A0y("SafeLinkifier", "unable to linkify: %s", e, new Object[]{e.getMessage()});
        }
    }
}
