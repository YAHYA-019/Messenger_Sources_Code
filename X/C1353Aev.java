package X;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.Aev, reason: case insensitive filesystem */
/* loaded from: Aev.class */
public final class C1353Aev extends ClickableSpan {
    public final Uri A00;
    public final /* synthetic */ CD5 A01;

    public C1353Aev(Uri uri, CD5 cd5) {
        this.A01 = cd5;
        this.A00 = uri;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        11T.A0F(view, 0);
        CD5 cd5 = this.A01;
        Uri uri = CD5.A03;
        7zP.A0b(cd5.A00).A0E(view.getContext(), this.A00);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        11T.A0F(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
