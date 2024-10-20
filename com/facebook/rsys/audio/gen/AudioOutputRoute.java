package com.facebook.rsys.audio.gen;

import X.0Pz;
import X.2JQ;
import X.7zM;
import X.AbstractC2326GOr;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: AudioOutputRoute.class */
public class AudioOutputRoute {
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;
    public static final AudioOutputRoute UNKNOWN = new AudioOutputRoute("unknown_device", "unknown");
    public static final AudioOutputRoute EARPIECE = new AudioOutputRoute("earpiece_device", "earpiece");
    public static final AudioOutputRoute SPEAKER = new AudioOutputRoute("speaker_device", "speaker");
    public static final AudioOutputRoute HEADSET = new AudioOutputRoute("headset_device", "headset");
    public static final AudioOutputRoute BLUETOOTH = new AudioOutputRoute("bluetooth_device", "bluetooth");
    public static final AudioOutputRoute BLUETOOTH_A2DP = new AudioOutputRoute("bluetooth_device", "BluetoothA2DPOutput");
    public static final AudioOutputRoute BLUETOOTH_LE = new AudioOutputRoute("bluetooth_device", "BluetoothLE");
    public static final AudioOutputRoute BLUETOOTH_HFP = new AudioOutputRoute("bluetooth_device", "BluetoothHFP");
    public static 2JQ CONVERTER = IR0.A00(6);

    public AudioOutputRoute(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }

    public static native AudioOutputRoute createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof AudioOutputRoute)) {
                return false;
            }
            AudioOutputRoute audioOutputRoute = (AudioOutputRoute) obj;
            if (this.identifier.equals(audioOutputRoute.identifier) && this.name.equals(audioOutputRoute.name)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 7zM.A05(this.name, AbstractC2326GOr.A07(this.identifier));
    }

    public String toString() {
        return 0Pz.A0z("AudioOutputRoute{identifier=", this.identifier, ",name=", this.name, "}");
    }
}
