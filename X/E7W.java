package X;

import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.payments.confirmation.SecondaryActionPostPurchaseRowView;

/* loaded from: E7W.class */
public final class E7W extends DTE {
    public ETu A00;

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void A0A(GD9 gd9) {
        int i;
        GOK gok = (GOK) gd9;
        SecondaryActionPostPurchaseRowView secondaryActionPostPurchaseRowView = this.A0I;
        secondaryActionPostPurchaseRowView.A0E(this.A00);
        secondaryActionPostPurchaseRowView.A02 = gok;
        secondaryActionPostPurchaseRowView.A03.setText(gok.AVO());
        int AiQ = secondaryActionPostPurchaseRowView.A02.AiQ();
        GlyphView glyphView = secondaryActionPostPurchaseRowView.A00;
        if (AiQ <= 0) {
            i = 8;
        } else {
            glyphView.setImageResource(AiQ);
            glyphView = secondaryActionPostPurchaseRowView.A00;
            i = 0;
        }
        glyphView.setVisibility(i);
        secondaryActionPostPurchaseRowView.setOnClickListener(secondaryActionPostPurchaseRowView);
        secondaryActionPostPurchaseRowView.setEnabled(!secondaryActionPostPurchaseRowView.A02.BQM());
        secondaryActionPostPurchaseRowView.A01.setVisibility(DKG.A00(secondaryActionPostPurchaseRowView.A02.BQM() ? 1 : 0));
    }
}
