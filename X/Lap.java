package X;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: Lap.class */
public final class Lap implements 6W2 {
    public final /* synthetic */ String A00;
    public final /* synthetic */ HashMap A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public Lap(String str, HashMap hashMap, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = z;
        this.A06 = z2;
        this.A05 = z3;
        this.A01 = hashMap;
        this.A03 = z4;
        this.A00 = str;
        this.A04 = z5;
    }

    public List Agl(String str, boolean z, boolean z2) {
        String str2;
        HashMap hashMap;
        int A03;
        6W2 r0 = 6W2.A00;
        r0.getClass();
        ArrayList A17 = 1BK.A17(r0.Agl(str, z, z2));
        6W1.A01(str, A17, this.A02, this.A06, this.A05);
        if ("video/av01".equals(str) && (hashMap = this.A01) != null && !hashMap.isEmpty()) {
            Iterator it = A17.iterator();
            while (it.hasNext()) {
                String lowerCase = ((C6b1) it.next()).A03.toLowerCase(Locale.ROOT);
                if (hashMap.containsKey(lowerCase) && ((A03 = AnonymousClass001.A03(hashMap.get(lowerCase))) == -1 || Build.VERSION.SDK_INT < A03)) {
                    it.remove();
                }
            }
        }
        if (this.A03 || ((str2 = this.A00) != null && str2.equals(str))) {
            Collections.sort(A17, new LsA(str, this, 0));
            C51f.A01("MediaCodecSelectorHelper", "%s dec order (hw first) %s", str, A17);
        }
        return A17;
    }
}
