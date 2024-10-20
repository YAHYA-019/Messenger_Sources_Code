package X;

import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView;

/* loaded from: Iqn.class */
public final class Iqn implements Runnable {
    public static final String __redex_internal_original_name = "CircularPickerInitializerImpl$applyFeaturedArtSectionCollapsed$1";
    public final /* synthetic */ IWV A00;

    public Iqn(IWV iwv) {
        this.A00 = iwv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I3t i3t;
        IWV iwv = this.A00;
        C6x4 Afb = iwv.A03.Afb();
        if (Afb == C6x4.A07 || Afb == C6x4.A06 || iwv.A04.BJI() == 0S2.A01) {
            return;
        }
        iwv.A05.CzY();
        IFl iFl = iwv.A01;
        IFl.A0A(iFl, HAq.A02);
        if (IFl.A0H(iFl)) {
            IFl.A04(iFl.A0j, iFl);
            CircularArtPickerView circularArtPickerView = iFl.A0C;
            if (circularArtPickerView == null || (i3t = circularArtPickerView.A0H) == null || !09K.A00(i3t.A01)) {
                CircularArtPickerView circularArtPickerView2 = iFl.A0C;
                HeC heC = new HeC();
                heC.A00 = HAD.A02;
                circularArtPickerView2.A0X(iFl.A0b, new I3t(heC));
            }
            IFl.A06(iFl);
        }
    }
}
