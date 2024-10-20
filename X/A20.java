package X;

import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.presence.note.ui.creation.NotesCreationFragment;
import com.facebook.presence.note.ui.nux.NotesNuxFragment;

/* loaded from: A20.class */
public final class A20 implements AZd {
    public final /* synthetic */ NotesNuxFragment A00;

    public A20(NotesNuxFragment notesNuxFragment) {
        this.A00 = notesNuxFragment;
    }

    @Override // X.AZd
    public void BpM() {
        this.A00.A0o();
    }

    @Override // X.AZd
    public void CDp() {
        NotesNuxFragment notesNuxFragment = this.A00;
        94S r0 = MigBottomSheetDialogFragment.A01;
        1pI r02 = notesNuxFragment.A00;
        if (r02 == null || !r02.BVa()) {
            return;
        }
        NotesCreationFragment.A0V.A00(EnumC03533yL.AN_TRAY, r02);
        notesNuxFragment.A0o();
    }
}
