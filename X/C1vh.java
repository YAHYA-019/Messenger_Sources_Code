package X;

import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableSet;
import java.util.EnumSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.1vh, reason: invalid class name */
/* loaded from: 1vh.class */
public final class C1vh {
    public boolean A00;
    public final C1vj A01;
    public final C1vj A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05 = new 1BV(16466);
    public final C00i A06;
    public final ConcurrentHashMap A07;
    public final C1vi A08;
    public final C00i A09;
    public final C00i A0A;

    public C1vh() {
        1BV r0 = new 1BV(17154);
        this.A0A = r0;
        this.A03 = new 1BQ(16855);
        1BQ r02 = new 1BQ(16857);
        this.A09 = r02;
        this.A04 = new 1BQ(16871);
        this.A06 = new 1BV(131194);
        this.A07 = new ConcurrentHashMap();
        C1vi c1vi = new C1vi(this);
        this.A08 = c1vi;
        this.A02 = ((C2xd) r0.get()).A01(true);
        this.A01 = ((C2xd) r0.get()).A01(false);
        ((C1vv) r02.get()).A00 = c1vi;
        2yD r03 = (2yD) 1Bi.A03(16385);
        2yD r04 = (2yD) 1Bi.A03(16387);
        String BCy = r03.BCy(36876438879666898L);
        if (BCy != null) {
            String trim = BCy.trim();
            if (!TextUtils.isEmpty(trim)) {
                ImmutableSet A08 = ImmutableSet.A08(trim.split(AbstractC00603o4.A00(ActionId.TIMEOUT)));
                C1vo.A00 = A08;
                0fH.A0g(1BK.A0k(A08), "KillSwitchJobConstraint", "disables jobs %d");
                this.A00 = r04.AZk(72339803456145671L);
                0fH.A0g(BCy, "JobOrchestrator", "disabledJobs = [%s]");
            }
        }
        0fH.A0j("KillSwitchJobConstraint", "No jobs to disable");
        this.A00 = r04.AZk(72339803456145671L);
        0fH.A0g(BCy, "JobOrchestrator", "disabledJobs = [%s]");
    }

    public static 1wV A00(final C1vh c1vh, final 1wM r302, boolean z) {
        final 1wV r0 = new 1wV(r302);
        r0.addListener(new AbstractRunnableC00191ad() { // from class: X.1wW
            public static final String __redex_internal_original_name = "JobOrchestratorImpl$5";

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("JobOrchestrator", "JobCallbackMgmtJob");
            }

            @Override // java.lang.Runnable
            public void run() {
                C1vh c1vh2;
                Integer valueOf;
                try {
                    try {
                        1Kd.A0C(r0);
                        c1vh2 = c1vh;
                        int i = r302.A00;
                        valueOf = Integer.valueOf(i);
                        0fH.A0g(valueOf, "JobOrchestrator", "onJobCompleted jobId[%s]");
                        c1vh2.A04.get();
                        ((C1vt) c1vh2.A03.get()).A00(i);
                    } catch (CancellationException unused) {
                        c1vh2 = c1vh;
                        1wN r02 = r302;
                        int i2 = r02.A00;
                        valueOf = Integer.valueOf(i2);
                        0fH.A0g(valueOf, "JobOrchestrator", "onJobCanceled jobId[%s]");
                        C1vt c1vt = (C1vt) c1vh2.A03.get();
                        if (r02.A04.contains(C1w2.A0F)) {
                            c1vt.A00(i2);
                        }
                        if (r02.A01 != null) {
                            1wJ r03 = new 1wJ();
                            r03.A03 = StringFormatUtil.formatStrLocaleSafe(0Pz.A0d("Cancellation Callback for job[", "]", i2), new Object[0]);
                            C1w2 c1w2 = C1w2.A0B;
                            EnumSet enumSet = r03.A04;
                            if (enumSet == null) {
                                enumSet = EnumSet.noneOf(C1w2.class);
                                r03.A04 = enumSet;
                            }
                            enumSet.add(c1w2);
                            ((1wH) r03).A00 = new 5F9(r02, c1vh2);
                            C1vh.A00(c1vh2, r03.A01(), true);
                        }
                    }
                } catch (Error | RuntimeException | ExecutionException e) {
                    c1vh2 = c1vh;
                    1wN r04 = r302;
                    int i3 = r04.A00;
                    valueOf = Integer.valueOf(i3);
                    0fH.A0y("JobOrchestrator", "onJobFailed jobId[%s] throwable[%s]", e, new Object[]{valueOf, e.getMessage()});
                    C1vt c1vt2 = (C1vt) c1vh2.A03.get();
                    if (r04.A04.contains(C1w2.A0F)) {
                        c1vt2.A00(i3);
                    }
                }
                if (c1vh2.A00) {
                    c1vh2.A07.remove(valueOf);
                }
            }
        }, (Executor) c1vh.A05.get());
        Integer valueOf = Integer.valueOf(((1wN) r302).A00);
        0fH.A0g(valueOf, "JobOrchestrator", "onJobAdded jobId[%s]");
        c1vh.A04.get();
        ((C1vt) c1vh.A03.get()).A03.remove(valueOf);
        EnumSet enumSet = ((1wN) r302).A04;
        C1vj c1vj = (enumSet == null || !enumSet.contains(C1w2.A0B)) ? c1vh.A01 : c1vh.A02;
        C1vl c1vl = c1vj.A04;
        synchronized (r0) {
            r0.A01 = c1vl;
        }
        C00i c00i = c1vj.A07;
        java.util.Map map = ((C1wa) c00i.get()).A02;
        if (map.get(valueOf) == null) {
            map.put(valueOf, new Object());
        }
        C1wa c1wa = (C1wa) c00i.get();
        C1wc c1wc = (C1wc) c1wa.A02.get(valueOf);
        if (c1wc != null) {
            c1wc.A01 = ((C0dr) c1wa.A00.get()).now();
        }
        c1vj.A02.addLast(new C1wd(r0, r302));
        0fH.A0a(valueOf, ((1wN) r302).A03, enumSet, c1vj.A00, "Job[%d] added.\t\tname[%s] hints[%s]");
        if (z) {
            c1vj.A01();
        }
        c1vh.A07.put(valueOf, r0);
        return r0;
    }
}
