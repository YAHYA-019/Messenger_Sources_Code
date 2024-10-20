package X;

import java.util.List;

/* loaded from: Kgc.class */
public final class Kgc {
    public final List A00;
    public final boolean A01;

    public Kgc(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
        if (!1BK.A1Y(list)) {
            throw AnonymousClass001.A0L("credentialOptions should not be empty");
        }
    }
}
