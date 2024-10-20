package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Bb8.class */
public final class Bb8 {
    public final CF3 A00;

    public Bb8(Context context, ThreadKey threadKey, ThreadSummary threadSummary, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new CF3(context, threadKey, threadSummary);
    }
}
