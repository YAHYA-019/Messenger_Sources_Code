package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.resources.ui.FbRadioButton;

/* loaded from: Ji3.class */
public final class Ji3 extends C2lb {
    public final FbRadioButton A00;

    public Ji3(View view) {
        super(view);
        TextView A0F = DKF.A0F(view, 2131362210);
        Context context = view.getContext();
        A0F.setTypeface(2KU.A00(context));
        FbRadioButton fbRadioButton = (FbRadioButton) view.requireViewById(2131362209);
        this.A00 = fbRadioButton;
        if (LDi.A08(context)) {
            2Me A02 = LDi.A02(context);
            A0F.setTextColor(A02.A00());
            LDi.A06(view, 2MR.A1D, A02, A02.A01(2MR.A2J));
            Drawable drawable = context.getDrawable(2132411401);
            if (drawable != null) {
                drawable.setTintList(LDi.A00(A02.A01(2MR.A28), A02.A01(2MR.A2Y)));
            }
            fbRadioButton.setButtonDrawable(drawable);
        }
    }
}
