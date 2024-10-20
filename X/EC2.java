package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: EC2.class */
public final class EC2 extends DO7 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View.OnClickListener A01;
    public final /* synthetic */ MigColorScheme A02;

    public EC2(Context context, View.OnClickListener onClickListener, MigColorScheme migColorScheme, String str, String str2) {
        this.A01 = onClickListener;
        this.A02 = migColorScheme;
        this.A00 = context;
        ((DO7) this).A00 = str;
        ((DO7) this).A01 = "android.widget.Button";
        ((DO7) this).A02 = str2;
    }

    public void onClick(View view) {
        11T.A0F(view, 0);
        this.A01.onClick(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateDrawState(TextPaint textPaint) {
        11T.A0F(textPaint, 0);
        textPaint.linkColor = this.A02.Atv();
        super/*android.text.style.ClickableSpan*/.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(2KQ.A02.A00(this.A00));
    }
}
