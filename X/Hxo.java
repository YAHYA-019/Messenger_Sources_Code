package X;

import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.base.Present;

/* loaded from: Hxo.class */
public final class Hxo {
    public final Optional A00;

    public Hxo() {
        Absent absent = Absent.INSTANCE;
        11T.A0A(absent);
        this.A00 = absent;
    }

    public Hxo(String str) {
        this.A00 = new Present(str);
    }
}
