package com.facebook.expression.effect.flm.bottomsheet;

import X.0FI;
import X.11T;
import X.1Iw;
import X.1LI;
import X.2cK;
import X.2cM;
import X.7zO;
import X.7zQ;
import X.C01i;
import X.GAY;
import X.GAa;
import X.H9s;
import X.HdP;
import X.QAw;
import X.QKj;
import X.QqA;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;
import kotlin.jvm.functions.Function1;

/* loaded from: FlmConsentBottomSheetFragment.class */
public final class FlmConsentBottomSheetFragment extends MigBottomSheetDialogFragment {
    public final C01i A02 = GAY.A00(this, 15);
    public final C01i A00 = GAY.A00(this, 13);
    public final C01i A01 = GAY.A00(this, 14);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        QAw qAw = new QAw(new QKj(), r302);
        HdP hdP = (HdP) this.A02.getValue();
        QKj qKj = qAw.A00;
        qKj.A00 = hdP;
        BitSet bitSet = qAw.A02;
        bitSet.set(2);
        qKj.A02 = 7zQ.A1a(this.A01);
        bitSet.set(0);
        qKj.A01 = (QqA) this.A00.getValue();
        bitSet.set(1);
        2cM A00 = 2cK.A00(r302);
        qAw.A0m(70.0f);
        qAw.A0e();
        A00.A2d(qAw);
        return A00.A00;
    }

    public void onCancel(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        Function1 function1 = ((HdP) this.A02.getValue()).A01.A02;
        if (function1 != null) {
            function1.invoke(H9s.A03);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1281846652);
        super.onCreate(bundle);
        if (7zQ.A1a(this.A01)) {
            ((BaseMigBottomSheetDialogFragment) this).A00 = (MigColorScheme) 7zO.A0l(this, 16980);
        }
        ((HdP) this.A02.getValue()).A00 = new GAa(this, 34);
        0FI.A08(2033535370, A02);
    }
}
