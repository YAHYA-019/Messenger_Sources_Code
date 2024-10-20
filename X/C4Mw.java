package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingCommunityType;

/* renamed from: X.4Mw, reason: invalid class name */
/* loaded from: 4Mw.class */
public final class C4Mw {
    public final 1De A00;

    public C4Mw(1De r302) {
        this.A00 = r302;
    }

    public final LiveData A00() {
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(Transformations.distinctUntilChanged((LiveData) 1Bn.A0G(this.A00.A00, 82818)), new 4VO(mediatorLiveData, 1));
        return Transformations.distinctUntilChanged(mediatorLiveData);
    }

    public final LiveData A01(CommunityMessagingCommunityType communityMessagingCommunityType) {
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(Transformations.distinctUntilChanged((LiveData) 1Bn.A0G(this.A00.A00, 82818)), new 4VN(mediatorLiveData, communityMessagingCommunityType));
        return Transformations.distinctUntilChanged(mediatorLiveData);
    }
}
