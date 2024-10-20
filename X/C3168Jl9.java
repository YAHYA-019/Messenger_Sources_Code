package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jl9, reason: case insensitive filesystem */
/* loaded from: Jl9.class */
public final class C3168Jl9 extends L5G {
    public float A00;
    public LAt A01;
    public final float A02;
    public final Paint A03;
    public final Rect A04;
    public final RectF A05;
    public final RectF A06;
    public final Drawable A07;
    public final Integer A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3168Jl9(Context context, Drawable drawable, LTS lts, Integer num) {
        super(lts);
        LAt lAt = new LAt(context);
        Paint A09 = DKC.A09();
        this.A03 = A09;
        this.A05 = DKC.A0D();
        this.A06 = DKC.A0D();
        this.A04 = DKC.A0C();
        this.A01 = lAt;
        this.A07 = drawable;
        this.A02 = (((L5G) this).A05 * 48.0f) / 2.0f;
        this.A00 = (int) (r0 * 8.0f);
        ((L5G) this).A03 = 5;
        ((L5G) this).A02 = 4.0f;
        this.A08 = num;
        A09.setColor(-1);
        A09.setAlpha(178);
    }

    public void A06(Canvas canvas) {
        Drawable drawable = this.A07;
        drawable.setBounds(this.A04);
        canvas.drawCircle(r0.centerX(), r0.centerY(), r0.width() >> 1, this.A03);
        drawable.setAlpha(76);
        drawable.draw(canvas);
    }
}
