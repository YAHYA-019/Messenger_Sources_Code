package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.emoji.model.Emoji;

/* loaded from: A8t.class */
public final class A8t implements AYp {
    public final /* synthetic */ C8dm A00;
    public final /* synthetic */ 9hK A01;
    public final /* synthetic */ 4iI A02;
    public final /* synthetic */ String A03;

    public A8t(C8dm c8dm, 9hK r303, 4iI r304, String str) {
        this.A00 = c8dm;
        this.A02 = r304;
        this.A01 = r303;
        this.A03 = str;
    }

    @Override // X.AYp
    public void Bvo(Emoji emoji) {
        Long l;
        11T.A0F(emoji, 0);
        C8dm c8dm = this.A00;
        Long l2 = c8dm.A04;
        if (l2 == null || (l = c8dm.A03) == null) {
            return;
        }
        ThreadKey A02 = this.A02.A02(l2.longValue());
        if (A02 == null) {
            throw 1BK.A0h();
        }
        9hK r0 = this.A01;
        String A07 = emoji.A07();
        11T.A0A(A07);
        r0.A01(A02, A07, this.A03, l.longValue());
    }
}
