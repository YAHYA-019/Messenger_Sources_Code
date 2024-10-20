package X;

import com.facebook.messaging.mentorship.plugins.core.threadsettingssecondarydata.ThreadSettingsMentorshipInfoData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.MentorshipThreadData;
import com.facebook.messaging.model.threads.ThreadMetadata;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.user.model.User;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;

/* renamed from: X.Anw, reason: case insensitive filesystem */
/* loaded from: Anw.class */
public final class C1618Anw extends 2UY {
    public final int A00;
    public final Object A01;

    public C1618Anw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                AlA.A03((AlA) this.A01);
                return;
            case 1:
            case 6:
                return;
            case 2:
                ((AlM) this.A01).A0B.A01((short) 3);
                return;
            case 3:
            case 4:
            default:
                super.C47(obj, obj2);
                return;
            case 5:
                CNW cnw = ((AlX) this.A01).A07;
                if (cnw != null) {
                    cnw.A02();
                    return;
                }
                return;
        }
    }

    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                2TS r0 = (2TS) obj2;
                if (r0 != 2TS.A0O) {
                    1Du it = r0.A09.iterator();
                    while (it.hasNext()) {
                        User A0t = AbG.A0t(it);
                        ((AlA) this.A01).A0A.put(A0t.A13, A0t);
                    }
                }
                AlA.A03((AlA) this.A01);
                return;
            case 1:
            case 3:
            default:
                super.C4X(obj, obj2);
                return;
            case 2:
                ((AlM) this.A01).A0B.A01((short) 2);
                return;
            case 4:
                Ben ben = (Ben) obj2;
                11T.A0F(ben, 1);
                ImmutableList immutableList = ben.A00;
                if (immutableList.isEmpty()) {
                    return;
                }
                C1x c1x = ((ThreadSettingsMentorshipInfoData) this.A01).A02;
                MentorshipThreadData mentorshipThreadData = ((ThreadMetadata) immutableList.get(0)).A02;
                c1x.A00(new Bf3(mentorshipThreadData != null ? mentorshipThreadData.A00 : null), null);
                return;
            case 5:
                ((AlX) this.A01).A00 = ((CCC) obj2).A00.size();
                return;
        }
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
        switch (this.A00) {
            case 1:
                C0j c0j = (C0j) obj2;
                11T.A0F(c0j, 1);
                ((CQ6) this.A01).A02 = c0j.A00();
                return;
            case 3:
                ((AlM) this.A01).A0F = ((C0j) obj2).A00();
                return;
            case 6:
                C0j c0j2 = (C0j) obj2;
                ImmutableList immutableList = c0j2.A00;
                if (immutableList != null) {
                    ((B7D) this.A01).A0D = !immutableList.isEmpty() ? (ThreadSummary) 1BK.A0r(immutableList) : null;
                }
                B7D b7d = (B7D) this.A01;
                ThreadKey A00 = c0j2.A00();
                b7d.A0C = A00;
                if (!b7d.A0X || A00 == null) {
                    return;
                }
                b7d.A1d(A00, true);
                return;
            case 7:
                C0j c0j3 = (C0j) obj2;
                C1557Alb c1557Alb = (C1557Alb) this.A01;
                ImmutableSet immutableSet = ((CED) obj).A01;
                NavigationTrigger navigationTrigger = C1557Alb.A1B;
                HashSet A0v = AnonymousClass001.A0v();
                1Du it = c1557Alb.A0Q.iterator();
                while (it.hasNext()) {
                    A0v.add(AbG.A0t(it).A0k);
                }
                A0v.add(C1557Alb.A03(c1557Alb).A0k);
                if (Objects.equal(immutableSet, A0v)) {
                    ImmutableList immutableList2 = c0j3.A00;
                    boolean z = false;
                    if (!immutableList2.isEmpty()) {
                        ThreadSummary threadSummary = (ThreadSummary) immutableList2.get(0);
                        if (threadSummary.A0n.A0w() && threadSummary.A2g) {
                            z = true;
                        }
                    }
                    c1557Alb.A0Z = z;
                    c1557Alb.A0F = !immutableList2.isEmpty() ? (ThreadSummary) 1BK.A0r(immutableList2) : null;
                    C1557Alb.A0B(c0j3.A00(), c1557Alb);
                    return;
                }
                return;
            default:
                super.C9D(obj, obj2);
                return;
        }
    }
}
