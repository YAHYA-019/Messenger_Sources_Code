package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.1f9, reason: invalid class name */
/* loaded from: 1f9.class */
public final class C1f9 {
    public static final 1fH A06;
    public static final 1fB A07 = 1fA.A00;
    public static final 1fG A08 = new 1fE();
    public volatile boolean A05 = false;
    public 1fG A01 = A08;
    public C1fI A00 = A06;
    public boolean A02 = false;
    public final 1fL A03 = new 1fL() { // from class: X.1fK
        public int A00() {
            return 1;
        }

        public 1fB A01(C1hi c1hi, int i) {
            1fB r305;
            if (c1hi != null) {
                C1f9 c1f9 = C1f9.this;
                1fB r0 = C1f9.A07;
                if (c1f9.A02) {
                    r305 = c1f9.A01.AJ8(c1f9.A00, c1hi);
                    if (r305 == null) {
                        ((1fL) this).A00 = 0Pz.A0T("failed_to_create_booster_", c1f9.A01.B3C());
                    }
                    return r305;
                }
            }
            r305 = C1f9.A07;
            return r305;
        }

        public C1hi A02(JSONObject jSONObject, int i) {
            int optInt = jSONObject.optInt(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            int optInt2 = jSONObject.optInt("frequency");
            C1hi c1hi = new C1hi();
            c1hi.A02 = optInt2;
            c1hi.A00 = optInt;
            return c1hi;
        }

        public void A04(Context context) {
            C1f9 c1f9 = C1f9.this;
            C1f9.A00(context, c1f9);
            if (c1f9.A02) {
                return;
            }
            ((1fL) this).A00 = C1f9.A06.A00;
        }
    };
    public final 1fL A04 = new 1fN(this);

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1fH, java.lang.Object] */
    static {
        ?? obj = new Object();
        ((1fH) obj).A00 = "uninitialized";
        A06 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0744, code lost:
    
        if (r302.A00 != r0) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x06cc, code lost:
    
        if (r307 != X.C1f9.A06) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r302.A00 != r0) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0747, code lost:
    
        r305 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x06d2, code lost:
    
        r0 = X.C1f9.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x06e7, code lost:
    
        ((X.1fH) r0).A00 = X.0Pz.A0W("no_suitable_model_for_", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x06fb, code lost:
    
        if (r302.A01 == X.C1f9.A08) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0708, code lost:
    
        if (r302.A00 == r0) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x04d4, code lost:
    
        if (r0 == 8) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x00e1, code lost:
    
        if (r302.A00 != r0) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0126, code lost:
    
        if (r302.A00 != r0) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a1, code lost:
    
        if (r0.startsWith("SM-N96") != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x073a A[Catch: all -> 0x0794, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:16:0x002c, B:17:0x0031, B:20:0x003d, B:25:0x074b, B:26:0x0751, B:47:0x010b, B:48:0x0110, B:51:0x011c, B:122:0x0729, B:123:0x072e, B:126:0x073a, B:182:0x06b7, B:185:0x06c3, B:279:0x06ed, B:280:0x06f2, B:283:0x06fe, B:398:0x00c6, B:399:0x00cb, B:402:0x00d7, B:406:0x075b, B:407:0x0761, B:410:0x076d, B:411:0x0773, B:416:0x0783, B:417:0x0789, B:419:0x0790, B:9:0x0013, B:12:0x001b, B:14:0x0026, B:27:0x004d, B:28:0x0052, B:29:0x0059, B:31:0x0066, B:35:0x0076, B:38:0x00e7, B:41:0x00f1, B:43:0x00fc, B:45:0x0105, B:54:0x012c, B:55:0x0131, B:57:0x0137, B:59:0x013e, B:62:0x014f, B:65:0x015f, B:67:0x016a, B:70:0x0176, B:74:0x0186, B:78:0x0198, B:82:0x01aa, B:85:0x01b6, B:88:0x01c2, B:91:0x01cd, B:92:0x01d2, B:93:0x029b, B:96:0x02a6, B:97:0x02ab, B:99:0x01d9, B:103:0x021b, B:104:0x0264, B:105:0x0269, B:108:0x0278, B:110:0x027f, B:116:0x070e, B:118:0x071a, B:120:0x0723, B:133:0x0404, B:136:0x0412, B:137:0x0417, B:138:0x041e, B:139:0x0425, B:142:0x0435, B:145:0x044c, B:147:0x0453, B:153:0x0475, B:156:0x0486, B:158:0x048d, B:164:0x04e6, B:165:0x04eb, B:166:0x04f4, B:169:0x0502, B:170:0x050b, B:172:0x0514, B:192:0x0543, B:193:0x054a, B:194:0x0551, B:199:0x0565, B:200:0x056a, B:202:0x0578, B:206:0x058c, B:207:0x0592, B:209:0x059a, B:212:0x05a6, B:217:0x05b2, B:220:0x0631, B:222:0x063a, B:180:0x0530, B:181:0x0536, B:223:0x05ce, B:225:0x05d9, B:234:0x05e7, B:235:0x05ee, B:236:0x05f5, B:241:0x0609, B:242:0x060e, B:244:0x061c, B:251:0x0643, B:254:0x0653, B:256:0x065a, B:262:0x0673, B:265:0x0684, B:267:0x068b, B:288:0x0697, B:290:0x06a0, B:273:0x06d2, B:275:0x06de, B:277:0x06e7, B:176:0x0520, B:178:0x052a, B:304:0x04bd, B:306:0x04c4, B:309:0x04d7, B:311:0x04de, B:312:0x02b3, B:314:0x02be, B:317:0x02ca, B:320:0x02d5, B:321:0x02db, B:323:0x02e2, B:324:0x02ea, B:327:0x02f5, B:328:0x02fb, B:330:0x0302, B:331:0x030a, B:334:0x0315, B:337:0x0320, B:338:0x0325, B:340:0x0333, B:343:0x033f, B:346:0x034a, B:347:0x034f, B:348:0x0357, B:351:0x0362, B:352:0x0367, B:354:0x0375, B:357:0x0381, B:360:0x038c, B:361:0x0391, B:362:0x0399, B:365:0x03a4, B:366:0x03a9, B:368:0x03b7, B:371:0x03c3, B:374:0x03cf, B:377:0x03da, B:378:0x03df, B:379:0x03e7, B:382:0x03f2, B:383:0x03f7, B:384:0x0080, B:385:0x0087, B:388:0x0091, B:389:0x0096, B:391:0x00a1, B:392:0x00a9, B:394:0x00b7, B:396:0x00c0), top: B:3:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0404 A[Catch: all -> 0x0759, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0759, blocks: (B:9:0x0013, B:12:0x001b, B:14:0x0026, B:27:0x004d, B:28:0x0052, B:29:0x0059, B:31:0x0066, B:35:0x0076, B:38:0x00e7, B:41:0x00f1, B:43:0x00fc, B:45:0x0105, B:54:0x012c, B:55:0x0131, B:57:0x0137, B:59:0x013e, B:62:0x014f, B:65:0x015f, B:67:0x016a, B:70:0x0176, B:74:0x0186, B:78:0x0198, B:82:0x01aa, B:85:0x01b6, B:88:0x01c2, B:91:0x01cd, B:92:0x01d2, B:93:0x029b, B:96:0x02a6, B:97:0x02ab, B:99:0x01d9, B:103:0x021b, B:104:0x0264, B:105:0x0269, B:108:0x0278, B:110:0x027f, B:116:0x070e, B:118:0x071a, B:120:0x0723, B:133:0x0404, B:136:0x0412, B:137:0x0417, B:138:0x041e, B:139:0x0425, B:142:0x0435, B:145:0x044c, B:147:0x0453, B:153:0x0475, B:156:0x0486, B:158:0x048d, B:164:0x04e6, B:165:0x04eb, B:166:0x04f4, B:169:0x0502, B:170:0x050b, B:172:0x0514, B:192:0x0543, B:193:0x054a, B:194:0x0551, B:199:0x0565, B:200:0x056a, B:202:0x0578, B:206:0x058c, B:207:0x0592, B:209:0x059a, B:212:0x05a6, B:217:0x05b2, B:220:0x0631, B:222:0x063a, B:180:0x0530, B:181:0x0536, B:223:0x05ce, B:225:0x05d9, B:234:0x05e7, B:235:0x05ee, B:236:0x05f5, B:241:0x0609, B:242:0x060e, B:244:0x061c, B:251:0x0643, B:254:0x0653, B:256:0x065a, B:262:0x0673, B:265:0x0684, B:267:0x068b, B:288:0x0697, B:290:0x06a0, B:273:0x06d2, B:275:0x06de, B:277:0x06e7, B:176:0x0520, B:178:0x052a, B:304:0x04bd, B:306:0x04c4, B:309:0x04d7, B:311:0x04de, B:312:0x02b3, B:314:0x02be, B:317:0x02ca, B:320:0x02d5, B:321:0x02db, B:323:0x02e2, B:324:0x02ea, B:327:0x02f5, B:328:0x02fb, B:330:0x0302, B:331:0x030a, B:334:0x0315, B:337:0x0320, B:338:0x0325, B:340:0x0333, B:343:0x033f, B:346:0x034a, B:347:0x034f, B:348:0x0357, B:351:0x0362, B:352:0x0367, B:354:0x0375, B:357:0x0381, B:360:0x038c, B:361:0x0391, B:362:0x0399, B:365:0x03a4, B:366:0x03a9, B:368:0x03b7, B:371:0x03c3, B:374:0x03cf, B:377:0x03da, B:378:0x03df, B:379:0x03e7, B:382:0x03f2, B:383:0x03f7, B:384:0x0080, B:385:0x0087, B:388:0x0091, B:389:0x0096, B:391:0x00a1, B:392:0x00a9, B:394:0x00b7, B:396:0x00c0), top: B:8:0x0013, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0435 A[Catch: all -> 0x0759, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0759, blocks: (B:9:0x0013, B:12:0x001b, B:14:0x0026, B:27:0x004d, B:28:0x0052, B:29:0x0059, B:31:0x0066, B:35:0x0076, B:38:0x00e7, B:41:0x00f1, B:43:0x00fc, B:45:0x0105, B:54:0x012c, B:55:0x0131, B:57:0x0137, B:59:0x013e, B:62:0x014f, B:65:0x015f, B:67:0x016a, B:70:0x0176, B:74:0x0186, B:78:0x0198, B:82:0x01aa, B:85:0x01b6, B:88:0x01c2, B:91:0x01cd, B:92:0x01d2, B:93:0x029b, B:96:0x02a6, B:97:0x02ab, B:99:0x01d9, B:103:0x021b, B:104:0x0264, B:105:0x0269, B:108:0x0278, B:110:0x027f, B:116:0x070e, B:118:0x071a, B:120:0x0723, B:133:0x0404, B:136:0x0412, B:137:0x0417, B:138:0x041e, B:139:0x0425, B:142:0x0435, B:145:0x044c, B:147:0x0453, B:153:0x0475, B:156:0x0486, B:158:0x048d, B:164:0x04e6, B:165:0x04eb, B:166:0x04f4, B:169:0x0502, B:170:0x050b, B:172:0x0514, B:192:0x0543, B:193:0x054a, B:194:0x0551, B:199:0x0565, B:200:0x056a, B:202:0x0578, B:206:0x058c, B:207:0x0592, B:209:0x059a, B:212:0x05a6, B:217:0x05b2, B:220:0x0631, B:222:0x063a, B:180:0x0530, B:181:0x0536, B:223:0x05ce, B:225:0x05d9, B:234:0x05e7, B:235:0x05ee, B:236:0x05f5, B:241:0x0609, B:242:0x060e, B:244:0x061c, B:251:0x0643, B:254:0x0653, B:256:0x065a, B:262:0x0673, B:265:0x0684, B:267:0x068b, B:288:0x0697, B:290:0x06a0, B:273:0x06d2, B:275:0x06de, B:277:0x06e7, B:176:0x0520, B:178:0x052a, B:304:0x04bd, B:306:0x04c4, B:309:0x04d7, B:311:0x04de, B:312:0x02b3, B:314:0x02be, B:317:0x02ca, B:320:0x02d5, B:321:0x02db, B:323:0x02e2, B:324:0x02ea, B:327:0x02f5, B:328:0x02fb, B:330:0x0302, B:331:0x030a, B:334:0x0315, B:337:0x0320, B:338:0x0325, B:340:0x0333, B:343:0x033f, B:346:0x034a, B:347:0x034f, B:348:0x0357, B:351:0x0362, B:352:0x0367, B:354:0x0375, B:357:0x0381, B:360:0x038c, B:361:0x0391, B:362:0x0399, B:365:0x03a4, B:366:0x03a9, B:368:0x03b7, B:371:0x03c3, B:374:0x03cf, B:377:0x03da, B:378:0x03df, B:379:0x03e7, B:382:0x03f2, B:383:0x03f7, B:384:0x0080, B:385:0x0087, B:388:0x0091, B:389:0x0096, B:391:0x00a1, B:392:0x00a9, B:394:0x00b7, B:396:0x00c0), top: B:8:0x0013, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06c3 A[Catch: all -> 0x0794, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:16:0x002c, B:17:0x0031, B:20:0x003d, B:25:0x074b, B:26:0x0751, B:47:0x010b, B:48:0x0110, B:51:0x011c, B:122:0x0729, B:123:0x072e, B:126:0x073a, B:182:0x06b7, B:185:0x06c3, B:279:0x06ed, B:280:0x06f2, B:283:0x06fe, B:398:0x00c6, B:399:0x00cb, B:402:0x00d7, B:406:0x075b, B:407:0x0761, B:410:0x076d, B:411:0x0773, B:416:0x0783, B:417:0x0789, B:419:0x0790, B:9:0x0013, B:12:0x001b, B:14:0x0026, B:27:0x004d, B:28:0x0052, B:29:0x0059, B:31:0x0066, B:35:0x0076, B:38:0x00e7, B:41:0x00f1, B:43:0x00fc, B:45:0x0105, B:54:0x012c, B:55:0x0131, B:57:0x0137, B:59:0x013e, B:62:0x014f, B:65:0x015f, B:67:0x016a, B:70:0x0176, B:74:0x0186, B:78:0x0198, B:82:0x01aa, B:85:0x01b6, B:88:0x01c2, B:91:0x01cd, B:92:0x01d2, B:93:0x029b, B:96:0x02a6, B:97:0x02ab, B:99:0x01d9, B:103:0x021b, B:104:0x0264, B:105:0x0269, B:108:0x0278, B:110:0x027f, B:116:0x070e, B:118:0x071a, B:120:0x0723, B:133:0x0404, B:136:0x0412, B:137:0x0417, B:138:0x041e, B:139:0x0425, B:142:0x0435, B:145:0x044c, B:147:0x0453, B:153:0x0475, B:156:0x0486, B:158:0x048d, B:164:0x04e6, B:165:0x04eb, B:166:0x04f4, B:169:0x0502, B:170:0x050b, B:172:0x0514, B:192:0x0543, B:193:0x054a, B:194:0x0551, B:199:0x0565, B:200:0x056a, B:202:0x0578, B:206:0x058c, B:207:0x0592, B:209:0x059a, B:212:0x05a6, B:217:0x05b2, B:220:0x0631, B:222:0x063a, B:180:0x0530, B:181:0x0536, B:223:0x05ce, B:225:0x05d9, B:234:0x05e7, B:235:0x05ee, B:236:0x05f5, B:241:0x0609, B:242:0x060e, B:244:0x061c, B:251:0x0643, B:254:0x0653, B:256:0x065a, B:262:0x0673, B:265:0x0684, B:267:0x068b, B:288:0x0697, B:290:0x06a0, B:273:0x06d2, B:275:0x06de, B:277:0x06e7, B:176:0x0520, B:178:0x052a, B:304:0x04bd, B:306:0x04c4, B:309:0x04d7, B:311:0x04de, B:312:0x02b3, B:314:0x02be, B:317:0x02ca, B:320:0x02d5, B:321:0x02db, B:323:0x02e2, B:324:0x02ea, B:327:0x02f5, B:328:0x02fb, B:330:0x0302, B:331:0x030a, B:334:0x0315, B:337:0x0320, B:338:0x0325, B:340:0x0333, B:343:0x033f, B:346:0x034a, B:347:0x034f, B:348:0x0357, B:351:0x0362, B:352:0x0367, B:354:0x0375, B:357:0x0381, B:360:0x038c, B:361:0x0391, B:362:0x0399, B:365:0x03a4, B:366:0x03a9, B:368:0x03b7, B:371:0x03c3, B:374:0x03cf, B:377:0x03da, B:378:0x03df, B:379:0x03e7, B:382:0x03f2, B:383:0x03f7, B:384:0x0080, B:385:0x0087, B:388:0x0091, B:389:0x0096, B:391:0x00a1, B:392:0x00a9, B:394:0x00b7, B:396:0x00c0), top: B:3:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6 A[Catch: all -> 0x0759, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0759, blocks: (B:9:0x0013, B:12:0x001b, B:14:0x0026, B:27:0x004d, B:28:0x0052, B:29:0x0059, B:31:0x0066, B:35:0x0076, B:38:0x00e7, B:41:0x00f1, B:43:0x00fc, B:45:0x0105, B:54:0x012c, B:55:0x0131, B:57:0x0137, B:59:0x013e, B:62:0x014f, B:65:0x015f, B:67:0x016a, B:70:0x0176, B:74:0x0186, B:78:0x0198, B:82:0x01aa, B:85:0x01b6, B:88:0x01c2, B:91:0x01cd, B:92:0x01d2, B:93:0x029b, B:96:0x02a6, B:97:0x02ab, B:99:0x01d9, B:103:0x021b, B:104:0x0264, B:105:0x0269, B:108:0x0278, B:110:0x027f, B:116:0x070e, B:118:0x071a, B:120:0x0723, B:133:0x0404, B:136:0x0412, B:137:0x0417, B:138:0x041e, B:139:0x0425, B:142:0x0435, B:145:0x044c, B:147:0x0453, B:153:0x0475, B:156:0x0486, B:158:0x048d, B:164:0x04e6, B:165:0x04eb, B:166:0x04f4, B:169:0x0502, B:170:0x050b, B:172:0x0514, B:192:0x0543, B:193:0x054a, B:194:0x0551, B:199:0x0565, B:200:0x056a, B:202:0x0578, B:206:0x058c, B:207:0x0592, B:209:0x059a, B:212:0x05a6, B:217:0x05b2, B:220:0x0631, B:222:0x063a, B:180:0x0530, B:181:0x0536, B:223:0x05ce, B:225:0x05d9, B:234:0x05e7, B:235:0x05ee, B:236:0x05f5, B:241:0x0609, B:242:0x060e, B:244:0x061c, B:251:0x0643, B:254:0x0653, B:256:0x065a, B:262:0x0673, B:265:0x0684, B:267:0x068b, B:288:0x0697, B:290:0x06a0, B:273:0x06d2, B:275:0x06de, B:277:0x06e7, B:176:0x0520, B:178:0x052a, B:304:0x04bd, B:306:0x04c4, B:309:0x04d7, B:311:0x04de, B:312:0x02b3, B:314:0x02be, B:317:0x02ca, B:320:0x02d5, B:321:0x02db, B:323:0x02e2, B:324:0x02ea, B:327:0x02f5, B:328:0x02fb, B:330:0x0302, B:331:0x030a, B:334:0x0315, B:337:0x0320, B:338:0x0325, B:340:0x0333, B:343:0x033f, B:346:0x034a, B:347:0x034f, B:348:0x0357, B:351:0x0362, B:352:0x0367, B:354:0x0375, B:357:0x0381, B:360:0x038c, B:361:0x0391, B:362:0x0399, B:365:0x03a4, B:366:0x03a9, B:368:0x03b7, B:371:0x03c3, B:374:0x03cf, B:377:0x03da, B:378:0x03df, B:379:0x03e7, B:382:0x03f2, B:383:0x03f7, B:384:0x0080, B:385:0x0087, B:388:0x0091, B:389:0x0096, B:391:0x00a1, B:392:0x00a9, B:394:0x00b7, B:396:0x00c0), top: B:8:0x0013, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cd A[Catch: all -> 0x0759, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0759, blocks: (B:9:0x0013, B:12:0x001b, B:14:0x0026, B:27:0x004d, B:28:0x0052, B:29:0x0059, B:31:0x0066, B:35:0x0076, B:38:0x00e7, B:41:0x00f1, B:43:0x00fc, B:45:0x0105, B:54:0x012c, B:55:0x0131, B:57:0x0137, B:59:0x013e, B:62:0x014f, B:65:0x015f, B:67:0x016a, B:70:0x0176, B:74:0x0186, B:78:0x0198, B:82:0x01aa, B:85:0x01b6, B:88:0x01c2, B:91:0x01cd, B:92:0x01d2, B:93:0x029b, B:96:0x02a6, B:97:0x02ab, B:99:0x01d9, B:103:0x021b, B:104:0x0264, B:105:0x0269, B:108:0x0278, B:110:0x027f, B:116:0x070e, B:118:0x071a, B:120:0x0723, B:133:0x0404, B:136:0x0412, B:137:0x0417, B:138:0x041e, B:139:0x0425, B:142:0x0435, B:145:0x044c, B:147:0x0453, B:153:0x0475, B:156:0x0486, B:158:0x048d, B:164:0x04e6, B:165:0x04eb, B:166:0x04f4, B:169:0x0502, B:170:0x050b, B:172:0x0514, B:192:0x0543, B:193:0x054a, B:194:0x0551, B:199:0x0565, B:200:0x056a, B:202:0x0578, B:206:0x058c, B:207:0x0592, B:209:0x059a, B:212:0x05a6, B:217:0x05b2, B:220:0x0631, B:222:0x063a, B:180:0x0530, B:181:0x0536, B:223:0x05ce, B:225:0x05d9, B:234:0x05e7, B:235:0x05ee, B:236:0x05f5, B:241:0x0609, B:242:0x060e, B:244:0x061c, B:251:0x0643, B:254:0x0653, B:256:0x065a, B:262:0x0673, B:265:0x0684, B:267:0x068b, B:288:0x0697, B:290:0x06a0, B:273:0x06d2, B:275:0x06de, B:277:0x06e7, B:176:0x0520, B:178:0x052a, B:304:0x04bd, B:306:0x04c4, B:309:0x04d7, B:311:0x04de, B:312:0x02b3, B:314:0x02be, B:317:0x02ca, B:320:0x02d5, B:321:0x02db, B:323:0x02e2, B:324:0x02ea, B:327:0x02f5, B:328:0x02fb, B:330:0x0302, B:331:0x030a, B:334:0x0315, B:337:0x0320, B:338:0x0325, B:340:0x0333, B:343:0x033f, B:346:0x034a, B:347:0x034f, B:348:0x0357, B:351:0x0362, B:352:0x0367, B:354:0x0375, B:357:0x0381, B:360:0x038c, B:361:0x0391, B:362:0x0399, B:365:0x03a4, B:366:0x03a9, B:368:0x03b7, B:371:0x03c3, B:374:0x03cf, B:377:0x03da, B:378:0x03df, B:379:0x03e7, B:382:0x03f2, B:383:0x03f7, B:384:0x0080, B:385:0x0087, B:388:0x0091, B:389:0x0096, B:391:0x00a1, B:392:0x00a9, B:394:0x00b7, B:396:0x00c0), top: B:8:0x0013, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029b A[Catch: all -> 0x0759, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0759, blocks: (B:9:0x0013, B:12:0x001b, B:14:0x0026, B:27:0x004d, B:28:0x0052, B:29:0x0059, B:31:0x0066, B:35:0x0076, B:38:0x00e7, B:41:0x00f1, B:43:0x00fc, B:45:0x0105, B:54:0x012c, B:55:0x0131, B:57:0x0137, B:59:0x013e, B:62:0x014f, B:65:0x015f, B:67:0x016a, B:70:0x0176, B:74:0x0186, B:78:0x0198, B:82:0x01aa, B:85:0x01b6, B:88:0x01c2, B:91:0x01cd, B:92:0x01d2, B:93:0x029b, B:96:0x02a6, B:97:0x02ab, B:99:0x01d9, B:103:0x021b, B:104:0x0264, B:105:0x0269, B:108:0x0278, B:110:0x027f, B:116:0x070e, B:118:0x071a, B:120:0x0723, B:133:0x0404, B:136:0x0412, B:137:0x0417, B:138:0x041e, B:139:0x0425, B:142:0x0435, B:145:0x044c, B:147:0x0453, B:153:0x0475, B:156:0x0486, B:158:0x048d, B:164:0x04e6, B:165:0x04eb, B:166:0x04f4, B:169:0x0502, B:170:0x050b, B:172:0x0514, B:192:0x0543, B:193:0x054a, B:194:0x0551, B:199:0x0565, B:200:0x056a, B:202:0x0578, B:206:0x058c, B:207:0x0592, B:209:0x059a, B:212:0x05a6, B:217:0x05b2, B:220:0x0631, B:222:0x063a, B:180:0x0530, B:181:0x0536, B:223:0x05ce, B:225:0x05d9, B:234:0x05e7, B:235:0x05ee, B:236:0x05f5, B:241:0x0609, B:242:0x060e, B:244:0x061c, B:251:0x0643, B:254:0x0653, B:256:0x065a, B:262:0x0673, B:265:0x0684, B:267:0x068b, B:288:0x0697, B:290:0x06a0, B:273:0x06d2, B:275:0x06de, B:277:0x06e7, B:176:0x0520, B:178:0x052a, B:304:0x04bd, B:306:0x04c4, B:309:0x04d7, B:311:0x04de, B:312:0x02b3, B:314:0x02be, B:317:0x02ca, B:320:0x02d5, B:321:0x02db, B:323:0x02e2, B:324:0x02ea, B:327:0x02f5, B:328:0x02fb, B:330:0x0302, B:331:0x030a, B:334:0x0315, B:337:0x0320, B:338:0x0325, B:340:0x0333, B:343:0x033f, B:346:0x034a, B:347:0x034f, B:348:0x0357, B:351:0x0362, B:352:0x0367, B:354:0x0375, B:357:0x0381, B:360:0x038c, B:361:0x0391, B:362:0x0399, B:365:0x03a4, B:366:0x03a9, B:368:0x03b7, B:371:0x03c3, B:374:0x03cf, B:377:0x03da, B:378:0x03df, B:379:0x03e7, B:382:0x03f2, B:383:0x03f7, B:384:0x0080, B:385:0x0087, B:388:0x0091, B:389:0x0096, B:391:0x00a1, B:392:0x00a9, B:394:0x00b7, B:396:0x00c0), top: B:8:0x0013, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(android.content.Context r301, X.C1f9 r302) {
        /*
            Method dump skipped, instructions count: 1947
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1f9.A00(android.content.Context, X.1f9):void");
    }
}
