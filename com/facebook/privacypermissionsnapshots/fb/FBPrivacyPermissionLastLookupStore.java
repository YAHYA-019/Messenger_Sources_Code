package com.facebook.privacypermissionsnapshots.fb;

import X.1BQ;
import X.1CO;
import X.1G0;
import X.1G9;
import X.AbH;
import X.C00i;
import X.C1Ur;
import X.L2t;

/* loaded from: FBPrivacyPermissionLastLookupStore.class */
public final class FBPrivacyPermissionLastLookupStore extends L2t {
    public static final 1G9 A03 = 1G0.A0B.A0F("privacy_permission_snapshot/").A0F("last_lookup_time_seconds");
    public final C00i A02;
    public final C00i A01 = AbH.A0S();
    public final C00i A00 = AbH.A0a();

    public FBPrivacyPermissionLastLookupStore() {
        1BQ A00 = 1BQ.A00();
        this.A02 = A00;
        super.A00 = C1Ur.A00((1CO) A00.get(), 604800, 36593679707801040L);
    }
}
