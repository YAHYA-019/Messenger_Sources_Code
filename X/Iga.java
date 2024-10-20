package X;

import com.facebook.stickers.model.Sticker;

/* loaded from: Iga.class */
public final class Iga implements JGZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Iga(1Br r302, 1Br r303, 64W r304, int i) {
        this.A00 = i;
        this.A01 = r304;
        this.A03 = r302;
        this.A02 = r303;
    }

    public void C0J(Sticker sticker, String str, int i, boolean z) {
        int i2 = this.A00;
        ((64W) this.A01).ClD(sticker, C5es.A0Q);
        ((Hpb) 7zO.A0p(this.A03)).A00(sticker, new Igm(this.A02, i2 != 0 ? 2 : 1));
    }
}
