package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.reactions.FastMessageReactionsPanelView;

/* loaded from: Im1.class */
public final class Im1 implements 7Lc {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Im1(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void CFT(String[] strArr) {
        if (this.A00 != 0) {
            ((HqJ) this.A02).A00(strArr[0]);
            return;
        }
        FastMessageReactionsPanelView fastMessageReactionsPanelView = (FastMessageReactionsPanelView) this.A01;
        FastMessageReactionsPanelView.A00((FbUserSession) this.A02, fastMessageReactionsPanelView, strArr);
        FastMessageReactionsPanelView.A02(fastMessageReactionsPanelView);
    }
}
