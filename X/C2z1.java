package X;

import android.text.Editable;
import java.util.AbstractCollection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2z1, reason: invalid class name */
/* loaded from: 2z1.class */
public final class C2z1 implements C2n4 {
    public final int A00;

    public C2z1(int i) {
        this.A00 = i;
    }

    public static void A00(AbstractCollection abstractCollection, Matcher matcher, int i, int i2) {
        abstractCollection.add(new 31R(i2 + matcher.start(i), i2 + matcher.end(i)));
    }

    @Override // X.C2n4
    public List AhG(Editable editable, 31Q r303) {
        0OI A1B;
        switch (this.A00) {
            case 0:
                return r303.A03;
            case 1:
                boolean A1W = 1BL.A1W(editable, r303);
                Pattern compile = Pattern.compile("(^ *[*-] ?)(.*?$)", 8);
                int i = r303.A01;
                Matcher matcher = compile.matcher(editable.subSequence(i, r303.A00));
                A1B = C13m.A1B();
                while (matcher.find()) {
                    A00(A1B, matcher, A1W ? 1 : 0, i);
                }
                break;
            case 2:
                boolean A1W2 = 1BL.A1W(editable, r303);
                Pattern compile2 = Pattern.compile("(^#\\s)(.*?$)", 8);
                int i2 = r303.A01;
                Matcher matcher2 = compile2.matcher(editable.subSequence(i2, r303.A00));
                A1B = C13m.A1B();
                while (matcher2.find()) {
                    A00(A1B, matcher2, A1W2 ? 1 : 0, i2);
                }
                break;
            case 3:
                boolean A1W3 = 1BL.A1W(editable, r303);
                Pattern compile3 = Pattern.compile("\\[([^\\]]+)\\]");
                Pattern compile4 = Pattern.compile(".*\\(([^)]+)\\)");
                int i3 = r303.A01;
                int i4 = r303.A00;
                Matcher matcher3 = compile3.matcher(editable.subSequence(i3, i4));
                Matcher matcher4 = compile4.matcher(editable.subSequence(i3, i4));
                11T.A0A(matcher4);
                A1B = C13m.A1B();
                while (matcher4.find() && matcher3.find()) {
                    A1B.add(new 31R((i3 + matcher3.start(A1W3 ? 1 : 0)) - (A1W3 ? 1 : 0), i3 + matcher3.start(A1W3 ? 1 : 0)));
                    A1B.add(new 31R(i3 + matcher3.end(A1W3 ? 1 : 0), matcher3.end(A1W3 ? 1 : 0) + i3 + 1));
                    A1B.add(new 31R((i3 + matcher4.start(A1W3 ? 1 : 0)) - (A1W3 ? 1 : 0), matcher4.end(A1W3 ? 1 : 0) + i3 + 1));
                }
            case 4:
                boolean A1W4 = 1BL.A1W(editable, r303);
                Pattern compile5 = Pattern.compile("(^ *([1-9][0-9]?)\\.\\s ?)(.*?$)", 8);
                int i5 = r303.A01;
                Matcher matcher5 = compile5.matcher(editable.subSequence(i5, r303.A00));
                A1B = C13m.A1B();
                while (matcher5.find()) {
                    A00(A1B, matcher5, A1W4 ? 1 : 0, i5);
                }
                break;
            case 5:
                boolean A1W5 = 1BL.A1W(editable, r303);
                Pattern compile6 = Pattern.compile("(^([1-9][0-9]?)\\.\\s ?)(.*?$)", 8);
                int i6 = r303.A01;
                Matcher matcher6 = compile6.matcher(editable.subSequence(i6, r303.A00));
                A1B = C13m.A1B();
                while (matcher6.find()) {
                    A00(A1B, matcher6, A1W5 ? 1 : 0, i6);
                }
                break;
            default:
                return null;
        }
        return C13m.A1C(A1B);
    }
}
