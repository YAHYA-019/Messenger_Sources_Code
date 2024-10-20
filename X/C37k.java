package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.37k, reason: invalid class name */
/* loaded from: 37k.class */
public final class C37k extends 6sJ {
    public final 1Br A00;
    public final String A01;

    public C37k(Activity activity, Context context, String str) {
        super(context, activity);
        this.A01 = str;
        this.A00 = 1Bu.A01(context, 82553);
    }

    public void A02() {
        CNm cNm = (CNm) 1Br.A0B(this.A00);
        String str = this.A01;
        11T.A0F(str, 0);
        1UG A08 = 1BK.A08(CNm.A00(cNm), "messenger_ai_chat_screenshot_taken");
        if (A08.isSampled()) {
            A08.A7R(AbE.A00(78), str);
            A08.BZL();
        }
    }

    public boolean A03() {
        return false;
    }
}
