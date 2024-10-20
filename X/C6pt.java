package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.util.TriState;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.stickers.service.models.FetchStickerPacksByIdParams;
import com.facebook.stickers.service.models.FetchStickerPacksResult;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6pt, reason: invalid class name */
/* loaded from: 6pt.class */
public final class C6pt implements CallerContextable {
    public static final CallerContext A0J = CallerContext.A06(C6pt.class);
    public static final String __redex_internal_original_name = "StickerPacksHandler";
    public 1BY A00;
    public final C00i A0E = new 1BV((1BY) null, 83719);
    public final C00i A0D = new 1BQ(16687);
    public final C00i A04 = new 1BV((1BY) null, 50169);
    public final C00i A03 = new 1BV((1BY) null, 84497);
    public final 5R0 A05 = (5R0) 1Bi.A03(82988);
    public final 5R3 A06 = (5R3) 1Bi.A03(49720);
    public final C09694qx A01 = (C09694qx) 1Bi.A03(84635);
    public final C6pu A0A = (C6pu) 1Bi.A03(50161);
    public final C6pv A09 = (C6pv) 1Bi.A03(50162);
    public final 4rB A0H = (4rB) 1Bi.A03(49301);
    public final C09984s3 A0G = (C09984s3) 1Bi.A03(49323);
    public final C6pw A08 = (C6pw) 1Bi.A03(50163);
    public final C6px A07 = (C6px) 1Bi.A03(50164);
    public final C6py A0F = (C6py) 1Bi.A03(66763);
    public final C00i A0C = new 1BQ(99390);
    public final C6pz A0B = (C6pz) 1Bi.A03(50166);
    public final C6pl A0I = (C6pl) 1Bi.A03(50153);
    public final C00i A02 = new 1BV((1BY) null, 33059);

    public C6pt(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0178 A[Catch: all -> 0x04b9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x04b9, blocks: (B:3:0x0019, B:6:0x0024, B:9:0x002f, B:11:0x0037, B:14:0x027c, B:16:0x0284, B:19:0x028f, B:20:0x0294, B:26:0x02a0, B:27:0x02c7, B:27:0x02c7, B:31:0x02d2, B:32:0x02d7, B:34:0x02de, B:35:0x02e3, B:38:0x02f1, B:39:0x02fa, B:40:0x0301, B:42:0x030a, B:44:0x031f, B:45:0x0325, B:47:0x032e, B:50:0x033c, B:51:0x0341, B:52:0x0346, B:53:0x034a, B:54:0x0350, B:56:0x035c, B:57:0x0362, B:58:0x0369, B:61:0x0375, B:62:0x037c, B:63:0x0383, B:64:0x0388, B:65:0x038f, B:68:0x039b, B:69:0x03a2, B:70:0x03a9, B:71:0x03ae, B:72:0x03b6, B:75:0x03c3, B:76:0x03cb, B:77:0x03d2, B:79:0x03dd, B:81:0x03e6, B:83:0x03ed, B:85:0x03f5, B:86:0x03fa, B:88:0x0406, B:91:0x0414, B:93:0x041d, B:97:0x042b, B:101:0x0439, B:103:0x0442, B:107:0x0456, B:115:0x046b, B:117:0x0475, B:119:0x0488, B:122:0x0490, B:124:0x0499, B:126:0x049f, B:128:0x0042, B:129:0x0048, B:130:0x0051, B:131:0x0058, B:134:0x0064, B:135:0x0069, B:138:0x007d, B:141:0x0088, B:142:0x008d, B:144:0x0098, B:146:0x009f, B:147:0x00a5, B:148:0x00a9, B:150:0x00b0, B:151:0x00b6, B:152:0x00bd, B:154:0x00c5, B:158:0x00db, B:160:0x00e3, B:161:0x00e9, B:163:0x00f3, B:166:0x0101, B:167:0x0109, B:168:0x010e, B:177:0x012d, B:179:0x0133, B:181:0x0139, B:182:0x013e, B:184:0x0149, B:185:0x014f, B:186:0x0156, B:187:0x015d, B:188:0x0164, B:190:0x016c, B:192:0x0178, B:194:0x0181, B:195:0x01ac, B:196:0x01b1, B:199:0x01bc, B:201:0x01c3, B:204:0x01cf, B:207:0x01da, B:208:0x01df, B:209:0x01e5, B:212:0x01f2, B:213:0x01fa, B:214:0x0201, B:219:0x020f, B:224:0x02a9, B:226:0x02b2, B:230:0x02c2, B:232:0x0317, B:233:0x0223, B:235:0x0230, B:237:0x0237, B:239:0x023e, B:241:0x0248, B:242:0x024e, B:243:0x0255, B:244:0x025c, B:245:0x0263, B:247:0x026e, B:248:0x0274, B:249:0x0189, B:251:0x0191, B:255:0x019f, B:257:0x01a6, B:259:0x021b), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01bc A[Catch: all -> 0x04b9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x04b9, blocks: (B:3:0x0019, B:6:0x0024, B:9:0x002f, B:11:0x0037, B:14:0x027c, B:16:0x0284, B:19:0x028f, B:20:0x0294, B:26:0x02a0, B:27:0x02c7, B:27:0x02c7, B:31:0x02d2, B:32:0x02d7, B:34:0x02de, B:35:0x02e3, B:38:0x02f1, B:39:0x02fa, B:40:0x0301, B:42:0x030a, B:44:0x031f, B:45:0x0325, B:47:0x032e, B:50:0x033c, B:51:0x0341, B:52:0x0346, B:53:0x034a, B:54:0x0350, B:56:0x035c, B:57:0x0362, B:58:0x0369, B:61:0x0375, B:62:0x037c, B:63:0x0383, B:64:0x0388, B:65:0x038f, B:68:0x039b, B:69:0x03a2, B:70:0x03a9, B:71:0x03ae, B:72:0x03b6, B:75:0x03c3, B:76:0x03cb, B:77:0x03d2, B:79:0x03dd, B:81:0x03e6, B:83:0x03ed, B:85:0x03f5, B:86:0x03fa, B:88:0x0406, B:91:0x0414, B:93:0x041d, B:97:0x042b, B:101:0x0439, B:103:0x0442, B:107:0x0456, B:115:0x046b, B:117:0x0475, B:119:0x0488, B:122:0x0490, B:124:0x0499, B:126:0x049f, B:128:0x0042, B:129:0x0048, B:130:0x0051, B:131:0x0058, B:134:0x0064, B:135:0x0069, B:138:0x007d, B:141:0x0088, B:142:0x008d, B:144:0x0098, B:146:0x009f, B:147:0x00a5, B:148:0x00a9, B:150:0x00b0, B:151:0x00b6, B:152:0x00bd, B:154:0x00c5, B:158:0x00db, B:160:0x00e3, B:161:0x00e9, B:163:0x00f3, B:166:0x0101, B:167:0x0109, B:168:0x010e, B:177:0x012d, B:179:0x0133, B:181:0x0139, B:182:0x013e, B:184:0x0149, B:185:0x014f, B:186:0x0156, B:187:0x015d, B:188:0x0164, B:190:0x016c, B:192:0x0178, B:194:0x0181, B:195:0x01ac, B:196:0x01b1, B:199:0x01bc, B:201:0x01c3, B:204:0x01cf, B:207:0x01da, B:208:0x01df, B:209:0x01e5, B:212:0x01f2, B:213:0x01fa, B:214:0x0201, B:219:0x020f, B:224:0x02a9, B:226:0x02b2, B:230:0x02c2, B:232:0x0317, B:233:0x0223, B:235:0x0230, B:237:0x0237, B:239:0x023e, B:241:0x0248, B:242:0x024e, B:243:0x0255, B:244:0x025c, B:245:0x0263, B:247:0x026e, B:248:0x0274, B:249:0x0189, B:251:0x0191, B:255:0x019f, B:257:0x01a6, B:259:0x021b), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0189 A[Catch: all -> 0x04b9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x04b9, blocks: (B:3:0x0019, B:6:0x0024, B:9:0x002f, B:11:0x0037, B:14:0x027c, B:16:0x0284, B:19:0x028f, B:20:0x0294, B:26:0x02a0, B:27:0x02c7, B:27:0x02c7, B:31:0x02d2, B:32:0x02d7, B:34:0x02de, B:35:0x02e3, B:38:0x02f1, B:39:0x02fa, B:40:0x0301, B:42:0x030a, B:44:0x031f, B:45:0x0325, B:47:0x032e, B:50:0x033c, B:51:0x0341, B:52:0x0346, B:53:0x034a, B:54:0x0350, B:56:0x035c, B:57:0x0362, B:58:0x0369, B:61:0x0375, B:62:0x037c, B:63:0x0383, B:64:0x0388, B:65:0x038f, B:68:0x039b, B:69:0x03a2, B:70:0x03a9, B:71:0x03ae, B:72:0x03b6, B:75:0x03c3, B:76:0x03cb, B:77:0x03d2, B:79:0x03dd, B:81:0x03e6, B:83:0x03ed, B:85:0x03f5, B:86:0x03fa, B:88:0x0406, B:91:0x0414, B:93:0x041d, B:97:0x042b, B:101:0x0439, B:103:0x0442, B:107:0x0456, B:115:0x046b, B:117:0x0475, B:119:0x0488, B:122:0x0490, B:124:0x0499, B:126:0x049f, B:128:0x0042, B:129:0x0048, B:130:0x0051, B:131:0x0058, B:134:0x0064, B:135:0x0069, B:138:0x007d, B:141:0x0088, B:142:0x008d, B:144:0x0098, B:146:0x009f, B:147:0x00a5, B:148:0x00a9, B:150:0x00b0, B:151:0x00b6, B:152:0x00bd, B:154:0x00c5, B:158:0x00db, B:160:0x00e3, B:161:0x00e9, B:163:0x00f3, B:166:0x0101, B:167:0x0109, B:168:0x010e, B:177:0x012d, B:179:0x0133, B:181:0x0139, B:182:0x013e, B:184:0x0149, B:185:0x014f, B:186:0x0156, B:187:0x015d, B:188:0x0164, B:190:0x016c, B:192:0x0178, B:194:0x0181, B:195:0x01ac, B:196:0x01b1, B:199:0x01bc, B:201:0x01c3, B:204:0x01cf, B:207:0x01da, B:208:0x01df, B:209:0x01e5, B:212:0x01f2, B:213:0x01fa, B:214:0x0201, B:219:0x020f, B:224:0x02a9, B:226:0x02b2, B:230:0x02c2, B:232:0x0317, B:233:0x0223, B:235:0x0230, B:237:0x0237, B:239:0x023e, B:241:0x0248, B:242:0x024e, B:243:0x0255, B:244:0x025c, B:245:0x0263, B:247:0x026e, B:248:0x0274, B:249:0x0189, B:251:0x0191, B:255:0x019f, B:257:0x01a6, B:259:0x021b), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02d2 A[Catch: all -> 0x04b9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x04b9, blocks: (B:3:0x0019, B:6:0x0024, B:9:0x002f, B:11:0x0037, B:14:0x027c, B:16:0x0284, B:19:0x028f, B:20:0x0294, B:26:0x02a0, B:27:0x02c7, B:27:0x02c7, B:31:0x02d2, B:32:0x02d7, B:34:0x02de, B:35:0x02e3, B:38:0x02f1, B:39:0x02fa, B:40:0x0301, B:42:0x030a, B:44:0x031f, B:45:0x0325, B:47:0x032e, B:50:0x033c, B:51:0x0341, B:52:0x0346, B:53:0x034a, B:54:0x0350, B:56:0x035c, B:57:0x0362, B:58:0x0369, B:61:0x0375, B:62:0x037c, B:63:0x0383, B:64:0x0388, B:65:0x038f, B:68:0x039b, B:69:0x03a2, B:70:0x03a9, B:71:0x03ae, B:72:0x03b6, B:75:0x03c3, B:76:0x03cb, B:77:0x03d2, B:79:0x03dd, B:81:0x03e6, B:83:0x03ed, B:85:0x03f5, B:86:0x03fa, B:88:0x0406, B:91:0x0414, B:93:0x041d, B:97:0x042b, B:101:0x0439, B:103:0x0442, B:107:0x0456, B:115:0x046b, B:117:0x0475, B:119:0x0488, B:122:0x0490, B:124:0x0499, B:126:0x049f, B:128:0x0042, B:129:0x0048, B:130:0x0051, B:131:0x0058, B:134:0x0064, B:135:0x0069, B:138:0x007d, B:141:0x0088, B:142:0x008d, B:144:0x0098, B:146:0x009f, B:147:0x00a5, B:148:0x00a9, B:150:0x00b0, B:151:0x00b6, B:152:0x00bd, B:154:0x00c5, B:158:0x00db, B:160:0x00e3, B:161:0x00e9, B:163:0x00f3, B:166:0x0101, B:167:0x0109, B:168:0x010e, B:177:0x012d, B:179:0x0133, B:181:0x0139, B:182:0x013e, B:184:0x0149, B:185:0x014f, B:186:0x0156, B:187:0x015d, B:188:0x0164, B:190:0x016c, B:192:0x0178, B:194:0x0181, B:195:0x01ac, B:196:0x01b1, B:199:0x01bc, B:201:0x01c3, B:204:0x01cf, B:207:0x01da, B:208:0x01df, B:209:0x01e5, B:212:0x01f2, B:213:0x01fa, B:214:0x0201, B:219:0x020f, B:224:0x02a9, B:226:0x02b2, B:230:0x02c2, B:232:0x0317, B:233:0x0223, B:235:0x0230, B:237:0x0237, B:239:0x023e, B:241:0x0248, B:242:0x024e, B:243:0x0255, B:244:0x025c, B:245:0x0263, B:247:0x026e, B:248:0x0274, B:249:0x0189, B:251:0x0191, B:255:0x019f, B:257:0x01a6, B:259:0x021b), top: B:2:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.fbservice.service.OperationResult A00(X.C6pt r301, com.facebook.stickers.service.models.FetchStickerPacksParams r302) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6pt.A00(X.6pt, com.facebook.stickers.service.models.FetchStickerPacksParams):com.facebook.fbservice.service.OperationResult");
    }

    public static FetchStickerPacksResult A01(C6pt c6pt, FetchStickerPacksByIdParams fetchStickerPacksByIdParams) {
        C00j.A05("StickerPacksHandler fetchStickerPacksByIdFromServer", 786912896);
        try {
            FetchStickerPacksResult fetchStickerPacksResult = (FetchStickerPacksResult) c6pt.A01.A00(c6pt.A0G, null, fetchStickerPacksByIdParams);
            C00j.A01(18257776);
            return fetchStickerPacksResult;
        } catch (Throwable th) {
            C00j.A01(-272614177);
            throw th;
        }
    }

    private void A02(5Qx r302) {
        this.A07.A03(7nG.A01.A0D(r302.name().concat("/")).A0D(7nG.A00.A08()), ((C0dp) this.A0C.get()).now());
    }

    public OperationResult A03(FbUserSession fbUserSession, 1TC r303) {
        ImmutableList immutableList = ((FetchStickerPacksByIdParams) r303.A00.getParcelable("fetchStickerPacksByIdParams")).A00;
        ArrayList A0s = AnonymousClass001.A0s();
        ImmutableList.Builder A0h = 4YU.A0h();
        ImmutableMap.Builder A0c = 1BK.A0c();
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            69H r0 = (69H) 1Lo.A04((Context) null, fbUserSession, this.A00, 49969);
            TriState A01 = r0.A01(A0i);
            5R0 r02 = this.A05;
            5Qx r03 = 5Qx.A03;
            TriState triState = r02.A0K(r03) ? 5R0.A05(r02, r03, A0i) ? TriState.YES : TriState.NO : TriState.UNSET;
            if (r0.A0E(A0i) && A01.isSet()) {
                A0h.m11011add((Object) r0.A03(A0i));
                A0c.put(A0i, A01.asBoolean(false) ? H9k.DOWNLOADED : H9k.IN_STORE);
            } else if (r02.A0L(A0i) && triState.isSet()) {
                C00j.A05("StickerPacksHandler fetchStickerPacksById fetch from db", 493282167);
                try {
                    A0h.m11011add((Object) r02.A06(A0i));
                    A0c.put(A0i, triState.asBoolean(false) ? H9k.DOWNLOADED : H9k.IN_STORE);
                    C00j.A01(-853480198);
                } catch (Throwable th) {
                    C00j.A01(224439082);
                    throw th;
                }
            } else {
                A0s.add(A0i);
            }
        }
        if (A0s.size() > 0) {
            FetchStickerPacksResult A012 = A01(this, new FetchStickerPacksByIdParams(A0s));
            A0h.addAll((Iterable) A012.A00.get());
            A0c.putAll((java.util.Map) A012.A01.get());
        }
        FetchStickerPacksResult fetchStickerPacksResult = FetchStickerPacksResult.A03;
        return OperationResult.A04(new FetchStickerPacksResult(A0h.build(), A0c.build()));
    }
}
