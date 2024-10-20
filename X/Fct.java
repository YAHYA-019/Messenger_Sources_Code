package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Fct.class */
public final class Fct implements 2TV {
    public final /* synthetic */ 7lT A00;
    public final /* synthetic */ 6Gh A01;
    public final /* synthetic */ boolean A02;

    public Fct(7lT r302, 6Gh r303, boolean z) {
        this.A01 = r303;
        this.A00 = r302;
        this.A02 = z;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        C7om c7om = (C7om) obj;
        Throwable th = (Throwable) obj2;
        11T.A0H(c7om, th);
        6Gh r0 = this.A01;
        7zP.A0N(r0.A09).Ciz(new G0O(r0));
        1Br.A04(r0.A06).softReport("ViewStickerPackHandlerImpl", 0Pz.A0X("View sticker pack failed (id = ", c7om.A00, ')'), th);
    }

    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
        ES0 es0 = (ES0) obj2;
        11T.A0F(es0, 1);
        6Gh r0 = this.A01;
        7zP.A0N(r0.A09).Ciz(new G54(this.A00, r0, es0, this.A02));
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
        6Gh r0 = this.A01;
        7zP.A0N(r0.A09).Ciz(new G0P(r0));
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
    }
}
