package X;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

/* loaded from: Eth.class */
public final class Eth {
    public final Optional A00;
    public final Optional A01;
    public final Optional A02;

    public Eth(Optional optional, Optional optional2, Optional optional3) {
        this.A00 = optional;
        this.A01 = optional2;
        this.A02 = optional3;
    }

    public String A00() {
        Preconditions.checkState(!this.A00.isPresent());
        return (String) this.A02.get();
    }
}
