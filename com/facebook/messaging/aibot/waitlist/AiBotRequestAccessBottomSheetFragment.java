package com.facebook.messaging.aibot.waitlist;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1iF;
import X.7zL;
import X.7zP;
import X.7zR;
import X.7zU;
import X.9De;
import X.9Rz;
import X.9YU;
import X.AnonymousClass001;
import X.B3o;
import X.C00m;
import X.C1x1;
import X.C37s;
import X.C87v;
import X.C9qq;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.facebook.litho.LithoView;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* loaded from: AiBotRequestAccessBottomSheetFragment.class */
public final class AiBotRequestAccessBottomSheetFragment extends BaseMigBottomSheetDialogFragment {
    public LithoView A00;
    public 9YU A01;
    public B3o A02;
    public Integer A03;
    public C00m A04;
    public final 1Br A05 = 1Bu.A00(99831);

    public 1iF A17() {
        return new 1iF(210592065166328L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        LithoView A0M = 7zR.A0M(this);
        this.A00 = A0M;
        return A0M;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(70);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        Integer num;
        Integer num2;
        int A02 = 0FI.A02(-358477476);
        super.onCreate(bundle);
        1Br.A0C(this.A05);
        this.A01 = new 9YU(requireContext());
        String string = requireArguments().getString("AiBotRequestAccessPage.status");
        if (string != null) {
            if (string.equals("LOADING")) {
                num = 0S2.A00;
            } else if (string.equals("SUCCESS")) {
                num = 0S2.A01;
            } else {
                if (!string.equals("FAILURE")) {
                    throw AnonymousClass001.A0L(string);
                }
                num = 0S2.A0C;
            }
            String string2 = requireArguments().getString("AiBotRequestAccessPage.entryPoint");
            if (string2 != null) {
                if (string2.equals("BOT_PICKER")) {
                    num2 = 0S2.A00;
                } else if (string2.equals("THREAD_VIEW")) {
                    num2 = 0S2.A01;
                } else if (string2.equals("WAITLIST_QP")) {
                    num2 = 0S2.A0C;
                } else {
                    if (!string2.equals("CONTACT_MENU")) {
                        throw AnonymousClass001.A0L(string2);
                    }
                    num2 = 0S2.A0N;
                }
                this.A03 = num2;
                Integer num3 = 0S2.A01;
                9YU r0 = this.A01;
                if (num != num3) {
                    if (r0 != null) {
                        r0.A00(num2);
                        0FI.A08(1412174113, A02);
                        return;
                    }
                    11T.A0L("viewData");
                    throw 0Q8.createAndThrow();
                }
                if (r0 != null) {
                    9Rz r02 = r0.A02;
                    C1x1 A0O = 7zP.A0O(r02.A03);
                    MutableLiveData mutableLiveData = r02.A02;
                    if (mutableLiveData.getValue() == null) {
                        throw 1BK.A0e();
                    }
                    A0O.A00(mutableLiveData, new C87v(num3, 4));
                    0FI.A08(1412174113, A02);
                    return;
                }
                11T.A0L("viewData");
                throw 0Q8.createAndThrow();
            }
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -769571228;
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -931577124;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = new B3o(this.A04, 7zU.A0t(this, 4), 7zU.A0t(this, 5));
        9YU r0 = this.A01;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        C9qq.A00(this, r0.A01, 3);
    }
}
