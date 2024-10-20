package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.messaging.magicwords.model.MagicWord;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: Cvq.class */
public final class Cvq implements C5wx {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cvq(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C5wx
    public boolean onLongClick(View view) {
        switch (this.A00) {
            case 0:
                AlA.A06((AlA) this.A01, ((2Vb) this.A02).A04);
                return true;
            case 1:
                return ((DGz) this.A01).C58((D55) this.A02);
            default:
                Bes bes = (Bes) this.A01;
                MagicWord magicWord = (MagicWord) this.A02;
                94S r0 = MigBottomSheetDialogFragment.A01;
                Bundle A05 = 1BK.A05();
                A05.putParcelable("selected_magic_word", magicWord);
                2Ov baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
                baseMigBottomSheetDialogFragment.setArguments(A05);
                baseMigBottomSheetDialogFragment.A0m(bes.A00.getChildFragmentManager(), "magic_words_long_press_fragment_tag");
                return true;
        }
    }
}
