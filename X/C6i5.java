package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadNoLongerVisible;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible;

/* renamed from: X.6i5, reason: invalid class name */
/* loaded from: 6i5.class */
public final class C6i5 implements 1Vf {
    public 1yH A00;
    public final FbUserSession A01;
    public final 6G0 A02;
    public final 1Uj A03;

    public C6i5(FbUserSession fbUserSession, 6G0 r303) {
        11T.A0F(r303, 1);
        this.A02 = r303;
        this.A01 = fbUserSession;
        Context context = r303.getContext();
        11T.A0A(context);
        this.A03 = (1Uj) 1Lo.A04(context, fbUserSession, (1BY) null, 16686);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        1Uj r308;
        MailboxCallback a1b;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible")) {
            OnThreadVisible onThreadVisible = (OnThreadVisible) r302;
            11T.A0F(onThreadVisible, 0);
            ThreadKey threadKey = onThreadVisible.A00;
            if (!threadKey.A1K() || !threadKey.A1N()) {
                return;
            }
            r308 = this.A03;
            a1b = new A1c(threadKey, this, 6);
        } else {
            if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadNoLongerVisible")) {
                throw 4YV.A0f(str);
            }
            OnThreadNoLongerVisible onThreadNoLongerVisible = (OnThreadNoLongerVisible) r302;
            11T.A0F(onThreadNoLongerVisible, 0);
            ThreadKey threadKey2 = onThreadNoLongerVisible.A00;
            if (!threadKey2.A1K() || !threadKey2.A1N()) {
                return;
            }
            r308 = this.A03;
            a1b = new A1b(this, 8);
        }
        r308.A06(a1b);
    }
}
