package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.config;

import X.1BK;
import X.AnonymousClass001;
import X.MRl;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: DeviceConfigCache.class */
public class DeviceConfigCache {
    public static DeviceConfig A00(String str) {
        try {
            HashMap A0u = AnonymousClass001.A0u();
            MRl.A0S("SM-G955U", "GalaxyS8Plus", A0u);
            MRl.A0S("SM-G955F", "GalaxyS8Plus", A0u);
            MRl.A0S("SM-G950U", "GalaxyS8", A0u);
            MRl.A0S("SM-G950F", "GalaxyS8", A0u);
            MRl.A0S("SM-G935FD", "GalaxyS7EdgeDual", A0u);
            MRl.A0S("SM-G935V", "GalaxyS7Edge", A0u);
            MRl.A0S("SM-G935T", "GalaxyS7Edge", A0u);
            MRl.A0S("SM-G935P", "GalaxyS7Edge", A0u);
            MRl.A0S("SM-G935F", "GalaxyS7Edge", A0u);
            MRl.A0S("SAMSUNG-SM-G935A", "GalaxyS7Edge", A0u);
            MRl.A0S("SM-G930V", "GalaxyS7", A0u);
            MRl.A0S("SM-G930T", "GalaxyS7", A0u);
            MRl.A0S("SM-G930S", "GalaxyS7", A0u);
            MRl.A0S("SM-G930P", "GalaxyS7", A0u);
            MRl.A0S("SM-G930F", "GalaxyS7", A0u);
            MRl.A0S("SAMSUNG-SM-G930A", "GalaxyS7", A0u);
            MRl.A0S("SAMSUNG-SM-G891A", "GalaxyS7", A0u);
            MRl.A0S("SM-G928F", "GalaxyS6", A0u);
            MRl.A0S("SM-G925I", "GalaxyS6", A0u);
            MRl.A0S("SM-G925F", "GalaxyS6", A0u);
            MRl.A0S("SM-G920W8", "GalaxyS6", A0u);
            MRl.A0S("SM-G920V", "GalaxyS6", A0u);
            MRl.A0S("SM-G920T", "GalaxyS6", A0u);
            MRl.A0S("SM-G920P", "GalaxyS6", A0u);
            MRl.A0S("SM-G920I", "GalaxyS6", A0u);
            MRl.A0S("SM-G920F", "GalaxyS6", A0u);
            MRl.A0S("SAMSUNG-SM-G920A", "GalaxyS6", A0u);
            MRl.A0S("SAMSUNG-SM-G890A", "GalaxyS6", A0u);
            A0u.put("Pixel", DeviceConfigCache.class.getMethod("Pixel", new Class[0]));
            MRl.A0S("Pixel 2", "Pixel2", A0u);
            MRl.A0S("Pixel XL", "PixelXL", A0u);
            MRl.A0S("Pixel 2 XL", "Pixel2XL", A0u);
            if (A0u.containsKey(str)) {
                return (DeviceConfig) ((Method) A0u.get(str)).invoke(null, new Object[0]);
            }
        } catch (Exception unused) {
        }
        return new DeviceConfig(0.0d, 0.0d, 0.8d, 0.5d, 0.5d, -2.221441469079183d, 2.221441469079183d, 0.0d, DeviceConfig.DEFAULT_SKIP_ATTITUDE_INPUT, 0.0d, DeviceConfig.DEFAULT_USE_VISION_ONLY_SLAM, DeviceConfig.DEFAULT_IS_SLAM_CAPABLE, "", DeviceConfig.DEFAULT_IS_CALIBRATED_DEVICE);
    }

    public static DeviceConfig GalaxyS6() {
        Boolean A0d = 1BK.A0d();
        Boolean A0K = AnonymousClass001.A0K();
        return new DeviceConfig(0.08111d, -0.1908811d, 0.752428d, 0.49844d, 0.49858d, -2.221441469079183d, 2.221441469079183d, 0.0d, DeviceConfig.DEFAULT_SKIP_ATTITUDE_INPUT, 0.06d, A0d, A0K, "", A0K);
    }

    public static DeviceConfig GalaxyS7() {
        return MRl.A03(1BK.A0d(), AnonymousClass001.A0K());
    }

    public static DeviceConfig GalaxyS7Edge() {
        Boolean A0d = 1BK.A0d();
        Boolean A0K = AnonymousClass001.A0K();
        return new DeviceConfig(0.293084d, -0.590881d, 0.773158d, 0.482379d, 0.4953d, 3.141592653589793d, 0.0d, 0.0d, DeviceConfig.DEFAULT_SKIP_ATTITUDE_INPUT, 0.02d, A0d, A0K, "", A0K);
    }

    public static DeviceConfig GalaxyS7EdgeDual() {
        return MRl.A03(1BK.A0d(), AnonymousClass001.A0K());
    }

    public static DeviceConfig GalaxyS8() {
        Boolean A0d = 1BK.A0d();
        Boolean A0K = AnonymousClass001.A0K();
        return new DeviceConfig(0.126143d, -0.224788d, 0.769416d, 0.482374d, 0.521142d, 3.141592653589793d, 0.0d, 0.0d, DeviceConfig.DEFAULT_SKIP_ATTITUDE_INPUT, 0.0d, A0d, A0K, "", A0K);
    }

    public static DeviceConfig GalaxyS8Plus() {
        Boolean A0d = 1BK.A0d();
        Boolean A0K = AnonymousClass001.A0K();
        return new DeviceConfig(0.128441d, -0.28389d, 0.774141d, 0.484119d, 0.536015d, 3.141592653589793d, 0.0d, 0.0d, DeviceConfig.DEFAULT_SKIP_ATTITUDE_INPUT, 0.0d, A0d, A0K, "", A0K);
    }

    public static DeviceConfig Pixel() {
        Boolean A0d = 1BK.A0d();
        Boolean A0K = AnonymousClass001.A0K();
        return new DeviceConfig(0.0882626d, -0.361526d, 0.750342d, 0.499122d, 0.4986d, 3.141592653589793d, 0.0d, 0.0d, DeviceConfig.DEFAULT_SKIP_ATTITUDE_INPUT, 0.0d, A0d, A0K, "", A0K);
    }

    public static DeviceConfig Pixel2() {
        return MRl.A02(1BK.A0d(), AnonymousClass001.A0K());
    }

    public static DeviceConfig Pixel2XL() {
        return MRl.A02(1BK.A0d(), AnonymousClass001.A0K());
    }

    public static DeviceConfig PixelXL() {
        Boolean A0d = 1BK.A0d();
        Boolean A0K = AnonymousClass001.A0K();
        return new DeviceConfig(0.0422881d, -0.115992d, 0.76217d, 0.50245d, 0.497736d, 3.141592653589793d, 0.0d, 0.0d, DeviceConfig.DEFAULT_SKIP_ATTITUDE_INPUT, 0.0d, A0d, A0K, "", A0K);
    }
}
