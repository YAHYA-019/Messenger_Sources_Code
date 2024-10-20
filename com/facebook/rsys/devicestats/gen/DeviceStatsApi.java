package com.facebook.rsys.devicestats.gen;

import X.2JQ;
import X.C0il;
import X.GOo;
import X.HE8;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: DeviceStatsApi.class */
public abstract class DeviceStatsApi {
    public static 2JQ CONVERTER = IR0.A00(ActionId.DATA_LOAD_START);

    /* loaded from: DeviceStatsApi$CProxy.class */
    public final class CProxy extends DeviceStatsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            if (HE8.A00) {
                return;
            }
            GOo.A14();
            C0il.A0B("rsysdevicestatsjni");
            HE8.A00 = true;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native DeviceStatsApi createDeviceStatsApi();

        public static native DeviceStatsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DeviceStatsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.devicestats.gen.DeviceStatsApi
        public native BatteryStatsReader getBatteryStatsReader();

        public native int hashCode();

        @Override // com.facebook.rsys.devicestats.gen.DeviceStatsApi
        public native void setBatteryStatsReader(BatteryStatsReader batteryStatsReader);
    }

    public abstract BatteryStatsReader getBatteryStatsReader();

    public abstract void setBatteryStatsReader(BatteryStatsReader batteryStatsReader);
}
