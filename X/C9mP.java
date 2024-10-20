package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.stickers.model.Sticker;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;

/* renamed from: X.9mP, reason: invalid class name */
/* loaded from: 9mP.class */
public final class C9mP {
    public static final C9mP A00 = new Object();

    public static final void A00(ThreadKey threadKey, Sticker sticker, 6RU r303) {
        9Xg r0 = (9Xg) 1Bn.A0A(68309);
        C5fp c5fp = new C5fp();
        c5fp.A0B = 4YU.A0s();
        5wW r02 = new 5wW();
        int i = 0;
        r02.A0H = false;
        r02.A0A = 0S2.A01;
        r02.A02("image/webp");
        r02.A03(String.valueOf(sticker.A08));
        String str = sticker.A0F;
        r02.A0C = str;
        c5fp.A00 = 7zN.A0e(new Photo(r02));
        c5fp.A02(C5gN.A00, new C5wn(false, null, null, "930215145186465", str));
        7Gc r03 = new 7Gc();
        r03.A02(4YT.A00(1030));
        r03.A03("composer_input_content");
        String str2 = c5fp.A0B;
        if (str2 != null) {
            i = str2.hashCode();
        }
        r03.A00(i);
        7FI.A02(r303, new 7AT(r03));
        7FI.A02(r303, new 7Ad(c5fp, "unknown", (String) null));
        r0.A00(threadKey, sticker, 96J.A05, "");
        ((Hpb) 1Bu.A06(r303.A00, 116047)).A00(sticker, null);
    }

    public static final void A01(ThreadKey threadKey, Sticker sticker, 6RU r303, 2Og r304, boolean z) {
        06Z BdK;
        Uri uri = sticker.A08;
        if (r304 == null || (BdK = r304.BdK()) == null || uri == null) {
            return;
        }
        if (z) {
            A00(threadKey, sticker, r303);
            return;
        }
        2Ov baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
        Bundle A05 = 1BK.A05();
        A05.putParcelable(TraceFieldType.Uri, new OpaqueParcelable(uri));
        baseMigBottomSheetDialogFragment.setArguments(A05);
        if (BdK.A1U() || BdK.A0B) {
            return;
        }
        baseMigBottomSheetDialogFragment.A0i(BdK, "confirm_user_send_request");
        0Ts.A00(baseMigBottomSheetDialogFragment, "confirm_user_send_request", new AVX(14, sticker, threadKey, r303));
    }

    public static final void A02(6RU r301, 7CK r302) {
        InputContentInfoCompat inputContentInfoCompat = r302.A01;
        C1pq.A08("inputContentInfoCompat", inputContentInfoCompat);
        7FI.A02(r301, new 7CG(inputContentInfoCompat, r302.A00));
    }
}
