package com.facebook.xapp.messaging.composer.avatar.avatardetails.sender;

import X.04S;
import X.0DO;
import X.0DR;
import X.BPk;
import X.Hhx;
import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams;
import kotlin.jvm.functions.Function2;

/* loaded from: AvatarDetailMessageSender$sendReplyMessage$1.class */
public final class AvatarDetailMessageSender$sendReplyMessage$1 extends 0DO implements Function2 {
    public final /* synthetic */ String $logId;
    public final /* synthetic */ String $navigationChain;
    public final /* synthetic */ String $offlineThreadingId;
    public final /* synthetic */ long $replyOwnerFbId;
    public final /* synthetic */ SendTamXMAMessageParams $replyParams;
    public final /* synthetic */ String $sendAttribution;
    public final /* synthetic */ long $senderPk;
    public final /* synthetic */ long $threadPk;
    public final /* synthetic */ BPk $type;
    public int label;
    public final /* synthetic */ Hhx this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarDetailMessageSender$sendReplyMessage$1(BPk bPk, Hhx hhx, SendTamXMAMessageParams sendTamXMAMessageParams, String str, String str2, String str3, String str4, 0DR r309, long j, long j2, long j3) {
        super(2, r309);
        this.this$0 = hhx;
        this.$replyOwnerFbId = j;
        this.$type = bPk;
        this.$offlineThreadingId = str;
        this.$threadPk = j2;
        this.$senderPk = j3;
        this.$replyParams = sendTamXMAMessageParams;
        this.$sendAttribution = str2;
        this.$navigationChain = str3;
        this.$logId = str4;
    }

    public final 0DR create(Object obj, 0DR r303) {
        Hhx hhx = this.this$0;
        long j = this.$replyOwnerFbId;
        return new AvatarDetailMessageSender$sendReplyMessage$1(this.$type, hhx, this.$replyParams, this.$offlineThreadingId, this.$sendAttribution, this.$navigationChain, this.$logId, r303, j, this.$threadPk, this.$senderPk);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:31:0x0264
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.composer.avatar.avatardetails.sender.AvatarDetailMessageSender$sendReplyMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
