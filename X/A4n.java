package X;

import com.facebook.messaging.avatar.hotlike.plugins.impl.HotLikeAvatarExtensionImplementation;

/* loaded from: A4n.class */
public final class A4n implements AZh {
    public final /* synthetic */ HotLikeAvatarExtensionImplementation A00;
    public final /* synthetic */ String A01;

    public A4n(HotLikeAvatarExtensionImplementation hotLikeAvatarExtensionImplementation, String str) {
        this.A00 = hotLikeAvatarExtensionImplementation;
        this.A01 = str;
    }

    @Override // X.AZh
    public void CNK(String str) {
        HotLikeAvatarExtensionImplementation.A01(this.A00, this.A01);
    }

    @Override // X.AZh
    public void CNL(6fM r302, String str, String str2) {
        4YV.A1N(r302, str2);
        HotLikeAvatarExtensionImplementation.A00(r302, this.A00, str2);
    }
}
