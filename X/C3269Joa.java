package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DexErrorRecoveryInfo;
import com.facebook.common.dextricks.verifier.Verifier;
import com.facebook.common.jit.JitUtilsNative;
import com.facebook.common.jit.common.JitDisabledChecker;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Joa, reason: case insensitive filesystem */
/* loaded from: Joa.class */
public final class C3269Joa extends AbstractRunnableC00191ad {
    public static final String __redex_internal_original_name = "FrameRateLogger$ScrollPerfRunnable";
    public final /* synthetic */ LVe A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3269Joa(LVe lVe) {
        super(C3269Joa.class, "ScrollPerfRunnable");
        this.A00 = lVe;
    }

    private JSONObject A00(Keh keh, java.util.Map map) {
        JSONObject A12 = AnonymousClass001.A12();
        double d = keh.A00;
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            double d2 = ((Keh) DKC.A12(A1B.next(), map)).A00;
            if (d2 > 0.0d) {
                A12.put("gc", d2);
                d -= d2;
            }
        }
        if (d > 0.0d) {
            A12.put("unknown", d);
        }
        return A12;
    }

    private JSONObject A01(java.util.Map map) {
        JSONObject A12 = AnonymousClass001.A12();
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            double d = ((Keh) DKC.A12(A1B.next(), map)).A00;
            if (d > 0.0d) {
                A12.put("gc", d);
            }
        }
        return A12;
    }

    public static void A02(Kti kti, String str) {
        String A0W = 0Pz.A0W(str, "sum");
        Kti.A00(kti);
        kti.A03.annotate(A0W, 0L);
        String A0W2 = 0Pz.A0W(str, "sum_squared");
        Kti.A00(kti);
        kti.A03.annotate(A0W2, 0L);
        String A0W3 = 0Pz.A0W(str, "max");
        Kti.A00(kti);
        kti.A03.annotate(A0W3, 0L);
        String A0W4 = 0Pz.A0W(str, "count");
        Kti.A00(kti);
        kti.A03.annotate(A0W4, 0L);
    }

    public static void A03(Kti kti, String str) {
        long A00 = 0WL.A00(str, Long.MIN_VALUE);
        kti.A03(str, A00 != Long.MIN_VALUE ? Long.toString(A00) : "");
    }

    public static void A04(StringBuilder sb, String str) {
        if (sb.length() != 0) {
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        sb.append(str);
    }

    public static void A05(java.util.Map map) {
        Iterator A1A = 1BK.A1A(map);
        while (A1A.hasNext()) {
            ((Keh) A1A.next()).A00 = 0;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List list;
        boolean z;
        boolean z2;
        C6r6 c6r6;
        LVe lVe = this.A00;
        Kti kti = lVe.A0G;
        kti.A01();
        C00i c00i = lVe.A0N;
        long A00 = ((4ZC) c00i.get()).A00();
        String A002 = 4YT.A00(1535);
        Kti.A00(kti);
        kti.A03.annotate(A002, A00);
        Km9 km9 = lVe.A0I;
        Keh keh = km9.A05;
        double d = keh.A00;
        String A003 = 4YT.A00(500);
        kti.A02(A003, d);
        Keh keh2 = km9.A04;
        double A004 = LVe.A00(keh2.A00);
        String A005 = 4YT.A00(501);
        kti.A02(A005, A004);
        Keh keh3 = km9.A08;
        int i = keh3.A00;
        String A006 = 4YT.A00(1542);
        Kti.A00(kti);
        kti.A03.annotate(A006, i);
        Kti.A00(kti);
        kti.A03.markerEditingCompleted();
        kti.A03 = null;
        kti.A06 = false;
        long j = lVe.A01;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = kti.A02;
        int i2 = kti.A00;
        int i3 = kti.A01;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        lightweightQuickPerformanceLogger.markerEnd(i2, i3, (short) 2, j, timeUnit);
        Kti kti2 = lVe.A0F;
        kti2.A01();
        int i4 = keh3.A00;
        Kti.A00(kti2);
        kti2.A03.annotate(A006, i4);
        Km9 km92 = lVe.A0J;
        Keh keh4 = km92.A08;
        int i5 = keh4.A00;
        String A007 = 4YT.A00(1543);
        Kti.A00(kti2);
        kti2.A03.annotate(A007, i5);
        long A008 = ((4ZC) c00i.get()).A00();
        Kti.A00(kti2);
        kti2.A03.annotate(A002, A008);
        long A07 = ((1Od) lVe.A0L.get()).A07();
        Kti.A00(kti2);
        kti2.A03.annotate("time_since_resume", A07);
        Keh keh5 = km9.A07;
        kti2.A02("total_frames", keh5.A00);
        Keh keh6 = km92.A07;
        kti2.A02("total_frames_uncapped", keh6.A00);
        Kti.A00(kti2);
        kti2.A03.annotate("scroll_action", 0);
        Keh keh7 = km9.A06;
        kti2.A02("total_skipped_frames", keh7.A00);
        kti2.A02(A003, keh.A00);
        kti2.A02(A005, LVe.A00(keh2.A00));
        Keh keh8 = km92.A06;
        kti2.A02(4YT.A00(1541), keh8.A00);
        Keh keh9 = km92.A05;
        kti2.A02("1_frame_drop_uncapped", keh9.A00);
        Keh keh10 = km92.A04;
        kti2.A02(AnonymousClass000.A00(ActionId.APP_DID_ENTER_BACKGROUND), LVe.A00(keh10.A00));
        A02(kti2, "large_frame_drop_input_time_");
        A02(kti2, "large_frame_drop_animation_time_");
        A02(kti2, "large_frame_drop_traversal_time_");
        A02(kti2, "large_frame_drop_commit_to_input_time_");
        AnonymousClass540 anonymousClass540 = lVe.A0K;
        AnonymousClass540.A00(anonymousClass540);
        int floor = (int) Math.floor(anonymousClass540.A00);
        String A009 = 4YT.A00(331);
        Kti.A00(kti2);
        kti2.A03.annotate(A009, floor);
        AnonymousClass540.A00(anonymousClass540);
        int floor2 = (int) Math.floor(anonymousClass540.A01);
        Kti.A00(kti2);
        kti2.A03.annotate("sanitized_display_refresh_rate", floor2);
        AnonymousClass540.A00(anonymousClass540);
        int floor3 = (int) Math.floor(anonymousClass540.A02);
        Kti.A00(kti2);
        kti2.A03.annotate("approximate_vsync_rate", floor3);
        try {
            JSONObject A0010 = A00(keh7, lVe.A07);
            JSONObject A0011 = A00(keh2, lVe.A06);
            kti2.A03("frame_drop_by_autoblame", A0010.toString());
            kti2.A03("large_frame_drop_by_autoblame", A0011.toString());
            kti2.A03("frame_drop_by_autoblame_overlapped", A01(lVe.A08).toString());
            kti2.A03("large_frame_drop_by_autoblame_overlapped", A01(lVe.A05).toString());
            kti2.A03("total_frames_with_marker", A01(lVe.A09).toString());
        } catch (JSONException unused) {
        }
        A03(kti2, "ro.hwui.texture_cache_size");
        kti2.A03("ro.hwui.texture_cache_flushrate", 0WL.A02("ro.hwui.texture_cache_flushrate"));
        A03(kti2, "ro.hwui.layer_cache_size");
        A03(kti2, "ro.hwui.r_buffer_cache_size");
        A03(kti2, "ro.hwui.gradient_cache_size");
        A03(kti2, "ro.hwui.path_cache_size");
        A03(kti2, "ro.hwui.vertex_cache_size");
        A03(kti2, "ro.hwui.patch_cache_size");
        A03(kti2, "ro.hwui.drop_shadow_cache_size");
        A03(kti2, "ro.hwui.fbo_cache_size");
        C00i c00i2 = lVe.A0M;
        c00i2.get();
        String A0012 = C0cq.A00(C0cq.A00, !C0cq.A01 ? null : !JitUtilsNative.PLATFORM_SUPPORTED ? null : JitUtilsNative.nativeGetErrorMessage());
        if (JQx.A0K(A0012) > 0) {
            kti2.A03("JIT_ERRMSG", A0012);
        }
        HRs hRs = lVe.A03;
        if (hRs != null) {
            HRn hRn = hRs.A00.A02;
            list = Collections.singletonList((hRn == null || (c6r6 = hRn.A00.A0g) == null) ? "" : c6r6.name());
        } else {
            list = null;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        AnonymousClass540.A00(anonymousClass540);
        if (anonymousClass540.A00 != anonymousClass540.A01) {
            A04(A0k, "fps_guessed");
        }
        if (DexErrorRecoveryInfo.sDeoptTaint) {
            A04(A0k, "dex_unopt");
        }
        if ((DexErrorRecoveryInfo.getMainDexStoreLoadInformation().loadResult & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            A04(A0k, "periodic_pgo_profile_set");
        }
        synchronized (Verifier.class) {
            z = Verifier.sTriedDisableRuntimeVerification;
        }
        if (z) {
            synchronized (Verifier.class) {
                z2 = Verifier.sDisabledRuntimeVerification;
            }
            A04(A0k, z2 ? AbstractC00603o4.A00(481) : AbstractC00603o4.A00(496));
        }
        c00i2.get();
        A04(A0k, !C0cq.A02 ? JitDisabledChecker.sIsJitDisabled ^ true : !JitUtilsNative.PLATFORM_SUPPORTED ? JitDisabledChecker.sIsJitDisabled ^ true : JitUtilsNative.nativeIsJitEnabled() ? "jit_enabled" : "jit_disabled");
        Kkw kkw = lVe.A02;
        A04(A0k, kkw.A02 ? "dalvik.vm.usejit.enabled" : "dalvik.vm.usejit.disabled");
        A04(A0k, kkw.A03 ? "dalvik.vm.usejitprofiles.enabled" : "dalvik.vm.usejitprofiles.disabled");
        A04(A0k, 0Pz.A0W("pm.dexopt.bg-dexopt.", kkw.A00));
        A04(A0k, 0Pz.A1C("VmSafeFlagMode.", kkw.A01));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A04(A0k, AnonymousClass001.A0i(it));
            }
        }
        kti2.A03("trace_tags", A0k.toString());
        Kti.A00(kti2);
        kti2.A03.markerEditingCompleted();
        kti2.A03 = null;
        kti2.A06 = false;
        kti2.A02.markerEnd(kti2.A00, kti2.A01, (short) 2, lVe.A01, timeUnit);
        A05(lVe.A07);
        A05(lVe.A06);
        A05(lVe.A08);
        A05(lVe.A05);
        A05(lVe.A09);
        keh8.A00 = 0;
        keh10.A00 = 0;
        keh9.A00 = 0;
        keh6.A00 = 0;
        keh4.A00 = 0;
        keh7.A00 = 0;
        keh2.A00 = 0;
        keh.A00 = 0;
        keh5.A00 = 0;
        keh3.A00 = 0;
    }
}
