package X;

import android.os.Process;
import com.facebook.proxygen.NetworkStatusMonitor;
import com.facebook.proxygen.SocketData;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.proxygen.utils.CircularEventLog;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.JoU, reason: case insensitive filesystem */
/* loaded from: JoU.class */
public final class C3264JoU extends 1PV implements 1PX {
    public L5A A00;
    public C0dr A02;
    public QuickPerformanceLogger A03;
    public ScheduledExecutorService A04;
    public int A05;
    public long A06;
    public C0dp A07;
    public NetworkStatusMonitor A08;
    public CircularEventLog A09;
    public ScheduledFuture A0A;
    public ScheduledFuture A0B;
    public ScheduledFuture A0C;
    public final String A0E;
    public final boolean A0K;
    public final java.util.Map A0L = AnonymousClass001.A0u();
    public final java.util.Map A0I = AnonymousClass001.A0u();
    public final java.util.Map A0N = AnonymousClass001.A0u();
    public final java.util.Map A0M = AnonymousClass001.A0u();
    public final java.util.Map A0G = DKD.A13();
    public final ScheduledExecutorService A0P = Executors.newSingleThreadScheduledExecutor();
    public final java.util.Map A0F = AnonymousClass001.A0u();
    public final Set A0O = Collections.synchronizedSet(AnonymousClass001.A0v());
    public final java.util.Map A0H = DKD.A13();
    public final Set A0J = Collections.synchronizedSet(AnonymousClass001.A0v());
    public final int A0D = HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_BITRATE;
    public final boolean A0Q = true;
    public L4w A01 = new L4w();

    public C3264JoU(C0dp c0dp, C0dr c0dr, NetworkStatusMonitor networkStatusMonitor, CircularEventLog circularEventLog, QuickPerformanceLogger quickPerformanceLogger, String str, ScheduledExecutorService scheduledExecutorService, int i, boolean z) {
        this.A04 = scheduledExecutorService;
        this.A08 = networkStatusMonitor;
        this.A02 = c0dr;
        this.A07 = c0dp;
        this.A03 = quickPerformanceLogger;
        this.A05 = i;
        this.A0E = str;
        this.A09 = circularEventLog;
        this.A0K = z;
    }

    public static String A00(C03b c03b) {
        String A14;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.setLength(0);
        List BEL = c03b.BEL();
        if (BEL != null) {
            for (int i = 0; i < BEL.size() && (A14 = 1BK.A14(BEL, i)) != null && A0k.length() + A14.length() <= 1024; i++) {
                if (A14.length() > 0) {
                    if (i != 0) {
                        A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    }
                    A0k.append(A14);
                }
            }
        }
        return A0k.toString();
    }

    public static String A01(String str, java.util.Map map) {
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return AnonymousClass001.A0b(str, map);
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [X.RT5, java.lang.Object] */
    public static void A02(C3264JoU c3264JoU) {
        synchronized (c3264JoU) {
            if (C01573rm.A04.A03.get()) {
                SocketData[] inboundConnectionLevelTraceDataNative = c3264JoU.A08.getInboundConnectionLevelTraceDataNative();
                if (inboundConnectionLevelTraceDataNative != null) {
                    int length = inboundConnectionLevelTraceDataNative.length;
                    if (length != 0) {
                        if (c3264JoU.A0K) {
                            L5A l5a = c3264JoU.A00;
                            if (l5a != null) {
                                synchronized (l5a) {
                                    int i = 0;
                                    do {
                                        try {
                                            l5a.A05.add(inboundConnectionLevelTraceDataNative[i]);
                                            i++;
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } while (i < length);
                                }
                            }
                        }
                        if (!c3264JoU.A0J.isEmpty()) {
                            try {
                                L4w l4w = c3264JoU.A01;
                                if (l4w != null) {
                                    int i2 = 0;
                                    do {
                                        SocketData socketData = inboundConnectionLevelTraceDataNative[i2];
                                        RRf rRf = l4w.A0C;
                                        Long valueOf = Long.valueOf(socketData.mTime);
                                        Integer valueOf2 = Integer.valueOf(socketData.mPort);
                                        Integer valueOf3 = Integer.valueOf(socketData.mBytes);
                                        Long valueOf4 = Long.valueOf(socketData.mStreamID);
                                        ?? obj = new Object();
                                        ((RT5) obj).A03 = valueOf;
                                        ((RT5) obj).A01 = valueOf2;
                                        ((RT5) obj).A00 = valueOf3;
                                        ((RT5) obj).A02 = valueOf4;
                                        rRf.A07.A0E.post(new SAl((RT5) obj, rRf));
                                        i2++;
                                    } while (i2 < length);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, X.RSl] */
    public static void A03(C3264JoU c3264JoU) {
        synchronized (c3264JoU) {
            if (C01573rm.A04.A03.get()) {
                SocketData[] outboundConnectionLevelTraceDataNative = c3264JoU.A08.getOutboundConnectionLevelTraceDataNative();
                if (outboundConnectionLevelTraceDataNative != null) {
                    int length = outboundConnectionLevelTraceDataNative.length;
                    if (length != 0) {
                        if (c3264JoU.A0K) {
                            L5A l5a = c3264JoU.A00;
                            if (l5a != null) {
                                synchronized (l5a) {
                                    int i = 0;
                                    do {
                                        try {
                                            l5a.A09.add(outboundConnectionLevelTraceDataNative[i]);
                                            i++;
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } while (i < length);
                                }
                            }
                        }
                        if (!c3264JoU.A0J.isEmpty()) {
                            try {
                                L4w l4w = c3264JoU.A01;
                                if (l4w != null) {
                                    int i2 = 0;
                                    do {
                                        SocketData socketData = outboundConnectionLevelTraceDataNative[i2];
                                        RRb rRb = l4w.A0D;
                                        Long valueOf = Long.valueOf(socketData.mTime);
                                        Integer valueOf2 = Integer.valueOf(socketData.mPort);
                                        Integer valueOf3 = Integer.valueOf(socketData.mBytes);
                                        ?? obj = new Object();
                                        ((RSl) obj).A02 = valueOf;
                                        ((RSl) obj).A01 = valueOf2;
                                        ((RSl) obj).A00 = valueOf3;
                                        rRb.A06.A0E.post(new SAm((RSl) obj, rRb));
                                        i2++;
                                    } while (i2 < length);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void A04(07S r301, long j) {
        07S.A00(r301, Long.valueOf(j), "time");
    }

    public L5A A05() {
        L5A l5a;
        synchronized (this) {
            l5a = this.A00;
        }
        return l5a;
    }

    /* JADX WARN: Type inference failed for: r0v186, types: [X.RTe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v297, types: [java.lang.Object, X.RSk] */
    /* JADX WARN: Type inference failed for: r0v320, types: [X.RSP, java.lang.Object] */
    public void A06(Kmb kmb) {
        synchronized (this) {
            long j = kmb.A07;
            Long valueOf = Long.valueOf(j);
            long j2 = kmb.A0G - j;
            Long valueOf2 = j2 > 0 ? Long.valueOf(j2) : null;
            long j3 = kmb.A0I;
            Long valueOf3 = j3 > 0 ? Long.valueOf(j3 - j) : null;
            Long valueOf4 = j3 > 0 ? Long.valueOf(kmb.A0B) : null;
            Long valueOf5 = j3 > 0 ? Long.valueOf(kmb.A0C) : null;
            Long valueOf6 = Long.valueOf(kmb.A0A);
            Long valueOf7 = j3 > 0 ? Long.valueOf(kmb.A0K) : null;
            Long valueOf8 = j3 > 0 ? Long.valueOf(kmb.A08) : null;
            Long valueOf9 = j3 > 0 ? Long.valueOf(kmb.A09) : null;
            String str = kmb.A0Q;
            Integer valueOf10 = j3 > 0 ? Integer.valueOf(kmb.A01) : null;
            Long A0l = 1BK.A0l(kmb.A03);
            Long A0l2 = 1BK.A0l(kmb.A02);
            Long A0l3 = 1BK.A0l(kmb.A05);
            Long A0l4 = 1BK.A0l(kmb.A04);
            Boolean valueOf11 = Boolean.valueOf(kmb.A0T);
            java.util.Map map = kmb.A0S;
            String A01 = A01("video_is_prefetch", map);
            Boolean valueOf12 = A01 != null ? Boolean.valueOf(Boolean.parseBoolean(A01)) : null;
            String A012 = A01("rlr_in_kbps", map);
            Integer A12 = A012 != null ? AbH.A12(A012) : null;
            String str2 = kmb.A0L;
            String str3 = kmb.A0P;
            Integer A0i = kmb.A0V ? 7zN.A0i() : null;
            String A013 = A01(TraceFieldType.VideoId, map);
            String A014 = A01("video_bitrate", map);
            Integer A122 = A014 != null ? AbH.A12(A014) : null;
            String A015 = A01("video_stream_type", map);
            String A016 = A01("video_start_ms", map);
            Long A0n = A016 != null ? 1BK.A0n(A016) : null;
            String A00 = AbstractC00603o4.A00(40);
            String A017 = A01(A00, map);
            Long A0n2 = A017 != null ? 1BK.A0n(A017) : null;
            String str4 = kmb.A0R;
            String A018 = A01("bufferDurationMs", map);
            Long A0n3 = A018 != null ? 1BK.A0n(A018) : null;
            Long valueOf13 = Long.valueOf(kmb.A0H);
            Long valueOf14 = Long.valueOf(kmb.A0E);
            Long valueOf15 = Long.valueOf(kmb.A0D);
            String str5 = kmb.A0M;
            String str6 = kmb.A0O;
            String str7 = kmb.A0N;
            Boolean valueOf16 = Boolean.valueOf(kmb.A0U);
            Long valueOf17 = Long.valueOf(kmb.A0F);
            Integer valueOf18 = Integer.valueOf(kmb.A06);
            Long valueOf19 = Long.valueOf(kmb.A0J);
            ArrayList A0s = AnonymousClass001.A0s();
            HashSet A0w = AnonymousClass001.A0w(new String[]{"video_is_prefetch", "rlr_in_kbps", TraceFieldType.VideoId, "video_bitrate", "video_stream_type", "video_start_ms", A00, "bufferDurationMs"});
            if (map != null) {
                Iterator A0y = AnonymousClass001.A0y(map);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    if (!A0w.contains(A0z.getKey())) {
                        String A0j = AnonymousClass001.A0j(A0z);
                        String A16 = 1BK.A16(A0z);
                        ?? obj = new Object();
                        ((RSP) obj).A00 = A0j;
                        ((RSP) obj).A01 = A16;
                        A0s.add(obj);
                    }
                }
            }
            ArrayList arrayList = kmb.A00;
            ArrayList A0s2 = AnonymousClass001.A0s();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Kiv kiv = (Kiv) it.next();
                    Long valueOf20 = Long.valueOf(kiv.A01);
                    Boolean bool = new Boolean(kiv.A02);
                    Integer num = new Integer(kiv.A00);
                    ?? obj2 = new Object();
                    ((RSk) obj2).A02 = valueOf20;
                    ((RSk) obj2).A00 = bool;
                    ((RSk) obj2).A01 = num;
                    A0s2.add(obj2);
                }
            }
            ?? obj3 = new Object();
            ((RTe) obj3).A0N = valueOf;
            Long l = valueOf2;
            ((RTe) obj3).A0E = valueOf2;
            Long l2 = valueOf3;
            ((RTe) obj3).A0L = valueOf3;
            Long l3 = valueOf4;
            ((RTe) obj3).A0O = valueOf4;
            Long l4 = valueOf5;
            ((RTe) obj3).A0P = valueOf5;
            ((RTe) obj3).A0F = valueOf6;
            Long l5 = valueOf7;
            ((RTe) obj3).A0Q = valueOf7;
            Long l6 = valueOf8;
            ((RTe) obj3).A0B = valueOf8;
            ((RTe) obj3).A0D = valueOf9;
            ((RTe) obj3).A0U = str;
            ((RTe) obj3).A04 = valueOf10;
            ((RTe) obj3).A0H = A0l;
            ((RTe) obj3).A0G = A0l2;
            ((RTe) obj3).A0K = A0l3;
            ((RTe) obj3).A0J = A0l4;
            ((RTe) obj3).A00 = valueOf11;
            ((RTe) obj3).A02 = valueOf12;
            ((RTe) obj3).A05 = A12;
            ((RTe) obj3).A0T = str2;
            ((RTe) obj3).A0Y = str3;
            ((RTe) obj3).A03 = A0i;
            ((RTe) obj3).A0a = A013;
            ((RTe) obj3).A07 = A122;
            ((RTe) obj3).A0b = A015;
            ((RTe) obj3).A0S = A0n;
            ((RTe) obj3).A0R = A0n2;
            ((RTe) obj3).A0Z = str4;
            ((RTe) obj3).A08 = A0n3;
            ((RTe) obj3).A0I = valueOf13;
            ((RTe) obj3).A0A = valueOf14;
            ((RTe) obj3).A09 = valueOf15;
            ((RTe) obj3).A0V = str5;
            ((RTe) obj3).A0X = str6;
            ((RTe) obj3).A0W = str7;
            ((RTe) obj3).A01 = valueOf16;
            ((RTe) obj3).A0C = valueOf17;
            ((RTe) obj3).A06 = valueOf18;
            ((RTe) obj3).A0M = valueOf19;
            ((RTe) obj3).A0d = A0s;
            ((RTe) obj3).A0c = A0s2;
            if (!this.A0J.isEmpty()) {
                L4w l4w = this.A01;
                if (l4w != null) {
                    RRq rRq = l4w.A08;
                    rRq.A0h.A0E.post(new SAi((RTe) obj3, rRq));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.KrX, java.lang.Object] */
    public void A07(KrX krX) {
        synchronized (this) {
            if (!this.A0J.isEmpty()) {
                L4w l4w = this.A01;
                if (l4w != null) {
                    RRa rRa = l4w.A0B;
                    Long l = krX.A01;
                    String str = krX.A02;
                    Float f = krX.A00;
                    ?? obj = new Object();
                    ((KrX) obj).A01 = l;
                    ((KrX) obj).A02 = str;
                    ((KrX) obj).A00 = f;
                    rRa.A06.A0E.post(new SAk((KrX) obj, rRa));
                }
            }
        }
    }

    public void A08(C03b c03b) {
        if (this.A0J.isEmpty()) {
            return;
        }
        long BHz = (c03b.BHz() << 16) & 281474976645120L;
        if (!c03b.BX4()) {
            BHz |= 281474976710656L;
        }
        String A00 = A00(c03b);
        L3N l3n = this.A01.A07;
        Integer num = 0S2.A0C;
        Long valueOf = Long.valueOf(c03b.AyF());
        Integer valueOf2 = Integer.valueOf(Process.myTid());
        Integer valueOf3 = Integer.valueOf(c03b.BHz());
        Integer valueOf4 = Integer.valueOf(c03b.getMarkerId());
        Long valueOf5 = Long.valueOf(BHz);
        l3n.A02(new L3I(num, valueOf2, valueOf3, valueOf4, (Integer) null, valueOf, valueOf5, (String) null, (String) null, (String) null));
        if (A00.isEmpty()) {
            return;
        }
        l3n.A02(new L3I(0S2.A15, Integer.valueOf(Process.myTid()), Integer.valueOf(c03b.BHz()), Integer.valueOf(c03b.getMarkerId()), (Integer) null, Long.valueOf(c03b.AyF()), valueOf5, (String) null, "TAGS", A00));
    }

    public void A09(File file) {
        String absolutePath;
        synchronized (this) {
            L5A l5a = this.A00;
            if (l5a != null) {
                try {
                    absolutePath = file.getCanonicalPath();
                } catch (IOException unused) {
                    absolutePath = file.getAbsolutePath();
                }
                synchronized (l5a) {
                    C04r c04r = l5a.A02;
                    c04r.clear();
                    java.util.Map map = l5a.A00;
                    if (map.containsKey(absolutePath)) {
                        map.remove(absolutePath);
                        l5a.A0D.remove(absolutePath);
                        l5a.A0F.remove(absolutePath);
                        l5a.A0C.remove(absolutePath);
                        l5a.A0B.remove(absolutePath);
                        l5a.A0I.remove(absolutePath);
                        l5a.A0G.remove(absolutePath);
                        l5a.A0E.remove(absolutePath);
                        l5a.A0H.remove(absolutePath);
                    }
                    if (map.isEmpty()) {
                        l5a.A05.clear();
                        l5a.A09.clear();
                        l5a.A04.clear();
                        l5a.A03.clear();
                        l5a.A08.clear();
                        l5a.A0A.clear();
                        l5a.A06.clear();
                        c04r.clear();
                        l5a.A07.clear();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x042d A[Catch: all -> 0x0882, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0008, B:8:0x001a, B:10:0x002b, B:15:0x0033, B:18:0x003e, B:20:0x0050, B:22:0x0061, B:24:0x0069, B:25:0x0079, B:27:0x0083, B:30:0x0096, B:32:0x009b, B:33:0x009e, B:37:0x00aa, B:39:0x00ab, B:46:0x00c2, B:48:0x00c5, B:49:0x00ca, B:50:0x00d1, B:51:0x00d7, B:52:0x00de, B:55:0x00ec, B:56:0x00f3, B:57:0x00fc, B:58:0x0103, B:59:0x010a, B:61:0x0118, B:63:0x0121, B:65:0x012c, B:66:0x0132, B:70:0x014a, B:72:0x0151, B:73:0x0157, B:76:0x0164, B:77:0x016c, B:79:0x0174, B:81:0x017c, B:82:0x0182, B:84:0x0188, B:87:0x0192, B:91:0x019f, B:93:0x01a5, B:95:0x01aa, B:102:0x01c6, B:106:0x01c1, B:109:0x0818, B:112:0x01d3, B:114:0x01d9, B:115:0x01de, B:116:0x01e7, B:117:0x01ed, B:120:0x0200, B:122:0x020a, B:144:0x03c2, B:145:0x03c7, B:147:0x03d0, B:149:0x03d6, B:151:0x03dd, B:152:0x03e2, B:154:0x03f2, B:155:0x03f7, B:360:0x040a, B:361:0x0410, B:362:0x0415, B:364:0x0420, B:163:0x045d, B:165:0x046c, B:167:0x0471, B:170:0x047b, B:172:0x0488, B:173:0x048e, B:176:0x0495, B:178:0x04a2, B:180:0x04a9, B:182:0x04af, B:183:0x04b5, B:185:0x04be, B:186:0x04c3, B:189:0x04ca, B:190:0x04cf, B:192:0x04d4, B:194:0x04db, B:195:0x04e0, B:196:0x04e7, B:198:0x04f2, B:200:0x04f8, B:201:0x04fd, B:203:0x0506, B:205:0x0510, B:207:0x0519, B:209:0x0523, B:211:0x052c, B:212:0x0536, B:216:0x0546, B:217:0x054f, B:218:0x0556, B:220:0x055c, B:222:0x0563, B:225:0x0570, B:227:0x0579, B:250:0x05f9, B:252:0x05ff, B:254:0x060b, B:255:0x0612, B:256:0x0619, B:238:0x0624, B:241:0x0591, B:243:0x0597, B:245:0x05a3, B:246:0x05aa, B:247:0x05b1, B:230:0x05c6, B:232:0x05cc, B:234:0x05d8, B:235:0x05df, B:236:0x05e6, B:259:0x0631, B:263:0x0645, B:265:0x064b, B:267:0x0652, B:268:0x065b, B:270:0x0664, B:271:0x066d, B:273:0x067a, B:274:0x0683, B:276:0x068c, B:277:0x0695, B:278:0x069c, B:280:0x06a5, B:281:0x06aa, B:282:0x06b1, B:283:0x06b8, B:284:0x06bf, B:285:0x06c6, B:286:0x06cd, B:288:0x06da, B:290:0x06e6, B:291:0x06ec, B:293:0x06f3, B:350:0x081b, B:354:0x080d, B:358:0x0822, B:159:0x042d, B:161:0x0437, B:368:0x0448, B:370:0x044e, B:372:0x0457, B:380:0x0850, B:382:0x0862, B:383:0x0867, B:385:0x086c, B:387:0x087b, B:388:0x0212, B:390:0x0223, B:394:0x0815, B:397:0x027a, B:419:0x02c5, B:421:0x02c9, B:423:0x02d4, B:425:0x02da, B:426:0x02de, B:428:0x02e8, B:429:0x02f1, B:431:0x0300, B:433:0x0307, B:437:0x031c, B:439:0x0322, B:442:0x032c, B:443:0x0330, B:444:0x0335, B:446:0x033a, B:447:0x033f, B:449:0x0347, B:451:0x034d, B:453:0x0357, B:455:0x0364, B:457:0x036d, B:458:0x0371, B:461:0x0376, B:463:0x0384, B:465:0x038d, B:467:0x0392, B:468:0x0397, B:470:0x039e, B:472:0x03a7, B:474:0x03b4, B:476:0x03bd, B:485:0x0836, B:487:0x0847, B:490:0x0073, B:400:0x0280, B:401:0x0285, B:402:0x028b, B:404:0x0292, B:414:0x02b2, B:416:0x02b5, B:418:0x02c0, B:480:0x0831, B:482:0x0834, B:296:0x06f6, B:298:0x06fd, B:300:0x0711, B:302:0x0718, B:303:0x071c, B:304:0x0723, B:306:0x072f, B:308:0x0736, B:309:0x073a, B:310:0x0741, B:312:0x074d, B:314:0x0754, B:315:0x0758, B:316:0x075f, B:318:0x076b, B:320:0x0772, B:321:0x0776, B:322:0x077d, B:324:0x0789, B:326:0x0790, B:327:0x0794, B:328:0x079b, B:330:0x07a7, B:332:0x07ae, B:333:0x07b2, B:334:0x07b9, B:336:0x07c5, B:338:0x07cc, B:339:0x07d0, B:340:0x07d7, B:342:0x07e3, B:344:0x07ea, B:345:0x07ee, B:346:0x07f5, B:348:0x0801, B:125:0x0229, B:126:0x022e, B:127:0x0233, B:130:0x023a, B:140:0x025a, B:142:0x025d, B:376:0x026a, B:378:0x026d, B:41:0x00af, B:42:0x00b5, B:44:0x00bb, B:98:0x01ac, B:100:0x01b3), top: B:4:0x0005, inners: #2, #3, #4, #6, #7, #8, #9, #10, #12, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x047b A[Catch: all -> 0x0882, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0008, B:8:0x001a, B:10:0x002b, B:15:0x0033, B:18:0x003e, B:20:0x0050, B:22:0x0061, B:24:0x0069, B:25:0x0079, B:27:0x0083, B:30:0x0096, B:32:0x009b, B:33:0x009e, B:37:0x00aa, B:39:0x00ab, B:46:0x00c2, B:48:0x00c5, B:49:0x00ca, B:50:0x00d1, B:51:0x00d7, B:52:0x00de, B:55:0x00ec, B:56:0x00f3, B:57:0x00fc, B:58:0x0103, B:59:0x010a, B:61:0x0118, B:63:0x0121, B:65:0x012c, B:66:0x0132, B:70:0x014a, B:72:0x0151, B:73:0x0157, B:76:0x0164, B:77:0x016c, B:79:0x0174, B:81:0x017c, B:82:0x0182, B:84:0x0188, B:87:0x0192, B:91:0x019f, B:93:0x01a5, B:95:0x01aa, B:102:0x01c6, B:106:0x01c1, B:109:0x0818, B:112:0x01d3, B:114:0x01d9, B:115:0x01de, B:116:0x01e7, B:117:0x01ed, B:120:0x0200, B:122:0x020a, B:144:0x03c2, B:145:0x03c7, B:147:0x03d0, B:149:0x03d6, B:151:0x03dd, B:152:0x03e2, B:154:0x03f2, B:155:0x03f7, B:360:0x040a, B:361:0x0410, B:362:0x0415, B:364:0x0420, B:163:0x045d, B:165:0x046c, B:167:0x0471, B:170:0x047b, B:172:0x0488, B:173:0x048e, B:176:0x0495, B:178:0x04a2, B:180:0x04a9, B:182:0x04af, B:183:0x04b5, B:185:0x04be, B:186:0x04c3, B:189:0x04ca, B:190:0x04cf, B:192:0x04d4, B:194:0x04db, B:195:0x04e0, B:196:0x04e7, B:198:0x04f2, B:200:0x04f8, B:201:0x04fd, B:203:0x0506, B:205:0x0510, B:207:0x0519, B:209:0x0523, B:211:0x052c, B:212:0x0536, B:216:0x0546, B:217:0x054f, B:218:0x0556, B:220:0x055c, B:222:0x0563, B:225:0x0570, B:227:0x0579, B:250:0x05f9, B:252:0x05ff, B:254:0x060b, B:255:0x0612, B:256:0x0619, B:238:0x0624, B:241:0x0591, B:243:0x0597, B:245:0x05a3, B:246:0x05aa, B:247:0x05b1, B:230:0x05c6, B:232:0x05cc, B:234:0x05d8, B:235:0x05df, B:236:0x05e6, B:259:0x0631, B:263:0x0645, B:265:0x064b, B:267:0x0652, B:268:0x065b, B:270:0x0664, B:271:0x066d, B:273:0x067a, B:274:0x0683, B:276:0x068c, B:277:0x0695, B:278:0x069c, B:280:0x06a5, B:281:0x06aa, B:282:0x06b1, B:283:0x06b8, B:284:0x06bf, B:285:0x06c6, B:286:0x06cd, B:288:0x06da, B:290:0x06e6, B:291:0x06ec, B:293:0x06f3, B:350:0x081b, B:354:0x080d, B:358:0x0822, B:159:0x042d, B:161:0x0437, B:368:0x0448, B:370:0x044e, B:372:0x0457, B:380:0x0850, B:382:0x0862, B:383:0x0867, B:385:0x086c, B:387:0x087b, B:388:0x0212, B:390:0x0223, B:394:0x0815, B:397:0x027a, B:419:0x02c5, B:421:0x02c9, B:423:0x02d4, B:425:0x02da, B:426:0x02de, B:428:0x02e8, B:429:0x02f1, B:431:0x0300, B:433:0x0307, B:437:0x031c, B:439:0x0322, B:442:0x032c, B:443:0x0330, B:444:0x0335, B:446:0x033a, B:447:0x033f, B:449:0x0347, B:451:0x034d, B:453:0x0357, B:455:0x0364, B:457:0x036d, B:458:0x0371, B:461:0x0376, B:463:0x0384, B:465:0x038d, B:467:0x0392, B:468:0x0397, B:470:0x039e, B:472:0x03a7, B:474:0x03b4, B:476:0x03bd, B:485:0x0836, B:487:0x0847, B:490:0x0073, B:400:0x0280, B:401:0x0285, B:402:0x028b, B:404:0x0292, B:414:0x02b2, B:416:0x02b5, B:418:0x02c0, B:480:0x0831, B:482:0x0834, B:296:0x06f6, B:298:0x06fd, B:300:0x0711, B:302:0x0718, B:303:0x071c, B:304:0x0723, B:306:0x072f, B:308:0x0736, B:309:0x073a, B:310:0x0741, B:312:0x074d, B:314:0x0754, B:315:0x0758, B:316:0x075f, B:318:0x076b, B:320:0x0772, B:321:0x0776, B:322:0x077d, B:324:0x0789, B:326:0x0790, B:327:0x0794, B:328:0x079b, B:330:0x07a7, B:332:0x07ae, B:333:0x07b2, B:334:0x07b9, B:336:0x07c5, B:338:0x07cc, B:339:0x07d0, B:340:0x07d7, B:342:0x07e3, B:344:0x07ea, B:345:0x07ee, B:346:0x07f5, B:348:0x0801, B:125:0x0229, B:126:0x022e, B:127:0x0233, B:130:0x023a, B:140:0x025a, B:142:0x025d, B:376:0x026a, B:378:0x026d, B:41:0x00af, B:42:0x00b5, B:44:0x00bb, B:98:0x01ac, B:100:0x01b3), top: B:4:0x0005, inners: #2, #3, #4, #6, #7, #8, #9, #10, #12, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0631 A[Catch: all -> 0x0882, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0008, B:8:0x001a, B:10:0x002b, B:15:0x0033, B:18:0x003e, B:20:0x0050, B:22:0x0061, B:24:0x0069, B:25:0x0079, B:27:0x0083, B:30:0x0096, B:32:0x009b, B:33:0x009e, B:37:0x00aa, B:39:0x00ab, B:46:0x00c2, B:48:0x00c5, B:49:0x00ca, B:50:0x00d1, B:51:0x00d7, B:52:0x00de, B:55:0x00ec, B:56:0x00f3, B:57:0x00fc, B:58:0x0103, B:59:0x010a, B:61:0x0118, B:63:0x0121, B:65:0x012c, B:66:0x0132, B:70:0x014a, B:72:0x0151, B:73:0x0157, B:76:0x0164, B:77:0x016c, B:79:0x0174, B:81:0x017c, B:82:0x0182, B:84:0x0188, B:87:0x0192, B:91:0x019f, B:93:0x01a5, B:95:0x01aa, B:102:0x01c6, B:106:0x01c1, B:109:0x0818, B:112:0x01d3, B:114:0x01d9, B:115:0x01de, B:116:0x01e7, B:117:0x01ed, B:120:0x0200, B:122:0x020a, B:144:0x03c2, B:145:0x03c7, B:147:0x03d0, B:149:0x03d6, B:151:0x03dd, B:152:0x03e2, B:154:0x03f2, B:155:0x03f7, B:360:0x040a, B:361:0x0410, B:362:0x0415, B:364:0x0420, B:163:0x045d, B:165:0x046c, B:167:0x0471, B:170:0x047b, B:172:0x0488, B:173:0x048e, B:176:0x0495, B:178:0x04a2, B:180:0x04a9, B:182:0x04af, B:183:0x04b5, B:185:0x04be, B:186:0x04c3, B:189:0x04ca, B:190:0x04cf, B:192:0x04d4, B:194:0x04db, B:195:0x04e0, B:196:0x04e7, B:198:0x04f2, B:200:0x04f8, B:201:0x04fd, B:203:0x0506, B:205:0x0510, B:207:0x0519, B:209:0x0523, B:211:0x052c, B:212:0x0536, B:216:0x0546, B:217:0x054f, B:218:0x0556, B:220:0x055c, B:222:0x0563, B:225:0x0570, B:227:0x0579, B:250:0x05f9, B:252:0x05ff, B:254:0x060b, B:255:0x0612, B:256:0x0619, B:238:0x0624, B:241:0x0591, B:243:0x0597, B:245:0x05a3, B:246:0x05aa, B:247:0x05b1, B:230:0x05c6, B:232:0x05cc, B:234:0x05d8, B:235:0x05df, B:236:0x05e6, B:259:0x0631, B:263:0x0645, B:265:0x064b, B:267:0x0652, B:268:0x065b, B:270:0x0664, B:271:0x066d, B:273:0x067a, B:274:0x0683, B:276:0x068c, B:277:0x0695, B:278:0x069c, B:280:0x06a5, B:281:0x06aa, B:282:0x06b1, B:283:0x06b8, B:284:0x06bf, B:285:0x06c6, B:286:0x06cd, B:288:0x06da, B:290:0x06e6, B:291:0x06ec, B:293:0x06f3, B:350:0x081b, B:354:0x080d, B:358:0x0822, B:159:0x042d, B:161:0x0437, B:368:0x0448, B:370:0x044e, B:372:0x0457, B:380:0x0850, B:382:0x0862, B:383:0x0867, B:385:0x086c, B:387:0x087b, B:388:0x0212, B:390:0x0223, B:394:0x0815, B:397:0x027a, B:419:0x02c5, B:421:0x02c9, B:423:0x02d4, B:425:0x02da, B:426:0x02de, B:428:0x02e8, B:429:0x02f1, B:431:0x0300, B:433:0x0307, B:437:0x031c, B:439:0x0322, B:442:0x032c, B:443:0x0330, B:444:0x0335, B:446:0x033a, B:447:0x033f, B:449:0x0347, B:451:0x034d, B:453:0x0357, B:455:0x0364, B:457:0x036d, B:458:0x0371, B:461:0x0376, B:463:0x0384, B:465:0x038d, B:467:0x0392, B:468:0x0397, B:470:0x039e, B:472:0x03a7, B:474:0x03b4, B:476:0x03bd, B:485:0x0836, B:487:0x0847, B:490:0x0073, B:400:0x0280, B:401:0x0285, B:402:0x028b, B:404:0x0292, B:414:0x02b2, B:416:0x02b5, B:418:0x02c0, B:480:0x0831, B:482:0x0834, B:296:0x06f6, B:298:0x06fd, B:300:0x0711, B:302:0x0718, B:303:0x071c, B:304:0x0723, B:306:0x072f, B:308:0x0736, B:309:0x073a, B:310:0x0741, B:312:0x074d, B:314:0x0754, B:315:0x0758, B:316:0x075f, B:318:0x076b, B:320:0x0772, B:321:0x0776, B:322:0x077d, B:324:0x0789, B:326:0x0790, B:327:0x0794, B:328:0x079b, B:330:0x07a7, B:332:0x07ae, B:333:0x07b2, B:334:0x07b9, B:336:0x07c5, B:338:0x07cc, B:339:0x07d0, B:340:0x07d7, B:342:0x07e3, B:344:0x07ea, B:345:0x07ee, B:346:0x07f5, B:348:0x0801, B:125:0x0229, B:126:0x022e, B:127:0x0233, B:130:0x023a, B:140:0x025a, B:142:0x025d, B:376:0x026a, B:378:0x026d, B:41:0x00af, B:42:0x00b5, B:44:0x00bb, B:98:0x01ac, B:100:0x01b3), top: B:4:0x0005, inners: #2, #3, #4, #6, #7, #8, #9, #10, #12, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x040a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v173, types: [X.Qy8, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(java.io.File r302) {
        /*
            Method dump skipped, instructions count: 2189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3264JoU.A0A(java.io.File):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v12 ??, still in use, count: 7, list:
          (r314v12 ??) from 0x1381: PHI (r314v7 ??) = (r314v11 ??), (r314v12 ??) binds: [B:942:?, B:890:0x1256] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ??) from 0x131e: PHI (r314v10 ??) = (r314v6 ??), (r314v12 ??), (r314v12 ??) binds: [B:998:0x131b, B:995:0x1314, B:951:0x130d] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ??) from 0x1388: PHI (r314v9 ??) = (r314v7 ??), (r314v12 ??) binds: [B:994:0x1385, B:972:0x1304] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ??) from 0x131e: PHI (r314v10 ??) = (r314v6 ??), (r314v12 ??), (r314v12 ??) binds: [B:998:0x131b, B:995:0x1314, B:951:0x130d] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ??) from 0x1379: PHI (r314v11 ??) = (r314v10 ??), (r314v12 ??), (r314v12 ??) binds: [B:964:0x1376, B:948:0x12fa, B:932:0x12ec] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ??) from 0x1379: PHI (r314v11 ??) = (r314v10 ??), (r314v12 ??), (r314v12 ??) binds: [B:964:0x1376, B:948:0x12fa, B:932:0x12ec] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ?? I:java.io.Writer) from 0x125f: INVOKE (r0v580 ?? I:java.io.BufferedWriter), (r314v12 ?? I:java.io.Writer) DIRECT call: java.io.BufferedWriter.<init>(java.io.Writer):void A[Catch: IOException -> 0x1314, all -> 0x1381, MD:(java.io.Writer):void (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public void A0B(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v12 ??, still in use, count: 7, list:
          (r314v12 ??) from 0x1381: PHI (r314v7 ??) = (r314v11 ??), (r314v12 ??) binds: [B:942:?, B:890:0x1256] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ??) from 0x131e: PHI (r314v10 ??) = (r314v6 ??), (r314v12 ??), (r314v12 ??) binds: [B:998:0x131b, B:995:0x1314, B:951:0x130d] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ??) from 0x1388: PHI (r314v9 ??) = (r314v7 ??), (r314v12 ??) binds: [B:994:0x1385, B:972:0x1304] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ??) from 0x131e: PHI (r314v10 ??) = (r314v6 ??), (r314v12 ??), (r314v12 ??) binds: [B:998:0x131b, B:995:0x1314, B:951:0x130d] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ??) from 0x1379: PHI (r314v11 ??) = (r314v10 ??), (r314v12 ??), (r314v12 ??) binds: [B:964:0x1376, B:948:0x12fa, B:932:0x12ec] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ??) from 0x1379: PHI (r314v11 ??) = (r314v10 ??), (r314v12 ??), (r314v12 ??) binds: [B:964:0x1376, B:948:0x12fa, B:932:0x12ec] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ?? I:java.io.Writer) from 0x125f: INVOKE (r0v580 ?? I:java.io.BufferedWriter), (r314v12 ?? I:java.io.Writer) DIRECT call: java.io.BufferedWriter.<init>(java.io.Writer):void A[Catch: IOException -> 0x1314, all -> 0x1381, MD:(java.io.Writer):void (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r0.contains(r304) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BWp(java.io.File r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L28
            r0 = r301
            java.util.Set r0 = r0.A0O
            r303 = r0
            r0 = r302
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L11
            r304 = r0
            goto L17
        L11:
            r0 = r302
            java.lang.String r0 = r0.getAbsolutePath()
            r304 = r0
        L17:
            r0 = r303
            r1 = r304
            boolean r0 = r0.contains(r1)
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L2d
        L28:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L2d:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3264JoU.BWp(java.io.File):boolean");
    }

    public void D1X(File file, boolean z) {
        synchronized (this) {
            0fH.A0j("TransientArrowTigonLigerDataCollector", "startDataCollection");
            A0A(file);
        }
    }

    public void D2i(File file) {
        synchronized (this) {
            0fH.A0j("TransientArrowTigonLigerDataCollector", "stopDataCollection");
            A0B(file);
        }
    }
}
