package com.facebook.messaging.media.editing;

import X.7zL;
import X.C2514Gfu;
import X.DKC;
import X.HRb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import com.facebook.drawee.fbpipeline.FbDraweeView;

/* loaded from: MultimediaEditorDraweeView.class */
public class MultimediaEditorDraweeView extends FbDraweeView {
    public HRb A00;
    public boolean A01;
    public final C2514Gfu A02;
    public final Resources A03;

    public MultimediaEditorDraweeView(Context context) {
        this(context, null);
    }

    public MultimediaEditorDraweeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultimediaEditorDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = false;
        this.A03 = context.getResources();
        this.A02 = new C2514Gfu(this);
    }

    public void A0P(BitmapDrawable bitmapDrawable) {
        super.A0D(bitmapDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.drawee.fbpipeline.FbDraweeView
    public void onDraw(Canvas canvas) {
        if (this.A01) {
            float A01 = 7zL.A01(this.A03, 2132279321);
            Path A0B = DKC.A0B();
            A0B.addRoundRect(new RectF(0.0f, 0.0f, DKC.A02(this), DKC.A03(this)), A01, A01, Path.Direction.CW);
            canvas.clipPath(A0B);
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        if (r305 != X.InterfaceC07034in.A04) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.editing.MultimediaEditorDraweeView.onMeasure(int, int):void");
    }
}
