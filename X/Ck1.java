package X;

import androidx.lifecycle.Lifecycle;
import com.facebook.messaging.customthreads.threadsettings.nicknames.SetNicknameLiveDialogFragment;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: Ck1.class */
public final class Ck1 implements 7Yx {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ AnonymousClass242 A01;
    public final /* synthetic */ C1527Akg A02;
    public final /* synthetic */ AnonymousClass472 A03;
    public final /* synthetic */ ThreadSummary A04;

    public Ck1(06Z r302, AnonymousClass242 anonymousClass242, C1527Akg c1527Akg, AnonymousClass472 anonymousClass472, ThreadSummary threadSummary) {
        this.A02 = c1527Akg;
        this.A04 = threadSummary;
        this.A00 = r302;
        this.A01 = anonymousClass242;
        this.A03 = anonymousClass472;
    }

    public void CHY(User user) {
        ThreadParticipant A08;
        if (user != null) {
            ThreadSummary threadSummary = this.A04;
            if (!threadSummary.A0n.A18() || AbF.A00(threadSummary) != 2 || (A08 = this.A01.A08(threadSummary)) == null) {
                C1527Akg c1527Akg = this.A02;
                SetNicknameLiveDialogFragment A05 = SetNicknameLiveDialogFragment.A05(threadSummary, user, null);
                c1527Akg.A02 = A05;
                A05.A0m(this.A00, "set_nickname");
                return;
            }
            AnonymousClass474 A00 = this.A03.A00(A08.A05.A0F);
            Lifecycle lifecycle = this.A02.getLifecycle();
            11T.A0F(lifecycle, 0);
            A00.A00 = lifecycle;
            A00.A02(new Cjw(this, user, 1));
        }
    }
}
