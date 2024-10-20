package X;

import com.facebook.presence.api.model.NoteTypeEnum;
import com.facebook.ui.emoji.model.Emoji;
import java.util.List;

/* renamed from: X.As7, reason: case insensitive filesystem */
/* loaded from: As7.class */
public final class C1773As7 extends C04v {
    public final long A00;
    public final NoteTypeEnum A01;
    public final Emoji A02;
    public final Integer A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C1773As7(NoteTypeEnum noteTypeEnum, Emoji emoji, Integer num, Long l, Long l2, String str, String str2, String str3, String str4, String str5, List list, long j, boolean z, boolean z2, boolean z3) {
        this.A02 = emoji;
        this.A0A = str;
        this.A00 = j;
        this.A0D = z;
        this.A01 = noteTypeEnum;
        this.A04 = l;
        this.A09 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A05 = l2;
        this.A06 = str5;
        this.A03 = num;
        this.A0E = z2;
        this.A0C = z3;
        this.A0B = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1773As7)) {
                return false;
            }
            C1773As7 c1773As7 = (C1773As7) obj;
            if (!11T.A0O(this.A02, c1773As7.A02) || !11T.A0O(this.A0A, c1773As7.A0A) || this.A00 != c1773As7.A00 || this.A0D != c1773As7.A0D || this.A01 != c1773As7.A01 || !11T.A0O(this.A04, c1773As7.A04) || !11T.A0O(this.A09, c1773As7.A09) || !11T.A0O(this.A07, c1773As7.A07) || !11T.A0O(this.A08, c1773As7.A08) || !11T.A0O(this.A05, c1773As7.A05) || !11T.A0O(this.A06, c1773As7.A06) || !11T.A0O(this.A03, c1773As7.A03) || this.A0E != c1773As7.A0E || this.A0C != c1773As7.A0C || !11T.A0O(this.A0B, c1773As7.A0B)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((AnonymousClass002.A05(this.A01, (AnonymousClass002.A02(this.A00, AnonymousClass002.A07(this.A0A, AnonymousClass001.A02(this.A02) * 31)) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + 1BL.A05(this.A09)) * 31) + 1BL.A05(this.A07)) * 31) + 1BL.A05(this.A08)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + 1BL.A05(this.A06)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass002.A00(this.A0E ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0C ? 1 : 0)) * 31) + 4YU.A03(this.A0B);
    }
}
