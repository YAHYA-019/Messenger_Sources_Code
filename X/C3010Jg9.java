package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: X.Jg9, reason: case insensitive filesystem */
/* loaded from: Jg9.class */
public final class C3010Jg9 extends 5WJ {
    public final /* synthetic */ BottomSheetBehavior A00;

    public C3010Jg9(BottomSheetBehavior bottomSheetBehavior) {
        this.A00 = bottomSheetBehavior;
    }

    public int A01(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        return bottomSheetBehavior.A0R ? bottomSheetBehavior.A0C : bottomSheetBehavior.A04;
    }

    public int A02(View view, int i, int i2) {
        return view.getLeft();
    }

    public int A03(View view, int i, int i2) {
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        int A08 = bottomSheetBehavior.A08();
        int i3 = bottomSheetBehavior.A0R ? bottomSheetBehavior.A0C : bottomSheetBehavior.A04;
        if (i >= A08) {
            A08 = i;
            if (i > i3) {
                return i3;
            }
        }
        return A08;
    }

    public void A04(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.A00;
            if (bottomSheetBehavior.A0O) {
                bottomSheetBehavior.A0C(1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f1, code lost:
    
        r310 = r0.A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ee, code lost:
    
        if (r0 < X.GOn.A05(r0, r310)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d2, code lost:
    
        if (r0 < X.GOn.A05(r313, r312)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0179, code lost:
    
        r310 = r312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0176, code lost:
    
        if (r0 >= X.GOn.A05(r313, r312)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a2, code lost:
    
        if (r313 < X.GOn.A05(r313, r0.A04)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r0 > r310) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        r307 = 6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(android.view.View r302, float r303, float r304) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3010Jg9.A05(android.view.View, float, float):void");
    }

    public void A07(View view, int i, int i2, int i3, int i4) {
        this.A00.A0A(i2);
    }

    public boolean A08(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        View A0G;
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        int i2 = bottomSheetBehavior.A0G;
        if (i2 == 1 || bottomSheetBehavior.A0X) {
            return false;
        }
        return ((i2 == 3 && bottomSheetBehavior.A03 == i && (weakReference2 = bottomSheetBehavior.A0L) != null && (A0G = DKC.A0G(weakReference2)) != null && A0G.canScrollVertically(-1)) || (weakReference = bottomSheetBehavior.A0M) == null || weakReference.get() != view) ? false : true;
    }
}
