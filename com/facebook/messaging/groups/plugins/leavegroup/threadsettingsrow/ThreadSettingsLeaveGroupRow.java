package com.facebook.messaging.groups.plugins.leavegroup.threadsettingsrow;

import X.7zR;
import X.C1783AsH;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadSettingsLeaveGroupRow.class */
public final class ThreadSettingsLeaveGroupRow {
    public final Context A00;
    public final ThreadSummary A01;
    public final C1783AsH A02;

    public ThreadSettingsLeaveGroupRow(Context context, ThreadSummary threadSummary, C1783AsH c1783AsH) {
        7zR.A1N(context, c1783AsH);
        this.A00 = context;
        this.A01 = threadSummary;
        this.A02 = c1783AsH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(android.content.Context r301, com.facebook.messaging.model.threads.ThreadSummary r302, com.facebook.xapp.messaging.capability.vector.Capabilities r303, X.C1783AsH r304) {
        /*
            r0 = r301
            r1 = r304
            r2 = r303
            X.7zT.A1S(r0, r1, r2)
            r0 = 66481(0x103b1, float:9.316E-41)
            r305 = r0
            r0 = 1
            r306 = r0
            java.lang.String r0 = "ThreadSettingsLeaveGroupRow"
            r307 = r0
            r0 = 28
            r308 = r0
            r0 = r303
            r1 = r308
            boolean r0 = X.4YU.A1Y(r0, r1)
            r309 = r0
            r0 = r302
            if (r0 == 0) goto L58
            r0 = r302
            boolean r0 = X.AbF.A1X(r0)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L58
            r0 = r305
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> L57
            r310 = r0
            r0 = r310
            X.1CO r0 = X.AbF.A0q(r0)
            r311 = r0
            r0 = 36325081042997580(0x810d780001514c, double:3.0354657487280785E-306)
            r312 = r0
            r0 = r311
            r1 = r312
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L64
            r0 = r309
            if (r0 == 0) goto L64
            r0 = r306
            return r0
        L57:
            throw r0
        L58:
            r0 = r309
            if (r0 != 0) goto L74
            java.lang.String r0 = "No Leave capability for this thread"
            r310 = r0
            goto L68
        L64:
            java.lang.String r0 = "Not enabling leave Chat for Community Chats"
            r310 = r0
        L68:
            r0 = r307
            r1 = r310
            X.0fH.A0o(r0, r1)
            r0 = 0
            r306 = r0
            r0 = 0
            r301 = r0
        L74:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.groups.plugins.leavegroup.threadsettingsrow.ThreadSettingsLeaveGroupRow.A00(android.content.Context, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.xapp.messaging.capability.vector.Capabilities, X.AsH):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.AtG A01() {
        /*
            r301 = this;
            r0 = 114762(0x1c04a, float:1.60816E-40)
            java.lang.Object r0 = X.1Bn.A0A(r0)
            boolean r0 = X.AbL.A1B()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2e
            X.1u3 r0 = X.C1u3.A3z
            r303 = r0
            r0 = r303
            X.2pn r0 = X.AbK.A0x(r0)
            r304 = r0
        L17:
            r0 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A01
            r305 = r0
            r0 = 68470(0x10b76, float:9.5947E-41)
            r306 = r0
            r0 = r305
            boolean r0 = X.2oI.A06(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L44
            goto L3a
        L2e:
            X.2MQ r0 = X.2MQ.A1m
            r303 = r0
            r0 = r303
            X.2sK r0 = X.AbK.A0w(r0)
            r304 = r0
            goto L17
        L3a:
            r0 = r306
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> L43
            r303 = r0
            goto L5e
        L43:
            throw r0
        L44:
            r0 = r305
            boolean r0 = X.2oI.A03(r0)
            r307 = r0
            android.content.Context r0 = X.7zL.A09()
            r308 = r0
            r0 = 2131967147(0x7f133cab, float:1.9571152E38)
            r302 = r0
            r0 = r307
            if (r0 == 0) goto L74
            r0 = 2131967145(0x7f133ca9, float:1.9571148E38)
            r302 = r0
            goto L74
        L5e:
            r0 = r303
            X.1Wi r0 = (X.1Wi) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A01()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L44
            android.content.Context r0 = X.7zL.A09()
            r308 = r0
            r0 = 2131967146(0x7f133caa, float:1.957115E38)
            r302 = r0
        L74:
            r0 = r308
            r1 = r302
            java.lang.String r0 = X.1BK.A0u(r0, r1)
            r309 = r0
            java.lang.Integer r0 = X.0S2.A01
            r310 = r0
            X.BNV r0 = X.BNV.A13
            r305 = r0
            com.facebook.xapp.messaging.map.HeterogeneousMap r0 = X.AbF.A0z()
            r311 = r0
            X.AtG r0 = new X.AtG
            r308 = r0
            r0 = r308
            r1 = r305
            r2 = r304
            r3 = r311
            r4 = r310
            java.lang.String r5 = "leave_group_row"
            r6 = r309
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.groups.plugins.leavegroup.threadsettingsrow.ThreadSettingsLeaveGroupRow.A01():X.AtG");
    }
}
