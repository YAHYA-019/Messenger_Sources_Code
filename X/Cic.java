package X;

import com.facebook.xapp.messaging.commmunitymessaging.category.model.CommunityCategory;

/* loaded from: Cic.class */
public final class Cic implements DI0 {
    public final /* synthetic */ AlQ A00;

    public Cic(AlQ alQ) {
        this.A00 = alQ;
    }

    @Override // X.DI0
    public void Bna(CommunityCategory communityCategory) {
        11T.A0F(communityCategory, 0);
        AlQ alQ = this.A00;
        if (AlQ.A0B(alQ)) {
            alQ.A05 = communityCategory;
            AlQ.A03(alQ).A06(Long.valueOf(communityCategory.A00));
        }
    }

    @Override // X.DI0
    public void CSD() {
        AlQ alQ = this.A00;
        if (AlQ.A0B(alQ)) {
            alQ.A05 = null;
            AlQ.A03(alQ).A06((Long) null);
        }
    }

    @Override // X.DI0
    public void CST() {
        AbO.A0d(this.A00);
    }
}
