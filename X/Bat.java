package X;

import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Bat.class */
public final class Bat {
    public final By8 A00;

    public Bat(Context context, Context context2, ThreadSummary threadSummary, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new By8(context, context2, threadSummary);
    }
}
