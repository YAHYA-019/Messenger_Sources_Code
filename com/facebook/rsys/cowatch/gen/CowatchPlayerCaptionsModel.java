package com.facebook.rsys.cowatch.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CowatchPlayerCaptionsModel.class */
public class CowatchPlayerCaptionsModel {
    public static 2JQ CONVERTER = IR0.A00(79);
    public static long sMcfTypeId;
    public final ArrayList captions;

    public CowatchPlayerCaptionsModel(ArrayList arrayList) {
        arrayList.getClass();
        this.captions = arrayList;
    }

    public static native CowatchPlayerCaptionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CowatchPlayerCaptionsModel) {
            return this.captions.equals(((CowatchPlayerCaptionsModel) obj).captions);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.captions.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchPlayerCaptionsModel{captions=");
        return AbstractC2327GOs.A0U(this.captions, A0k);
    }
}
