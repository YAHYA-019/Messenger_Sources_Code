package X;

import android.view.View;
import com.facebook.xapp.messaging.events.common.threadview.OnXmaCtaClicked;

/* renamed from: X.9zo, reason: invalid class name */
/* loaded from: 9zo.class */
public final class C9zo implements 7La {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9zo(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public final void BoZ(View view, 1Iw r303, 7Lj r304, 7LX r305) {
        C5n8 c5n8;
        C5vw c5vw;
        1Va r312;
        OnXmaCtaClicked onXmaCtaClicked;
        switch (this.A00) {
            case 0:
                C8h4 c8h4 = (C8h4) this.A02;
                int i = C8h4.A07;
                c8h4.A03.invoke();
                return;
            case 1:
                FEc fEc = (FEc) this.A01;
                RUW ruw = (RUW) this.A02;
                FEc.A01(view, ruw.A00, ruw, fEc, FEc.A00(ruw));
                return;
            case 2:
                11T.A0F(view, 1);
                8bY r0 = (8bY) this.A02;
                c5n8 = r0.A01;
                c5vw = (C5vw) ((C82j) this.A01).A01;
                if (!r0.A02.Boe(view, c5vw, c5n8)) {
                    0fH.A0o("LiveLocationCustomTemplateXmaComponent", 7zT.A0y(c5vw));
                }
                r312 = r0.A00;
                onXmaCtaClicked = new OnXmaCtaClicked(c5vw, c5n8, null);
                r312.CZm(onXmaCtaClicked);
                return;
            case 3:
                11T.A0F(view, 1);
                8eD r02 = (8eD) this.A02;
                C5fv c5fv = r02.A02;
                C5vw c5vw2 = (C5vw) ((C82j) this.A01).A01;
                11T.A0I(c5fv, "null cannot be cast to non-null type com.facebook.xapp.messaging.threadview.model.xma.XmaMessage");
                C5n8 c5n82 = (C5n8) c5fv;
                if (!r02.A04.Boe(view, c5vw2, c5n82)) {
                    0fH.A0o("StandardGenericCustomTemplateXmaRenderer", 7zT.A0y(c5vw2));
                }
                r312 = r02.A01;
                onXmaCtaClicked = new OnXmaCtaClicked(c5vw2, c5n82, null);
                r312.CZm(onXmaCtaClicked);
                return;
            case 4:
                11T.A0F(view, 1);
                AAX aax = (AAX) this.A02;
                c5n8 = (C5n8) this.A01;
                c5vw = c5n8.A03;
                0fH.A0j("SharedStackXmaRenderer", AnonymousClass001.A0Z(c5vw, "Click CTA: ", AnonymousClass001.A0k()));
                if (!aax.A02.Boe(view, c5vw, c5n8)) {
                    0fH.A0o("SharedStackXmaRenderer", 7zT.A0y(c5vw));
                }
                r312 = aax.A01;
                onXmaCtaClicked = new OnXmaCtaClicked(c5vw, c5n8, null);
                r312.CZm(onXmaCtaClicked);
                return;
            case 5:
                11T.A0F(view, 1);
                AAi aAi = (AAi) this.A02;
                C5n8 c5n83 = (C5n8) this.A01;
                AAi.A01(view, c5n83.A03, c5n83, aAi);
                return;
            default:
                11T.A0F(view, 1);
                AAh aAh = (AAh) this.A02;
                C5n8 c5n84 = (C5n8) this.A01;
                AAh.A00(view, c5n84.A03, c5n84, aAh, (Integer) null);
                return;
        }
    }
}
