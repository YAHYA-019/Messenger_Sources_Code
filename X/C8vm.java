package X;

import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.BitSet;

/* renamed from: X.8vm, reason: invalid class name */
/* loaded from: 8vm.class */
public final class C8vm extends C63h {
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C1Q A04;

    public C8vm(1BO r302) {
        super(FbInjector.A00());
        this.A02 = 1BV.A01((1BY) null, 84122);
        this.A03 = 1BV.A01((1BY) null, 85079);
        this.A01 = 1BV.A01((1BY) null, 82091);
        this.A04 = new C1Q(this);
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (r0 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(X.2JX r301) {
        /*
            com.facebook.graphql.enums.GraphQLGroupRoomType r0 = com.facebook.graphql.enums.GraphQLGroupRoomType.CM_THREAD_AUDIO
            r302 = r0
            r0 = r301
            java.lang.Class<X.2JX> r1 = X.2JX.class
            r2 = 19546331(0x12a40db, float:3.12706E-38)
            r3 = 472562792(0x1c2abc68, float:5.649179E-22)
            X.2JY r0 = X.7zL.A0N(r0, r1, r2, r3)
            r303 = r0
            com.facebook.graphql.enums.GraphQLGroupRoomType r0 = com.facebook.graphql.enums.GraphQLGroupRoomType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r304 = r0
            r0 = 918304350(0x36bc365e, float:5.609166E-6)
            r305 = r0
            r0 = r303
            r1 = r304
            r2 = r305
            java.lang.Enum r0 = r0.A0g(r1, r2)
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)
            r306 = r0
            com.facebook.graphql.enums.GraphQLGroupRoomType r0 = com.facebook.graphql.enums.GraphQLGroupRoomType.GAMING_AUDIO
            r307 = r0
            r0 = r307
            r1 = r304
            boolean r0 = r0.equals(r1)
            r308 = r0
            r0 = r306
            if (r0 != 0) goto L40
            r0 = 1
            r305 = r0
            r0 = r308
            if (r0 == 0) goto L46
        L40:
            r0 = 0
            r305 = r0
            r0 = 0
            r307 = r0
        L46:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8vm.A00(X.2JX):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.facebook.mig.scheme.interfaces.MigColorScheme] */
    @Override // X.C63h
    public 1LI A05(1Iw r302, 5zD r303, 6Az r304, AnonymousClass622 anonymousClass622, 7Wh r306) {
        2JX A0X;
        ThreadKey threadKey;
        ArE BEO = r304.BEO();
        if (BEO == null || (A0X = BEO.A0X(2JX.class, -1178749980, 1978605940, 1473067948)) == null || (threadKey = anonymousClass622.A03.A0V) == null) {
            return null;
        }
        8Pj r0 = new 8Pj(r302, new C8mc());
        LightColorScheme Axg = r303 != null ? r303.Axg() : LightColorScheme.A00();
        C8mc c8mc = r0.A01;
        c8mc.A04 = Axg;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        c8mc.A01 = r304;
        bitSet.set(3);
        c8mc.A00 = A0X;
        bitSet.set(2);
        c8mc.A02 = threadKey;
        bitSet.set(4);
        c8mc.A03 = this.A04;
        bitSet.set(1);
        C1rs.A04(bitSet, r0.A03);
        r0.A0J();
        return c8mc;
    }
}
