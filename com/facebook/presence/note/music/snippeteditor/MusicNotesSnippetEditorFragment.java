package com.facebook.presence.note.music.snippeteditor;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.53P;
import X.7zQ;
import X.7zS;
import X.8Zv;
import X.9De;
import X.AQp;
import X.AVs;
import X.C02A;
import X.C1s0;
import X.C37s;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.presence.note.music.musicpicker.model.MusicData;
import kotlin.jvm.functions.Function2;

/* loaded from: MusicNotesSnippetEditorFragment.class */
public final class MusicNotesSnippetEditorFragment extends BaseMigBottomSheetDialogFragment {
    public Function2 A00 = AVs.A00;
    public MusicData A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        LithoView lithoView = new LithoView(requireContext(), (AttributeSet) null);
        C1s0 c1s0 = new C1s0(lithoView.A09);
        c1s0.A06 = C02A.A00(null, C02A.defaultInstance, null, null, null, null, null, null, null, -129, 31, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        c1s0.A03 = new 53P(this);
        MusicData musicData = this.A01;
        if (musicData == null) {
            11T.A0L("musicData");
            throw 0Q8.createAndThrow();
        }
        c1s0.A01 = new 8Zv(A1F(), musicData, AQp.A01(this, 37), this.A00);
        7zQ.A1I(c1s0, lithoView);
        return lithoView;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(70);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        Throwable A0v;
        int i;
        Parcelable.Creator creator;
        int A02 = 0FI.A02(-1166773329);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = MusicData.class.getDeclaredField("CREATOR").get(null);
        if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
            A0v = 7zS.A0v(MusicData.class);
            i = 1020510446;
        } else {
            Parcelable A0K = 7zQ.A0K(requireArguments, creator, MusicData.class, "music_data");
            if (A0K != null) {
                this.A01 = (MusicData) A0K;
                0FI.A08(-484939129, A02);
                return;
            } else {
                A0v = 1BK.A0h();
                i = 1513510577;
            }
        }
        0FI.A08(i, A02);
        throw A0v;
    }
}
