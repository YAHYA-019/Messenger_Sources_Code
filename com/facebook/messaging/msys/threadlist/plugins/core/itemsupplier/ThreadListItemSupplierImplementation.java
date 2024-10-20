package com.facebook.messaging.msys.threadlist.plugins.core.itemsupplier;

import X.0S2;
import X.0fH;
import X.11T;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1F9;
import X.1Fv;
import X.1G1;
import X.1Hb;
import X.1Lm;
import X.1Uy;
import X.1XJ;
import X.1qW;
import X.1xC;
import X.22B;
import X.2S4;
import X.2SI;
import X.2Si;
import X.2Sk;
import X.2T7;
import X.2Uj;
import X.2V5;
import X.2bN;
import X.39P;
import X.3Gj;
import X.AnonymousClass000;
import X.BDL;
import X.C00j;
import X.C14m;
import X.C2iD;
import X.C2xd;
import X.Cxb;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.orcaslim.mca.MailboxOrcaSlim$ThreadListObserverCallback;
import com.google.common.collect.ImmutableList;

/* loaded from: ThreadListItemSupplierImplementation.class */
public final class ThreadListItemSupplierImplementation {
    public int A00;
    public int A01;
    public int A02;
    public 1qW A03;
    public 1XJ A04;
    public ImmutableList A05;
    public boolean A06;
    public int A07;
    public long A08;
    public final Context A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 2Si A0N;
    public final 2Sk A0O;
    public final 2V5 A0P;
    public final C2iD A0Q;
    public final String A0R;
    public final FbUserSession A0S;
    public final FbUserSession A0T;
    public final 1Fv A0U;
    public final 2S4 A0V;
    public final 1Br A0W;
    public final MailboxOrcaSlim$ThreadListObserverCallback A0X;
    public static final 2Uj A0a = new Object();
    public static final StaticUnitConfig A0Y = new StaticUnitConfig(0S2.A0j, "1674434246165228", 2T7.A00("1674434246165228"), false);
    public static final StaticUnitConfig A0Z = new StaticUnitConfig(0S2.A01, "1553637598292592", 2T7.A00("1553637598292592"), false);

    public ThreadListItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2S4 r304, 2Si r305, 2Sk r306) {
        2SI r308;
        11T.A0F(r305, 1);
        11T.A0F(r306, 2);
        11T.A0F(r304, 3);
        11T.A0F(fbUserSession, 4);
        11T.A0F(context, 5);
        this.A0N = r305;
        this.A0O = r306;
        this.A0V = r304;
        this.A0S = fbUserSession;
        this.A09 = context;
        this.A0F = 1Lm.A00(context, fbUserSession, 84153);
        this.A0G = 1Lm.A00(context, fbUserSession, 33071);
        this.A0D = 1Lm.A00(context, fbUserSession, 33148);
        this.A0E = 1Lm.A00(context, fbUserSession, 84168);
        1Fv r0 = (1Fv) 1Bi.A03(66351);
        this.A0U = r0;
        ViewerContext Aue = fbUserSession.Aue();
        11T.A0D(Aue);
        FbUserSession A08 = r0.A08(Aue);
        this.A0T = A08;
        this.A0R = ((1G1) fbUserSession).A02;
        this.A0M = 1Lm.A00(context, A08, 16886);
        1Br A00 = 1Bu.A00(17160);
        this.A0K = A00;
        C2xd c2xd = (C2xd) A00.A00.get();
        1F9 A002 = this.A0O.A00();
        3Gj r02 = 3Gj.$redex_init_class;
        switch (A002.ordinal()) {
            case 1:
                r308 = 2SI.A09;
                break;
            case 2:
            case 3:
                r308 = 2SI.A0C;
                break;
            case 4:
                r308 = 2SI.A03;
                break;
            case 14:
                r308 = 2SI.A0B;
                break;
            case 19:
                r308 = 2SI.A0A;
                break;
            case 24:
                r308 = 2SI.A0E;
                break;
            case 27:
                r308 = 2SI.A08;
                break;
            case 29:
                r308 = 2SI.A04;
                break;
            case 31:
                r308 = 2SI.A0F;
                break;
            default:
                throw new C14m(AnonymousClass000.A00(12));
        }
        this.A0P = c2xd.A0I(context, fbUserSession, r308);
        this.A0A = 1Bq.A00(99390);
        this.A0B = 1Bu.A00(66216);
        this.A0J = 1Bq.A00(66584);
        this.A0L = 1Bu.A00(16671);
        this.A0C = 1Bq.A00(67265);
        this.A0H = 1Bq.A00(67266);
        this.A0W = 1Bq.A00(66219);
        this.A0I = 1Lm.A00(context, fbUserSession, 49711);
        this.A00 = 3;
        ImmutableList of = ImmutableList.of();
        11T.A0A(of);
        this.A05 = of;
        this.A07 = 20;
        this.A0Q = (C2iD) r304.A00(66668);
        this.A0X = new 39P(this);
    }

    private final int A00() {
        1Hb A01 = this.A0O.A01();
        3Gj r0 = 3Gj.$redex_init_class;
        switch (A01.ordinal()) {
            case 6:
                return 16;
            case 7:
                return 26;
            case 8:
                return 27;
            case 9:
                return 1;
            case 10:
                return 6;
            case 11:
                return 9;
            case 12:
                return 2bN.A00();
            case 13:
            case 14:
            case 15:
            default:
                return 0;
            case 16:
                return 25;
        }
    }

    public static final 1Uy A01(ThreadListItemSupplierImplementation threadListItemSupplierImplementation) {
        return (1Uy) threadListItemSupplierImplementation.A0W.A00.get();
    }

    private final void A02() {
        C00j.A05("ThreadListItemSupplierImplementation.loadBeforeFromRemoteWithMinThread", -522398874);
        try {
            0fH.A0j("MsysThreadListItemSupplierImplementation", "loadBeforeFromRemoteWithMinThread");
            if (A05()) {
                if (this.A0O.A00().A01() != null) {
                    ((BDL) 1Br.A0B(this.A0E)).A00(new Cxb(this, 14), A00(), r0.intValue());
                }
            } else {
                A01(this).A0K("load_thread_range_info_v2");
                Integer A01 = this.A0O.A00().A01();
                if (A01 != null) {
                    ((22B) this.A0F.A00.get()).A04(new Cxb(this, 15), A01.intValue());
                }
            }
            C00j.A01(-1336272629);
        } catch (Throwable th) {
            C00j.A01(-1507044557);
            throw th;
        }
    }

    public static final void A03(ThreadListItemSupplierImplementation threadListItemSupplierImplementation, long j, long j2) {
        A01(threadListItemSupplierImplementation).A0K("thread_ranges_query");
        0fH.A0j("MsysThreadListItemSupplierImplementation", "loadBeforeFromRemote");
        Integer A01 = threadListItemSupplierImplementation.A0O.A00().A01();
        if (A01 != null) {
            ((1xC) threadListItemSupplierImplementation.A0D.A00.get()).A05((MailboxCallback) null, A01, Long.valueOf(j), (Number) null, Long.valueOf(j2), (Number) null, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ef, code lost:
    
        if (r0 == X.1Hb.A0B) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A04(com.facebook.messaging.msys.threadlist.plugins.core.itemsupplier.ThreadListItemSupplierImplementation r301, long r302, long r304) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.threadlist.plugins.core.itemsupplier.ThreadListItemSupplierImplementation.A04(com.facebook.messaging.msys.threadlist.plugins.core.itemsupplier.ThreadListItemSupplierImplementation, long, long):void");
    }

    private final boolean A05() {
        1Hb A01;
        2Sk r0 = this.A0O;
        boolean z = false;
        if (!2Uj.A00(r0) && ((A01 = r0.A01()) == 1Hb.A09 || A01 == 1Hb.A06 || A01 == 1Hb.A0B || A01 == 1Hb.A0J || A01 == 1Hb.A0F || A01 == 1Hb.A0A || A01 == 1Hb.A04 || A01 == 1Hb.A03)) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Throwable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A06(android.content.Context r301, X.2Sk r302) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.threadlist.plugins.core.itemsupplier.ThreadListItemSupplierImplementation.A06(android.content.Context, X.2Sk):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01b4, code lost:
    
        if (r0 != 5) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.collect.ImmutableList A07() {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.threadlist.plugins.core.itemsupplier.ThreadListItemSupplierImplementation.A07():com.google.common.collect.ImmutableList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0134, code lost:
    
        if (r306 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f5, code lost:
    
        if (r306 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0139, code lost:
    
        r306.A02(r307);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.threadlist.plugins.core.itemsupplier.ThreadListItemSupplierImplementation.A08():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0175, code lost:
    
        if (((X.2Mb) X.1Bi.A03(68519)).A03() != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[Catch: all -> 0x0410, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0410, blocks: (B:3:0x0014, B:5:0x001a, B:6:0x0020, B:7:0x0027, B:10:0x0033, B:13:0x003d, B:17:0x004f, B:19:0x0055, B:20:0x0059, B:21:0x005e, B:22:0x0065, B:23:0x006a, B:25:0x006f, B:26:0x0073, B:27:0x0078, B:28:0x007f, B:29:0x0084, B:30:0x0089, B:31:0x008e, B:32:0x0096, B:34:0x00aa, B:35:0x00b0, B:39:0x00bf, B:40:0x00c6, B:42:0x00cc, B:43:0x00d1, B:46:0x00da, B:47:0x00e0, B:49:0x00e7, B:50:0x00ec, B:51:0x00f2, B:52:0x00f9, B:53:0x00ff, B:55:0x010b, B:56:0x0111, B:57:0x0116, B:58:0x011c, B:59:0x0123, B:60:0x012c, B:62:0x0137, B:65:0x0261, B:66:0x0266, B:67:0x0275, B:69:0x027c, B:70:0x0281, B:75:0x0296, B:76:0x029d, B:77:0x02a4, B:81:0x02b6, B:82:0x02bc, B:83:0x02c3, B:84:0x02c8, B:85:0x02ce, B:86:0x02d4, B:87:0x02db, B:88:0x02e4, B:89:0x02eb, B:90:0x02f2, B:91:0x02f8, B:92:0x02ff, B:93:0x0308, B:94:0x030f, B:95:0x0316, B:96:0x031f, B:97:0x0326, B:98:0x032d, B:99:0x0333, B:100:0x033c, B:101:0x0343, B:103:0x0351, B:107:0x0367, B:108:0x0370, B:109:0x0377, B:111:0x0384, B:113:0x0393, B:115:0x03cb, B:117:0x03d6, B:119:0x03dc, B:120:0x03e3, B:122:0x03e9, B:123:0x03ee, B:125:0x03f4, B:126:0x03fa, B:132:0x024b, B:138:0x0146, B:140:0x014c, B:141:0x0153, B:145:0x0162, B:146:0x0168, B:147:0x016d, B:150:0x0188, B:153:0x0192, B:156:0x019c, B:159:0x01a6, B:160:0x01ad, B:163:0x01b7, B:166:0x01c1, B:169:0x01cb, B:172:0x01d6, B:174:0x01e9, B:194:0x023c, B:197:0x040a, B:199:0x040f, B:201:0x0180, B:177:0x01f0, B:180:0x01fa, B:181:0x01ff, B:182:0x0205, B:183:0x020c, B:184:0x0212, B:186:0x0222, B:188:0x0228, B:190:0x0232), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A09() {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.threadlist.plugins.core.itemsupplier.ThreadListItemSupplierImplementation.A09():void");
    }

    public final void A0A() {
        0fH.A0j("MsysThreadListItemSupplierImplementation", "onUnsubscribe");
        1XJ r0 = this.A04;
        if (r0 != null) {
            r0.D5r();
            this.A04 = null;
        }
    }

    public final void A0B() {
        0fH.A0j("MsysThreadListItemSupplierImplementation", "refreshOnUserRequest");
        A03(this, Long.MAX_VALUE, Long.MAX_VALUE);
    }
}
