package com.facebook.rsys.audio.gen;

import X.0Pz;
import X.2JQ;
import X.7zM;
import X.AbstractC2326GOr;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: AudioInputRoute.class */
public class AudioInputRoute {
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;
    public static final AudioInputRoute DEFAULT = new AudioInputRoute("default_audio_input_route", "Default audio input route");
    public static 2JQ CONVERTER = IR0.A00(4);

    public AudioInputRoute(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }

    public static native AudioInputRoute createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof AudioInputRoute)) {
                return false;
            }
            AudioInputRoute audioInputRoute = (AudioInputRoute) obj;
            if (this.identifier.equals(audioInputRoute.identifier) && this.name.equals(audioInputRoute.name)) {
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
        return 0Pz.A0z("AudioInputRoute{identifier=", this.identifier, ",name=", this.name, "}");
    }
}
