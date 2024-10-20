package X;

import android.content.Context;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import java.util.List;

/* renamed from: X.879, reason: invalid class name */
/* loaded from: 879.class */
public final class AnonymousClass879 implements AnonymousClass703 {
    public final C6ze A00;
    public final C71b A01;
    public final C6yo A02;
    public final 6yJ A03;
    public final 7Jt A04;
    public final 6oP A05;
    public final 6oN A06;
    public final C66e A07;
    public final 0Be A08;
    public final boolean A09;

    public AnonymousClass879(C71b c71b, C6yo c6yo, 6yJ r304, 7Jt r305, 6oP r306, 6oN r307, C66e c66e, 0Be r309, boolean z) {
        11T.A0F(c71b, 8);
        this.A03 = r304;
        this.A07 = c66e;
        this.A04 = r305;
        this.A09 = z;
        this.A05 = r306;
        this.A06 = r307;
        this.A02 = c6yo;
        this.A01 = c71b;
        this.A08 = r309;
        this.A00 = C6ze.A0R;
    }

    @Override // X.AnonymousClass703
    public /* bridge */ /* synthetic */ C6zf B77() {
        return this.A00;
    }

    @Override // X.AnonymousClass703
    public 1LI Cfc(C1qb c1qb, C5j5 c5j5, 5vW r304, List list, int i) {
        4YV.A1N(c1qb, r304);
        C5v9 c5v9 = (C5v9) ((5vV) r304).A00;
        C85t A00 = 7Jz.A00(c1qb);
        Photo photo = c5v9.A00;
        A00.A1L(photo.A00);
        boolean z = c5v9.A0I;
        7Jz r0 = A00.A01;
        r0.A0T = z;
        A00.A2X(photo);
        r0.A0N = this.A07.AwG(c5v9, photo);
        r0.A0V = true;
        r0.A0E = this.A05;
        r0.A0F = this.A06;
        r0.A0U = this.A09;
        int i2 = 2131964211;
        if (c5v9.A0H) {
            i2 = 2131965756;
        }
        r0.A0J = 7zL.A12(A00, i2);
        6yJ r02 = this.A03;
        Context A0A = 7zL.A0A(c1qb);
        r0.A00 = r02.B2k(A0A);
        7Jt r03 = this.A04;
        r0.A06 = r03 != null ? r03.Aq7(c5v9) : null;
        r0.A0I = r03 != null ? Boolean.valueOf(r03.Cxf(c5v9)) : null;
        r0.A01 = r02.BIW(A0A, c5v9);
        r0.A03 = InterfaceC07034in.A04;
        A00.A0C(photo.A01);
        r0.A02 = new ContextChain((ContextChain) null, K92.__redex_internal_original_name, "VitoStickerAssetMessageRenderer");
        r0.A0B = this.A02;
        r0.A0A = this.A01;
        r0.A0C = c5v9.A04;
        r0.A0P = this.A08;
        r0.A0L = c5v9.A09;
        r0.A0M = c5v9.A0B;
        return A00.A2V();
    }
}
