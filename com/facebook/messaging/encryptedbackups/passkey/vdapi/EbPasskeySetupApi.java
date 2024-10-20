package com.facebook.messaging.encryptedbackups.passkey.vdapi;

import X.03W;
import X.04R;
import X.0DR;
import X.0DT;
import X.11T;
import X.1H2;
import X.7zT;
import X.83Q;
import X.AQg;
import X.AV6;
import X.AVJ;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.BTf;
import X.C1ud;
import X.C1x8;
import X.C2049DaC;
import X.C2s7;
import X.C4O5;
import X.C9af;
import X.EUZ;
import X.FEV;
import X.Fwt;
import X.KNh;
import X.Kjn;
import X.Kvy;
import X.L20;
import X.LuN;
import android.content.Context;
import android.os.CancellationSignal;
import java.util.BitSet;
import java.util.Map;

/* loaded from: EbPasskeySetupApi.class */
public final class EbPasskeySetupApi {
    public final L20 A00;
    public final C1x8 A01;
    public final 1H2 A02;
    public final C1ud A03;
    public final Kvy A04;

    public EbPasskeySetupApi(C1x8 c1x8, L20 l20, 1H2 r304, C1ud c1ud, Kvy kvy) {
        7zT.A1W(c1x8, r304, kvy, c1ud);
        11T.A0F(l20, 5);
        this.A01 = c1x8;
        this.A02 = r304;
        this.A04 = kvy;
        this.A03 = c1ud;
        this.A00 = l20;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(2:9|(2:11|(10:13|14|15|16|17|18|19|20|21|22)(2:24|25))(3:26|27|28))(14:92|93|94|95|96|97|98|99|100|101|102|(1:104)|105|106)|29|30|31|(11:33|34|35|36|37|38|39|40|41|42|(29:44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|(2:65|66)|15|16|17|18|19|20|21|22)(9:67|68|69|70|71|72|73|74|75))(7:76|77|78|79|80|81|82)))|115|6|7|(0)(0)|29|30|31|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x027b, code lost:
    
        r312 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x027d, code lost:
    
        r313 = X.JR1.A0a(r305, r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026c, code lost:
    
        r312 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026e, code lost:
    
        r305.A00();
        X.KVT.A00(r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x027a, code lost:
    
        throw r312;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124 A[Catch: all -> 0x026c, 2az -> 0x027b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {2az -> 0x027b, all -> 0x026c, blocks: (B:14:0x01d3, B:16:0x01da, B:18:0x01e1, B:19:0x01ea, B:21:0x01f3, B:33:0x0124, B:34:0x012b, B:35:0x0132, B:36:0x0137, B:36:0x0137, B:39:0x0141, B:40:0x0148, B:41:0x014f, B:45:0x0160, B:47:0x0167, B:48:0x016c, B:49:0x0173, B:50:0x017a, B:51:0x0181, B:52:0x0187, B:54:0x018f, B:55:0x0196, B:57:0x01a3, B:58:0x01a9, B:59:0x01af, B:60:0x01b5, B:62:0x01c2, B:68:0x01fe, B:69:0x0203, B:69:0x0203, B:72:0x020a, B:75:0x026b, B:76:0x021a, B:78:0x0259, B:79:0x0261, B:79:0x0261, B:82:0x0268, B:85:0x022d, B:89:0x024a, B:90:0x0252, B:90:0x0252), top: B:7:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021a A[Catch: all -> 0x026c, 2az -> 0x027b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {2az -> 0x027b, all -> 0x026c, blocks: (B:14:0x01d3, B:16:0x01da, B:18:0x01e1, B:19:0x01ea, B:21:0x01f3, B:33:0x0124, B:34:0x012b, B:35:0x0132, B:36:0x0137, B:36:0x0137, B:39:0x0141, B:40:0x0148, B:41:0x014f, B:45:0x0160, B:47:0x0167, B:48:0x016c, B:49:0x0173, B:50:0x017a, B:51:0x0181, B:52:0x0187, B:54:0x018f, B:55:0x0196, B:57:0x01a3, B:58:0x01a9, B:59:0x01af, B:60:0x01b5, B:62:0x01c2, B:68:0x01fe, B:69:0x0203, B:69:0x0203, B:72:0x020a, B:75:0x026b, B:76:0x021a, B:78:0x0259, B:79:0x0261, B:79:0x0261, B:82:0x0268, B:85:0x022d, B:89:0x024a, B:90:0x0252, B:90:0x0252), top: B:7:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Type inference failed for: r0v107, types: [X.2b1] */
    /* JADX WARN: Type inference failed for: r0v125, types: [X.2b1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(android.content.Context r301, X.C9af r302, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi r303, java.lang.String r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi.A00(android.content.Context, X.9af, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi, java.lang.String, X.0DR):java.lang.Object");
    }

    public static final Object A01(Context context, C9af c9af, 0DR r303) {
        String str = C2s7.__redex_internal_original_name;
        C2s7 c2s7 = new C2s7(1, 0DT.A02(r303));
        c2s7.A0F();
        c2s7.BQE(new AVJ(new CancellationSignal(), 21));
        if (c9af != null) {
            c9af.A00("BLOKS_CREATION_FLOW_START");
        }
        KNh kNh = KNh.A03;
        83Q r0 = new 83Q(c2s7, c9af, 33);
        83Q r02 = new 83Q(c2s7, c9af, 34);
        AV6 av6 = new AV6(c2s7, c9af, 18);
        03W A0G = 04R.A0G();
        11T.A0F(context, 0);
        11T.A0F(A0G, 6);
        C2049DaC A00 = EUZ.A00(context);
        Kjn kjn = new Kjn();
        String str2 = kNh.value;
        Map map = kjn.A02;
        map.put("entry_point", str2);
        BitSet bitSet = kjn.A00;
        bitSet.set(0);
        map.put("prf_input_first", null);
        FEV A002 = LuN.A00(kjn, r0, 7);
        Map map2 = kjn.A01;
        map2.put("on_flow_success", A002);
        map2.put("on_flow_error", LuN.A00(kjn, r02, 6));
        map2.put("on_flow_cancel", LuN.A00(kjn, av6, 5));
        Fwt fwt = new Fwt(1);
        if (bitSet.nextClearBit(0) < 1) {
            throw AnonymousClass001.A0N(AbstractC00603o4.A00(14));
        }
        C4O5.A01(fwt, "com.bloks.www.bloks.caa.passkey.creation.async", map, map2).A00(context, A00);
        BTf.A00(context, new AQg(c9af, c2s7, 2));
        return c2s7.A0C();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A02(X.C2b1 r301, X.C9af r302, X.Jst r303, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi.A02(X.2b1, X.9af, X.Jst, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(X.C2b1 r301, X.C9af r302, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi r303, X.0DR r304) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi.A03(X.2b1, X.9af, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(2:3|(19:5|6|7|(2:9|(2:11|12)(2:46|47))(18:48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|(1:64)|65|66)|13|14|15|(5:17|18|19|20|21)(2:34|(7:36|37|38|39|40|41|42)(3:43|44|45))|22|23|24|25|26|27|28|29|30|31|32))|72|6|7|(0)(0)|13|14|15|(0)(0)|22|23|24|25|26|27|28|29|30|31|32|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0193, code lost:
    
        r313 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0195, code lost:
    
        r310 = X.JR1.A0a((X.C2b0) r312, r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0184, code lost:
    
        r313 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
    
        r312.A00();
        X.KVT.A00(r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
    
        throw r313;
     */
    /* JADX WARN: Failed to calculate best type for var: r312v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r312v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r312v1 ??
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
    /* JADX WARN: Failed to calculate best type for var: r312v1 ??
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 312, insn: 0x0186: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r312 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:70:0x0186 */
    /* JADX WARN: Not initialized variable reg: 312, insn: 0x0195: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r312 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:68:0x0195 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010e A[Catch: all -> 0x0184, 2az -> 0x0193, TRY_ENTER, TRY_LEAVE, TryCatch #2 {2az -> 0x0193, all -> 0x0184, blocks: (B:12:0x00f6, B:14:0x00fd, B:17:0x010e, B:18:0x0115, B:19:0x011c, B:21:0x0123, B:23:0x012a, B:25:0x0137, B:27:0x013f, B:28:0x0144, B:28:0x0144, B:31:0x014b, B:37:0x0163, B:38:0x0168, B:38:0x0168, B:40:0x016d, B:42:0x0174, B:43:0x017c, B:45:0x0183, B:49:0x009f, B:51:0x00a5, B:52:0x00aa, B:53:0x00b0, B:54:0x00b7, B:55:0x00be, B:57:0x00c7, B:58:0x00cd, B:59:0x00d4, B:60:0x00db, B:61:0x00e1), top: B:7:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /* JADX WARN: Type inference failed for: r0v74, types: [X.2b1] */
    /* JADX WARN: Type inference failed for: r312v0, types: [X.2b0] */
    /* JADX WARN: Type inference failed for: r312v1, types: [X.2b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A04(X.C9af r301, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi.A04(X.9af, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A05(android.content.Context r302, X.C9af r303, java.lang.String r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi.A05(android.content.Context, X.9af, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(65:1|(1:3)|210|5|(2:7|(59:9|10|11|(2:13|(2:15|(2:17|(11:19|20|21|22|23|24|25|26|27|28|29)(2:31|32))(22:33|34|35|36|37|38|39|40|41|42|43|44|(2:46|47)|21|22|23|24|25|26|27|28|29))(2:48|49))(18:180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|(1:196)|197|198)|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(1:179)(1:99)|100|(34:102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|(40:136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|(2:156|157)|35|36|37|38|39|40|41|42|43|44|(0)|21|22|23|24|25|26|27|28|29)(6:158|159|160|161|162|163))(6:173|174|175|176|177|178)|164|165|166|167))|209|10|11|(0)(0)|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(0)(0)|100|(0)(0)|164|165|166|167|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04cd, code lost:
    
        r316 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04c8, code lost:
    
        r316 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (((X.Lzk) r307).A0A != 1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c5  */
    /* JADX WARN: Type inference failed for: r0v197, types: [X.2b1] */
    /* JADX WARN: Type inference failed for: r0v221, types: [X.2b1] */
    /* JADX WARN: Type inference failed for: r0v237, types: [X.2b1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A06(X.Jsq r302, X.C87v r303, X.C9af r304, java.lang.String r305, java.lang.String r306, X.0DR r307) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi.A06(X.Jsq, X.87v, X.9af, java.lang.String, java.lang.String, X.0DR):java.lang.Object");
    }
}
