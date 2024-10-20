package X;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;
import com.google.common.base.Ticker;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: X.1k8, reason: invalid class name */
/* loaded from: 1k8.class */
public final class C1k8 {
    public static final Supplier A0F = new Suppliers$SupplierOfInstance(new 1kA() { // from class: X.1k9
    });
    public static final Ticker A0G = new 1kD();
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Equivalence A06;
    public Equivalence A07;
    public Ticker A09;
    public 1kR A0A;
    public 1kR A0B;
    public 1kH A0C;
    public C1kb A0D;
    public boolean A0E = true;
    public int A00 = -1;
    public Supplier A08 = A0F;

    public C1k8() {
        long j = -1;
        this.A03 = j;
        this.A04 = j;
        this.A02 = j;
        this.A01 = j;
        this.A05 = j;
    }

    public static void A00(C1k8 c1k8) {
        Object obj;
        boolean z = true;
        long j = -1;
        if (c1k8.A0D == null) {
            if (c1k8.A04 != j) {
                z = false;
            }
            obj = "maximumWeight requires weigher";
        } else {
            boolean z2 = c1k8.A0E;
            long j2 = c1k8.A04;
            if (!z2) {
                if (j2 == j) {
                    3I3.A00.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
                    return;
                }
                return;
            } else {
                if (j2 == j) {
                    z = false;
                }
                obj = "weigher requires maximumWeight";
            }
        }
        Preconditions.checkState(z, obj);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1kl, X.1kn] */
    public C1kl A01(1kL r302) {
        A00(this);
        r302.getClass();
        return new C1kn(new 1kN(this, r302));
    }

    public C1kn A02() {
        A00(this);
        boolean z = false;
        if (this.A05 == -1) {
            z = true;
        }
        Preconditions.checkState(z, "refreshAfterWrite requires a LoadingCache");
        return new C1kn(new 1kN(this, (1kL) null));
    }

    public void A03(long j) {
        long j2 = this.A03;
        long j3 = -1;
        boolean z = true;
        boolean z2 = false;
        if (j2 == j3) {
            z2 = true;
        }
        Preconditions.checkState(z2, "maximum size was already set to %s", j2);
        long j4 = this.A04;
        boolean z3 = false;
        if (j4 == j3) {
            z3 = true;
        }
        Preconditions.checkState(z3, "maximum weight was already set to %s", j4);
        boolean z4 = false;
        if (this.A0D == null) {
            z4 = true;
        }
        Preconditions.checkState(z4, "maximum size can not be combined with weigher");
        if (j < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "maximum size must not be negative");
        this.A03 = j;
    }

    public void A04(long j, TimeUnit timeUnit) {
        long j2 = this.A01;
        boolean z = true;
        boolean z2 = false;
        if (j2 == -1) {
            z2 = true;
        }
        Preconditions.checkState(z2, "expireAfterAccess was already set to %s ns", j2);
        if (j < 0) {
            z = false;
        }
        if (!z) {
            throw 1BL.A0g("duration cannot be negative: %s %s", new Object[]{Long.valueOf(j), timeUnit});
        }
        this.A01 = timeUnit.toNanos(j);
    }

    public void A05(long j, TimeUnit timeUnit) {
        long j2 = this.A02;
        boolean z = true;
        boolean z2 = false;
        if (j2 == -1) {
            z2 = true;
        }
        Preconditions.checkState(z2, "expireAfterWrite was already set to %s ns", j2);
        if (j < 0) {
            z = false;
        }
        if (!z) {
            throw 1BL.A0g("duration cannot be negative: %s %s", new Object[]{Long.valueOf(j), timeUnit});
        }
        this.A02 = timeUnit.toNanos(j);
    }

    public void A06(1kH r302) {
        boolean z = false;
        if (this.A0C == null) {
            z = true;
        }
        Preconditions.checkState(z);
        r302.getClass();
        this.A0C = r302;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        int i = this.A00;
        if (i != -1) {
            stringHelper.add("concurrencyLevel", i);
        }
        long j = this.A03;
        long j2 = -1;
        if (j != j2) {
            stringHelper.add("maximumSize", j);
        }
        long j3 = this.A04;
        if (j3 != j2) {
            stringHelper.add("maximumWeight", j3);
        }
        long j4 = this.A02;
        if (j4 != j2) {
            stringHelper.add("expireAfterWrite", 0Pz.A0I(j4, "ns"));
        }
        long j5 = this.A01;
        if (j5 != j2) {
            stringHelper.add("expireAfterAccess", 0Pz.A0I(j5, "ns"));
        }
        1kR r0 = this.A0A;
        if (r0 != null) {
            stringHelper.add("keyStrength", Ascii.toLowerCase(r0.toString()));
        }
        1kR r02 = this.A0B;
        if (r02 != null) {
            stringHelper.add("valueStrength", Ascii.toLowerCase(r02.toString()));
        }
        if (this.A06 != null) {
            stringHelper.addValue("keyEquivalence");
        }
        if (this.A07 != null) {
            stringHelper.addValue("valueEquivalence");
        }
        if (this.A0C != null) {
            stringHelper.addValue("removalListener");
        }
        return stringHelper.toString();
    }
}
