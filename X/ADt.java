package X;

import com.facebook.presence.note.music.musicpicker.MusicPickerBottomSheetFragment;

/* loaded from: ADt.class */
public final class ADt implements Runnable {
    public static final String __redex_internal_original_name = "NotesCreationFragment$updateContent$creationListener$1$onMusicNoteButtonClicked$1";
    public final /* synthetic */ MusicPickerBottomSheetFragment A00;

    public ADt(MusicPickerBottomSheetFragment musicPickerBottomSheetFragment) {
        this.A00 = musicPickerBottomSheetFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MusicPickerBottomSheetFragment musicPickerBottomSheetFragment = this.A00;
        06Z r0 = musicPickerBottomSheetFragment.A01;
        if (r0 != null && r0.A0b("MusicPickerBottomSheetFragment") == null && C0D1.A01(r0)) {
            musicPickerBottomSheetFragment.A0m(r0, "MusicPickerBottomSheetFragment");
        }
    }
}
