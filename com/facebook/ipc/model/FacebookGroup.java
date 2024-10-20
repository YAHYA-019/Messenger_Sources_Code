package com.facebook.ipc.model;

import X.CSR;
import android.os.Parcelable;

/* loaded from: FacebookGroup.class */
public class FacebookGroup extends FacebookProfile {
    public static final Parcelable.Creator CREATOR = new CSR(54);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r301.mId != ((com.facebook.ipc.model.FacebookProfile) r302).mId) goto L6;
     */
    @Override // com.facebook.ipc.model.FacebookProfile
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.ipc.model.FacebookGroup
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L26
            r0 = r301
            long r0 = r0.mId
            r304 = r0
            r0 = r302
            com.facebook.ipc.model.FacebookProfile r0 = (com.facebook.ipc.model.FacebookProfile) r0
            r302 = r0
            r0 = r302
            long r0 = r0.mId
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 == 0) goto L28
        L26:
            r0 = 0
            r303 = r0
        L28:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ipc.model.FacebookGroup.equals(java.lang.Object):boolean");
    }
}
