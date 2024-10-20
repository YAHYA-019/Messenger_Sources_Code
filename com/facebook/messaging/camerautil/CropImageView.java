package com.facebook.messaging.camerautil;

import X.0S2;
import X.AnonymousClass001;
import X.DKC;
import X.I4z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: CropImageView.class */
public class CropImageView extends ImageView {
    public float A00;
    public float A01;
    public int A02;
    public I4z A03;
    public ArrayList A04;

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = AnonymousClass001.A0s();
        this.A03 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = this.A04;
            if (i2 >= arrayList.size()) {
                return;
            }
            I4z i4z = (I4z) arrayList.get(i2);
            if (!i4z.A0A) {
                canvas.save();
                Path A0B = DKC.A0B();
                if (i4z.A0B) {
                    Rect A0C = DKC.A0C();
                    View view = i4z.A08;
                    view.getDrawingRect(A0C);
                    A0B.addRect(new RectF(i4z.A02), Path.Direction.CW);
                    Paint paint = i4z.A0F;
                    paint.setColor(view.getContext().getColor(2132214411));
                    canvas.clipPath(A0B, Region.Op.DIFFERENCE);
                    canvas.drawRect(A0C, i4z.A0B ? i4z.A0D : i4z.A0E);
                    canvas.restore();
                    canvas.drawPath(A0B, paint);
                    if (i4z.A09 == 0S2.A0C) {
                        Rect rect = i4z.A02;
                        int i3 = rect.left + 1;
                        int i4 = rect.right + 1;
                        int i5 = rect.top + 4;
                        int i6 = rect.bottom + 3;
                        int intrinsicWidth = i4z.A07.getIntrinsicWidth() / 2;
                        int intrinsicHeight = i4z.A07.getIntrinsicHeight() / 2;
                        int intrinsicHeight2 = i4z.A06.getIntrinsicHeight() / 2;
                        int intrinsicWidth2 = i4z.A06.getIntrinsicWidth() / 2;
                        Rect rect2 = i4z.A02;
                        int i7 = rect2.left;
                        int i8 = i7 + ((rect2.right - i7) / 2);
                        int i9 = rect2.top;
                        int i10 = i9 + ((rect2.bottom - i9) / 2);
                        Drawable drawable = i4z.A07;
                        int i11 = i3 - intrinsicWidth;
                        int i12 = i10 - intrinsicHeight;
                        int i13 = i3 + intrinsicWidth;
                        int i14 = i10 + intrinsicHeight;
                        drawable.setBounds(i11, i12, i13, i14);
                        i4z.A07.draw(canvas);
                        i4z.A07.setBounds(i4 - intrinsicWidth, i12, i4 + intrinsicWidth, i14);
                        i4z.A07.draw(canvas);
                        Drawable drawable2 = i4z.A06;
                        int i15 = i8 - intrinsicWidth2;
                        int i16 = i5 - intrinsicHeight2;
                        int i17 = i8 + intrinsicWidth2;
                        drawable2.setBounds(i15, i16, i17, i5 + intrinsicHeight2);
                        i4z.A06.draw(canvas);
                        i4z.A06.setBounds(i15, i6 - intrinsicHeight2, i17, i6 + intrinsicHeight2);
                        i4z.A06.draw(canvas);
                    }
                } else {
                    Paint paint2 = i4z.A0F;
                    paint2.setColor(-16777216);
                    canvas.drawRect(i4z.A02, paint2);
                }
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getDrawable() != null) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                I4z i4z = (I4z) it.next();
                i4z.A01.set(getImageMatrix());
                i4z.A02 = I4z.A00(i4z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0643 A[LOOP:0: B:81:0x062f->B:83:0x0643, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x066c A[EDGE_INSN: B:84:0x066c->B:85:0x066c BREAK  A[LOOP:0: B:81:0x062f->B:83:0x0643], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06c3 A[EDGE_INSN: B:95:0x06c3->B:94:0x06c3 BREAK  A[LOOP:1: B:85:0x066c->B:89:0x06ca], SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.camerautil.CropImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
