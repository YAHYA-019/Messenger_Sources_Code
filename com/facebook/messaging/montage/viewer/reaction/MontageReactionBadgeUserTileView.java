package com.facebook.messaging.montage.viewer.reaction;

import X.0FI;
import X.1BY;
import X.1Bn;
import X.5CC;
import X.69W;
import X.C69e;
import X.C69s;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.user.tiles.UserTileView;

/* loaded from: MontageReactionBadgeUserTileView.class */
public class MontageReactionBadgeUserTileView extends UserTileView implements CallerContextable {
    public static final CallerContext A05 = CallerContext.A06(MontageReactionBadgeUserTileView.class);
    public int A00;
    public int A01;
    public C69s A02;
    public C69e A03;
    public 69W A04;

    public MontageReactionBadgeUserTileView(Context context) {
        super(context);
        A00();
    }

    public MontageReactionBadgeUserTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public MontageReactionBadgeUserTileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        Context context = getContext();
        this.A02 = (C69s) 1Bn.A0E(context, (1BY) null, 49976);
        C69e c69e = (C69e) 1Bn.A0A(49980);
        this.A03 = c69e;
        c69e.getClass();
        69W r0 = new 69W(c69e.A01());
        this.A04 = r0;
        5CC A02 = r0.A02();
        if (A02 != null) {
            A02.setCallback(this);
        }
        this.A01 = context.getResources().getDimensionPixelOffset(2132279320);
        this.A00 = context.getResources().getDimensionPixelOffset(2132279298);
    }

    @Override // com.facebook.user.tiles.UserTileView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-938452420);
        super.onAttachedToWindow();
        this.A04.A03();
        0FI.A0C(712520384, A06);
    }

    @Override // com.facebook.user.tiles.UserTileView, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1169523382);
        super.onDetachedFromWindow();
        this.A04.A04();
        0FI.A0C(78922484, A06);
    }

    @Override // com.facebook.user.tiles.UserTileView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        5CC A02 = this.A04.A02();
        if (A02 != null) {
            A02.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.A04.A03();
    }

    @Override // com.facebook.user.tiles.UserTileView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.A00;
        int i6 = i + i5;
        int i7 = i2 + i5;
        5CC A02 = this.A04.A02();
        if (A02 != null) {
            int i8 = this.A01;
            A02.setBounds(i6, i7, i6 + i8, i8 + i7);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.A04.A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r302 == r301.A04.A02()) goto L6;
     */
    @Override // com.facebook.user.tiles.UserTileView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L19
            r0 = r301
            X.69W r0 = r0.A04
            X.69h r0 = r0.A02()
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L1b
        L19:
            r0 = 1
            r303 = r0
        L1b:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.reaction.MontageReactionBadgeUserTileView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
