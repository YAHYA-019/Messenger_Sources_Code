package X;

import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messenger.orca.ChildResultSetUtils;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.CQLResultSetImpl;
import com.facebook.msys.mci.JQLResultSet;

/* renamed from: X.5k8, reason: invalid class name */
/* loaded from: 5k8.class */
public final class C5k8 {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 5kA A0A;
    public final 5kA A0B;
    public final 5kA A0C;
    public final 5kA A0D;
    public final 5kA A0E;
    public final 5kA A0F;
    public final 5kA A0G;
    public final 1BP A0H;
    public final 1Br A0I;

    public C5k8(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A04 = 1Bu.A03(r0, 66997);
        this.A0I = 1Bq.A00(16385);
        this.A01 = 1Bq.A00(16387);
        this.A0H = FbInjector.A00;
        this.A09 = 1Bu.A03(r0, 83790);
        this.A02 = 1Bq.A00(99939);
        this.A05 = 1Bq.A00(66347);
        this.A03 = 1Bu.A03(r0, 147849);
        this.A07 = 1Bu.A03(r0, 67731);
        this.A06 = 1Bq.A00(67773);
        this.A08 = 1Bq.A00(66642);
        this.A0B = new 5kA() { // from class: X.5k9
            public /* bridge */ /* synthetic */ Object AUa(Object obj, int i) {
                1qX r02 = (4lD) obj;
                11T.A0F(r02, 0);
                if (!(r02 instanceof C5u3)) {
                    return ChildResultSetUtils.getOrcaTempMessageAttachmentListFromOrcaTempMessageList((C07924lC) r02, i);
                }
                1qX r03 = r02;
                com.facebook.messenger.msg_pinned_messages.ChildResultSetUtils childResultSetUtils = com.facebook.messenger.msg_pinned_messages.ChildResultSetUtils.sInstance;
                CQLResultSet cQLResultSet = r03.mResultSet;
                CQLResultSet A02 = cQLResultSet instanceof JQLResultSet ? ((JQLResultSet) cQLResultSet).A02("attachments", i) : com.facebook.messenger.msg_pinned_messages.ChildResultSetUtils.getOrcaTempMessageAttachmentListFromOrcaPinnedMessageListNative((CQLResultSetImpl) cQLResultSet, i);
                if (A02 != null) {
                    return new 1qX(A02);
                }
                return null;
            }
        };
        this.A0A = 5kB.A00;
        this.A0G = 5kC.A00;
        this.A0E = 5kD.A00;
        this.A0F = 5kE.A00;
        this.A0D = 5kF.A00;
        this.A0C = 5kG.A00;
    }

    public static final 1CO A00(C5k8 c5k8) {
        return (1CO) c5k8.A0I.A00.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List] */
    public static final C5lk[] A01(ThreadKey threadKey, C5k8 c5k8) {
        C0ty c0ty;
        C5lk[] c5lkArr;
        C5lk c5lk = null;
        if (threadKey.A0z()) {
            C5lj c5lj = C5lj.A00;
            if (!A00(c5k8).AZk(36321567762760200L)) {
                c5lj = null;
            }
            C5ll c5ll = C5ll.A01;
            C5t0 c5t0 = C5t0.A00;
            C5lo c5lo = C5lo.A00;
            C5t1 c5t1 = C5t1.A00;
            C5t2 c5t2 = C5t2.A00;
            C5t3 c5t3 = C5t3.A00;
            C5t4 c5t4 = C5t4.A00;
            C5t5 c5t5 = C5t5.A00;
            C5t6 c5t6 = C5t6.A00;
            C5t7 c5t7 = C5t7.A00;
            C5t8 c5t8 = C5t8.A00;
            final C5st c5st = (C5st) c5k8.A04.A00.get();
            C5lk c5lk2 = new C5lk(c5st) { // from class: X.5t9
                public final C5st A00;

                {
                    11T.A0F(c5st, 1);
                    this.A00 = c5st;
                }

                @Override // X.C5lk
                public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
                    11T.A0F(c5to, 3);
                    return 5uF.A01.A00(this.A00, c5pu, c5to);
                }
            };
            if (((2yD) ((C5sv) c5k8.A09.A00.get()).A00.A00.get()).AZk(2342159448785102932L)) {
                c5lk = c5lk2;
            }
            c5lkArr = new C5lk[]{c5lj, c5ll, c5t0, c5lo, c5t1, c5t2, c5t3, c5t4, c5t5, c5t6, c5t7, c5t8, c5lk, 5tA.A00, C5lt.A00};
        } else if (threadKey.A1M()) {
            C5lj c5lj2 = C5lj.A00;
            if (A00(c5k8).AZk(36321567762760200L)) {
                c5lk = c5lj2;
            }
            c5lkArr = new C5lk[]{c5lk, C5ll.A01, C5lm.A01, C5ln.A00, C5lo.A00, C5lp.A00, C5lq.A00, C5lr.A00, C5ls.A00, C5lt.A00};
        } else if (threadKey.A0y()) {
            c5lkArr = new C5lk[]{C5lo.A00, C5lp.A00, C5lr.A00};
        } else {
            if (!threadKey.A16()) {
                c0ty = C0ty.A00;
                return (C5lk[]) c0ty.toArray(new C5lk[0]);
            }
            c5lkArr = new C5lk[]{C5ll.A01, C5lo.A00, C5t2.A00, C5t3.A00, C5t4.A00};
        }
        11T.A0F(c5lkArr, 0);
        c0ty = 02L.A08(c5lkArr);
        return (C5lk[]) c0ty.toArray(new C5lk[0]);
    }
}
