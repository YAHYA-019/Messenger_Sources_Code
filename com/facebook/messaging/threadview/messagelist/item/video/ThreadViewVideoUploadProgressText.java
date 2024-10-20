package com.facebook.messaging.threadview.messagelist.item.video;

import X.0S2;
import X.1BQ;
import X.C00i;
import X.C09s;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: ThreadViewVideoUploadProgressText.class */
public class ThreadViewVideoUploadProgressText extends CustomFrameLayout {
    public TextView A00;
    public Integer A01;
    public final C00i A02;
    public final MigColorScheme A03;

    public ThreadViewVideoUploadProgressText(Context context) {
        this(context, null);
    }

    public ThreadViewVideoUploadProgressText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThreadViewVideoUploadProgressText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = new 1BQ(67074);
        this.A03 = LightColorScheme.A00();
        A0U(2132542979);
        TextView textView = (TextView) C09s.A01(this, 2131366172);
        this.A00 = textView;
        textView.setTextColor(this.A03.BKg());
        this.A01 = 0S2.A0C;
        this.A00.setText("");
        setVisibility(8);
    }
}
