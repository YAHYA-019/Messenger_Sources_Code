package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.font.FontAsset;
import com.facebook.messaging.montage.composer.CanvasOverlayWritingPrompt;
import com.facebook.messaging.montage.util.colors.MontageBackgroundColor;
import com.facebook.messaging.photos.editing.TextStylesLayout;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Hm5.class */
public final class Hm5 {
    public final /* synthetic */ IDM A00;

    public Hm5(IDM idm) {
        this.A00 = idm;
    }

    public void A00(Hiq hiq) {
        C2766Gnj c2766Gnj;
        IQ1 iq1 = this.A00.A0G.A00;
        CallerContext callerContext = IQ1.A1m;
        iq1.A07 = hiq;
        IFl iFl = iq1.A1C;
        TextStylesLayout textStylesLayout = iFl.A0K;
        if (textStylesLayout != null) {
            textStylesLayout.A0E(hiq);
            TextStylesLayout textStylesLayout2 = iFl.A0K;
            textStylesLayout2.A01 = iFl.A09.A00() == C6x1.A06 ? (Hyw) hiq.A05.get(0) : null;
            TextStylesLayout.A02(textStylesLayout2);
        }
        if (iFl.A0A != null && iFl.A09.A00() == C6x1.A06) {
            IQ1 iq12 = iFl.A0A.A00;
            iq12.A07 = hiq;
            JOH A03 = iq12.A1P.A03();
            if (A03 instanceof C2393Gbv) {
                IDM idm = iq12.A1J;
                C2776Gnt c2776Gnt = idm.A03;
                if (c2776Gnt != null && (c2766Gnj = c2776Gnt.A00) != null) {
                    MontageBackgroundColor montageBackgroundColor = ((I2E) c2766Gnj.A04.get()).A01;
                    C2766Gnj.A01(c2766Gnj, montageBackgroundColor);
                    JOH A032 = c2766Gnj.A05.A00.A0G.A00.A1P.A03();
                    if (A032 instanceof C2393Gbv) {
                        ((C2393Gbv) A032).A1Y(montageBackgroundColor);
                    }
                }
                CanvasOverlayWritingPrompt canvasOverlayWritingPrompt = idm.A04;
                if (canvasOverlayWritingPrompt != null) {
                    FontAsset fontAsset = hiq.A04;
                    if (canvasOverlayWritingPrompt.A00 != null) {
                        ListenableFuture A00 = ((4tF) canvasOverlayWritingPrompt.A02.get()).A00(fontAsset);
                        canvasOverlayWritingPrompt.A01 = A00;
                        1Kd.A0D(canvasOverlayWritingPrompt.A03, Ini.A01(canvasOverlayWritingPrompt, 18), A00);
                    }
                }
                C2393Gbv c2393Gbv = (C2393Gbv) A03;
                c2393Gbv.A1Y(((I2E) 1Br.A0B(c2393Gbv.A05)).A01);
            }
        }
        IFl.A08(iFl, (Hyw) hiq.A05.get(0), hiq);
    }
}
