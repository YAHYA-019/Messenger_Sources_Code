package X;

import android.graphics.Bitmap;

/* loaded from: Fc0.class */
public final class Fc0 implements JOk, JHs {
    public final int A00;
    public final Object A01;

    public Fc0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.JOk
    public void Blj(Bitmap bitmap) {
        if (this.A00 != 0) {
            if (bitmap != null) {
                ((DvC) this.A01).A02.A01(new EJq(bitmap));
                return;
            }
        } else if (bitmap != null) {
            ((Dvg) this.A01).A01.invoke(new EJq(bitmap));
            return;
        }
        R4J.A00().Cfw(164832702, "memu_onboarding");
    }

    @Override // X.JHs
    public void BnD() {
    }

    @Override // X.JHs
    public void BnG(Exception exc) {
        R4J.A00().Cfw(164832702, "memu_onboarding");
    }
}
