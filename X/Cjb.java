package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.chatheads.plugins.core.threadmenuitem.OpenChatHeadsMenuItemImplementation;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Cjb.class */
public final class Cjb implements JIM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 06Z A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ CGb A03;
    public final /* synthetic */ ThreadSummary A04;

    public Cjb(Context context, 06Z r303, FbUserSession fbUserSession, CGb cGb, ThreadSummary threadSummary) {
        this.A03 = cGb;
        this.A04 = threadSummary;
        this.A00 = context;
        this.A01 = r303;
        this.A02 = fbUserSession;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        CGb cGb = this.A03;
        ThreadSummary threadSummary = this.A04;
        int A01 = 1BK.A01(threadSummary.A0n);
        CGb.A00(cGb, A01);
        7zP.A0e(cGb.A01).markerEnd(5512986, A01, (short) 3);
        0fH.A0v("OpenChatHeadsMenuItemImplementation", "Failed to load users and show warnings", th);
        OpenChatHeadsMenuItemImplementation.A00(this.A01, threadSummary);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        11T.A0F(abstractCollection, 0);
        CGb cGb = this.A03;
        ThreadSummary threadSummary = this.A04;
        int A01 = 1BK.A01(threadSummary.A0n);
        CGb.A00(cGb, A01);
        7zP.A0e(cGb.A01).markerEnd(5512986, A01, (short) 2);
        ArrayList A0z = 1BL.A0z(abstractCollection);
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            User A0t = AbG.A0t(it);
            11T.A0D(A0t);
            A0z.add(C28p.A00(A0t));
        }
        Context context = this.A00;
        06Z r0 = this.A01;
        if (OpenChatHeadsMenuItemImplementation.A01(context, r0, this.A02, threadSummary, A0z)) {
            return;
        }
        OpenChatHeadsMenuItemImplementation.A00(r0, threadSummary);
    }
}
