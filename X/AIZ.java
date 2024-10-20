package X;

import com.facebook.messaging.cuckoo.threadcreation.mvvm.model.InteropAppRepository;
import com.facebook.messaging.sharedalbum.repository.RepositoryHelperKt;
import com.facebook.wearable.common.comms.rtc.hera.video.mixer.RawVideoMixer;

/* loaded from: AIZ.class */
public final class AIZ extends 0DP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIZ(0DR r302) {
        super(r302);
        this.A06 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIZ(Object obj, 0DR r303, int i) {
        super(r303);
        this.A06 = i;
        this.A05 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                this.A04 = obj;
                this.A01 |= (-1) << (-1);
                return ((InteropAppRepository) this.A05).A00(null, this, 0);
            case 1:
                this.A05 = obj;
                this.A01 |= (-1) << (-1);
                return RepositoryHelperKt.A02(null, null, null, null, this, 0);
            default:
                this.A04 = obj;
                this.A01 |= (-1) << (-1);
                return ((RawVideoMixer) this.A05).A00(0, this);
        }
    }
}
