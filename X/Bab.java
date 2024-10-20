package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: Bab.class */
public final class Bab {
    public final C7yq A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Bab(Context context, 06Z r303, ThreadKey threadKey, ThreadSummary threadSummary, Capabilities capabilities, String str) {
        CcE ccF;
        switch (str.hashCode()) {
            case 2106303:
                if (str.equals("Core")) {
                    ccF = new CcE(context, r303, threadKey, threadSummary, capabilities);
                    break;
                }
                throw 1BL.A0l(str);
            case 271076033:
                if (str.equals("CommunityChat")) {
                    ccF = new CcD(context, r303, threadKey, threadSummary, capabilities);
                    break;
                }
                throw 1BL.A0l(str);
            case 586338158:
                if (str.equals("Public_Chat")) {
                    ccF = new CcF(context, r303, threadKey, threadSummary, capabilities);
                    break;
                }
                throw 1BL.A0l(str);
            default:
                throw 1BL.A0l(str);
        }
        this.A00 = ccF;
    }
}
