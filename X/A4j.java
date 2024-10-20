package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.emoji.model.Emoji;

/* loaded from: A4j.class */
public final class A4j implements AYg {
    public final /* synthetic */ 1Iw A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ 8JF A02;
    public final /* synthetic */ AYj A03;
    public final /* synthetic */ AZl A04;

    public A4j(1Iw r302, ThreadKey threadKey, 8JF r304, AYj aYj, AZl aZl) {
        this.A04 = aZl;
        this.A00 = r302;
        this.A01 = threadKey;
        this.A02 = r304;
        this.A03 = aYj;
    }

    @Override // X.AYg
    public void BoR(Emoji emoji, String str) {
        11T.A0F(emoji, 0);
        this.A04.Cni(7zL.A0A(this.A00), this.A01, emoji, str != null ? 0CW.A0e(str) : null);
        this.A02.A01.run();
        this.A03.BuH();
    }
}
