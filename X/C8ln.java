package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.stickers.model.Sticker;

/* renamed from: X.8ln, reason: invalid class name */
/* loaded from: 8ln.class */
public final class C8ln extends C1rj {
    public static final CallerContext A01 = CallerContext.A0B("StickerPreviewComponentSpec");
    public static final C06974ih A02;
    public C9xb A00;

    static {
        C07004ik A00 = C06984ii.A00();
        A00.A0J = true;
        A00.A00(InterfaceC07034in.A04);
        A00.A01(2132345116);
        A02 = 7zL.A0L(A00);
    }

    public C8ln() {
        super("StickerPreviewComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5Bc r303;
        C9xb c9xb = this.A00;
        7Qb r0 = (7Qb) 1Bn.A0E(r302.A0D, (1BY) null, 50201);
        C1rq A012 = C1rg.A01(r302, null, 0);
        Sticker sticker = c9xb.A00;
        5BH A013 = 5BG.A01(r302);
        A013.A2Z(A02);
        A013.A0z(80.0f);
        A013.A0l(80.0f);
        2Dp[] A06 = 6Bl.A03(sticker) ? r0.A06(sticker) : r0.A09(sticker, new C6qc(null, null, null, null, null, null, null, 255, 0, false, false, true, false, true, false));
        if (A06 == null) {
            r303 = null;
        } else {
            int length = A06.length;
            5BO[] r02 = new 5BO[length];
            for (int i = 0; i < length; i++) {
                r02[i] = 5BL.A01(A06[i]);
            }
            r303 = new 5Bc(r02);
        }
        A013.A2a(r303);
        A013.A2b(A01);
        7zO.A1B(A013, A012);
        return A012.A00;
    }
}
