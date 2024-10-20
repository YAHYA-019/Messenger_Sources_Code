package X;

import java.util.concurrent.Callable;

/* loaded from: J57.class */
public final class J57 implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public J57(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x011b, code lost:
    
        if (((X.C1n) X.1Br.A0B(r0.A02)).A00() == false) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03f7 A[Catch: IllegalArgumentException -> 0x05d1, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IllegalArgumentException -> 0x05d1, blocks: (B:43:0x025b, B:44:0x0262, B:45:0x026b, B:46:0x0270, B:47:0x0276, B:51:0x028f, B:55:0x02a6, B:59:0x02b8, B:60:0x02bf, B:62:0x02c6, B:65:0x02ce, B:66:0x02d5, B:69:0x02e1, B:71:0x02f1, B:72:0x02f8, B:75:0x0304, B:77:0x030e, B:79:0x0315, B:83:0x0323, B:85:0x032a, B:90:0x0338, B:91:0x033f, B:95:0x035a, B:99:0x0374, B:103:0x0383, B:104:0x038a, B:106:0x0391, B:107:0x0396, B:110:0x03a2, B:112:0x03ad, B:113:0x03b4, B:116:0x03c0, B:118:0x03c7, B:122:0x03d5, B:124:0x03dc, B:129:0x03ec, B:132:0x03f7, B:133:0x03fc, B:136:0x0415, B:137:0x041c, B:138:0x0421, B:139:0x0428, B:141:0x0440, B:143:0x044a, B:145:0x0450, B:146:0x0454, B:148:0x045a, B:155:0x046e, B:156:0x0475, B:158:0x0484, B:159:0x048a, B:162:0x0496, B:166:0x04a8, B:169:0x04b3, B:171:0x04bd, B:173:0x04c8, B:177:0x04da, B:179:0x04e5, B:180:0x04ea, B:182:0x04f3, B:183:0x04fa, B:185:0x0507, B:187:0x0516, B:188:0x051d, B:192:0x052c, B:193:0x0533, B:194:0x0538, B:196:0x0549, B:199:0x0551, B:201:0x055a, B:206:0x055d, B:208:0x0564, B:212:0x056a, B:214:0x0573, B:216:0x0576, B:218:0x057d, B:220:0x0580, B:222:0x0587, B:224:0x058a, B:226:0x0591, B:231:0x0594, B:233:0x059b, B:237:0x05a1, B:239:0x05aa, B:240:0x05ab, B:240:0x05ab, B:243:0x05b2, B:245:0x05b5, B:247:0x05bc, B:249:0x05bf, B:251:0x05c6, B:253:0x05c9, B:255:0x05d0), top: B:42:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0551 A[Catch: IllegalArgumentException -> 0x05d1, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IllegalArgumentException -> 0x05d1, blocks: (B:43:0x025b, B:44:0x0262, B:45:0x026b, B:46:0x0270, B:47:0x0276, B:51:0x028f, B:55:0x02a6, B:59:0x02b8, B:60:0x02bf, B:62:0x02c6, B:65:0x02ce, B:66:0x02d5, B:69:0x02e1, B:71:0x02f1, B:72:0x02f8, B:75:0x0304, B:77:0x030e, B:79:0x0315, B:83:0x0323, B:85:0x032a, B:90:0x0338, B:91:0x033f, B:95:0x035a, B:99:0x0374, B:103:0x0383, B:104:0x038a, B:106:0x0391, B:107:0x0396, B:110:0x03a2, B:112:0x03ad, B:113:0x03b4, B:116:0x03c0, B:118:0x03c7, B:122:0x03d5, B:124:0x03dc, B:129:0x03ec, B:132:0x03f7, B:133:0x03fc, B:136:0x0415, B:137:0x041c, B:138:0x0421, B:139:0x0428, B:141:0x0440, B:143:0x044a, B:145:0x0450, B:146:0x0454, B:148:0x045a, B:155:0x046e, B:156:0x0475, B:158:0x0484, B:159:0x048a, B:162:0x0496, B:166:0x04a8, B:169:0x04b3, B:171:0x04bd, B:173:0x04c8, B:177:0x04da, B:179:0x04e5, B:180:0x04ea, B:182:0x04f3, B:183:0x04fa, B:185:0x0507, B:187:0x0516, B:188:0x051d, B:192:0x052c, B:193:0x0533, B:194:0x0538, B:196:0x0549, B:199:0x0551, B:201:0x055a, B:206:0x055d, B:208:0x0564, B:212:0x056a, B:214:0x0573, B:216:0x0576, B:218:0x057d, B:220:0x0580, B:222:0x0587, B:224:0x058a, B:226:0x0591, B:231:0x0594, B:233:0x059b, B:237:0x05a1, B:239:0x05aa, B:240:0x05ab, B:240:0x05ab, B:243:0x05b2, B:245:0x05b5, B:247:0x05bc, B:249:0x05bf, B:251:0x05c6, B:253:0x05c9, B:255:0x05d0), top: B:42:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034b  */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, X.I3R] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, X.I3R] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.JKb] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.JKb] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 2030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J57.call():java.lang.Object");
    }
}
