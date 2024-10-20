package com.facebook.messaging.groups.plugins.core.threadsettingsrow.createnewgroup;

import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2MQ;
import X.AbF;
import X.AbK;
import X.AnonymousClass001;
import X.AnonymousClass201;
import X.AnonymousClass207;
import X.BLj;
import X.BNV;
import X.C1780AsE;
import X.C1pq;
import X.C1ut;
import X.C1zz;
import X.CAv;
import X.CG9;
import X.CHv;
import X.CII;
import X.CIr;
import X.CQg;
import X.CZ0;
import X.Cug;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.omnipicker.datamodel.M4OmnipickerParam;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.HashSet;

/* loaded from: ThreadSettingsNewGroupRow.class */
public final class ThreadSettingsNewGroupRow {
    public static final Cug A00(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, User user) {
        AbK.A1S(context, fbUserSession);
        if (threadSummary == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (user == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        1Br A00 = 1Bu.A00(68697);
        1Bn.A0A(68698);
        1Br A01 = 1Lm.A01(fbUserSession, 68275);
        String str = user.A0D() ? user.A0X.displayName : user.A0X.firstName;
        String string = (str == null || str.length() == 0) ? context.getString(2131967097) : 1BK.A0v(context, str, 2131967098);
        11T.A0D(string);
        2MQ A002 = CAv.A00();
        C1pq.A08("migButtonIconName", A002);
        CHv cHv = new CHv(A002, (C1ut) null);
        boolean A0x = threadSummary.A0n.A0x();
        CIr A003 = CG9.A00(BLj.A0F);
        A003.A0M = true;
        if (A0x) {
            A003.A0P = true;
        }
        M4OmnipickerParam m4OmnipickerParam = new M4OmnipickerParam(A003);
        CQg A012 = CQg.A01(string);
        CQg.A08(BNV.A0y, A012);
        CQg.A09(A012, ThreadSettingsNewGroupRow.class);
        A012.A04 = cHv;
        A012.A05 = new CII((Drawable) null, (Uri) null, CAv.A01(), (C1ut) null, (Boolean) null);
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        AnonymousClass201 A004 = C1zz.A00();
        AnonymousClass207 anonymousClass207 = C1780AsE.A01;
        BLj bLj = m4OmnipickerParam.A01;
        11T.A0A(bLj);
        A004.A01(anonymousClass207, new C1780AsE(bLj));
        HeterogeneousMap A005 = A004.A00();
        A012.A09 = A005;
        C1pq.A08("metadataMap", A005);
        if (!A012.A0D.contains("metadataMap")) {
            HashSet A1E = AbF.A1E(A012.A0D);
            A012.A0D = A1E;
            A1E.add("metadataMap");
        }
        return CQg.A02(new CZ0(2, context, m4OmnipickerParam, A01, A00, user), A012);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable, X.1gb] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(com.facebook.messaging.model.threadkey.ThreadKey r301, com.facebook.messaging.model.threads.ThreadSummary r302, com.facebook.xapp.messaging.capability.vector.Capabilities r303) {
        /*
            r0 = 0
            r304 = r0
            r0 = r303
            r1 = r301
            X.1BK.A1M(r0, r1)
            r0 = 66630(0x10446, float:9.3369E-41)
            r305 = r0
            r0 = r302
            if (r0 == 0) goto L1c
            r0 = r302
            boolean r0 = X.2Gt.A0E(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L1c
            r0 = 0
            return r0
        L1c:
            r0 = r301
            boolean r0 = r0.A0x()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L46
            r0 = r305
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> L45
            X.1gb r0 = (X.C1gb) r0     // Catch: java.lang.Throwable -> L45
            X.1Br r0 = r0.A02
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.BjP r0 = (X.BjP) r0
            X.1Br r0 = r0.A00
            X.2yD r0 = X.1Br.A07(r0)
            r1 = 72341306692604486(0x101020900001246, double:7.750439844162128E-304)
            boolean r0 = r0.AZk(r1)
            return r0
        L45:
            throw r0
        L46:
            r0 = r303
            r1 = 35
            boolean r0 = X.4YU.A1Y(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.groups.plugins.core.threadsettingsrow.createnewgroup.ThreadSettingsNewGroupRow.A01(com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.xapp.messaging.capability.vector.Capabilities):boolean");
    }
}
