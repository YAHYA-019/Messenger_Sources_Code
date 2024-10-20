package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Ddy, reason: case insensitive filesystem */
/* loaded from: Ddy.class */
public final class C2112Ddy extends 5CC implements C2ks {
    public final Drawable A00;
    public final 7QB A01;

    public C2112Ddy(C69f c69f) {
        super((Drawable) null);
        Drawable drawable = new Drawable();
        this.A00 = drawable;
        A03(drawable);
        69W r0 = new 69W(c69f);
        this.A01 = r0;
        ((7QB) r0).A02 = true;
    }

    @Override // X.C2ks
    public boolean CR6(View view, MotionEvent motionEvent) {
        return this.A01.A08(motionEvent);
    }

    @Override // X.C2ks
    public boolean Cxj(MotionEvent motionEvent) {
        return true;
    }

    public void draw(Canvas canvas) {
        Object A0B;
        7QB r0 = this.A01;
        r0.onDraw();
        try {
            super.draw(canvas);
        } catch (Exception e) {
            C69w c69w = ((69W) r0).A01;
            if (c69w != null && (c69w instanceof C69v) && (A0B = ((C69v) c69w).A0B()) != null) {
                throw 1BK.A0s(String.format(4YT.A00(222), A0B.toString()), e);
            }
            throw e;
        }
    }
}
