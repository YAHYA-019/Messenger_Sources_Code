package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.presence.note.audience.util.NotesAudienceControlType;

/* renamed from: X.9h6, reason: invalid class name */
/* loaded from: 9h6.class */
public final class C9h6 {
    public static final 1G9 A02;
    public static final 1G9 A03;
    public static final 1G9 A04;
    public final FbUserSession A00;
    public final 1Br A01;

    static {
        1G9 r0 = 1G0.A0C;
        A04 = r0.A0F("notes_selected_audience");
        A03 = r0.A0F("notes_custom_audience_count");
        A02 = r0.A0F("notes_blocked_audience_count");
    }

    public C9h6(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
        this.A01 = 1BK.A0E();
    }

    public final NotesAudienceControlType A00() {
        FbSharedPreferences A09 = 1Br.A09(this.A01);
        1G9 A05 = 1G9.A05(A04, this.A00.A02);
        NotesAudienceControlType notesAudienceControlType = NotesAudienceControlType.A04;
        Integer valueOf = Integer.valueOf(A09.ArU(A05, notesAudienceControlType.value));
        NotesAudienceControlType[] values = NotesAudienceControlType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return notesAudienceControlType;
            }
            NotesAudienceControlType notesAudienceControlType2 = values[i2];
            int i3 = notesAudienceControlType2.value;
            if (valueOf != null && i3 == valueOf.intValue()) {
                return notesAudienceControlType2;
            }
            i = i2 + 1;
        }
    }
}
