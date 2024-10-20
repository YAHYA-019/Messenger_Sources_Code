package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.fbui.widget.glyph.GlyphButton;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.payments.p2p.ui.P2pPaymentMemoView;
import com.facebook.smartcapture.logging.MC;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: E60.class */
public final class E60 extends Ezy {
    public Context A00;
    public 1pK A01;
    public P2pPaymentData A02;
    public RQD A03;
    public P2pPaymentMemoView A04;
    public final E5z A06 = (E5z) 1Bn.A0A(99172);
    public final C00i A08 = 1BQ.A00();
    public final C00i A05 = 1BV.A00(115935);
    public final 6Gx A07 = DKD.A0Z();
    public final EfH A09 = new EfH(this);

    @Override // X.Ezy
    public View A0D(Context context, ViewGroup viewGroup) {
        return this.A04;
    }

    @Override // X.Ezy
    public void A0F(Context context, Bundle bundle, 1pK r304, RQD rqd, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, RSI rsi) {
        super.A00 = true;
        this.A00 = context;
        this.A01 = r304;
        this.A02 = p2pPaymentData;
        this.A03 = rqd;
        E5z e5z = this.A06;
        e5z.A0F(context, bundle, r304, rqd, p2pPaymentConfig, p2pPaymentData, rsi);
        P2pPaymentMemoView p2pPaymentMemoView = e5z.A04;
        this.A04 = p2pPaymentMemoView;
        if (p2pPaymentMemoView != null) {
            GlyphButton glyphButton = p2pPaymentMemoView.A06;
            C00i c00i = this.A08;
            int i = 0;
            glyphButton.setVisibility(DKG.A00(1BK.A0N(c00i).AZk(MC.android_payment.show_media_upload) ? 1 : 0));
            GlyphButton glyphButton2 = this.A04.A07;
            if (!1BK.A0N(c00i).AZk(MC.android_payment.show_theme_picker)) {
                i = 8;
            }
            glyphButton2.setVisibility(i);
            this.A04.A06.setImageResource(2132346780);
        }
        e5z.A03 = this.A09;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    @Override // X.Ezy
    public void A0H(P2pPaymentData p2pPaymentData) {
        this.A02 = p2pPaymentData;
        P2pPaymentMemoView p2pPaymentMemoView = this.A04;
        if (p2pPaymentMemoView != null) {
            MediaResource mediaResource = p2pPaymentData.A05;
            if (mediaResource != null) {
                ?? r0 = p2pPaymentMemoView.A05;
                r0.A0G(mediaResource.A0E, P2pPaymentMemoView.A0A);
                p2pPaymentMemoView.A07.setVisibility(8);
                p2pPaymentMemoView.A06.setVisibility(8);
                r0.setVisibility(0);
            }
            this.A06.A0H(p2pPaymentData);
            this.A04.A07.A02(p2pPaymentData.A03 == null ? -7829368 : FHl.A00(this.A00));
        }
    }
}
