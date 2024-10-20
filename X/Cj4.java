package X;

import com.facebook.messaging.communitymessaging.model.Community;

/* loaded from: Cj4.class */
public final class Cj4 implements DEu {
    public final /* synthetic */ 1pI A00;

    public Cj4(1pI r302) {
        this.A00 = r302;
    }

    @Override // X.DEu
    public void CHT(Community community) {
        if (community != null) {
            1pI r0 = this.A00;
            11T.A0F(r0, 1);
            1pK c1524Akd = new C1524Akd();
            c1524Akd.setArguments(AbH.A05(community, "community"));
            r0.Czy(c1524Akd, C1524Akd.__redex_internal_original_name);
        }
    }
}
