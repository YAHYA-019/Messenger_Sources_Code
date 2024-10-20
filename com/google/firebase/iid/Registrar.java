package com.google.firebase.iid;

import X.1cN;
import X.1cQ;
import X.1cS;
import X.1cV;
import X.1cW;
import X.1cY;
import X.AnonymousClass001;
import X.C1bL;
import X.C1bo;
import X.C1bq;
import X.C1c9;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* loaded from: Registrar.class */
public final class Registrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C1bq c1bq = new C1bq(FirebaseInstanceId.class, new Class[0]);
        c1bq.A01(new 1cN(C1bL.class, 1));
        c1bq.A01(new 1cN(C1c9.class, 1));
        c1bq.A01(new 1cN(1cQ.class, 1));
        c1bq.A02 = 1cS.A00;
        boolean z = false;
        if (c1bq.A00 == 0) {
            z = true;
        }
        if (!z) {
            throw AnonymousClass001.A0N("Instantiation type has already been set.");
        }
        c1bq.A00 = 1;
        C1bo A00 = c1bq.A00();
        C1bq c1bq2 = new C1bq(1cV.class, new Class[0]);
        c1bq2.A01(new 1cN(FirebaseInstanceId.class, 1));
        c1bq2.A02 = 1cW.A00;
        return Arrays.asList(A00, c1bq2.A00(), 1cY.A00("fire-iid", "18.0.0"));
    }
}
