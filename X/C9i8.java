package X;

import android.graphics.drawable.Drawable;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.9i8, reason: invalid class name */
/* loaded from: 9i8.class */
public final class C9i8 {
    public final long A00;
    public final Drawable A01;
    public final 2lO A02;
    public final C9cg A03;
    public final C9i6 A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final Integer A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C9i8(Drawable drawable, 2lO r303, C9cg c9cg, C9i6 c9i6, CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, long j, boolean z, boolean z2, boolean z3) {
        7zP.A1N(charSequence, 1, num2);
        this.A06 = charSequence;
        this.A08 = num;
        this.A00 = j;
        this.A0B = z;
        this.A04 = c9i6;
        this.A03 = c9cg;
        this.A09 = z2;
        this.A02 = r303;
        this.A01 = drawable;
        this.A07 = num2;
        this.A05 = charSequence2;
        this.A0A = z3;
    }

    public static /* synthetic */ C9i8 A00(Drawable drawable, C9cg c9cg, C9i8 c9i8, C9i6 c9i6, CharSequence charSequence, Integer num, int i, boolean z, boolean z2) {
        Integer num2 = num;
        Drawable drawable2 = drawable;
        boolean z3 = z2;
        C9cg c9cg2 = c9cg;
        C9i6 c9i62 = c9i6;
        boolean z4 = z;
        CharSequence charSequence2 = charSequence;
        CharSequence charSequence3 = null;
        if ((i & 1) != 0) {
            charSequence2 = c9i8.A06;
        }
        Integer num3 = (i & 2) != 0 ? c9i8.A08 : null;
        long j = (i & 4) != 0 ? c9i8.A00 : 0L;
        if ((i & 8) != 0) {
            z4 = c9i8.A0B;
        }
        if ((i & 16) != 0) {
            c9i62 = c9i8.A04;
        }
        if ((i & 32) != 0) {
            c9cg2 = c9i8.A03;
        }
        if ((i & 64) != 0) {
            z3 = c9i8.A09;
        }
        2lO r324 = (i & 128) != 0 ? c9i8.A02 : null;
        if ((i & 256) != 0) {
            drawable2 = c9i8.A01;
        }
        if ((i & 512) != 0) {
            num2 = c9i8.A07;
        }
        if ((i & 1024) != 0) {
            charSequence3 = c9i8.A05;
        }
        boolean z5 = (i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 ? c9i8.A0A : false;
        11T.A0H(charSequence2, num3);
        11T.A0F(num2, 9);
        return new C9i8(drawable2, r324, c9cg2, c9i62, charSequence2, charSequence3, num3, num2, j, z4, z3, z5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9i8)) {
                return false;
            }
            C9i8 c9i8 = (C9i8) obj;
            if (!11T.A0O(this.A06, c9i8.A06) || this.A08 != c9i8.A08 || this.A00 != c9i8.A00 || this.A0B != c9i8.A0B || !11T.A0O(this.A04, c9i8.A04) || !11T.A0O(this.A03, c9i8.A03) || this.A09 != c9i8.A09 || !11T.A0O(this.A02, c9i8.A02) || !11T.A0O(this.A01, c9i8.A01) || this.A07 != c9i8.A07 || !11T.A0O(this.A05, c9i8.A05) || this.A0A != c9i8.A0A) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = 1BL.A03(this.A06);
        Integer num = this.A08;
        int A02 = (((((((((((AnonymousClass002.A02(this.A00, 7zV.A03(num, 9El.A00(num), A03)) + AnonymousClass002.A00(this.A0B ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A01)) * 31;
        Integer num2 = this.A07;
        return ((7zV.A03(num2, F2a.A01(num2), A02) + 4YU.A03(this.A05)) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MetaAiBottomSheetConfig(titleString=");
        A0k.append((Object) this.A06);
        A0k.append(", titleTextType=");
        A0k.append(9El.A00(this.A08));
        A0k.append(", titleCapSize=");
        A0k.append((Object) C2lu.A03(this.A00));
        A0k.append(", shouldShowMetaAiDonut=");
        A0k.append(this.A0B);
        A0k.append(", navigationButtonConfig=");
        A0k.append(this.A04);
        A0k.append(", actionButtonConfig=");
        A0k.append(this.A03);
        A0k.append(", overrideDefaultNavigation=");
        A0k.append(this.A09);
        A0k.append(", headerStyle=");
        A0k.append(this.A02);
        A0k.append(", customBackgroundDrawable=");
        A0k.append(this.A01);
        A0k.append(", darkModeConfig=");
        A0k.append(F2a.A01(this.A07));
        A0k.append(", subTitleString=");
        A0k.append((Object) this.A05);
        A0k.append(", shouldShowHeader=");
        A0k.append(this.A0A);
        return 4YV.A0x(A0k);
    }
}
