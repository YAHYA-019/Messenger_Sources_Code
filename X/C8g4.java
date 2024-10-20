package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.8g4, reason: invalid class name */
/* loaded from: 8g4.class */
public final class C8g4 extends 1LH {
    public final long A00;
    public final Handler A01;
    public final CharSequence A02;
    public final Function1 A03;

    public /* synthetic */ C8g4(Handler handler, CharSequence charSequence, Function1 function1, DefaultConstructorMarker defaultConstructorMarker, int i, long j) {
        Handler A07 = AnonymousClass001.A07();
        11T.A0F(charSequence, 1);
        this.A02 = charSequence;
        this.A00 = 1000L;
        this.A01 = A07;
        this.A03 = function1;
    }

    public C8g4(CharSequence charSequence, Function1 function1) {
        Handler A07 = AnonymousClass001.A07();
        this.A02 = charSequence;
        this.A00 = 1000L;
        this.A01 = A07;
        this.A03 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        List A0V;
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, APz.A00);
        C2lh A002 = C2lc.A00(c2k5, AQ1.A00);
        C2lh A003 = C2lc.A00(c2k5, new AQU(this, 14));
        C2lh A004 = C2lc.A00(c2k5, APy.A00);
        4NU A005 = 4NT.A00(c2k5, AQ2.A00);
        Object obj = A003.A02;
        boolean z = true;
        4FL.A00(c2k5, new AKs(22, A003, A004, A002, A005, this), new Object[]{obj, A004.A02});
        C2lh A006 = C2lc.A00(c2k5, AQ0.A00);
        CharSequence charSequence = this.A02;
        CharSequence charSequence2 = (CharSequence) A00.A02;
        if (!0CV.A0Y(charSequence, charSequence2)) {
            if (charSequence.length() >= (charSequence2 != null ? charSequence2.length() : 0)) {
                int A03 = AnonymousClass001.A03(obj);
                int i = 0;
                if (charSequence.length() == 0) {
                    A0V = C0ty.A00;
                } else {
                    if (A03 > charSequence.length()) {
                        A03 = -1;
                    }
                    ArrayList A0s = AnonymousClass001.A0s();
                    int i2 = 0;
                    while (i < charSequence.length()) {
                        char charAt = charSequence.charAt(i);
                        int i3 = i2 + 1;
                        if (i2 > A03 && charAt == ' ') {
                            AnonymousClass001.A1J(A0s, i2);
                        }
                        i++;
                        i2 = i3;
                    }
                    AnonymousClass001.A1J(A0s, charSequence.length());
                    A0V = 0QD.A0V(A0s);
                }
                if (1BK.A1Y(A0V)) {
                    A004.A02(Long.valueOf(this.A00 / A0V.size()));
                    A003.A02(A0V.get(0));
                }
                A002.A02(A0V);
            }
            A00.A02(charSequence);
        }
        Number number = (Number) obj;
        if (number.intValue() >= charSequence.length()) {
            7zM.A1T(A003, charSequence.length());
        }
        int intValue = number.intValue();
        Number number2 = (Number) 0QD.A0G((List) A002.A02);
        if (intValue >= (number2 != null ? number2.intValue() : -1)) {
            z = false;
        }
        7zN.A1U(A006, z);
        if (number.intValue() <= charSequence.length()) {
            charSequence = charSequence.subSequence(0, number.intValue());
        }
        return 7zN.A0S((1LI) this.A03.invoke(charSequence), C2dB.A00(c2k5.A05));
    }
}
