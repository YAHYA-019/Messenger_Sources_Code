package X;

/* loaded from: Kv7.class */
public abstract class Kv7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.MRT] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.KUL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.KUL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.JbY] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.MRT, java.util.Map] */
    /* JADX WARN: Type inference failed for: r302v0, types: [X.MRT, java.util.Map] */
    public static final MRT A00(MRT mrt, MRT mrt2, KlG[] klGArr) {
        int i;
        C2856JbY c2856JbY = C2856JbY.A00;
        1AB r0 = new 1AB();
        ((LzC) r0).A02 = c2856JbY;
        ((LzC) r0).A04 = new Object();
        ((LzC) r0).A03 = c2856JbY.A00;
        ((LzC) r0).A01 = c2856JbY.size();
        r0.A00 = c2856JbY;
        int length = klGArr.length;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            KlG klG = klGArr[i2];
            KoR koR = klG.A01;
            11T.A0I(koR, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            if (!klG.A00) {
                11T.A0I(koR, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                i = mrt.containsKey(koR) ? i2 + 1 : 0;
            }
            r0.put(koR, koR.A01(klG, (MEF) mrt2.get(koR)));
        }
        LES les = ((LzC) r0).A03;
        Lz8 lz8 = r0.A00;
        if (les != lz8.A00) {
            ((LzC) r0).A04 = new Object();
            lz8 = new Lz8(les, r0.size());
        }
        r0.A00 = lz8;
        return lz8;
    }

    public static final Object A01(KoR koR, MRT mrt) {
        11T.A0I(koR, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object obj = mrt.get(koR);
        if (obj == null) {
            obj = koR instanceof C2835Jas ? ((C2835Jas) koR).A00 : koR.A00;
        }
        return ((MEF) obj).CbE(mrt);
    }
}
