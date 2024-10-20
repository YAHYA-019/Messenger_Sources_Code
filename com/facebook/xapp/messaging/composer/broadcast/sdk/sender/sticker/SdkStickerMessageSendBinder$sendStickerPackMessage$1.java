package com.facebook.xapp.messaging.composer.broadcast.sdk.sender.sticker;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.4kB;
import X.5gP;
import X.AnonymousClass539;
import X.AnonymousClass724;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.model.Sticker;
import kotlin.jvm.functions.Function2;

/* loaded from: SdkStickerMessageSendBinder$sendStickerPackMessage$1.class */
public final class SdkStickerMessageSendBinder$sendStickerPackMessage$1 extends 0DO implements Function2 {
    public final /* synthetic */ 5gP $message;
    public final /* synthetic */ AnonymousClass539 $messageSendEntryPoint;
    public final /* synthetic */ String $navigationChain;
    public final /* synthetic */ String $sendAttribution;
    public final /* synthetic */ 4kB $sendSpeedLogger;
    public final /* synthetic */ Sticker $sticker;
    public final /* synthetic */ ThreadKey $threadKey;
    public int label;
    public final /* synthetic */ AnonymousClass724 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkStickerMessageSendBinder$sendStickerPackMessage$1(ThreadKey threadKey, Sticker sticker, AnonymousClass539 anonymousClass539, AnonymousClass724 anonymousClass724, 4kB r306, 5gP r307, String str, String str2, 0DR r310) {
        super(2, r310);
        this.$sendSpeedLogger = r306;
        this.$message = r307;
        this.this$0 = anonymousClass724;
        this.$sticker = sticker;
        this.$threadKey = threadKey;
        this.$sendAttribution = str;
        this.$navigationChain = str2;
        this.$messageSendEntryPoint = anonymousClass539;
    }

    public final 0DR create(Object obj, 0DR r303) {
        4kB r0 = this.$sendSpeedLogger;
        5gP r02 = this.$message;
        AnonymousClass724 anonymousClass724 = this.this$0;
        Sticker sticker = this.$sticker;
        return new SdkStickerMessageSendBinder$sendStickerPackMessage$1(this.$threadKey, sticker, this.$messageSendEntryPoint, anonymousClass724, r0, r02, this.$sendAttribution, this.$navigationChain, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:82:0x06c1
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:100:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x043e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.composer.broadcast.sdk.sender.sticker.SdkStickerMessageSendBinder$sendStickerPackMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
