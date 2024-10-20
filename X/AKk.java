package X;

import android.graphics.drawable.GradientDrawable;

/* loaded from: AKk.class */
public final class AKk extends C00q implements C00m {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKk(C8We c8We, Aaq aaq, float f, int i, boolean z) {
        super(0);
        this.A01 = i;
        this.A03 = c8We;
        this.A00 = f;
        this.A02 = aaq;
        this.A04 = z;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A01;
        float f = this.A00;
        int Chy = ((Aaq) this.A02).Chy(i != 0 ? C97i.A0n : C97i.A0e, this.A04);
        float[] fArr = new float[8];
        int i2 = 0;
        do {
            fArr[i2] = f;
            i2++;
        } while (i2 < 8);
        GradientDrawable A0B = 7zU.A0B(fArr);
        A0B.setColor(Chy);
        return A0B;
    }
}
