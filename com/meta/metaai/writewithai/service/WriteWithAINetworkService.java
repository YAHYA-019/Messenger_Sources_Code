package com.meta.metaai.writewithai.service;

import X.07S;
import X.11T;
import X.1BK;
import X.1Ve;
import X.2Jd;
import X.4YT;
import X.4YU;
import X.7zN;
import X.DKC;
import X.DKH;
import X.Ez9;
import X.Fyt;
import X.Fyu;
import X.GDv;
import android.app.Application;
import com.facebook.foa.session.FbMetaSessionImpl;
import com.facebook.graphql.calls.GraphQlCallInput;

/* loaded from: WriteWithAINetworkService.class */
public final class WriteWithAINetworkService {
    public final Application A00;
    public final FbMetaSessionImpl A01;
    public final 1Ve A02;

    public /* synthetic */ WriteWithAINetworkService(Application application, FbMetaSessionImpl fbMetaSessionImpl) {
        1Ve A0P = DKH.A0P(application);
        this.A00 = application;
        this.A01 = fbMetaSessionImpl;
        this.A02 = A0P;
    }

    public static final 2Jd A00(Ez9 ez9) {
        07S A0J;
        String str;
        GDv gDv = ez9.A01;
        if (gDv instanceof Fyt) {
            2Jd A0Q = DKC.A0Q();
            2Jd A0Q2 = DKC.A0Q();
            A0Q2.A0A("media_urls", ((Fyt) gDv).A00);
            A0Q.A05(A0Q2, "fb_video_context");
            return A0Q;
        }
        if (!(gDv instanceof Fyu)) {
            throw 1BK.A1F();
        }
        Fyu fyu = (Fyu) gDv;
        String str2 = fyu.A00;
        boolean A0O = 11T.A0O(str2, "FEED");
        2Jd A0Q3 = DKC.A0Q();
        if (A0O) {
            A0J = 4YU.A0J(GraphQlCallInput.A02, "", "text");
            07S.A00(A0J, str2, 4YT.A00(36));
            07S.A00(A0J, fyu.A01, "image_url");
            str = "fb_feed_composer_context";
        } else {
            A0J = 4YU.A0J(GraphQlCallInput.A02, fyu.A01, "image_url");
            str = "fb_stories_context";
        }
        7zN.A17(A0J, A0Q3, str);
        return A0Q3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (((X.G8p) r305).A02 != 4) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(X.FAD r302, java.lang.String r303, java.lang.String r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.service.WriteWithAINetworkService.A01(X.FAD, java.lang.String, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (((X.G8p) r303).A02 != 3) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Class<X.F1U>, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.Ffq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A02(X.FAD r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.service.WriteWithAINetworkService.A02(X.FAD, X.0DR):java.lang.Object");
    }
}
