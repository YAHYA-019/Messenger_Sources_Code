package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.9cg, reason: invalid class name */
/* loaded from: 9cg.class */
public final class C9cg {
    public final C97h A00;
    public final C97i A01;
    public final C97i A02;
    public final CharSequence A03;
    public final Integer A04;
    public final String A05;
    public final Function2 A06;
    public final boolean A07;

    public C9cg(C97h c97h, C97i c97i, C97i c97i2, CharSequence charSequence, Integer num, String str, Function2 function2, boolean z) {
        C3o5.A0k(str, 2, c97i);
        this.A04 = num;
        this.A05 = str;
        this.A00 = c97h;
        this.A07 = z;
        this.A02 = c97i;
        this.A03 = charSequence;
        this.A01 = c97i2;
        this.A06 = function2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9cg)) {
                return false;
            }
            C9cg c9cg = (C9cg) obj;
            if (this.A04 != c9cg.A04 || !11T.A0O(this.A05, c9cg.A05) || this.A00 != c9cg.A00 || this.A07 != c9cg.A07 || this.A02 != c9cg.A02 || !11T.A0O(this.A03, c9cg.A03) || this.A01 != c9cg.A01 || !11T.A0O(this.A06, c9cg.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int intValue = this.A04.intValue();
        return 1BK.A03(this.A06, AnonymousClass002.A05(this.A01, (AnonymousClass002.A05(this.A02, (((AnonymousClass002.A07(this.A05, 7zM.A04(intValue != 0 ? "TEXT" : "ICON", intValue) * 31) + AnonymousClass001.A02(this.A00)) * 31) + AnonymousClass002.A00(this.A07 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A03)) * 31));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MetaAiActionButtonConfig(buttonType=");
        A0k.append(this.A04.intValue() != 0 ? "TEXT" : "ICON");
        A0k.append(", buttonAccessAbilityLabel=");
        A0k.append(this.A05);
        A0k.append(", buttonIconName=");
        A0k.append(this.A00);
        A0k.append(", isEnabled=");
        A0k.append(this.A07);
        A0k.append(", iconTintColor=");
        A0k.append(this.A02);
        A0k.append(", buttonText=");
        A0k.append((Object) this.A03);
        A0k.append(", buttonTextColor=");
        A0k.append(this.A01);
        A0k.append(", onClick=");
        return AnonymousClass002.A0K(this.A06, A0k);
    }
}
