package com.facebook.rsys.stream.gen;

import X.1BK;
import X.2JQ;
import X.7zP;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: StreamModel.class */
public class StreamModel {
    public static 2JQ CONVERTER = LVi.A00(63);
    public static long sMcfTypeId;
    public final HashSet allowedCustomVideoContentTypes;
    public final ArrayList localVideoStreams;
    public final HashSet processedUserIds;
    public final ArrayList supportedCustomVideoCodecs;

    public StreamModel(ArrayList arrayList, HashSet hashSet, HashSet hashSet2, ArrayList arrayList2) {
        7zP.A1S(hashSet, hashSet2, arrayList2);
        this.supportedCustomVideoCodecs = arrayList;
        this.allowedCustomVideoContentTypes = hashSet;
        this.processedUserIds = hashSet2;
        this.localVideoStreams = arrayList2;
    }

    public static native StreamModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StreamModel)) {
                return false;
            }
            StreamModel streamModel = (StreamModel) obj;
            ArrayList arrayList = this.supportedCustomVideoCodecs;
            ArrayList arrayList2 = streamModel.supportedCustomVideoCodecs;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            if (!this.allowedCustomVideoContentTypes.equals(streamModel.allowedCustomVideoContentTypes) || !this.processedUserIds.equals(streamModel.processedUserIds) || !this.localVideoStreams.equals(streamModel.localVideoStreams)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.localVideoStreams, AnonymousClass002.A05(this.processedUserIds, AnonymousClass002.A05(this.allowedCustomVideoContentTypes, AbstractC2326GOr.A03(AnonymousClass001.A02(this.supportedCustomVideoCodecs)))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("StreamModel{supportedCustomVideoCodecs=");
        A0k.append(this.supportedCustomVideoCodecs);
        A0k.append(",allowedCustomVideoContentTypes=");
        A0k.append(this.allowedCustomVideoContentTypes);
        A0k.append(",processedUserIds=");
        A0k.append(this.processedUserIds);
        A0k.append(",localVideoStreams=");
        return AbstractC2327GOs.A0U(this.localVideoStreams, A0k);
    }
}
