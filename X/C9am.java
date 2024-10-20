package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.presence.note.ui.creation.NotesCreationFragment;
import com.facebook.presence.note.ui.creation.NotesMentionsContactLoader$load$1;
import java.util.List;

/* renamed from: X.9am, reason: invalid class name */
/* loaded from: 9am.class */
public final class C9am {
    public final /* synthetic */ 8LZ A00;
    public final /* synthetic */ NotesCreationFragment A01;

    public C9am(8LZ r302, NotesCreationFragment notesCreationFragment) {
        this.A01 = notesCreationFragment;
        this.A00 = r302;
    }

    public void A00() {
        NotesCreationFragment notesCreationFragment = this.A01;
        notesCreationFragment.A0F = null;
        C2a2 c2a2 = ((9T1) notesCreationFragment.A0L.getValue()).A00;
        if (c2a2 != null) {
            c2a2.AE0(null);
        }
        8LZ r0 = this.A00;
        NotesCreationFragment.A06(8LZ.A00(r0.A01, r0.A00, (List) null, r0.A03, r0.A04, r0.A05), notesCreationFragment);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.presence.note.ui.creation.NotesCreationFragment, androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    public void A01(int i, String str) {
        11T.A0F(str, 1);
        ?? r0 = this.A01;
        03Y r02 = r0.A0F;
        if (r02 != null && AnonymousClass001.A03(r02.first) == i) {
            Object obj = null;
            03Y r03 = r0.A0F;
            if (r03 != null) {
                obj = r03.second;
            }
            if (11T.A0O(obj, str)) {
                return;
            }
        }
        r0.A0F = 1BK.A1G(Integer.valueOf(i), str);
        9T1 r04 = (9T1) r0.A0L.getValue();
        Context context = r0.A02;
        if (context == null) {
            11T.A0L("context");
            throw 0Q8.createAndThrow();
        }
        LifecycleCoroutineScope A0J = 7zO.A0J((LifecycleOwner) r0);
        String A0A = 0CU.A0A("@", str);
        83T A01 = 83T.A01((Object) r0, this.A00, 16);
        7zP.A1U(r04.A00);
        r04.A00 = 7zM.A1G(2Zo.A00(), new NotesMentionsContactLoader$load$1(context, r04, A0A, null, A01), A0J);
    }
}
