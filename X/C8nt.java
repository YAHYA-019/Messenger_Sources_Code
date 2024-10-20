package X;

import com.facebook.mig.favicon.MigFaviconColorMapping;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8nt, reason: invalid class name */
/* loaded from: 8nt.class */
public final class C8nt extends C1rj {
    public MigColorScheme A00;
    public RUW A01;

    public C8nt() {
        super("PaymentsBubbleLightspeedXMA");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float A00(android.net.Uri r301, int r302) {
        /*
            java.lang.String r0 = "height"
            r303 = r0
            r0 = r301
            r1 = r303
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch: java.lang.NumberFormatException -> L40
            r304 = r0
            java.lang.String r0 = "width"
            r303 = r0
            r0 = r301
            r1 = r303
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch: java.lang.NumberFormatException -> L40
            r305 = r0
            r0 = r304
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.NumberFormatException -> L40
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L27
            r0 = r304
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L40
            r307 = r0
            goto L2a
        L27:
            r0 = 0
            r307 = r0
        L2a:
            r0 = r305
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.NumberFormatException -> L47
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L56
            r0 = r305
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L47
            r308 = r0
            goto L5c
        L40:
            r304 = move-exception
            r0 = 0
            r307 = r0
            goto L48
        L47:
            r304 = move-exception
        L48:
            java.lang.String r0 = "PaymentsBubbleLightspeedXMASpec"
            r305 = r0
            java.lang.String r0 = "Number format exception while parsing height and width"
            r303 = r0
            r0 = r305
            r1 = r303
            r2 = r304
            X.0fH.A0r(r0, r1, r2)
        L56:
            r0 = 0
            r308 = r0
            r0 = 0
            r305 = r0
        L5c:
            r0 = r307
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 <= 0) goto L83
            r0 = r308
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 <= 0) goto L83
            r0 = r308
            r1 = r307
            float r0 = r0 / r1
            r308 = r0
            r0 = r302
            float r0 = (float) r0
            r309 = r0
        L7d:
            r0 = r308
            r1 = r309
            float r0 = r0 * r1
            return r0
        L83:
            r0 = 1069547520(0x3fc00000, float:1.5)
            r306 = r0
            r0 = 1069547520(0x3fc00000, float:1.5)
            r309 = r0
            r0 = r302
            float r0 = (float) r0
            r308 = r0
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8nt.A00(android.net.Uri, int):float");
    }

    public static 7RU A01(C9al c9al) {
        C1p8 c1p8 = C1ut.A08;
        if (c9al == null) {
            return null;
        }
        String str = c9al.A01;
        switch (str.hashCode()) {
            case -255097974:
                if (str.equals("IN_DISPUTE")) {
                    c1p8 = MigFaviconColorMapping.RED;
                    break;
                }
                break;
            case 183181625:
                if (str.equals("COMPLETE")) {
                    c1p8 = MigFaviconColorMapping.GREEN;
                    break;
                }
                break;
            case 907287315:
                if (str.equals("PROCESSING")) {
                    c1p8 = MigFaviconColorMapping.YELLOW;
                    break;
                }
                break;
        }
        String str2 = c9al.A00;
        switch (str2.hashCode()) {
            case -1241727810:
                if (str2.equals("CURRENCY_POUND")) {
                    return 7RT.A00(C1u3.A24, MigFaviconColorMapping.STATIC_WHITE, c1p8);
                }
                return null;
            case -971118536:
                if (str2.equals("CURRENCY_USD")) {
                    return 7RT.A00(C1u3.A26, MigFaviconColorMapping.STATIC_WHITE, c1p8);
                }
                return null;
            case -225075235:
                if (str2.equals("DOCUMENT_COMPLETE")) {
                    return 7RT.A00(C1u3.A2M, MigFaviconColorMapping.STATIC_WHITE, c1p8);
                }
                return null;
            case -40065409:
                if (str2.equals("CURRENCY_PESO")) {
                    return 7RT.A00(C1u3.A23, MigFaviconColorMapping.STATIC_WHITE, c1p8);
                }
                return null;
            case 213142432:
                if (str2.equals("CURRENCY_THAI_BAHT")) {
                    return 7RT.A00(C1u3.A25, MigFaviconColorMapping.STATIC_WHITE, c1p8);
                }
                return null;
            default:
                return null;
        }
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x026b  */
    /* JADX WARN: Type inference failed for: r0v427, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 2182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8nt.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        A00.A03(1iF.class, new 1iF(Long.toString(0L), 0L));
        return A00;
    }
}
