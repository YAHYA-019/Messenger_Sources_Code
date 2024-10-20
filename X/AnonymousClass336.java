package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.336, reason: invalid class name */
/* loaded from: 336.class */
public final class AnonymousClass336 extends TextView {
    public final LinkedList A00;

    public AnonymousClass336(Context context) {
        super(context, null);
        this.A00 = new LinkedList();
        setTypeface(Typeface.MONOSPACE);
        setBackgroundColor(Color.argb(20, 0, 0, 0));
    }

    public static void A00(AnonymousClass336 anonymousClass336) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = anonymousClass336.A00.iterator();
        while (it.hasNext()) {
            3KE r0 = (3KE) it.next();
            String str = r0.A01;
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(r0.A00.A00), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\n");
        }
        if (spannableStringBuilder.length() == 0) {
            spannableStringBuilder.append(' ');
        }
        anonymousClass336.setText(spannableStringBuilder);
        anonymousClass336.setVisibility(0);
    }
}
