package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.1qb, reason: invalid class name */
/* loaded from: 1qb.class */
public final class C1qb extends 1Iw {
    public 1Im A00;
    public 2Yo A01;
    public 2Xo A02;
    public WeakReference A03;
    public final C1qr A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1qb(X.1Iw r302) {
        /*
            r301 = this;
            r0 = 1
            r303 = r0
            r0 = r302
            r1 = r303
            X.11T.A0F(r0, r1)
            r0 = r302
            android.content.Context r0 = r0.A0D
            r304 = r0
            r0 = r304
            X.11T.A0A(r0)
            r0 = r302
            X.1qe r0 = r0.A03
            r305 = r0
            r0 = r302
            X.1qp r0 = r0.A08
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L30
            r0 = 0
            r303 = r0
            r0 = 0
            r306 = r0
        L26:
            r0 = r301
            r1 = r304
            r2 = r305
            r3 = r306
            r0.<init>(r1, r2, r3)
            return
        L30:
            r0 = r306
            X.1qp r0 = X.1sK.A00(r0)
            r306 = r0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1qb.<init>(X.1Iw):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1qb(Context context) {
        this(context, null, null, null, 6);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1qr] */
    public C1qb(Context context, C1qe c1qe, C1qp c1qp) {
        super(context, c1qe, c1qp);
        11T.A0F(context, 1);
        this.A04 = new Object() { // from class: X.1qr
            public final Set A00 = new HashSet();
        };
    }

    public /* synthetic */ C1qb(Context context, C1qe c1qe, C1qp c1qp, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this(context, C1qc.A00(context, null, C02A.defaultInstance), null);
    }

    public String A0C() {
        2Yf r0;
        WeakReference weakReference = this.A03;
        if (weakReference == null || (r0 = (2Yf) weakReference.get()) == null) {
            throw AnonymousClass001.A0N("getGlobalKey cannot be accessed from a SectionContext without a scope");
        }
        String str = r0.A06;
        11T.A0A(str);
        return str;
    }

    public void A0F(C2l4 c2l4) {
        2Yf r0;
        2Xo r02 = this.A02;
        WeakReference weakReference = this.A03;
        if (weakReference == null || (r0 = (2Yf) weakReference.get()) == null || r02 == null) {
            return;
        }
        String str = r0.A06;
        synchronized (r02) {
            2Xo.A06(c2l4, r02, str, true);
        }
    }

    public final 2Yf A0J() {
        WeakReference weakReference = this.A03;
        if (weakReference != null) {
            return (2Yf) weakReference.get();
        }
        return null;
    }
}
