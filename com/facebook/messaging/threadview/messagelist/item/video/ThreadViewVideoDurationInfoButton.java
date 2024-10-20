package com.facebook.messaging.threadview.messagelist.item.video;

import X.1BQ;
import X.2KE;
import X.2KK;
import X.2OB;
import X.C00i;
import X.C09s;
import X.C1u2;
import X.C1u3;
import X.C1u4;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: ThreadViewVideoDurationInfoButton.class */
public class ThreadViewVideoDurationInfoButton extends CustomFrameLayout {
    public ImageView A00;
    public C00i A01;
    public FbTextView A02;
    public final C00i A03;
    public final MigColorScheme A04;

    public ThreadViewVideoDurationInfoButton(Context context) {
        this(context, null);
    }

    public ThreadViewVideoDurationInfoButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThreadViewVideoDurationInfoButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = new 1BQ(67074);
        this.A04 = LightColorScheme.A00();
        this.A01 = new 1BQ(16839);
        A0U(2132542976);
        this.A02 = (FbTextView) C09s.A01(this, 2131366166);
        this.A00 = (ImageView) C09s.A01(this, 2131366167);
        this.A02.setTextColor(this.A04.BKg());
        2OB r0 = this.A02;
        2KE r02 = 2KE.A0C;
        r0.setTextSize(2KK.A03(r02).textSizeSp);
        this.A02.setTypeface(2KK.A04(r02).A00(getContext()));
        ImageView imageView = this.A00;
        C00i c00i = this.A01;
        c00i.getClass();
        imageView.setImageDrawable(((C1u2) c00i.get()).A09(C1u3.A51, C1u4.SIZE_32, -1));
        this.A03.get();
        setVisibility(8);
    }
}
