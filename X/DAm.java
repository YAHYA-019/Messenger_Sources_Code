package X;

import com.facebook.user.model.User;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: DAm.class */
public final class DAm implements Comparator {
    public final boolean A00;
    public final java.util.Map A01 = AnonymousClass001.A0u();

    public DAm(Collection collection, boolean z) {
        this.A00 = z;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            User A0t = AbG.A0t(it);
            String A13 = 7zL.A13(A0t);
            BoG boG = (BoG) this.A01.get(A13);
            if (boG == null) {
                boG = new BoG();
                this.A01.put(A13, boG);
            }
            Float f = boG.A00;
            if (f == null || f.floatValue() < A0t.A08) {
                boG.A00 = Float.valueOf(A0t.A08);
            }
            if (A0t.A1e) {
                boG.A01 = true;
            }
            if (A0t.A0G()) {
                boG.A02 = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008d, code lost:
    
        if (r0 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r0 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        if (r0 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        if (r312 == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
    
        r311 = java.lang.Float.compare(r303.A08, r302.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0128, code lost:
    
        if (r311 != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012b, code lost:
    
        r314 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0140, code lost:
    
        if (com.facebook.user.model.User.A01(r302.A0e) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0152, code lost:
    
        if (com.facebook.user.model.User.A01(r303.A0e) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015d, code lost:
    
        if (r302.A03() == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0160, code lost:
    
        r0 = r302.A03().A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0178, code lost:
    
        if (r0 == 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0187, code lost:
    
        if (r0 != 17) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018a, code lost:
    
        r315 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0195, code lost:
    
        if (r303.A03() == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0198, code lost:
    
        r0 = r303.A03().A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b0, code lost:
    
        if (r0 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01bf, code lost:
    
        if (r0 != 17) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c2, code lost:
    
        r314 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c9, code lost:
    
        if (r315 == r314) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cc, code lost:
    
        r311 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d5, code lost:
    
        if (r315 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d8, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01da, code lost:
    
        r315 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01eb, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fc, code lost:
    
        if (r313 == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
    
        if (r0 != false) goto L12;
     */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compare(com.facebook.user.model.User r302, com.facebook.user.model.User r303) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAm.compare(com.facebook.user.model.User, com.facebook.user.model.User):int");
    }
}
