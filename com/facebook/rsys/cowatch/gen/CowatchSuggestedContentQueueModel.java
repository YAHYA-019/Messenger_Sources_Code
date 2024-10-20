package com.facebook.rsys.cowatch.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CowatchSuggestedContentQueueModel.class */
public class CowatchSuggestedContentQueueModel {
    public static 2JQ CONVERTER = IR0.A00(85);
    public static long sMcfTypeId;
    public final ArrayList nextMediaInfoModels;
    public final ArrayList previousMediaInfoModels;

    public CowatchSuggestedContentQueueModel(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.previousMediaInfoModels = arrayList;
        this.nextMediaInfoModels = arrayList2;
    }

    public static native CowatchSuggestedContentQueueModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CowatchSuggestedContentQueueModel)) {
                return false;
            }
            CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel = (CowatchSuggestedContentQueueModel) obj;
            if (this.previousMediaInfoModels.equals(cowatchSuggestedContentQueueModel.previousMediaInfoModels) && this.nextMediaInfoModels.equals(cowatchSuggestedContentQueueModel.nextMediaInfoModels)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.nextMediaInfoModels, AbstractC2327GOs.A08(this.previousMediaInfoModels));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchSuggestedContentQueueModel{previousMediaInfoModels=");
        A0k.append(this.previousMediaInfoModels);
        A0k.append(",nextMediaInfoModels=");
        return AbstractC2327GOs.A0U(this.nextMediaInfoModels, A0k);
    }
}
