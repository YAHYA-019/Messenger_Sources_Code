package X;

/* loaded from: KuM.class */
public abstract class KuM {
    public static KuM A00(KuM kuM) {
        KuM A03 = kuM.A03();
        11T.A0I(A03, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return A03;
    }

    public float A01(int i) {
        if (this instanceof C2824Jag) {
            C2824Jag c2824Jag = (C2824Jag) this;
            if (i == 0) {
                return c2824Jag.A00;
            }
            if (i == 1) {
                return c2824Jag.A01;
            }
            if (i == 2) {
                return c2824Jag.A02;
            }
            if (i == 3) {
                return c2824Jag.A03;
            }
            return 0.0f;
        }
        if (this instanceof C2823Jaf) {
            C2823Jaf c2823Jaf = (C2823Jaf) this;
            if (i == 0) {
                return c2823Jaf.A00;
            }
            if (i == 1) {
                return c2823Jaf.A01;
            }
            if (i == 2) {
                return c2823Jaf.A02;
            }
            return 0.0f;
        }
        if (!(this instanceof C2822Jae)) {
            C2821Jad c2821Jad = (C2821Jad) this;
            if (i == 0) {
                return c2821Jad.A00;
            }
            return 0.0f;
        }
        C2822Jae c2822Jae = (C2822Jae) this;
        if (i == 0) {
            return c2822Jae.A00;
        }
        if (i == 1) {
            return c2822Jae.A01;
        }
        return 0.0f;
    }

    public int A02() {
        if (this instanceof C2824Jag) {
            return 4;
        }
        if (this instanceof C2823Jaf) {
            return 3;
        }
        return this instanceof C2822Jae ? 2 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.KuM, X.Jae, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.KuM, X.Jaf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.KuM, X.Jag, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.KuM, X.Jad, java.lang.Object] */
    public KuM A03() {
        if (this instanceof C2824Jag) {
            ?? obj = new Object();
            obj.A00 = 0.0f;
            obj.A01 = 0.0f;
            obj.A02 = 0.0f;
            obj.A03 = 0.0f;
            return obj;
        }
        if (this instanceof C2823Jaf) {
            ?? obj2 = new Object();
            obj2.A00 = 0.0f;
            obj2.A01 = 0.0f;
            obj2.A02 = 0.0f;
            return obj2;
        }
        if (!(this instanceof C2822Jae)) {
            ?? obj3 = new Object();
            obj3.A00 = 0.0f;
            return obj3;
        }
        ?? obj4 = new Object();
        obj4.A00 = 0.0f;
        obj4.A01 = 0.0f;
        return obj4;
    }

    public void A04() {
        if (this instanceof C2824Jag) {
            C2824Jag c2824Jag = (C2824Jag) this;
            c2824Jag.A00 = 0.0f;
            c2824Jag.A01 = 0.0f;
            c2824Jag.A02 = 0.0f;
            c2824Jag.A03 = 0.0f;
            return;
        }
        if (this instanceof C2823Jaf) {
            C2823Jaf c2823Jaf = (C2823Jaf) this;
            c2823Jaf.A00 = 0.0f;
            c2823Jaf.A01 = 0.0f;
            c2823Jaf.A02 = 0.0f;
            return;
        }
        if (!(this instanceof C2822Jae)) {
            ((C2821Jad) this).A00 = 0.0f;
            return;
        }
        C2822Jae c2822Jae = (C2822Jae) this;
        c2822Jae.A00 = 0.0f;
        c2822Jae.A01 = 0.0f;
    }

    public void A05(int i, float f) {
        if (this instanceof C2824Jag) {
            C2824Jag c2824Jag = (C2824Jag) this;
            if (i == 0) {
                c2824Jag.A00 = f;
                return;
            }
            if (i == 1) {
                c2824Jag.A01 = f;
                return;
            } else if (i == 2) {
                c2824Jag.A02 = f;
                return;
            } else {
                if (i == 3) {
                    c2824Jag.A03 = f;
                    return;
                }
                return;
            }
        }
        if (this instanceof C2823Jaf) {
            C2823Jaf c2823Jaf = (C2823Jaf) this;
            if (i == 0) {
                c2823Jaf.A00 = f;
                return;
            } else if (i == 1) {
                c2823Jaf.A01 = f;
                return;
            } else {
                if (i == 2) {
                    c2823Jaf.A02 = f;
                    return;
                }
                return;
            }
        }
        if (!(this instanceof C2822Jae)) {
            C2821Jad c2821Jad = (C2821Jad) this;
            if (i == 0) {
                c2821Jad.A00 = f;
                return;
            }
            return;
        }
        C2822Jae c2822Jae = (C2822Jae) this;
        if (i == 0) {
            c2822Jae.A00 = f;
        } else if (i == 1) {
            c2822Jae.A01 = f;
        }
    }
}
