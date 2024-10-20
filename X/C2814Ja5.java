package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.Ja5, reason: case insensitive filesystem */
/* loaded from: Ja5.class */
public final class C2814Ja5 extends AppCompatImageView implements MHl {
    public final /* synthetic */ LLc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2814Ja5(Context context, LLc lLc) {
        super(context, null, 2130968633);
        this.A00 = lLc;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new JaC(this, this, lLc));
    }

    @Override // X.MHl
    public boolean Bf2() {
        return false;
    }

    @Override // X.MHl
    public boolean Bf3() {
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.A00.A03();
        }
        return true;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int A0I = JQx.A0I(this, getPaddingLeft());
            int i5 = (width + A0I) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(i5 - max, paddingTop - max, i5 + max, paddingTop + max);
        }
        return frame;
    }
}
