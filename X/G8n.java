package X;

import com.facebook.messaging.avatar.avatardetail.usecases.FetchUserAvatarDetail;
import com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache;
import com.facebook.wearable.mediastream.ul.voltron.loader.MediaStreamLibraryLoader;

/* loaded from: G8n.class */
public final class G8n extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G8n(Object obj, 0DR r303, int i) {
        super(r303);
        this.A06 = i;
        this.A07 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A04 = obj;
        this.A00 |= (-1) << (-1);
        switch (i) {
            case 0:
                return ((FetchUserAvatarDetail) this.A07).A00(null, null, this);
            case 1:
                return OnDemandSurfaceTriggerCache.A00(null, (OnDemandSurfaceTriggerCache) this.A07, null, this, false);
            default:
                return MediaStreamLibraryLoader.A01(null, (MediaStreamLibraryLoader) this.A07, this, false);
        }
    }
}
