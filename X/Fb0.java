package X;

import android.content.Context;

/* loaded from: Fb0.class */
public final class Fb0 implements GE9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 06Z A01;
    public final /* synthetic */ GEA A02;
    public final /* synthetic */ DKT A03;

    public Fb0(Context context, 06Z r303, GEA gea, DKT dkt) {
        this.A02 = gea;
        this.A03 = dkt;
        this.A00 = context;
        this.A01 = r303;
    }

    @Override // X.GE9
    public void onDismiss() {
        GEA gea = this.A02;
        if (gea != null) {
            gea.onDismiss();
        }
        DKT.A07(this.A01);
    }
}
