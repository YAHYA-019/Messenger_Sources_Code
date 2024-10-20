package X;

import android.content.Context;
import com.facebook.iabadscontext.DisclaimerBodyUrlRanges;
import com.facebook.iabadscontext.DisclaimerText;
import java.util.List;

/* loaded from: Fuv.class */
public final class Fuv implements GKo {
    public final DisclaimerBodyUrlRanges A00;

    public Fuv(Context context, DisclaimerText disclaimerText) {
        List list = disclaimerText.A01;
        this.A00 = list != null ? (DisclaimerBodyUrlRanges) 0QD.A0E(list) : null;
        if (context != null) {
            context.getString(2131951851);
        }
    }
}
