package com.facebook.storage.cask.fbapps.adhoc;

import X.1BQ;
import X.1MB;
import X.1Zj;
import X.1aM;
import X.2Jm;
import X.2yD;
import X.C00i;
import X.C1Z7;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: FBAppAdHocCaskRegisters.class */
public final class FBAppAdHocCaskRegisters {
    public final C00i A00 = new 1BQ(16600);
    public final C00i A01 = new 1BQ(16385);

    public void registerAdhocPaths() {
        2yD r0 = (2yD) this.A01.get();
        long Auy = r0.Auy(36594727681329348L);
        long Auy2 = r0.Auy(36594727681263811L);
        1aM r02 = new 1aM();
        r02.A00 = Auy << 20;
        r02.A01 = Auy2 << 20;
        r02.A04 = true;
        C1Z7 A00 = r02.A00();
        HashMap hashMap = new HashMap();
        hashMap.put(A00.A01(), A00);
        ((1MB) this.A00.get()).AUq(new 2Jm((1Zj) null, (File) null, (Map) null, hashMap), 755610421);
    }
}
