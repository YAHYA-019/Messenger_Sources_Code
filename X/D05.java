package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* loaded from: D05.class */
public final class D05 implements DHo {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ CGi A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public D05(Context context, FbUserSession fbUserSession, CGi cGi, String str, List list) {
        this.A02 = cGi;
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = str;
        this.A04 = list;
    }

    @Override // X.DHo
    public void BxV() {
        Context context = this.A00;
        CSG A00 = CSG.A00(this, ActionId.FAIL_FILE_TOO_LARGE);
        DKS dks = new DKS(context);
        dks.A06(2131957148);
        dks.A05(2131957152);
        dks.A0E(A00, 2131967444);
        dks.A07((DialogInterface.OnClickListener) null);
        dks.A01.A0I = true;
        dks.A0C(true);
        dks.A04();
    }

    @Override // X.DHo
    public void onSuccess() {
        ((EsN) this.A02.A01.get()).A00(0S2.A0u);
    }
}
