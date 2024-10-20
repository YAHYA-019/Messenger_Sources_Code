package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import java.util.Set;

/* renamed from: X.3Tx, reason: invalid class name */
/* loaded from: 3Tx.class */
public final class C3Tx implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C3Tx(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        1iZ r308;
        Bzn bzn;
        String str;
        3Ed r306;
        switch (this.A00) {
            case 0:
                r308 = (1iZ) this.A02;
                Set set = 1iZ.A0T;
                bzn = (Bzn) 1Br.A0B(r308.A0J);
                str = r308.A06;
                r306 = 3Ed.A03;
                break;
            case 1:
                r308 = (1iZ) this.A02;
                Set set2 = 1iZ.A0T;
                bzn = (Bzn) 1Br.A0B(r308.A0J);
                str = r308.A06;
                r306 = 3Ed.A01;
                break;
            case 2:
                ((BwB) this.A01).A04.A03().A0A((Context) this.A02, new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
                return;
            default:
                ((6Ki) ((4FY) this.A01).A02.get()).A04((Context) this.A02, "com.facebook.orca");
                return;
        }
        bzn.A00(r306, str);
        1iZ.A00((Activity) this.A01, r308);
    }
}
