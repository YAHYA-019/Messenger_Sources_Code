package X;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: EC5.class */
public class EC5 extends DRi {
    public View A00;

    public ClickableSpan[] A0r() {
        2OC r0 = this.A00;
        if (!(r0.getText() instanceof Spanned)) {
            return new ClickableSpan[0];
        }
        Spanned spanned = (Spanned) r0.getText();
        return (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
    }
}
