package X;

import android.graphics.Bitmap;
import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.StoryReplyMessageSendBinder;
import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams;

/* loaded from: Ilt.class */
public final class Ilt implements JJQ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 1Br A03;
    public final /* synthetic */ StoryReplyMessageSendBinder A04;
    public final /* synthetic */ SendTamXMAMessageParams A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public Ilt(1Br r302, StoryReplyMessageSendBinder storyReplyMessageSendBinder, SendTamXMAMessageParams sendTamXMAMessageParams, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3) {
        this.A04 = storyReplyMessageSendBinder;
        this.A0A = str;
        this.A06 = str2;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
        this.A07 = str3;
        this.A05 = sendTamXMAMessageParams;
        this.A09 = str4;
        this.A08 = str5;
        this.A03 = r302;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:48:0x02c2
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.String] */
    private final void A00(java.lang.String r302, android.graphics.Bitmap r303) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ilt.A00(java.lang.String, android.graphics.Bitmap):void");
    }

    public void BM3(Throwable th) {
        0fH.A14("StoryReplyMessageSendBinder", " Fail to fetch preview.", new Object[]{th != null ? th.toString() : null});
        A00("image/jpeg", null);
    }

    public void BMj(Bitmap bitmap, 2EU r303, String str) {
        A00(str, bitmap);
    }
}
