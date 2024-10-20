package com.facebook.http.config.proxies;

import X.1BQ;
import X.1Bn;
import X.C00i;
import X.C11794xh;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* loaded from: ProxyDetector.class */
public final class ProxyDetector {
    public C11794xh A00;
    public final C00i A01;
    public final ImmutableList A02;
    public final Set A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;

    public ProxyDetector() {
        1BQ r0 = new 1BQ(49377);
        this.A04 = r0;
        1BQ r02 = new 1BQ(49380);
        this.A05 = r02;
        1BQ r03 = new 1BQ(49379);
        this.A06 = r03;
        1BQ r04 = new 1BQ(49378);
        this.A01 = r04;
        this.A03 = 1Bn.A0I(274);
        this.A00 = null;
        ArrayList arrayList = new ArrayList();
        arrayList.add(r0.get());
        arrayList.add(r04.get());
        arrayList.add(r03.get());
        arrayList.add(r02.get());
        this.A02 = ImmutableList.copyOf((Collection) arrayList);
    }
}
