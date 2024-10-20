package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderDelegateBridge;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate;

/* renamed from: X.Gdt, reason: case insensitive filesystem */
/* loaded from: Gdt.class */
public final class C2451Gdt extends HFT {
    public static final Hy3 A05 = new Hy3(HC7.A06);
    public final JJh A00;
    public final AvatarsNativeInputDelegate A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public C2451Gdt(JJh jJh, AvatarsNativeInputDelegate avatarsNativeInputDelegate, Integer num, String str, String str2) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = num;
        this.A00 = jJh;
        this.A01 = avatarsNativeInputDelegate;
    }

    public ServiceConfiguration A00() {
        String str;
        int i;
        AvatarsDataProviderConfigurationHybrid avatarsDataProviderConfigurationHybrid = AvatarsDataProviderConfigurationHybrid.$redex_init_class;
        String str2 = this.A04;
        str = "";
        if (str2 == null) {
            str2 = str;
        }
        String str3 = this.A03;
        str = str3 != null ? str3 : "";
        switch (this.A02.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        JJh jJh = this.A00;
        AvatarsDataProviderDelegateBridge avatarsDataProviderDelegateBridge = jJh != null ? new AvatarsDataProviderDelegateBridge(jJh) : null;
        AvatarsNativeInputDelegate avatarsNativeInputDelegate = this.A01;
        if (avatarsNativeInputDelegate == null) {
            avatarsNativeInputDelegate = new AvatarsNativeInputDelegate();
        }
        return new ServiceConfiguration(AvatarsDataProviderConfigurationHybrid.initHybrid(str2, str, i, avatarsDataProviderDelegateBridge, avatarsNativeInputDelegate));
    }
}
