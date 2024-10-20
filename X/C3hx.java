package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3hx, reason: invalid class name */
/* loaded from: 3hx.class */
public final class C3hx implements Runnable {
    public static final String __redex_internal_original_name = "TTRCQuickEventListener$3";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1cM A01;
    public final /* synthetic */ 1cK A02;

    public C3hx(1cM r302, 1cK r303, int i) {
        this.A02 = r303;
        this.A01 = r302;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        int length;
        1cM r0 = this.A01;
        boolean A1O = AnonymousClass001.A1O(r0.A00);
        1cK r02 = this.A02;
        java.util.Map map = r02.A04;
        int i = this.A00;
        Integer valueOf = Integer.valueOf(i);
        List list = (List) (A1O ? map.get(valueOf) : map.remove(valueOf));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((3LE) it.next()).A01.A00(r0);
            }
        }
        if (A1O) {
            return;
        }
        int[] iArr = r02.A00;
        int i2 = 0;
        if (iArr == null || (length = iArr.length) == 0) {
            return;
        }
        int i3 = length - 1;
        int[] iArr2 = new int[i3];
        int i4 = 0;
        do {
            int i5 = iArr[i2];
            if (i5 != i) {
                if (i4 == i3) {
                    return;
                }
                iArr2[i4] = i5;
                i4++;
            }
            i2++;
        } while (i2 < length);
        r02.A00 = iArr2;
        1BK.A0U(r02.A01).updateListenerMarkers();
    }
}
