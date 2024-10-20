package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.presence.note.ui.creation.NotesCreationFragment;

/* loaded from: A1w.class */
public final class A1w implements AaB {
    public final /* synthetic */ 8Gd A00;

    public A1w(8Gd r302) {
        this.A00 = r302;
    }

    public void Bt1() {
        8Gd r0 = this.A00;
        RichStatus richStatus = r0.A03;
        if (richStatus != null) {
            FbUserSession fbUserSession = r0.A00;
            if (fbUserSession == null) {
                7zL.A1C();
                throw 0Q8.createAndThrow();
            }
            C86 c86 = (C86) 7zN.A0m(r0, fbUserSession, 68440);
            AC8.A03(c86.A01(null, richStatus.A04), r0, 7zQ.A14(), 55);
        }
    }

    public void Bx3() {
        8Gd.A03(this.A00);
    }

    public void C8y() {
        8Gd r0 = this.A00;
        1pI r02 = r0.A01;
        if (r02 != null) {
            if (!r02.BVa()) {
                return;
            }
            8Gd.A03(r0);
            9Wa r03 = NotesCreationFragment.A0V;
            1pI r04 = r0.A01;
            if (r04 != null) {
                r03.A00(EnumC03533yL.AN_TRAY, r04);
                return;
            }
        }
        11T.A0L("contentViewManager");
        throw 0Q8.createAndThrow();
    }
}
