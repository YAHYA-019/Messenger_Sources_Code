package com.facebook.common.dextricks.classifier;

import X.0Pz;
import android.util.Log;
import com.facebook.common.dextricks.StringTreeSet;

/* loaded from: NameClassifier.class */
public final class NameClassifier {
    /* JADX WARN: Code restructure failed: missing block: B:121:0x021a, code lost:
    
        if (r301.charAt(3) == '.') goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x025a, code lost:
    
        if (r301.charAt(5) == '3') goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0298, code lost:
    
        if (r301.charAt(10) == '.') goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r301.startsWith("test.", 9) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        if (r301.startsWith("test.", 16) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010d, code lost:
    
        if (r0 >= 13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        if (r0 >= 8) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.classifier.NameClassifier.A00(java.lang.String):boolean");
    }

    public static boolean A01(String str, String str2) {
        if (str != null) {
            try {
                if (StringTreeSet.search(str2, str)) {
                    return true;
                }
            } catch (IndexOutOfBoundsException e) {
                Log.e("NameClassifier", 0Pz.A0W("StringTreeSet search out of bounds for class: ", str2), e);
            }
        }
        return str2.length() == 38 && str2.charAt(3) == '.' && str2.charAt(13) == 'r' && str2.charAt(19) == 'L' && str2.charAt(23) == 'T' && str2.charAt(27) == 'P';
    }
}
