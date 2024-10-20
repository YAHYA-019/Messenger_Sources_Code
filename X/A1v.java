package X;

import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.presence.note.ui.consumption.NoteSelfViewerFragment;
import com.facebook.presence.note.ui.creation.NotesCreationFragment;

/* loaded from: A1v.class */
public final class A1v implements AaB {
    public final /* synthetic */ NoteSelfViewerFragment A00;

    public A1v(NoteSelfViewerFragment noteSelfViewerFragment) {
        this.A00 = noteSelfViewerFragment;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.presence.note.ui.consumption.NoteSelfViewerFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    public void Bt1() {
        String str;
        ?? r0 = this.A00;
        C03513yC A05 = NoteSelfViewerFragment.A05(r0);
        int i = (-1) << (-1);
        C03513yC.A01(null, A05, null, 8, 4, i, i, i);
        7zP.A0e(((9LW) 1Bn.A0A(68398)).A00).markerEnd(91365276, (short) 2);
        FbUserSession fbUserSession = r0.A00;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            C86 c86 = (C86) 7zN.A0m((Fragment) r0, fbUserSession, 68440);
            RichStatus richStatus = r0.A02;
            if (richStatus != null) {
                AC8.A03(c86.A01(null, richStatus.A04), r0, 7zQ.A14(), 54);
                return;
            }
            str = "richStatus";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void Bx3() {
        this.A00.A0o();
        94S r0 = MigBottomSheetDialogFragment.A01;
        7zP.A0e(((9LW) 1Bn.A0A(68398)).A00).markerEnd(91365276, (short) 4);
    }

    public void C8y() {
        NoteSelfViewerFragment noteSelfViewerFragment = this.A00;
        94S r0 = MigBottomSheetDialogFragment.A01;
        7zP.A0e(((9LW) 1Bn.A0A(68398)).A00).markerEnd(91365276, (short) 2);
        C03513yC.A02(NoteSelfViewerFragment.A05(noteSelfViewerFragment), 5);
        noteSelfViewerFragment.A04 = false;
        1pI r02 = noteSelfViewerFragment.A01;
        if (r02 == null || !r02.BVa()) {
            return;
        }
        NotesCreationFragment.A0V.A00(EnumC03533yL.AN_TRAY, r02);
        noteSelfViewerFragment.A0o();
    }
}
