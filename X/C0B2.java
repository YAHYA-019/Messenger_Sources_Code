package X;

/* renamed from: X.0B2, reason: invalid class name */
/* loaded from: 0B2.class */
public final class C0B2 extends C0B1 {
    public long activeTimeMs;
    public double powerMah;
    public long wakeUpTimeMs;

    @Override // X.C0B1
    public /* bridge */ /* synthetic */ C0B1 A08(C0B1 c0b1) {
        A0D((C0B2) c0b1);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0B1
    /* renamed from: A0B, reason: merged with bridge method [inline-methods] */
    public C0B2 A09(C0B2 c0b2, C0B2 c0b22) {
        C0B2 c0b23 = c0b22;
        if (c0b22 == null) {
            c0b23 = new Object();
        }
        if (c0b2 == null) {
            c0b23.A0D(this);
            return c0b23;
        }
        c0b23.powerMah = this.powerMah - c0b2.powerMah;
        c0b23.activeTimeMs = this.activeTimeMs - c0b2.activeTimeMs;
        c0b23.wakeUpTimeMs = this.wakeUpTimeMs - c0b2.wakeUpTimeMs;
        return c0b23;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0B1
    /* renamed from: A0C, reason: merged with bridge method [inline-methods] */
    public C0B2 A0A(C0B2 c0b2, C0B2 c0b22) {
        C0B2 c0b23 = c0b22;
        if (c0b22 == null) {
            c0b23 = new Object();
        }
        if (c0b2 == null) {
            c0b23.A0D(this);
            return c0b23;
        }
        c0b23.powerMah = c0b2.powerMah + this.powerMah;
        c0b23.activeTimeMs = c0b2.activeTimeMs + this.activeTimeMs;
        c0b23.wakeUpTimeMs = c0b2.wakeUpTimeMs + this.wakeUpTimeMs;
        return c0b23;
    }

    public void A0D(C0B2 c0b2) {
        this.powerMah = c0b2.powerMah;
        this.activeTimeMs = c0b2.activeTimeMs;
        this.wakeUpTimeMs = c0b2.wakeUpTimeMs;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0B2 c0b2 = (C0B2) obj;
            if (Double.compare(c0b2.powerMah, this.powerMah) != 0 || this.activeTimeMs != c0b2.activeTimeMs || this.wakeUpTimeMs != c0b2.wakeUpTimeMs) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A03(this.wakeUpTimeMs, AnonymousClass002.A02(this.activeTimeMs, AnonymousClass002.A01(Double.doubleToLongBits(this.powerMah))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Consumption{powerMah=");
        A0k.append(this.powerMah);
        A0k.append(", activeTimeMs=");
        A0k.append(this.activeTimeMs);
        A0k.append(", wakeUpTimeMs=");
        A0k.append(this.wakeUpTimeMs);
        return AnonymousClass001.A0f(A0k);
    }
}
