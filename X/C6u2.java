package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.6u2, reason: invalid class name */
/* loaded from: 6u2.class */
public final class C6u2 implements InterfaceC07434jv {
    public final int A00;
    public final FbUserSession A01;
    public final 1De A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final List A09;
    public final C15h A0A = new AHe(this, 25);

    public C6u2(FbUserSession fbUserSession, 1De r303, List list, int i) {
        this.A02 = r303;
        this.A01 = fbUserSession;
        this.A00 = i;
        this.A09 = list;
        1BY r0 = r303.A00;
        this.A08 = 1Bu.A03(r0, 66022);
        this.A06 = 1Bu.A03(r0, 67462);
        this.A03 = 1Bu.A03(r0, 67876);
        this.A05 = 1Bu.A03(r0, 67516);
        this.A07 = 1Bu.A03(r0, 67356);
        this.A04 = 1Bq.A00(46);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.2qQ, java.lang.Object] */
    public static final int A00(MigColorScheme migColorScheme, 5Rx r302) {
        if (r302 == null) {
            return 0;
        }
        1qX r0 = (1qX) r302;
        if (r0.mResultSet.getCount() <= 0) {
            return 0;
        }
        ?? obj = new Object();
        ((2qQ) obj).A01 = C5yg.A04;
        ((2qQ) obj).A00 = C5yg.A02;
        Object Ci4 = migColorScheme.Ci4(obj.A00());
        int count = r0.mResultSet.getCount();
        for (int i = 0; i < count; i++) {
            if (6qF.A00(r302.AXA(i)) == Ci4) {
                return i;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0451, code lost:
    
        r319 = r327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x044e, code lost:
    
        if (r319 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x042f, code lost:
    
        r319 = ((X.CNX) X.1Br.A0B(r0.A01)).A02(r0.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0458, code lost:
    
        r334 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x045e, code lost:
    
        r332 = 0;
        r334 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0467, code lost:
    
        r331 = r327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x046e, code lost:
    
        r0 = new java.util.ArrayList();
        r0 = r321.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x048a, code lost:
    
        if (r0.hasNext() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x048d, code lost:
    
        r0 = (X.C5fr) r0.next();
        X.11T.A0D(r0);
        r308 = r0.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04a7, code lost:
    
        if (r308 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04aa, code lost:
    
        r308 = r0.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04b3, code lost:
    
        if (r308 != null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04b6, code lost:
    
        r308 = r0.A07;
        X.11T.A0A(r308);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04c2, code lost:
    
        r0.add(r308);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04d8, code lost:
    
        if (r0.isEmpty() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04db, code lost:
    
        r326 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04e3, code lost:
    
        r326 = ((X.C2qq) r301.A05.A00.get()).A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01ad, code lost:
    
        if ((!r321.isEmpty()) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0111, code lost:
    
        if (r321 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01b0, code lost:
    
        r322 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01be, code lost:
    
        if (r321.size() != 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01c1, code lost:
    
        r322 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01cc, code lost:
    
        if (r0 == 7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01d7, code lost:
    
        if (r0 == 15) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01de, code lost:
    
        if (r0 == 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e1, code lost:
    
        r0 = r0.mResultSet.getString(0, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01fa, code lost:
    
        if (r0 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0206, code lost:
    
        if (r0.length() == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0209, code lost:
    
        r326 = r0.mResultSet.getString(0, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x021c, code lost:
    
        r0 = ((X.0AC) r301.A04.A00.get()).A03(r0.mResultSet.getNullableLong(0, 8), r0.mResultSet.getString(0, 6), r0.mResultSet.getString(0, 7));
        r327 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x027b, code lost:
    
        if (r322 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x027e, code lost:
    
        r331 = ((X.C5fr) X.0QD.A0D(r321)).A06;
        r327 = ((X.C5fr) X.0QD.A0D(r321)).A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x029e, code lost:
    
        if (r322 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02a1, code lost:
    
        r332 = ((X.C5fr) X.0QD.A0D(r321)).A02;
        r0 = (X.C5tq) r320.get();
        r0 = r301.A01;
        r0 = ((X.C5fr) X.0QD.A0D(r321)).A06;
        X.11T.A0A(r0);
        r0 = (java.lang.Number) ((X.7GC) X.1Lo.A04((android.content.Context) null, r0, r0.A00.A00, 66775)).A00.A00.get(new com.facebook.user.model.UserKey(X.1Js.A03, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x031e, code lost:
    
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0321, code lost:
    
        r334 = r0.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0328, code lost:
    
        r0 = r0.A0C;
        r0 = (X.7GE) r301.A07.A00.get();
        r312 = r0.mResultSet.getString(0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0355, code lost:
    
        if (r312 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0358, code lost:
    
        r312 = r327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x035c, code lost:
    
        r0 = X.0QD.A0D(r321);
        X.11T.A0A(r0);
        r0 = (X.C5fr) r0;
        r0 = r0.A0F;
        X.11T.A0F(r312, 0);
        X.11T.A0F(r0, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x038a, code lost:
    
        if (r0 == 10) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0395, code lost:
    
        if (r0 == 15) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03a1, code lost:
    
        if (r0 != 201) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03a4, code lost:
    
        r319 = ((X.9Xq) r0.A00.A00.get()).A00((X.C5ty) r0.A02().A00(X.C5ty.A0A), r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x03d9, code lost:
    
        r0 = (X.6uA) r301.A08.A00.get();
        X.11T.A0A(r0);
        r0 = A00(r0, r315);
        r308 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0401, code lost:
    
        if (r315 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0404, code lost:
    
        r0 = r315;
        r0 = r0.mResultSet.getString(r0, 34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0429, code lost:
    
        if (r0 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0530, code lost:
    
        r306 = java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) X.0QD.A0D(X.0CU.A0M(r0, new java.lang.String[]{com.facebook.traffic.knob.InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x053a, code lost:
    
        r310 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x053c, code lost:
    
        X.0fH.A0r("TitleBarMailboxAdapter", "Error parsing color from gradient", r310);
     */
    @Override // X.InterfaceC07434jv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object A4o(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6u2.A4o(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
