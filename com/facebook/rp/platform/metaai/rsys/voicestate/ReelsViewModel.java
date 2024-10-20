package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.0Pz;
import X.11T;
import X.C04v;
import java.util.Arrays;

/* loaded from: ReelsViewModel.class */
public final class ReelsViewModel extends C04v {
    public final ReelsData[] reelsData;
    public final String[] reelsUrls;

    public ReelsViewModel(String[] strArr, ReelsData[] reelsDataArr) {
        this.reelsUrls = strArr;
        this.reelsData = reelsDataArr;
    }

    public static /* synthetic */ ReelsViewModel copy$default(ReelsViewModel reelsViewModel, String[] strArr, ReelsData[] reelsDataArr, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = reelsViewModel.reelsUrls;
        }
        if ((i & 2) != 0) {
            reelsDataArr = reelsViewModel.reelsData;
        }
        return new ReelsViewModel(strArr, reelsDataArr);
    }

    public final String[] component1() {
        return this.reelsUrls;
    }

    public final ReelsData[] component2() {
        return this.reelsData;
    }

    public final ReelsViewModel copy(String[] strArr, ReelsData[] reelsDataArr) {
        return new ReelsViewModel(strArr, reelsDataArr);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReelsViewModel)) {
                return false;
            }
            ReelsViewModel reelsViewModel = (ReelsViewModel) obj;
            if (!11T.A0O(this.reelsUrls, reelsViewModel.reelsUrls) || !11T.A0O(this.reelsData, reelsViewModel.reelsData)) {
                return false;
            }
        }
        return true;
    }

    public final ReelsData[] getReelsData() {
        return this.reelsData;
    }

    public final String[] getReelsUrls() {
        return this.reelsUrls;
    }

    public int hashCode() {
        String[] strArr = this.reelsUrls;
        int i = 0;
        int hashCode = (strArr == null ? 0 : Arrays.hashCode(strArr)) * 31;
        ReelsData[] reelsDataArr = this.reelsData;
        if (reelsDataArr != null) {
            i = Arrays.hashCode(reelsDataArr);
        }
        return hashCode + i;
    }

    public String toString() {
        return 0Pz.A0w("ReelsViewModel(reelsUrls=", Arrays.toString(this.reelsUrls), ", reelsData=", Arrays.toString(this.reelsData), ')');
    }
}
