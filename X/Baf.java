package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: Baf.class */
public final class Baf {
    public final CFE A00;

    public Baf(Context context, 06Z r303, ThreadKey threadKey, ThreadSummary threadSummary, Capabilities capabilities, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new CFE(context, r303, threadKey, threadSummary, capabilities);
    }
}
