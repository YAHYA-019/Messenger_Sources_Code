package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/* loaded from: Bqm.class */
public final class Bqm {
    public final ImmutableMap A00;
    public final ImmutableSet A01;
    public final Exception A02;

    public Bqm(ImmutableMap immutableMap, ImmutableSet immutableSet, Exception exc) {
        if (exc != null) {
            02W.A04(immutableMap.isEmpty());
            02W.A04(immutableSet.isEmpty());
        }
        this.A00 = immutableMap;
        this.A01 = immutableSet;
        this.A02 = exc;
    }
}
