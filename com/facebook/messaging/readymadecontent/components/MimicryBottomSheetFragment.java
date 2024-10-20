package com.facebook.messaging.readymadecontent.components;

import X.0Dc;
import X.0FI;
import X.11T;
import X.1BJ;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1LI;
import X.2K3;
import X.2KD;
import X.2cK;
import X.2cM;
import X.7zL;
import X.7zN;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zS;
import X.8Th;
import X.9KG;
import X.9pY;
import X.C2cp;
import X.C2cq;
import X.C8nq;
import X.CFx;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MimicryBottomSheetFragment.class */
public final class MimicryBottomSheetFragment extends MigBottomSheetDialogFragment {
    public DialogInterface.OnDismissListener A00;
    public View.OnClickListener A01;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        2cM A00 = 2cK.A00(r302);
        A00.A1C(20.0f);
        C2cq A002 = C2cp.A00(r302, 0);
        A002.A0l(160.0f);
        A002.A17(8.0f);
        A002.A0e();
        A002.A18(5.0f);
        A002.A0L();
        A002.A2Z(2132411098);
        A002.A2Y();
        7zN.A1B(A00, A002);
        2KD A01 = 2K3.A01(r302, 0);
        A01.A18(10.0f);
        A01.A2r(2131964180);
        A01.A2b();
        A01.A0L();
        A01.A2x(A1F());
        A01.A2m();
        A00.A2d(A01);
        2KD A012 = 2K3.A01(r302, 0);
        Context context = r302.A0D;
        0Dc A0P = 7zP.A0P(context);
        A0P.A02(r302.A0D(2131964178));
        A0P.A02(" ");
        MigColorScheme A1F = A1F();
        CFx A0o = 7zQ.A0o();
        1Br A013 = 1Bu.A01(context, 100011);
        String BCz = ((9KG) 1Bn.A0A(67867)).A00.BCz(72903616696090841L, 1BJ.A00(1411));
        11T.A0A(BCz);
        A0P.A04(A0o.A01(context, new 9pY(context, A013, BCz, 3), A1F), 33);
        A012.A2z(7zS.A0A(A0P, r302.A0D(2131964177)));
        A012.A2d();
        A012.A0L();
        A012.A2X();
        A012.A2x(A1F());
        A012.A2n();
        A00.A2d(A012);
        8Th A003 = C8nq.A00(r302);
        A003.A2Z(A1F());
        A003.A2X(2131964179);
        A003.A17(40.0f);
        A003.A2Y(this.A01);
        return 7zL.A0V(A00, A003.A2W());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(2125216619);
        super.onCreate(bundle);
        ((BaseMigBottomSheetDialogFragment) this).A00 = (MigColorScheme) 7zO.A0l(this, 16980);
        0FI.A08(-660689180, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
