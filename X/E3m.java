package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.nativetemplates.fb.shell.messenger.NativeTemplatesMessengerActivity;

/* loaded from: E3m.class */
public final class E3m extends FIJ {
    public final 1Br A00;
    public final 1Br A01;
    public final GL7 A02;

    public E3m(GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A02 = gl7;
        this.A01 = 1Bq.A00(115063);
        this.A00 = 1Bq.A00(16616);
    }

    public void A08(FyG fyG) {
        Activity A08;
        int i = 0;
        11T.A0F(fyG, 0);
        GL7 gl7 = this.A02;
        String A09 = GL7.A09(gl7, "PUSH", 36);
        String A07 = GL7.A07(gl7);
        String A092 = GL7.A09(gl7, "", 41);
        int i2 = 0;
        boolean z = gl7.getBoolean(35, false);
        boolean z2 = gl7.getBoolean(42, false);
        boolean z3 = gl7.getBoolean(43, false);
        boolean z4 = gl7.getBoolean(44, false);
        try {
            i = A09.length();
            if (i == 12 && (A08 = ((1Od) 1Br.A0B(this.A00)).A08()) != null) {
                0D2 instantiate = Fragment.instantiate(fyG.A00, Qmi.class.getName(), DZR.A03(A07, A092, A09, !z, z2));
                11T.A0I(instantiate, "null cannot be cast to non-null type com.facebook.messaging.nativetemplates.bottomsheet.NTControllerContainerBottomSheetDialogFragment");
                instantiate.A0m(((FragmentActivity) A08).BDe(), "NT_OPEN_CONTROLLER");
                return;
            }
        } catch (Exception e) {
            DKE.A1U(R2A.class, A09, e);
        }
        boolean z5 = !z;
        Intent A05 = AbF.A05();
        A05.putExtra("target_fragment", 305);
        A05.putExtras(DZR.A03(A07, A092, A09, z5, z2));
        if (i == 5) {
            A05.putExtra("enter_animation_override_id", 2130772054);
            A05.putExtra("exit_animation_override_id", 2130772052);
        }
        Context context = fyG.A00;
        A05.setClass(context, NativeTemplatesMessengerActivity.class);
        A05.putExtra("disable_hardware_back_button", z3);
        A05.putExtra("title_bar_is_present", !z2);
        int flags = A05.getFlags() | 67108864;
        if (z4) {
            i2 = 1073741824;
        }
        A05.setFlags(flags | i2);
        1Br.A0C(this.A01);
        DKE.A1C(context, A05);
    }
}
