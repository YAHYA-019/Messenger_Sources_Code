package X;

import com.facebook.ui.emoji.model.Emoji;
import java.util.Set;

/* loaded from: A8s.class */
public final class A8s implements AYp {
    public final /* synthetic */ 7HP A00;
    public final /* synthetic */ 5vW A01;
    public final /* synthetic */ Set A02;

    public A8s(7HP r302, 5vW r303, Set set) {
        this.A02 = set;
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // X.AYp
    public void Bvo(Emoji emoji) {
        C5fv c5fv;
        11T.A0F(emoji, 0);
        String A07 = emoji.A07();
        11T.A0A(A07);
        boolean contains = this.A02.contains(A07);
        7HP r0 = this.A00;
        Object value = r0.A01.getValue();
        if (contains) {
            74V r02 = (74V) value;
            5vV r03 = this.A01;
            c5fv = r03.A00;
            C5fu c5fu = (C5fu) c5fv;
            r02.Cf4(r03.A01.A00, Long.valueOf(c5fu.A02), c5fu.A09, A07);
        } else {
            74V r04 = (74V) value;
            5vV r05 = this.A01;
            c5fv = r05.A00;
            C5fu c5fu2 = (C5fu) c5fv;
            r04.A7C(r05.A01.A00, (Long) null, Long.valueOf(c5fu2.A02), c5fu2.A09, A07);
        }
        ((7HH) r0.A00.getValue()).A02(c5fv, DKB.A00(29), (String) null, (String) null);
    }
}
