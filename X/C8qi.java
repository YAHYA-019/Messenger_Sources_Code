package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.8qi, reason: invalid class name */
/* loaded from: 8qi.class */
public final class C8qi extends 2Yf {
    public 1Im A00;
    public 79M A01;
    public C6wc A02;
    public 6wK A03;
    public 6wK A04;

    public C8qi() {
        super("GalleryDataServiceSection");
    }

    public Object A0M(2Yf r302) {
        return ((C8qi) r302).A03;
    }

    public void A0N(2Yf r302, 2Yf r303, C1qb c1qb) {
        ((C8qi) r303).A03 = ((C8qi) r302).A03;
    }

    public void A0O(C1qb c1qb) {
        6wK r0 = this.A03;
        C6wc c6wc = this.A02;
        79M r02 = this.A01;
        11T.A0G(c1qb, 0, c6wc);
        if (r0 != null) {
            r0.Cng(c6wc);
            r0.CmW(new A80(c1qb, r02));
            if (r0.BTS()) {
                2Yg.A0H(c1qb, 0S2.A00, (Throwable) null, false);
                r0.AO1();
            }
        }
    }

    public void A0P(C1qb c1qb) {
        6wK r0 = this.A04;
        C6wc c6wc = this.A02;
        1BL.A1F(r0, c6wc);
        r0.BOp(c6wc);
        this.A03 = r0;
    }

    public void A0Q(C1qb c1qb) {
        6wK r0 = this.A03;
        if (r0 != null) {
            r0.Cbq();
        }
    }

    public void A0R(C1qb c1qb) {
        6wK r0 = this.A03;
        if (r0 != null) {
            r0.CmW((6wP) null);
        }
    }

    public void A0X(2Yv r302, 2Yv r303) {
        C8pm c8pm = (C8pm) r302;
        C8pm c8pm2 = (C8pm) r303;
        c8pm2.A01 = c8pm.A01;
        c8pm2.A00 = c8pm.A00;
        c8pm2.A02 = c8pm.A02;
    }

    public void A0a(C1qb c1qb) {
        C8pm c8pm = (C8pm) ((2Yf) this).A03;
        c8pm.A01 = ELK.A04;
        c8pm.A02 = null;
        c8pm.A00 = 100;
    }

    public void A0b(C1qb c1qb, int i, int i2, int i3, int i4, int i5) {
        int i6 = ((C8pm) ((2Yf) this).A03).A00;
        11T.A0F(c1qb, 0);
        if (i2 >= i6 - 8) {
            int i7 = i6 + 100;
            if (c1qb.A0J() != null) {
                c1qb.A0G(7zL.A0f(AnonymousClass001.A1a(i7), 0), "updateState:GalleryDataServiceSection.updateLastIndexToRender");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.9TF, java.lang.Object] */
    public 2Ys A0d(C1qb c1qb) {
        1Im r0;
        C8pm c8pm = (C8pm) ((2Yf) this).A03;
        ELK elk = c8pm.A01;
        ImmutableList immutableList = c8pm.A02;
        int i = c8pm.A00;
        11T.A0H(c1qb, elk);
        if (elk == ELK.A03 && immutableList == null) {
            throw AnonymousClass001.A0N("Fetch state is IDLE but response model is not properly set.");
        }
        if (elk == ELK.A02 && immutableList != null) {
            throw AnonymousClass001.A0N("Fetch state is DOWNLOAD_ERROR but response model is not properly set.");
        }
        if (c1qb.A0J() == null || (r0 = ((C8qi) c1qb.A0J()).A00) == null) {
            throw 1BK.A0h();
        }
        if (immutableList != null) {
            if (immutableList.size() >= i) {
                immutableList = immutableList.subList(0, i);
            }
            ?? obj = new Object();
            ((9TF) obj).A03 = immutableList;
            ((9TF) obj).A02 = null;
            ((9TF) obj).A01 = elk;
            ((9TF) obj).A04 = null;
            ((9TF) obj).A00 = null;
            2Ys r02 = (2Ys) r0.A00((Object) obj);
            11T.A0A(r02);
            return r02;
        }
        immutableList = ImmutableList.of();
        11T.A0A(immutableList);
        ?? obj2 = new Object();
        ((9TF) obj2).A03 = immutableList;
        ((9TF) obj2).A02 = null;
        ((9TF) obj2).A01 = elk;
        ((9TF) obj2).A04 = null;
        ((9TF) obj2).A00 = null;
        2Ys r022 = (2Ys) r0.A00((Object) obj2);
        11T.A0A(r022);
        return r022;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yf A0g(boolean z) {
        2Yf A0g = super.A0g(z);
        if (!z) {
            A0g.A03 = new Object();
        }
        return A0g;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qi c8qi = (C8qi) r302;
            C6wc c6wc = this.A02;
            C6wc c6wc2 = c8qi.A02;
            if (c6wc != null) {
                if (!c6wc.equals(c6wc2)) {
                    return false;
                }
            } else if (c6wc2 != null) {
                return false;
            }
            6wK r0 = this.A04;
            6wK r02 = c8qi.A04;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            79M r03 = this.A01;
            79M r04 = c8qi.A01;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
        }
        return true;
    }
}
