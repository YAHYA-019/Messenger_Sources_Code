package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.customthreads.name.dialog.ThreadNameSettingDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.BitSet;

/* loaded from: Cjm.class */
public final class Cjm implements C6hg {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ 06Z A02;
    public final /* synthetic */ FbUserSession A03;
    public final /* synthetic */ ThreadKey A04;

    public Cjm(Context context, View view, 06Z r304, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A00 = context;
        this.A03 = fbUserSession;
        this.A04 = threadKey;
        this.A02 = r304;
        this.A01 = view;
    }

    @Override // X.C6hg
    public final void CHU(C6hk c6hk) {
        if (c6hk != null) {
            5Hr r0 = (5Hr) 1Bn.A0A(67674);
            Context context = this.A00;
            FbUserSession fbUserSession = this.A03;
            ThreadKey threadKey = this.A04;
            ThreadSummary threadSummary = c6hk.A01;
            Capabilities A01 = r0.A01(context, fbUserSession, threadKey, threadSummary, (User) c6hk.A00.A00().get(AbJ.A0o(threadKey)), (2Sh) null);
            06Z r02 = this.A02;
            DJX djx = DJX.A00;
            11T.A0B(djx);
            11T.A0F(A01, 6);
            1BQ A0W = AbH.A0W();
            11T.A0F(context, 1);
            1BV A0R = 7zL.A0R(context, 82377);
            1BV A00 = 1BV.A00(82057);
            if (((C5q) A0R.get()).A00(threadSummary)) {
                View view = this.A01;
                djx.Bbb(BNV.A1s, "group_image");
                BitSet bitSet = A01.A00;
                if (bitSet.get(60) && ((C5q) A0R.get()).A00(threadSummary)) {
                    Long l = null;
                    if (bitSet.get(81) && !AbK.A0k(A0W).AZk(36315340060369658L) && ThreadKey.A0a(AbJ.A0S(threadSummary))) {
                        int i = AlR.A0v;
                        1pI A002 = 1vD.A00(view);
                        ThreadKey threadKey2 = threadSummary.A0l;
                        if (threadKey2 != null) {
                            l = 4YU.A0l(threadKey2);
                        }
                        CPA.A02(A002, threadSummary.A0n, l, "thread_details", "chat_creation_sheet");
                        return;
                    }
                    if (2oI.A03(threadSummary)) {
                        int i2 = AlR.A0v;
                        CPA.A03(1vD.A00(view), threadSummary.A0n, (Long) null, "thread_view", "thread_settings");
                        return;
                    }
                    1F9 r03 = threadSummary.A0g;
                    if (r03 == null || r03 == 1F9.A0B) {
                        return;
                    }
                    A00.get();
                    ThreadNameSettingDialogFragment.A05(r02, CallerContext.A0C("DefaultContextRowActionUiImpl", "messenger_thread_settings_set_group_name"), threadSummary);
                }
            }
        }
    }
}
