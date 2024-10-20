package X;

import kotlin.jvm.functions.Function1;

/* loaded from: JB6.class */
public final class JB6 extends C00q implements Function1 {
    public static final JB6 A00 = new JB6();

    public JB6() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a6, code lost:
    
        if ((r0.size() % r317) != 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020e, code lost:
    
        if (r332 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x022b, code lost:
    
        if (r332 == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0324 A[EDGE_INSN: B:122:0x0324->B:123:0x0324 BREAK  A[LOOP:0: B:62:0x01d1->B:113:0x031d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0339 A[Catch: all -> 0x0396, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0396, blocks: (B:3:0x0021, B:5:0x0029, B:6:0x002f, B:8:0x0041, B:13:0x006b, B:15:0x0072, B:20:0x0098, B:25:0x00b3, B:26:0x00ba, B:27:0x00c0, B:30:0x00d3, B:31:0x00da, B:34:0x00e8, B:35:0x00ef, B:37:0x00fd, B:39:0x0111, B:41:0x0124, B:44:0x0135, B:46:0x0143, B:48:0x0158, B:50:0x017c, B:51:0x0180, B:54:0x018f, B:56:0x019a, B:59:0x01c0, B:60:0x01c5, B:62:0x01d1, B:66:0x01e5, B:67:0x01ed, B:68:0x01f2, B:82:0x0236, B:86:0x0249, B:91:0x027f, B:93:0x02a5, B:94:0x02aa, B:95:0x02b0, B:97:0x02c1, B:98:0x02c6, B:98:0x02c6, B:101:0x02d6, B:103:0x02df, B:105:0x02e7, B:110:0x0302, B:118:0x0274, B:119:0x0250, B:123:0x0324, B:126:0x0339, B:131:0x0358, B:133:0x0360, B:134:0x0366, B:135:0x036b, B:137:0x038a), top: B:2:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0135 A[Catch: all -> 0x0396, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0396, blocks: (B:3:0x0021, B:5:0x0029, B:6:0x002f, B:8:0x0041, B:13:0x006b, B:15:0x0072, B:20:0x0098, B:25:0x00b3, B:26:0x00ba, B:27:0x00c0, B:30:0x00d3, B:31:0x00da, B:34:0x00e8, B:35:0x00ef, B:37:0x00fd, B:39:0x0111, B:41:0x0124, B:44:0x0135, B:46:0x0143, B:48:0x0158, B:50:0x017c, B:51:0x0180, B:54:0x018f, B:56:0x019a, B:59:0x01c0, B:60:0x01c5, B:62:0x01d1, B:66:0x01e5, B:67:0x01ed, B:68:0x01f2, B:82:0x0236, B:86:0x0249, B:91:0x027f, B:93:0x02a5, B:94:0x02aa, B:95:0x02b0, B:97:0x02c1, B:98:0x02c6, B:98:0x02c6, B:101:0x02d6, B:103:0x02df, B:105:0x02e7, B:110:0x0302, B:118:0x0274, B:119:0x0250, B:123:0x0324, B:126:0x0339, B:131:0x0358, B:133:0x0360, B:134:0x0366, B:135:0x036b, B:137:0x038a), top: B:2:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018f A[Catch: all -> 0x0396, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0396, blocks: (B:3:0x0021, B:5:0x0029, B:6:0x002f, B:8:0x0041, B:13:0x006b, B:15:0x0072, B:20:0x0098, B:25:0x00b3, B:26:0x00ba, B:27:0x00c0, B:30:0x00d3, B:31:0x00da, B:34:0x00e8, B:35:0x00ef, B:37:0x00fd, B:39:0x0111, B:41:0x0124, B:44:0x0135, B:46:0x0143, B:48:0x0158, B:50:0x017c, B:51:0x0180, B:54:0x018f, B:56:0x019a, B:59:0x01c0, B:60:0x01c5, B:62:0x01d1, B:66:0x01e5, B:67:0x01ed, B:68:0x01f2, B:82:0x0236, B:86:0x0249, B:91:0x027f, B:93:0x02a5, B:94:0x02aa, B:95:0x02b0, B:97:0x02c1, B:98:0x02c6, B:98:0x02c6, B:101:0x02d6, B:103:0x02df, B:105:0x02e7, B:110:0x0302, B:118:0x0274, B:119:0x0250, B:123:0x0324, B:126:0x0339, B:131:0x0358, B:133:0x0360, B:134:0x0366, B:135:0x036b, B:137:0x038a), top: B:2:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01df  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JB6.invoke(java.lang.Object):java.lang.Object");
    }
}
