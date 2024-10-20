package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.0Pz;
import X.11T;
import X.C04v;
import java.util.Arrays;

/* loaded from: ImagineViewModel.class */
public final class ImagineViewModel extends C04v {
    public final ImagineRawData[] imagineRawData;

    public ImagineViewModel(ImagineRawData[] imagineRawDataArr) {
        this.imagineRawData = imagineRawDataArr;
    }

    public static /* synthetic */ ImagineViewModel copy$default(ImagineViewModel imagineViewModel, ImagineRawData[] imagineRawDataArr, int i, Object obj) {
        if ((i & 1) != 0) {
            imagineRawDataArr = imagineViewModel.imagineRawData;
        }
        return new ImagineViewModel(imagineRawDataArr);
    }

    public final ImagineRawData[] component1() {
        return this.imagineRawData;
    }

    public final ImagineViewModel copy(ImagineRawData[] imagineRawDataArr) {
        return new ImagineViewModel(imagineRawDataArr);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ImagineViewModel) && 11T.A0O(this.imagineRawData, ((ImagineViewModel) obj).imagineRawData));
    }

    public final ImagineRawData[] getImagineRawData() {
        return this.imagineRawData;
    }

    public int hashCode() {
        ImagineRawData[] imagineRawDataArr = this.imagineRawData;
        if (imagineRawDataArr == null) {
            return 0;
        }
        return Arrays.hashCode(imagineRawDataArr);
    }

    public String toString() {
        return 0Pz.A0X("ImagineViewModel(imagineRawData=", Arrays.toString(this.imagineRawData), ')');
    }
}
