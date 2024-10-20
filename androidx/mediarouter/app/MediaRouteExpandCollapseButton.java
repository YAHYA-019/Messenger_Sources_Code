package androidx.mediarouter.app;

import X.DQB;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: MediaRouteExpandCollapseButton.class */
public class MediaRouteExpandCollapseButton extends DQB {
    public View.OnClickListener A00;
    public boolean A01;
    public final AnimationDrawable A02;
    public final AnimationDrawable A03;
    public final String A04;
    public final String A05;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005e, code lost:
    
        if (r306 != 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaRouteExpandCollapseButton(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteExpandCollapseButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }
}
