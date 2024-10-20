package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;

/* loaded from: C4a.class */
public final class C4a {
    public final 1Br A00;
    public final 1Br A01;
    public final UserKey A02;
    public final 1De A03;

    public C4a(1De r302, UserKey userKey) {
        11T.A0F(userKey, 2);
        this.A03 = r302;
        this.A02 = userKey;
        this.A00 = AbG.A0W();
        this.A01 = 7zM.A0h(r302, 82710);
    }

    public final void A00(LifecycleOwner lifecycleOwner, Observer observer, ThreadKey threadKey) {
        BlD blD = new BlD(AbH.A08((C5xl) 1Br.A0B(this.A00), threadKey));
        LiveData liveData = blD.A00;
        if (liveData.hasActiveObservers()) {
            0fH.A0n("SingleEventAdapter", "Multiple observers registered but only one will be notified of changes.");
        }
        CaD.A00(lifecycleOwner, liveData, observer, blD, 30);
    }
}
