package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.events.common.threadview.OnDataFetchRenderStart;
import java.util.List;

/* renamed from: X.6vv, reason: invalid class name */
/* loaded from: 6vv.class */
public final class C6vv implements 1Vf {
    public int A00;
    public final Context A01;
    public final FbUserSession A02;
    public final ThreadKey A03;
    public final C01i A04 = C01g.A00(C03i.A02, new AnonymousClass831(this, 16));

    public C6vv(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A03 = threadKey;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        String str2;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        int hashCode = str.hashCode();
        if (hashCode != -1787492718) {
            if (hashCode != -1399920744) {
                str2 = hashCode == -1098378507 ? "com.facebook.messaging.msys.thread.chatheads.events.OnChatHeadContentHiddenEvent" : "com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed";
            } else if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnDataFetchRenderStart")) {
                OnDataFetchRenderStart onDataFetchRenderStart = (OnDataFetchRenderStart) r302;
                11T.A0F(onDataFetchRenderStart, 0);
                List B70 = onDataFetchRenderStart.A00.B70();
                this.A00 = B70 != null ? B70.size() : 0;
                return;
            }
            throw 4YV.A0f(str);
        }
        if (str.equals(str2)) {
            if (this.A00 > 20) {
                ((C07484k0) this.A04.getValue()).A09(true);
                return;
            }
            return;
        }
        throw 4YV.A0f(str);
    }
}
