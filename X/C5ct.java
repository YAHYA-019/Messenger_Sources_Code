package X;

import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.5ct, reason: invalid class name */
/* loaded from: 5ct.class */
public final class C5ct {
    public C5cz A00;
    public 2Qy A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public 6BX A05;
    public final 1Br A0G = 1Bu.A00(16428);
    public final C5cv A0J = new C5cv() { // from class: X.5cu
        @Override // X.C5cv
        public void CGE() {
            C5ct c5ct = C5ct.this;
            C5ct.A03(1Fw.A04((1EZ) c5ct.A0G.A00.get()), c5ct);
        }
    };
    public final 1Br A06 = 1Bq.A00(67765);
    public final 1Br A0A = 1Bu.A00(68455);
    public final 1Br A0D = 1Bu.A00(68456);
    public final 1Br A07 = 1Bq.A00(99390);
    public final 1Br A0E = 1Bq.A00(83273);
    public final 1Br A0B = 1Bu.A00(49802);
    public final 1Br A0F = 1Bq.A00(16456);
    public final 1Br A09 = 1Bq.A00(16634);
    public final 1Br A08 = 1Bu.A00(16430);
    public final C5cw A0I = (C5cw) 1Bn.A0A(66919);
    public final C5cx A0H = new C5cx();
    public final 1Br A0C = 1Bu.A00(83277);

    public C5ct() {
        String obj = C04I.A00().toString();
        11T.A0A(obj);
        this.A02 = obj;
        this.A00 = C5cy.A00;
    }

    public static final int A00(List list, long j) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            MontageBucketPreview montageBucketPreview = (MontageBucketPreview) obj;
            if (montageBucketPreview.A09 && montageBucketPreview.A04.A05 >= j) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public static final C5cz A01(FbUserSession fbUserSession, C5ct c5ct, 6BY r303) {
        ImmutableList immutableList = r303.A00.A00;
        11T.A09(immutableList);
        int A00 = A00(immutableList, ((6Ba) c5ct.A0D.A00.get()).A00(fbUserSession));
        return A00 >= 2 ? new 6Bi(A00) : C5j2.A00;
    }

    public static final 6BX A02(C5ct c5ct) {
        if (c5ct.A05 == null) {
            synchronized (c5ct) {
                c5ct.A05 = (6BX) 1Bn.A0A(67970);
            }
        }
        6BX r0 = c5ct.A05;
        if (r0 != null) {
            return r0;
        }
        11T.A0L("montageListFetcher");
        throw 0Q8.createAndThrow();
    }

    public static final void A03(final FbUserSession fbUserSession, final C5ct c5ct) {
        if (c5ct.A04) {
            return;
        }
        ((C5d1) c5ct.A0B.A00.get()).A01(new C5d3() { // from class: X.5d2
            @Override // X.C5d3
            public final void Bys(int i, boolean z, boolean z2) {
                final C5ct c5ct2 = c5ct;
                if (!z2) {
                    if (11T.A0O(c5ct2.A00, C5j2.A00)) {
                        return;
                    }
                    ((Executor) c5ct2.A0F.A00.get()).execute(new Runnable() { // from class: X.3f6
                        public static final String __redex_internal_original_name = "MontageTabBadgeManager$refreshBadge$1$1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C5ct.this.A07("badging_disabled", false);
                        }
                    });
                } else {
                    final FbUserSession fbUserSession2 = fbUserSession;
                    final 85S r0 = new 85S(fbUserSession2, c5ct2);
                    ((1FP) c5ct2.A06.A00.get()).D3D(3Ds.A04, 0S2.A01, new Runnable() { // from class: X.5d9
                        public static final String __redex_internal_original_name = "MontageTabBadgeManager$submitRefreshBadgeTask$1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C5ah c5ah = C5ah.NONE;
                            C5ct c5ct3 = c5ct2;
                            C5ct.A04(C5ct.A01(fbUserSession2, c5ct3, C5ct.A02(c5ct3).D1g(r0, c5ah)), c5ct3, false);
                        }
                    }, "stories_tab_stories_fetch");
                }
            }
        });
    }

    public static final void A04(C5cz c5cz, C5ct c5ct, boolean z) {
        ((C5d1) c5ct.A0B.A00.get()).A01(new 6Bb(c5cz, c5ct, z));
    }

    public final void A05() {
        this.A01 = null;
        ((Handler) this.A08.A00.get()).removeCallbacksAndMessages(null);
        ((C5d0) this.A0A.A00.get()).A00();
        this.A0H.A00.removeCallbacksAndMessages(null);
    }

    public final void A06(FbUserSession fbUserSession, 2Qy r303) {
        11T.A0F(fbUserSession, 0);
        11T.A0F(r303, 1);
        this.A01 = r303;
        ((C5d0) this.A0A.A00.get()).A01(this.A0J);
        A03(fbUserSession, this);
    }

    public final void A07(String str, boolean z) {
        this.A03 = true;
        if (!str.equals(1BJ.A00(1044))) {
            C00i c00i = this.A0D.A00;
            6Ba r0 = (6Ba) c00i.get();
            ((C61z) r0.A00.A00.get()).A05(6Ba.A05, ((C0dp) this.A07.A00.get()).now());
            6Ba r02 = (6Ba) c00i.get();
            C00i c00i2 = r02.A00.A00;
            C61z c61z = (C61z) c00i2.get();
            1G9 r03 = 6Ba.A03;
            FbUserSession A04 = 1Fw.A04((1EZ) r02.A01.A00.get());
            C61z c61z2 = (C61z) c00i2.get();
            11T.A0F(A04, 0);
            c61z.A04(r03, C61z.A00(c61z2).ArU(C61z.A01(A04, r03), 0) + 1);
        }
        ((Handler) this.A08.A00.get()).removeCallbacksAndMessages(null);
        this.A00 = C5j2.A00;
        2Qy r04 = this.A01;
        if (r04 != null) {
            r04.Bo5();
            1UG A00 = 1UD.A00((04J) this.A09.A00.get(), 1ZG.A01, 1BJ.A00(1812));
            if (A00.isSampled() && !z) {
                A00.A7R("msgr_stories_tab_session_id", this.A02);
                A00.A7R("reason", str);
                A00.BZL();
            }
        }
        String obj = C04I.A00().toString();
        11T.A0A(obj);
        this.A02 = obj;
    }
}
