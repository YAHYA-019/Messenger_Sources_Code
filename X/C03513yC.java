package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.presence.api.model.NoteTypeEnum;
import com.facebook.presence.note.audience.util.NotesAudienceControlType;
import com.facebook.proxygen.TraceFieldType;
import java.util.List;

/* renamed from: X.3yC, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3yC.class */
public final class C03513yC {
    public String A00;
    public EnumC03533yL A01;
    public NoteTypeEnum A02;
    public Long A03;
    public Long A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;

    public C03513yC(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A05 = 1Bq.A00(16634);
        this.A07 = 1Bq.A00(67984);
        this.A06 = 1Lm.A01(fbUserSession, 68391);
    }

    public static final int A00(NotesAudienceControlType notesAudienceControlType) {
        int ordinal = notesAudienceControlType.ordinal();
        int i = 1;
        if (ordinal != 0) {
            i = 2;
            if (ordinal != 1) {
                i = 3;
                if (ordinal != 2) {
                    i = 4;
                    if (ordinal != 3) {
                        throw new RuntimeException();
                    }
                }
            }
        }
        return i;
    }

    public static final void A01(EnumC03533yL enumC03533yL, C03513yC c03513yC, Long l, int i, int i2, int i3, int i4, int i5) {
        1UG A00 = 1UD.A00((04J) c03513yC.A05.A00.get(), 1ZG.A01, "msgr_note_events");
        NoteTypeEnum noteTypeEnum = c03513yC.A02;
        List list = null;
        if (noteTypeEnum != null) {
            list = C4L3.A00(noteTypeEnum, null, false);
        }
        String str = c03513yC.A00;
        if (A00.isSampled()) {
            int i6 = (-1) << (-1);
            if (i != i6) {
                A00.A5q("event", Integer.valueOf(i));
            } else {
                A00.A7R("event", (String) null);
            }
            A00.A5q(TraceFieldType.SessionType, Integer.valueOf(i2));
            if (enumC03533yL == null) {
                enumC03533yL = c03513yC.A01;
                if (enumC03533yL == null) {
                    enumC03533yL = EnumC03533yL.AN_TRAY;
                }
            }
            A00.A5c(enumC03533yL, "entry_point");
            A00.A7R("msgr_note_session_id", str);
            A00.A6H("note_id", c03513yC.A03);
            A00.A5H("active_status", Boolean.valueOf(((1X6) c03513yC.A07.A00.get()).A07()));
            A00.A7h("note_content_types", list);
            if (i3 != i6) {
                A00.A5q("audience", Integer.valueOf(i3));
            } else {
                A00.A7R("audience", (String) null);
            }
            if (i4 != i6) {
                A00.A5q("audience_controls_click_target", Integer.valueOf(i4));
            } else {
                A00.A7R("audience_controls_click_target", (String) null);
            }
            if (i5 != i6) {
                A00.A5q("conversion_type", Integer.valueOf(i5));
            } else {
                A00.A7R("conversion_type", (String) null);
            }
            A00.A6H("song_video_id", l);
            A00.BZL();
        }
    }

    public static final void A02(C03513yC c03513yC, int i) {
        int i2 = (-1) << (-1);
        A01(null, c03513yC, null, i, 0, i2, i2, i2);
    }

    public final void A03() {
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public final void A04(int i) {
        int i2 = (-1) << (-1);
        A01(null, this, null, 16, 0, i2, i, i2);
    }

    public final void A05(long j, int i) {
        if (this.A04 == null) {
            Long valueOf = Long.valueOf(j);
            this.A04 = valueOf;
            int i2 = (-1) << (-1);
            A01(null, this, valueOf, 24, i, i2, i2, i2);
        }
    }

    public final void A06(long j, int i) {
        Long l = this.A04;
        if (l == null || l.longValue() != j) {
            return;
        }
        int i2 = (-1) << (-1);
        A01(null, this, Long.valueOf(j), 25, i, i2, i2, i2);
        this.A04 = null;
    }

    public final void A07(EnumC03533yL enumC03533yL, int i) {
        int i2 = (-1) << (-1);
        A01(enumC03533yL, this, null, 12, 2, i2, i2, i);
    }

    public final void A08(EnumC03533yL enumC03533yL, NoteTypeEnum noteTypeEnum, Long l, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        11T.A0F(enumC03533yL, 0);
        if (z2) {
            this.A00 = C04I.A00().toString();
            this.A01 = enumC03533yL;
        } else {
            this.A00 = null;
        }
        this.A03 = l;
        this.A02 = noteTypeEnum;
        if (z) {
            i2 = A00(((C9h6) this.A06.A00.get()).A00());
            i3 = (-1) << (-1);
            i4 = i3;
        } else {
            i2 = (-1) << (-1);
            float f = -0.0f;
            i3 = i2;
            i4 = i2;
        }
        A01(enumC03533yL, this, null, 0, i, i2, i3, i4);
    }

    public final void A09(NoteTypeEnum noteTypeEnum, Long l) {
        if (l != null) {
            this.A03 = l;
        }
        if (noteTypeEnum != null) {
            this.A02 = noteTypeEnum;
        }
        int i = (-1) << (-1);
        A01(null, this, null, 11, 2, i, i, i);
    }
}
