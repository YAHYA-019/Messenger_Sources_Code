package X;

import com.facebook.ui.emoji.model.Emoji;
import java.util.Set;

/* loaded from: A8v.class */
public final class A8v implements AYp {
    public final /* synthetic */ 1Br A00;
    public final /* synthetic */ 1Iw A01;
    public final /* synthetic */ 7HH A02;
    public final /* synthetic */ C5fv A03;
    public final /* synthetic */ AaS A04;
    public final /* synthetic */ 6vE A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Set A07;

    public A8v(1Br r302, 1Iw r303, 7HH r304, C5fv c5fv, AaS aaS, 6vE r307, String str, Set set) {
        this.A01 = r303;
        this.A06 = str;
        this.A04 = aaS;
        this.A07 = set;
        this.A05 = r307;
        this.A02 = r304;
        this.A03 = c5fv;
        this.A00 = r302;
    }

    @Override // X.AYp
    public void Bvo(Emoji emoji) {
        11T.A0F(emoji, 0);
        1Iw r0 = this.A01;
        String str = this.A06;
        AaS aaS = this.A04;
        String A07 = emoji.A07();
        11T.A0A(A07);
        Set set = this.A07;
        8oW.A0L(r0, aaS, (9Ma) 1Br.A0B(this.A00), this.A05, str, A07, set);
        this.A02.A02(this.A03, DKB.A00(29), A07, (String) 0QD.A08(set));
    }
}
