package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: Iwj.class */
public final class Iwj implements Runnable {
    public static final String __redex_internal_original_name = "M4MessageReactionsReactorsFragment$10$1";
    public final /* synthetic */ MailboxNullable A00;
    public final /* synthetic */ Iar A01;

    public Iwj(MailboxNullable mailboxNullable, Iar iar) {
        this.A01 = iar;
        this.A00 = mailboxNullable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment, androidx.lifecycle.LifecycleOwner, androidx.fragment.app.Fragment] */
    @Override // java.lang.Runnable
    public void run() {
        Iar iar = this.A01;
        ?? r0 = (M4MessageReactionsReactorsFragment) iar.A01;
        String str = iar.A03;
        Long valueOf = Long.valueOf(((1qX) this.A00.value).mResultSet.getLong(0, 0));
        Message message = r0.A0B;
        String str2 = message.A1V;
        ThreadKey threadKey = message.A0V;
        if (str2 == null || threadKey == null || r0.A0G == null) {
            return;
        }
        long A0r = threadKey.A0r();
        1Bn.A0A(147836);
        java.util.Map map = r0.A0a;
        Context context = r0.getContext();
        FbUserSession fbUserSession = r0.A04;
        boolean A01 = ((5lO) r0.A0X.get()).A01(r0.A0B.A0V);
        1BK.A1M(context, fbUserSession);
        map.put(str, new GVv(context, fbUserSession, valueOf, str2, A0r, A01));
        GVv gVv = (GVv) map.get(str);
        if (gVv != null) {
            gVv.A01.observe(r0, new ILT((M4MessageReactionsReactorsFragment) r0, 6));
        }
    }
}
