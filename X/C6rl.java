package X;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.BaseMountingView;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.xapp.messaging.events.common.lifecycle.OnBeforePause;
import com.facebook.xapp.messaging.events.common.lifecycle.OnInvisible;
import com.facebook.xapp.messaging.events.common.lifecycle.OnPause;
import com.facebook.xapp.messaging.events.common.lifecycle.OnResume;
import com.facebook.xapp.messaging.events.common.lifecycle.OnStart;
import com.facebook.xapp.messaging.events.common.lifecycle.OnStop;
import com.facebook.xapp.messaging.events.common.lifecycle.OnVisible;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadNoLongerVisible;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnResumeEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.threadviewlifecycle.ThreadViewOnResumeStart;
import java.util.Iterator;

/* renamed from: X.6rl, reason: invalid class name */
/* loaded from: 6rl.class */
public final class C6rl implements C1t5 {
    public final /* synthetic */ 2Oe A00;

    public C6rl(2Oe r302) {
        this.A00 = r302;
    }

    @Override // X.C1t5
    public void BzZ() {
        String str;
        2Oe r0 = this.A00;
        r0.A1X(OnBeforePause.A00);
        ((4lI) r0.debugEventLogger$delegate.A00.get()).A00(2Oe.A03(r0), "MsysThreadViewFragment onPause");
        r0.AQN(6Sv.A02);
        C5jb c5jb = r0.hotLikeFetchConfig;
        if (c5jb == null) {
            str = "hotLikeFetchConfig";
        } else {
            C5jd AgW = c5jb.AgW(2Oe.A03(r0));
            C5je c5je = AgW.A04;
            C5jg c5jg = AgW.A03;
            synchronized (c5je) {
                11T.A0F(c5jg, 0);
                if (c5je.A01 == c5jg) {
                    c5je.A01 = null;
                }
            }
            C6rq c6rq = r0.uiStateDataFetchConfig;
            if (c6rq == null) {
                str = "uiStateDataFetchConfig";
            } else {
                c6rq.A00(2Oe.A03(r0)).A01.A00.set(true);
                MessagingPerformanceLogger messagingPerformanceLogger = (MessagingPerformanceLogger) r0.messagingPerformanceLogger$delegate.A00.get();
                String A0u = 2Oe.A03(r0).A0u();
                11T.A0A(A0u);
                messagingPerformanceLogger.A0h(A0u);
                2dU.A01((6Bw) null, new PRELoggingEvent(2Oe.A03(r0).A0u().hashCode()));
                r0.A1X(OnPause.A00);
                ((5YZ) 1Bi.A03(49777)).A03();
                C6s5 c6s5 = r0.threadViewCreator;
                if (c6s5 != null) {
                    Iterator it = c6s5.A0c.iterator();
                    while (it.hasNext()) {
                        ((BaseMountingView) it.next()).A0r(false, false);
                    }
                    r0.A1X(new OnThreadNoLongerVisible(2Oe.A03(r0)));
                    r0.A1X(OnInvisible.A00);
                    2SX r02 = (2SX) r0.surfaceTTRCFragmentLifecycleListener$delegate.A00.get();
                    1Va r03 = (1Va) r02.A01.getValue();
                    String str2 = r02.A00;
                    11T.A0F(str2, 1);
                    r03.CZm(new com.facebook.xapp.messaging.pre.event.PRELoggingEvent(0Pz.A0W(str2, "/fragment/invisible")));
                    r0.AQN(7GU.A02);
                    r0.A1X(OnStop.A00);
                    C6s5 c6s52 = r0.threadViewCreator;
                    if (c6s52 != null) {
                        c6s52.A06();
                        Runnable runnable = r0.logBackGroundedEventTask;
                        if (runnable != null) {
                            r0.handler.removeCallbacks(runnable);
                            r0.logBackGroundedEventTask = null;
                            return;
                        }
                        return;
                    }
                }
                str = "threadViewCreator";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.C1t5
    public void Bzd() {
        String str;
        View view;
        2Oe r0 = this.A00;
        if (!r0.isThreadOpen) {
            2Oe.A08(r0);
        }
        r0.A1X(OnVisible.A00);
        ((4lI) r0.debugEventLogger$delegate.A00.get()).A00(2Oe.A03(r0), "MsysThreadViewFragment onFragmentVisible");
        2SX r02 = (2SX) r0.surfaceTTRCFragmentLifecycleListener$delegate.A00.get();
        1Va r03 = (1Va) r02.A01.getValue();
        String str2 = r02.A00;
        11T.A0F(str2, 1);
        r03.CZm(new com.facebook.xapp.messaging.pre.event.PRELoggingEvent(0Pz.A0W(str2, "/fragment/visible")));
        2dU.A01((6Bw) null, new PRELoggingEvent(2Oe.A03(r0).A0u().hashCode()));
        2dU.A01((6Bw) null, new PRELoggingEvent(2Oe.A03(r0).A0u().hashCode()));
        r0.A1X(new OnThreadVisible(2Oe.A03(r0)));
        if (2Oe.A03(r0).A0y() && ((1qI) r0.aiBotGating$delegate.A00.get()).A09()) {
            C9fa c9fa = (C9fa) r0.aiBotEmbodimentPerfLogger$delegate.A00.get();
            if (C9fa.A00(c9fa).isMarkerOn(814286340)) {
                C9fa.A00(c9fa).markerEnd(814286340, (short) 4);
            }
            String obj = C04I.A00().toString();
            11T.A0A(obj);
            c9fa.A00 = obj;
            C9fa.A00(c9fa).markerStart(814286340);
            C9fa.A00(c9fa).markerPoint(814286340, c9fa.A00, "thread_visible");
            c9fa.A01 = false;
        }
        r0.A1X(OnStart.A00);
        ((4lI) r0.debugEventLogger$delegate.A00.get()).A00(2Oe.A03(r0), "MsysThreadViewFragment onResume");
        r0.AQN(6Sg.A02);
        r0.configuration = new Configuration(r0.requireContext().getResources().getConfiguration());
        2dU.A01((6Bw) null, new ThreadViewOnResumeStart(2Oe.A03(r0), 2Oe.A03(r0).A0u().hashCode()));
        C5jb c5jb = r0.hotLikeFetchConfig;
        if (c5jb == null) {
            str = "hotLikeFetchConfig";
        } else {
            C5jd AgW = c5jb.AgW(2Oe.A03(r0));
            C5je c5je = AgW.A04;
            C5jg c5jg = AgW.A03;
            synchronized (c5je) {
                c5je.A01 = c5jg;
            }
            if (2Oe.A03(r0).A0y() && ((1qI) r0.aiBotGating$delegate.A00.get()).A09()) {
                boolean A0D = ((1qK) r0.aiBotPrefs$delegate.A00.get()).A0D(String.valueOf(2Oe.A03(r0).A0s()));
                2S3 r04 = r0.threadViewSurface;
                r0.requireContext();
                11T.A0F(r04, 1);
                ((C9kz) r04.A00(67801)).A02(A0D);
            }
            str = "threadViewCreator";
            if (r0.isHostedInBottomSheet && !r0.BTe()) {
                C6s5 c6s5 = r0.threadViewCreator;
                if (c6s5 != null) {
                    C7W5 c7w5 = c6s5.A0F;
                    if (c7w5 != null && c7w5.A01 == 0S2.A01 && (view = c6s5.A01) != null) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        11T.A0I(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        layoutParams.height = 0;
                        view.setLayoutParams(layoutParams);
                        C9cp c9cp = c6s5.A0E;
                        if (c9cp != null) {
                            c9cp.A03();
                        }
                    }
                }
            }
            C6rq c6rq = r0.uiStateDataFetchConfig;
            if (c6rq == null) {
                str = "uiStateDataFetchConfig";
            } else {
                c6rq.A00(2Oe.A03(r0)).A01.A00.set(false);
                r0.A1X(OnResume.A00);
                2dU.A01((6Bw) null, new ThreadViewOnResumeEnd(2Oe.A03(r0), 2Oe.A03(r0).A0u().hashCode()));
                C6s5 c6s52 = r0.threadViewCreator;
                if (c6s52 != null) {
                    Iterator it = c6s52.A0c.iterator();
                    while (it.hasNext()) {
                        ((BaseMountingView) it.next()).A0r(true, false);
                    }
                    return;
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
