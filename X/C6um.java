package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.plugins.banner.actionhandler.quickpromotion.QuickPromotionTopBannerActionHandler;
import com.facebook.messaging.wellbeing.supportinclusion.plugins.proactivewarning.msys.msysthreadviewbannerctahandler.MsysThreadViewBannerCtaHandlerImplementation;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.threadview.msysbanneractionhandler.MessageRequestMsysBannerHandler;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6um, reason: invalid class name */
/* loaded from: 6um.class */
public final class C6um implements AaO {
    public final Context A00;
    public final FbUserSession A01;
    public final 1pK A02;
    public final ThreadKey A03;
    public final C6ri A04;
    public final 6tF A05;
    public final C01i A06 = C01g.A00(C03i.A02, new AnonymousClass834(this, 3));

    public C6um(Context context, FbUserSession fbUserSession, 1pK r304, ThreadKey threadKey, C6ri c6ri, 6tF r307) {
        this.A00 = context;
        this.A02 = r304;
        this.A03 = threadKey;
        this.A05 = r307;
        this.A01 = fbUserSession;
        this.A04 = c6ri;
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r317v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r317v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r319v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r319v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 317, insn: 0x09c6: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r317 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:395:0x09c6 */
    /* JADX WARN: Not initialized variable reg: 319, insn: 0x09b0: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r319 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:394:0x09a8 */
    public void ANo(com.facebook.xapp.messaging.map.HeterogeneousMap r302, java.lang.Long r303, java.lang.String r304, int r305) {
        /*
            Method dump skipped, instructions count: 2559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6um.ANo(com.facebook.xapp.messaging.map.HeterogeneousMap, java.lang.Long, java.lang.String, int):void");
    }

    public void BML(HeterogeneousMap heterogeneousMap, int i) {
        int andIncrement;
        String A00;
        11T.A0F(heterogeneousMap, 1);
        Object value = this.A06.getValue();
        11T.A0A(value);
        9nA r0 = ((C9K5) value).A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r02 = r0.A0R;
        String A002 = 7zK.A00(11);
        String A003 = 7zK.A00(13);
        r02.A08(A002, A003, "handleOnVisible", andIncrement2);
        Exception e = null;
        try {
            9nA.A00(r0);
            try {
                try {
                    if (i == 9) {
                        if (9nA.A05(r0)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            A00 = "messaging.wellbeing.supportinclusion.proactivewarning.msys.msysthreadviewbannerctahandler.MsysThreadViewBannerCtaHandlerImplementation";
                            r02.A0A("com.facebook.messaging.wellbeing.supportinclusion.plugins.proactivewarning.msys.msysthreadviewbannerctahandler.MsysThreadViewBannerCtaHandlerImplementation", A00, A002, andIncrement, A003, "com.facebook.messaging.wellbeing.supportinclusion.plugins.proactivewarning.ProactiveWarningKillSwitch", "handleOnVisible");
                            MsysThreadViewBannerCtaHandlerImplementation msysThreadViewBannerCtaHandlerImplementation = r0.A0A;
                            if (2W2.A00((2W2) 1Bn.A0A(68200)).AZk(36315653590885685L)) {
                                Context context = msysThreadViewBannerCtaHandlerImplementation.A00;
                                7Fn r03 = (7Fn) 1Bu.A06(context, 82464);
                                FbUserSession A04 = 1Fw.A04((1EZ) 1Bu.A06(context, 16428));
                                ThreadKey threadKey = msysThreadViewBannerCtaHandlerImplementation.A02;
                                11T.A0F(A04, 0);
                                if (2W2.A00((2W2) r03.A05.A00.get()).AZk(36315653590885685L) || ((AcJ) 1Br.A0B(r03.A02)).A01()) {
                                    ((BDP) 1Lo.A04((Context) null, A04, r03.A00.A00, 82463)).A00(new A1c(threadKey, r03, 17), threadKey.A01);
                                }
                            }
                            r02.A04((Exception) null, A00, A003, "handleOnVisible", andIncrement);
                            r02.A02((Exception) null, A003, "handleOnVisible", andIncrement2);
                            return;
                        }
                        r02.A02((Exception) null, A003, "handleOnVisible", andIncrement2);
                        return;
                    }
                    if (i == 8) {
                        if (9nA.A02(r0)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            A00 = "messaging.msys.thread.banner.actionhandler.quickpromotion.QuickPromotionTopBannerActionHandler";
                            r02.A0A("com.facebook.messaging.msys.thread.plugins.banner.actionhandler.quickpromotion.QuickPromotionTopBannerActionHandler", A00, A002, andIncrement, A003, "com.facebook.messaging.msys.thread.plugins.banner.actionhandler.MsysThreadBannerActionhandlerKillSwitch", "handleOnVisible");
                            QuickPromotionTopBannerActionHandler quickPromotionTopBannerActionHandler = r0.A06;
                            8NR r04 = (8NR) heterogeneousMap.A00(8NR.A02);
                            if (r04 != null) {
                                ((2bM) 1Br.A0B(quickPromotionTopBannerActionHandler.A01)).A04(4YU.A0y(quickPromotionTopBannerActionHandler.A02), quickPromotionTopBannerActionHandler.A04, r04.A00);
                            }
                            r02.A04((Exception) null, A00, A003, "handleOnVisible", andIncrement);
                            r02.A02((Exception) null, A003, "handleOnVisible", andIncrement2);
                            return;
                        }
                        r02.A02((Exception) null, A003, "handleOnVisible", andIncrement2);
                        return;
                    }
                    if (i == 4 && 9nA.A06(r0)) {
                        andIncrement = atomicInteger.getAndIncrement();
                        String A004 = 7zK.A00(282);
                        A00 = 7zK.A00(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH);
                        r02.A0A(A004, A00, A002, andIncrement, A003, "com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.threadview.WellbeingUnknowncontactMessagerequestsThreadviewKillSwitch", "handleOnVisible");
                        MessageRequestMsysBannerHandler messageRequestMsysBannerHandler = r0.A0B;
                        if (messageRequestMsysBannerHandler.A00 != null) {
                            MessageRequestMsysBannerHandler.A00(messageRequestMsysBannerHandler);
                        } else {
                            2aK.A03((Integer) null, 2Zo.A02(0S2.A00), new AJf(messageRequestMsysBannerHandler, (0DR) null, 13), messageRequestMsysBannerHandler.A04, 2);
                        }
                        r02.A04((Exception) null, A00, A003, "handleOnVisible", andIncrement);
                        r02.A02((Exception) null, A003, "handleOnVisible", andIncrement2);
                        return;
                    }
                    r02.A02((Exception) null, A003, "handleOnVisible", andIncrement2);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
                e = e2;
                throw e;
            } catch (Throwable th) {
                r02.A04(e, A00, A003, "handleOnVisible", andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r02.A02(e, A003, "handleOnVisible", andIncrement2);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02d9 A[Catch: Exception -> 0x033a, all -> 0x0354, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x033a, blocks: (B:125:0x027f, B:129:0x028d, B:132:0x0299, B:135:0x02d1, B:137:0x0324, B:138:0x0329, B:144:0x02d9, B:146:0x02e8, B:148:0x02ee, B:151:0x02f8, B:152:0x02ff, B:153:0x0306, B:155:0x0311, B:156:0x0318, B:157:0x031d, B:157:0x031d, B:159:0x02a3, B:160:0x02a8, B:163:0x02b4, B:165:0x02c2), top: B:124:0x027f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109 A[Catch: Exception -> 0x0161, all -> 0x017b, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0161, blocks: (B:17:0x00a5, B:21:0x00b3, B:24:0x00bf, B:27:0x0101, B:29:0x014b, B:30:0x0150, B:36:0x0109, B:38:0x0118, B:40:0x011e, B:43:0x0128, B:44:0x012f, B:46:0x0138, B:47:0x013f, B:48:0x0144, B:48:0x0144, B:50:0x00c9, B:51:0x00ce, B:54:0x00da, B:57:0x00e4, B:59:0x00f2), top: B:16:0x00a5, outer: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Bkq(com.facebook.xapp.messaging.map.HeterogeneousMap r302, int r303) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6um.Bkq(com.facebook.xapp.messaging.map.HeterogeneousMap, int):void");
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r313v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r313v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r315v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r315v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 313, insn: 0x035a: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r313 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:133:0x035a */
    /* JADX WARN: Not initialized variable reg: 315, insn: 0x0345: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:132:0x033e */
    public void Bkt(com.facebook.xapp.messaging.map.HeterogeneousMap r302, int r303) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6um.Bkt(com.facebook.xapp.messaging.map.HeterogeneousMap, int):void");
    }
}
