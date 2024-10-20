package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* loaded from: EC3.class */
public final class EC3 extends DO7 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ 7M0 A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC3(Context context, 7M0 r303, String str, String str2, int i) {
        super(str2, "android.widget.Button");
        this.A02 = r303;
        this.A03 = str;
        this.A01 = context;
        this.A00 = i;
    }

    public void onClick(View view) {
        Long A0e;
        7M0 r0 = this.A02;
        String str = this.A03;
        if (str != null && (A0e = 0CW.A0e(str)) != null) {
            1UG A08 = 1BK.A08(1Br.A02(r0.A00), "nme_benefits");
            if (A08.isSampled()) {
                A08.A7R("event_type", "click");
                A08.A7R("benefit_type", "LABEL");
                A08.A7R("subject_type", "viewer");
                A08.A6H("subscriber_id", A0e);
                A08.A7R("object_type", "profile");
                A08.A7R("surface", "msgr_thread");
                A08.BZL();
            }
        }
        Context context = this.A01;
        if (str != null) {
            EU9.A00(context);
            EgZ A00 = EUd.A00(context, true);
            LinkedHashMap A1C = 1BK.A1C();
            BitSet A18 = 1BK.A18(1);
            A1C.put("profile_id", str);
            A18.set(0);
            if (A18.nextClearBit(0) < 1) {
                throw AnonymousClass001.A0N("Missing required params");
            }
            new FZb("com.bloks.www.nme.fb_profile.verified_label_education_bottom_sheet", (String) null, 04R.A0D(A1C), 04R.A0G(), 719983200, 0L, true).A01(context, new FZq((Dq1) null, (Boolean) null, (Integer) null), A00);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateDrawState(TextPaint textPaint) {
        11T.A0F(textPaint, 0);
        super/*android.text.style.ClickableSpan*/.updateDrawState(textPaint);
        textPaint.setColor(this.A00);
        textPaint.setUnderlineText(false);
    }
}
