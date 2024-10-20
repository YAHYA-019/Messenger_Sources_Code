package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView;
import com.facebook.messaging.montage.model.art.CompositionInfo;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: J3l.class */
public final /* synthetic */ class J3l implements Runnable {
    public static final String __redex_internal_original_name = "CircularArtPickerView$$ExternalSyntheticLambda0";
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ LinearLayoutManager A02;
    public final /* synthetic */ FbUserSession A03;
    public final /* synthetic */ CircularArtPickerView A04;
    public final /* synthetic */ CompositionInfo A05;
    public final /* synthetic */ EffectItem A06;

    public /* synthetic */ J3l(View view, LinearLayoutManager linearLayoutManager, FbUserSession fbUserSession, CircularArtPickerView circularArtPickerView, CompositionInfo compositionInfo, EffectItem effectItem, int i) {
        this.A04 = circularArtPickerView;
        this.A02 = linearLayoutManager;
        this.A00 = i;
        this.A01 = view;
        this.A06 = effectItem;
        this.A05 = compositionInfo;
        this.A03 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CircularArtPickerView circularArtPickerView = this.A04;
        LinearLayoutManager linearLayoutManager = this.A02;
        int i = this.A00;
        View view = this.A01;
        EffectItem effectItem = this.A06;
        CompositionInfo compositionInfo = this.A05;
        FbUserSession fbUserSession = this.A03;
        ((2Xd) circularArtPickerView.A07.get()).A09(linearLayoutManager.A1h(), i, H9B.A01);
        CircularArtPickerView.A00(view, fbUserSession, circularArtPickerView, compositionInfo, effectItem);
    }
}
