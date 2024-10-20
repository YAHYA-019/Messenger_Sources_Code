package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.bloks.messenger.activity.MSGBloksActivity;
import com.facebook.bloks.messenger.hosting.screens.MsgCdsBottomSheetFragment;

/* loaded from: F2x.class */
public final class F2x {
    public static F2x A00;

    public static void A00(Context context, FZo fZo, FxJ fxJ, DLQ dlq, GHK ghk, Integer num, String str, int i, boolean z) {
        String str2;
        int i2;
        int i3;
        Integer num2;
        FZt fZt = fxJ.A07;
        FZt fZt2 = fZt;
        if (fZt == null) {
            fZt2 = FIX.A03();
        }
        String A07 = dlq == null ? "unspecified_screen_id" : FIv.A07(dlq);
        1CO r0 = MsgCdsBottomSheetFragment.A0H;
        0D2 A002 = EUg.A00(fxJ, fZt2, str, A07);
        Activity A003 = FIA.A00(context);
        if (!(A003 instanceof FragmentActivity)) {
            throw AnonymousClass001.A0N(1BJ.A00(888));
        }
        FragmentActivity fragmentActivity = (FragmentActivity) A003;
        if (fZt2.A0D != EP2.A05) {
            FIw.A06(A002, fragmentActivity, fZo, fxJ.A04, fxJ, new EIs(ghk, i, z), A07);
            return;
        }
        Integer num3 = fZt != null ? fZt.A01 : 0S2.A00;
        1pI r02 = fxJ.A02;
        if (r02 != null) {
            r02.Czz(A002, num3 == 0S2.A0C ? 0S2.A0u : 0S2.A0j, A07);
            AnonymousClass001.A07().post(new SEt(fragmentActivity, fZo, fxJ, A002, dlq, ghk, i, z));
            return;
        }
        08O A0d = DKD.A0d();
        Bundle A05 = 1BK.A05();
        F0E.A01(A05, fxJ);
        FZo.A03(A05, fZo);
        Intent A0D = C3o5.A0D(context, MSGBloksActivity.class);
        A0D.putExtras(A05);
        A0D.putExtra("open_sheet_config", fZt2.A00());
        A0D.putExtra("app_id", str);
        Bundle A052 = 1BK.A05();
        F0E.A01(A052, fxJ);
        A0D.putExtra("app_data_config", A052);
        A0D.putExtra("new_full_screen_activity", true);
        A0D.putExtra("target_fragment", 1);
        if (dlq != null) {
            str2 = FIv.A07(dlq);
        } else {
            str2 = fxJ.A0A;
            if (str2 == null) {
                str2 = "unspecified_screen_id";
            }
        }
        A0D.putExtra("bloks_model_screen_id", str2);
        A0D.putExtra("initial_keyboard_soft_input_mode", i);
        A0D.putExtra("is_limited_theme", z);
        if (ghk != null) {
            A0D.putExtra("back_button_override", FGX.A00(ghk));
        }
        if (num != null) {
            A0D.putExtra("renders_in_unsafe_area", F2q.A00(num));
        }
        if (fZt2.A0K) {
            A0D.addFlags(67108864);
        }
        A0d.A06().A0A(context, A0D);
        Activity A004 = FIA.A00(context);
        if (A004 != null) {
            if (num3 == 0S2.A0C) {
                A004.overridePendingTransition(2130771994, 2130771994);
                return;
            }
            Integer num4 = fxJ.A08;
            if (num4 == null || (num2 = fxJ.A09) == null) {
                i2 = 2130771995;
                i3 = 2130771994;
            } else {
                i2 = num4.intValue();
                i3 = num2.intValue();
            }
            A004.overridePendingTransition(i2, i3);
        }
    }
}
