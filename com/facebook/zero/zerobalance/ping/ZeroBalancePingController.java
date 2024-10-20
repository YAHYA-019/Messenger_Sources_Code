package com.facebook.zero.zerobalance.ping;

import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1UG;
import X.2BQ;
import X.2BR;
import X.2BS;
import X.2BX;
import X.2C1;
import X.2C3;
import X.2C6;
import X.2C7;
import X.2yD;
import X.C00i;
import X.C15h;
import X.C2C2;
import X.DLe;
import X.InterfaceC07234jG;
import X.Kuc;
import com.facebook.inject.FbInjector;
import com.facebook.zero.zerobalance.ping.ZeroBalancePingController;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: ZeroBalancePingController.class */
public final class ZeroBalancePingController {
    public 2C1 A00;
    public 2C1 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public 2BS A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final 2BX A0C;
    public final Set A0D;
    public final C15h A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final C00i A0I;
    public final C00i A0J;
    public final C00i A0K;
    public final C00i A0L;
    public final 2BQ A0M = (2BQ) 1Bi.A03(16922);
    public final C15h A0N = new 1BV(33096);

    public ZeroBalancePingController() {
        1BV r0 = new 1BV(16932);
        this.A0I = r0;
        1BQ r02 = new 1BQ(16935);
        this.A0K = r02;
        1BV r03 = new 1BV(131322);
        this.A0J = r03;
        1BQ r04 = new 1BQ(131321);
        this.A0L = r04;
        this.A0A = new 1BQ(98464);
        this.A0C = (2BX) 1Bn.A0A(33101);
        this.A07 = new 1BQ(33013);
        this.A0E = new 1BV(98484);
        1BQ r05 = new 1BQ(16385);
        this.A08 = r05;
        this.A0H = new 1BQ(16966);
        this.A0B = new 1BQ(98739);
        1BQ r06 = new 1BQ(16923);
        this.A0F = r06;
        2C1 r07 = 2C1.A05;
        this.A00 = r07;
        this.A02 = false;
        this.A03 = false;
        this.A09 = new 1BQ(16465);
        this.A01 = r07;
        this.A06 = new 1BQ(16616);
        this.A0G = new 1BQ(16634);
        this.A04 = false;
        this.A0D = Collections.newSetFromMap(new ConcurrentHashMap());
        ((C2C2) r0.get()).A0B.add(new 2C6(FbInjector.A00(), this));
        ((2C7) r02.get()).A0N.add(new 2C6(FbInjector.A00(), this));
        if (((2yD) r05.get()).AZk(36311337151826673L)) {
            ((Kuc) r03.get()).A04.add(new 2C6(FbInjector.A00(), this));
            ((Kuc) r04.get()).A04.add(new 2C6(FbInjector.A00(), this));
            this.A05 = new DLe(this, 4);
            ((2BR) r06.get()).A0G(this.A05);
        }
        C00i c00i = this.A08;
        if (((2yD) c00i.get()).AZk(2342157601946542148L)) {
            this.A02 = ((2yD) c00i.get()).AZk(36311337151957747L);
            this.A03 = ((2yD) c00i.get()).AZk(36311337152023284L);
            if (this.A02) {
                long max = Math.max(60, 1BK.A0N(c00i).Auy(36592812128797658L));
                ((ScheduledExecutorService) this.A09.get()).scheduleAtFixedRate(new Runnable() { // from class: X.3fz
                    public static final String __redex_internal_original_name = "ZeroBalancePingController$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZeroBalancePingController zeroBalancePingController = ZeroBalancePingController.this;
                        if (((1Od) zeroBalancePingController.A06.get()).A0F()) {
                            zeroBalancePingController.A04("periodic");
                        }
                    }
                }, max, max, TimeUnit.SECONDS);
            }
        }
    }

    public static 2C3 A00(ZeroBalancePingController zeroBalancePingController) {
        C00i c00i;
        String A02 = zeroBalancePingController.A02();
        if (A02.hashCode() == 203206891 && A02.equals("smart_timeout")) {
            0fH.A0A(ZeroBalancePingController.class, "ZBD: getDetectionController - return timeout controller.");
            c00i = zeroBalancePingController.A0K;
        } else {
            0fH.A0A(ZeroBalancePingController.class, "ZBD: getDetectionController - return redirection controller.");
            c00i = zeroBalancePingController.A0I;
        }
        return (2C3) c00i.get();
    }

    public static Kuc A01(ZeroBalancePingController zeroBalancePingController) {
        C00i c00i;
        String A02 = zeroBalancePingController.A02();
        if (A02.hashCode() == 203206891 && A02.equals("smart_timeout")) {
            0fH.A0A(ZeroBalancePingController.class, "ZBD: getDetectionController - return timeout controller.");
            c00i = zeroBalancePingController.A0L;
        } else {
            0fH.A0A(ZeroBalancePingController.class, "ZBD: getDetectionController - return redirection controller.");
            c00i = zeroBalancePingController.A0J;
        }
        return (Kuc) c00i.get();
    }

    private String A02() {
        return ((InterfaceC07234jG) this.A0H.get()).CxV() ? "smart_timeout" : this.A0M.A04("enable_redirect_detection") ? "zero_balance_redirect" : "unknown";
    }

    public 2C1 A03() {
        if (this.A02 && !this.A03) {
            1UG A08 = 1BK.A08(1BK.A07(this.A0G), "zero_balance_detection_ground_truth_comparison");
            if (A08.isSampled()) {
                A08.A7R("zb_value", this.A00.toString());
                A08.A7R("ground_truth_zb_value", this.A01.toString());
                A08.BZL();
            }
        }
        return this.A00;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00e6, code lost:
    
        if (r302.equals("fetch_batch_feed") != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x01a5, code lost:
    
        if (X.1BL.A1a(r301.A0N) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x01af, code lost:
    
        X.0fH.A0A(com.facebook.zero.zerobalance.ping.ZeroBalancePingController.class, "ZBD: initiateZeroBalanceDetection return since zbd free mode is not enabled for newsfeed pulldown or fetc batch feed trigger");
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0193, code lost:
    
        if (r302.equals("newsfeed_pulldown") != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04d3 A[Catch: all -> 0x052f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0008, B:6:0x000e, B:8:0x0024, B:10:0x002a, B:13:0x0034, B:15:0x003a, B:16:0x0040, B:18:0x004c, B:23:0x0054, B:26:0x0088, B:27:0x008e, B:29:0x0097, B:30:0x009e, B:31:0x00a4, B:32:0x00aa, B:33:0x00b3, B:34:0x00ba, B:36:0x00c3, B:39:0x01bb, B:40:0x01c1, B:41:0x01c8, B:43:0x01d2, B:44:0x01db, B:48:0x022b, B:50:0x0235, B:51:0x023e, B:53:0x024c, B:55:0x0257, B:58:0x0269, B:61:0x027f, B:62:0x0286, B:64:0x0292, B:66:0x029d, B:68:0x02a6, B:69:0x02ab, B:71:0x02bb, B:73:0x02c4, B:75:0x02cb, B:77:0x02d6, B:78:0x02f0, B:80:0x02fc, B:82:0x0305, B:84:0x030e, B:86:0x0317, B:88:0x0327, B:90:0x0330, B:92:0x0340, B:94:0x0349, B:96:0x0359, B:98:0x0362, B:100:0x0372, B:102:0x037b, B:104:0x038b, B:106:0x0394, B:108:0x03a4, B:110:0x03ad, B:111:0x03b2, B:113:0x03c0, B:115:0x03c7, B:116:0x03ce, B:118:0x03de, B:120:0x03e8, B:122:0x03f1, B:126:0x0404, B:130:0x0417, B:133:0x0423, B:134:0x0429, B:135:0x0432, B:137:0x043e, B:138:0x0445, B:139:0x044c, B:140:0x0453, B:141:0x045c, B:143:0x046d, B:146:0x047a, B:147:0x0483, B:149:0x049a, B:151:0x04a6, B:152:0x04ae, B:153:0x04b7, B:155:0x04c5, B:158:0x04d3, B:160:0x04db, B:161:0x04e2, B:164:0x0507, B:168:0x051a, B:172:0x0527, B:173:0x04ea, B:175:0x04f4, B:176:0x02de, B:178:0x02e7, B:179:0x01ee, B:180:0x01f5, B:181:0x01fc, B:182:0x0205, B:183:0x020c, B:186:0x0218, B:189:0x0224, B:192:0x00dd, B:195:0x0196, B:196:0x019c, B:200:0x01af, B:202:0x00f2, B:205:0x00fe, B:206:0x0104, B:207:0x010d, B:209:0x011b, B:213:0x0130, B:215:0x013e, B:218:0x014a, B:219:0x0150, B:220:0x0159, B:222:0x0167, B:226:0x017c, B:228:0x018a), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0507 A[Catch: all -> 0x052f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0008, B:6:0x000e, B:8:0x0024, B:10:0x002a, B:13:0x0034, B:15:0x003a, B:16:0x0040, B:18:0x004c, B:23:0x0054, B:26:0x0088, B:27:0x008e, B:29:0x0097, B:30:0x009e, B:31:0x00a4, B:32:0x00aa, B:33:0x00b3, B:34:0x00ba, B:36:0x00c3, B:39:0x01bb, B:40:0x01c1, B:41:0x01c8, B:43:0x01d2, B:44:0x01db, B:48:0x022b, B:50:0x0235, B:51:0x023e, B:53:0x024c, B:55:0x0257, B:58:0x0269, B:61:0x027f, B:62:0x0286, B:64:0x0292, B:66:0x029d, B:68:0x02a6, B:69:0x02ab, B:71:0x02bb, B:73:0x02c4, B:75:0x02cb, B:77:0x02d6, B:78:0x02f0, B:80:0x02fc, B:82:0x0305, B:84:0x030e, B:86:0x0317, B:88:0x0327, B:90:0x0330, B:92:0x0340, B:94:0x0349, B:96:0x0359, B:98:0x0362, B:100:0x0372, B:102:0x037b, B:104:0x038b, B:106:0x0394, B:108:0x03a4, B:110:0x03ad, B:111:0x03b2, B:113:0x03c0, B:115:0x03c7, B:116:0x03ce, B:118:0x03de, B:120:0x03e8, B:122:0x03f1, B:126:0x0404, B:130:0x0417, B:133:0x0423, B:134:0x0429, B:135:0x0432, B:137:0x043e, B:138:0x0445, B:139:0x044c, B:140:0x0453, B:141:0x045c, B:143:0x046d, B:146:0x047a, B:147:0x0483, B:149:0x049a, B:151:0x04a6, B:152:0x04ae, B:153:0x04b7, B:155:0x04c5, B:158:0x04d3, B:160:0x04db, B:161:0x04e2, B:164:0x0507, B:168:0x051a, B:172:0x0527, B:173:0x04ea, B:175:0x04f4, B:176:0x02de, B:178:0x02e7, B:179:0x01ee, B:180:0x01f5, B:181:0x01fc, B:182:0x0205, B:183:0x020c, B:186:0x0218, B:189:0x0224, B:192:0x00dd, B:195:0x0196, B:196:0x019c, B:200:0x01af, B:202:0x00f2, B:205:0x00fe, B:206:0x0104, B:207:0x010d, B:209:0x011b, B:213:0x0130, B:215:0x013e, B:218:0x014a, B:219:0x0150, B:220:0x0159, B:222:0x0167, B:226:0x017c, B:228:0x018a), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04ea A[Catch: all -> 0x052f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0008, B:6:0x000e, B:8:0x0024, B:10:0x002a, B:13:0x0034, B:15:0x003a, B:16:0x0040, B:18:0x004c, B:23:0x0054, B:26:0x0088, B:27:0x008e, B:29:0x0097, B:30:0x009e, B:31:0x00a4, B:32:0x00aa, B:33:0x00b3, B:34:0x00ba, B:36:0x00c3, B:39:0x01bb, B:40:0x01c1, B:41:0x01c8, B:43:0x01d2, B:44:0x01db, B:48:0x022b, B:50:0x0235, B:51:0x023e, B:53:0x024c, B:55:0x0257, B:58:0x0269, B:61:0x027f, B:62:0x0286, B:64:0x0292, B:66:0x029d, B:68:0x02a6, B:69:0x02ab, B:71:0x02bb, B:73:0x02c4, B:75:0x02cb, B:77:0x02d6, B:78:0x02f0, B:80:0x02fc, B:82:0x0305, B:84:0x030e, B:86:0x0317, B:88:0x0327, B:90:0x0330, B:92:0x0340, B:94:0x0349, B:96:0x0359, B:98:0x0362, B:100:0x0372, B:102:0x037b, B:104:0x038b, B:106:0x0394, B:108:0x03a4, B:110:0x03ad, B:111:0x03b2, B:113:0x03c0, B:115:0x03c7, B:116:0x03ce, B:118:0x03de, B:120:0x03e8, B:122:0x03f1, B:126:0x0404, B:130:0x0417, B:133:0x0423, B:134:0x0429, B:135:0x0432, B:137:0x043e, B:138:0x0445, B:139:0x044c, B:140:0x0453, B:141:0x045c, B:143:0x046d, B:146:0x047a, B:147:0x0483, B:149:0x049a, B:151:0x04a6, B:152:0x04ae, B:153:0x04b7, B:155:0x04c5, B:158:0x04d3, B:160:0x04db, B:161:0x04e2, B:164:0x0507, B:168:0x051a, B:172:0x0527, B:173:0x04ea, B:175:0x04f4, B:176:0x02de, B:178:0x02e7, B:179:0x01ee, B:180:0x01f5, B:181:0x01fc, B:182:0x0205, B:183:0x020c, B:186:0x0218, B:189:0x0224, B:192:0x00dd, B:195:0x0196, B:196:0x019c, B:200:0x01af, B:202:0x00f2, B:205:0x00fe, B:206:0x0104, B:207:0x010d, B:209:0x011b, B:213:0x0130, B:215:0x013e, B:218:0x014a, B:219:0x0150, B:220:0x0159, B:222:0x0167, B:226:0x017c, B:228:0x018a), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02de A[Catch: all -> 0x052f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0008, B:6:0x000e, B:8:0x0024, B:10:0x002a, B:13:0x0034, B:15:0x003a, B:16:0x0040, B:18:0x004c, B:23:0x0054, B:26:0x0088, B:27:0x008e, B:29:0x0097, B:30:0x009e, B:31:0x00a4, B:32:0x00aa, B:33:0x00b3, B:34:0x00ba, B:36:0x00c3, B:39:0x01bb, B:40:0x01c1, B:41:0x01c8, B:43:0x01d2, B:44:0x01db, B:48:0x022b, B:50:0x0235, B:51:0x023e, B:53:0x024c, B:55:0x0257, B:58:0x0269, B:61:0x027f, B:62:0x0286, B:64:0x0292, B:66:0x029d, B:68:0x02a6, B:69:0x02ab, B:71:0x02bb, B:73:0x02c4, B:75:0x02cb, B:77:0x02d6, B:78:0x02f0, B:80:0x02fc, B:82:0x0305, B:84:0x030e, B:86:0x0317, B:88:0x0327, B:90:0x0330, B:92:0x0340, B:94:0x0349, B:96:0x0359, B:98:0x0362, B:100:0x0372, B:102:0x037b, B:104:0x038b, B:106:0x0394, B:108:0x03a4, B:110:0x03ad, B:111:0x03b2, B:113:0x03c0, B:115:0x03c7, B:116:0x03ce, B:118:0x03de, B:120:0x03e8, B:122:0x03f1, B:126:0x0404, B:130:0x0417, B:133:0x0423, B:134:0x0429, B:135:0x0432, B:137:0x043e, B:138:0x0445, B:139:0x044c, B:140:0x0453, B:141:0x045c, B:143:0x046d, B:146:0x047a, B:147:0x0483, B:149:0x049a, B:151:0x04a6, B:152:0x04ae, B:153:0x04b7, B:155:0x04c5, B:158:0x04d3, B:160:0x04db, B:161:0x04e2, B:164:0x0507, B:168:0x051a, B:172:0x0527, B:173:0x04ea, B:175:0x04f4, B:176:0x02de, B:178:0x02e7, B:179:0x01ee, B:180:0x01f5, B:181:0x01fc, B:182:0x0205, B:183:0x020c, B:186:0x0218, B:189:0x0224, B:192:0x00dd, B:195:0x0196, B:196:0x019c, B:200:0x01af, B:202:0x00f2, B:205:0x00fe, B:206:0x0104, B:207:0x010d, B:209:0x011b, B:213:0x0130, B:215:0x013e, B:218:0x014a, B:219:0x0150, B:220:0x0159, B:222:0x0167, B:226:0x017c, B:228:0x018a), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01ee A[Catch: all -> 0x052f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0008, B:6:0x000e, B:8:0x0024, B:10:0x002a, B:13:0x0034, B:15:0x003a, B:16:0x0040, B:18:0x004c, B:23:0x0054, B:26:0x0088, B:27:0x008e, B:29:0x0097, B:30:0x009e, B:31:0x00a4, B:32:0x00aa, B:33:0x00b3, B:34:0x00ba, B:36:0x00c3, B:39:0x01bb, B:40:0x01c1, B:41:0x01c8, B:43:0x01d2, B:44:0x01db, B:48:0x022b, B:50:0x0235, B:51:0x023e, B:53:0x024c, B:55:0x0257, B:58:0x0269, B:61:0x027f, B:62:0x0286, B:64:0x0292, B:66:0x029d, B:68:0x02a6, B:69:0x02ab, B:71:0x02bb, B:73:0x02c4, B:75:0x02cb, B:77:0x02d6, B:78:0x02f0, B:80:0x02fc, B:82:0x0305, B:84:0x030e, B:86:0x0317, B:88:0x0327, B:90:0x0330, B:92:0x0340, B:94:0x0349, B:96:0x0359, B:98:0x0362, B:100:0x0372, B:102:0x037b, B:104:0x038b, B:106:0x0394, B:108:0x03a4, B:110:0x03ad, B:111:0x03b2, B:113:0x03c0, B:115:0x03c7, B:116:0x03ce, B:118:0x03de, B:120:0x03e8, B:122:0x03f1, B:126:0x0404, B:130:0x0417, B:133:0x0423, B:134:0x0429, B:135:0x0432, B:137:0x043e, B:138:0x0445, B:139:0x044c, B:140:0x0453, B:141:0x045c, B:143:0x046d, B:146:0x047a, B:147:0x0483, B:149:0x049a, B:151:0x04a6, B:152:0x04ae, B:153:0x04b7, B:155:0x04c5, B:158:0x04d3, B:160:0x04db, B:161:0x04e2, B:164:0x0507, B:168:0x051a, B:172:0x0527, B:173:0x04ea, B:175:0x04f4, B:176:0x02de, B:178:0x02e7, B:179:0x01ee, B:180:0x01f5, B:181:0x01fc, B:182:0x0205, B:183:0x020c, B:186:0x0218, B:189:0x0224, B:192:0x00dd, B:195:0x0196, B:196:0x019c, B:200:0x01af, B:202:0x00f2, B:205:0x00fe, B:206:0x0104, B:207:0x010d, B:209:0x011b, B:213:0x0130, B:215:0x013e, B:218:0x014a, B:219:0x0150, B:220:0x0159, B:222:0x0167, B:226:0x017c, B:228:0x018a), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0269 A[Catch: all -> 0x052f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0008, B:6:0x000e, B:8:0x0024, B:10:0x002a, B:13:0x0034, B:15:0x003a, B:16:0x0040, B:18:0x004c, B:23:0x0054, B:26:0x0088, B:27:0x008e, B:29:0x0097, B:30:0x009e, B:31:0x00a4, B:32:0x00aa, B:33:0x00b3, B:34:0x00ba, B:36:0x00c3, B:39:0x01bb, B:40:0x01c1, B:41:0x01c8, B:43:0x01d2, B:44:0x01db, B:48:0x022b, B:50:0x0235, B:51:0x023e, B:53:0x024c, B:55:0x0257, B:58:0x0269, B:61:0x027f, B:62:0x0286, B:64:0x0292, B:66:0x029d, B:68:0x02a6, B:69:0x02ab, B:71:0x02bb, B:73:0x02c4, B:75:0x02cb, B:77:0x02d6, B:78:0x02f0, B:80:0x02fc, B:82:0x0305, B:84:0x030e, B:86:0x0317, B:88:0x0327, B:90:0x0330, B:92:0x0340, B:94:0x0349, B:96:0x0359, B:98:0x0362, B:100:0x0372, B:102:0x037b, B:104:0x038b, B:106:0x0394, B:108:0x03a4, B:110:0x03ad, B:111:0x03b2, B:113:0x03c0, B:115:0x03c7, B:116:0x03ce, B:118:0x03de, B:120:0x03e8, B:122:0x03f1, B:126:0x0404, B:130:0x0417, B:133:0x0423, B:134:0x0429, B:135:0x0432, B:137:0x043e, B:138:0x0445, B:139:0x044c, B:140:0x0453, B:141:0x045c, B:143:0x046d, B:146:0x047a, B:147:0x0483, B:149:0x049a, B:151:0x04a6, B:152:0x04ae, B:153:0x04b7, B:155:0x04c5, B:158:0x04d3, B:160:0x04db, B:161:0x04e2, B:164:0x0507, B:168:0x051a, B:172:0x0527, B:173:0x04ea, B:175:0x04f4, B:176:0x02de, B:178:0x02e7, B:179:0x01ee, B:180:0x01f5, B:181:0x01fc, B:182:0x0205, B:183:0x020c, B:186:0x0218, B:189:0x0224, B:192:0x00dd, B:195:0x0196, B:196:0x019c, B:200:0x01af, B:202:0x00f2, B:205:0x00fe, B:206:0x0104, B:207:0x010d, B:209:0x011b, B:213:0x0130, B:215:0x013e, B:218:0x014a, B:219:0x0150, B:220:0x0159, B:222:0x0167, B:226:0x017c, B:228:0x018a), top: B:4:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.zerobalance.ping.ZeroBalancePingController.A04(java.lang.String):void");
    }

    public boolean A05() {
        boolean CxX = ((InterfaceC07234jG) this.A0H.get()).CxX();
        0fH.A07(ZeroBalancePingController.class, String.valueOf(CxX), "ZBD: shouldEnableZeroBalanceDetection return %s.");
        return CxX;
    }
}
