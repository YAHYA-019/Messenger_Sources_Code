package X;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: I7v.class */
public final class I7v {
    public static final List A00(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        try {
            List list = sidecarWindowLayoutInfo.displayFeatures;
            if (list == null) {
                list = C0ty.A00;
            }
            return list;
        } catch (NoSuchFieldError unused) {
            try {
                Object A0k = DKH.A0k(sidecarWindowLayoutInfo, SidecarWindowLayoutInfo.class, "getDisplayFeatures");
                11T.A0I(A0k, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) A0k;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return C0ty.A00;
            }
        }
    }

    public static final void A01(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            sidecarDeviceState.posture = i;
        } catch (NoSuchFieldError unused) {
            try {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    public final int A02(SidecarDeviceState sidecarDeviceState) {
        int A05;
        try {
            A05 = sidecarDeviceState.posture;
        } catch (NoSuchFieldError unused) {
            try {
                A05 = DKD.A05(DKH.A0k(sidecarDeviceState, SidecarDeviceState.class, "getPosture"), AnonymousClass000.A00(0));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }
        if (A05 < 0 || A05 > 4) {
            A05 = 0;
        }
        return A05;
    }
}
