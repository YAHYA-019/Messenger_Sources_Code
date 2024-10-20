package X;

import com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayContainerView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Gmj, reason: case insensitive filesystem */
/* loaded from: Gmj.class */
public final class C2734Gmj extends H4B {
    public 5zD A00;
    public SwipeableMediaTrayContainerView A01;
    public MigColorScheme A02;

    @Override // X.H4B
    public void A0X() {
        super.A0X();
        this.A01.A0W();
    }

    @Override // X.H4B
    public void A0Z() {
        super.A0Z();
        this.A01.A0X();
    }

    @Override // X.H4B
    public void A0f(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 0);
        if (11T.A0O(this.A02, migColorScheme)) {
            return;
        }
        super.A0f(migColorScheme);
        this.A02 = migColorScheme;
        AbH.A1K(this.A01, migColorScheme.Amg());
    }
}
