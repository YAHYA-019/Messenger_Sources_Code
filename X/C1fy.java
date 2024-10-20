package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1fy, reason: invalid class name */
/* loaded from: 1fy.class */
public final class C1fy {
    public final C00i A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final AtomicInteger A04;

    public C1fy() {
        1Br A00 = 1Bu.A00(66758);
        this.A03 = A00;
        this.A01 = 1Bq.A00(16460);
        this.A02 = 1Bq.A00(33075);
        A00.A00.get();
        this.A03.A00.get();
        this.A04 = new AtomicInteger();
    }

    public C1fy(Context context) {
        this();
        this.A00 = new 1HH(context, 65795);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0079. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0d0e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x151d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0cdb A[Catch: all -> 0x155d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:184:0x0b30, B:185:0x0b37, B:187:0x0b44, B:215:0x0bd3, B:216:0x0bda, B:219:0x0be6, B:220:0x0bed, B:223:0x0bf9, B:224:0x0c00, B:226:0x0c09, B:229:0x0c15, B:230:0x0c1c, B:233:0x0c2a, B:234:0x0c31, B:236:0x0c3a, B:239:0x0c46, B:240:0x0c4b, B:250:0x0cbe, B:251:0x0cc3, B:252:0x0cc8, B:253:0x0ccf, B:256:0x0cdb, B:257:0x0ce0, B:258:0x0ce5, B:261:0x0cf0, B:268:0x0c8f, B:269:0x0c96, B:272:0x0cac, B:274:0x0cb7, B:275:0x0c5b, B:276:0x0c63, B:280:0x155c, B:189:0x0b57, B:191:0x0b60, B:195:0x0b6e, B:196:0x0b75, B:197:0x0b7c, B:199:0x0b85, B:200:0x0b8b, B:204:0x0b9f, B:205:0x0ba6, B:208:0x0bb2, B:209:0x0bb9, B:211:0x0bc2, B:244:0x0c77, B:246:0x0c7e, B:248:0x0c87), top: B:183:0x0b30, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x026c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x026c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v144, types: [X.3J1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v192, types: [X.1JX, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A00(X.C1fy r301, java.lang.Object r302, java.lang.String r303, java.lang.Object[] r304, java.lang.String[] r305, int r306) {
        /*
            Method dump skipped, instructions count: 5522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1fy.A00(X.1fy, java.lang.Object, java.lang.String, java.lang.Object[], java.lang.String[], int):int");
    }

    private final C1gA A04(C1g1 c1g1, final Object obj, final Object[] objArr, boolean z) {
        int i;
        Object obj2;
        11T.A0F(c1g1, 0);
        AtomicInteger atomicInteger = this.A04;
        final String str = c1g1.A00;
        String[] strArr = c1g1.A02;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < length; i3++) {
                }
                final String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                String format = String.format("StartOpSequence:%s", Arrays.copyOf(new Object[]{str}, 1));
                11T.A0A(format);
                0Xq.A00(format);
                final int incrementAndGet = atomicInteger.incrementAndGet();
                if (strArr3.length != 0) {
                    ((Executor) 1Br.A0B(this.A01)).execute(new Runnable() { // from class: X.3ib
                        public static final String __redex_internal_original_name = "BaseStartOpDispatcherImpl$dispatch$2";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1fy c1fy = C1fy.this;
                            0Pz.A0W(str, "(async)");
                            C1fy.A00(c1fy, obj, "run_all_ops", objArr, strArr3, 0);
                        }
                    });
                }
                if (z) {
                    return new C1gA(this, obj, str, objArr, strArr2, incrementAndGet);
                }
                A00(this, obj, "run_all_ops", objArr, strArr2, 0);
                0Xp.A00();
                return null;
            }
            String str2 = strArr[i2];
            switch (str2.hashCode()) {
                case -2055010501:
                    obj2 = "dispatch_on_destroy_to_listeners";
                    break;
                case -2013819288:
                    obj2 = "schedule_post_destroy_cleanup";
                    break;
                case -1872531936:
                    obj2 = "stop_fury_trace_on_destroy";
                    break;
                case -1762320095:
                    obj2 = "maybe_suppress_activity_restoration";
                    break;
                case -1682917613:
                    obj2 = "litho_startup_configuration";
                    break;
                case -1629707648:
                    obj2 = "start_fury_trace_on_destroy";
                    break;
                case -1617060600:
                    obj2 = "dispatch_on_resume";
                    break;
                case -1465119360:
                    obj2 = "dispatch_on_post_create";
                    break;
                case -1433626741:
                    obj2 = "store_window_size_class";
                    break;
                case -1389258160:
                    obj2 = "wait_for_init";
                    break;
                case -1195050279:
                    obj2 = "module_load";
                    break;
                case -1135508676:
                    obj2 = "start_fury_trace_on_stop";
                    break;
                case -1016414514:
                    obj2 = "update_error_reporter_activity_flag_on_destroy";
                    break;
                case -937962951:
                    obj2 = "background_startup_detector";
                    break;
                case -854314849:
                    obj2 = "call_super_on_destroy";
                    break;
                case -844361220:
                    obj2 = "start_fury_trace_on_pause";
                    break;
                case -841043864:
                    obj2 = "start_fury_trace_on_start";
                    break;
                case -792261050:
                    obj2 = "super_on_start";
                    break;
                case -780133505:
                    obj2 = "recreate_activity_if_dark_mode_changed";
                    break;
                case -762366538:
                    obj2 = "start_fury_trace_on_create";
                    break;
                case -712236366:
                    obj2 = "set_up_dumpsys";
                    break;
                case -685776003:
                    obj2 = "recursive_class_loader_fix";
                    break;
                case -384867490:
                    obj2 = "set_up_status_bar_overlay";
                    break;
                case -364461699:
                    obj2 = "call_super_on_stop";
                    break;
                case -344498969:
                    obj2 = "start_fury_trace_on_resume";
                    break;
                case -339451905:
                    obj2 = "cache_window_dimensions";
                    break;
                case -21995425:
                    obj2 = "super_on_post_create";
                    break;
                case 214163638:
                    obj2 = "error_reporter_setup";
                    break;
                case 217312300:
                    obj2 = "activity_create";
                    break;
                case 217490284:
                    obj2 = "before_activity_create";
                    break;
                case 257008398:
                    obj2 = "fb_activity_listener_activity_create";
                    break;
                case 425889767:
                    obj2 = "app_compat_delegate_start";
                    break;
                case 495720157:
                    obj2 = "navigation_observer_post_create";
                    break;
                case 497040947:
                    obj2 = "remove_dumpsys_reporter_key_on_pause";
                    break;
                case 509715457:
                    obj2 = "resume_update_resources";
                    break;
                case 637564211:
                    obj2 = "call_delegate_on_destroy";
                    break;
                case 682550633:
                    obj2 = "call_delegate_on_stop";
                    break;
                case 733037980:
                    obj2 = "stop_fury_trace_on_pause";
                    break;
                case 736355336:
                    obj2 = "stop_fury_trace_on_start";
                    break;
                case 738103005:
                    obj2 = "dispose_disposable_context_helper";
                    break;
                case 749900696:
                    obj2 = "super_on_create";
                    break;
                case 750078680:
                    obj2 = "before_super_on_create";
                    break;
                case 863983205:
                    obj2 = "androidx_explicit_init";
                    break;
                case 892368406:
                    obj2 = "stop_fury_trace_on_create";
                    break;
                case 921904471:
                    obj2 = "error_reporter_set_activity_name";
                    break;
                case 1116768532:
                    obj2 = "dispatch_on_before_activity_listeners";
                    break;
                case 1167768265:
                    obj2 = "super_on_resume";
                    break;
                case 1185136672:
                    obj2 = "call_overridden_on_activity_destroy";
                    break;
                case 1310235975:
                    obj2 = "stop_fury_trace_on_resume";
                    break;
                case 1409258875:
                    obj2 = "dispatch_listeners_on_pause";
                    break;
                case 1473210407:
                    obj2 = "dispatch_on_start";
                    break;
                case 1503976512:
                    obj2 = "task_description_setup";
                    break;
                case 1527382873:
                    obj2 = "surface_manager_setup";
                    break;
                case 1583258587:
                    obj2 = "call_super_on_pause";
                    break;
                case 1591685247:
                    obj2 = "fb_bloks_startup_configuration";
                    break;
                case 1708135389:
                    obj2 = "dispatch_listeners_on_stop";
                    break;
                case 1861816947:
                    obj2 = "configure_orientation_lock";
                    break;
                case 1866639259:
                    obj2 = "fresco_startup_configuration";
                    break;
                case 1873962304:
                    obj2 = "app_compat_delegate_post_create";
                    break;
                case 1950324992:
                    obj2 = "override_animation_for_intent";
                    break;
                case 1963416476:
                    obj2 = "stop_fury_trace_on_stop";
                    break;
                default:
                    arrayList.add(str2);
                    continue;
            }
            i = (str2.equals(obj2) && !FbFragmentActivity.class.isAssignableFrom(obj.getClass())) ? i2 + 1 : 0;
            arrayList.add(str2);
            continue;
        }
    }

    public C1gA A01(Activity activity, Bundle bundle, C1g1 c1g1) {
        return A04(c1g1, activity, new Object[]{bundle}, true);
    }

    public C1gA A02(Activity activity, MotionEvent motionEvent, C1g1 c1g1) {
        return A04(c1g1, activity, new Object[]{motionEvent}, true);
    }

    public C1gA A03(Activity activity, C1g1 c1g1) {
        return A04(c1g1, activity, new Object[0], true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public String A05(String str) {
        switch (str.hashCode()) {
            case -2055010501:
                if (str.equals("dispatch_on_destroy_to_listeners")) {
                    return "FbFragmentActivityStartOps.dispatchListenerOnDestroy";
                }
                return str;
            case -2013819288:
                if (str.equals("schedule_post_destroy_cleanup")) {
                    return "FbFragmentActivityStartOps.schedulePostDestroyCleanup";
                }
                return str;
            case -1872531936:
                if (str.equals("stop_fury_trace_on_destroy")) {
                    return "FbFragmentActivityStartOps.stopFuryTraceOnDestroy";
                }
                return str;
            case -1762320095:
                if (str.equals("maybe_suppress_activity_restoration")) {
                    return "FbFragmentActivityStartOps.maybeSuppressActivityRestoration";
                }
                return str;
            case -1682917613:
                if (str.equals("litho_startup_configuration")) {
                    return "FbFragmentActivityStartOps.setupLithoConfiguration";
                }
                return str;
            case -1629707648:
                if (str.equals("start_fury_trace_on_destroy")) {
                    return "FbFragmentActivityStartOps.startFuryTraceOnDestroy";
                }
                return str;
            case -1617060600:
                if (str.equals("dispatch_on_resume")) {
                    return "FbFragmentActivityStartOps.dispatchOnResume";
                }
                return str;
            case -1465119360:
                if (str.equals("dispatch_on_post_create")) {
                    return "FbFragmentActivityStartOps.dispatchOnPostCreateListener";
                }
                return str;
            case -1433626741:
                if (str.equals("store_window_size_class")) {
                    return "FbFragmentActivityStartOps.storeWindowSizeClassOnPause";
                }
                return str;
            case -1389258160:
                if (str.equals("wait_for_init")) {
                    return "FbFragmentActivityStartOps.waitForInit";
                }
                return str;
            case -1195050279:
                if (str.equals("module_load")) {
                    return "FbFragmentActivityStartOps.loadVoltronModulesForFragments";
                }
                return str;
            case -1135508676:
                if (str.equals("start_fury_trace_on_stop")) {
                    return "FbFragmentActivityStartOps.startFuryTraceOnStop";
                }
                return str;
            case -1016414514:
                if (str.equals("update_error_reporter_activity_flag_on_destroy")) {
                    return "FbFragmentActivityStartOps.updateErrorReporterActivityFlagOnDestroy";
                }
                return str;
            case -937962951:
                if (str.equals("background_startup_detector")) {
                    return "FbFragmentActivityStartOps.letBackgroundStartupDetectorKnowAnActivityIsBeingCreated";
                }
                return str;
            case -854314849:
                if (str.equals("call_super_on_destroy")) {
                    return "FbFragmentActivityStartOps.callSuperOnDestroy";
                }
                return str;
            case -844361220:
                if (str.equals("start_fury_trace_on_pause")) {
                    return "FbFragmentActivityStartOps.startFuryTraceOnPause";
                }
                return str;
            case -841043864:
                if (str.equals("start_fury_trace_on_start")) {
                    return "FbFragmentActivityStartOps.startFuryTraceOnStart";
                }
                return str;
            case -792261050:
                if (str.equals("super_on_start")) {
                    return "FbFragmentActivityStartOps.callSuperOnStart";
                }
                return str;
            case -780133505:
                if (str.equals("recreate_activity_if_dark_mode_changed")) {
                    return "FbFragmentActivityStartOps.recreateActivityIfDarkModeChanged";
                }
                return str;
            case -762366538:
                if (str.equals("start_fury_trace_on_create")) {
                    return "FbFragmentActivityStartOps.startFuryTraceForOnCreate";
                }
                return str;
            case -712236366:
                if (str.equals("set_up_dumpsys")) {
                    return "FbFragmentActivityStartOps.setUpDumpsys";
                }
                return str;
            case -685776003:
                if (str.equals("recursive_class_loader_fix")) {
                    return "FbFragmentActivityStartOps.applyClassLoaderFixToSavedInstanceState";
                }
                return str;
            case -384867490:
                if (str.equals("set_up_status_bar_overlay")) {
                    return "FbFragmentActivityStartOps.setUpSystemBarOverlays";
                }
                return str;
            case -364461699:
                if (str.equals("call_super_on_stop")) {
                    return "FbFragmentActivityStartOps.callSuperOnStop";
                }
                return str;
            case -344498969:
                if (str.equals("start_fury_trace_on_resume")) {
                    return "FbFragmentActivityStartOps.startFuryTraceOnResume";
                }
                return str;
            case -339451905:
                if (str.equals("cache_window_dimensions")) {
                    return "FbFragmentActivityStartOps.cacheWindowDimensions";
                }
                return str;
            case -21995425:
                if (str.equals("super_on_post_create")) {
                    return "FbFragmentActivityStartOps.callSuperOnPostCreate";
                }
                return str;
            case 214163638:
                if (str.equals("error_reporter_setup")) {
                    return "FbFragmentActivityStartOps.setupDumpsysErrorReporter";
                }
                return str;
            case 217312300:
                if (str.equals("activity_create")) {
                    return "FbFragmentActivityStartOps.dispatchActivityCreate";
                }
                return str;
            case 217490284:
                if (str.equals("before_activity_create")) {
                    return "FbFragmentActivityStartOps.dispatchBeforeActivityCreate";
                }
                return str;
            case 257008398:
                if (str.equals("fb_activity_listener_activity_create")) {
                    return "FbFragmentActivityStartOps.dispatchActivityListenerOnActivityCreate";
                }
                return str;
            case 425889767:
                if (str.equals("app_compat_delegate_start")) {
                    return "FbFragmentActivityStartOps.dispatchAppCompatDelegateOnStart";
                }
                return str;
            case 495720157:
                if (str.equals("navigation_observer_post_create")) {
                    return "FbFragmentActivityStartOps.callPostCreateOnNavigationObserver";
                }
                return str;
            case 497040947:
                if (str.equals("remove_dumpsys_reporter_key_on_pause")) {
                    return "FbFragmentActivityStartOps.removeDumpsysReporterKeyOnPause";
                }
                return str;
            case 509715457:
                if (str.equals("resume_update_resources")) {
                    return "FbFragmentActivityStartOps.updateFbResourcesOnResume";
                }
                return str;
            case 637564211:
                if (str.equals("call_delegate_on_destroy")) {
                    return "FbFragmentActivityStartOps.callAppCompatDelegateOnDestroy";
                }
                return str;
            case 682550633:
                if (str.equals("call_delegate_on_stop")) {
                    return "FbFragmentActivityStartOps.callDelegateOnStop";
                }
                return str;
            case 733037980:
                if (str.equals("stop_fury_trace_on_pause")) {
                    return "FbFragmentActivityStartOps.stopFuryTraceOnPause";
                }
                return str;
            case 736355336:
                if (str.equals("stop_fury_trace_on_start")) {
                    return "FbFragmentActivityStartOps.stopFuryTraceOnStart";
                }
                return str;
            case 738103005:
                if (str.equals("dispose_disposable_context_helper")) {
                    return "FbFragmentActivityStartOps.disposeOfDisposable";
                }
                return str;
            case 749900696:
                if (str.equals("super_on_create")) {
                    return "FbFragmentActivityStartOps.callSuperOnCreate";
                }
                return str;
            case 750078680:
                if (str.equals("before_super_on_create")) {
                    return "FbFragmentActivityStartOps.callOnBeforeSuperOnCreate";
                }
                return str;
            case 863983205:
                if (str.equals("androidx_explicit_init")) {
                    return "FbFragmentActivityStartOps.runAndroidXExplicitInitializer";
                }
                return str;
            case 892368406:
                if (str.equals("stop_fury_trace_on_create")) {
                    return "FbFragmentActivityStartOps.stopFuryTraceForOnCreate";
                }
                return str;
            case 921904471:
                if (str.equals("error_reporter_set_activity_name")) {
                    return "FbFragmentActivityStartOps.setErrorReporterActivityName";
                }
                return str;
            case 1116768532:
                if (str.equals("dispatch_on_before_activity_listeners")) {
                    return "FbFragmentActivityStartOps.dispatchOnBeforeActivityListeners";
                }
                return str;
            case 1167768265:
                if (str.equals("super_on_resume")) {
                    return "FbFragmentActivityStartOps.callSuperOnResume";
                }
                return str;
            case 1185136672:
                if (str.equals("call_overridden_on_activity_destroy")) {
                    return "FbFragmentActivityStartOps.callOverriddenOnActivityDestroy";
                }
                return str;
            case 1310235975:
                if (str.equals("stop_fury_trace_on_resume")) {
                    return "FbFragmentActivityStartOps.stopFuryTraceOnResume";
                }
                return str;
            case 1409258875:
                if (str.equals("dispatch_listeners_on_pause")) {
                    return "FbFragmentActivityStartOps.dispatchListenerOnPause";
                }
                return str;
            case 1473210407:
                if (str.equals("dispatch_on_start")) {
                    return "FbFragmentActivityStartOps.dispatchListenerOnStart";
                }
                return str;
            case 1503976512:
                if (str.equals("task_description_setup")) {
                    return "FbFragmentActivityStartOps.setupTaskDescription";
                }
                return str;
            case 1527382873:
                if (str.equals("surface_manager_setup")) {
                    return "FbFragmentActivityStartOps.setupSurfaceManager";
                }
                return str;
            case 1583258587:
                if (str.equals("call_super_on_pause")) {
                    return "FbFragmentActivityStartOps.callSuperOnPause";
                }
                return str;
            case 1591685247:
                if (str.equals("fb_bloks_startup_configuration")) {
                    return "FbFragmentActivityStartOps.configureBloks";
                }
                return str;
            case 1708135389:
                if (str.equals("dispatch_listeners_on_stop")) {
                    return "FbFragmentActivityStartOps.dispatchListenerOnStop";
                }
                return str;
            case 1861816947:
                if (str.equals("configure_orientation_lock")) {
                    return "FbFragmentActivityStartOps.configureOrientationLock";
                }
                return str;
            case 1866639259:
                if (str.equals("fresco_startup_configuration")) {
                    return "FbFragmentActivityStartOps.setupFrescoConfiguration";
                }
                return str;
            case 1873962304:
                if (str.equals("app_compat_delegate_post_create")) {
                    return "FbFragmentActivityStartOps.callPostCreateOnAppCompatDelegate";
                }
                return str;
            case 1950324992:
                if (str.equals("override_animation_for_intent")) {
                    return "FbFragmentActivityStartOps.overrideAnimationForIntent";
                }
                return str;
            case 1963416476:
                if (str.equals("stop_fury_trace_on_stop")) {
                    return "FbFragmentActivityStartOps.stopFuryTraceOnStop";
                }
                return str;
            default:
                return str;
        }
    }

    public void A06(Activity activity, Bundle bundle, C1g1 c1g1) {
        A04(c1g1, activity, new Object[]{bundle}, false);
    }

    public void A07(Activity activity, C1g1 c1g1) {
        A04(c1g1, activity, new Object[0], false);
    }
}
