package com.facebook.messaging.msys.common.translator;

import X.0AC;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BQ;
import X.1qX;
import X.48N;
import X.48O;
import X.48P;
import X.48R;
import X.4YU;
import X.5HV;
import X.5PI;
import X.5pI;
import X.5xX;
import X.6B1;
import X.AnonymousClass001;
import X.C00i;
import X.C00j;
import X.C07924lC;
import X.C0A2;
import X.C1pq;
import X.C48g;
import X.C5pg;
import X.C5pj;
import X.C5pk;
import X.C5pn;
import X.COT;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attachment.AttachmentImageMap;
import com.facebook.messaging.model.attachment.ImageData;
import com.facebook.messaging.model.attachment.ImageUrl;
import com.facebook.messaging.model.attachment.VideoData;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.messages.ReactionMetaData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.facebookmessaging.extensions.datatranslator.MsysFacebookMessagingTempMessageAttachmentListUtil;
import com.facebook.messenger.orca.ChildResultSetUtils;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.CQLResultSetImpl;
import com.facebook.msys.mci.JQLResultSet;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionCount;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionsCount;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: AbstractMsysMessagesCollectionTranslator.class */
public abstract class AbstractMsysMessagesCollectionTranslator {
    public final 5HV A03;
    public final C00i A02 = new 1BQ(100038);
    public final C00i A01 = new 1BQ(68335);
    public final C00i A00 = new 1BQ(16511);

    public AbstractMsysMessagesCollectionTranslator(5HV r302) {
        this.A03 = r302;
    }

    public static int A00(CQLResultSet cQLResultSet, int i, int i2) {
        Integer nullableInteger = cQLResultSet.getNullableInteger(i, i2);
        11T.A0D(nullableInteger);
        return nullableInteger.intValue();
    }

    public static long A01(ThreadKey threadKey, C07924lC c07924lC, int i) {
        if (!ThreadKey.A0U(threadKey)) {
            return -1;
        }
        ((1qX) c07924lC).mResultSet.getNullableLong(i, ActionId.ACTION_BAR_COMPLETE).getClass();
        return ((1qX) c07924lC).mResultSet.getNullableLong(i, ActionId.ACTION_BAR_COMPLETE).longValue();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0b55, code lost:
    
        if (r0 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x24a5, code lost:
    
        if (r0.longValue() > java.lang.System.currentTimeMillis()) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x24bf, code lost:
    
        if (r0 == null) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x24cd, code lost:
    
        if (r0 == 17) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0e7e, code lost:
    
        r367 = null;
        r368 = null;
        r369 = null;
        r352 = null;
        r370 = null;
        r371 = null;
        r372 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0fa9, code lost:
    
        if (r330 != null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0e9e, code lost:
    
        if (r330 != null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0cb6, code lost:
    
        if (r330.A08("is_error") == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0c28, code lost:
    
        if (r330 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x296b, code lost:
    
        if (r313 == 3) goto L672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0659, code lost:
    
        if (((X.1qX) r304).mResultSet.getNullableInteger(r321, com.facebook.acra.constants.ActionId.DATA_LOAD_START).intValue() <= 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x07fd, code lost:
    
        if (r359 == X.0S2.A00) goto L106;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:450:0x1e38. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x27c2  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x282b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x2926 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0c26  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0fc6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x1095  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x10c9  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x10e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x11ac  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x07ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.messaging.model.messages.MessagesCollection A02(com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType r301, com.facebook.messaging.model.threadkey.ThreadKey r302, com.facebook.messaging.msys.common.translator.AbstractMsysMessagesCollectionTranslator r303, X.C07924lC r304, X.5pI r305, com.facebook.xapp.messaging.capability.vector.Capabilities r306, com.google.common.collect.ImmutableSet r307, java.lang.Boolean r308, java.lang.Number r309, java.util.List r310, java.util.Map r311, int r312, int r313) {
        /*
            Method dump skipped, instructions count: 10692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.common.translator.AbstractMsysMessagesCollectionTranslator.A02(com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.msys.common.translator.AbstractMsysMessagesCollectionTranslator, X.4lC, X.5pI, com.facebook.xapp.messaging.capability.vector.Capabilities, com.google.common.collect.ImmutableSet, java.lang.Boolean, java.lang.Number, java.util.List, java.util.Map, int, int):com.facebook.messaging.model.messages.MessagesCollection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0167, code lost:
    
        if (X.48P.A0B == r308) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0db2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0e61  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0e8a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0ebf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0eea  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0f2b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0fd4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x1012  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0e24  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0c63 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x1075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0a59  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0aa3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07(X.5PI r302, X.C07924lC r303, int r304) {
        /*
            Method dump skipped, instructions count: 5575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.common.translator.AbstractMsysMessagesCollectionTranslator.A07(X.5PI, X.4lC, int):void");
    }

    private void A08(6B1 r302, C07924lC c07924lC, String str, int i) {
        String string;
        String A03;
        int i2;
        String valueOf;
        Integer nullableInteger;
        Integer nullableInteger2;
        Boolean A0d;
        ImmutableList build;
        Uri A032;
        int intValue;
        48O r308;
        boolean z;
        if (this instanceof C5pj) {
            CQLResultSet cQLResultSet = null;
            Integer nullableInteger3 = ((1qX) c07924lC).mResultSet.getNullableInteger(i, 41);
            string = ((1qX) c07924lC).mResultSet.getString(i, 50);
            C00i c00i = ((C5pj) this).A02;
            A03 = ((0AC) c00i.get()).A03(((1qX) c07924lC).mResultSet.getNullableLong(i, 45), ((1qX) c07924lC).mResultSet.getString(i, 48), ((1qX) c07924lC).mResultSet.getString(i, 49));
            if (nullableInteger3 != null) {
                int intValue2 = nullableInteger3.intValue();
                if (intValue2 == 4) {
                    ChildResultSetUtils childResultSetUtils = ChildResultSetUtils.sInstance;
                    CQLResultSet cQLResultSet2 = ((1qX) c07924lC).mResultSet;
                    CQLResultSet A02 = cQLResultSet2 instanceof JQLResultSet ? ((JQLResultSet) cQLResultSet2).A02("attachments", i) : ChildResultSetUtils.getOrcaTempMessageAttachmentListFromOrcaTempMessageListNative((CQLResultSetImpl) cQLResultSet2, i);
                    z = false;
                    if (A02 != null) {
                        z = true;
                        cQLResultSet = A02;
                    }
                } else {
                    z = false;
                }
                if (A03 != null) {
                    if (intValue2 == 4 && z && cQLResultSet.getCount() > 0) {
                        int A033 = C5pj.A03(nullableInteger3);
                        String string2 = cQLResultSet.getString(0, 8);
                        String string3 = cQLResultSet.getString(0, 0);
                        String string4 = cQLResultSet.getString(0, 10);
                        Long nullableLong = cQLResultSet.getNullableLong(0, 11);
                        String string5 = cQLResultSet.getString(0, 20);
                        String string6 = cQLResultSet.getString(0, 24);
                        String string7 = cQLResultSet.getString(0, 28);
                        String A034 = ((0AC) c00i.get()).A03(cQLResultSet.getNullableLong(0, 27), cQLResultSet.getString(0, 25), cQLResultSet.getString(0, 26));
                        r308 = MsysFacebookMessagingTempMessageAttachmentListUtil.A00(false, false, cQLResultSet.getNullableInteger(0, 32), cQLResultSet.getNullableInteger(0, 33), cQLResultSet.getNullableInteger(0, 188), null, nullableLong, cQLResultSet.getNullableLong(0, 21), cQLResultSet.getNullableLong(0, 212), cQLResultSet.getNullableLong(0, ActionId.ACTIVITY_START), cQLResultSet.getNullableLong(0, ActionId.SERVICE_ON_START_COMMAND), string2, string3, string4, string5, A03, string6, string7, A034, cQLResultSet.getString(0, 29), cQLResultSet.getString(0, 187), cQLResultSet.getString(0, 207), cQLResultSet.getString(0, 208), cQLResultSet.getString(0, 209), cQLResultSet.getString(0, 210), cQLResultSet.getString(0, 211), cQLResultSet.getString(0, 91), cQLResultSet.getString(0, 92), cQLResultSet.getString(0, 7), null, null, A033);
                    } else {
                        i2 = C5pj.A03(nullableInteger3);
                        valueOf = String.valueOf(((1qX) c07924lC).mResultSet.getNullableLong(i, 40));
                        nullableInteger = ((1qX) c07924lC).mResultSet.getNullableInteger(i, 47);
                        nullableInteger2 = ((1qX) c07924lC).mResultSet.getNullableInteger(i, 46);
                        A0d = false;
                        r308 = MsysFacebookMessagingTempMessageAttachmentListUtil.A00(A0d, A0d, nullableInteger, nullableInteger2, null, null, null, null, null, null, null, valueOf, str, null, string, A03, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(((1qX) c07924lC).mResultSet.getString(i, 39)), null, i2);
                    }
                }
            }
            r308 = new 48O("tempReplyAttachmentIdStr", str);
            r308.A04 = 48P.A0C;
        } else {
            if (this instanceof 5xX) {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                48O r0 = new 48O("tempReplyAttachmentIdStr", str);
                String string8 = ((1qX) c07924lC).mResultSet.getString(i, ActionId.LEGACY_MARKER);
                String string9 = ((1qX) c07924lC).mResultSet.getString(i, 48);
                if (string8 != null && string9 != null) {
                    try {
                        A032 = C0A2.A03(string9);
                    } catch (SecurityException unused) {
                    }
                    if (A032 != null) {
                        String lastPathSegment = A032.getLastPathSegment();
                        String queryParameter = A032.getQueryParameter("mac");
                        if (queryParameter != null && lastPathSegment != null && ((1qX) c07924lC).mResultSet.getString(i, 50) != null) {
                            r0.A0B = string8;
                            r0.A0H = queryParameter;
                            r0.A0E = lastPathSegment;
                            r0.A0I = 4YU.A11(c07924lC, i, 50);
                            Integer nullableInteger4 = ((1qX) c07924lC).mResultSet.getNullableInteger(i, 41);
                            if (nullableInteger4 != null && (((intValue = nullableInteger4.intValue()) == 1 || intValue == 6) && ((1qX) c07924lC).mResultSet.getNullableInteger(i, 47) != null && ((1qX) c07924lC).mResultSet.getNullableInteger(i, 46) != null)) {
                                int A00 = A00(((1qX) c07924lC).mResultSet, i, 47);
                                int A002 = A00(((1qX) c07924lC).mResultSet, i, 46);
                                HashMap A0u = AnonymousClass001.A0u();
                                A0u.put(48N.A02, new ImageUrl(0, 11T.A02(COT.A00(lastPathSegment, str)), 0));
                                r0.A07 = new ImageData(new AttachmentImageMap(null, A0u), new AttachmentImageMap(null, AnonymousClass001.A0u()), 48R.A01, "", 11T.A02(COT.A00(lastPathSegment, str)), A00, A002, false);
                                r0.A04 = 48P.A07;
                            }
                            Integer nullableInteger5 = ((1qX) c07924lC).mResultSet.getNullableInteger(i, 41);
                            if (nullableInteger5 != null && nullableInteger5.intValue() == 2 && ((1qX) c07924lC).mResultSet.getNullableInteger(i, 47) != null && ((1qX) c07924lC).mResultSet.getNullableInteger(i, 46) != null) {
                                VideoData videoData = new VideoData(Uri.parse(11T.A02(COT.A00(lastPathSegment, str))), Uri.parse(11T.A02(COT.A01(lastPathSegment, str))), C48g.VIDEO_ATTACHMENT, null, A00(((1qX) c07924lC).mResultSet, i, 47), A00(((1qX) c07924lC).mResultSet, i, 46), 0, -1, 0);
                                videoData.A0E = null;
                                r0.A08 = videoData;
                            }
                            builder.m11011add((Object) new Attachment(r0));
                            build = builder.build();
                            r302.A07 = build;
                        }
                    }
                }
                r0.A04 = 48P.A0C;
                builder.m11011add((Object) new Attachment(r0));
                build = builder.build();
                r302.A07 = build;
            }
            if (!(this instanceof C5pg)) {
                return;
            }
            Integer nullableInteger6 = ((1qX) c07924lC).mResultSet.getNullableInteger(i, 41);
            string = ((1qX) c07924lC).mResultSet.getString(i, 50);
            A03 = ((0AC) ((C5pg) this).A02.get()).A03(((1qX) c07924lC).mResultSet.getNullableLong(i, 45), ((1qX) c07924lC).mResultSet.getString(i, 48), ((1qX) c07924lC).mResultSet.getString(i, 49));
            if (nullableInteger6 != null && A03 != null) {
                int intValue3 = nullableInteger6.intValue();
                i2 = 2;
                if (intValue3 != 1) {
                    if (intValue3 != 2) {
                        if (intValue3 == 3) {
                            i2 = 3;
                        } else if (intValue3 != 11) {
                            if (intValue3 != 12) {
                                i2 = 0;
                            }
                        }
                    }
                    i2 = 4;
                }
                valueOf = String.valueOf(((1qX) c07924lC).mResultSet.getNullableLong(i, 40));
                nullableInteger = ((1qX) c07924lC).mResultSet.getNullableInteger(i, 47);
                nullableInteger2 = ((1qX) c07924lC).mResultSet.getNullableInteger(i, 46);
                A0d = 1BK.A0d();
                r308 = MsysFacebookMessagingTempMessageAttachmentListUtil.A00(A0d, A0d, nullableInteger, nullableInteger2, null, null, null, null, null, null, null, valueOf, str, null, string, A03, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(((1qX) c07924lC).mResultSet.getString(i, 39)), null, i2);
            }
            r308 = new 48O("tempReplyAttachmentIdStr", str);
            r308.A04 = 48P.A0C;
        }
        build = ImmutableList.of((Object) new Attachment(r308));
        r302.A07 = build;
    }

    public final MessagesCollection A05(GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType, ThreadKey threadKey, C07924lC c07924lC, 5pI r305, Capabilities capabilities, ImmutableSet immutableSet, Boolean bool, Map map, int i, int i2) {
        C00j.A05("MessagesCollection.translateFromQueryResult", -1364541542);
        try {
            MessagesCollection A02 = A02(graphQLMessengerGroupThreadSubType, threadKey, this, c07924lC, r305, capabilities, immutableSet, bool, null, null, map, i, i2);
            C00j.A01(945474771);
            return A02;
        } catch (Throwable th) {
            C00j.A01(2083461674);
            throw th;
        }
    }

    public void A06(GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType, 5PI r303, ThreadKey threadKey, C07924lC c07924lC, Capabilities capabilities, ImmutableSet immutableSet, Boolean bool, int i) {
        int intValue;
        int intValue2;
        int intValue3;
        GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType2 = graphQLMessengerGroupThreadSubType;
        C5pn orcaTempMessageReactionListFromOrcaTempMessageList = ChildResultSetUtils.getOrcaTempMessageReactionListFromOrcaTempMessageList(c07924lC, i);
        if (orcaTempMessageReactionListFromOrcaTempMessageList != null && ((1qX) orcaTempMessageReactionListFromOrcaTempMessageList).mResultSet.getCount() != 0) {
            HashMultimap hashMultimap = new HashMultimap();
            for (int i2 = 0; i2 < ((1qX) orcaTempMessageReactionListFromOrcaTempMessageList).mResultSet.getCount(); i2++) {
                String string = ((1qX) orcaTempMessageReactionListFromOrcaTempMessageList).mResultSet.getString(i2, 3);
                Integer num = 0S2.A00;
                C1pq.A08("reactionUnicode", string);
                UserKey A00 = UserKey.A00(Long.valueOf(((1qX) orcaTempMessageReactionListFromOrcaTempMessageList).mResultSet.getLong(i2, 0)));
                C1pq.A08("userKey", A00);
                hashMultimap.CZw(string, new ReactionMetaData(A00, num, 0L, string));
            }
            r303.A0D(hashMultimap);
        }
        C5pk c5pk = (C5pk) this.A02.get();
        if (graphQLMessengerGroupThreadSubType == null) {
            graphQLMessengerGroupThreadSubType2 = GraphQLMessengerGroupThreadSubType.A0E;
        }
        if (c5pk.A00(graphQLMessengerGroupThreadSubType2, threadKey, capabilities, immutableSet, bool)) {
            TempMessageReactionListUtil.A00(r303, ChildResultSetUtils.getOrcaTempMessageReactionsV2CountListFromOrcaTempMessageList(c07924lC, i));
            return;
        }
        CQLResultSet cQLResultSet = ((1qX) c07924lC).mResultSet;
        CQLResultSet A02 = cQLResultSet instanceof JQLResultSet ? ((JQLResultSet) cQLResultSet).A02("reactionsSummary", i) : ChildResultSetUtils.getOrcaTempMessageReactionsSummaryFromOrcaTempMessageListNative((CQLResultSetImpl) cQLResultSet, i);
        if (A02 == null || A02.getCount() == 0) {
            return;
        }
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(3);
        String string2 = A02.getString(0, 4);
        Integer nullableInteger = A02.getNullableInteger(0, 1);
        String string3 = A02.getString(0, 5);
        Integer nullableInteger2 = A02.getNullableInteger(0, 2);
        String string4 = A02.getString(0, 6);
        Integer nullableInteger3 = A02.getNullableInteger(0, 3);
        if (string2 != null && nullableInteger != null && (intValue3 = nullableInteger.intValue()) > 0) {
            Boolean nullableBoolean = A02.getNullableBoolean(0, 8);
            builderWithExpectedSize.m11011add((Object) new MessageReactionCount(string2, null, null, intValue3, 0L, nullableBoolean != null ? nullableBoolean.booleanValue() : false));
        }
        if (string3 != null && nullableInteger2 != null && (intValue2 = nullableInteger2.intValue()) > 0) {
            Boolean nullableBoolean2 = A02.getNullableBoolean(0, 9);
            builderWithExpectedSize.m11011add((Object) new MessageReactionCount(string3, null, null, intValue2, 0L, nullableBoolean2 != null ? nullableBoolean2.booleanValue() : false));
        }
        if (string4 != null && nullableInteger3 != null && (intValue = nullableInteger3.intValue()) > 0) {
            Boolean nullableBoolean3 = A02.getNullableBoolean(0, 10);
            builderWithExpectedSize.m11011add((Object) new MessageReactionCount(string4, null, null, intValue, 0L, nullableBoolean3 != null ? nullableBoolean3.booleanValue() : false));
        }
        ImmutableList build = builderWithExpectedSize.build();
        if (build.isEmpty()) {
            return;
        }
        ImmutableList.of();
        r303.A0i = new MessageReactionsCount(build, A02.getInteger(0, 7), false);
    }
}
