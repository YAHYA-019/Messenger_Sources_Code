package com.facebook.messaging.aibot.nux;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.2cK;
import X.2cM;
import X.3vU;
import X.4YT;
import X.7zL;
import X.7zN;
import X.7zO;
import X.7zS;
import X.8Lf;
import X.8Ll;
import X.8NK;
import X.8Tn;
import X.9Di;
import X.AbN;
import X.BOj;
import X.BoT;
import X.C1u3;
import X.C77c;
import X.C8nn;
import X.CZD;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.io.Serializable;
import java.util.List;

/* loaded from: AiBotMentionsNuxFragmentV2.class */
public final class AiBotMentionsNuxFragmentV2 extends MigBottomSheetDialogFragment {
    public BoT A00;
    public C77c A01;
    public MigColorScheme A02;
    public 3vU A03;

    /* JADX WARN: Multi-variable type inference failed */
    public static final BOj A05(AiBotMentionsNuxFragmentV2 aiBotMentionsNuxFragmentV2) {
        Bundle bundle = aiBotMentionsNuxFragmentV2.mArguments;
        BOj bOj = null;
        Serializable serializable = bundle != null ? bundle.getSerializable(4YT.A00(521)) : null;
        if (serializable instanceof BOj) {
            bOj = (BOj) serializable;
        }
        return bOj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        11T.A0F(r302, 0);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        8Tn A00 = C8nn.A00(r302);
        MigColorScheme migColorScheme = this.A02;
        if (migColorScheme != null) {
            A00.A2a(migColorScheme);
            List A0v = 7zN.A0v(8Ll.A01(C1u3.A3Y, r302.A0D(2131952549), r302.A0D(2131952546), (String) null, 8), 8Ll.A01(C1u3.A61, r302.A0D(2131952550), r302.A0D(2131952548), (String) null, 8), 8Ll.A01(C1u3.A1n, r302.A0D(2131952560), r302.A0D(2131952556), (String) null, 8));
            String A0D = r302.A0D(2131952557);
            8Lf r0 = new 8Lf(CZD.A00(this, 27), CZD.A00(this, 28), A0D, r302.A0D(2131952561));
            String A0D2 = r302.A0D(2131952551);
            C77c c77c = this.A01;
            if (c77c == null) {
                str = "aiBotNuxUtils";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            Context requireContext = requireContext();
            if (this.A02 != null) {
                SpannableString A012 = C77c.A01(requireContext, c77c, false);
                11T.A0D(A0D2);
                A00.A2Z(new 8NK(r0, (1LI) null, (9Di) null, A0D2, (CharSequence) null, A012, 10, 10, A0v, true, true));
                return 7zL.A0V(A01, A00.A2W());
            }
        }
        str = "colorScheme";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-174407368);
        super.onCreate(bundle);
        this.A02 = 7zS.A0j(this);
        this.A01 = (C77c) 7zO.A0l(this, 68283);
        this.A03 = (3vU) 1Bn.A0A(68258);
        0FI.A08(724421563, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        3vU r0 = this.A03;
        if (r0 == null) {
            str = "logger";
        } else {
            r0.A0F(A05(this), AbN.A0M(this));
            BoT boT = this.A00;
            if (boT != null) {
                boT.A02.invoke();
                return;
            }
            str = "listener";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        3vU r0 = this.A03;
        if (r0 == null) {
            11T.A0L("logger");
            throw 0Q8.createAndThrow();
        }
        r0.A0G(A05(this), AbN.A0M(this));
    }
}
