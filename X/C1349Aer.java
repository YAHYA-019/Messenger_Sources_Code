package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.Aer, reason: case insensitive filesystem */
/* loaded from: Aer.class */
public final class C1349Aer extends ClickableSpan {
    public int A00;
    public Context A01;
    public String A02;

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Intent A05;
        0Eg A052;
        Context context = this.A01;
        if (0Kh.A03(context.getPackageManager(), "com.facebook.katana")) {
            A05 = AbF.A05();
            A05.setData(C0A2.A03(StringFormatUtil.formatStrLocaleSafe(C1ic.A0D, Uri.encode(this.A02))));
            A052 = 09X.A00().A0A();
        } else {
            A05 = AbG.A05();
            A05.setData(C0A2.A03(this.A02));
            A052 = 09X.A00().A05();
        }
        A052.A0A(context, A05);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.A01.getColor(this.A00));
    }
}
