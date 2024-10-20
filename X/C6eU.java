package X;

import android.app.Application;
import android.content.Context;

/* renamed from: X.6eU, reason: invalid class name */
/* loaded from: 6eU.class */
public final class C6eU extends C63h implements C6eR {
    public 06Z A00;

    @Override // X.C63h
    public 1LI A05(1Iw r302, 5zD r303, 6Az r304, AnonymousClass622 anonymousClass622, 7Wh r306) {
        11T.A0F(anonymousClass622, 0);
        11T.A0F(r304, 1);
        11T.A0F(r302, 2);
        Context applicationContext = r302.A0D.getApplicationContext();
        11T.A0I(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return new 8Up(new 8D3((Application) applicationContext, this.A00, r303, r304, anonymousClass622, r306));
    }

    @Override // X.C6eR
    public void Cp5(06Z r302) {
        11T.A0F(r302, 0);
        this.A00 = r302;
    }
}
