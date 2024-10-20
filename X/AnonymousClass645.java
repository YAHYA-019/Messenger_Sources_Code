package X;

import android.content.Context;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.645, reason: invalid class name */
/* loaded from: 645.class */
public final class AnonymousClass645 implements C15h {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ 1Iw A01;
    public final /* synthetic */ 5zD A02;
    public final /* synthetic */ 63D A03;
    public final /* synthetic */ C62q A04;
    public final /* synthetic */ 63J A05;
    public final /* synthetic */ AnonymousClass622 A06;
    public final /* synthetic */ 6ML A07;
    public final /* synthetic */ C5un A08;
    public final /* synthetic */ Capabilities A09;

    public AnonymousClass645(06Z r302, 1Iw r303, 5zD r304, 63D r305, C62q c62q, 63J r307, AnonymousClass622 anonymousClass622, 6ML r309, C5un c5un, Capabilities capabilities) {
        this.A05 = r307;
        this.A01 = r303;
        this.A00 = r302;
        this.A02 = r304;
        this.A09 = capabilities;
        this.A03 = r305;
        this.A06 = anonymousClass622;
        this.A04 = c62q;
        this.A07 = r309;
        this.A08 = c5un;
    }

    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        63K r0 = this.A05.A0M;
        Context context = this.A01.A0D;
        06Z r02 = this.A00;
        5zD r03 = this.A02;
        Capabilities capabilities = this.A09;
        63D r04 = this.A03;
        AnonymousClass622 anonymousClass622 = this.A06;
        C62q c62q = this.A04;
        return 63K.A00(context, r02, r0.A01, r03, r04, c62q, r0, anonymousClass622, this.A07, c62q, this.A08, capabilities, 0S2.A0C);
    }
}
