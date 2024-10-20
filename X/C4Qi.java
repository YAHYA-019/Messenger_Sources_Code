package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Qi, reason: invalid class name */
/* loaded from: 4Qi.class */
public final class C4Qi extends 4sG {
    public int A00;
    public final AbstractC01033pi[] A01;

    public C4Qi(AbstractC01033pi[] abstractC01033piArr) {
        ((4sG) this).A00 = abstractC01033piArr[0];
        this.A01 = abstractC01033piArr;
        this.A00 = 1;
    }

    public static C4Qi A00(AbstractC01033pi abstractC01033pi, AbstractC01033pi abstractC01033pi2) {
        AbstractC01033pi[] abstractC01033piArr;
        if (abstractC01033pi2 instanceof C4Qi) {
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add(abstractC01033pi);
            ((C4Qi) abstractC01033pi2).A01(A0s);
            abstractC01033piArr = (AbstractC01033pi[]) A0s.toArray(new AbstractC01033pi[A0s.size()]);
        } else {
            abstractC01033piArr = new AbstractC01033pi[]{abstractC01033pi, abstractC01033pi2};
        }
        return new C4Qi(abstractC01033piArr);
    }

    private void A01(List list) {
        Object[] objArr = this.A01;
        int length = objArr.length;
        for (int i = this.A00 - 1; i < length; i++) {
            Object obj = objArr[i];
            if (obj instanceof C4Qi) {
                ((C4Qi) obj).A01(list);
            } else {
                list.add(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return r302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r302 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r0 = r301.A00;
        r0 = r301.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r0 >= r0.length) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        r301.A00 = r0 + 1;
        r0 = r0[r0];
        ((X.4sG) r301).A00 = r0;
        r302 = r0.A1K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r302 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C42h A1K() {
        /*
            r301 = this;
            r0 = r301
            X.3pi r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L45
            r0 = r302
            X.42h r0 = r0.A1K()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L43
        L12:
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r301
            X.3pi[] r0 = r0.A01
            r304 = r0
            r0 = r304
            int r0 = r0.length
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 >= r1) goto L45
            r0 = r303
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A00 = r1
            r0 = r304
            r1 = r303
            r0 = r0[r1]
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r302
            X.42h r0 = r0.A1K()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L12
        L43:
            r0 = r302
            return r0
        L45:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Qi.A1K():X.42h");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC01033pi A20() {
        C42h A1I = ((4sG) this).A00.A1I();
        if (A1I == C42h.A06 || A1I == C42h.A05) {
            int i = 1;
            while (true) {
                C42h A1K = A1K();
                if (A1K == null) {
                    break;
                }
                if (A1K._isStructStart) {
                    i++;
                } else if (A1K._isStructEnd) {
                    i--;
                    if (i == 0) {
                        return this;
                    }
                } else {
                    continue;
                }
            }
        }
        return this;
    }

    public void close() {
        while (true) {
            ((4sG) this).A00.close();
            int i = this.A00;
            AbstractC01033pi[] abstractC01033piArr = this.A01;
            if (i >= abstractC01033piArr.length) {
                return;
            }
            this.A00 = i + 1;
            ((4sG) this).A00 = abstractC01033piArr[i];
        }
    }
}
