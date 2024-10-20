package X;

import com.facebook.messaging.avatar.plugins.dataload.messagerowdata.AvatarMessageRowData;

/* loaded from: A4k.class */
public final class A4k implements AYh {
    public final /* synthetic */ AvatarMessageRowData A00;

    public A4k(AvatarMessageRowData avatarMessageRowData) {
        this.A00 = avatarMessageRowData;
    }

    @Override // X.AYh
    public final void BkS(8O0 r302, String str, boolean z) {
        if (r302 != null) {
            AvatarMessageRowData avatarMessageRowData = this.A00;
            C2j0 c2j0 = (C2j0) avatarMessageRowData.A08.getValue();
            String str2 = avatarMessageRowData.A04.A1V;
            if (str2 == null) {
                str2 = "";
            }
            c2j0.A01(new C7f9(str2));
        }
    }
}
