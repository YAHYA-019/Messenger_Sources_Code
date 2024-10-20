package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.messaging.blocking.params.BlockUnblockParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.selfremediation.block.user.BlockUserFragment;
import com.facebook.messaging.wellbeing.selfremediation.block.user.BlockUserPersistingState;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.util.HashSet;

/* loaded from: Ck4.class */
public final class Ck4 implements 7Yx {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public Ck4(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A02 = obj5;
        this.A03 = obj2;
        this.A05 = obj4;
        this.A04 = obj3;
        this.A01 = obj;
    }

    public final void CHY(User user) {
        switch (this.A00) {
            case 0:
                7EN r0 = (7EN) this.A01;
                BlockUnblockParams blockUnblockParams = (BlockUnblockParams) this.A02;
                ThreadSummary threadSummary = (ThreadSummary) this.A03;
                BNT bnt = (BNT) this.A04;
                06Z r02 = (06Z) this.A05;
                if (user != null && 7EN.A02(threadSummary, r0, user)) {
                    7EN.A00(r02, 1Fw.A05(r0.A00), threadSummary, bnt, (BNJ) null, r0, (DHk) null, user);
                    return;
                }
                Bundle A05 = 1BK.A05();
                HashSet A0v = AnonymousClass001.A0v();
                UserKey userKey = blockUnblockParams.A00;
                C1pq.A08("userKey", userKey);
                String str = blockUnblockParams.A02;
                C1pq.A08("userName", str);
                String str2 = blockUnblockParams.A01;
                C1pq.A08("userDisplayOrFullName", str2);
                A05.putParcelable("saved_presenter_state", new BlockUserPersistingState(null, threadSummary, bnt, null, userKey, null, str2, str, C1pq.A07(bnt, "entryPoint", A0v, A0v), true, false, false));
                A05.putParcelable("color_scheme", null);
                2Ov blockUserFragment = new BlockUserFragment();
                blockUserFragment.setArguments(A05);
                blockUserFragment.A0m(r02, "BlockUserFragment");
                return;
            case 1:
                if (user == null) {
                    C6qu c6qu = (C6qu) this.A02;
                    6ML r03 = (6ML) this.A04;
                    Context context = (Context) this.A01;
                    Intent A00 = r03.A00(context, c6qu.BF7());
                    A00.putExtra("extra_thread_view_source_string", 5SW.A1n.toString());
                    0LS.A0A(context, A00);
                    return;
                }
                4iI r04 = (4iI) this.A03;
                UserKey userKey2 = (UserKey) this.A05;
                6ML r05 = (6ML) this.A04;
                Context context2 = (Context) this.A01;
                if (!user.A0C()) {
                    r04.A06(new CmH(context2, user, 1), userKey2);
                    return;
                }
                ThreadKey A01 = r04.A01(7zQ.A0H(user));
                if (A01 != null) {
                    0LS.A0A(context2, r05.A00(context2, A01));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
