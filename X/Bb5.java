package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: Bb5.class */
public final class Bb5 {
    public final C4YN A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Bb5(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary, 2SI r308, User user, Capabilities capabilities, String str) {
        C4YN cd6;
        switch (str.hashCode()) {
            case -1586042920:
                if (str.equals(AbstractC00603o4.A00(341))) {
                    cd6 = new Cd4(context, r303, fbUserSession, callerContext, inboxTrackableItem, threadSummary, user, capabilities);
                    break;
                }
                throw 1BL.A0l(str);
            case -749203430:
                if (str.equals("BubblesMenuItems")) {
                    cd6 = new Cd5(context, r303, fbUserSession, callerContext, inboxTrackableItem, threadSummary, r308, user, capabilities);
                    break;
                }
                throw 1BL.A0l(str);
            case 56343713:
                if (str.equals(1BJ.A00(665))) {
                    cd6 = new Cd3(context, r303, fbUserSession, callerContext, inboxTrackableItem, threadSummary, user, capabilities);
                    break;
                }
                throw 1BL.A0l(str);
            case 456885633:
                if (str.equals("MenuItems")) {
                    cd6 = new Cd6(context, r303, fbUserSession, callerContext, inboxTrackableItem, threadSummary, r308, user, capabilities);
                    break;
                }
                throw 1BL.A0l(str);
            default:
                throw 1BL.A0l(str);
        }
        this.A00 = cd6;
    }
}
