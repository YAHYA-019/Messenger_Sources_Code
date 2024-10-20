package X;

import com.facebook.xapp.messaging.commmunitymessaging.category.model.CommunityCategory;

/* loaded from: Cid.class */
public final class Cid implements DI0 {
    public final /* synthetic */ AlR A00;

    public Cid(AlR alR) {
        this.A00 = alR;
    }

    @Override // X.DI0
    public void Bna(CommunityCategory communityCategory) {
        11T.A0F(communityCategory, 0);
        AlR alR = this.A00;
        alR.A09 = communityCategory;
        AlR.A0E(alR);
    }

    @Override // X.DI0
    public void CSD() {
        AlR alR = this.A00;
        alR.A09 = null;
        AlR.A0E(alR);
    }

    @Override // X.DI0
    public void CST() {
        AbO.A0d(this.A00);
    }
}
