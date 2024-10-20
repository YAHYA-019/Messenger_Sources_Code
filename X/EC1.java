package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.facebook.user.model.User;

/* loaded from: EC1.class */
public final class EC1 extends DO7 {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ 7XJ A01;
    public final /* synthetic */ User A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC1(06Z r302, 7XJ r303, User user, String str) {
        super(str, "android.widget.Button");
        this.A01 = r303;
        this.A00 = r302;
        this.A02 = user;
    }

    public void onClick(View view) {
        06Z r0 = this.A00;
        User user = this.A02;
        if (r0 != null) {
            DKT A0P = 7zQ.A0P();
            CP0 cp0 = new CP0("com.bloks.www.bloks.nme.education.verification_education.bottom_sheet_msg");
            if (user != null) {
                cp0.A05("profile_owner_id", user.A13);
            }
            DqD A03 = cp0.A03();
            Context context = view.getContext();
            11T.A0F(context, 0);
            DKT.A05(context, r0, A0P, A03, 66, 80);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateDrawState(TextPaint textPaint) {
        super/*android.text.style.ClickableSpan*/.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
