package androidx.appcompat.widget;

import X.C53h;
import X.C53l;
import X.DKE;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: AppCompatImageView.class */
public class AppCompatImageView extends ImageView {
    public boolean A00;
    public final C53h A01;
    public final C53l A02;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        this.A00 = false;
        C53h A0N = DKE.A0N(this);
        this.A01 = A0N;
        A0N.A03(attributeSet, i);
        C53l c53l = new C53l(this);
        this.A02 = c53l;
        c53l.A02(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C53h c53h = this.A01;
        if (c53h != null) {
            c53h.A00();
        }
        C53l c53l = this.A02;
        if (c53l != null) {
            c53l.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (super.hasOverlappingRendering() == false) goto L6;
     */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasOverlappingRendering() {
        /*
            r301 = this;
            r0 = r301
            X.53l r0 = r0.A02
            android.widget.ImageView r0 = r0.A01
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r302 = r0
            r0 = r302
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1f
            r0 = r301
            boolean r0 = super.hasOverlappingRendering()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L21
        L1f:
            r0 = 0
            r304 = r0
        L21:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatImageView.hasOverlappingRendering():boolean");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C53h c53h = this.A01;
        if (c53h != null) {
            c53h.A01();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C53h c53h = this.A01;
        if (c53h != null) {
            c53h.A02(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C53l c53l = this.A02;
        if (c53l != null) {
            c53l.A00();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C53l c53l = this.A02;
        if (c53l != null && drawable != null && !this.A00) {
            c53l.A00 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c53l != null) {
            c53l.A00();
            if (this.A00) {
                return;
            }
            ImageView imageView = c53l.A01;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c53l.A00);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.A00 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C53l c53l = this.A02;
        if (c53l != null) {
            c53l.A01(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C53l c53l = this.A02;
        if (c53l != null) {
            c53l.A00();
        }
    }
}
