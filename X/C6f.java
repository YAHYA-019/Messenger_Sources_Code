package X;

import androidx.lifecycle.LiveData;
import com.facebook.messaging.communitymessaging.plugins.channelcreation.chat.channeleditingoperation.ChatChannelCreationImplementation;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C6f.class */
public final class C6f {
    public final BaS A00;

    public C6f(BaS baS) {
        this.A00 = baS;
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
    /* JADX WARN: Failed to calculate best type for var: r345v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r345v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r347v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r347v0 ??
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
    /* JADX WARN: Not initialized variable reg: 345, insn: 0x0686: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r345 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:218:0x0686 */
    /* JADX WARN: Not initialized variable reg: 347, insn: 0x0680: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r347 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:217:0x066c */
    public void A00(com.facebook.messaging.communitymessaging.model.CommunityChannelPrivacyType r302, com.facebook.messaging.communitymessaging.model.MessengerApprovalMode r303, com.facebook.messaging.model.threads.ThreadSummary r304, com.google.common.collect.ImmutableList r305, java.lang.Boolean r306, java.lang.Boolean r307, java.lang.Boolean r308, java.lang.Long r309, java.lang.Long r310, java.lang.String r311, java.lang.String r312, java.lang.String r313, java.lang.String r314, java.lang.String r315, java.lang.String r316, java.lang.String r317, java.lang.String r318, java.lang.String r319, java.lang.String r320) {
        /*
            Method dump skipped, instructions count: 1709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6f.A00(com.facebook.messaging.communitymessaging.model.CommunityChannelPrivacyType, com.facebook.messaging.communitymessaging.model.MessengerApprovalMode, com.facebook.messaging.model.threads.ThreadSummary, com.google.common.collect.ImmutableList, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void A01(String str, String str2) {
        int andIncrement;
        String str3;
        RgS rgS = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = rgS.A06;
        r0.A08("com.facebook.messaging.communitymessaging.plugins.interfaces.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "messaging.communitymessaging.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "restoreOperationState", andIncrement2);
        Exception e = null;
        try {
            if (str.equals("create_chat") && RgS.A00(rgS)) {
                andIncrement = atomicInteger.getAndIncrement();
                str3 = "messaging.communitymessaging.channelcreation.chat.channeleditingoperation.ChatChannelCreationImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.channelcreation.chat.channeleditingoperation.ChatChannelCreationImplementation", str3, "com.facebook.messaging.communitymessaging.plugins.interfaces.channeleditingoperation.ChannelEditingOperationInterfaceSpec", andIncrement, "messaging.communitymessaging.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.channelcreation.chat.CommunitymessagingChannelcreationChatKillSwitch", "restoreOperationState");
                try {
                    try {
                        ChatChannelCreationImplementation chatChannelCreationImplementation = rgS.A00;
                        CbC cbC = (CbC) 1Lm.A05(chatChannelCreationImplementation.A00, chatChannelCreationImplementation.A01, 83332);
                        if (str2 != null && str2.length() != 0) {
                            LiveData liveData = (LiveData) cbC.A07.get(str2);
                            if (liveData != null) {
                                ChatChannelCreationImplementation.A00(liveData, (RON) null, chatChannelCreationImplementation);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str3, "messaging.communitymessaging.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "restoreOperationState", andIncrement);
                    throw th;
                }
            } else {
                if (!str.equals("edit_chat") || !RgS.A02(rgS)) {
                    if (!str.equals("suggest_chat") || !RgS.A01(rgS)) {
                        r0.A02((Exception) null, "messaging.communitymessaging.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "restoreOperationState", andIncrement2);
                        return;
                    }
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.channelcreation.chat.chatsuggestion.channeleditingoperation.ChatChannelSuggestionImplementation", "messaging.communitymessaging.channelcreation.chat.chatsuggestion.channeleditingoperation.ChatChannelSuggestionImplementation", "com.facebook.messaging.communitymessaging.plugins.interfaces.channeleditingoperation.ChannelEditingOperationInterfaceSpec", andIncrement3, "messaging.communitymessaging.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.channelcreation.chat.CommunitymessagingChannelcreationChatKillSwitch", "restoreOperationState");
                    r0.A09("messaging.communitymessaging.channelcreation.chat.chatsuggestion.channeleditingoperation.ChatChannelSuggestionImplementation", "messaging.communitymessaging.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "restoreOperationState", andIncrement3);
                    r0.A02((Exception) null, "messaging.communitymessaging.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "restoreOperationState", andIncrement2);
                }
                andIncrement = atomicInteger.getAndIncrement();
                str3 = "messaging.communitymessaging.channelediting.channeleditingoperation.ChatChannelEditingImplementation";
                r0.A0A("com.facebook.messaging.communitymessaging.plugins.channelediting.channeleditingoperation.ChatChannelEditingImplementation", str3, "com.facebook.messaging.communitymessaging.plugins.interfaces.channeleditingoperation.ChannelEditingOperationInterfaceSpec", andIncrement, "messaging.communitymessaging.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.channelediting.CommunitymessagingChanneleditingKillSwitch", "restoreOperationState");
            }
            r0.A09(str3, "messaging.communitymessaging.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "restoreOperationState", andIncrement);
            r0.A02((Exception) null, "messaging.communitymessaging.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "restoreOperationState", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.communitymessaging.channeleditingoperation.ChannelEditingOperationInterfaceSpec", "restoreOperationState", andIncrement2);
            throw th2;
        }
    }
}
