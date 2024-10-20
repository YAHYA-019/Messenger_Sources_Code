package com.facebook.messaging.widget.toolbar;

import X.AbstractC00793on;
import X.C1oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;

/* loaded from: ThemeCompatToolbar.class */
public class ThemeCompatToolbar extends Toolbar {
    public ThemeCompatToolbar(Context context) {
        super(context, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ThemeCompatToolbar(android.content.Context r302, android.util.AttributeSet r303) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L36
            int[] r0 = X.C1oo.A2j
            r305 = r0
            r0 = r302
            r1 = r303
            r2 = r305
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r305 = r0
            r0 = r305
            r1 = 0
            r2 = 0
            int r0 = r0.getResourceId(r1, r2)
            r304 = r0
            r0 = r305
            r0.recycle()
            r0 = r304
            if (r0 == 0) goto L36
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r305 = r0
            r0 = r305
            r1 = r302
            r2 = r304
            r0.<init>(r1, r2)
            r0 = r305
            r302 = r0
        L36:
            r0 = r301
            r1 = r302
            r2 = r303
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r302
            r2 = r303
            r0.A00(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.widget.toolbar.ThemeCompatToolbar.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ThemeCompatToolbar(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            r301 = this;
            r0 = r303
            if (r0 == 0) goto L37
            int[] r0 = X.C1oo.A2j
            r305 = r0
            r0 = r302
            r1 = r303
            r2 = r305
            r3 = r304
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r305 = r0
            r0 = r305
            r1 = 0
            r2 = 0
            int r0 = r0.getResourceId(r1, r2)
            r306 = r0
            r0 = r305
            r0.recycle()
            r0 = r306
            if (r0 == 0) goto L37
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r305 = r0
            r0 = r305
            r1 = r302
            r2 = r306
            r0.<init>(r1, r2)
            r0 = r305
            r302 = r0
        L37:
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r302
            r2 = r303
            r0.A00(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.widget.toolbar.ThemeCompatToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1I);
        String A01 = AbstractC00793on.A01(context, obtainStyledAttributes, 3);
        if (!TextUtils.isEmpty(A01)) {
            A0I();
        }
        ImageButton imageButton = this.A09;
        if (imageButton != null) {
            imageButton.setContentDescription(A01);
        }
        A0R(AbstractC00793on.A01(context, obtainStyledAttributes, 2));
        A0S(AbstractC00793on.A01(context, obtainStyledAttributes, 1));
        A0T(AbstractC00793on.A01(context, obtainStyledAttributes, 0));
        obtainStyledAttributes.recycle();
    }
}
