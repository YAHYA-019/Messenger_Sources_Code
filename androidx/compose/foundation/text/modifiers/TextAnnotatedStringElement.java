package androidx.compose.foundation.text.modifiers;

import X.11T;
import X.1BL;
import X.AnonymousClass002;
import X.JQz;
import X.L4F;
import X.LOB;
import X.Lie;
import X.MBi;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: TextAnnotatedStringElement.class */
public final class TextAnnotatedStringElement extends LOB {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Lie A03;
    public final L4F A04;
    public final MBi A05;
    public final List A06;
    public final Function1 A07;
    public final Function1 A08;
    public final Function1 A09;
    public final boolean A0A;

    public TextAnnotatedStringElement(Lie lie, L4F l4f, MBi mBi, List list, Function1 function1, Function1 function12, Function1 function13, int i, int i2, int i3, boolean z) {
        this.A03 = lie;
        this.A04 = l4f;
        this.A05 = mBi;
        this.A09 = function1;
        this.A02 = i;
        this.A0A = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A06 = list;
        this.A07 = function12;
        this.A08 = function13;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof TextAnnotatedStringElement)) {
                return false;
            }
            TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
            if (!11T.A0O(this.A03, textAnnotatedStringElement.A03) || !11T.A0O(this.A04, textAnnotatedStringElement.A04) || !11T.A0O(this.A06, textAnnotatedStringElement.A06) || !11T.A0O(this.A05, textAnnotatedStringElement.A05) || this.A09 != textAnnotatedStringElement.A09 || this.A08 != textAnnotatedStringElement.A08 || this.A02 != textAnnotatedStringElement.A02 || this.A0A != textAnnotatedStringElement.A0A || this.A00 != textAnnotatedStringElement.A00 || this.A01 != textAnnotatedStringElement.A01 || this.A07 != textAnnotatedStringElement.A07) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A04, 1BL.A03(this.A03))) + AnonymousClass002.A04(this.A09)) * 31) + this.A02) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31) + this.A00) * 31) + this.A01) * 31) + AnonymousClass002.A04(this.A06)) * 31) + AnonymousClass002.A04(this.A07)) * 31 * 31 * 31) + JQz.A0E(this.A08, 0);
    }
}
