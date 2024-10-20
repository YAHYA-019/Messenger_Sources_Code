package com.facebook.gk.internal;

import X.0S2;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1Rl;
import X.1Ro;
import X.4qT;
import X.C00i;
import X.InterfaceC09484qQ;
import android.os.Bundle;
import com.google.common.collect.RegularImmutableSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: GkSessionlessFetcher.class */
public class GkSessionlessFetcher {
    public final List A01;
    public final C00i A03 = 1BQ.A02(84633);
    public final C00i A02 = 1BV.A00(49288);
    public final List A00 = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    public GkSessionlessFetcher() {
        Set A0I = 1Bn.A0I(214);
        this.A01 = A0I.isEmpty() ? Collections.emptyList() : 1BK.A17(A0I);
    }

    public boolean A00() {
        try {
            Bundle bundle = (Bundle) ((1Rl) this.A03.get()).A0A((1Ro) this.A02.get(), new 4qT(RegularImmutableSet.A05, 0S2.A00));
            if (bundle == null || bundle.isEmpty() || !bundle.containsKey("gatekeepers")) {
                return true;
            }
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((InterfaceC09484qQ) it.next()).C0D(bundle);
            }
            Iterator it2 = this.A00.iterator();
            while (it2.hasNext()) {
                ((InterfaceC09484qQ) it2.next()).C0D(bundle);
            }
            return true;
        } catch (Exception e) {
            0fH.A0H(GkSessionlessFetcher.class, "Sessionless gatekeeper fetch with SingleMethodRunner failed", e);
            Iterator it3 = this.A01.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
            Iterator it4 = this.A00.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
            return false;
        }
    }
}
