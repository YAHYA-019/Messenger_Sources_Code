package X;

import androidx.lifecycle.Lifecycle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9tz, reason: invalid class name */
/* loaded from: 9tz.class */
public final class C9tz implements AZF {
    public Aav A00;
    public final Function1 A01;
    public final Lifecycle A02;
    public final FbUserSession A03;

    public C9tz(Lifecycle lifecycle, FbUserSession fbUserSession, Function1 function1) {
        1BL.A1H(lifecycle, fbUserSession, function1);
        this.A02 = lifecycle;
        this.A03 = fbUserSession;
        this.A01 = function1;
        this.A00 = ((82O) 7zN.A0k(FbInjector.A00(), 906)).A07(this);
    }

    public final void A00() {
        0fH.A0j("StoryTrayDataLoader", "start");
        this.A00.D1D(this.A03);
    }

    public final void A01() {
        0fH.A0j("StoryTrayDataLoader", "stop");
        this.A00.D2b(this.A03);
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
        0fH.A0j("StoryTrayDataLoader", AnonymousClass001.A0a(num, A0x));
        9CX.A00(Lifecycle.State.RESUMED, this.A02, AQg.A00(this, c9u3, 48), 2Zo.A04(false));
    }
}
