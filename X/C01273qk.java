package X;

import com.facebook.omnistore.OmnistoreIOException;
import com.facebook.omnistore.UsingInvalidatedCollectionError;
import com.facebook.omnistore.module.OmnistoreComponent;
import com.facebook.omnistore.util.DeviceIdUtil;

/* renamed from: X.3qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3qk.class */
public final class C01273qk {
    public final C15h A02 = new C4Xh(this, 11);
    public final C1oA A00 = (C1oA) 1Bi.A03(16806);
    public final C0qy A01 = (C0qy) 1Bi.A03(83603);

    public void A00(OmnistoreComponent omnistoreComponent, StringBuilder sb) {
        3qQ A00;
        if (!DeviceIdUtil.isSupportedApp("256002347743983")) {
            sb.append("Attempted to open an Omnistore Component on unsupported app: ");
            1BK.A1R(sb, omnistoreComponent.getClass());
            0fH.A17("QuickPerformanceLoggerImpl", "Attempted to open an Omnistore Component on unsupported app: %s", new Object[]{omnistoreComponent});
            return;
        }
        1oS r0 = (1oS) this.A02.get();
        synchronized (r0) {
            if (!r0.A02.contains(omnistoreComponent)) {
                throw AnonymousClass001.A0T("Tried to init an unregistered component");
            }
            A00 = 1oS.A00(omnistoreComponent, r0);
        }
        C1oA c1oA = this.A00;
        synchronized (c1oA) {
            try {
                try {
                    A00.C9q(c1oA);
                } catch (OmnistoreIOException e) {
                    sb.append("Omnistore IO Error while opening collection ");
                    1BK.A1R(sb, omnistoreComponent.getClass());
                    sb.append(e.getStackTrace());
                    0fH.A0z("QuickPerformanceLoggerImpl", "Omnistore IO Error while opening collection %s", e, new Object[]{omnistoreComponent});
                }
            } catch (AnonymousClass483 | AnonymousClass484 | UsingInvalidatedCollectionError e2) {
                sb.append("Failed to open omnistore while trying to get collection for component: ");
                1BK.A1R(sb, omnistoreComponent.getClass());
                sb.append(e2.getStackTrace());
                0fH.A11("QuickPerformanceLoggerImpl", "Failed to open omnistore while trying to get collection for component: %s", e2, new Object[]{omnistoreComponent});
            }
        }
    }
}
