package X;

import android.view.View;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: Cws.class */
public final class Cws implements AnonymousClass553 {
    public final /* synthetic */ BrU A00;
    public final /* synthetic */ Capabilities A01;
    public final /* synthetic */ 6O9 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public Cws(BrU brU, Capabilities capabilities, 6O9 r304, String str, String str2) {
        this.A00 = brU;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = capabilities;
        this.A02 = r304;
    }

    @Override // X.AnonymousClass553
    public final void onClick(View view) {
        11T.A0F(view, 0);
        BrU brU = this.A00;
        CNm cNm = (CNm) 1Br.A0B(brU.A01);
        String str = this.A03;
        1qI r0 = (1qI) 1Br.A0B(brU.A00);
        String str2 = this.A04;
        cNm.A02(4YU.A1Y(this.A01, 243) ? BO0.A02 : BO0.A01, r0.A0S(str2) ? BOj.A0E : BOj.A0K, str);
        this.A02.Bm1(view, str2, 35);
    }
}
