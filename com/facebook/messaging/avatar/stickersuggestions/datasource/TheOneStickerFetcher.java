package com.facebook.messaging.avatar.stickersuggestions.datasource;

import X.03Y;
import X.04S;
import X.0DE;
import X.0DR;
import X.0Ds;
import X.11T;
import X.1BP;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2Zo;
import X.2Zs;
import X.2Zy;
import X.2aK;
import X.7N2;
import X.7uE;
import X.C0dp;
import X.C6fe;
import X.C82r;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: TheOneStickerFetcher.class */
public final class TheOneStickerFetcher implements 7N2 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final C6fe A08;
    public final ConcurrentHashMap A09;
    public final AtomicBoolean A0A;
    public final FbUserSession A0B;
    public final 1BP A0C;
    public final 2Zs A0D;

    public TheOneStickerFetcher(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A0B = fbUserSession;
        this.A05 = 1Bq.A00(16520);
        this.A0D = 2Zo.A03(true);
        this.A06 = 1Bu.A00(68898);
        this.A0A = new AtomicBoolean(false);
        this.A04 = 1Bq.A00(99390);
        this.A09 = new ConcurrentHashMap();
        this.A07 = 1Bu.A00(66486);
        this.A03 = 1Lm.A01(fbUserSession, 66197);
        this.A0C = FbInjector.A00;
        this.A08 = (C6fe) this.A07.A00.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x010f, code lost:
    
        if (r305 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0529 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x074f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x050a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04c7 A[Catch: InterruptedException | ExecutionException | TimeoutException -> 0x07b1, InterruptedException | ExecutionException | TimeoutException -> 0x07b1, InterruptedException | ExecutionException | TimeoutException -> 0x07b1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {InterruptedException | ExecutionException | TimeoutException -> 0x07b1, blocks: (B:29:0x0257, B:29:0x0257, B:29:0x0257, B:30:0x025c, B:30:0x025c, B:30:0x025c, B:32:0x0262, B:32:0x0262, B:32:0x0262, B:34:0x0269, B:34:0x0269, B:34:0x0269, B:36:0x0275, B:36:0x0275, B:36:0x0275, B:38:0x027e, B:38:0x027e, B:38:0x027e, B:39:0x0287, B:39:0x0287, B:39:0x0287, B:40:0x028e, B:40:0x028e, B:40:0x028e, B:41:0x0295, B:41:0x0295, B:41:0x0295, B:42:0x029c, B:42:0x029c, B:42:0x029c, B:43:0x02a5, B:43:0x02a5, B:43:0x02a5, B:45:0x02b3, B:45:0x02b3, B:45:0x02b3, B:47:0x02bf, B:47:0x02bf, B:47:0x02bf, B:48:0x02c6, B:48:0x02c6, B:48:0x02c6, B:52:0x02e2, B:52:0x02e2, B:52:0x02e2, B:53:0x02e9, B:53:0x02e9, B:53:0x02e9, B:57:0x0305, B:57:0x0305, B:57:0x0305, B:60:0x0311, B:60:0x0311, B:60:0x0311, B:61:0x0318, B:61:0x0318, B:61:0x0318, B:64:0x0326, B:64:0x0326, B:64:0x0326, B:65:0x032f, B:65:0x032f, B:65:0x032f, B:66:0x0336, B:66:0x0336, B:66:0x0336, B:67:0x033b, B:67:0x033b, B:67:0x033b, B:69:0x0347, B:69:0x0347, B:69:0x0347, B:71:0x0364, B:71:0x0364, B:71:0x0364, B:72:0x036b, B:72:0x036b, B:72:0x036b, B:76:0x037e, B:76:0x037e, B:76:0x037e, B:79:0x038a, B:79:0x038a, B:79:0x038a, B:87:0x03a6, B:87:0x03a6, B:87:0x03a6, B:88:0x03ab, B:88:0x03ab, B:88:0x03ab, B:88:0x03ab, B:88:0x03ab, B:88:0x03ab, B:91:0x03b9, B:91:0x03b9, B:91:0x03b9, B:92:0x03c0, B:92:0x03c0, B:92:0x03c0, B:94:0x03c9, B:94:0x03c9, B:94:0x03c9, B:96:0x03de, B:96:0x03de, B:96:0x03de, B:97:0x03e5, B:97:0x03e5, B:97:0x03e5, B:101:0x03f8, B:101:0x03f8, B:101:0x03f8, B:103:0x0401, B:103:0x0401, B:103:0x0401, B:108:0x0433, B:108:0x0433, B:108:0x0433, B:110:0x043f, B:110:0x043f, B:110:0x043f, B:112:0x0448, B:112:0x0448, B:112:0x0448, B:113:0x044f, B:113:0x044f, B:113:0x044f, B:115:0x0464, B:115:0x0464, B:115:0x0464, B:116:0x046b, B:116:0x046b, B:116:0x046b, B:120:0x047e, B:120:0x047e, B:120:0x047e, B:123:0x048a, B:123:0x048a, B:123:0x048a, B:125:0x0493, B:125:0x0493, B:125:0x0493, B:258:0x0516, B:258:0x0516, B:258:0x0516, B:147:0x051f, B:147:0x051f, B:147:0x051f, B:150:0x0529, B:150:0x0529, B:150:0x0529, B:159:0x0559, B:159:0x0559, B:159:0x0559, B:164:0x0570, B:164:0x0570, B:164:0x0570, B:165:0x0577, B:165:0x0577, B:165:0x0577, B:167:0x0585, B:167:0x0585, B:167:0x0585, B:168:0x058c, B:168:0x058c, B:168:0x058c, B:170:0x059a, B:170:0x059a, B:170:0x059a, B:171:0x05a1, B:171:0x05a1, B:171:0x05a1, B:173:0x05af, B:173:0x05af, B:173:0x05af, B:174:0x05b6, B:174:0x05b6, B:174:0x05b6, B:176:0x05c4, B:176:0x05c4, B:176:0x05c4, B:177:0x05cb, B:177:0x05cb, B:177:0x05cb, B:179:0x05d9, B:179:0x05d9, B:179:0x05d9, B:180:0x05e0, B:180:0x05e0, B:180:0x05e0, B:182:0x05ee, B:182:0x05ee, B:182:0x05ee, B:183:0x05f5, B:183:0x05f5, B:183:0x05f5, B:185:0x0608, B:185:0x0608, B:185:0x0608, B:186:0x0727, B:186:0x0727, B:186:0x0727, B:186:0x0727, B:186:0x0727, B:186:0x0727, B:189:0x0730, B:189:0x0730, B:189:0x0730, B:191:0x0737, B:191:0x0737, B:191:0x0737, B:192:0x073c, B:193:0x0743, B:193:0x0743, B:193:0x0743, B:198:0x0751, B:198:0x0751, B:198:0x0751, B:200:0x0758, B:200:0x0758, B:200:0x0758, B:201:0x075d, B:201:0x075d, B:201:0x075d, B:202:0x0764, B:202:0x0764, B:202:0x0764, B:203:0x076b, B:203:0x076b, B:203:0x076b, B:204:0x0772, B:204:0x0772, B:204:0x0772, B:205:0x077b, B:205:0x077b, B:205:0x077b, B:207:0x0784, B:207:0x0784, B:207:0x0784, B:208:0x078b, B:208:0x078b, B:208:0x078b, B:209:0x0792, B:209:0x0792, B:209:0x0792, B:211:0x079b, B:211:0x079b, B:211:0x079b, B:213:0x07a4, B:213:0x07a4, B:213:0x07a4, B:221:0x06ee, B:221:0x06ee, B:221:0x06ee, B:222:0x06f3, B:222:0x06f3, B:222:0x06f3, B:223:0x06f8, B:223:0x06f8, B:223:0x06f8, B:225:0x0722, B:225:0x0722, B:225:0x0722, B:228:0x0622, B:228:0x0622, B:228:0x0622, B:229:0x0629, B:229:0x0629, B:229:0x0629, B:233:0x063c, B:233:0x063c, B:233:0x063c, B:236:0x0648, B:236:0x0648, B:236:0x0648, B:238:0x064f, B:238:0x064f, B:238:0x064f, B:240:0x0656, B:240:0x0656, B:240:0x0656, B:241:0x065b, B:241:0x065b, B:241:0x065b, B:243:0x0689, B:243:0x0689, B:243:0x0689, B:244:0x0690, B:244:0x0690, B:244:0x0690, B:248:0x06a6, B:248:0x06a6, B:248:0x06a6, B:249:0x06ad, B:249:0x06ad, B:249:0x06ad, B:250:0x06b4, B:250:0x06b4, B:250:0x06b4, B:252:0x06e2, B:252:0x06e2, B:252:0x06e2, B:136:0x04e1, B:136:0x04e1, B:136:0x04e1, B:137:0x04e8, B:137:0x04e8, B:137:0x04e8, B:142:0x04fb, B:142:0x04fb, B:142:0x04fb, B:262:0x04c7, B:262:0x04c7, B:262:0x04c7, B:265:0x042a, B:265:0x042a, B:265:0x042a, B:272:0x07ad, B:272:0x07ad, B:272:0x07ad), top: B:28:0x0257 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(com.facebook.messaging.avatar.stickersuggestions.datasource.TheOneStickerFetcher r301, java.lang.String r302, X.0DR r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 2133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.stickersuggestions.datasource.TheOneStickerFetcher.A00(com.facebook.messaging.avatar.stickersuggestions.datasource.TheOneStickerFetcher, java.lang.String, X.0DR, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A02 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A7x(java.util.List r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L14
            r0 = r301
            boolean r0 = r0.A02
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L16
        L14:
            r0 = 0
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.stickersuggestions.datasource.TheOneStickerFetcher.A7x(java.util.List):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object ASA(X.0DR r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.stickersuggestions.datasource.TheOneStickerFetcher.ASA(X.0DR, boolean):java.lang.Object");
    }

    public Object ASH(List list, 0DR r303, boolean z) {
        if (!this.A02) {
            this.A02 = true;
            Object A00 = A00(this, "EXCLUDE_HINTS", r303, z);
            if (A00 == 0Ds.A02) {
                return A00;
            }
        }
        return 04S.A00;
    }

    public List BCb(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            03Y r0 = (03Y) this.A09.get(((7uE) it.next()).A01);
            if (r0 != null) {
                boolean z = false;
                if (((Number) r0.second).longValue() <= ((C0dp) this.A04.A00.get()).now()) {
                    z = true;
                }
                arrayList.add(new 03Y(r0.first, Boolean.valueOf(z)));
            }
        }
        return arrayList;
    }

    public boolean BSf() {
        return this.A0A.get();
    }

    public Object Cc1(0DR r302, boolean z) {
        this.A09.clear();
        this.A00 = false;
        this.A02 = false;
        Object ASA = ASA(r302, z);
        if (ASA != 0Ds.A02) {
            ASA = 04S.A00;
        }
        return ASA;
    }

    public void D1z() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        2aK.A03((Integer) null, (0DE) null, new C82r(this, null, 4), 2Zy.A01(this.A0D), 3);
    }
}
