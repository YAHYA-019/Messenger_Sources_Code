package X;

import android.content.DialogInterface;
import java.util.Set;

/* renamed from: X.3Tv, reason: invalid class name */
/* loaded from: 3Tv.class */
public final class C3Tv implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public C3Tv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 == 0) {
            11T.A0F(dialogInterface, 0);
            1iZ r0 = (1iZ) this.A01;
            Set set = 1iZ.A0T;
            ((Bzn) 1Br.A0B(r0.A0J)).A00(3Ed.A04, r0.A06);
        }
        dialogInterface.dismiss();
    }
}
