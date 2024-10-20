package com.facebook.mantle.messenger.manager;

import X.0CV;
import X.0Pz;
import X.11T;
import X.4dB;
import X.4dH;
import X.7US;
import X.7UU;
import X.7UW;
import X.7UX;
import com.facebook.mantle.common.mantledatavalue.MantleDataValue;
import com.facebook.mantle.messenger.MessengerMantle;

/* loaded from: MessengerRecommendationProvider.class */
public final class MessengerRecommendationProvider implements 7UU {
    public MessengerMantle A00;
    public final int A01;
    public final MantleDataValue A02;
    public final 7US A03;
    public final String A04;
    public final String A05;
    public final 4dH A06;
    public final boolean A07;

    public MessengerRecommendationProvider(7US r302, String str, int i, boolean z) {
        11T.A0F(r302, 1);
        this.A03 = r302;
        this.A07 = z;
        this.A01 = i;
        7UW r0 = MantleDataValue.Companion;
        this.A02 = new MantleDataValue(7UX.A0A, 0Pz.A0T("lexicon_", i));
        this.A05 = 0CV.A0W(0CV.A0W("{\"nodes\":{\"0\":{\"nodeType\":109,\"parents\":[],\"staticParams\":{}},\"1\":{\"nodeType\":111,\"parents\":[0,2,3],\"staticParams\":{\"35\":{\"int_val\":3}}},\"2\":{\"nodeType\":15,\"parents\":[0],\"staticParams\":{\"1\":{\"str_val\":\"blocklist\"},\"2\":{\"str_val\":\"##model_name##\"},\"3\":{\"int_val\":##lexicon_version##},\"26\":{\"int_val\":1},\"34\":{\"int_val\":1}}},\"3\":{\"nodeType\":15,\"parents\":[0],\"staticParams\":{ \"11\":{\"boolean_val\":true}, \"1\":{\"str_val\":\"lexicon\"},\"2\":{\"str_val\":\"##model_name##\"},\"3\":{\"int_val\":##lexicon_version##},\"26\":{\"int_val\":1},\"34\":{\"int_val\":6}}}}}", "##lexicon_version##", String.valueOf(this.A01)), "##model_name##", str);
        this.A04 = 0Pz.A0T("msgr_sticker_typeahead_v", this.A01);
        this.A06 = new 4dB();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (((X.C82q) r303).A05 != 0) goto L6;
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
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0249. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 312, insn: 0x03b5: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r312 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:111:0x03b5 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03a6 A[Catch: all -> 0x03b3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03b3, blocks: (B:18:0x0181, B:20:0x0188, B:80:0x0114, B:83:0x0120, B:85:0x012b, B:86:0x0132, B:88:0x013c, B:90:0x0148, B:91:0x014f, B:92:0x0156, B:93:0x015d, B:94:0x0163, B:95:0x0169, B:96:0x0170, B:101:0x03a6, B:102:0x03ab, B:104:0x03b2), top: B:11:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0120 A[Catch: all -> 0x03b3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03b3, blocks: (B:18:0x0181, B:20:0x0188, B:80:0x0114, B:83:0x0120, B:85:0x012b, B:86:0x0132, B:88:0x013c, B:90:0x0148, B:91:0x014f, B:92:0x0156, B:93:0x015d, B:94:0x0163, B:95:0x0169, B:96:0x0170, B:101:0x03a6, B:102:0x03ab, B:104:0x03b2), top: B:11:0x0070 }] */
    /* JADX WARN: Type inference failed for: r305v10 */
    /* JADX WARN: Type inference failed for: r305v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r305v9 */
    /* JADX WARN: Type inference failed for: r312v0, types: [X.4dH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object BCa(java.lang.String r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mantle.messenger.manager.MessengerRecommendationProvider.BCa(java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0158, code lost:
    
        if (X.4kH.A00(r0, r306) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object BPD(java.lang.String r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mantle.messenger.manager.MessengerRecommendationProvider.BPD(java.lang.String, X.0DR):java.lang.Object");
    }
}
