package X;

import java.util.HashSet;

/* loaded from: N97.class */
public final class N97 extends HashSet {
    public final int A00;

    public N97(int i) {
        String str;
        String str2;
        this.A00 = i;
        if (i == 0) {
            MRl.A0T("alps", "M4_Note", this);
            MRl.A0T("HTC", "HTC One M9", this);
            MRl.A0T("HTC", "0PJA10", this);
            MRl.A0T("HTC", "HTC 0PJA10", this);
            MRl.A0T("HTC", "HTC_0PJA10", this);
            MRl.A0T("HTC", "HTC_M9u", this);
            MRl.A0T("HTC", "0PJA2", this);
            MRl.A0T("HTC", "HTC6535LRA", this);
            MRl.A0T("HTC", "HTC6535LVW", this);
            str = "Huawei";
            MRl.A0T(str, "ALP-L09", this);
            MRl.A0T(str, "ALP-L29", this);
            MRl.A0T(str, "ALP-AL00", this);
            MRl.A0T(str, "ALP-TL00", this);
            MRl.A0T(str, "BLP-L09", this);
            MRl.A0T(str, "BLP-L29", this);
            MRl.A0T(str, "BLP-AL00", this);
            MRl.A0T(str, "BLP-TL00", this);
            MRl.A0T("Google", "Pixel", this);
            MRl.A0T("Google", "Pixel XL", this);
            MRl.A0T("Google", "Pixel 2", this);
            MRl.A0T("Google", "Pixel 2 XL", this);
            str2 = "Nexus 6P";
        } else {
            if (L64.A01('U', 'K', '5')) {
                return;
            }
            str = "samsung";
            MRl.A0T(str, "SM-G991B", this);
            MRl.A0T(str, "SM-G991N", this);
            MRl.A0T(str, "SM-G996B", this);
            MRl.A0T(str, "SM-G996N", this);
            MRl.A0T(str, "SM-G998B", this);
            str2 = "SM-G998N";
        }
        MRl.A0T(str, str2, this);
    }
}
