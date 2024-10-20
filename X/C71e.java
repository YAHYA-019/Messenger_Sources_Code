package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.71e, reason: invalid class name */
/* loaded from: 71e.class */
public final class C71e extends C00q implements C00m {
    public final /* synthetic */ C01i $actionDrawerMenuFactory;
    public final /* synthetic */ C01i $actionDrawerNoticeEligibility;
    public final /* synthetic */ boolean $enableContextMenu;
    public final /* synthetic */ boolean $isHostedInBottomSheet;
    public final /* synthetic */ boolean $isReactionKeyboardFixEnabled;
    public final /* synthetic */ boolean $isSmoothKeyboardEnabled;
    public final /* synthetic */ C01i $loggingHelper;
    public final /* synthetic */ int $maxActionDrawerMenuItems;
    public final /* synthetic */ C01i $reactionsSender;
    public final /* synthetic */ C01i $showCustomReactionIconHandler;
    public final /* synthetic */ int $surfaceContainerId = 2131365865;
    public final /* synthetic */ C6qu $this_reactionsFeature;
    public final /* synthetic */ C01i $threadViewActionsController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71e(C6qu c6qu, C01i c01i, C01i c01i2, C01i c01i3, C01i c01i4, C01i c01i5, C01i c01i6, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.$this_reactionsFeature = c6qu;
        this.$reactionsSender = c01i;
        this.$actionDrawerMenuFactory = c01i2;
        this.$maxActionDrawerMenuItems = i;
        this.$enableContextMenu = z;
        this.$actionDrawerNoticeEligibility = c01i3;
        this.$showCustomReactionIconHandler = c01i4;
        this.$isReactionKeyboardFixEnabled = z2;
        this.$threadViewActionsController = c01i5;
        this.$loggingHelper = c01i6;
        this.$isHostedInBottomSheet = z3;
        this.$isSmoothKeyboardEnabled = z4;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        final 74R r0 = (74R) 1Bu.A06(this.$this_reactionsFeature.A00.AWp(), 65955);
        5yW r02 = (5yW) 1Bi.A03(67347);
        final 6wZ r03 = (6wZ) 1Bn.A0A(67775);
        final 7Gy r04 = (7Gy) 1Bu.A06(this.$this_reactionsFeature.A00.AWp(), 82018);
        final 6vE A0f = ((82O) 1Bu.A06(this.$this_reactionsFeature.A00.AWp(), 955)).A0f(6vC.A00);
        Integer num = 0S2.A0N;
        Integer A0M = ThreadKey.A0M(this.$this_reactionsFeature.A00.BF7());
        11T.A0A(A0M);
        final 74T r05 = new 74T(c0dp, new 7Gz(74S.A00), num, r02.A02(A0M));
        final 74V r06 = (74V) this.$reactionsSender.getValue();
        C6qv c6qv = this.$this_reactionsFeature.A00;
        final C6rj B6S = c6qv.B6S();
        final 2Og Aoc = c6qv.Aoc();
        final 6yM Ad4 = c6qv.Ad4();
        final 2Oi BBY = c6qv.BBY();
        final 74Y r07 = new 74Y(Ad4, (74X) this.$actionDrawerMenuFactory.getValue(), (C5nC) this.$actionDrawerNoticeEligibility.getValue(), this.$maxActionDrawerMenuItems, this.$enableContextMenu);
        final 7HH r08 = (7HH) this.$showCustomReactionIconHandler.getValue();
        int i = this.$isReactionKeyboardFixEnabled ? this.$surfaceContainerId : 0;
        final 2Of AbO = this.$this_reactionsFeature.A00.AbO();
        C01i c01i = this.$threadViewActionsController;
        C6vi c6vi = c01i != null ? (C6vi) c01i.getValue() : null;
        final C74a c74a = (C74a) this.$loggingHelper.getValue();
        final ThreadKey BF7 = this.$this_reactionsFeature.A00.BF7();
        final boolean A0z = BF7.A0z();
        final boolean z = this.$isHostedInBottomSheet;
        final 74P r09 = new 74P(new 6zD[]{71Y.A00, C7ZP.A00});
        final boolean z2 = this.$isSmoothKeyboardEnabled;
        final C6vi c6vi2 = c6vi;
        final int i2 = i;
        return new C6zG(BF7, r07, r06, AbO, BBY, r09, c74a, r08, r0, Ad4, r05, B6S, r03, r04, c6vi2, Aoc, A0f, i2, A0z, z, z2) { // from class: X.74b
            public final C6z3 A00;
            public final int A01;
            public final ThreadKey A02;
            public final 74Y A03;
            public final 74V A04;
            public final 2Of A05;
            public final 2Oi A06;
            public final 74P A07;
            public final 6zD A08;
            public final C74a A09;
            public final 7HH A0A;
            public final 74R A0B;
            public final 6yU A0C;
            public final 74T A0D;
            public final C6rj A0E;
            public final 6wZ A0F;
            public final 7Gy A0G;
            public final C6vi A0H;
            public final 2Og A0I;
            public final 6vE A0J;
            public final boolean A0K;
            public final boolean A0L;
            public final boolean A0M;

            {
                11T.A0F(r0, 1);
                11T.A0F(r06, 2);
                11T.A0F(B6S, 3);
                11T.A0F(Aoc, 4);
                11T.A0F(Ad4, 5);
                11T.A0F(BBY, 6);
                11T.A0F(AbO, 15);
                11T.A0F(c74a, 17);
                11T.A0F(BF7, 20);
                this.A0B = r0;
                this.A04 = r06;
                this.A0E = B6S;
                this.A0I = Aoc;
                this.A0C = Ad4;
                this.A06 = BBY;
                this.A0G = r04;
                this.A0F = r03;
                this.A03 = r07;
                this.A0D = r05;
                this.A0J = A0f;
                this.A0A = r08;
                this.A01 = i2;
                this.A05 = AbO;
                this.A0H = c6vi2;
                this.A09 = c74a;
                this.A0L = A0z;
                this.A0K = z;
                this.A02 = BF7;
                this.A08 = r09;
                this.A0M = z2;
                this.A00 = C6z2.A0Z;
                this.A07 = new 74P(new 6zD[]{new 6zD(r05) { // from class: X.74c
                    public final 74T A00;

                    {
                        this.A00 = r05;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
                    
                        if (X.4YU.A1Y(r0, 18) != false) goto L15;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public boolean BUV(X.5vW r302, int r303) {
                        /*
                            r301 = this;
                            r0 = 0
                            r304 = r0
                            r0 = r302
                            r1 = 0
                            X.11T.A0F(r0, r1)
                            r0 = r302
                            X.5vV r0 = (X.5vV) r0
                            r302 = r0
                            r0 = r302
                            X.5fv r0 = r0.A00
                            r305 = r0
                            r0 = r301
                            X.74T r0 = r0.A00
                            r1 = r305
                            java.lang.Integer r0 = r0.A00(r1)
                            r306 = r0
                            r0 = r302
                            X.5vU r0 = r0.A01
                            r307 = r0
                            r0 = r307
                            com.facebook.xapp.messaging.capability.vector.Capabilities r0 = r0.A00
                            r308 = r0
                            r0 = r306
                            r1 = 0
                            X.11T.A0F(r0, r1)
                            r0 = 1
                            r309 = r0
                            r0 = 2
                            r310 = r0
                            r0 = r308
                            r1 = r309
                            X.11T.A0F(r0, r1)
                            r0 = r306
                            int r0 = r0.intValue()
                            r311 = r0
                            r0 = r311
                            r1 = r310
                            if (r0 == r1) goto L7c
                            r0 = 3
                            r310 = r0
                            r0 = r311
                            r1 = r310
                            if (r0 == r1) goto L66
                            r0 = r311
                            r1 = r309
                            if (r0 == r1) goto L8a
                            r0 = r311
                            r1 = 0
                            if (r0 == r1) goto Lbc
                            X.14o r0 = X.1BK.A1F()
                            throw r0
                        L66:
                            r0 = 18
                            r311 = r0
                            r0 = r308
                            java.util.BitSet r0 = r0.A00
                            r307 = r0
                            r0 = r307
                            r1 = r311
                            boolean r0 = r0.get(r1)
                            goto L8a
                        L7c:
                            r0 = r308
                            r1 = 18
                            boolean r0 = X.4YU.A1Y(r0, r1)
                            r310 = r0
                            r0 = r310
                            if (r0 == 0) goto Lbc
                        L8a:
                            r0 = r305
                            if (r0 == 0) goto Lba
                            X.5mF r0 = X.5mF.A00
                            r307 = r0
                            r0 = r305
                            r1 = r307
                            X.5PP r0 = r0.AxW(r1)
                            com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata r0 = (com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata) r0
                            r307 = r0
                            r0 = r307
                            if (r0 == 0) goto Lba
                            r0 = r307
                            java.lang.Integer r0 = r0.A05
                            r306 = r0
                            java.lang.Integer r0 = X.0S2.A01
                            r307 = r0
                            r0 = r306
                            r1 = r307
                            if (r0 == r1) goto Lbc
                        Lba:
                            r0 = 1
                            r304 = r0
                        Lbc:
                            r0 = r304
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C74c.BUV(X.5vW, int):boolean");
                    }
                }, r09});
            }

            @Override // X.C6zG
            public 1LI AMI(1LI r302, C1qb c1qb, C5j5 c5j5, 5vW r305, List list, int i3) {
                11T.A0F(c1qb, 0);
                11T.A0F(c5j5, 1);
                11T.A0F(r302, 2);
                11T.A0F(r305, 3);
                if (!this.A07.BUV(r305, i3)) {
                    return r302;
                }
                C85a c85a = new C85a(c1qb, new 7HK());
                74Y r010 = this.A03;
                7HK r011 = c85a.A01;
                r011.A04 = r010;
                BitSet bitSet = c85a.A02;
                bitSet.set(0);
                r011.A0B = this.A0C;
                bitSet.set(1);
                r011.A01 = r302.A0l();
                bitSet.set(3);
                r011.A0C = this.A0D;
                bitSet.set(9);
                r011.A0I = this.A0I;
                bitSet.set(6);
                r011.A09 = this.A0A;
                r011.A0F = this.A0G;
                bitSet.set(4);
                r011.A0E = this.A0F;
                bitSet.set(5);
                r011.A0A = this.A0B;
                bitSet.set(10);
                r011.A05 = this.A04;
                bitSet.set(11);
                r011.A0D = this.A0E;
                bitSet.set(12);
                r011.A0H = r305;
                bitSet.set(13);
                r011.A07 = this.A06;
                bitSet.set(15);
                r011.A03 = c5j5;
                bitSet.set(17);
                r011.A0N = true;
                bitSet.set(14);
                r011.A0J = this.A0J;
                r011.A06 = this.A05;
                r011.A00 = this.A01;
                bitSet.set(2);
                r011.A0G = this.A0H;
                r011.A08 = this.A09;
                bitSet.set(8);
                r011.A0L = Boolean.valueOf(this.A0L);
                r011.A0K = Boolean.valueOf(this.A0K);
                bitSet.set(7);
                r011.A0M = this.A0M;
                r011.A02 = this.A02;
                bitSet.set(16);
                C1rs.A05(bitSet, c85a.A03, 18);
                c85a.A0J();
                return r011;
            }

            @Override // X.C6zJ
            public /* bridge */ /* synthetic */ Object Am9() {
                return this.A00;
            }
        };
    }
}
