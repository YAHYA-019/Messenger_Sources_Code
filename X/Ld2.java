package X;

import java.io.Serializable;

/* loaded from: Ld2.class */
public final class Ld2 implements MGF, Serializable {
    public final Object zza;

    public Ld2(Object obj) {
        this.zza = obj;
    }

    public final Object DCA() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        boolean z = false;
        if ((obj instanceof Ld2) && ((obj2 = this.zza) == (obj3 = ((Ld2) obj).zza) || obj2.equals(obj3))) {
            z = true;
        }
        return z;
    }

    public final int hashCode() {
        return DKD.A04(this.zza);
    }

    public final String toString() {
        return 0Pz.A0j("Suppliers.ofInstance(", this.zza.toString(), ")");
    }
}
