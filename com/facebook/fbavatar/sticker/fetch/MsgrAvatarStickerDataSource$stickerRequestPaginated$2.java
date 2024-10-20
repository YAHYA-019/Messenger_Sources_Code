package com.facebook.fbavatar.sticker.fetch;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: MsgrAvatarStickerDataSource$stickerRequestPaginated$2.class */
public final class MsgrAvatarStickerDataSource$stickerRequestPaginated$2 extends 0DO implements Function2 {
    public final /* synthetic */ boolean $animatedStickersEnabled;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ boolean $fetchStickerTags;
    public final /* synthetic */ String $offsetId;
    public final /* synthetic */ List $otherUsersIds;
    public final /* synthetic */ int $pageSize;
    public final /* synthetic */ boolean $socialStickersEnabled;
    public final /* synthetic */ ThreadKey $threadKey;
    public int label;
    public final /* synthetic */ MsgrAvatarStickerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgrAvatarStickerDataSource$stickerRequestPaginated$2(FbUserSession fbUserSession, MsgrAvatarStickerDataSource msgrAvatarStickerDataSource, ThreadKey threadKey, String str, List list, 0DR r307, int i, boolean z, boolean z2, boolean z3) {
        super(2, r307);
        this.$pageSize = i;
        this.$offsetId = str;
        this.$fetchStickerTags = z;
        this.$animatedStickersEnabled = z2;
        this.$socialStickersEnabled = z3;
        this.$threadKey = threadKey;
        this.$fbUserSession = fbUserSession;
        this.this$0 = msgrAvatarStickerDataSource;
        this.$otherUsersIds = list;
    }

    public final 0DR create(Object obj, 0DR r303) {
        int i = this.$pageSize;
        String str = this.$offsetId;
        boolean z = this.$fetchStickerTags;
        boolean z2 = this.$animatedStickersEnabled;
        boolean z3 = this.$socialStickersEnabled;
        return new MsgrAvatarStickerDataSource$stickerRequestPaginated$2(this.$fbUserSession, this.this$0, this.$threadKey, str, this.$otherUsersIds, r303, i, z, z2, z3);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0388, code lost:
    
        r0.add(new X.8Le(X.C9iX.A00(r0.A0K(1982634631, X.2JX.class, 2006618978), r0), r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03a4, code lost:
    
        if (r317 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03b5, code lost:
    
        r319 = java.lang.Integer.valueOf(r317.getIntValue(94851343));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03bc, code lost:
    
        r0 = com.facebook.common.util.TriState.YES;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03c1, code lost:
    
        r0 = X.C0ty.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03c6, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03cf, code lost:
    
        if (r319 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03d2, code lost:
    
        r306 = r319.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03e6, code lost:
    
        new X.9Rv(r0, r0, r0, r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03f9, code lost:
    
        if (r307 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0403, code lost:
    
        r0 = r307.A0r(-77796550);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x040c, code lost:
    
        if (r0 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0416, code lost:
    
        r0 = r307.A0r(-439748141);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x041f, code lost:
    
        if (r0 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0429, code lost:
    
        r0 = r307.getBooleanValue(-1575811850);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0432, code lost:
    
        if (r319 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0435, code lost:
    
        r324 = r319.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0459, code lost:
    
        new X.9Rv(r0, new X.9QI(r0, r0, r0), r0, r324);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0461, code lost:
    
        r324 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03ee, code lost:
    
        r306 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x039c, code lost:
    
        if (r317 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02e4, code lost:
    
        if (r309 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e7, code lost:
    
        r309 = X.C0ty.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02ec, code lost:
    
        r0 = X.AnonymousClass001.A0s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02f1, code lost:
    
        r0 = r309.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0305, code lost:
    
        if (r0.hasNext() == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x031f, code lost:
    
        r0 = X.7zL.A0P(r0).A0T(X.2JX.class, -291440700);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0328, code lost:
    
        if (r0 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x032b, code lost:
    
        r0 = r0.A0k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0334, code lost:
    
        if (r0 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x033e, code lost:
    
        r0 = r0.getIntValue(-1485301112);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x034c, code lost:
    
        X.1Br.A0C(r0.A02);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbavatar.sticker.fetch.MsgrAvatarStickerDataSource$stickerRequestPaginated$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
