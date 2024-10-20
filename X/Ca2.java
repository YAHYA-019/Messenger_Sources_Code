package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.Member;
import com.facebook.messaging.groups.plugins.core.threadsettings.memberssurface.GroupMembersSurface;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: Ca2.class */
public final class Ca2 implements Observer {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Ca2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A04 = obj4;
        this.A03 = obj3;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        switch (this.A00) {
            case 0:
                ThreadSummary threadSummary = 7zU.A0N(obj).A00;
                if (threadSummary != null) {
                    FbUserSession fbUserSession = (FbUserSession) this.A01;
                    ((C72) 7zO.A0p(this.A03)).A00((06Z) this.A02, fbUserSession, (ThreadKey) this.A04, threadSummary, C5yl.A0L);
                    return;
                }
                return;
            case 1:
                ((0CL) this.A03).element = obj;
                java.util.Map map = (java.util.Map) this.A02;
                ((LiveData) this.A04).setValue(((Function2) this.A01).invoke(obj, 04R.A0D(map)));
                return;
            case 2:
                BM1 bm1 = (BM1) 7zN.A0r(BM1.A00, AnonymousClass001.A03(obj));
                if (bm1 == null) {
                    bm1 = BM1.A03;
                }
                int ordinal = bm1.ordinal();
                if (ordinal == 1) {
                    CfG cfG = ((C0J) this.A04).A00;
                    if (cfG != null) {
                        cfG.D2v();
                    }
                    ((6KV) this.A03).A05(-1);
                    Bvd bvd = (Bvd) 7zO.A0p(this.A02);
                    Observer observer = bvd.A00;
                    if (observer != null) {
                        bvd.A01.removeObserver(observer);
                    }
                    ((DGh) this.A01).BYD();
                    return;
                }
                if (ordinal == 2) {
                    CfG cfG2 = ((C0J) this.A04).A00;
                    if (cfG2 != null) {
                        cfG2.D2v();
                    }
                    ((6KV) this.A03).A05(-1);
                    Bvd bvd2 = (Bvd) 7zO.A0p(this.A02);
                    Observer observer2 = bvd2.A00;
                    if (observer2 != null) {
                        bvd2.A01.removeObserver(observer2);
                    }
                    ((DGh) this.A01).BYC();
                    return;
                }
                return;
            case 3:
                ThreadSummary threadSummary2 = 7zU.A0N(obj).A00;
                if (threadSummary2 != null) {
                    GroupMembersSurface groupMembersSurface = (GroupMembersSurface) this.A04;
                    User user = (User) this.A03;
                    Fragment fragment = (Fragment) this.A01;
                    ((7EN) 1Br.A0B(groupMembersSurface.A00)).A06(fragment.getParentFragmentManager(), threadSummary2, BNT.A0b, (DGC) null, (MigColorScheme) null, (C1ph) null, user);
                }
                AbM.A1E(this, this.A02);
                return;
            default:
                BlC blC = (BlC) obj;
                11T.A0F(blC, 0);
                ImmutableList immutableList = blC.A00;
                ImmutableList.Builder builder = ImmutableList.builder();
                C00i c00i = (C00i) this.A03;
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    Member member = (Member) it.next();
                    c00i.get();
                    builder.add(CAR.A00(member, 36));
                }
                ((DH5) this.A04).CQK(1Fj.A01(builder));
                int intValue = blC.A01.intValue();
                if (intValue == 1) {
                    ((AfT) this.A02).A02();
                    return;
                } else {
                    if (intValue == 2 || intValue == 0) {
                        ((LiveData) this.A02).removeObservers((LifecycleOwner) this.A01);
                        return;
                    }
                    return;
                }
        }
    }
}
