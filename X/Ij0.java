package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.RectF;
import android.os.Debug;
import android.os.SystemClock;
import com.facebook.acra.constants.ActionId;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatRawEventLogger;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.messengereffectservicehost.MessengerEffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsServiceObjectsWrapper;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper;
import com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageDataSourceHybrid;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource;
import com.facebook.cameracore.mediapipeline.services.weather.WeatherServiceDataSource;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: Ij0.class */
public final class Ij0 implements JJE, JJA, JGp, JQX, JGk, JGm, JGl, JQW, JQV {
    public static final JQ9 A0o = new Gu9();
    public long A02;
    public HlY A03;
    public JCk A04;
    public PlatformAlgorithmDataSource A05;
    public N2W A06;
    public N1W A07;
    public IPK A08;
    public Iif A09;
    public JLR A0A;
    public Iig A0B;
    public Iij A0C;
    public boolean A0E;
    public boolean A0G;
    public boolean A0J;
    public Iih A0M;
    public Iit A0N;
    public Iii A0O;
    public final HoE A0S;
    public final HzB A0T;
    public final Hhk A0U;
    public final HoX A0V;
    public final I8q A0W;
    public final HWf A0X;
    public final JNI A0Y;
    public final JQ8 A0Z;
    public final ActivityManager A0d;
    public final Hbn A0f;
    public final Executor A0g;
    public volatile JQ9 A0m;
    public final HgU A0e = new Object();
    public final HcY A0a = new HcY();
    public final Object A0b = AnonymousClass001.A0R();
    public volatile boolean A0j = false;
    public volatile boolean A0k = false;
    public volatile I4D A0h = null;
    public volatile HFs A0i = null;
    public volatile I2f A0l = null;
    public String A0P = null;
    public String A0Q = null;
    public boolean A0F = false;
    public boolean A0R = false;
    public int A01 = -1;
    public int A00 = -1;
    public boolean A0L = false;
    public boolean A0I = false;
    public boolean A0H = false;
    public volatile boolean A0n = true;
    public boolean A0K = true;
    public boolean A0D = false;
    public final boolean[] A0c = new boolean[HB9.values().length];

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.HgU] */
    public Ij0(Context context, HoE hoE, I4D i4d, I8q i8q, Hbn hbn, HWf hWf, JNI jni, Executor executor) {
        this.A0f = hbn;
        this.A0X = hWf;
        this.A0S = hoE;
        this.A0Z = hoE.A01;
        this.A0g = executor;
        this.A0W = i8q;
        this.A0V = new HoX(i8q);
        this.A0T = new HzB(context, new HrM(hbn));
        this.A0U = new Hhk(i8q, hWf);
        this.A0Y = jni;
        this.A0d = (ActivityManager) context.getSystemService("activity");
        0fH.A0g(1BK.A0j(this), "FbMsqrdRenderer", "FbMsqrdRenderer %s - ctor");
        if (i4d != null) {
            0fH.A0g(1BK.A0j(this), "FbMsqrdRenderer", "FbMsqrdRenderer %s - ctor - not null config");
            Cqs(new Gu9());
            A0C(i4d, null);
        }
    }

    public static HpG A00(Ij0 ij0) {
        I8q i8q = ij0.A0W;
        if (i8q.A0C == null || i8q.A02() == null) {
            return null;
        }
        return (i8q.A0C != null ? i8q.A02() : null).mArExperimentUtil;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.HF1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.HdE] */
    public static HdE A01(IDi iDi, Object obj) {
        if (!iDi.A08) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        ByteBuffer byteBuffer = iDi.A07;
        int hashCode = obj.hashCode();
        ?? obj2 = new Object();
        ((HF1) obj2).A00 = hashCode;
        ((HF1) obj2).A01 = byteBuffer;
        ?? obj3 = new Object();
        ((HdE) obj3).A01 = obj2;
        ServiceMessageDataSourceHybrid serviceMessageDataSourceHybrid = ((HdE) obj3).A00;
        if (serviceMessageDataSourceHybrid != null) {
            serviceMessageDataSourceHybrid.setConfiguration(hashCode, byteBuffer, byteBuffer.position());
        }
        return obj3;
    }

    public static Iif A02(Ij0 ij0) {
        Iif iif = ij0.A09;
        if (iif == null) {
            iif = new Iif(new HWe(ij0));
            ij0.A09 = iif;
        }
        return iif;
    }

    private JQ9 A03(String str) {
        JQ9 jq9 = this.A0m;
        if (jq9 == null) {
            I4D i4d = this.A0h;
            String str2 = i4d != null ? i4d.A0A : "null_config";
            0fH.A0k("FbMsqrdRenderer", "====== No proper logger !!!!!!!!!! ======");
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("use_case", str);
                if (str2 == null) {
                    str2 = "null_product_name";
                }
                A0u.put("product_name", str2);
                qPLInstance.markerGenerateWithAnnotations(11282540, (short) 4, 1L, TimeUnit.MILLISECONDS, A0u);
            }
            jq9 = A0o;
        }
        return jq9;
    }

    public static File A04(Context context, String str, String str2) {
        File cacheDir = context.getCacheDir();
        AssetManager assets = context.getAssets();
        File A0D = AnonymousClass001.A0D(cacheDir, str2);
        try {
            InputStream open = assets.open(str);
            try {
                FileOutputStream A14 = GOn.A14(A0D);
                try {
                    byte[] bArr = new byte[1048576];
                    while (true) {
                        int read = open.read(bArr);
                        if (read <= 0) {
                            return A0D;
                        }
                        A14.write(bArr, 0, read);
                    }
                } finally {
                    A14.close();
                }
            } finally {
                open.close();
            }
        } catch (IOException e) {
            throw new IOException(0Pz.A0W("Could not open ", str), e);
        }
    }

    private void A05() {
        if (this.A0R) {
            return;
        }
        I8q i8q = this.A0W;
        synchronized (i8q) {
            I8q.A00(i8q).setupServiceHost(i8q.A02());
            AREngineController A00 = I8q.A00(i8q);
            HgT hgT = i8q.A07;
            if (A00.renderSessionInit(hgT.A03, hgT.A02, 0, (GPUTimerImpl) null, i8q.A05, hgT.A00)) {
                A00.updatePerSessionDebugConfiguration(hgT.A01, false, false, false);
            }
        }
        this.A0R = true;
    }

    private void A06() {
        IP0 ip0 = this.A04;
        if (ip0 != null) {
            Iih iih = this.A0M;
            if (iih != null) {
                Integer num = iih.A00;
                Iterator it = ip0.A06.iterator();
                while (it.hasNext()) {
                    CaptureEventInputWrapper captureEventInputWrapper = (CaptureEventInputWrapper) it.next();
                    int i = 2;
                    if (num == 0S2.A00) {
                        i = 1;
                    }
                    captureEventInputWrapper.setCaptureDevicePosition(i);
                }
                this.A0M = null;
            }
            Iij iij = this.A0C;
            if (iij != null) {
                IP0 ip02 = this.A04;
                int i2 = iij.A02;
                int i3 = iij.A01;
                float f = iij.A00;
                Iterator it2 = ip02.A06.iterator();
                while (it2.hasNext()) {
                    ((CaptureEventInputWrapper) it2.next()).setPreviewViewInfo(i2, i3, f);
                }
                this.A0C = null;
            }
            Iit iit = this.A0N;
            if (iit != null) {
                IP0 ip03 = this.A04;
                int i4 = iit.A01;
                int i5 = iit.A00;
                Iterator it3 = ip03.A06.iterator();
                while (it3.hasNext()) {
                    ((CaptureEventInputWrapper) it3.next()).setCaptureDeviceSize(i4, i5);
                }
                this.A0N = null;
            }
            Iii iii = this.A0O;
            if (iii != null) {
                IP0 ip04 = this.A04;
                int i6 = iii.A00;
                Iterator it4 = ip04.A06.iterator();
                while (it4.hasNext()) {
                    ((CaptureEventInputWrapper) it4.next()).setRotation(i6);
                }
                this.A0O = null;
            }
            Iig iig = this.A0B;
            if (iig != null) {
                IP0 ip05 = this.A04;
                Integer num2 = iig.A00;
                IP0 ip06 = ip05;
                if (ip06.A05 != num2) {
                    int intValue = num2.intValue();
                    int i7 = 2;
                    if (intValue == 1) {
                        i7 = 1;
                    } else if (intValue != 2) {
                        if (intValue != 0) {
                            throw AnonymousClass001.A0L("Incomplete setCaptureContext handling");
                        }
                        i7 = -1;
                        float f2 = 0.0f / 0.0f;
                    }
                    ip06.A05 = num2;
                    Iterator it5 = ip06.A06.iterator();
                    while (it5.hasNext()) {
                        ((CaptureEventInputWrapper) it5.next()).setCaptureContext(i7);
                    }
                }
                this.A0B = null;
            }
        }
    }

    private void A07() {
        Arrays.fill(this.A0c, false);
        A0I(this, this.A0A);
        if (this.A0k || this.A0R) {
            synchronized (this.A0b) {
                A0F(this.A0h, null, "release", false);
                this.A0k = false;
                I8q i8q = this.A0W;
                synchronized (i8q) {
                    I8q.A00(i8q).releaseGl();
                    I8q.A01(i8q);
                }
                this.A0R = false;
            }
        }
        this.A0i = null;
        this.A0j = false;
        this.A0l = null;
        IPK ipk = this.A08;
        if (ipk != null) {
            ipk.release();
            this.A08 = null;
        }
        0fH.A0g(1BK.A0j(this), "FbMsqrdRenderer", "FbMsqrdRenderer %s - released");
    }

    private void A08() {
        synchronized (this) {
            if (this.A0j && this.A0A != null) {
                HgU hgU = this.A0e;
                if (hgU.A03) {
                    Iih iih = hgU.A00;
                    if (iih != null) {
                        Iit iit = hgU.A01;
                        if (iit != null) {
                            Iii iii = hgU.A02;
                            if (iii != null) {
                                int i = 0;
                                hgU.A03 = false;
                                HoX hoX = this.A0V;
                                int i2 = iit.A01;
                                int i3 = iit.A00;
                                Integer num = iih.A00;
                                Integer num2 = 0S2.A00;
                                boolean A1W = AnonymousClass001.A1W(num, num2);
                                int i4 = iii.A00 * 90;
                                int i5 = iii.A01;
                                int i6 = (A1W ? HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH - ((i5 + i4) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH) : (i5 - i4) + HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
                                boolean A1W2 = AnonymousClass001.A1W(num, num2);
                                hoX.A00 = i6;
                                hoX.A01 = A1W2;
                                I8q.A00(hoX.A02).setupImageSourceFacet(i2, i3, i2, i6, A1W2);
                                I8q i8q = this.A0W;
                                if (hgU.A00.A00 != num2) {
                                    i = 1;
                                }
                                I8q.A00(i8q).setCameraFacing(i);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void A09(long j, String str) {
        C00j.A01(-1705813693);
        0fH.A0g(Long.valueOf(SystemClock.elapsedRealtime() - j), "FbMsqrdRenderer", str);
    }

    private void A0A(I4D i4d, int i) {
        ActivityManager activityManager;
        String str;
        String str2;
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance == null || (activityManager = this.A0d) == null || i4d == null || (str = i4d.A0F) == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (qPLInstance.isMarkerOn(16323880, hashCode)) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            Runtime runtime = Runtime.getRuntime();
            long freeMemory = runtime.totalMemory() - runtime.freeMemory();
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
            MarkerEditor withMarker = qPLInstance.withMarker(16323880, hashCode);
            switch (i) {
                case 4:
                    str2 = "effect_setting_started";
                    break;
                case 5:
                    str2 = "effect_setting_finished";
                    break;
                case 6:
                    str2 = "effect_setting_failed";
                    break;
                case 7:
                    str2 = "effect_first_frame_started";
                    break;
                case 8:
                    str2 = "effect_first_frame_finished";
                    break;
                case 9:
                    str2 = "effect_first_frame_async";
                    break;
                case 10:
                    str2 = "effect_first_frame_failed";
                    break;
                case 11:
                    str2 = "effect_getting_swapped";
                    break;
                case 12:
                    str2 = "effect_deselecting_started";
                    break;
                case 13:
                    str2 = "effect_deselecting_finished";
                    break;
                case 14:
                    str2 = "effect_new_selection_requested";
                    break;
                case 15:
                    str2 = "low_on_memory";
                    break;
                case 16:
                    str2 = "effect_frame_10";
                    break;
                case 17:
                    str2 = "effect_frame_30";
                    break;
                case 18:
                    str2 = "effect_frame_150";
                    break;
                default:
                    str2 = "effect_frame_600";
                    break;
            }
            withMarker.pointEditor(str2).addPointData("java_heap", freeMemory).addPointData("native_neap", nativeHeapAllocatedSize).addPointData("avail_mem", memoryInfo.availMem).addPointData("is_low_mem", memoryInfo.lowMemory).markerEditingCompleted();
        }
    }

    private void A0B(I4D i4d, int i) {
        String str;
        boolean z;
        JKI B0E = A03(0Pz.A0T("logXEvent ", i)).B0E();
        if (i4d != null) {
            str = i4d.A0F;
            z = false;
        } else {
            str = "null_config_session";
            z = true;
        }
        A0K(B0E.onEvent(i, str, z), 0Pz.A0T("event_", i), i4d != null ? i4d.A0A : "null_config");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (r313 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0C(X.I4D r302, X.HFs r303) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ij0.A0C(X.I4D, X.HFs):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0af7 A[Catch: EffectsFrameworkException -> 0x138d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {EffectsFrameworkException -> 0x138d, blocks: (B:9:0x0088, B:10:0x008f, B:11:0x0096, B:12:0x009d, B:15:0x00a7, B:18:0x00b3, B:19:0x00b8, B:20:0x00be, B:21:0x00c5, B:22:0x00cc, B:25:0x00d8, B:27:0x00df, B:29:0x00e6, B:31:0x00ed, B:34:0x060a, B:37:0x0616, B:40:0x0622, B:42:0x062c, B:44:0x0635, B:45:0x063c, B:47:0x0645, B:49:0x0654, B:51:0x066b, B:53:0x0671, B:54:0x0676, B:56:0x0682, B:58:0x068b, B:60:0x0693, B:62:0x069c, B:64:0x06ad, B:66:0x06b3, B:67:0x06b8, B:69:0x06c4, B:71:0x06cd, B:73:0x06d5, B:75:0x06de, B:77:0x06e7, B:79:0x06ef, B:81:0x06fb, B:83:0x0701, B:84:0x0706, B:86:0x0711, B:88:0x071a, B:90:0x0722, B:92:0x072b, B:94:0x0732, B:96:0x0739, B:98:0x0745, B:99:0x074c, B:100:0x0751, B:102:0x075a, B:104:0x0761, B:105:0x0766, B:106:0x076d, B:108:0x0778, B:110:0x0782, B:113:0x0792, B:114:0x0799, B:116:0x07a1, B:117:0x07aa, B:118:0x07b1, B:119:0x07b8, B:121:0x07c5, B:125:0x07d5, B:127:0x07dc, B:129:0x07e7, B:132:0x07f3, B:133:0x07fa, B:134:0x0801, B:136:0x080a, B:137:0x080f, B:139:0x0814, B:140:0x081b, B:141:0x0822, B:142:0x0829, B:143:0x0830, B:144:0x0837, B:145:0x083e, B:146:0x0845, B:147:0x084c, B:149:0x0853, B:152:0x085d, B:153:0x0864, B:154:0x0869, B:155:0x0870, B:156:0x0877, B:158:0x0882, B:160:0x088b, B:162:0x0892, B:165:0x089c, B:166:0x08a3, B:168:0x08ac, B:170:0x08b5, B:171:0x08bc, B:173:0x08c8, B:175:0x08d0, B:177:0x08d7, B:179:0x08de, B:181:0x08ea, B:182:0x08f1, B:183:0x08f6, B:185:0x08ff, B:187:0x0906, B:188:0x090b, B:190:0x0916, B:192:0x0920, B:195:0x092a, B:196:0x0931, B:198:0x093a, B:200:0x0943, B:201:0x094a, B:203:0x0956, B:205:0x095e, B:207:0x0965, B:209:0x096c, B:211:0x0978, B:212:0x097f, B:213:0x0984, B:215:0x098d, B:217:0x0994, B:218:0x0999, B:220:0x09a4, B:222:0x09ae, B:225:0x09b8, B:229:0x0a15, B:232:0x0a1f, B:233:0x0a26, B:234:0x0a2b, B:235:0x0a32, B:237:0x0a39, B:240:0x0a43, B:241:0x0a4c, B:243:0x0a54, B:244:0x0a5d, B:245:0x0a64, B:246:0x0a6d, B:248:0x0a7a, B:252:0x0a8c, B:254:0x0a93, B:256:0x0aa0, B:259:0x0aac, B:260:0x0ab3, B:261:0x0ab8, B:262:0x0abf, B:264:0x0aca, B:266:0x0ad3, B:268:0x0ada, B:269:0x0adf, B:271:0x0ae6, B:273:0x0aed, B:276:0x0af7, B:279:0x0b03, B:281:0x0b0f, B:282:0x0b16, B:286:0x0b24, B:287:0x0b28, B:289:0x0b2d, B:291:0x0b36, B:295:0x0b44, B:296:0x0b4b, B:297:0x0b52, B:299:0x0b5a, B:301:0x0b60, B:303:0x0b67, B:304:0x0b6c, B:305:0x0b73, B:306:0x0b7a, B:307:0x0b81, B:310:0x0b8d, B:314:0x0b9e, B:317:0x0baa, B:318:0x0bb1, B:319:0x0bb8, B:323:0x0bc9, B:327:0x0bda, B:328:0x0be1, B:329:0x0be8, B:331:0x0bf1, B:334:0x0bfd, B:336:0x0c04, B:340:0x0c10, B:341:0x0c17, B:342:0x0c1e, B:343:0x0c25, B:344:0x0c2c, B:345:0x0c33, B:346:0x0c3a, B:347:0x0c41, B:349:0x0c48, B:350:0x0c4d, B:353:0x0c59, B:355:0x0c60, B:358:0x0c6d, B:361:0x0c7c, B:362:0x0c83, B:364:0x0c8a, B:365:0x0c91, B:367:0x0c98, B:370:0x0ca2, B:373:0x0cae, B:374:0x0cb5, B:375:0x0cbc, B:377:0x0cc5, B:380:0x0ccf, B:382:0x0cda, B:383:0x0ce1, B:385:0x0cec, B:387:0x0cf7, B:389:0x0d02, B:391:0x0d14, B:393:0x0d1b, B:394:0x0d20, B:395:0x0d27, B:397:0x0d35, B:398:0x0d3c, B:634:0x11dd, B:635:0x11e4, B:639:0x11f2, B:640:0x11f9, B:641:0x1200, B:643:0x1208, B:645:0x120e, B:647:0x1213, B:651:0x1221, B:652:0x1228, B:653:0x122f, B:655:0x1237, B:657:0x123d, B:661:0x124c, B:663:0x1252, B:666:0x125c, B:668:0x1264, B:670:0x126a, B:671:0x126f, B:673:0x1276, B:674:0x127d, B:676:0x1286, B:679:0x1292, B:680:0x1299, B:681:0x12a0, B:682:0x12a7, B:685:0x12b3, B:687:0x12ba, B:688:0x12ce, B:691:0x12da, B:693:0x12c0, B:695:0x12c6, B:699:0x12ea, B:700:0x12f1, B:702:0x1304, B:705:0x130f, B:709:0x1321, B:711:0x1329, B:717:0x1336, B:719:0x1345, B:721:0x1357, B:734:0x1385, B:736:0x138c, B:737:0x09c4, B:738:0x09cb, B:739:0x09d2, B:740:0x09d9, B:741:0x09e0, B:742:0x09e7, B:744:0x0a0e, B:747:0x0114, B:750:0x0120, B:751:0x0125, B:753:0x0132, B:756:0x0140, B:758:0x0151, B:759:0x0158, B:761:0x016d, B:763:0x0178, B:764:0x017f, B:766:0x018a, B:768:0x0192, B:770:0x0199, B:772:0x01a4, B:773:0x01ab, B:775:0x01b3, B:776:0x01bc, B:777:0x01c3, B:778:0x01ca, B:780:0x01d7, B:784:0x01e7, B:786:0x01ee, B:788:0x01f9, B:791:0x0205, B:794:0x020c, B:796:0x0215, B:798:0x021c, B:802:0x0256, B:803:0x025b, B:804:0x0262, B:805:0x0269, B:806:0x0270, B:807:0x0277, B:808:0x027e, B:809:0x0285, B:810:0x028c, B:811:0x0293, B:813:0x022f, B:815:0x023d, B:817:0x0248, B:818:0x024f, B:820:0x02a2, B:821:0x02a9, B:823:0x02b4, B:826:0x02bb, B:829:0x02c5, B:831:0x02d5, B:832:0x02dc, B:833:0x02e3, B:835:0x02ec, B:837:0x02f6, B:839:0x0304, B:840:0x030b, B:842:0x0314, B:844:0x031e, B:848:0x0331, B:849:0x0338, B:851:0x0341, B:853:0x034b, B:855:0x0359, B:856:0x0360, B:858:0x0369, B:860:0x0373, B:864:0x0386, B:865:0x038d, B:867:0x0396, B:869:0x039f, B:871:0x03b0, B:876:0x03db, B:879:0x03e5, B:881:0x03f5, B:882:0x03fc, B:883:0x0403, B:885:0x040c, B:887:0x0416, B:889:0x0424, B:890:0x042b, B:892:0x0434, B:894:0x043e, B:895:0x0443, B:896:0x0448, B:898:0x0453, B:900:0x045b, B:904:0x047d, B:907:0x0487, B:909:0x0497, B:910:0x049e, B:912:0x04a7, B:914:0x04b1, B:916:0x04bf, B:918:0x04c8, B:920:0x04d2, B:922:0x04e0, B:924:0x04e9, B:926:0x04f3, B:930:0x0506, B:932:0x050f, B:935:0x051c, B:936:0x0523, B:937:0x052a, B:939:0x0534, B:942:0x053f, B:943:0x0546, B:946:0x0552, B:948:0x055c, B:953:0x059f, B:955:0x05a7, B:957:0x05b0, B:959:0x05bc, B:960:0x05c4, B:964:0x05e0, B:965:0x05e7, B:967:0x05f3, B:969:0x0600, B:971:0x057e, B:972:0x0585, B:975:0x0591, B:980:0x0465, B:981:0x046c, B:983:0x0476, B:985:0x03c3, B:986:0x03ca, B:988:0x03d4, B:990:0x00fa, B:991:0x0101, B:402:0x0d45, B:403:0x0d4b, B:405:0x0d54, B:407:0x0d60, B:409:0x0d66, B:410:0x0d6b, B:411:0x0d72, B:412:0x0d7b, B:415:0x0d89, B:416:0x0d92, B:417:0x0d99, B:419:0x0da1, B:420:0x0da8, B:421:0x0db1, B:422:0x0db6, B:424:0x0dbb, B:425:0x0dc0, B:426:0x0dc5, B:427:0x0dca, B:428:0x0dcf, B:429:0x0dd4, B:430:0x0dd9, B:431:0x0dde, B:432:0x0de3, B:433:0x0de8, B:434:0x0ded, B:435:0x0df2, B:436:0x0df7, B:437:0x0dfc, B:438:0x0e01, B:439:0x0e06, B:440:0x0e0b, B:441:0x0e65, B:442:0x0e6c, B:443:0x0e73, B:444:0x0e78, B:445:0x0e7f, B:448:0x0e8d, B:450:0x0e98, B:455:0x0ea6, B:456:0x0ead, B:457:0x0eb4, B:459:0x0ebd, B:465:0x0ec8, B:467:0x0ed0, B:470:0x0eda, B:472:0x0ee1, B:473:0x0ee8, B:474:0x0eee, B:477:0x0ef5, B:481:0x0f03, B:482:0x0f0a, B:483:0x0f11, B:485:0x0f18, B:486:0x0f1f, B:487:0x0f25, B:490:0x0f2c, B:494:0x0f3a, B:495:0x0f41, B:496:0x0f48, B:498:0x0f4f, B:499:0x0f56, B:500:0x0f5c, B:503:0x0f63, B:507:0x0f71, B:508:0x0f78, B:509:0x0f7f, B:511:0x0f86, B:512:0x0f8d, B:514:0x0f95, B:515:0x0f9a, B:516:0x0fa1, B:517:0x0fa8, B:520:0x0fb6, B:521:0x0fbf, B:523:0x0fc8, B:525:0x0fcf, B:526:0x0fd4, B:527:0x0fd9, B:530:0x0fe0, B:531:0x0fe7, B:533:0x0fee, B:536:0x0ff8, B:537:0x0fff, B:538:0x1006, B:540:0x1013, B:542:0x101a, B:543:0x101f, B:545:0x1028, B:546:0x102f, B:547:0x1034, B:550:0x103b, B:551:0x1042, B:554:0x104d, B:556:0x1054, B:557:0x1059, B:558:0x1062, B:561:0x1070, B:562:0x1079, B:564:0x1082, B:568:0x108e, B:570:0x1097, B:575:0x10a2, B:577:0x10ad, B:578:0x10b4, B:580:0x10bf, B:583:0x10cb, B:584:0x10d2, B:585:0x10d9, B:586:0x10e0, B:588:0x10ef, B:590:0x10f6, B:602:0x112d, B:604:0x1138, B:606:0x1140, B:607:0x1145, B:608:0x114c, B:609:0x1152, B:610:0x1159, B:612:0x1164, B:613:0x116b, B:614:0x1172, B:616:0x119c, B:618:0x11a3, B:620:0x11ad, B:622:0x11b2, B:624:0x11b9, B:626:0x11bf, B:630:0x11ce, B:725:0x1363, B:726:0x136a, B:728:0x1371, B:730:0x1378), top: B:8:0x0088, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0b8d A[Catch: EffectsFrameworkException -> 0x138d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {EffectsFrameworkException -> 0x138d, blocks: (B:9:0x0088, B:10:0x008f, B:11:0x0096, B:12:0x009d, B:15:0x00a7, B:18:0x00b3, B:19:0x00b8, B:20:0x00be, B:21:0x00c5, B:22:0x00cc, B:25:0x00d8, B:27:0x00df, B:29:0x00e6, B:31:0x00ed, B:34:0x060a, B:37:0x0616, B:40:0x0622, B:42:0x062c, B:44:0x0635, B:45:0x063c, B:47:0x0645, B:49:0x0654, B:51:0x066b, B:53:0x0671, B:54:0x0676, B:56:0x0682, B:58:0x068b, B:60:0x0693, B:62:0x069c, B:64:0x06ad, B:66:0x06b3, B:67:0x06b8, B:69:0x06c4, B:71:0x06cd, B:73:0x06d5, B:75:0x06de, B:77:0x06e7, B:79:0x06ef, B:81:0x06fb, B:83:0x0701, B:84:0x0706, B:86:0x0711, B:88:0x071a, B:90:0x0722, B:92:0x072b, B:94:0x0732, B:96:0x0739, B:98:0x0745, B:99:0x074c, B:100:0x0751, B:102:0x075a, B:104:0x0761, B:105:0x0766, B:106:0x076d, B:108:0x0778, B:110:0x0782, B:113:0x0792, B:114:0x0799, B:116:0x07a1, B:117:0x07aa, B:118:0x07b1, B:119:0x07b8, B:121:0x07c5, B:125:0x07d5, B:127:0x07dc, B:129:0x07e7, B:132:0x07f3, B:133:0x07fa, B:134:0x0801, B:136:0x080a, B:137:0x080f, B:139:0x0814, B:140:0x081b, B:141:0x0822, B:142:0x0829, B:143:0x0830, B:144:0x0837, B:145:0x083e, B:146:0x0845, B:147:0x084c, B:149:0x0853, B:152:0x085d, B:153:0x0864, B:154:0x0869, B:155:0x0870, B:156:0x0877, B:158:0x0882, B:160:0x088b, B:162:0x0892, B:165:0x089c, B:166:0x08a3, B:168:0x08ac, B:170:0x08b5, B:171:0x08bc, B:173:0x08c8, B:175:0x08d0, B:177:0x08d7, B:179:0x08de, B:181:0x08ea, B:182:0x08f1, B:183:0x08f6, B:185:0x08ff, B:187:0x0906, B:188:0x090b, B:190:0x0916, B:192:0x0920, B:195:0x092a, B:196:0x0931, B:198:0x093a, B:200:0x0943, B:201:0x094a, B:203:0x0956, B:205:0x095e, B:207:0x0965, B:209:0x096c, B:211:0x0978, B:212:0x097f, B:213:0x0984, B:215:0x098d, B:217:0x0994, B:218:0x0999, B:220:0x09a4, B:222:0x09ae, B:225:0x09b8, B:229:0x0a15, B:232:0x0a1f, B:233:0x0a26, B:234:0x0a2b, B:235:0x0a32, B:237:0x0a39, B:240:0x0a43, B:241:0x0a4c, B:243:0x0a54, B:244:0x0a5d, B:245:0x0a64, B:246:0x0a6d, B:248:0x0a7a, B:252:0x0a8c, B:254:0x0a93, B:256:0x0aa0, B:259:0x0aac, B:260:0x0ab3, B:261:0x0ab8, B:262:0x0abf, B:264:0x0aca, B:266:0x0ad3, B:268:0x0ada, B:269:0x0adf, B:271:0x0ae6, B:273:0x0aed, B:276:0x0af7, B:279:0x0b03, B:281:0x0b0f, B:282:0x0b16, B:286:0x0b24, B:287:0x0b28, B:289:0x0b2d, B:291:0x0b36, B:295:0x0b44, B:296:0x0b4b, B:297:0x0b52, B:299:0x0b5a, B:301:0x0b60, B:303:0x0b67, B:304:0x0b6c, B:305:0x0b73, B:306:0x0b7a, B:307:0x0b81, B:310:0x0b8d, B:314:0x0b9e, B:317:0x0baa, B:318:0x0bb1, B:319:0x0bb8, B:323:0x0bc9, B:327:0x0bda, B:328:0x0be1, B:329:0x0be8, B:331:0x0bf1, B:334:0x0bfd, B:336:0x0c04, B:340:0x0c10, B:341:0x0c17, B:342:0x0c1e, B:343:0x0c25, B:344:0x0c2c, B:345:0x0c33, B:346:0x0c3a, B:347:0x0c41, B:349:0x0c48, B:350:0x0c4d, B:353:0x0c59, B:355:0x0c60, B:358:0x0c6d, B:361:0x0c7c, B:362:0x0c83, B:364:0x0c8a, B:365:0x0c91, B:367:0x0c98, B:370:0x0ca2, B:373:0x0cae, B:374:0x0cb5, B:375:0x0cbc, B:377:0x0cc5, B:380:0x0ccf, B:382:0x0cda, B:383:0x0ce1, B:385:0x0cec, B:387:0x0cf7, B:389:0x0d02, B:391:0x0d14, B:393:0x0d1b, B:394:0x0d20, B:395:0x0d27, B:397:0x0d35, B:398:0x0d3c, B:634:0x11dd, B:635:0x11e4, B:639:0x11f2, B:640:0x11f9, B:641:0x1200, B:643:0x1208, B:645:0x120e, B:647:0x1213, B:651:0x1221, B:652:0x1228, B:653:0x122f, B:655:0x1237, B:657:0x123d, B:661:0x124c, B:663:0x1252, B:666:0x125c, B:668:0x1264, B:670:0x126a, B:671:0x126f, B:673:0x1276, B:674:0x127d, B:676:0x1286, B:679:0x1292, B:680:0x1299, B:681:0x12a0, B:682:0x12a7, B:685:0x12b3, B:687:0x12ba, B:688:0x12ce, B:691:0x12da, B:693:0x12c0, B:695:0x12c6, B:699:0x12ea, B:700:0x12f1, B:702:0x1304, B:705:0x130f, B:709:0x1321, B:711:0x1329, B:717:0x1336, B:719:0x1345, B:721:0x1357, B:734:0x1385, B:736:0x138c, B:737:0x09c4, B:738:0x09cb, B:739:0x09d2, B:740:0x09d9, B:741:0x09e0, B:742:0x09e7, B:744:0x0a0e, B:747:0x0114, B:750:0x0120, B:751:0x0125, B:753:0x0132, B:756:0x0140, B:758:0x0151, B:759:0x0158, B:761:0x016d, B:763:0x0178, B:764:0x017f, B:766:0x018a, B:768:0x0192, B:770:0x0199, B:772:0x01a4, B:773:0x01ab, B:775:0x01b3, B:776:0x01bc, B:777:0x01c3, B:778:0x01ca, B:780:0x01d7, B:784:0x01e7, B:786:0x01ee, B:788:0x01f9, B:791:0x0205, B:794:0x020c, B:796:0x0215, B:798:0x021c, B:802:0x0256, B:803:0x025b, B:804:0x0262, B:805:0x0269, B:806:0x0270, B:807:0x0277, B:808:0x027e, B:809:0x0285, B:810:0x028c, B:811:0x0293, B:813:0x022f, B:815:0x023d, B:817:0x0248, B:818:0x024f, B:820:0x02a2, B:821:0x02a9, B:823:0x02b4, B:826:0x02bb, B:829:0x02c5, B:831:0x02d5, B:832:0x02dc, B:833:0x02e3, B:835:0x02ec, B:837:0x02f6, B:839:0x0304, B:840:0x030b, B:842:0x0314, B:844:0x031e, B:848:0x0331, B:849:0x0338, B:851:0x0341, B:853:0x034b, B:855:0x0359, B:856:0x0360, B:858:0x0369, B:860:0x0373, B:864:0x0386, B:865:0x038d, B:867:0x0396, B:869:0x039f, B:871:0x03b0, B:876:0x03db, B:879:0x03e5, B:881:0x03f5, B:882:0x03fc, B:883:0x0403, B:885:0x040c, B:887:0x0416, B:889:0x0424, B:890:0x042b, B:892:0x0434, B:894:0x043e, B:895:0x0443, B:896:0x0448, B:898:0x0453, B:900:0x045b, B:904:0x047d, B:907:0x0487, B:909:0x0497, B:910:0x049e, B:912:0x04a7, B:914:0x04b1, B:916:0x04bf, B:918:0x04c8, B:920:0x04d2, B:922:0x04e0, B:924:0x04e9, B:926:0x04f3, B:930:0x0506, B:932:0x050f, B:935:0x051c, B:936:0x0523, B:937:0x052a, B:939:0x0534, B:942:0x053f, B:943:0x0546, B:946:0x0552, B:948:0x055c, B:953:0x059f, B:955:0x05a7, B:957:0x05b0, B:959:0x05bc, B:960:0x05c4, B:964:0x05e0, B:965:0x05e7, B:967:0x05f3, B:969:0x0600, B:971:0x057e, B:972:0x0585, B:975:0x0591, B:980:0x0465, B:981:0x046c, B:983:0x0476, B:985:0x03c3, B:986:0x03ca, B:988:0x03d4, B:990:0x00fa, B:991:0x0101, B:402:0x0d45, B:403:0x0d4b, B:405:0x0d54, B:407:0x0d60, B:409:0x0d66, B:410:0x0d6b, B:411:0x0d72, B:412:0x0d7b, B:415:0x0d89, B:416:0x0d92, B:417:0x0d99, B:419:0x0da1, B:420:0x0da8, B:421:0x0db1, B:422:0x0db6, B:424:0x0dbb, B:425:0x0dc0, B:426:0x0dc5, B:427:0x0dca, B:428:0x0dcf, B:429:0x0dd4, B:430:0x0dd9, B:431:0x0dde, B:432:0x0de3, B:433:0x0de8, B:434:0x0ded, B:435:0x0df2, B:436:0x0df7, B:437:0x0dfc, B:438:0x0e01, B:439:0x0e06, B:440:0x0e0b, B:441:0x0e65, B:442:0x0e6c, B:443:0x0e73, B:444:0x0e78, B:445:0x0e7f, B:448:0x0e8d, B:450:0x0e98, B:455:0x0ea6, B:456:0x0ead, B:457:0x0eb4, B:459:0x0ebd, B:465:0x0ec8, B:467:0x0ed0, B:470:0x0eda, B:472:0x0ee1, B:473:0x0ee8, B:474:0x0eee, B:477:0x0ef5, B:481:0x0f03, B:482:0x0f0a, B:483:0x0f11, B:485:0x0f18, B:486:0x0f1f, B:487:0x0f25, B:490:0x0f2c, B:494:0x0f3a, B:495:0x0f41, B:496:0x0f48, B:498:0x0f4f, B:499:0x0f56, B:500:0x0f5c, B:503:0x0f63, B:507:0x0f71, B:508:0x0f78, B:509:0x0f7f, B:511:0x0f86, B:512:0x0f8d, B:514:0x0f95, B:515:0x0f9a, B:516:0x0fa1, B:517:0x0fa8, B:520:0x0fb6, B:521:0x0fbf, B:523:0x0fc8, B:525:0x0fcf, B:526:0x0fd4, B:527:0x0fd9, B:530:0x0fe0, B:531:0x0fe7, B:533:0x0fee, B:536:0x0ff8, B:537:0x0fff, B:538:0x1006, B:540:0x1013, B:542:0x101a, B:543:0x101f, B:545:0x1028, B:546:0x102f, B:547:0x1034, B:550:0x103b, B:551:0x1042, B:554:0x104d, B:556:0x1054, B:557:0x1059, B:558:0x1062, B:561:0x1070, B:562:0x1079, B:564:0x1082, B:568:0x108e, B:570:0x1097, B:575:0x10a2, B:577:0x10ad, B:578:0x10b4, B:580:0x10bf, B:583:0x10cb, B:584:0x10d2, B:585:0x10d9, B:586:0x10e0, B:588:0x10ef, B:590:0x10f6, B:602:0x112d, B:604:0x1138, B:606:0x1140, B:607:0x1145, B:608:0x114c, B:609:0x1152, B:610:0x1159, B:612:0x1164, B:613:0x116b, B:614:0x1172, B:616:0x119c, B:618:0x11a3, B:620:0x11ad, B:622:0x11b2, B:624:0x11b9, B:626:0x11bf, B:630:0x11ce, B:725:0x1363, B:726:0x136a, B:728:0x1371, B:730:0x1378), top: B:8:0x0088, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0c59 A[Catch: EffectsFrameworkException -> 0x138d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {EffectsFrameworkException -> 0x138d, blocks: (B:9:0x0088, B:10:0x008f, B:11:0x0096, B:12:0x009d, B:15:0x00a7, B:18:0x00b3, B:19:0x00b8, B:20:0x00be, B:21:0x00c5, B:22:0x00cc, B:25:0x00d8, B:27:0x00df, B:29:0x00e6, B:31:0x00ed, B:34:0x060a, B:37:0x0616, B:40:0x0622, B:42:0x062c, B:44:0x0635, B:45:0x063c, B:47:0x0645, B:49:0x0654, B:51:0x066b, B:53:0x0671, B:54:0x0676, B:56:0x0682, B:58:0x068b, B:60:0x0693, B:62:0x069c, B:64:0x06ad, B:66:0x06b3, B:67:0x06b8, B:69:0x06c4, B:71:0x06cd, B:73:0x06d5, B:75:0x06de, B:77:0x06e7, B:79:0x06ef, B:81:0x06fb, B:83:0x0701, B:84:0x0706, B:86:0x0711, B:88:0x071a, B:90:0x0722, B:92:0x072b, B:94:0x0732, B:96:0x0739, B:98:0x0745, B:99:0x074c, B:100:0x0751, B:102:0x075a, B:104:0x0761, B:105:0x0766, B:106:0x076d, B:108:0x0778, B:110:0x0782, B:113:0x0792, B:114:0x0799, B:116:0x07a1, B:117:0x07aa, B:118:0x07b1, B:119:0x07b8, B:121:0x07c5, B:125:0x07d5, B:127:0x07dc, B:129:0x07e7, B:132:0x07f3, B:133:0x07fa, B:134:0x0801, B:136:0x080a, B:137:0x080f, B:139:0x0814, B:140:0x081b, B:141:0x0822, B:142:0x0829, B:143:0x0830, B:144:0x0837, B:145:0x083e, B:146:0x0845, B:147:0x084c, B:149:0x0853, B:152:0x085d, B:153:0x0864, B:154:0x0869, B:155:0x0870, B:156:0x0877, B:158:0x0882, B:160:0x088b, B:162:0x0892, B:165:0x089c, B:166:0x08a3, B:168:0x08ac, B:170:0x08b5, B:171:0x08bc, B:173:0x08c8, B:175:0x08d0, B:177:0x08d7, B:179:0x08de, B:181:0x08ea, B:182:0x08f1, B:183:0x08f6, B:185:0x08ff, B:187:0x0906, B:188:0x090b, B:190:0x0916, B:192:0x0920, B:195:0x092a, B:196:0x0931, B:198:0x093a, B:200:0x0943, B:201:0x094a, B:203:0x0956, B:205:0x095e, B:207:0x0965, B:209:0x096c, B:211:0x0978, B:212:0x097f, B:213:0x0984, B:215:0x098d, B:217:0x0994, B:218:0x0999, B:220:0x09a4, B:222:0x09ae, B:225:0x09b8, B:229:0x0a15, B:232:0x0a1f, B:233:0x0a26, B:234:0x0a2b, B:235:0x0a32, B:237:0x0a39, B:240:0x0a43, B:241:0x0a4c, B:243:0x0a54, B:244:0x0a5d, B:245:0x0a64, B:246:0x0a6d, B:248:0x0a7a, B:252:0x0a8c, B:254:0x0a93, B:256:0x0aa0, B:259:0x0aac, B:260:0x0ab3, B:261:0x0ab8, B:262:0x0abf, B:264:0x0aca, B:266:0x0ad3, B:268:0x0ada, B:269:0x0adf, B:271:0x0ae6, B:273:0x0aed, B:276:0x0af7, B:279:0x0b03, B:281:0x0b0f, B:282:0x0b16, B:286:0x0b24, B:287:0x0b28, B:289:0x0b2d, B:291:0x0b36, B:295:0x0b44, B:296:0x0b4b, B:297:0x0b52, B:299:0x0b5a, B:301:0x0b60, B:303:0x0b67, B:304:0x0b6c, B:305:0x0b73, B:306:0x0b7a, B:307:0x0b81, B:310:0x0b8d, B:314:0x0b9e, B:317:0x0baa, B:318:0x0bb1, B:319:0x0bb8, B:323:0x0bc9, B:327:0x0bda, B:328:0x0be1, B:329:0x0be8, B:331:0x0bf1, B:334:0x0bfd, B:336:0x0c04, B:340:0x0c10, B:341:0x0c17, B:342:0x0c1e, B:343:0x0c25, B:344:0x0c2c, B:345:0x0c33, B:346:0x0c3a, B:347:0x0c41, B:349:0x0c48, B:350:0x0c4d, B:353:0x0c59, B:355:0x0c60, B:358:0x0c6d, B:361:0x0c7c, B:362:0x0c83, B:364:0x0c8a, B:365:0x0c91, B:367:0x0c98, B:370:0x0ca2, B:373:0x0cae, B:374:0x0cb5, B:375:0x0cbc, B:377:0x0cc5, B:380:0x0ccf, B:382:0x0cda, B:383:0x0ce1, B:385:0x0cec, B:387:0x0cf7, B:389:0x0d02, B:391:0x0d14, B:393:0x0d1b, B:394:0x0d20, B:395:0x0d27, B:397:0x0d35, B:398:0x0d3c, B:634:0x11dd, B:635:0x11e4, B:639:0x11f2, B:640:0x11f9, B:641:0x1200, B:643:0x1208, B:645:0x120e, B:647:0x1213, B:651:0x1221, B:652:0x1228, B:653:0x122f, B:655:0x1237, B:657:0x123d, B:661:0x124c, B:663:0x1252, B:666:0x125c, B:668:0x1264, B:670:0x126a, B:671:0x126f, B:673:0x1276, B:674:0x127d, B:676:0x1286, B:679:0x1292, B:680:0x1299, B:681:0x12a0, B:682:0x12a7, B:685:0x12b3, B:687:0x12ba, B:688:0x12ce, B:691:0x12da, B:693:0x12c0, B:695:0x12c6, B:699:0x12ea, B:700:0x12f1, B:702:0x1304, B:705:0x130f, B:709:0x1321, B:711:0x1329, B:717:0x1336, B:719:0x1345, B:721:0x1357, B:734:0x1385, B:736:0x138c, B:737:0x09c4, B:738:0x09cb, B:739:0x09d2, B:740:0x09d9, B:741:0x09e0, B:742:0x09e7, B:744:0x0a0e, B:747:0x0114, B:750:0x0120, B:751:0x0125, B:753:0x0132, B:756:0x0140, B:758:0x0151, B:759:0x0158, B:761:0x016d, B:763:0x0178, B:764:0x017f, B:766:0x018a, B:768:0x0192, B:770:0x0199, B:772:0x01a4, B:773:0x01ab, B:775:0x01b3, B:776:0x01bc, B:777:0x01c3, B:778:0x01ca, B:780:0x01d7, B:784:0x01e7, B:786:0x01ee, B:788:0x01f9, B:791:0x0205, B:794:0x020c, B:796:0x0215, B:798:0x021c, B:802:0x0256, B:803:0x025b, B:804:0x0262, B:805:0x0269, B:806:0x0270, B:807:0x0277, B:808:0x027e, B:809:0x0285, B:810:0x028c, B:811:0x0293, B:813:0x022f, B:815:0x023d, B:817:0x0248, B:818:0x024f, B:820:0x02a2, B:821:0x02a9, B:823:0x02b4, B:826:0x02bb, B:829:0x02c5, B:831:0x02d5, B:832:0x02dc, B:833:0x02e3, B:835:0x02ec, B:837:0x02f6, B:839:0x0304, B:840:0x030b, B:842:0x0314, B:844:0x031e, B:848:0x0331, B:849:0x0338, B:851:0x0341, B:853:0x034b, B:855:0x0359, B:856:0x0360, B:858:0x0369, B:860:0x0373, B:864:0x0386, B:865:0x038d, B:867:0x0396, B:869:0x039f, B:871:0x03b0, B:876:0x03db, B:879:0x03e5, B:881:0x03f5, B:882:0x03fc, B:883:0x0403, B:885:0x040c, B:887:0x0416, B:889:0x0424, B:890:0x042b, B:892:0x0434, B:894:0x043e, B:895:0x0443, B:896:0x0448, B:898:0x0453, B:900:0x045b, B:904:0x047d, B:907:0x0487, B:909:0x0497, B:910:0x049e, B:912:0x04a7, B:914:0x04b1, B:916:0x04bf, B:918:0x04c8, B:920:0x04d2, B:922:0x04e0, B:924:0x04e9, B:926:0x04f3, B:930:0x0506, B:932:0x050f, B:935:0x051c, B:936:0x0523, B:937:0x052a, B:939:0x0534, B:942:0x053f, B:943:0x0546, B:946:0x0552, B:948:0x055c, B:953:0x059f, B:955:0x05a7, B:957:0x05b0, B:959:0x05bc, B:960:0x05c4, B:964:0x05e0, B:965:0x05e7, B:967:0x05f3, B:969:0x0600, B:971:0x057e, B:972:0x0585, B:975:0x0591, B:980:0x0465, B:981:0x046c, B:983:0x0476, B:985:0x03c3, B:986:0x03ca, B:988:0x03d4, B:990:0x00fa, B:991:0x0101, B:402:0x0d45, B:403:0x0d4b, B:405:0x0d54, B:407:0x0d60, B:409:0x0d66, B:410:0x0d6b, B:411:0x0d72, B:412:0x0d7b, B:415:0x0d89, B:416:0x0d92, B:417:0x0d99, B:419:0x0da1, B:420:0x0da8, B:421:0x0db1, B:422:0x0db6, B:424:0x0dbb, B:425:0x0dc0, B:426:0x0dc5, B:427:0x0dca, B:428:0x0dcf, B:429:0x0dd4, B:430:0x0dd9, B:431:0x0dde, B:432:0x0de3, B:433:0x0de8, B:434:0x0ded, B:435:0x0df2, B:436:0x0df7, B:437:0x0dfc, B:438:0x0e01, B:439:0x0e06, B:440:0x0e0b, B:441:0x0e65, B:442:0x0e6c, B:443:0x0e73, B:444:0x0e78, B:445:0x0e7f, B:448:0x0e8d, B:450:0x0e98, B:455:0x0ea6, B:456:0x0ead, B:457:0x0eb4, B:459:0x0ebd, B:465:0x0ec8, B:467:0x0ed0, B:470:0x0eda, B:472:0x0ee1, B:473:0x0ee8, B:474:0x0eee, B:477:0x0ef5, B:481:0x0f03, B:482:0x0f0a, B:483:0x0f11, B:485:0x0f18, B:486:0x0f1f, B:487:0x0f25, B:490:0x0f2c, B:494:0x0f3a, B:495:0x0f41, B:496:0x0f48, B:498:0x0f4f, B:499:0x0f56, B:500:0x0f5c, B:503:0x0f63, B:507:0x0f71, B:508:0x0f78, B:509:0x0f7f, B:511:0x0f86, B:512:0x0f8d, B:514:0x0f95, B:515:0x0f9a, B:516:0x0fa1, B:517:0x0fa8, B:520:0x0fb6, B:521:0x0fbf, B:523:0x0fc8, B:525:0x0fcf, B:526:0x0fd4, B:527:0x0fd9, B:530:0x0fe0, B:531:0x0fe7, B:533:0x0fee, B:536:0x0ff8, B:537:0x0fff, B:538:0x1006, B:540:0x1013, B:542:0x101a, B:543:0x101f, B:545:0x1028, B:546:0x102f, B:547:0x1034, B:550:0x103b, B:551:0x1042, B:554:0x104d, B:556:0x1054, B:557:0x1059, B:558:0x1062, B:561:0x1070, B:562:0x1079, B:564:0x1082, B:568:0x108e, B:570:0x1097, B:575:0x10a2, B:577:0x10ad, B:578:0x10b4, B:580:0x10bf, B:583:0x10cb, B:584:0x10d2, B:585:0x10d9, B:586:0x10e0, B:588:0x10ef, B:590:0x10f6, B:602:0x112d, B:604:0x1138, B:606:0x1140, B:607:0x1145, B:608:0x114c, B:609:0x1152, B:610:0x1159, B:612:0x1164, B:613:0x116b, B:614:0x1172, B:616:0x119c, B:618:0x11a3, B:620:0x11ad, B:622:0x11b2, B:624:0x11b9, B:626:0x11bf, B:630:0x11ce, B:725:0x1363, B:726:0x136a, B:728:0x1371, B:730:0x1378), top: B:8:0x0088, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0c76  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0d89 A[Catch: UnsatisfiedLinkError -> 0x1361, all -> 0x1379, TRY_ENTER, TRY_LEAVE, TryCatch #1 {UnsatisfiedLinkError -> 0x1361, blocks: (B:402:0x0d45, B:403:0x0d4b, B:405:0x0d54, B:407:0x0d60, B:409:0x0d66, B:410:0x0d6b, B:411:0x0d72, B:412:0x0d7b, B:415:0x0d89, B:416:0x0d92, B:417:0x0d99, B:419:0x0da1, B:420:0x0da8, B:421:0x0db1, B:422:0x0db6, B:422:0x0db6, B:424:0x0dbb, B:425:0x0dc0, B:426:0x0dc5, B:427:0x0dca, B:428:0x0dcf, B:429:0x0dd4, B:430:0x0dd9, B:431:0x0dde, B:432:0x0de3, B:433:0x0de8, B:434:0x0ded, B:435:0x0df2, B:436:0x0df7, B:437:0x0dfc, B:438:0x0e01, B:439:0x0e06, B:440:0x0e0b, B:441:0x0e65, B:442:0x0e6c, B:443:0x0e73, B:444:0x0e78, B:445:0x0e7f, B:448:0x0e8d, B:450:0x0e98, B:455:0x0ea6, B:456:0x0ead, B:457:0x0eb4, B:459:0x0ebd, B:465:0x0ec8, B:467:0x0ed0, B:470:0x0eda, B:472:0x0ee1, B:473:0x0ee8, B:474:0x0eee, B:474:0x0eee, B:477:0x0ef5, B:481:0x0f03, B:482:0x0f0a, B:483:0x0f11, B:485:0x0f18, B:486:0x0f1f, B:487:0x0f25, B:487:0x0f25, B:490:0x0f2c, B:494:0x0f3a, B:495:0x0f41, B:496:0x0f48, B:498:0x0f4f, B:499:0x0f56, B:500:0x0f5c, B:500:0x0f5c, B:503:0x0f63, B:507:0x0f71, B:508:0x0f78, B:509:0x0f7f, B:511:0x0f86, B:512:0x0f8d, B:514:0x0f95, B:515:0x0f9a, B:516:0x0fa1, B:517:0x0fa8, B:520:0x0fb6, B:521:0x0fbf, B:523:0x0fc8, B:525:0x0fcf, B:526:0x0fd4, B:527:0x0fd9, B:527:0x0fd9, B:530:0x0fe0, B:531:0x0fe7, B:533:0x0fee, B:536:0x0ff8, B:537:0x0fff, B:538:0x1006, B:540:0x1013, B:542:0x101a, B:543:0x101f, B:545:0x1028, B:546:0x102f, B:547:0x1034, B:547:0x1034, B:550:0x103b, B:551:0x1042, B:554:0x104d, B:556:0x1054, B:557:0x1059, B:558:0x1062, B:561:0x1070, B:562:0x1079, B:564:0x1082, B:568:0x108e, B:570:0x1097, B:575:0x10a2, B:577:0x10ad, B:578:0x10b4, B:580:0x10bf, B:583:0x10cb, B:584:0x10d2, B:585:0x10d9, B:586:0x10e0, B:588:0x10ef, B:590:0x10f6, B:602:0x112d, B:604:0x1138, B:606:0x1140, B:607:0x1145, B:608:0x114c, B:609:0x1152, B:610:0x1159, B:612:0x1164, B:613:0x116b, B:614:0x1172, B:616:0x119c, B:618:0x11a3, B:620:0x11ad, B:622:0x11b2, B:624:0x11b9, B:626:0x11bf, B:630:0x11ce), top: B:401:0x0d45, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0e8d A[Catch: UnsatisfiedLinkError -> 0x1361, all -> 0x1379, TRY_ENTER, TRY_LEAVE, TryCatch #1 {UnsatisfiedLinkError -> 0x1361, blocks: (B:402:0x0d45, B:403:0x0d4b, B:405:0x0d54, B:407:0x0d60, B:409:0x0d66, B:410:0x0d6b, B:411:0x0d72, B:412:0x0d7b, B:415:0x0d89, B:416:0x0d92, B:417:0x0d99, B:419:0x0da1, B:420:0x0da8, B:421:0x0db1, B:422:0x0db6, B:422:0x0db6, B:424:0x0dbb, B:425:0x0dc0, B:426:0x0dc5, B:427:0x0dca, B:428:0x0dcf, B:429:0x0dd4, B:430:0x0dd9, B:431:0x0dde, B:432:0x0de3, B:433:0x0de8, B:434:0x0ded, B:435:0x0df2, B:436:0x0df7, B:437:0x0dfc, B:438:0x0e01, B:439:0x0e06, B:440:0x0e0b, B:441:0x0e65, B:442:0x0e6c, B:443:0x0e73, B:444:0x0e78, B:445:0x0e7f, B:448:0x0e8d, B:450:0x0e98, B:455:0x0ea6, B:456:0x0ead, B:457:0x0eb4, B:459:0x0ebd, B:465:0x0ec8, B:467:0x0ed0, B:470:0x0eda, B:472:0x0ee1, B:473:0x0ee8, B:474:0x0eee, B:474:0x0eee, B:477:0x0ef5, B:481:0x0f03, B:482:0x0f0a, B:483:0x0f11, B:485:0x0f18, B:486:0x0f1f, B:487:0x0f25, B:487:0x0f25, B:490:0x0f2c, B:494:0x0f3a, B:495:0x0f41, B:496:0x0f48, B:498:0x0f4f, B:499:0x0f56, B:500:0x0f5c, B:500:0x0f5c, B:503:0x0f63, B:507:0x0f71, B:508:0x0f78, B:509:0x0f7f, B:511:0x0f86, B:512:0x0f8d, B:514:0x0f95, B:515:0x0f9a, B:516:0x0fa1, B:517:0x0fa8, B:520:0x0fb6, B:521:0x0fbf, B:523:0x0fc8, B:525:0x0fcf, B:526:0x0fd4, B:527:0x0fd9, B:527:0x0fd9, B:530:0x0fe0, B:531:0x0fe7, B:533:0x0fee, B:536:0x0ff8, B:537:0x0fff, B:538:0x1006, B:540:0x1013, B:542:0x101a, B:543:0x101f, B:545:0x1028, B:546:0x102f, B:547:0x1034, B:547:0x1034, B:550:0x103b, B:551:0x1042, B:554:0x104d, B:556:0x1054, B:557:0x1059, B:558:0x1062, B:561:0x1070, B:562:0x1079, B:564:0x1082, B:568:0x108e, B:570:0x1097, B:575:0x10a2, B:577:0x10ad, B:578:0x10b4, B:580:0x10bf, B:583:0x10cb, B:584:0x10d2, B:585:0x10d9, B:586:0x10e0, B:588:0x10ef, B:590:0x10f6, B:602:0x112d, B:604:0x1138, B:606:0x1140, B:607:0x1145, B:608:0x114c, B:609:0x1152, B:610:0x1159, B:612:0x1164, B:613:0x116b, B:614:0x1172, B:616:0x119c, B:618:0x11a3, B:620:0x11ad, B:622:0x11b2, B:624:0x11b9, B:626:0x11bf, B:630:0x11ce), top: B:401:0x0d45, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0eda A[Catch: UnsatisfiedLinkError -> 0x1361, all -> 0x1379, TRY_ENTER, TRY_LEAVE, TryCatch #1 {UnsatisfiedLinkError -> 0x1361, blocks: (B:402:0x0d45, B:403:0x0d4b, B:405:0x0d54, B:407:0x0d60, B:409:0x0d66, B:410:0x0d6b, B:411:0x0d72, B:412:0x0d7b, B:415:0x0d89, B:416:0x0d92, B:417:0x0d99, B:419:0x0da1, B:420:0x0da8, B:421:0x0db1, B:422:0x0db6, B:422:0x0db6, B:424:0x0dbb, B:425:0x0dc0, B:426:0x0dc5, B:427:0x0dca, B:428:0x0dcf, B:429:0x0dd4, B:430:0x0dd9, B:431:0x0dde, B:432:0x0de3, B:433:0x0de8, B:434:0x0ded, B:435:0x0df2, B:436:0x0df7, B:437:0x0dfc, B:438:0x0e01, B:439:0x0e06, B:440:0x0e0b, B:441:0x0e65, B:442:0x0e6c, B:443:0x0e73, B:444:0x0e78, B:445:0x0e7f, B:448:0x0e8d, B:450:0x0e98, B:455:0x0ea6, B:456:0x0ead, B:457:0x0eb4, B:459:0x0ebd, B:465:0x0ec8, B:467:0x0ed0, B:470:0x0eda, B:472:0x0ee1, B:473:0x0ee8, B:474:0x0eee, B:474:0x0eee, B:477:0x0ef5, B:481:0x0f03, B:482:0x0f0a, B:483:0x0f11, B:485:0x0f18, B:486:0x0f1f, B:487:0x0f25, B:487:0x0f25, B:490:0x0f2c, B:494:0x0f3a, B:495:0x0f41, B:496:0x0f48, B:498:0x0f4f, B:499:0x0f56, B:500:0x0f5c, B:500:0x0f5c, B:503:0x0f63, B:507:0x0f71, B:508:0x0f78, B:509:0x0f7f, B:511:0x0f86, B:512:0x0f8d, B:514:0x0f95, B:515:0x0f9a, B:516:0x0fa1, B:517:0x0fa8, B:520:0x0fb6, B:521:0x0fbf, B:523:0x0fc8, B:525:0x0fcf, B:526:0x0fd4, B:527:0x0fd9, B:527:0x0fd9, B:530:0x0fe0, B:531:0x0fe7, B:533:0x0fee, B:536:0x0ff8, B:537:0x0fff, B:538:0x1006, B:540:0x1013, B:542:0x101a, B:543:0x101f, B:545:0x1028, B:546:0x102f, B:547:0x1034, B:547:0x1034, B:550:0x103b, B:551:0x1042, B:554:0x104d, B:556:0x1054, B:557:0x1059, B:558:0x1062, B:561:0x1070, B:562:0x1079, B:564:0x1082, B:568:0x108e, B:570:0x1097, B:575:0x10a2, B:577:0x10ad, B:578:0x10b4, B:580:0x10bf, B:583:0x10cb, B:584:0x10d2, B:585:0x10d9, B:586:0x10e0, B:588:0x10ef, B:590:0x10f6, B:602:0x112d, B:604:0x1138, B:606:0x1140, B:607:0x1145, B:608:0x114c, B:609:0x1152, B:610:0x1159, B:612:0x1164, B:613:0x116b, B:614:0x1172, B:616:0x119c, B:618:0x11a3, B:620:0x11ad, B:622:0x11b2, B:624:0x11b9, B:626:0x11bf, B:630:0x11ce), top: B:401:0x0d45, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0f01  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0f6f  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0fb6 A[Catch: UnsatisfiedLinkError -> 0x1361, all -> 0x1379, TRY_ENTER, TRY_LEAVE, TryCatch #1 {UnsatisfiedLinkError -> 0x1361, blocks: (B:402:0x0d45, B:403:0x0d4b, B:405:0x0d54, B:407:0x0d60, B:409:0x0d66, B:410:0x0d6b, B:411:0x0d72, B:412:0x0d7b, B:415:0x0d89, B:416:0x0d92, B:417:0x0d99, B:419:0x0da1, B:420:0x0da8, B:421:0x0db1, B:422:0x0db6, B:422:0x0db6, B:424:0x0dbb, B:425:0x0dc0, B:426:0x0dc5, B:427:0x0dca, B:428:0x0dcf, B:429:0x0dd4, B:430:0x0dd9, B:431:0x0dde, B:432:0x0de3, B:433:0x0de8, B:434:0x0ded, B:435:0x0df2, B:436:0x0df7, B:437:0x0dfc, B:438:0x0e01, B:439:0x0e06, B:440:0x0e0b, B:441:0x0e65, B:442:0x0e6c, B:443:0x0e73, B:444:0x0e78, B:445:0x0e7f, B:448:0x0e8d, B:450:0x0e98, B:455:0x0ea6, B:456:0x0ead, B:457:0x0eb4, B:459:0x0ebd, B:465:0x0ec8, B:467:0x0ed0, B:470:0x0eda, B:472:0x0ee1, B:473:0x0ee8, B:474:0x0eee, B:474:0x0eee, B:477:0x0ef5, B:481:0x0f03, B:482:0x0f0a, B:483:0x0f11, B:485:0x0f18, B:486:0x0f1f, B:487:0x0f25, B:487:0x0f25, B:490:0x0f2c, B:494:0x0f3a, B:495:0x0f41, B:496:0x0f48, B:498:0x0f4f, B:499:0x0f56, B:500:0x0f5c, B:500:0x0f5c, B:503:0x0f63, B:507:0x0f71, B:508:0x0f78, B:509:0x0f7f, B:511:0x0f86, B:512:0x0f8d, B:514:0x0f95, B:515:0x0f9a, B:516:0x0fa1, B:517:0x0fa8, B:520:0x0fb6, B:521:0x0fbf, B:523:0x0fc8, B:525:0x0fcf, B:526:0x0fd4, B:527:0x0fd9, B:527:0x0fd9, B:530:0x0fe0, B:531:0x0fe7, B:533:0x0fee, B:536:0x0ff8, B:537:0x0fff, B:538:0x1006, B:540:0x1013, B:542:0x101a, B:543:0x101f, B:545:0x1028, B:546:0x102f, B:547:0x1034, B:547:0x1034, B:550:0x103b, B:551:0x1042, B:554:0x104d, B:556:0x1054, B:557:0x1059, B:558:0x1062, B:561:0x1070, B:562:0x1079, B:564:0x1082, B:568:0x108e, B:570:0x1097, B:575:0x10a2, B:577:0x10ad, B:578:0x10b4, B:580:0x10bf, B:583:0x10cb, B:584:0x10d2, B:585:0x10d9, B:586:0x10e0, B:588:0x10ef, B:590:0x10f6, B:602:0x112d, B:604:0x1138, B:606:0x1140, B:607:0x1145, B:608:0x114c, B:609:0x1152, B:610:0x1159, B:612:0x1164, B:613:0x116b, B:614:0x1172, B:616:0x119c, B:618:0x11a3, B:620:0x11ad, B:622:0x11b2, B:624:0x11b9, B:626:0x11bf, B:630:0x11ce), top: B:401:0x0d45, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x1070 A[Catch: UnsatisfiedLinkError -> 0x1361, all -> 0x1379, TRY_ENTER, TRY_LEAVE, TryCatch #1 {UnsatisfiedLinkError -> 0x1361, blocks: (B:402:0x0d45, B:403:0x0d4b, B:405:0x0d54, B:407:0x0d60, B:409:0x0d66, B:410:0x0d6b, B:411:0x0d72, B:412:0x0d7b, B:415:0x0d89, B:416:0x0d92, B:417:0x0d99, B:419:0x0da1, B:420:0x0da8, B:421:0x0db1, B:422:0x0db6, B:422:0x0db6, B:424:0x0dbb, B:425:0x0dc0, B:426:0x0dc5, B:427:0x0dca, B:428:0x0dcf, B:429:0x0dd4, B:430:0x0dd9, B:431:0x0dde, B:432:0x0de3, B:433:0x0de8, B:434:0x0ded, B:435:0x0df2, B:436:0x0df7, B:437:0x0dfc, B:438:0x0e01, B:439:0x0e06, B:440:0x0e0b, B:441:0x0e65, B:442:0x0e6c, B:443:0x0e73, B:444:0x0e78, B:445:0x0e7f, B:448:0x0e8d, B:450:0x0e98, B:455:0x0ea6, B:456:0x0ead, B:457:0x0eb4, B:459:0x0ebd, B:465:0x0ec8, B:467:0x0ed0, B:470:0x0eda, B:472:0x0ee1, B:473:0x0ee8, B:474:0x0eee, B:474:0x0eee, B:477:0x0ef5, B:481:0x0f03, B:482:0x0f0a, B:483:0x0f11, B:485:0x0f18, B:486:0x0f1f, B:487:0x0f25, B:487:0x0f25, B:490:0x0f2c, B:494:0x0f3a, B:495:0x0f41, B:496:0x0f48, B:498:0x0f4f, B:499:0x0f56, B:500:0x0f5c, B:500:0x0f5c, B:503:0x0f63, B:507:0x0f71, B:508:0x0f78, B:509:0x0f7f, B:511:0x0f86, B:512:0x0f8d, B:514:0x0f95, B:515:0x0f9a, B:516:0x0fa1, B:517:0x0fa8, B:520:0x0fb6, B:521:0x0fbf, B:523:0x0fc8, B:525:0x0fcf, B:526:0x0fd4, B:527:0x0fd9, B:527:0x0fd9, B:530:0x0fe0, B:531:0x0fe7, B:533:0x0fee, B:536:0x0ff8, B:537:0x0fff, B:538:0x1006, B:540:0x1013, B:542:0x101a, B:543:0x101f, B:545:0x1028, B:546:0x102f, B:547:0x1034, B:547:0x1034, B:550:0x103b, B:551:0x1042, B:554:0x104d, B:556:0x1054, B:557:0x1059, B:558:0x1062, B:561:0x1070, B:562:0x1079, B:564:0x1082, B:568:0x108e, B:570:0x1097, B:575:0x10a2, B:577:0x10ad, B:578:0x10b4, B:580:0x10bf, B:583:0x10cb, B:584:0x10d2, B:585:0x10d9, B:586:0x10e0, B:588:0x10ef, B:590:0x10f6, B:602:0x112d, B:604:0x1138, B:606:0x1140, B:607:0x1145, B:608:0x114c, B:609:0x1152, B:610:0x1159, B:612:0x1164, B:613:0x116b, B:614:0x1172, B:616:0x119c, B:618:0x11a3, B:620:0x11ad, B:622:0x11b2, B:624:0x11b9, B:626:0x11bf, B:630:0x11ce), top: B:401:0x0d45, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:583:0x10cb A[Catch: UnsatisfiedLinkError -> 0x1361, all -> 0x1379, TRY_ENTER, TRY_LEAVE, TryCatch #1 {UnsatisfiedLinkError -> 0x1361, blocks: (B:402:0x0d45, B:403:0x0d4b, B:405:0x0d54, B:407:0x0d60, B:409:0x0d66, B:410:0x0d6b, B:411:0x0d72, B:412:0x0d7b, B:415:0x0d89, B:416:0x0d92, B:417:0x0d99, B:419:0x0da1, B:420:0x0da8, B:421:0x0db1, B:422:0x0db6, B:422:0x0db6, B:424:0x0dbb, B:425:0x0dc0, B:426:0x0dc5, B:427:0x0dca, B:428:0x0dcf, B:429:0x0dd4, B:430:0x0dd9, B:431:0x0dde, B:432:0x0de3, B:433:0x0de8, B:434:0x0ded, B:435:0x0df2, B:436:0x0df7, B:437:0x0dfc, B:438:0x0e01, B:439:0x0e06, B:440:0x0e0b, B:441:0x0e65, B:442:0x0e6c, B:443:0x0e73, B:444:0x0e78, B:445:0x0e7f, B:448:0x0e8d, B:450:0x0e98, B:455:0x0ea6, B:456:0x0ead, B:457:0x0eb4, B:459:0x0ebd, B:465:0x0ec8, B:467:0x0ed0, B:470:0x0eda, B:472:0x0ee1, B:473:0x0ee8, B:474:0x0eee, B:474:0x0eee, B:477:0x0ef5, B:481:0x0f03, B:482:0x0f0a, B:483:0x0f11, B:485:0x0f18, B:486:0x0f1f, B:487:0x0f25, B:487:0x0f25, B:490:0x0f2c, B:494:0x0f3a, B:495:0x0f41, B:496:0x0f48, B:498:0x0f4f, B:499:0x0f56, B:500:0x0f5c, B:500:0x0f5c, B:503:0x0f63, B:507:0x0f71, B:508:0x0f78, B:509:0x0f7f, B:511:0x0f86, B:512:0x0f8d, B:514:0x0f95, B:515:0x0f9a, B:516:0x0fa1, B:517:0x0fa8, B:520:0x0fb6, B:521:0x0fbf, B:523:0x0fc8, B:525:0x0fcf, B:526:0x0fd4, B:527:0x0fd9, B:527:0x0fd9, B:530:0x0fe0, B:531:0x0fe7, B:533:0x0fee, B:536:0x0ff8, B:537:0x0fff, B:538:0x1006, B:540:0x1013, B:542:0x101a, B:543:0x101f, B:545:0x1028, B:546:0x102f, B:547:0x1034, B:547:0x1034, B:550:0x103b, B:551:0x1042, B:554:0x104d, B:556:0x1054, B:557:0x1059, B:558:0x1062, B:561:0x1070, B:562:0x1079, B:564:0x1082, B:568:0x108e, B:570:0x1097, B:575:0x10a2, B:577:0x10ad, B:578:0x10b4, B:580:0x10bf, B:583:0x10cb, B:584:0x10d2, B:585:0x10d9, B:586:0x10e0, B:588:0x10ef, B:590:0x10f6, B:602:0x112d, B:604:0x1138, B:606:0x1140, B:607:0x1145, B:608:0x114c, B:609:0x1152, B:610:0x1159, B:612:0x1164, B:613:0x116b, B:614:0x1172, B:616:0x119c, B:618:0x11a3, B:620:0x11ad, B:622:0x11b2, B:624:0x11b9, B:626:0x11bf, B:630:0x11ce), top: B:401:0x0d45, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:595:0x1117  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x1120  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x1129  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x11c9  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x11f0  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x121f  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x1292 A[Catch: EffectsFrameworkException -> 0x138d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {EffectsFrameworkException -> 0x138d, blocks: (B:9:0x0088, B:10:0x008f, B:11:0x0096, B:12:0x009d, B:15:0x00a7, B:18:0x00b3, B:19:0x00b8, B:20:0x00be, B:21:0x00c5, B:22:0x00cc, B:25:0x00d8, B:27:0x00df, B:29:0x00e6, B:31:0x00ed, B:34:0x060a, B:37:0x0616, B:40:0x0622, B:42:0x062c, B:44:0x0635, B:45:0x063c, B:47:0x0645, B:49:0x0654, B:51:0x066b, B:53:0x0671, B:54:0x0676, B:56:0x0682, B:58:0x068b, B:60:0x0693, B:62:0x069c, B:64:0x06ad, B:66:0x06b3, B:67:0x06b8, B:69:0x06c4, B:71:0x06cd, B:73:0x06d5, B:75:0x06de, B:77:0x06e7, B:79:0x06ef, B:81:0x06fb, B:83:0x0701, B:84:0x0706, B:86:0x0711, B:88:0x071a, B:90:0x0722, B:92:0x072b, B:94:0x0732, B:96:0x0739, B:98:0x0745, B:99:0x074c, B:100:0x0751, B:102:0x075a, B:104:0x0761, B:105:0x0766, B:106:0x076d, B:108:0x0778, B:110:0x0782, B:113:0x0792, B:114:0x0799, B:116:0x07a1, B:117:0x07aa, B:118:0x07b1, B:119:0x07b8, B:121:0x07c5, B:125:0x07d5, B:127:0x07dc, B:129:0x07e7, B:132:0x07f3, B:133:0x07fa, B:134:0x0801, B:136:0x080a, B:137:0x080f, B:139:0x0814, B:140:0x081b, B:141:0x0822, B:142:0x0829, B:143:0x0830, B:144:0x0837, B:145:0x083e, B:146:0x0845, B:147:0x084c, B:149:0x0853, B:152:0x085d, B:153:0x0864, B:154:0x0869, B:155:0x0870, B:156:0x0877, B:158:0x0882, B:160:0x088b, B:162:0x0892, B:165:0x089c, B:166:0x08a3, B:168:0x08ac, B:170:0x08b5, B:171:0x08bc, B:173:0x08c8, B:175:0x08d0, B:177:0x08d7, B:179:0x08de, B:181:0x08ea, B:182:0x08f1, B:183:0x08f6, B:185:0x08ff, B:187:0x0906, B:188:0x090b, B:190:0x0916, B:192:0x0920, B:195:0x092a, B:196:0x0931, B:198:0x093a, B:200:0x0943, B:201:0x094a, B:203:0x0956, B:205:0x095e, B:207:0x0965, B:209:0x096c, B:211:0x0978, B:212:0x097f, B:213:0x0984, B:215:0x098d, B:217:0x0994, B:218:0x0999, B:220:0x09a4, B:222:0x09ae, B:225:0x09b8, B:229:0x0a15, B:232:0x0a1f, B:233:0x0a26, B:234:0x0a2b, B:235:0x0a32, B:237:0x0a39, B:240:0x0a43, B:241:0x0a4c, B:243:0x0a54, B:244:0x0a5d, B:245:0x0a64, B:246:0x0a6d, B:248:0x0a7a, B:252:0x0a8c, B:254:0x0a93, B:256:0x0aa0, B:259:0x0aac, B:260:0x0ab3, B:261:0x0ab8, B:262:0x0abf, B:264:0x0aca, B:266:0x0ad3, B:268:0x0ada, B:269:0x0adf, B:271:0x0ae6, B:273:0x0aed, B:276:0x0af7, B:279:0x0b03, B:281:0x0b0f, B:282:0x0b16, B:286:0x0b24, B:287:0x0b28, B:289:0x0b2d, B:291:0x0b36, B:295:0x0b44, B:296:0x0b4b, B:297:0x0b52, B:299:0x0b5a, B:301:0x0b60, B:303:0x0b67, B:304:0x0b6c, B:305:0x0b73, B:306:0x0b7a, B:307:0x0b81, B:310:0x0b8d, B:314:0x0b9e, B:317:0x0baa, B:318:0x0bb1, B:319:0x0bb8, B:323:0x0bc9, B:327:0x0bda, B:328:0x0be1, B:329:0x0be8, B:331:0x0bf1, B:334:0x0bfd, B:336:0x0c04, B:340:0x0c10, B:341:0x0c17, B:342:0x0c1e, B:343:0x0c25, B:344:0x0c2c, B:345:0x0c33, B:346:0x0c3a, B:347:0x0c41, B:349:0x0c48, B:350:0x0c4d, B:353:0x0c59, B:355:0x0c60, B:358:0x0c6d, B:361:0x0c7c, B:362:0x0c83, B:364:0x0c8a, B:365:0x0c91, B:367:0x0c98, B:370:0x0ca2, B:373:0x0cae, B:374:0x0cb5, B:375:0x0cbc, B:377:0x0cc5, B:380:0x0ccf, B:382:0x0cda, B:383:0x0ce1, B:385:0x0cec, B:387:0x0cf7, B:389:0x0d02, B:391:0x0d14, B:393:0x0d1b, B:394:0x0d20, B:395:0x0d27, B:397:0x0d35, B:398:0x0d3c, B:634:0x11dd, B:635:0x11e4, B:639:0x11f2, B:640:0x11f9, B:641:0x1200, B:643:0x1208, B:645:0x120e, B:647:0x1213, B:651:0x1221, B:652:0x1228, B:653:0x122f, B:655:0x1237, B:657:0x123d, B:661:0x124c, B:663:0x1252, B:666:0x125c, B:668:0x1264, B:670:0x126a, B:671:0x126f, B:673:0x1276, B:674:0x127d, B:676:0x1286, B:679:0x1292, B:680:0x1299, B:681:0x12a0, B:682:0x12a7, B:685:0x12b3, B:687:0x12ba, B:688:0x12ce, B:691:0x12da, B:693:0x12c0, B:695:0x12c6, B:699:0x12ea, B:700:0x12f1, B:702:0x1304, B:705:0x130f, B:709:0x1321, B:711:0x1329, B:717:0x1336, B:719:0x1345, B:721:0x1357, B:734:0x1385, B:736:0x138c, B:737:0x09c4, B:738:0x09cb, B:739:0x09d2, B:740:0x09d9, B:741:0x09e0, B:742:0x09e7, B:744:0x0a0e, B:747:0x0114, B:750:0x0120, B:751:0x0125, B:753:0x0132, B:756:0x0140, B:758:0x0151, B:759:0x0158, B:761:0x016d, B:763:0x0178, B:764:0x017f, B:766:0x018a, B:768:0x0192, B:770:0x0199, B:772:0x01a4, B:773:0x01ab, B:775:0x01b3, B:776:0x01bc, B:777:0x01c3, B:778:0x01ca, B:780:0x01d7, B:784:0x01e7, B:786:0x01ee, B:788:0x01f9, B:791:0x0205, B:794:0x020c, B:796:0x0215, B:798:0x021c, B:802:0x0256, B:803:0x025b, B:804:0x0262, B:805:0x0269, B:806:0x0270, B:807:0x0277, B:808:0x027e, B:809:0x0285, B:810:0x028c, B:811:0x0293, B:813:0x022f, B:815:0x023d, B:817:0x0248, B:818:0x024f, B:820:0x02a2, B:821:0x02a9, B:823:0x02b4, B:826:0x02bb, B:829:0x02c5, B:831:0x02d5, B:832:0x02dc, B:833:0x02e3, B:835:0x02ec, B:837:0x02f6, B:839:0x0304, B:840:0x030b, B:842:0x0314, B:844:0x031e, B:848:0x0331, B:849:0x0338, B:851:0x0341, B:853:0x034b, B:855:0x0359, B:856:0x0360, B:858:0x0369, B:860:0x0373, B:864:0x0386, B:865:0x038d, B:867:0x0396, B:869:0x039f, B:871:0x03b0, B:876:0x03db, B:879:0x03e5, B:881:0x03f5, B:882:0x03fc, B:883:0x0403, B:885:0x040c, B:887:0x0416, B:889:0x0424, B:890:0x042b, B:892:0x0434, B:894:0x043e, B:895:0x0443, B:896:0x0448, B:898:0x0453, B:900:0x045b, B:904:0x047d, B:907:0x0487, B:909:0x0497, B:910:0x049e, B:912:0x04a7, B:914:0x04b1, B:916:0x04bf, B:918:0x04c8, B:920:0x04d2, B:922:0x04e0, B:924:0x04e9, B:926:0x04f3, B:930:0x0506, B:932:0x050f, B:935:0x051c, B:936:0x0523, B:937:0x052a, B:939:0x0534, B:942:0x053f, B:943:0x0546, B:946:0x0552, B:948:0x055c, B:953:0x059f, B:955:0x05a7, B:957:0x05b0, B:959:0x05bc, B:960:0x05c4, B:964:0x05e0, B:965:0x05e7, B:967:0x05f3, B:969:0x0600, B:971:0x057e, B:972:0x0585, B:975:0x0591, B:980:0x0465, B:981:0x046c, B:983:0x0476, B:985:0x03c3, B:986:0x03ca, B:988:0x03d4, B:990:0x00fa, B:991:0x0101, B:402:0x0d45, B:403:0x0d4b, B:405:0x0d54, B:407:0x0d60, B:409:0x0d66, B:410:0x0d6b, B:411:0x0d72, B:412:0x0d7b, B:415:0x0d89, B:416:0x0d92, B:417:0x0d99, B:419:0x0da1, B:420:0x0da8, B:421:0x0db1, B:422:0x0db6, B:424:0x0dbb, B:425:0x0dc0, B:426:0x0dc5, B:427:0x0dca, B:428:0x0dcf, B:429:0x0dd4, B:430:0x0dd9, B:431:0x0dde, B:432:0x0de3, B:433:0x0de8, B:434:0x0ded, B:435:0x0df2, B:436:0x0df7, B:437:0x0dfc, B:438:0x0e01, B:439:0x0e06, B:440:0x0e0b, B:441:0x0e65, B:442:0x0e6c, B:443:0x0e73, B:444:0x0e78, B:445:0x0e7f, B:448:0x0e8d, B:450:0x0e98, B:455:0x0ea6, B:456:0x0ead, B:457:0x0eb4, B:459:0x0ebd, B:465:0x0ec8, B:467:0x0ed0, B:470:0x0eda, B:472:0x0ee1, B:473:0x0ee8, B:474:0x0eee, B:477:0x0ef5, B:481:0x0f03, B:482:0x0f0a, B:483:0x0f11, B:485:0x0f18, B:486:0x0f1f, B:487:0x0f25, B:490:0x0f2c, B:494:0x0f3a, B:495:0x0f41, B:496:0x0f48, B:498:0x0f4f, B:499:0x0f56, B:500:0x0f5c, B:503:0x0f63, B:507:0x0f71, B:508:0x0f78, B:509:0x0f7f, B:511:0x0f86, B:512:0x0f8d, B:514:0x0f95, B:515:0x0f9a, B:516:0x0fa1, B:517:0x0fa8, B:520:0x0fb6, B:521:0x0fbf, B:523:0x0fc8, B:525:0x0fcf, B:526:0x0fd4, B:527:0x0fd9, B:530:0x0fe0, B:531:0x0fe7, B:533:0x0fee, B:536:0x0ff8, B:537:0x0fff, B:538:0x1006, B:540:0x1013, B:542:0x101a, B:543:0x101f, B:545:0x1028, B:546:0x102f, B:547:0x1034, B:550:0x103b, B:551:0x1042, B:554:0x104d, B:556:0x1054, B:557:0x1059, B:558:0x1062, B:561:0x1070, B:562:0x1079, B:564:0x1082, B:568:0x108e, B:570:0x1097, B:575:0x10a2, B:577:0x10ad, B:578:0x10b4, B:580:0x10bf, B:583:0x10cb, B:584:0x10d2, B:585:0x10d9, B:586:0x10e0, B:588:0x10ef, B:590:0x10f6, B:602:0x112d, B:604:0x1138, B:606:0x1140, B:607:0x1145, B:608:0x114c, B:609:0x1152, B:610:0x1159, B:612:0x1164, B:613:0x116b, B:614:0x1172, B:616:0x119c, B:618:0x11a3, B:620:0x11ad, B:622:0x11b2, B:624:0x11b9, B:626:0x11bf, B:630:0x11ce, B:725:0x1363, B:726:0x136a, B:728:0x1371, B:730:0x1378), top: B:8:0x0088, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:698:0x12e6  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x131b  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x1331  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x1109  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x1103  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x02c5 A[Catch: IOException -> 0x03c1, EffectsFrameworkException -> 0x138d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x03c1, blocks: (B:826:0x02bb, B:829:0x02c5, B:831:0x02d5, B:832:0x02dc, B:833:0x02e3, B:835:0x02ec, B:837:0x02f6, B:839:0x0304, B:840:0x030b, B:842:0x0314, B:844:0x031e, B:848:0x0331, B:849:0x0338, B:851:0x0341, B:853:0x034b, B:855:0x0359, B:856:0x0360, B:858:0x0369, B:860:0x0373, B:864:0x0386, B:865:0x038d, B:867:0x0396, B:869:0x039f, B:871:0x03b0), top: B:825:0x02bb, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:879:0x03e5 A[Catch: IOException -> 0x0463, EffectsFrameworkException -> 0x138d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x0463, blocks: (B:876:0x03db, B:879:0x03e5, B:881:0x03f5, B:882:0x03fc, B:883:0x0403, B:885:0x040c, B:887:0x0416, B:889:0x0424, B:890:0x042b, B:892:0x0434, B:894:0x043e, B:895:0x0443, B:896:0x0448, B:898:0x0453, B:900:0x045b), top: B:875:0x03db, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:907:0x0487 A[Catch: IOException -> 0x051a, EffectsFrameworkException -> 0x138d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x051a, blocks: (B:904:0x047d, B:907:0x0487, B:909:0x0497, B:910:0x049e, B:912:0x04a7, B:914:0x04b1, B:916:0x04bf, B:918:0x04c8, B:920:0x04d2, B:922:0x04e0, B:924:0x04e9, B:926:0x04f3, B:930:0x0506, B:932:0x050f), top: B:903:0x047d, outer: #2 }] */
    /* JADX WARN: Type inference failed for: r0v309, types: [X.HFP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v902, types: [java.lang.Object, X.HDT] */
    /* JADX WARN: Type inference failed for: r0v993, types: [X.HFP, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0D(X.I4D r302, X.HFs r303) {
        /*
            Method dump skipped, instructions count: 5153
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ij0.A0D(X.I4D, X.HFs):void");
    }

    private void A0E(I4D i4d, Exception exc) {
        A0I(this, this.A0A);
        A0F(i4d, exc, 0Pz.A0W("unsetMsqrd-", exc != null ? "ex" : "noex"), false);
        this.A0i = null;
        this.A0j = false;
        this.A0l = null;
        IPK ipk = this.A08;
        if (ipk != null) {
            ipk.release();
            this.A08 = null;
        }
    }

    private void A0F(I4D i4d, Exception exc, String str, boolean z) {
        Number number;
        AnalyticsLogger analyticsLogger;
        Hn8 hn8;
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper;
        if (i4d != null) {
            if (A0L(0Pz.A0W("stopEffect1-", str))) {
                if (z) {
                    A0B(i4d, 11);
                }
                A0B(i4d, 12);
                A0A(i4d, 12);
            } else {
                String str2 = i4d.A0F;
                if (str2 != null) {
                    JNI jni = this.A0Y;
                    jni.markPoint(jni.getInstanceIdWithString(16321564, str2), 7, str2);
                }
            }
        }
        HFs hFs = this.A0i;
        1BK.A0U(this.A0X.A00.A05).markerEnd(16318510, (short) 2);
        boolean z2 = this.A0F;
        I8q i8q = this.A0W;
        synchronized (i8q) {
            if (z2) {
                if (i8q.A0C != null) {
                    i8q.A0C.stopEffect();
                    i8q.A0C.cleanupServices();
                }
                AREngineController aREngineController = i8q.A04;
                if (aREngineController != null) {
                    aREngineController.onEffectStopped();
                }
            } else if (i8q.A0C != null) {
                i8q.A0C.cleanupServices();
            }
        }
        I2f i2f = this.A0l;
        if (i2f != null) {
            Iterator A13 = GOo.A13(i2f.A08);
            while (A13.hasNext()) {
                GdX gdX = (HFT) A13.next();
                if (gdX instanceof C2443Gdk) {
                    ((C2443Gdk) gdX).A00.A03.clear();
                } else if (gdX instanceof GdX) {
                    IP0 ip0 = gdX.A00;
                    if (ip0 != null) {
                        ip0.A06.clear();
                    }
                } else if (gdX instanceof C2444Gdl) {
                    WeatherServiceDataSource weatherServiceDataSource = ((C2444Gdl) gdX).A00;
                    if (weatherServiceDataSource != null) {
                        weatherServiceDataSource.stop();
                    }
                } else if ((gdX instanceof C2445Gdm) && (hn8 = ((C2445Gdm) gdX).A00) != null && (platformEventsServiceObjectsWrapper = hn8.A00) != null) {
                    platformEventsServiceObjectsWrapper._isAlive = false;
                    platformEventsServiceObjectsWrapper.mHybridData.resetNative();
                }
            }
        }
        N1W n1w = this.A07;
        String str3 = null;
        if (n1w != null) {
            n1w.A01(null);
        }
        this.A0O = null;
        this.A0N = null;
        this.A0M = null;
        this.A0C = null;
        this.A04 = null;
        this.A0F = false;
        IPK ipk = this.A08;
        if (ipk != null) {
            ipk.release();
            this.A08 = null;
        }
        if (exc == null) {
            if (i8q.A0C != null && (analyticsLogger = ((MessengerEffectServiceHost) i8q.A02()).mAnalyticsLogger) != null) {
                IOW iow = new IOW(analyticsLogger);
                EV7 ev7 = XplatSparsLogger.Companion;
                new XplatSparsLogger(new XplatRawEventLogger(iow));
            }
            if (i4d != null) {
                if (A0L(0Pz.A0W("stopEffect3-", str))) {
                    A0B(i4d, 13);
                } else {
                    String str4 = i4d.A0F;
                    if (str4 != null) {
                        JNI jni2 = this.A0Y;
                        jni2.endSuccess(jni2.getInstanceIdWithString(16321564, str4), str4);
                    }
                }
            }
        } else {
            if (i4d != null && !A0L(0Pz.A0W("stopEffect4-", str))) {
                JNI jni3 = this.A0Y;
                String str5 = i4d.A0F;
                long instanceIdWithString = jni3.getInstanceIdWithString(16321564, str5);
                String A0W = 0Pz.A0W("Loading effect error: ", exc.getMessage() == null ? "" : exc.getMessage());
                if (str5 == null) {
                    str5 = "";
                }
                jni3.endFail(instanceIdWithString, "renderer", 1, A0W, str5);
            }
            if (A0L(0Pz.A0W("stopEffect5-", str))) {
                A0K(A03(0Pz.A0W("stopEffect-", str)).B0E().onFailureEvent(6, i4d != null ? i4d.A0F : "null_config_session", "renderer", 1, exc.getMessage() == null ? "EffectsFrameworkException" : exc.getMessage()), 0Pz.A0W("stopEffect5-", str), i4d != null ? i4d.A0A : "null_config");
            }
        }
        if (hFs == null || !this.A0J) {
            return;
        }
        if (i4d != null) {
            str3 = i4d.A0O;
        }
        if (hFs instanceof Gs3) {
            Gs3 gs3 = (Gs3) hFs;
            if (2 - gs3.A00 == 0) {
                IRP irp = (IRP) gs3.A01;
                IMJ A00 = IRP.A00(irp);
                A00.A04 = null;
                Iterator it = A00.A0Q.iterator();
                while (it.hasNext()) {
                    ((HG5) it.next()).A02(A00.A04);
                }
                I88 i88 = (I88) 1Br.A0B(irp.A0J);
                long parseLong = str3 != null ? Long.parseLong(str3) : 0L;
                if (AbstractC2326GOr.A1V() || (number = (Number) i88.A00.get(parseLong)) == null) {
                    return;
                }
                7zP.A0e(i88.A01).markerEnd(51970053, number.intValue(), (short) 2);
            }
        }
    }

    public static void A0G(Ij0 ij0, I8q i8q) {
        EffectManifest effectManifest = i8q.A02().mEffectManifest;
        N2W n2w = ij0.A06;
        N12 n12 = new N12(effectManifest.supportsTapGesture, effectManifest.supportsPanGesture, effectManifest.supportsPinchGesture, effectManifest.supportsRotateGesture, effectManifest.supportsLongPressGesture, effectManifest.supportsRawTouchGesture, effectManifest.usesTouchService);
        n2w.A01 = n12;
        N4i n4i = n2w.A00;
        if (n4i != null) {
            n4i.A0B = n12;
            N4i.A03(n4i);
        }
    }

    public static void A0H(JJE jje, JLR jlr) {
        if (jlr != null) {
            jlr.CcL(jje, HC9.A0M);
            jlr.CcL(jje, HC9.A0J);
            jlr.CcL(jje, HC9.A0O);
            jlr.CcL(jje, HC9.A0e);
            jlr.CcL(jje, HC9.A0P);
            jlr.CcL(jje, HC9.A0R);
            jlr.CcL(jje, HC9.A0I);
            jlr.CcL(jje, HC9.A0Q);
            jlr.CcL(jje, HC9.A0a);
            jlr.CcL(jje, HC9.A0C);
            jlr.CcL(jje, HC9.A0H);
            jlr.CcL(jje, HC9.A0W);
        }
    }

    public static void A0I(JJE jje, JLR jlr) {
        if (jlr != null) {
            jlr.D5y(jje, HC9.A0M);
            jlr.D5y(jje, HC9.A0J);
            jlr.D5y(jje, HC9.A0O);
            jlr.D5y(jje, HC9.A0K);
            jlr.D5y(jje, HC9.A0L);
            jlr.D5y(jje, HC9.A0e);
            jlr.D5y(jje, HC9.A0P);
            jlr.D5y(jje, HC9.A0R);
            jlr.D5y(jje, HC9.A0I);
            jlr.D5y(jje, HC9.A0Q);
            jlr.D5y(jje, HC9.A0a);
            jlr.D5y(jje, HC9.A0C);
            jlr.D5y(jje, HC9.A0H);
            jlr.D5y(jje, HC9.A09);
            jlr.D5y(jje, HC9.A0Z);
            jlr.D5y(jje, HC9.A0W);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01d9, code lost:
    
        if (r0.A00(X.HC1.A06, false) == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v96, types: [X.HpG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0J(X.JLR r302) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ij0.A0J(X.JLR):void");
    }

    public static void A0K(boolean z, String str, String str2) {
        QuickPerformanceLogger qPLInstance;
        if (z || (qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance()) == null) {
            return;
        }
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("use_case", 0Pz.A0W("jni_null_", str));
        if (str2 == null) {
            str2 = "null_product_name";
        }
        A0u.put("product_name", str2);
        qPLInstance.markerGenerateWithAnnotations(11282540, (short) 4, 1L, TimeUnit.MILLISECONDS, A0u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if ((A03(X.0Pz.A0W("useARXLogger-", r302)) instanceof X.Gu9) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0L(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            X.HoE r0 = r0.A0S
            r303 = r0
            r0 = r303
            X.JQ8 r0 = r0.A01
            r304 = r0
            r0 = r304
            r1 = 135(0x87, float:1.89E-43)
            boolean r0 = r0.BSa(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L36
            java.lang.String r0 = "useARXLogger-"
            r1 = r302
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r303 = r0
            r0 = r301
            r1 = r303
            X.JQ9 r0 = r0.A03(r1)
            r303 = r0
            r0 = r303
            boolean r0 = r0 instanceof X.Gu9
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L3b
        L36:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L3b:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ij0.A0L(java.lang.String):boolean");
    }

    public void A0M(JFv jFv) {
        Hhk hhk = this.A0U;
        if (jFv != null) {
            Set set = hhk.A03;
            synchronized (set) {
                set.add(jFv);
            }
            hhk.A01 = true;
        }
    }

    public void A0N(JFv jFv) {
        Set set = this.A0U.A03;
        synchronized (set) {
            set.remove(jFv);
        }
    }

    public void A0O(Iit iit) {
        HgU hgU = this.A0e;
        if (iit != null && !iit.equals(hgU.A01)) {
            hgU.A01 = iit;
            hgU.A03 = true;
        }
        this.A0N = iit;
        A06();
        A08();
    }

    @Override // X.JGp
    public /* bridge */ /* synthetic */ JLy AnY() {
        return A02(this);
    }

    @Override // X.JMy
    public Integer Ar1() {
        return 0S2.A01;
    }

    public java.util.Map Auu() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("filter_type", "msqrd");
        String str = this.A0P;
        if (str != null) {
            A0u.put("effect_id", str);
        }
        String str2 = this.A0Q;
        if (str2 != null) {
            A0u.put("effect_instance_id", str2);
        }
        I4D i4d = this.A0h;
        if (i4d != null) {
            A0u.put("effect_session_id", i4d.A0F);
        }
        return A0u;
    }

    @Override // X.JMy
    public String B78() {
        return "FbMsqrdRenderer";
    }

    @Override // X.JQX
    public boolean BUO() {
        if (!this.A0F) {
            return false;
        }
        I8q i8q = this.A0W;
        if (i8q.A0C != null) {
            return i8q.A02().mEffectManifest.multipleOutputsSupported;
        }
        return false;
    }

    @Override // X.JGl
    public boolean BVM() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0426, code lost:
    
        if (BUO() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x06ad, code lost:
    
        if (r0.A00 != r0) goto L213;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:301:0x09e9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x091a  */
    @Override // X.JMy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BvA(X.I5I r302, long r303) {
        /*
            Method dump skipped, instructions count: 3518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ij0.BvA(X.I5I, long):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    public void CGa(JJD jjd) {
        switch (jjd.BHT().ordinal()) {
            case 3:
                Iiq iiq = (Iiq) jjd;
                synchronized (this.A0b) {
                    if (this.A0j) {
                        HoX hoX = this.A0V;
                        IPK ipk = iiq.A00;
                        ipk.getClass();
                        hoX.A00(ipk);
                    }
                }
                return;
            case 5:
                A0O((Iit) jjd);
                return;
            case 6:
                Iih iih = (Iih) jjd;
                HgU hgU = this.A0e;
                if (iih != null && !iih.equals(hgU.A00)) {
                    hgU.A00 = iih;
                    hgU.A03 = true;
                }
                this.A0M = iih;
                A06();
                A08();
                return;
            case 7:
                Iii iii = (Iii) jjd;
                HgU hgU2 = this.A0e;
                if (iii != null && !iii.equals(hgU2.A02)) {
                    hgU2.A02 = iii;
                    hgU2.A03 = true;
                }
                if (this.A0S.A01.BSa(ActionId.CONTROLLER_INITIATED)) {
                    I8q i8q = this.A0W;
                    if (i8q.A0C != null) {
                        i8q.A02().setCameraSensorRotation(iii.A01);
                    }
                }
                this.A0O = iii;
                A06();
                A08();
                return;
            case 8:
                IP0 ip0 = this.A04;
                if (ip0 != null) {
                    Iterator it = ip0.A06.iterator();
                    while (it.hasNext()) {
                        ((CaptureEventInputWrapper) it.next()).startRecording();
                    }
                    return;
                }
                return;
            case 9:
                IP0 ip02 = this.A04;
                if (ip02 != null) {
                    Iterator it2 = ip02.A06.iterator();
                    while (it2.hasNext()) {
                        ((CaptureEventInputWrapper) it2.next()).stopRecording();
                    }
                    return;
                }
                return;
            case 10:
                IP0 ip03 = this.A04;
                if (ip03 != null) {
                    Iterator it3 = ip03.A06.iterator();
                    while (it3.hasNext()) {
                        ((CaptureEventInputWrapper) it3.next()).capturePhoto();
                    }
                    return;
                }
                return;
            case 11:
                IP0 ip04 = this.A04;
                if (ip04 != null) {
                    Iterator it4 = ip04.A06.iterator();
                    while (it4.hasNext()) {
                        ((CaptureEventInputWrapper) it4.next()).finishCapturePhoto();
                    }
                    return;
                }
                return;
            case 12:
                Iis iis = (Iis) jjd;
                IPK ipk2 = this.A08;
                if (ipk2 != null) {
                    ipk2.release();
                    this.A08 = null;
                }
                boolean z = this.A0I;
                boolean z2 = iis.A00;
                this.A0E = 4YV.A1W(z ? 1 : 0, z2 ? 1 : 0);
                this.A0I = z2;
                return;
            case 13:
                this.A0B = (Iig) jjd;
                A06();
                return;
            case 14:
                this.A0C = (Iij) jjd;
                A06();
                return;
            case 17:
                Iir iir = (Iir) jjd;
                synchronized (this.A0b) {
                    A0C(iir.A00, iir.A01);
                }
                return;
            case 18:
                synchronized (this.A0b) {
                    HWf hWf = this.A0X;
                    C00j.A05("FbMsqrdRenderer:resetEffect", -1313231090);
                    1BK.A0U(hWf.A00.A05).markerStart(16318510);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        this.A0G = true;
                        this.A02 = 0L;
                        this.A0J = false;
                        I8q.A00(this.A0W).resetCurrentEffect();
                        A09(elapsedRealtime, "Time to reset effect: %d");
                    } catch (Throwable th) {
                        A09(elapsedRealtime, "Time to reset effect: %d");
                        throw th;
                    }
                }
                return;
            case 22:
                N1W n1w = ((Iio) jjd).A00;
                if (n1w != null) {
                    this.A07 = n1w;
                    n1w.A01(this.A06);
                    return;
                }
                return;
            case 26:
                throw AnonymousClass001.A0Q("getConfig");
            case 27:
                this.A0K = true;
                return;
            case 30:
            case 31:
                Object obj = null;
                obj.getClass();
                throw 0Q8.createAndThrow();
            case 43:
                synchronized (this.A0b) {
                    A05();
                }
                return;
            default:
                return;
        }
    }

    @Override // X.JMy
    public void CPA(int i, int i2) {
        boolean z;
        this.A01 = i;
        this.A00 = i2;
        if (this.A0k) {
            I8q.A00(this.A0W).resize(i, i2);
            z = false;
        } else {
            z = true;
        }
        this.A0L = z;
    }

    @Override // X.JMy
    public void CPE(JL0 jl0) {
        this.A0e.A03 = true;
    }

    @Override // X.JMy
    public void CPF(RectF rectF) {
        CPA(this.A01, this.A00);
    }

    @Override // X.JMy
    public void CPG() {
        A07();
    }

    @Override // X.JGm
    public boolean ChP() {
        return this.A0h != null && this.A0h.A0l && this.A0H;
    }

    @Override // X.JMy
    public void Clo(JJ9 jj9) {
    }

    @Override // X.JGk
    public void Clt(HlY hlY) {
        this.A03 = hlY;
    }

    @Override // X.JQX
    public void Co7(HcY hcY) {
        HcY hcY2 = this.A0a;
        hcY2.A00 = hcY.A00;
        hcY2.A01 = hcY.A01;
    }

    @Override // X.JQW
    public void CoT(boolean z) {
        this.A0n = z;
    }

    public void Cqs(JQ9 jq9) {
        0fH.A0d(1BK.A0j(this), jq9 != null ? 1BK.A0j(jq9) : "null", "FbMsqrdRenderer", "FbMsqrdRenderer %s - setLogger %s");
        this.A0m = jq9;
        if (jq9 != null) {
            boolean z = jq9 instanceof Gu9;
            if (z) {
                0fH.A0n("FbMsqrdRenderer", "Dummy Logger used !!!");
            }
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                short s = 2;
                if (z) {
                    s = 3;
                }
                qPLInstance.markerGenerate(11282540, s, 1L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public void Ctv(JLR jlr) {
        JLR jlr2 = this.A0A;
        if (jlr != jlr2) {
            if (jlr2 != null) {
                jlr2.D5y(this, HC9.A0V);
                jlr2.D5y(this, HC9.A0h);
                jlr2.D5y(this, HC9.A0N);
                jlr2.D5y(this, HC9.A0i);
            }
            if (jlr != null) {
                jlr.CcL(this, HC9.A0V);
                jlr.CcL(this, HC9.A0h);
                jlr.CcL(this, HC9.A0N);
                jlr.CcL(this, HC9.A0i);
            }
            if (this.A0j) {
                A0I(this, this.A0A);
                A0H(this, jlr);
                if (this.A0k) {
                    A0J(jlr);
                }
            }
            this.A0A = jlr;
        }
    }

    @Override // X.JMy
    public final boolean Cyu() {
        I4D i4d = this.A0h;
        if (i4d != null) {
            return i4d.A0k;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A0j == false) goto L6;
     */
    @Override // X.JMy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isEnabled() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0n
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r301
            boolean r0 = r0.A0j
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L16
        L14:
            r0 = 0
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ij0.isEnabled():boolean");
    }
}
