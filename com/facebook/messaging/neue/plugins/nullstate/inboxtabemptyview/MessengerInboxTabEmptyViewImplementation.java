package com.facebook.messaging.neue.plugins.nullstate.inboxtabemptyview;

import X.1BQ;
import X.4ER;
import X.4ES;
import X.C00i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.MetricAffectingSpan;
import android.util.TypedValue;
import android.widget.TextView;

/* loaded from: MessengerInboxTabEmptyViewImplementation.class */
public final class MessengerInboxTabEmptyViewImplementation {
    public final C00i A01 = new 1BQ(16839);
    public final C00i A02 = new 1BQ(67923);
    public final C00i A00 = new 1BQ(66347);

    public static SpannableString A00(Context context, Drawable drawable, TextView textView, String str) {
        SpannableString spannableString = new SpannableString(str);
        float applyDimension = TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
        float applyDimension2 = TypedValue.applyDimension(1, 6.0f, context.getResources().getDisplayMetrics());
        int i = (int) applyDimension;
        drawable.setBounds(0, 0, i, i);
        int i2 = (int) applyDimension2;
        4ER r0 = new 4ER(drawable, i2, i2, 0);
        String str2 = " [[icon]] ";
        int indexOf = str.indexOf(str2);
        float f = 0.0f / 0.0f;
        if (indexOf == -1) {
            str2 = "[[icon]]";
            indexOf = str.indexOf(str2);
        }
        int length = str2.length() + indexOf;
        if (indexOf != -1) {
            spannableString.setSpan(r0, indexOf, length, 18);
        }
        int i3 = (int) ((-(applyDimension - textView.getTextSize())) / 3.0f);
        MetricAffectingSpan metricAffectingSpan = new MetricAffectingSpan();
        ((4ES) metricAffectingSpan).A00 = i3;
        spannableString.setSpan(metricAffectingSpan, 0, indexOf, 18);
        MetricAffectingSpan metricAffectingSpan2 = new MetricAffectingSpan();
        ((4ES) metricAffectingSpan2).A00 = i3;
        spannableString.setSpan(metricAffectingSpan2, length, spannableString.length(), 18);
        return spannableString;
    }
}
