package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.recyclerview.BetterRecyclerView;
import com.google.common.collect.ImmutableList;

/* loaded from: I2a.class */
public final class I2a {
    public View A00;
    public TriState A01;
    public CircularArtPickerView A02;
    public boolean A03;
    public boolean A04;
    public final ViewGroup A05;
    public final FbUserSession A06;
    public final HtG A07;

    public I2a(ViewGroup viewGroup, FbUserSession fbUserSession, HtG htG) {
        11T.A0F(fbUserSession, 1);
        this.A06 = fbUserSession;
        this.A05 = viewGroup;
        this.A07 = htG;
        this.A01 = TriState.UNSET;
    }

    public static final void A00(I2a i2a) {
        HeC heC;
        ImmutableList of;
        CircularArtPickerView circularArtPickerView = i2a.A02;
        if (circularArtPickerView != null) {
            I3t i3t = circularArtPickerView.A0H;
            if (i3t != null) {
                TriState triState = i2a.A01;
                if (triState.isSet() && i3t.A06 == triState.asBoolean()) {
                    return;
                }
            }
            if (i2a.A04) {
                heC = new HeC();
                heC.A00 = HAD.A03;
                of = ImmutableList.of((Object) "2537180659653483");
            } else {
                TriState triState2 = i2a.A01;
                if (!triState2.isSet()) {
                    return;
                }
                heC = new HeC();
                heC.A00 = HAD.A03;
                of = ImmutableList.of(triState2.asBoolean(false) ? "394683184533797" : "1343613402464599");
                heC.A02 = i2a.A01.asBoolean();
            }
            heC.A01 = of;
            circularArtPickerView.A0X(i2a.A06, new I3t(heC));
        }
    }

    public final void A01() {
        CircularArtPickerView circularArtPickerView = this.A02;
        if (circularArtPickerView != null) {
            circularArtPickerView.A0H = null;
            CustomLinearLayout customLinearLayout = circularArtPickerView.A0M;
            if (customLinearLayout != null) {
                customLinearLayout.setVisibility(0);
            }
            BetterRecyclerView betterRecyclerView = circularArtPickerView.A0i;
            if (betterRecyclerView != null) {
                betterRecyclerView.setVisibility(4);
            }
            circularArtPickerView.A0N = false;
            View view = circularArtPickerView.A02;
            if (view != null) {
                view.setSelected(false);
            }
            circularArtPickerView.A02 = null;
            this.A03 = false;
            this.A01 = TriState.UNSET;
        }
    }
}
