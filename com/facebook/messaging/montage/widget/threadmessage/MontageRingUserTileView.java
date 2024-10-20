package com.facebook.messaging.montage.widget.threadmessage;

import X.0FI;
import X.11T;
import X.1BL;
import X.2qN;
import X.DKC;
import X.DKE;
import X.DKF;
import X.DKG;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.user.tiles.UserTileView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MontageRingUserTileView.class */
public final class MontageRingUserTileView extends UserTileView {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MontageRingUserTileView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MontageRingUserTileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MontageRingUserTileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A03 = getResources().getDimensionPixelSize(2132279309);
        DKE.A0g(this).A0E(true);
        this.A00 = getContext().getColor(2132213766);
    }

    public /* synthetic */ MontageRingUserTileView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.user.tiles.UserTileView
    public void A02(Canvas canvas, Drawable drawable) {
        boolean A1X = 1BL.A1X(canvas, drawable);
        if (!this.A02) {
            super.A02(canvas, drawable);
            return;
        }
        if (super.A01) {
            2qN A0g = DKE.A0g(this);
            int width = getWidth();
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int i = this.A03 * 2;
            A0g.A04.setBounds(i + paddingLeft, i + getPaddingTop(), width - (i + getPaddingRight()), height - (i + getPaddingBottom()));
            Drawable drawable2 = A0g.A03;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, width, height);
            }
            super.A01 = false;
        }
        11T.A0A(((Drawable) DKE.A0g(this).A09).getBounds());
        Paint A0A = DKC.A0A(A1X ? 1 : 0);
        Paint.Style style = Paint.Style.FILL;
        A0A.setStyle(style);
        A0A.setColor(this.A01);
        canvas.drawCircle(r0.centerX(), r0.centerY(), getWidth() / 2, A0A);
        Paint A0A2 = DKC.A0A(A1X ? 1 : 0);
        A0A2.setStyle(style);
        A0A2.setColor(this.A00);
        canvas.drawCircle(r0.centerX(), r0.centerY(), (getWidth() / 2) - this.A03, A0A2);
        drawable.draw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A05 = 0FI.A05(-666963760);
        11T.A0F(motionEvent, 0);
        if (motionEvent.getActionMasked() != 0) {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = 186758039;
        } else if (this.A02) {
            onTouchEvent = true;
            i = -1531422290;
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = 750136001;
        }
        0FI.A0B(i, A05);
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.A00 = i;
    }
}
