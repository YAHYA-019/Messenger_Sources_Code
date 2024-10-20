package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.data.viewdata.threadsettings.groupmembers.model.GroupMembersThreadSummary;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import java.util.ArrayList;

/* loaded from: C9Y.class */
public final class C9Y {
    public 1BY A00;
    public final LiveData A01;
    public final LiveData A02;
    public final C00i A03;
    public final C00i A05;
    public final C00i A06;
    public final LiveData A08;
    public final MutableLiveData A09;
    public final C00i A0B;
    public final C00i A0C;
    public final C15h A0D;
    public final C00i A04 = FbInjector.A00;
    public final C00i A07 = 1BV.A01((1BY) null, 82685);
    public final C00i A0A = 1BV.A01((1BY) null, 83059);

    public C9Y(1BO r302, ThreadKey threadKey) {
        1BQ A02 = 1BQ.A02(66360);
        this.A0C = A02;
        this.A03 = 1BV.A01((1BY) null, 82552);
        this.A05 = 1BV.A01((1BY) null, 82380);
        this.A06 = 1BV.A01((1BY) null, 67674);
        this.A0D = DBe.A00(this, 53);
        this.A0B = 1BV.A01((1BY) null, 147572);
        MutableLiveData A0H = 7zL.A0H();
        this.A09 = A0H;
        LiveData switchMap = Transformations.switchMap(A0H, new DBj(this, 0));
        this.A08 = switchMap;
        this.A01 = Transformations.map(switchMap, new DBj(this, 1));
        this.A02 = Transformations.map(switchMap, new DBj(this, 2));
        this.A00 = 7zL.A0Q(r302);
        ((C1x1) A02.get()).A00(A0H, threadKey);
    }

    public GroupMembersThreadSummary A00() {
        LiveData liveData = this.A01;
        if (liveData.getValue() == null || ((BRI) liveData.getValue()).A00 == null) {
            return null;
        }
        return new GroupMembersThreadSummary(((BRI) liveData.getValue()).A00);
    }

    public ThreadKey A01() {
        Object value = this.A09.getValue();
        value.getClass();
        return (ThreadKey) value;
    }

    public ThreadSummary A02() {
        Object value = this.A01.getValue();
        value.getClass();
        ThreadSummary threadSummary = ((BRI) value).A00;
        threadSummary.getClass();
        return threadSummary;
    }

    public ArrayList A03(FbUserSession fbUserSession, GroupMembersThreadSummary groupMembersThreadSummary, java.util.Map map) {
        ArrayList A0s = AnonymousClass001.A0s();
        ThreadSummary threadSummary = groupMembersThreadSummary.A00;
        1F9 r0 = threadSummary.A0g;
        r0.getClass();
        boolean A02 = r0.A02();
        1Du A12 = AbF.A12(threadSummary);
        while (A12.hasNext()) {
            ThreadParticipant A0W = 4YU.A0W(A12);
            D55 A01 = ((CGr) this.A03.get()).A01(fbUserSession, ((C60b) this.A05.get()).A01(threadSummary, C28p.A01(A0W)), A0W, threadSummary, map);
            if (A01 != null && (!A02 || !this.A0D.get().equals(C28p.A01(A0W)))) {
                A0s.add(A01);
            }
        }
        this.A0B.get();
        0RC.A0x(A0s);
        return A0s;
    }

    public ArrayList A04(FbUserSession fbUserSession, GroupMembersThreadSummary groupMembersThreadSummary, java.util.Map map, boolean z, boolean z2) {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        ThreadSummary threadSummary = groupMembersThreadSummary.A00;
        1Du A12 = AbF.A12(threadSummary);
        while (A12.hasNext()) {
            ThreadParticipant A0W = 4YU.A0W(A12);
            UserKey A01 = C28p.A01(A0W);
            C00i c00i = this.A05;
            C1zL A012 = ((C60b) c00i.get()).A01(threadSummary, A01);
            if (z2) {
                c00i.get();
                if (A012 == C1zL.A04) {
                }
            }
            D55 A013 = ((CGr) this.A03.get()).A01(fbUserSession, A012, A0W, threadSummary, map);
            if (A013 != null) {
                boolean z3 = A0W.A0H;
                boolean z4 = A0W.A0I;
                Integer A03 = A0W.A03();
                boolean A1W = AnonymousClass001.A1W(A03, 0S2.A01);
                if ((z3 || z4 || A1W) && A03 != 0S2.A0C) {
                    if (!A0s.contains(A013)) {
                        A0s.add(A013);
                    }
                } else if (A03 != 0S2.A0C && !A0s2.contains(A013)) {
                    A0s2.add(A013);
                }
            }
        }
        C00i c00i2 = this.A0B;
        if (z) {
            c00i2.get();
            0RC.A0x(A0s);
            return A0s;
        }
        c00i2.get();
        0RC.A0x(A0s2);
        return A0s2;
    }
}
