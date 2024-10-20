package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: Fsu.class */
public final class Fsu implements GIl {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fsu(Context context, Ex4 ex4, int i) {
        this.A00 = i;
        this.A01 = ex4;
        this.A02 = context;
    }

    @Override // X.GIl
    public void BxV() {
        int i;
        int i2 = this.A00;
        Ex4 ex4 = (Ex4) this.A01;
        EyW eyW = (EyW) ex4.A00.get();
        if (i2 != 0) {
            eyW.A00("optout_save_failed");
            i = 238948877;
            if (ED7.A02((Context) this.A02, ex4.A01)) {
                i = 238951439;
            }
        } else {
            eyW.A00("optin_save_failed");
            i = 238952975;
            if (ED7.A02((Context) this.A02, ex4.A01)) {
                i = 238953198;
            }
        }
        C00i c00i = ex4.A02;
        1BK.A0U(c00i).markerPoint(i, "state_mutation_failed");
        DKE.A1O(c00i, i);
    }

    @Override // X.GIl
    public void onSuccess(String str) {
        EyW eyW;
        String str2;
        if (this.A00 != 0) {
            Context context = (Context) this.A02;
            Ex4 ex4 = (Ex4) this.A01;
            int i = 238948877;
            if (ED7.A02(context, ex4.A01)) {
                i = 238951439;
            }
            C00i c00i = ex4.A02;
            1BK.A0U(c00i).markerPoint(i, "state_mutation_succeeded");
            DKE.A1N(c00i, i);
            eyW = (EyW) ex4.A00.get();
            str2 = "optout_save_success";
        } else {
            Bundle A05 = 1BK.A05();
            A05.putString("ref", "dialtone_optin_screen");
            Intent A052 = AbF.A05();
            DKC.A1J(A052, "dialtone://switch_to_dialtone");
            A052.putExtras(A05);
            A052.setFlags(335544320);
            0LS.A0A((Context) this.A02, A052);
            eyW = (EyW) ((Ex4) this.A01).A00.get();
            str2 = "optin_save_success";
        }
        eyW.A00(str2);
    }
}
