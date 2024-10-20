package X;

import androidx.lifecycle.Lifecycle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9ty, reason: invalid class name */
/* loaded from: 9ty.class */
public final class C9ty implements AZF {
    public Aav A00;
    public final Function1 A01;
    public final Lifecycle A02;
    public final FbUserSession A03;

    public C9ty(Lifecycle lifecycle, FbUserSession fbUserSession, Function1 function1) {
        11T.A0F(lifecycle, 1);
        this.A02 = lifecycle;
        this.A03 = fbUserSession;
        this.A01 = function1;
        this.A00 = ((82O) 7zN.A0k(FbInjector.A00(), 906)).A07(this);
    }

    public final void A00() {
        0fH.A0j("HTImmersiveMontageActiveNowCoordinator", "start");
        if (1BL.A0Q().AZk(36325759648158663L)) {
            this.A00.D1D(this.A03);
        }
    }

    public final void A01() {
        0fH.A0j("HTImmersiveMontageActiveNowCoordinator", "stop");
        if (1BL.A0Q().AZk(36325759648158663L)) {
            this.A00.D2b(this.A03);
        }
    }

    @Override // X.AZF
    public void C46() {
        throw 0Q8.createAndThrow();
    }

    @Override // X.AZF
    public void CHn(C9u3 c9u3) {
        ImmutableList immutableList;
        StringBuilder A0x = 7zO.A0x(c9u3, 0);
        A0x.append("onResultUpdated with montage list size ");
        6BY AyI = c9u3.AyI();
        Integer num = null;
        if (AyI != null && (immutableList = AyI.A00.A00) != null) {
            num = 1BK.A0k(immutableList);
        }
        0fH.A0j("HTImmersiveMontageActiveNowCoordinator", AnonymousClass001.A0a(num, A0x));
        9CX.A00(Lifecycle.State.RESUMED, this.A02, AQg.A00(this, c9u3, 34), 2Zo.A04(false));
    }
}
