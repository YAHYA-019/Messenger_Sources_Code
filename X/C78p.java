package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.model.Sticker;
import com.facebook.xapp.messaging.generatedsticker.bottomsheet.GeneratedStickerBottomSheetDialogFragment;

/* renamed from: X.78p, reason: invalid class name */
/* loaded from: 78p.class */
public final class C78p implements 74E {
    public final 1Br A00;
    public final 2Of A01;
    public final 1pK A02;
    public final ThreadKey A03;
    public final 2Og A04;

    public C78p(1pK r302, ThreadKey threadKey, 2Of r304, 2Og r305) {
        11T.A0F(r304, 1);
        11T.A0F(r305, 2);
        11T.A0F(r302, 4);
        this.A01 = r304;
        this.A04 = r305;
        this.A03 = threadKey;
        this.A02 = r302;
        this.A00 = 1Bq.A00(16385);
    }

    public boolean BQh(5vW r302) {
        C5wn c5wn;
        String str;
        11T.A0F(r302, 0);
        C5fv c5fv = ((5vV) r302).A00;
        if (((C5fu) c5fv).A0I || (c5wn = (C5wn) c5fv.AxW(C5gN.A00)) == null || (str = c5wn.A04) == null || 0CU.A0O(str) || !87A.A00(str)) {
            return false;
        }
        C00i c00i = this.A00.A00;
        return ((2yD) c00i.get()).AZk(36320953580339031L) || ((2yD) c00i.get()).AZk(36320953581125469L);
    }

    public void BoE(Context context, View view, final 5vW r304) {
        11T.A0F(r304, 2);
        C5fv c5fv = ((5vV) r304).A00;
        C5wo c5wo = (C5wo) c5fv.AxW(5lB.A00);
        String str = c5wo != null ? c5wo.A01 : null;
        String str2 = ((C5v9) c5fv).A00.A0E;
        11T.A0A(str2);
        06Z BdK = this.A04.BdK();
        if (BdK != null) {
            ThreadKey threadKey = this.A03;
            2Ov generatedStickerBottomSheetDialogFragment = new GeneratedStickerBottomSheetDialogFragment();
            Bundle A05 = 1BK.A05();
            A05.putString("URI", str2);
            A05.putString("PROMPT", str);
            A05.putParcelable(AbstractC00603o4.A00(108), new OpaqueParcelable(threadKey));
            generatedStickerBottomSheetDialogFragment.setArguments(A05);
            generatedStickerBottomSheetDialogFragment.A0m(BdK, "GeneratedStickerBottomSheetDialogFragment");
            LifecycleOwner viewLifecycleOwner = this.A02.getViewLifecycleOwner();
            BdK.A1O(new 0Tx() { // from class: X.9qd
                public final void Bza(String str3, Bundle bundle) {
                    11T.A0F(bundle, 1);
                    if (bundle.getInt("open_sticker_search_tab_result") == 1) {
                        C5wn A0g = 7zO.A0g(r304.A00);
                        this.A01.AQN(new 7BG((Integer) null, (Integer) null, (String) null, A0g != null ? A0g.A04 : null));
                    }
                }
            }, viewLifecycleOwner, "open_sticker_search_tab_request");
            BdK.A1O(new 0Tx() { // from class: X.9qa
                public final void Bza(String str3, Bundle bundle) {
                    11T.A0F(bundle, 1);
                    Sticker sticker = (Sticker) 0Gm.A01(Sticker.CREATOR, bundle.getParcelable("result_arg_sent_sticker"), Sticker.class);
                    if (sticker != null) {
                        C78p.this.A01.AQN(new 7Ce(sticker));
                    }
                }
            }, viewLifecycleOwner, 7zK.A00(415));
        }
    }
}
