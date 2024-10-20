package com.facebook.messaging.msys.thread.xma.plugins.post.metadata;

import X.02H;
import X.11T;
import X.1Bq;
import X.1Br;
import X.C5pu;
import android.content.Context;
import java.util.Set;

/* loaded from: PostXmaMetadata.class */
public final class PostXmaMetadata {
    public final int A00;
    public final Context A01;
    public final 1Br A02;
    public final C5pu A03;
    public static final Set A05 = 02H.A02(new Integer[]{5, 7});
    public static final Set A04 = 02H.A02(new Integer[]{4, 6});

    public PostXmaMetadata(Context context, C5pu c5pu, int i) {
        11T.A0F(c5pu, 1);
        11T.A0F(context, 4);
        this.A03 = c5pu;
        this.A00 = i;
        this.A01 = context;
        this.A02 = 1Bq.A00(16385);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r301 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(int r301) {
        /*
            java.util.Set r0 = com.facebook.messaging.msys.thread.xma.plugins.post.metadata.PostXmaMetadata.A05
            r302 = r0
            r0 = r301
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.contains(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L2d
            java.util.Set r0 = com.facebook.messaging.msys.thread.xma.plugins.post.metadata.PostXmaMetadata.A04
            r302 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.contains(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L2d
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            if (r0 != 0) goto L2f
        L2d:
            r0 = 1
            r304 = r0
        L2f:
            r0 = r304
            r1 = 1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.thread.xma.plugins.post.metadata.PostXmaMetadata.A00(int):boolean");
    }
}
