package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.google.common.base.Preconditions;

/* renamed from: X.8qh, reason: invalid class name */
/* loaded from: 8qh.class */
public final class C8qh extends 2Yf {
    public 1Im A00;
    public 1Im A01;
    public 1Im A02;
    public 9hT A03;
    public 79Q A04;
    public Object A05;
    public String A06;
    public boolean A07;

    public C8qh() {
        super("ContentSearchLoaderSection");
    }

    public Object A0M(2Yf r302) {
        return ((C8qh) r302).A03;
    }

    public void A0N(2Yf r302, 2Yf r303, C1qb c1qb) {
        ((C8qh) r303).A03 = ((C8qh) r302).A03;
    }

    public void A0O(C1qb c1qb) {
        9hT r0 = this.A03;
        String str = this.A06;
        Object obj = this.A05;
        boolean z = this.A07;
        9Xh r02 = (9Xh) 1Hv.A02(((1Iw) c1qb).A0D, 68097);
        r0.A06.set(new 9Yu(c1qb, obj, z));
        synchronized (r0) {
            if (r0.A01) {
                r0.A01 = false;
                r0.A05.set(obj);
                9hT.A00(r0, obj);
            }
        }
        r02.A00.put(str, 7zL.A14(r0));
    }

    public void A0P(C1qb c1qb) {
        79Q r0 = this.A04;
        boolean z = this.A07;
        Context A00 = 1Bf.A00((C1F6) 1Bn.A0A(613));
        try {
            9hT r02 = new 9hT(r0, z);
            1Bn.A0K();
            FbInjector.A04(A00);
            this.A03 = r02;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }

    public void A0R(C1qb c1qb) {
        9hT r0 = this.A03;
        String str = this.A06;
        9Xh r02 = (9Xh) 1Hv.A02(((1Iw) c1qb).A0D, 68097);
        r0.A06.set(null);
        r02.A00.remove(str);
    }

    public void A0X(2Yv r302, 2Yv r303) {
        C8pt c8pt = (C8pt) r302;
        C8pt c8pt2 = (C8pt) r303;
        c8pt2.A00 = c8pt.A00;
        c8pt2.A03 = c8pt.A03;
        c8pt2.A01 = c8pt.A01;
        c8pt2.A02 = c8pt.A02;
    }

    public void A0a(C1qb c1qb) {
        C8pt c8pt = (C8pt) ((2Yf) this).A03;
        ELK elk = ELK.A04;
        ELJ elj = ELJ.A04;
        c8pt.A01 = elk;
        c8pt.A03 = null;
        c8pt.A00 = elj;
        c8pt.A02 = null;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.9TF, java.lang.Object] */
    public 2Ys A0d(C1qb c1qb) {
        C8pt c8pt = (C8pt) ((2Yf) this).A03;
        ELK elk = c8pt.A01;
        Throwable th = c8pt.A03;
        ELJ elj = c8pt.A00;
        Object obj = c8pt.A02;
        Preconditions.checkNotNull(c1qb.A0J() == null ? null : ((C8qh) c1qb.A0J()).A02, "Event handler is not properly set.");
        1Im r309 = c1qb.A0J() == null ? null : ((C8qh) c1qb.A0J()).A02;
        ?? obj2 = new Object();
        ((9TF) obj2).A03 = obj;
        ((9TF) obj2).A02 = null;
        ((9TF) obj2).A01 = elk;
        ((9TF) obj2).A04 = th;
        ((9TF) obj2).A00 = elj;
        return (2Ys) r309.A00((Object) obj2);
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
            C8qh c8qh = (C8qh) r302;
            79Q r0 = this.A04;
            79Q r02 = c8qh.A04;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            Object obj = this.A05;
            Object obj2 = c8qh.A05;
            if (obj != null) {
                if (!obj.equals(obj2)) {
                    return false;
                }
            } else if (obj2 != null) {
                return false;
            }
            String str = this.A06;
            String str2 = c8qh.A06;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (this.A07 != c8qh.A07) {
                return false;
            }
        }
        return true;
    }
}
