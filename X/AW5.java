package X;

import kotlin.jvm.functions.Function2;

/* loaded from: AW5.class */
public final class AW5 extends C00q implements Function2 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AW5(Object obj, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
    }

    public static Object A00(Object obj, AW5 aw5) {
        11T.A0F(obj, 1);
        return aw5.A01;
    }

    public static void A01(C2ln c2ln, Object obj, Object[] objArr, int i) {
        c2ln.A02(new AW5(obj, i), objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x0e98, code lost:
    
        if (r311 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0ea4, code lost:
    
        if ((r311 instanceof android.app.Activity) == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0ecc, code lost:
    
        if ((r311 instanceof android.content.ContextWrapper) == false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0ecf, code lost:
    
        r0 = (android.content.ContextWrapper) r311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0ed8, code lost:
    
        if (r0 == null) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0edb, code lost:
    
        r311 = r0.getBaseContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0ee4, code lost:
    
        if (r311 == null) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0ea7, code lost:
    
        r0 = (android.app.Activity) r311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0eb0, code lost:
    
        if (r0 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0eb3, code lost:
    
        r304 = new com.facebook.common.util.lifecycle.ViewOwnerTracker(r0, null, r308);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x1977, code lost:
    
        if (r308 == null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x1a0c, code lost:
    
        if (r311 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x1a0f, code lost:
    
        r311 = X.0S2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x1a14, code lost:
    
        r0 = (X.9Zm) r301.A01;
        r0 = r0.A05.A02;
        r328 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x1a32, code lost:
    
        if (r0 == null) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x1a40, code lost:
    
        if (r0.A00 != true) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x1a45, code lost:
    
        if (r0 == null) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x1a48, code lost:
    
        r0 = (java.util.AbstractCollection) r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x1a54, code lost:
    
        if (r0 == null) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x1a57, code lost:
    
        r316 = X.1BL.A0z(r0);
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x1a70, code lost:
    
        if (r0.hasNext() == false) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x1a73, code lost:
    
        r0 = (X.8JQ) r0.next();
        r0 = r0.A08;
        r334 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x1a91, code lost:
    
        if (r0 != null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x1a94, code lost:
    
        r334 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x1a98, code lost:
    
        r0 = r0.A07;
        r306 = r0.A0D;
        r369 = r306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x1ab0, code lost:
    
        if (r306 != null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x1ab3, code lost:
    
        r369 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x1ab7, code lost:
    
        r0 = ((X.0AC) X.1Br.A0B(r0.A03)).A03(r0.A05, r0.A0F, r0.A0E);
        r0 = r0.A0A;
        r0 = r0.A00;
        r0 = X.9DD.A00(r0, r0.A06);
        r0 = r0.A01;
        r0 = r0.A00;
        r0 = X.9DD.A00(r0, r0.A0C);
        r0 = X.11T.A0O(r0.A0B, "video/mp4");
        r0 = r0.A02;
        r0 = java.lang.String.valueOf(X.L1M.A00.A00(r0, r0));
        r0 = r0.getString(2131952747);
        r0 = r0.A04.A00;
        r0 = ((X.C6jQ) r0.get()).A0I;
        r0 = r0.A03;
        r305 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x1b83, code lost:
    
        if (r0.isEmpty() != false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x1b86, code lost:
    
        r0 = r0.A0F();
        X.11T.A0A(r0);
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x1ba6, code lost:
    
        if (r0.hasNext() == false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x1ba9, code lost:
    
        r314 = r0.next();
        r0 = r314;
        X.11T.A0D(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x1bd7, code lost:
    
        if (((com.facebook.xapp.messaging.reactions.reactors.model.Reactor) r0.getValue()).A03 == false) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x1bda, code lost:
    
        r0 = r314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x1be3, code lost:
    
        if (r0 == null) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x1be6, code lost:
    
        r305 = (java.lang.String) r0.getKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x1bf2, code lost:
    
        r305 = new com.facebook.messaging.rollcall.presentation.viewer.model.ContributionReactionsViewState(r0, r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x1ca1, code lost:
    
        r314 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x1c04, code lost:
    
        r0 = ((X.C6jQ) r0.get()).A08;
        r0 = X.0S2.A00;
        r0 = X.2MQ.A1E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x1c23, code lost:
    
        if (r306 != null) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x1c26, code lost:
    
        r306 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x1c2a, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x1c33, code lost:
    
        if (r0 == null) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x1c36, code lost:
    
        r0 = r0.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x1c3d, code lost:
    
        r316.add(new X.8KV(r0, r0, r0, r305, (com.facebook.secure.secrettypes.SecretString) null, r0, r0, r334, r0, r369, r0, r0, r0, r0, r306, r0.A09, 0.0f, r0, r0, r0, r0, r0, false, false, false, r0, r0, true, true, true, false, false, true, true, false, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x1c9b, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x1d1f, code lost:
    
        return new X.8KB(r311, r0, r308, r316, r365, r0, r347, r339, r328);
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x1cf0, code lost:
    
        r316 = X.C0ty.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x1cad, code lost:
    
        r328 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x1cd4, code lost:
    
        if (r0 != null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x1cc9, code lost:
    
        if (r0 != null) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x1cbe, code lost:
    
        if (r0 != null) goto L352;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0e09  */
    /* JADX WARN: Type inference failed for: r0v1169, types: [X.AQe] */
    /* JADX WARN: Type inference failed for: r0v1170, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v1185, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v239, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v241, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v559, types: [android.widget.TextView, com.facebook.widget.text.BetterTextView, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v751 */
    /* JADX WARN: Type inference failed for: r0v765, types: [X.9pz] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r305v48, types: [android.widget.TextView, java.lang.Object, android.widget.EditText] */
    /* JADX WARN: Type inference failed for: r308v15, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r308v16, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r308v18, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r316v1 */
    /* JADX WARN: Type inference failed for: r316v2 */
    /* JADX WARN: Type inference failed for: r316v3, types: [java.util.AbstractCollection] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 7744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW5.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
