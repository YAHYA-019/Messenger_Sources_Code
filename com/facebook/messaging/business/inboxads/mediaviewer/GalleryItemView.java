package com.facebook.messaging.business.inboxads.mediaviewer;

import X.LD7;
import X.LVj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: GalleryItemView.class */
public class GalleryItemView extends AppCompatImageView {
    public GestureDetector A00;
    public LVj A01;

    public GalleryItemView(Context context) {
        super(context, null);
    }

    public GalleryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GalleryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        LD7 ld7;
        LVj lVj = this.A01;
        if (lVj == null || (ld7 = lVj.A03) == null) {
            return 0;
        }
        return (int) ld7.A0E.width();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        LD7 ld7;
        LVj lVj = this.A01;
        if (lVj == null || (ld7 = lVj.A03) == null) {
            return 0;
        }
        return (int) (ld7.A0E.left - ld7.A0D.left);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        LD7 ld7;
        LVj lVj = this.A01;
        if (lVj == null || (ld7 = lVj.A03) == null) {
            return 0;
        }
        return (int) ld7.A0D.width();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        LD7 ld7;
        LVj lVj = this.A01;
        if (lVj == null || (ld7 = lVj.A03) == null) {
            return 0;
        }
        return (int) ld7.A0E.height();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        LD7 ld7;
        LVj lVj = this.A01;
        if (lVj == null || (ld7 = lVj.A03) == null) {
            return 0;
        }
        return (int) (ld7.A0E.top - ld7.A0D.top);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        LD7 ld7;
        LVj lVj = this.A01;
        if (lVj == null || (ld7 = lVj.A03) == null) {
            return 0;
        }
        return (int) ld7.A0D.height();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        if (r0 != 6) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.business.inboxads.mediaviewer.GalleryItemView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
