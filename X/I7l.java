package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: I7l.class */
public final class I7l {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 2Wo A07;
    public final String A08;
    public final C00m A09;
    public final MigColorScheme A0A;
    public final C00m A0B;

    public I7l(FbUserSession fbUserSession, MigColorScheme migColorScheme, 2Wo r304, String str, C00m c00m, C00m c00m2) {
        1BL.A1G(migColorScheme, fbUserSession);
        this.A08 = str;
        this.A07 = r304;
        this.A09 = c00m;
        this.A0B = c00m2;
        this.A0A = migColorScheme;
        this.A00 = fbUserSession;
        this.A03 = 1Lm.A00(4YU.A08(r304.A01()), fbUserSession, 68552);
        this.A02 = 1Lm.A00(4YU.A08(r304.A01()), fbUserSession, 99475);
        this.A01 = 1Lm.A00(4YU.A08(r304.A01()), fbUserSession, 98492);
        this.A06 = 1Bu.A01(4YU.A08(r304.A01()), 114938);
        this.A05 = GOo.A0L();
        this.A04 = 1Bu.A00(85206);
    }

    public static final 8hG A00(I7l i7l, boolean z, boolean z2) {
        ImmutableList immutableList = ((Bgq) 1Br.A0B(i7l.A04)).A00;
        MigColorScheme migColorScheme = i7l.A0A;
        IYi iYi = new IYi(i7l);
        IY9 iy9 = new IY9(i7l);
        J9u j9u = new J9u(i7l, 47);
        1Br.A0C(i7l.A05);
        return new 8hG(iy9, iYi, migColorScheme, immutableList, j9u, i7l.A0B, z, z2);
    }

    public static final void A01(View view) {
        try {
            view.performHapticFeedback(3);
        } catch (IllegalArgumentException e) {
            4YV.A0G().softReport("EmojiReactionTrayDisplayer", "Unable to perform haptic feedback", e);
        }
    }
}
