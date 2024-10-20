package com.meta.metaai.shared.nux.service;

import X.1BK;
import X.1Ve;
import X.DKH;
import X.EMy;
import android.app.Application;
import com.facebook.foa.session.FbMetaSessionImpl;

/* loaded from: MetaAINuxNetworkService.class */
public final class MetaAINuxNetworkService {
    public final Application A00;
    public final FbMetaSessionImpl A01;
    public final 1Ve A02;

    public /* synthetic */ MetaAINuxNetworkService(Application application, FbMetaSessionImpl fbMetaSessionImpl) {
        1Ve A0P = DKH.A0P(application);
        this.A00 = application;
        this.A01 = fbMetaSessionImpl;
        this.A02 = A0P;
    }

    public static final String A00(EMy eMy) {
        int ordinal = eMy.ordinal();
        if (ordinal == 0) {
            return "IMAGINE";
        }
        if (ordinal == 3) {
            return "EDIT_WITH_AI";
        }
        if (ordinal == 1) {
            return "WRITE_WITH_AI";
        }
        if (ordinal == 2) {
            return "WRITE_WITH_AI_MMLLM";
        }
        throw 1BK.A1F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (((X.G8p) r303).A02 != 1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Class<X.F1P>, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.Ffg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(X.EMy r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.shared.nux.service.MetaAINuxNetworkService.A01(X.EMy, X.0DR):java.lang.Object");
    }
}
