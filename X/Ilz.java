package X;

import android.widget.EditText;
import com.facebook.stickers.generatedstickers.search.GeneratedStickerSearchFragment;

/* loaded from: Ilz.class */
public final class Ilz implements AYn {
    public final /* synthetic */ GeneratedStickerSearchFragment A00;

    public Ilz(GeneratedStickerSearchFragment generatedStickerSearchFragment) {
        this.A00 = generatedStickerSearchFragment;
    }

    @Override // X.AYn
    public void Bp6(String str) {
        11T.A0F(str, 0);
        GeneratedStickerSearchFragment generatedStickerSearchFragment = this.A00;
        ((HpH) generatedStickerSearchFragment.A0Y.getValue()).A00(str);
        EditText editText = generatedStickerSearchFragment.A00;
        if (editText != null) {
            editText.setText(str);
        }
    }
}
