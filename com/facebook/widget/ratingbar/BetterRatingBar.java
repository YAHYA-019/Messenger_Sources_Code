package com.facebook.widget.ratingbar;

import X.0FI;
import X.AbF;
import X.AnonymousClass001;
import X.C1oo;
import X.DKI;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.facebook.widget.CustomLinearLayout;
import java.util.Iterator;
import java.util.List;

/* loaded from: BetterRatingBar.class */
public class BetterRatingBar extends CustomLinearLayout {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final Drawable A06;
    public final Drawable A07;
    public final boolean A08;

    public BetterRatingBar(Context context) {
        this(context, null);
    }

    public BetterRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = AbF.A1F();
        this.A00 = 0;
        this.A01 = 0;
        this.A04 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0D);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        this.A06 = drawable == null ? context.getDrawable(2132347206) : drawable;
        this.A07 = drawable2 == null ? context.getDrawable(2132347207) : drawable2;
        this.A05 = obtainStyledAttributes.getInt(4, 5);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A05) {
                this.A08 = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                return;
            }
            ImageView imageView = new ImageView(getContext());
            Drawable drawable3 = this.A07;
            Drawable.ConstantState constantState = drawable3.getConstantState();
            if (constantState != null) {
                drawable3 = constantState.newDrawable();
            }
            imageView.setImageDrawable(drawable3);
            imageView.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            addView(imageView);
            i = i2 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00() {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.ratingbar.BetterRatingBar.A00():void");
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.A04;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int A05 = 0FI.A05(-605609461);
        if (this.A04) {
            int action = motionEvent.getAction();
            if (this.A08) {
                if (action != 0) {
                    int i2 = 0;
                    if (action != 1) {
                        if (action != 2) {
                            if (action == 3) {
                                this.A03 = false;
                            }
                        }
                    } else if (this.A03) {
                        int A01 = DKI.A01(motionEvent, this);
                        int i3 = this.A00;
                        if (A01 != i3 || i3 == 0) {
                            i2 = A01;
                        }
                        this.A01 = i2;
                        A00();
                        this.A00 = i2;
                        this.A01 = 0;
                        Iterator it = this.A02.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw AnonymousClass001.A0Q("onRatingCommitted");
                        }
                        z = true;
                        i = 1049903714;
                    }
                    z = super.onTouchEvent(motionEvent);
                    i = 1049903714;
                }
                this.A03 = true;
                z = true;
                i = 1049903714;
            } else {
                z = true;
                if (action == 0) {
                    requestDisallowInterceptTouchEvent(true);
                } else if (action != 1 && action != 2 && action != 3) {
                    z = super.onTouchEvent(motionEvent);
                    i = 1872680015;
                }
                int A012 = DKI.A01(motionEvent, this);
                if (A012 != this.A01) {
                    this.A01 = A012;
                    A00();
                    Iterator it2 = this.A02.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw AnonymousClass001.A0Q("onRatingModified");
                    }
                }
                if (action == 1 || action == 3) {
                    this.A00 = A012;
                    this.A01 = 0;
                    Iterator it3 = this.A02.iterator();
                    if (it3.hasNext()) {
                        it3.next();
                        throw AnonymousClass001.A0Q("onRatingCommitted");
                    }
                }
                i = 1872680015;
            }
        } else {
            z = super.onTouchEvent(motionEvent);
            i = 148097638;
        }
        0FI.A0B(i, A05);
        return z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.A04 = z;
    }
}
