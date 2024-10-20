package X;

import android.content.Context;

/* renamed from: X.8n8, reason: invalid class name */
/* loaded from: 8n8.class */
public final class C8n8 extends C1rj {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;

    public C8n8() {
        super("CardShadow");
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
    }

    public static 8O4 A00(1Iw r301) {
        C8n8 c8n8 = new C8n8();
        C1rs c1rs = new C1rs(c8n8, r301, 0, 0);
        ((8O4) c1rs).A01 = c8n8;
        ((8O4) c1rs).A00 = r301;
        return c1rs;
    }

    public Integer A0m() {
        return 0S2.A01;
    }

    public Object A0n(Context context) {
        return new 8Ba();
    }

    public boolean A0q() {
        return true;
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        8Ba r0 = (8Ba) obj;
        int i = this.A06;
        int i2 = this.A05;
        float f = this.A00;
        float f2 = this.A04;
        float f3 = this.A01;
        float f4 = this.A02;
        float f5 = this.A03;
        if (r0.A07 != i) {
            r0.A07 = i;
            r0.A08 = true;
            r0.invalidateSelf();
        }
        if (r0.A06 != i2) {
            r0.A06 = i2;
            r0.A08 = true;
            r0.invalidateSelf();
        }
        float f6 = (int) (f + 0.5f);
        if (r0.A00 != f6) {
            r0.A00 = f6;
            r0.A08 = true;
            r0.invalidateSelf();
        }
        if (f2 < 0.0f) {
            throw AnonymousClass001.A0L("invalid shadow size");
        }
        int i3 = (int) (f2 + 0.5f);
        if (i3 % 2 == 1) {
            i3--;
        }
        float f7 = i3;
        if (r0.A05 != f7) {
            r0.A05 = f7;
            r0.A08 = true;
            r0.invalidateSelf();
        }
        r0.A03 = f4;
        r0.A04 = f5;
        if (-1.0f != r0.A01) {
            r0.A01 = -1.0f;
            r0.A08 = true;
            r0.invalidateSelf();
        }
        if (f3 != r0.A02) {
            r0.A02 = f3;
            r0.A08 = true;
            r0.invalidateSelf();
        }
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8n8 c8n8 = (C8n8) r302;
            if (Float.compare(this.A00, c8n8.A00) != 0 || Float.compare(-1.0f, -1.0f) != 0 || Float.compare(this.A01, c8n8.A01) != 0 || this.A05 != c8n8.A05 || Float.compare(this.A02, c8n8.A02) != 0 || Float.compare(this.A03, c8n8.A03) != 0 || Float.compare(this.A04, c8n8.A04) != 0 || this.A06 != c8n8.A06) {
                return false;
            }
        }
        return true;
    }
}
