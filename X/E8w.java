package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

/* loaded from: E8w.class */
public final class E8w extends DO6 {
    public final FyG A00;
    public final DLQ A01;
    public final DLQ A02;
    public final GJj A03;
    public final boolean A04;

    public E8w(FyG fyG, DLQ dlq, DLQ dlq2, GJj gJj, String str, String str2, boolean z) {
        ((DO6) this).A00 = str;
        ((DO6) this).A01 = str2;
        this.A03 = gJj;
        this.A02 = dlq;
        this.A01 = dlq2;
        this.A00 = fyG;
        this.A04 = z;
    }

    public void onClick(View view) {
        EoL eoL;
        11T.A0F(view, 0);
        DKM A00 = DKM.A00();
        A00.A0J(this.A02, 0);
        if (this.A04 && (view instanceof RCTextView)) {
            RCTextView rCTextView = (RCTextView) view;
            CharSequence charSequence = rCTextView.A07;
            11T.A0I(charSequence, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) charSequence;
            Layout layout = rCTextView.A06;
            11T.A0A(layout);
            double spanStart = spanned.getSpanStart(this);
            double spanEnd = spanned.getSpanEnd(this);
            int i = (int) spanStart;
            double primaryHorizontal = layout.getPrimaryHorizontal(i);
            double primaryHorizontal2 = layout.getPrimaryHorizontal((int) spanEnd);
            int lineForOffset = layout.getLineForOffset(i);
            Rect A0C = DKC.A0C();
            layout.getLineBounds(lineForOffset, A0C);
            RectF rectF = new RectF(A0C);
            float paddingBottom = rectF.left + ((float) (((rCTextView.getPaddingBottom() + primaryHorizontal) - rCTextView.getScrollX()) + rCTextView.A00));
            rectF.left = paddingBottom;
            rectF.right = (float) ((paddingBottom + primaryHorizontal2) - primaryHorizontal);
            double scrollY = rCTextView.getScrollY() + rCTextView.getPaddingTop() + rCTextView.A01;
            float f = rectF.top;
            float f2 = (float) scrollY;
            rectF.top = f + f2;
            rectF.bottom += f2;
            rCTextView.getMatrix().mapRect(rectF);
            rectF.offset(rCTextView.getLeft(), rCTextView.getTop());
            eoL = new EoL(rectF.left + (rectF.width() / 2.0f), rectF.top + (rectF.height() / 2.0f), rectF.width(), rectF.height());
        } else {
            eoL = this.A00;
        }
        A00.A0I(eoL);
        FAv.A01(this.A01, this.A00, new DKc(A00.A00), this.A03);
    }

    public void updateDrawState(TextPaint textPaint) {
    }
}
