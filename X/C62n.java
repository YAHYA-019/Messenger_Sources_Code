package X;

import java.util.UUID;

/* renamed from: X.62n, reason: invalid class name */
/* loaded from: 62n.class */
public final class C62n {
    public 5zD A00;
    public UUID A01 = null;
    public boolean A02;
    public final C62i A03;
    public final C62m A04;

    public C62n(C62i c62i, C62m c62m) {
        this.A03 = c62i;
        this.A04 = c62m;
    }

    public void A00() {
        5zD r0 = this.A00;
        if (r0 == null || this.A02) {
            return;
        }
        C62i c62i = this.A03;
        r0.A5y(c62i);
        this.A02 = true;
        UUID uuid = this.A01;
        if (uuid == null || uuid.equals(this.A00.D8r())) {
            return;
        }
        c62i.CQS();
    }

    public void A01() {
        5zD r0 = this.A00;
        if (r0 == null || !this.A02) {
            return;
        }
        r0.CeT(this.A03);
        this.A01 = this.A00.D8r();
        this.A02 = false;
    }

    public void A02(5zD r302) {
        5zD r0 = this.A00;
        if (r0 != r302) {
            if (r0 != null && this.A02) {
                r0.CeT(this.A03);
                this.A01 = this.A00.D8r();
                this.A02 = false;
            }
            this.A00 = r302;
            this.A01 = null;
            if (r302 != null) {
                if (!this.A02) {
                    r302.A5y(this.A03);
                    this.A02 = true;
                }
                if (this.A04 == null) {
                    this.A03.CQS();
                }
            }
        }
    }
}
