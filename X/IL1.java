package X;

import android.view.ViewTreeObserver;
import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerCallToActionButton;
import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerItemDescriptionView;
import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerResetButton;
import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.recyclerview.BetterRecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: IL1.class */
public final class IL1 implements ViewTreeObserver.OnPreDrawListener {
    public final WeakReference A00;
    public final WeakReference A01;
    public final WeakReference A02;
    public final WeakReference A03;
    public final WeakReference A04;
    public final WeakReference A05;
    public final /* synthetic */ CircularArtPickerView A06;

    public IL1(CircularArtPickerCallToActionButton circularArtPickerCallToActionButton, CircularArtPickerItemDescriptionView circularArtPickerItemDescriptionView, CircularArtPickerResetButton circularArtPickerResetButton, CircularArtPickerView circularArtPickerView, JMN jmn, CustomLinearLayout customLinearLayout, BetterRecyclerView betterRecyclerView) {
        this.A06 = circularArtPickerView;
        this.A05 = 7zL.A14(jmn);
        this.A03 = 7zL.A14(betterRecyclerView);
        this.A04 = 7zL.A14(circularArtPickerResetButton);
        this.A02 = 7zL.A14(customLinearLayout);
        this.A01 = 7zL.A14(circularArtPickerItemDescriptionView);
        this.A00 = 7zL.A14(circularArtPickerCallToActionButton);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        JMN jmn = (JMN) this.A05.get();
        BetterRecyclerView betterRecyclerView = (BetterRecyclerView) this.A03.get();
        CircularArtPickerResetButton circularArtPickerResetButton = (CircularArtPickerResetButton) this.A04.get();
        CustomLinearLayout customLinearLayout = (CustomLinearLayout) this.A02.get();
        CircularArtPickerItemDescriptionView circularArtPickerItemDescriptionView = (CircularArtPickerItemDescriptionView) this.A01.get();
        CircularArtPickerCallToActionButton circularArtPickerCallToActionButton = (CircularArtPickerCallToActionButton) this.A00.get();
        if (jmn == null || betterRecyclerView == null || customLinearLayout == null) {
            return true;
        }
        jmn.BJw().getViewTreeObserver().removeOnPreDrawListener(this);
        CircularArtPickerView circularArtPickerView = this.A06;
        CircularArtPickerView.A03(circularArtPickerCallToActionButton, circularArtPickerItemDescriptionView, circularArtPickerResetButton, circularArtPickerView, jmn, customLinearLayout, betterRecyclerView);
        if (((2Xd) circularArtPickerView.A07.get()).getItemCount() != 0) {
            return true;
        }
        customLinearLayout.setVisibility(0);
        return true;
    }
}
