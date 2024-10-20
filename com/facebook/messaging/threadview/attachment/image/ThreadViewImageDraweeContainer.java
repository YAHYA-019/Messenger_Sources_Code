package com.facebook.messaging.threadview.attachment.image;

import X.C09s;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.view.DraweeView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: ThreadViewImageDraweeContainer.class */
public class ThreadViewImageDraweeContainer extends CustomFrameLayout {
    public DraweeView A00;

    public ThreadViewImageDraweeContainer(Context context) {
        super(context);
        A00();
    }

    public ThreadViewImageDraweeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ThreadViewImageDraweeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        A0U(2132542767);
        this.A00 = (DraweeView) C09s.A01(this, 2131368003);
    }
}
