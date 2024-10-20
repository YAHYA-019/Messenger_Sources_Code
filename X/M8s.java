package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.AbstractCollection;
import kotlin.jvm.functions.Function2;

/* loaded from: M8s.class */
public final class M8s extends C00q implements Function2 {
    public final /* synthetic */ int $beyondBoundsItemCount;
    public final /* synthetic */ MBG $contentPadding;
    public final /* synthetic */ 2aI $coroutineScope;
    public final /* synthetic */ MEJ $graphicsContext;
    public final /* synthetic */ AXO $horizontalAlignment;
    public final /* synthetic */ MHo $horizontalArrangement;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C00m $itemProviderLambda;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ boolean $stickyHeadersEnabled;
    public final /* synthetic */ MBV $verticalAlignment;
    public final /* synthetic */ MHp $verticalArrangement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8s(MHo mHo, MHp mHp, MBG mbg, LazyListState lazyListState, AXO axo, MBV mbv, MEJ mej, C00m c00m, 2aI r310, int i, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$state = lazyListState;
        this.$isVertical = z;
        this.$contentPadding = mbg;
        this.$reverseLayout = z2;
        this.$itemProviderLambda = c00m;
        this.$verticalArrangement = mHp;
        this.$horizontalArrangement = mHo;
        this.$stickyHeadersEnabled = z3;
        this.$beyondBoundsItemCount = i;
        this.$coroutineScope = r310;
        this.$graphicsContext = mej;
        this.$horizontalAlignment = axo;
        this.$verticalAlignment = mbv;
    }

    public static final int A00(MJL mjl, Object obj, int i) {
        int AqU;
        if (obj != null) {
            LN9 ln9 = (LN9) mjl;
            int i2 = ln9.A01.A00.A00;
            if (i2 != 0 && ((i >= i2 || !obj.equals(mjl.Asl(i))) && (AqU = ln9.A02.AqU(obj)) != -1)) {
                return AqU;
            }
        }
        return i;
    }

    public static void A01(L0y l0y, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(L0y.A00(l0y, i, l0y.A00));
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0958, code lost:
    
        if (java.lang.Math.abs(r0) < java.lang.Math.abs(r345)) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0c7f, code lost:
    
        r317 = r317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0c81, code lost:
    
        if (r0 != null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0dc1, code lost:
    
        if (r0 == false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0ef5, code lost:
    
        if (r317.isEmpty() == false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x12ec, code lost:
    
        if (r322 > r337) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x04bb, code lost:
    
        if (r0 > 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x04be, code lost:
    
        r0 = (X.Ksg) r0[r345];
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x04d1, code lost:
    
        if (r0.A01 >= r322) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x04d4, code lost:
    
        r322 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x04da, code lost:
    
        r345 = r345 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x04e4, code lost:
    
        if (r345 < r0) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x04e9, code lost:
    
        if (r322 < 0) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x04ec, code lost:
    
        r321 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x04f5, code lost:
    
        if (r0 <= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x04f8, code lost:
    
        r345 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0501, code lost:
    
        r0 = (X.Ksg) r0[r345];
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0514, code lost:
    
        if (r0.A00 <= r321) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0517, code lost:
    
        r321 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x051d, code lost:
    
        r345 = r345 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0527, code lost:
    
        if (r345 < r0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0049, code lost:
    
        if (r0.BU2() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x052a, code lost:
    
        r304 = new X.07E(r322, X.JQx.A0D(r0.A00, 1, r321));
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x146a, code lost:
    
        throw X.AnonymousClass001.A0L("negative minIndex");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x145d  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x05ee A[LOOP:26: B:521:0x05ee->B:523:0x05ff, LOOP_START, PHI: r345
  0x05ee: PHI (r345v3 int) = (r345v2 int), (r345v4 int) binds: [B:520:0x05eb, B:523:0x05ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x040a  */
    /* JADX WARN: Type inference failed for: r0v1212, types: [X.0ty] */
    /* JADX WARN: Type inference failed for: r0v867, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v908, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r317v10 */
    /* JADX WARN: Type inference failed for: r317v18 */
    /* JADX WARN: Type inference failed for: r317v19 */
    /* JADX WARN: Type inference failed for: r317v20 */
    /* JADX WARN: Type inference failed for: r317v21 */
    /* JADX WARN: Type inference failed for: r317v22 */
    /* JADX WARN: Type inference failed for: r317v23 */
    /* JADX WARN: Type inference failed for: r317v24 */
    /* JADX WARN: Type inference failed for: r317v25 */
    /* JADX WARN: Type inference failed for: r317v26 */
    /* JADX WARN: Type inference failed for: r317v28 */
    /* JADX WARN: Type inference failed for: r317v29 */
    /* JADX WARN: Type inference failed for: r317v30, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r317v47 */
    /* JADX WARN: Type inference failed for: r317v48 */
    /* JADX WARN: Type inference failed for: r317v49 */
    /* JADX WARN: Type inference failed for: r317v50 */
    /* JADX WARN: Type inference failed for: r317v51 */
    /* JADX WARN: Type inference failed for: r317v52 */
    /* JADX WARN: Type inference failed for: r317v53 */
    /* JADX WARN: Type inference failed for: r317v54 */
    /* JADX WARN: Type inference failed for: r317v55 */
    /* JADX WARN: Type inference failed for: r317v56 */
    /* JADX WARN: Type inference failed for: r317v57 */
    /* JADX WARN: Type inference failed for: r317v7 */
    /* JADX WARN: Type inference failed for: r317v8 */
    /* JADX WARN: Type inference failed for: r317v9 */
    /* JADX WARN: Type inference failed for: r329v1 */
    /* JADX WARN: Type inference failed for: r329v12 */
    /* JADX WARN: Type inference failed for: r329v13 */
    /* JADX WARN: Type inference failed for: r329v14 */
    /* JADX WARN: Type inference failed for: r329v15, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r329v2 */
    /* JADX WARN: Type inference failed for: r329v21 */
    /* JADX WARN: Type inference failed for: r329v22 */
    /* JADX WARN: Type inference failed for: r329v23 */
    /* JADX WARN: Type inference failed for: r329v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:222:0x0c5a -> B:216:0x0c30). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x0c81 -> B:216:0x0c30). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x0c81 -> B:217:0x0c39). Please report as a decompilation issue!!! */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 5255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M8s.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
