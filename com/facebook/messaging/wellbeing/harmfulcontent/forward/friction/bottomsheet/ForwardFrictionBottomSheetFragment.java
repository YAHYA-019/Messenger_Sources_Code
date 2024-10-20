package com.facebook.messaging.wellbeing.harmfulcontent.forward.friction.bottomsheet;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1LI;
import X.3Eg;
import X.7zL;
import X.7zV;
import X.8Zq;
import X.9L1;
import X.9L2;
import X.AYN;
import X.C65r;
import X.C65s;
import X.C7ld;
import X.C97x;
import X.ROi;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ForwardFrictionBottomSheetFragment.class */
public final class ForwardFrictionBottomSheetFragment extends MigBottomSheetDialogFragment {
    public C97x A00;
    public 3Eg A01;
    public ROi A02;
    public AYN A03;
    public C65s A04;
    public Integer A05;
    public String A06;
    public final 1Br A07 = 1Bu.A00(147772);
    public final 9L1 A08 = new 9L1(this);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        7zL.A1L(r302);
        MigColorScheme A1F = A1F();
        9L1 r0 = this.A08;
        C65s c65s = this.A04;
        if (c65s == null) {
            c65s = C65s.A04;
        }
        Integer num = this.A05;
        if (num == null) {
            num = 0S2.A00;
        }
        return new 8Zq(r0, c65s, A1F, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        C97x c97x;
        Enum r309;
        int A02 = 0FI.A02(-988702400);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = requireArguments();
        }
        this.A06 = String.valueOf(bundle.getString("INFORM_TREATMENT_NAME"));
        String valueOf = String.valueOf(bundle.getString("INFORM_TREATMENT_TYPE"));
        String valueOf2 = String.valueOf(bundle.getString("INFORM_TREATMENT_MEDIA_TYPE"));
        String valueOf3 = String.valueOf(bundle.getString("MESSAGE_THREAD_TYPE"));
        String str = this.A06;
        if (str == null) {
            str = "";
        }
        this.A04 = C7ld.A00(C65r.A06, str).category;
        11T.A0F(valueOf, 0);
        C97x[] values = C97x.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                c97x = null;
                break;
            }
            c97x = values[i];
            String name = c97x.name();
            if (name != null && name.equalsIgnoreCase(valueOf)) {
                break;
            } else {
                i++;
            }
        }
        this.A00 = c97x;
        Integer num = 0S2.A00;
        11T.A0F(valueOf2, 0);
        Integer[] A00 = 0S2.A00(2);
        int length2 = A00.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            Integer num2 = A00[i2];
            if ((1 - num2.intValue() != 0 ? "PHOTO" : "VIDEO").equalsIgnoreCase(valueOf2)) {
                num = num2;
                break;
            }
            i2++;
        }
        this.A05 = num;
        11T.A0F(valueOf3, 0);
        Enum[] values2 = 3Eg.values();
        int length3 = values2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                r309 = null;
                break;
            }
            r309 = values2[i3];
            String name2 = r309.name();
            if (name2 != null && name2.equalsIgnoreCase(valueOf3)) {
                break;
            } else {
                i3++;
            }
        }
        this.A01 = r309;
        1Br.A0C(this.A07);
        ROi rOi = new ROi(requireContext(), this.A00, this.A01, this.A03, this.A06);
        this.A02 = rOi;
        rOi.A00 = this;
        7zV.A0q(rOi.A02, rOi.A03, 1BK.A08(1Br.A02(((9L2) 1Br.A0B(rOi.A04)).A00), "mwb_inform_treatment_intervention_shown"), rOi.A06, 256);
        0FI.A08(152435905, A02);
    }

    public void onDestroy() {
        int A02 = 0FI.A02(936267228);
        super.onDestroy();
        ROi rOi = this.A02;
        if (rOi == null) {
            11T.A0L("presenter");
            throw 0Q8.createAndThrow();
        }
        rOi.A00 = null;
        if (rOi.A01) {
            9L2 r0 = (9L2) 1Br.A0B(rOi.A04);
            7zV.A0q(rOi.A02, rOi.A03, 1BK.A08(1Br.A02(r0.A00), "mwb_inform_treatment_intervention_dont_share"), rOi.A06, 254);
        }
        0FI.A08(-4385404, A02);
    }
}
