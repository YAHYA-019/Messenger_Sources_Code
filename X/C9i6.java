package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.9i6, reason: invalid class name */
/* loaded from: 9i6.class */
public final class C9i6 {
    public final C97h A00;
    public final C97h A01;
    public final C97i A02;
    public final CharSequence A03;
    public final Integer A04;
    public final String A05;
    public final Function1 A06;

    public C9i6() {
        this(C97h.A0G, null, C97i.A0X, null, 0S2.A00, DKB.A00(210), GBh.A00);
    }

    public C9i6(C97h c97h, C97h c97h2, C97i c97i, CharSequence charSequence, Integer num, String str, Function1 function1) {
        7zT.A1W(str, c97h, c97i, num);
        this.A05 = str;
        this.A00 = c97h;
        this.A02 = c97i;
        this.A04 = num;
        this.A03 = charSequence;
        this.A06 = function1;
        this.A01 = c97h2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9i6)) {
                return false;
            }
            C9i6 c9i6 = (C9i6) obj;
            if (!11T.A0O(this.A05, c9i6.A05) || this.A00 != c9i6.A00 || this.A04 != c9i6.A04 || !11T.A0O(this.A03, c9i6.A03) || !11T.A0O(this.A06, c9i6.A06) || this.A01 != c9i6.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A00, 4YV.A02(this.A05)));
        int intValue = this.A04.intValue();
        return AnonymousClass002.A05(this.A06, (7zR.A07(intValue != 0 ? "TEXT" : "ICON", intValue, A05) + AnonymousClass001.A02(this.A03)) * 31) + 4YU.A03(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MetaAiNavigationButtonConfig(buttonAccessAbilityLabel=");
        A0k.append(this.A05);
        A0k.append(", buttonIconName=");
        A0k.append(this.A00);
        A0k.append(", iconTintColor=");
        A0k.append(this.A02);
        A0k.append(", buttonType=");
        A0k.append(this.A04.intValue() != 0 ? "TEXT" : "ICON");
        A0k.append(", buttonText=");
        A0k.append((Object) this.A03);
        A0k.append(", onClick=");
        A0k.append(this.A06);
        A0k.append(", rtlButtonIconName=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
