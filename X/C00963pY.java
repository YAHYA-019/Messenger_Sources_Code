package X;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3pY, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3pY.class */
public final class C00963pY {
    public HashSet A00;
    public LinkedHashMap A01;
    public LinkedHashMap A02;
    public LinkedList A03;
    public LinkedList A04;
    public LinkedList A05;
    public LinkedList A06;
    public LinkedList A07;
    public LinkedList A08;
    public LinkedList A09;
    public boolean A0A;
    public final AnonymousClass248 A0B;
    public final 24S A0C;
    public final AnonymousClass253 A0D;
    public final C67i A0E;
    public final C24q A0F;
    public final C25j A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C00963pY(24S r302, AnonymousClass253 anonymousClass253, C67i c67i, C24q c24q, boolean z) {
        AnonymousClass248 anonymousClass248;
        this.A0D = anonymousClass253;
        this.A0H = z;
        this.A0C = r302;
        this.A0F = c24q;
        if (anonymousClass253.A08()) {
            this.A0I = true;
            anonymousClass248 = anonymousClass253.A02();
        } else {
            anonymousClass248 = Jxc.A00;
        }
        this.A0B = anonymousClass248;
        this.A0G = anonymousClass253.A06(c24q, r302._class);
        this.A0E = c67i;
    }

    private AnonymousClass686 A00(String str, java.util.Map map) {
        AnonymousClass686 anonymousClass686 = (AnonymousClass686) map.get(str);
        if (anonymousClass686 == null) {
            AnonymousClass253 anonymousClass253 = this.A0D;
            AnonymousClass248 anonymousClass248 = this.A0B;
            boolean z = this.A0H;
            C26G A00 = C26G.A00(str);
            anonymousClass686 = new AnonymousClass686(anonymousClass248, A00, A00, anonymousClass253, z);
            map.put(str, anonymousClass686);
        }
        return anonymousClass686;
    }

    private void A01(7Ro r302, AbstractC00953pX abstractC00953pX) {
        if (r302 != null) {
            Object obj = r302._id;
            LinkedHashMap linkedHashMap = this.A01;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.A01 = linkedHashMap;
            }
            Object put = linkedHashMap.put(obj, abstractC00953pX);
            if (put == null || put.getClass() != abstractC00953pX.getClass()) {
                return;
            }
            String A0Y = AnonymousClass001.A0Y(obj);
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Duplicate injectable value with id '");
            A0k.append(obj);
            A0k.append("' (of type ");
            A0k.append(A0Y);
            throw AnonymousClass002.A0D(")", A0k);
        }
    }

    private void A02(68H r302, java.util.Map map) {
        boolean z;
        68P A05;
        AnonymousClass686 A00;
        AnonymousClass248 anonymousClass248 = this.A0B;
        C26G A0F = anonymousClass248.A0F(r302);
        if (A0F != null) {
            z = true;
            if (!A0F.A02()) {
                if ("".isEmpty()) {
                    String str = A0F._simpleName;
                    A00 = (AnonymousClass686) map.get(str);
                    if (A00 == null) {
                        A00 = new AnonymousClass686(anonymousClass248, A0F, A0F, this.A0D, this.A0H);
                        map.put(str, A00);
                    }
                    A00.A00 = new AnonymousClass689(A0F, A00.A00, r302, z, true, false);
                    this.A07.add(A00);
                }
                A00 = A00("", map);
                A00.A00 = new AnonymousClass689(A0F, A00.A00, r302, z, true, false);
                this.A07.add(A00);
            }
        }
        z = false;
        if ("".isEmpty() || (A05 = anonymousClass248.A05(r302._owner)) == null || A05 == 68P.A03) {
            return;
        }
        A0F = C26G.A00("");
        A00 = A00("", map);
        A00.A00 = new AnonymousClass689(A0F, A00.A00, r302, z, true, false);
        this.A07.add(A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x04d2, code lost:
    
        if (r316 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x07b8, code lost:
    
        r0 = r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x07bc, code lost:
    
        r316 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x07be, code lost:
    
        if (r316 == null) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x07ca, code lost:
    
        if (r316.A03 != false) goto L624;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x07cd, code lost:
    
        r0 = r316.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0846, code lost:
    
        if (r0.A0T() != false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0862, code lost:
    
        if (r315 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0865, code lost:
    
        r315 = r315.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x086c, code lost:
    
        r0.A01 = r315;
        r306 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x087c, code lost:
    
        if (r306 == null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x087f, code lost:
    
        r306 = r306.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0886, code lost:
    
        r0.A02 = r306;
        r306 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0896, code lost:
    
        if (r306 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0899, code lost:
    
        r306 = r306.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x08a0, code lost:
    
        r0.A03 = r306;
        r306 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x08b0, code lost:
    
        if (r306 == null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x08b3, code lost:
    
        r306 = r306.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x08ba, code lost:
    
        r0.A00 = r306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x08ca, code lost:
    
        if (r0.A0O() != false) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0850, code lost:
    
        r301.A06(r0.A0M());
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0849, code lost:
    
        r0.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x07d7, code lost:
    
        r0 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x07de, code lost:
    
        r316 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x07e0, code lost:
    
        if (r316 == null) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x07ec, code lost:
    
        if (r316.A03 != false) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x07ef, code lost:
    
        r0 = r316.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x07f9, code lost:
    
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0800, code lost:
    
        r316 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0802, code lost:
    
        if (r316 == null) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x080e, code lost:
    
        if (r316.A03 != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0811, code lost:
    
        r0 = r316.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x081b, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0822, code lost:
    
        r316 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0824, code lost:
    
        if (r316 == null) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0830, code lost:
    
        if (r316.A03 != false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0833, code lost:
    
        r0 = r316.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0964, code lost:
    
        if (r306 != r0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0969, code lost:
    
        if (r306 != null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0abe, code lost:
    
        if (r306 != r0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0aec, code lost:
    
        if (r306 != r0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0bae, code lost:
    
        if (r306 != r0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0b24, code lost:
    
        if (r306 != r0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0b52, code lost:
    
        if (r306 != r0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0b80, code lost:
    
        if (r306 != r0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (r301.A0D.A09(X.AnonymousClass260.A06) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0f6a, code lost:
    
        if (r306 != null) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x10da, code lost:
    
        if (r316.A02 == null) goto L451;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0a2b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0987 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0b92  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x1043  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1065  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x1020  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x102b  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x106f  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x1080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x1169  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x11f3  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x122c  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x127b  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x12cd  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x12f2 A[LOOP:26: B:632:0x12e4->B:634:0x12f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:638:0x1340  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x13c7  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x145a  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x1312  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x1517 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:702:0x1520  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c5  */
    /* JADX WARN: Type inference failed for: r0v196, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.248] */
    /* JADX WARN: Type inference failed for: r0v909, types: [X.68D, X.24r, X.3pX, X.3pW, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v960, types: [X.67i] */
    /* JADX WARN: Type inference failed for: r313v3, types: [java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(X.C00963pY r301) {
        /*
            Method dump skipped, instructions count: 5435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00963pY.A03(X.3pY):void");
    }

    public static void A04(C00963pY c00963pY, String str, Object... objArr) {
        String format = String.format(str, objArr);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Problem with definition of ");
        A0k.append(c00963pY.A0F);
        A0k.append(": ");
        throw AnonymousClass002.A0D(format, A0k);
    }

    public static boolean A05(AnonymousClass686 anonymousClass686, List list) {
        if (list == null) {
            return false;
        }
        String str = anonymousClass686.A05._simpleName;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return false;
            }
            if (((AnonymousClass686) list.get(i2)).A05._simpleName.equals(str)) {
                list.set(i2, anonymousClass686);
                return true;
            }
            i = i2 + 1;
        }
    }

    private void A06(String str) {
        if (this.A0H || str == null) {
            return;
        }
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.A00 = hashSet;
        }
        hashSet.add(str);
    }
}
