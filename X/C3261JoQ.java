package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.JoQ, reason: case insensitive filesystem */
/* loaded from: JoQ.class */
public final class C3261JoQ extends JwS implements MFS {
    public C00i A00;
    public List A01;
    public C00i A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final TextView A06;

    /* JADX WARN: Multi-variable type inference failed */
    public C3261JoQ(Context context) {
        super(context);
        setChildrenDrawingOrderEnabled(true);
        A0U(2132541688);
        this.A00 = 1BV.A00(84850);
        1BV r0 = new 1BV(context, 82110);
        this.A02 = r0;
        r0.get();
        this.A05 = (ImageView) C09s.A01(this, 2131362970);
        this.A06 = (TextView) C09s.A01(this, 2131362350);
        this.A04 = C09s.A01(this, 2131366593);
        this.A03 = C09s.A01(this, 2131366594);
        this.A05.setImageDrawable(JQy.A0X(this).A00(2MQ.A2W));
    }

    public void CmN(boolean z) {
        this.A05.setSelected(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(Canvas canvas) {
        super/*com.facebook.widget.CustomFrameLayout*/.dispatchDraw(canvas);
    }

    public int getChildDrawingOrder(int i, int i2) {
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1942683136);
        super/*com.facebook.widget.CustomFrameLayout*/.onAttachedToWindow();
        C2rp.A01(this);
        GOo.A16(getContext(), this, 2131954101);
        0FI.A0C(-1569651466, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-27128624);
        super/*com.facebook.widget.CustomFrameLayout*/.onDetachedFromWindow();
        0FI.A0C(-672339406, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (super/*android.view.View*\/.verifyDrawable(r302) != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            if (r0 == r1) goto L13
            r0 = r301
            r1 = r302
            boolean r0 = super/*android.view.View*/.verifyDrawable(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L15
        L13:
            r0 = 1
            r303 = r0
        L15:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3261JoQ.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
