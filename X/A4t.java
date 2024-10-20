package X;

import com.facebook.xapp.messaging.threadview.model.note.NoteMetadata;
import org.json.JSONException;

/* loaded from: A4t.class */
public final class A4t implements 5gE {
    public final C83v A00 = C83v.A00;

    public void A6W(7eH r302, 5PP r303) {
        NoteMetadata noteMetadata;
        11T.A0H(r302, r303);
        if (!(r303 instanceof NoteMetadata) || (noteMetadata = (NoteMetadata) r303) == null) {
            return;
        }
        try {
            r302.A00.put("note_metadata", noteMetadata.A00.A00);
        } catch (JSONException unused) {
        }
    }

    public /* bridge */ /* synthetic */ C5g3 Asj() {
        return this.A00;
    }
}
