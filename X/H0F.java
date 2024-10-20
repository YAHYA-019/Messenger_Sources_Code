package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;

/* loaded from: H0F.class */
public final class H0F extends AbstractC04694bp {
    public final /* synthetic */ J5j A00;

    public H0F(J5j j5j) {
        this.A00 = j5j;
    }

    @Override // X.InterfaceC04714br
    public boolean BTb(int i) {
        return AnonymousClass001.A1Q(i, 4);
    }

    @Override // X.InterfaceC04714br
    public void CGM(int i, int i2, String str, java.util.Map map) {
        J5j j5j = this.A00;
        if (j5j.A06.get() != null) {
            throw AnonymousClass001.A0Q("onEvicted");
        }
        HP1 hp1 = j5j.A03.A01;
        String str2 = j5j.A05;
        11T.A0F(str, 0);
        2Jy A0H = 4YU.A0H(AbstractC00603o4.A00(ActionId.VIDEO_REQUESTED_PLAYING));
        A0H.A0D("key", str);
        A0H.A0C("reason", i);
        A0H.A0C("size", 0L);
        A0H.A0D(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, "DiskCacheV2");
        A0H.A0D("cacheType", str2);
        C1kw A06 = 1BK.A06(hp1.A00);
        if (GYc.A00 == null) {
            synchronized (GYc.class) {
                if (GYc.A00 == null) {
                    GYc.A00 = new C2J3(A06);
                }
            }
        }
        GYc.A00.A03(A0H);
    }
}
