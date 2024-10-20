package X;

import android.content.Context;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.base.Joiner;
import java.util.concurrent.TimeUnit;

/* loaded from: Gu2.class */
public abstract class Gu2 extends GuA {
    public static final SparseIntArray A05;
    public boolean A00;
    public final JMP A01;
    public final Context A02;
    public volatile long A03;
    public volatile JKI A04;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(12);
        sparseIntArray.put(7, 11272208);
        sparseIntArray.put(16, 11272224);
        sparseIntArray.put(17, 11272227);
        sparseIntArray.put(18, 11272228);
        sparseIntArray.put(19, 11272235);
        sparseIntArray.put(20, 11272236);
        sparseIntArray.put(21, 11276595);
        sparseIntArray.put(22, 11287468);
        sparseIntArray.put(24, 11283980);
        sparseIntArray.put(25, 11287836);
        sparseIntArray.put(26, 11275520);
        sparseIntArray.put(27, 11280956);
        sparseIntArray.put(28, 11276921);
        A05 = sparseIntArray;
    }

    public Gu2(JLD jld, JMP jmp, String str, String str2) {
        super(jld, str, str2);
        Context context;
        try {
            context = ((IdA) this).A00.getContext();
        } catch (RuntimeException unused) {
            context = null;
        }
        this.A02 = context;
        this.A03 = 0L;
        this.A00 = false;
        this.A01 = jmp;
    }

    public Gu2(JOW jow, JLD jld, JMP jmp) {
        super(jow, jld);
        Context context;
        try {
            context = ((IdA) this).A00.getContext();
        } catch (RuntimeException unused) {
            context = null;
        }
        this.A02 = context;
        this.A03 = 0L;
        this.A00 = false;
        this.A01 = jmp;
    }

    public static int A02(int i) {
        int i2 = A05.get(i);
        if (i2 != 0) {
            return i2;
        }
        throw AnonymousClass001.A0L(0Pz.A0d("Event ", " is not part of FbCameraLogger.FbCameraEvent", 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x00f6. Please report as an issue. */
    public static int A03(String str, String str2) {
        boolean z = -1;
        switch (str.hashCode()) {
            case -1771728128:
                if (str.equals("recording_finished")) {
                    z = false;
                    break;
                }
                break;
            case -1655512013:
                if (str.equals("recording_started")) {
                    z = true;
                    break;
                }
                break;
            case -1449690740:
                if (str.equals("camera_connect_failed")) {
                    z = 2;
                    break;
                }
                break;
            case -1366347905:
                if (str.equals("recording_stop_requested")) {
                    z = 3;
                    break;
                }
                break;
            case -610698305:
                if (str.equals("camera_connect_requested")) {
                    z = 4;
                    break;
                }
                break;
            case -291368050:
                if (str.equals("camera_evicted")) {
                    z = 5;
                    break;
                }
                break;
            case -279952167:
                if (str.equals("camera_update_failed")) {
                    z = 6;
                    break;
                }
                break;
            case -151308056:
                if (str.equals("photo_capture_requested")) {
                    z = 7;
                    break;
                }
                break;
            case -8190024:
                if (str.equals("photo_capture_finished")) {
                    z = 8;
                    break;
                }
                break;
            case 148122000:
                if (str.equals("camera_first_frame_rendered")) {
                    z = 9;
                    break;
                }
                break;
            case 199801358:
                if (str.equals("camera_update_finished")) {
                    z = 10;
                    break;
                }
                break;
            case 470340763:
                if (str.equals("camera_disconnect_finished")) {
                    z = 11;
                    break;
                }
                break;
            case 1013585568:
                if (str.equals("recording_requested")) {
                    z = 12;
                    break;
                }
                break;
            case 1219670603:
                if (str.equals("recording_failed")) {
                    z = 13;
                    break;
                }
                break;
            case 1362464257:
                if (str.equals("camera_connect_finished")) {
                    z = 14;
                    break;
                }
                break;
            case 1487228098:
                if (str.equals("camera_swipe_to_open_finished")) {
                    z = 15;
                    break;
                }
                break;
            case 1493632274:
                if (str.equals("camera_connect_started")) {
                    z = 16;
                    break;
                }
                break;
            case 1570108675:
                if (str.equals("photo_capture_failed")) {
                    z = 17;
                    break;
                }
                break;
            case 2001457490:
                if (str.equals("camera_update_requested")) {
                    z = 18;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                return 15;
            case true:
                return 12;
            case true:
                return 3;
            case true:
                return 13;
            case true:
                return 0;
            case true:
                return 6;
            case true:
                if ("SWITCH".equals(str2)) {
                    return 17;
                }
                return 24;
            case true:
                return 8;
            case true:
                return 10;
            case true:
                return 4;
            case true:
                if ("SWITCH".equals(str2)) {
                    return 18;
                }
                return 24;
            case true:
                return 7;
            case true:
                return 11;
            case true:
                return 14;
            case true:
                return 2;
            case true:
                return 5;
            case true:
                return 1;
            case true:
                return 9;
            case true:
                if ("SWITCH".equals(str2)) {
                    return 16;
                }
                return 24;
            default:
                return 24;
        }
    }

    public static final boolean A04(Context context) {
        11T.A0F(context, 0);
        boolean z = false;
        try {
            Object systemService = context.getSystemService("power");
            11T.A0I(systemService, 1BJ.A00(34));
            PowerManager powerManager = (PowerManager) systemService;
            boolean A1N = AnonymousClass001.A1N(powerManager.isPowerSaveMode() ? 1 : 0);
            boolean A1N2 = AnonymousClass001.A1N(powerManager.isIgnoringBatteryOptimizations(context.getPackageName()) ? 1 : 0);
            if (A1N && !A1N2) {
                z = true;
            }
        } catch (RuntimeException unused) {
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0105, code lost:
    
        if (java.lang.Boolean.parseBoolean(X.AnonymousClass001.A0b("is_cold_start", r306)) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01cf, code lost:
    
        if (r302.equals("camera_update_requested") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x035e, code lost:
    
        if (r301.A02 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0361, code lost:
    
        r322 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x036d, code lost:
    
        if (r301.A00 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0373, code lost:
    
        r0 = r301.A01;
        r0 = ((X.GuA) r301).A03;
        r0 = ((X.GuA) r301).A01;
        r0 = ((X.GuA) r301).A00;
        r0 = ((X.GuA) r301).A04;
        r0 = ((X.GuA) r301).A06;
        r0 = r0.A00;
        r0 = r0.A05;
        r0 = r0.A06;
        r0 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x03bf, code lost:
    
        if (r322 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x03c2, code lost:
    
        r325 = X.HJU.A00(((X.IdA) r301).A00.getContext(), false);
        r327 = X.HJU.A00(((X.IdA) r301).A00.getContext(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x03ef, code lost:
    
        if (r318 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x03fb, code lost:
    
        switch(r318.hashCode()) {
            case -779044650: goto L107;
            case -85671418: goto L106;
            case 371328422: goto L105;
            case 440515259: goto L104;
            case 1266396786: goto L103;
            default: goto L96;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x047d, code lost:
    
        r332 = r318.equals("NATIVE_FULL_SIZE_FILE");
        r339 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x04e0, code lost:
    
        if (r332 != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0431, code lost:
    
        if (r322 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0434, code lost:
    
        r340 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x044c, code lost:
    
        if (A04(((X.IdA) r301).A00.getContext()) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0452, code lost:
    
        r317 = r0.onEvent(r0, r0, r0, r0, r0, r0, r0, r0, r0, r330, r325, r327, r339, r335, false, r340);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x044f, code lost:
    
        r340 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0491, code lost:
    
        r332 = r318.equals("PREVIEW_PHOTO");
        r339 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04a5, code lost:
    
        r332 = r318.equals("PREVIEW_BITMAP");
        r339 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04b9, code lost:
    
        r332 = r318.equals("NATIVE_VIEW_SIZE_PHOTO");
        r339 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04cd, code lost:
    
        r332 = r318.equals("NATIVE_LOW_LIGHT_PHOTO");
        r339 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x042c, code lost:
    
        r339 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x04e6, code lost:
    
        r325 = -1;
        r327 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0370, code lost:
    
        r322 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e4, code lost:
    
        if (r302.equals("photo_capture_failed") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0310, code lost:
    
        r317 = r301.A01.onFailureEvent(r0, r307, r304, r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f9, code lost:
    
        if (r302.equals("camera_connect_started") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x020e, code lost:
    
        if (r302.equals("camera_swipe_to_open_finished") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0223, code lost:
    
        if (r302.equals("camera_connect_finished") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0238, code lost:
    
        if (r302.equals("recording_failed") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x024d, code lost:
    
        if (r302.equals("recording_requested") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0262, code lost:
    
        if (r302.equals("camera_update_finished") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0277, code lost:
    
        if (r302.equals("camera_first_frame_rendered") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x028c, code lost:
    
        if (r302.equals("photo_capture_finished") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02a1, code lost:
    
        if (r302.equals("photo_capture_requested") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02b6, code lost:
    
        if (r302.equals("camera_update_failed") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02cb, code lost:
    
        if (r302.equals("camera_evicted") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02e0, code lost:
    
        if (r302.equals("camera_connect_requested") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02f5, code lost:
    
        if (r302.equals("recording_stop_requested") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x030a, code lost:
    
        if (r302.equals("camera_connect_failed") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x033a, code lost:
    
        if (r302.equals("recording_started") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x034f, code lost:
    
        if (r302.equals("recording_finished") == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A0A(java.lang.String r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, java.util.Map r306, int r307) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gu2.A0A(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        if (r301.A00 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e6, code lost:
    
        if (A04(((X.IdA) r301).A00.getContext()) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(java.lang.String r302, java.lang.String r303, java.util.Map r304) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gu2.A0F(java.lang.String, java.lang.String, java.util.Map):void");
    }

    public JKI B0E() {
        if (this.A04 == null) {
            synchronized (Gu2.class) {
                if (this.A04 == null) {
                    this.A04 = this.A01.createOneCameraARXLogger();
                }
            }
        }
        return this.A04;
    }

    public void Bav(int i, int i2) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.A01.onPostCaptureEvent(i, ((GuA) this).A03, ((GuA) this).A01, ((GuA) this).A00, i2);
        this.A03 += SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
    }

    public void Bj8(int i, String str, String str2) {
        ((GuA) this).A05.B5X().markerAnnotate(A02(i), str, str2);
    }

    public void Bwg(int i) {
        ((GuA) this).A05.B5X().markerEnd(A02(i), (short) 3);
    }

    public void Bwh(int i) {
        ((GuA) this).A05.B5X().markerEnd(A02(i), (short) 2);
    }

    public void Bwi(java.util.Map map, int i, long j) {
        map.put("product_name", ((GuA) this).A00);
        ((GuA) this).A05.B5X().markerGenerateWithAnnotations(A02(27), (short) 2, j, TimeUnit.NANOSECONDS, map);
    }

    public void Bwj(int i, String str) {
        ((GuA) this).A05.B5X().markerPoint(A02(i), str);
    }

    public void Bwl(int i) {
        int A02 = A02(i);
        JLD jld = ((GuA) this).A05;
        jld.B5X().markerStart(A02);
        QuickPerformanceLogger B5X = jld.B5X();
        B5X.markerTag(A02, 0Pz.A0W("product_name:", ((GuA) this).A00));
        B5X.markerAnnotate(A02, "product_name", ((GuA) this).A00);
        String str = ((GuA) this).A01;
        if (str != null && !str.isEmpty()) {
            B5X.markerTag(A02, 0Pz.A0W("product_session_id:", str));
            B5X.markerAnnotate(A02, "product_session_id", ((GuA) this).A01);
        }
        IcM icM = ((GuA) this).A06;
        boolean A1Y = 1BK.A1Y(icM.A05);
        B5X.markerTag(A02, 0Pz.A1C("enabled_effects:", A1Y));
        B5X.markerAnnotate(A02, "enabled_effects", A1Y);
        String A16 = 4YU.A16(H9E.A01, ((GuA) this).A07.A00);
        if (A16 != null) {
            B5X.markerTag(A02, 0Pz.A0W("media_pipeline_session_id:", A16));
            B5X.markerAnnotate(A02, "media_pipeline_session_id", A16);
        }
        B5X.markerAnnotate(A02, "enabled_effect_ids", Joiner.on(',').join(icM.A05));
    }

    public void destroy() {
        super.destroy();
        if (this.A03 > 0) {
            ((GuA) this).A05.B5X().markerGenerate(11279864, (short) 2, this.A03, TimeUnit.NANOSECONDS);
            this.A03 = 0L;
        }
    }

    public final String getActiveSessionId() {
        return this.A01.getActiveSessionId();
    }
}
