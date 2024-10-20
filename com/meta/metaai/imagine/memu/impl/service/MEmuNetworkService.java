package com.meta.metaai.imagine.memu.impl.service;

import X.1BK;
import X.1Ve;
import X.DKH;
import X.EMx;
import X.EPR;
import X.F9u;
import android.content.Context;
import com.facebook.foa.session.FbMetaSessionImpl;

/* loaded from: MEmuNetworkService.class */
public final class MEmuNetworkService {
    public static final F9u A03 = new F9u(EPR.A0S, 95, true);
    public final Context A00;
    public final FbMetaSessionImpl A01;
    public final 1Ve A02;

    public MEmuNetworkService(Context context, FbMetaSessionImpl fbMetaSessionImpl) {
        this.A00 = context;
        this.A01 = fbMetaSessionImpl;
        this.A02 = DKH.A0P(context);
    }

    public static final String A00(EMx eMx) {
        int ordinal = eMx.ordinal();
        if (ordinal == 0) {
            return "LEFT";
        }
        if (ordinal == 1) {
            return "RIGHT";
        }
        if (ordinal == 2) {
            return "CENTER";
        }
        if (ordinal == 3) {
            return "CAMERA_ROLL";
        }
        throw 1BK.A1F();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(android.graphics.Bitmap r302, X.0DR r303) {
        /*
            r301 = this;
            r0 = 42
            r304 = r0
            r0 = r304
            r1 = r303
            boolean r0 = X.AId.A03(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La0
            r0 = r303
            r306 = r0
            r0 = r303
            X.AId r0 = (X.AId) r0
            r306 = r0
            r0 = r306
            int r0 = r0.A00
            r307 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r308 = r0
            r0 = r307
            r1 = r308
            r0 = r0 & r1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La0
            r0 = r307
            r1 = r308
            int r0 = r0 - r1
            r307 = r0
            r0 = r306
            r1 = r307
            r0.A00 = r1
        L3e:
            r0 = r306
            java.lang.Object r0 = r0.A01
            r309 = r0
            X.0Ds r0 = X.0Ds.A02
            r310 = r0
            r0 = r306
            int r0 = r0.A00
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L6c
            r0 = r305
            r1 = r304
            if (r0 != r1) goto Lb0
            r0 = r309
            X.0Dt.A00(r0)
        L63:
            r0 = r309
            X.ICS r0 = (X.ICS) r0
            java.lang.String r0 = r0.A05
            return r0
        L6c:
            r0 = r309
            X.0Dt.A00(r0)
            r0 = r301
            android.content.Context r0 = r0.A00
            r311 = r0
            r0 = r301
            com.facebook.foa.session.FbMetaSessionImpl r0 = r0.A01
            r309 = r0
            X.F9u r0 = com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService.A03
            r312 = r0
            r0 = r306
            r1 = r304
            r0.A00 = r1
            r0 = r311
            r1 = r302
            r2 = r309
            r3 = r312
            r4 = r306
            java.lang.Object r0 = X.HM0.A00(r0, r1, r2, r3, r4)
            r309 = r0
            r0 = r309
            r1 = r310
            if (r0 != r1) goto L63
            r0 = r310
            return r0
        La0:
            X.AId r0 = new X.AId
            r306 = r0
            r0 = r306
            r1 = r301
            r2 = r303
            r3 = r304
            r0.<init>(r1, r2, r3)
            goto L3e
        Lb0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService.A01(android.graphics.Bitmap, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Class<X.F0m>, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.Fg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A02(java.lang.String r302, java.lang.String r303, X.0DR r304, X.MRN r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService.A02(java.lang.String, java.lang.String, X.0DR, X.MRN, boolean):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Class, java.lang.Class<X.F0f>] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.Fg2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A03(X.0DR r302, X.MRN r303) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService.A03(X.0DR, X.MRN):java.lang.Object");
    }
}
