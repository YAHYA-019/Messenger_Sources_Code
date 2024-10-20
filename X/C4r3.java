package X;

import com.facebook.graphql.error.GraphQLError;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* renamed from: X.4r3, reason: invalid class name */
/* loaded from: 4r3.class */
public abstract class C4r3 extends C4r4 {
    public static final String __redex_internal_original_name = "GraphServicesApiMethod";
    public final AnonymousClass244 A00;
    public final boolean A01;

    public C4r3(C4r5 c4r5, AnonymousClass244 anonymousClass244) {
        this(c4r5, anonymousClass244, false);
    }

    public C4r3(C4r5 c4r5, AnonymousClass244 anonymousClass244, boolean z) {
        super(c4r5);
        this.A00 = anonymousClass244;
        this.A01 = z;
    }

    public static void A00(AbstractC01033pi abstractC01033pi, AnonymousClass244 anonymousClass244) {
        ImmutableList of;
        String A1Y = abstractC01033pi.A1Y();
        if ("error".equals(A1Y)) {
            of = ImmutableList.of(anonymousClass244.A0E(abstractC01033pi, GraphQLError.class));
        } else if ("errors".equals(A1Y)) {
            A01(abstractC01033pi, C42h.A05);
            abstractC01033pi.A1K();
            ImmutableList.Builder builder = ImmutableList.builder();
            while (abstractC01033pi.A1J() != C42h.A01) {
                builder.m11011add(anonymousClass244.A0E(abstractC01033pi, GraphQLError.class));
                abstractC01033pi.A1K();
            }
            of = builder.build();
        } else {
            of = ImmutableList.of();
        }
        if (!of.isEmpty()) {
            throw EVw.A00((GraphQLError) 1BK.A0r(of));
        }
    }

    public static void A01(AbstractC01033pi abstractC01033pi, C42h... c42hArr) {
        boolean z = true;
        for (C42h c42h : c42hArr) {
            if (abstractC01033pi.A1J() == c42h) {
                z = false;
            }
        }
        if (z) {
            Joiner on = Joiner.on(',');
            throw AnonymousClass001.A0G(0Pz.A0v("Expected token(s) ", new Joiner.AnonymousClass1(on, "null").join(Arrays.asList(c42hArr).iterator()), 1BJ.A00(239), C4V6.A00(abstractC01033pi)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4r3.A07(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r0.A03 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B7m(X.AnonymousClass439 r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4r3.B7m(X.439, java.lang.Object):java.lang.Object");
    }
}
