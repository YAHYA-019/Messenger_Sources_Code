package X;

import android.view.View;
import com.facebook.stickers.store.StickerStoreFragment;
import com.facebook.widget.titlebar.TitleBarButtonSpec;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* loaded from: GL6.class */
public interface GL6 {
    static void A00(StickerStoreFragment stickerStoreFragment, Object[] objArr) {
        stickerStoreFragment.A0C.CmO(Arrays.asList(objArr));
    }

    static void A01(GL6 gl6, F6h f6h) {
        gl6.CmO(ImmutableList.of((Object) new TitleBarButtonSpec(f6h)));
    }

    void Cm8(View.OnClickListener onClickListener);

    void CmO(List list);

    void CpM(boolean z);

    void Crl(GGc gGc);

    void Cs3(ErO erO);

    void CvU(int i);

    void CvV(CharSequence charSequence);

    void CvZ(View.OnClickListener onClickListener);
}
