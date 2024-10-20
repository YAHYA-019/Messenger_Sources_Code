package androidx.compose.animation.core;

import X.0DE;
import X.7zU;
import X.AnonymousClass001;
import X.Km5;
import X.KuM;
import X.LNu;
import X.MKm;
import X.MN4;
import X.MRX;
import kotlin.jvm.functions.Function1;

/* loaded from: SuspendAnimationKt.class */
public abstract class SuspendAnimationKt {
    public static final float A00(0DE r301) {
        float f;
        MRX mrx = (MRX) r301.get(MRX.A00);
        if (mrx != null) {
            f = mrx.B8n();
            if (f < 0.0f) {
                throw AnonymousClass001.A0N("negative scale factor");
            }
        } else {
            f = 1.0f;
        }
        return f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(13:5|6|7|(2:9|(2:17|18)(3:13|14|15))(2:58|(16:60|61|62|63|64|65|66|67|68|69|70|71|72|(5:74|75|76|77|78)(4:79|80|81|82)|47|(2:49|50))(13:83|84|85|86|87|88|89|90|91|92|93|94|95))|19|20|21|22|23|24|25|26|(25:28|29|30|31|32|33|34|35|36|37|38|39|40|(5:42|43|44|45|46)(4:51|52|53|54)|47|(0)|19|20|21|22|23|24|25|26|(2:55|56)(0))(0)))|109|6|7|(0)(0)|19|20|21|22|23|24|25|26|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b9, code lost:
    
        r0 = (X.Km5) r320.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c5, code lost:
    
        if (r0 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e4, code lost:
    
        if (r318 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e7, code lost:
    
        r307.A03 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ef, code lost:
    
        throw r319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02f0, code lost:
    
        r318 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x029b, code lost:
    
        r319 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x029d, code lost:
    
        r0 = (X.Km5) r320.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02a9, code lost:
    
        if (r0 != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02ac, code lost:
    
        X.7zU.A13(r0.A05, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fa A[Catch: CancellationException -> 0x029b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x029b, blocks: (B:18:0x00a3, B:20:0x01d6, B:21:0x01db, B:23:0x01e2, B:24:0x01e7, B:25:0x01ee, B:28:0x01fa, B:29:0x0203, B:30:0x020a, B:32:0x0225, B:33:0x022c, B:34:0x0233, B:35:0x023a, B:36:0x0241, B:37:0x0248, B:39:0x024f, B:42:0x025b, B:43:0x0264, B:45:0x026b, B:46:0x0275, B:52:0x0281, B:54:0x028a, B:60:0x00e4, B:61:0x00ed, B:62:0x00f4, B:64:0x0107, B:65:0x010e, B:66:0x0115, B:67:0x011c, B:68:0x0123, B:69:0x012a, B:71:0x0131, B:74:0x013d, B:75:0x0146, B:77:0x014d, B:78:0x0157, B:80:0x0163, B:82:0x016c, B:83:0x0176, B:84:0x017f, B:86:0x018a, B:87:0x0191, B:89:0x01a4, B:91:0x01ab, B:92:0x01b2, B:94:0x01c8, B:95:0x01cf), top: B:7:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /* JADX WARN: Type inference failed for: r320v1, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0295 -> B:19:0x01d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(X.MKm r301, X.LNu r302, X.0DR r303, kotlin.jvm.functions.Function1 r304, long r305) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.A01(X.MKm, X.LNu, X.0DR, kotlin.jvm.functions.Function1, long):java.lang.Object");
    }

    public static final void A02(MKm mKm, Km5 km5, LNu lNu, Function1 function1, float f, long j) {
        long AiY = f == 0.0f ? mKm.AiY() : ((float) (j - km5.A03)) / f;
        km5.A01 = j;
        km5.A06.Cvx(mKm.BIq(AiY));
        km5.A02 = mKm.BJ6(AiY);
        if (mKm.BSk(AiY)) {
            km5.A00 = km5.A01;
            7zU.A13(km5.A05, false);
        }
        A03(km5, lNu);
        function1.invoke(km5);
    }

    public static final void A03(Km5 km5, LNu lNu) {
        lNu.A05.Cvx(km5.A06.getValue());
        KuM kuM = lNu.A02;
        KuM kuM2 = km5.A02;
        int A02 = kuM.A02();
        for (int i = 0; i < A02; i++) {
            kuM.A05(i, kuM2.A01(i));
        }
        lNu.A00 = km5.A00;
        lNu.A01 = km5.A01;
        lNu.A03 = MN4.A01(km5.A05);
    }
}
