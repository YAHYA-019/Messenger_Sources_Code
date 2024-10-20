package X;

import com.facebook.ui.emoji.model.Emoji;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: A8q.class */
public final class A8q implements AYp {
    public final /* synthetic */ 7Hf A00;
    public final /* synthetic */ String A01;

    public A8q(7Hf r302, String str) {
        this.A00 = r302;
        this.A01 = str;
    }

    @Override // X.AYp
    public void Bvo(Emoji emoji) {
        11T.A0F(emoji, 0);
        7Hf r0 = this.A00;
        74V r02 = r0.A00;
        if (r02 != null) {
            String str = this.A01;
            String A07 = emoji.A07();
            11T.A0A(A07);
            r02.A7C((Capabilities) null, (Long) null, (Long) null, str, A07);
        }
        r0.A01.A02((C5fv) null, "quick_reaction_pill", (String) null, (String) null);
    }
}
