package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.data.repository.sharedmedia.ThreadKeyAndMedia;

/* loaded from: E1E.class */
public final class E1E extends DSE {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1De A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1E(FbUserSession fbUserSession, C1x1 c1x1, 1De r304, ThreadKeyAndMedia threadKeyAndMedia) {
        super(c1x1, threadKeyAndMedia);
        11T.A0F(c1x1, 3);
        this.A02 = r304;
        this.A01 = 7zM.A0h(r304, 98879);
        this.A00 = fbUserSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c2, code lost:
    
        if (r311.containsKey(r0) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0152, code lost:
    
        if (r313 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02c8, code lost:
    
        if (r311.get(r0) != null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(boolean r302) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1E.A01(boolean):void");
    }

    public void onActive() {
        A01(false);
    }
}
