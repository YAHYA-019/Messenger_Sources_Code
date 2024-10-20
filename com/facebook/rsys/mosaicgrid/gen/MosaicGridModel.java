package com.facebook.rsys.mosaicgrid.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: MosaicGridModel.class */
public class MosaicGridModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.ACTIVITY_RESUME);
    public static long sMcfTypeId;
    public final Map gridParticipants;

    public MosaicGridModel(Map map) {
        this.gridParticipants = map;
    }

    public static native MosaicGridModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MosaicGridModel)) {
                return false;
            }
            Map map = this.gridParticipants;
            Map map2 = ((MosaicGridModel) obj).gridParticipants;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Map map = this.gridParticipants;
        return 527 + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MosaicGridModel{gridParticipants=");
        return AbstractC2327GOs.A0U(this.gridParticipants, A0k);
    }
}
