package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.media.download.params.DownloadPhotosParams;
import com.facebook.messaging.media.download.params.PhotoToDownload;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.google.common.collect.ImmutableList;

/* loaded from: Ht2.class */
public abstract class Ht2 {
    public void A02() {
        if (this instanceof GoY) {
            GoY goY = (GoY) this;
            goY.A0H.A02();
            IPl iPl = goY.A05;
            if (iPl != null) {
                iPl.A06.A0H();
            }
            goY.A02 = null;
            goY.A07 = false;
            return;
        }
        if (this instanceof C2795GoV) {
            C2795GoV c2795GoV = (C2795GoV) this;
            c2795GoV.A04.A02();
            TextView textView = c2795GoV.A00;
            if (textView != null) {
                DKC.A1Q(textView);
                return;
            }
            return;
        }
        if (this instanceof GoX) {
            GoX goX = (GoX) this;
            goX.A06.A02();
            GoX.A00(goX);
        } else if (this instanceof C2796GoZ) {
            C2796GoZ c2796GoZ = (C2796GoZ) this;
            c2796GoZ.A0G.A02();
            C2796GoZ.A00(c2796GoZ);
        }
    }

    public void A03(6Ro r302) {
        if (this instanceof GoY) {
            GoY goY = (GoY) this;
            goY.A02.getClass();
            VideoAttachmentData videoAttachmentData = goY.A02;
            r302.A07(goY.A08, CallerContext.A08(goY.getClass(), "messenger_montage_viewer_video_save"), videoAttachmentData, goY.A0G, true);
            return;
        }
        if (!(this instanceof C2796GoZ)) {
            throw AnonymousClass001.A0N("Message downloading unsupported");
        }
        C2796GoZ c2796GoZ = (C2796GoZ) this;
        CallerContext A08 = CallerContext.A08(c2796GoZ.getClass(), "messenger_montage_viewer_photo_save");
        c2796GoZ.A03.getClass();
        Context context = c2796GoZ.A05;
        ImageAttachmentData imageAttachmentData = c2796GoZ.A03;
        RequestPermissionsConfig requestPermissionsConfig = 6Ro.A06;
        String str = imageAttachmentData.A0C;
        11T.A0F(str, 1);
        PhotoToDownload photoToDownload = new PhotoToDownload(null, null, str, null);
        6Ro.A01(context, (ViewerContext) null, A08, r302, new DownloadPhotosParams(ImmutableList.of((Object) photoToDownload), 0S2.A00, false, false), c2796GoZ.A0F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0610, code lost:
    
        r310 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0617, code lost:
    
        r303 = "video_uri_host";
        r307 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x050b, code lost:
    
        r303 = "video_thumbnail_host";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0518, code lost:
    
        if (r0.getHost() != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x051b, code lost:
    
        r307 = "host_uri_null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0567, code lost:
    
        r307 = r0.getHost();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0625, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0626, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x062f, code lost:
    
        if (r0 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0632, code lost:
    
        X.1BK.A1E(r0.A01).execute(new X.J0c(r0, r0.A01, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x065a, code lost:
    
        r0 = new X.6TF();
        r0.A03 = r0;
        r0.A01 = r0.A02;
        r0.A00 = r0 / r0;
        r0.A02 = X.IPl.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x069f, code lost:
    
        if (r0 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x06a2, code lost:
    
        r0.A03(X.2Dp.A00(r0), "CoverImageParamsKey");
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x06b5, code lost:
    
        r0 = r0.A06;
        r0.A0R(r331);
        r0 = r0.A0V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x06cc, code lost:
    
        if (r0 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x06cf, code lost:
    
        r0 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x06d8, code lost:
    
        if (r0 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x06db, code lost:
    
        r0 = r0.indexOf(X.AbE.A00(81));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x06f2, code lost:
    
        if (r0 <= 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x06f5, code lost:
    
        r0 = r0 + 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0707, code lost:
    
        if (r0 >= r0.length()) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x071c, code lost:
    
        if (r0.lastIndexOf("urn:mpeg:dash:profile:isoff-live:2011", r0) <= 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x071f, code lost:
    
        r307 = com.facebook.video.common.playerorigin.PlayerOrigin.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0724, code lost:
    
        r0.A0M(r307);
        r0.A0N(r0.A01());
        r0.CrU(X.C52j.A1x, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x074f, code lost:
    
        if (r0.A00 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0770, code lost:
    
        if (r0.A05.AZk(36311685041163488L) == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0773, code lost:
    
        r0.A00.A00.A0F.BrE();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0787, code lost:
    
        r0.A00.A00.A0F.BrJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x07c0, code lost:
    
        if (X.1BK.A0N(r0.A09).AZk(36326163374691653L) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x07c3, code lost:
    
        ((X.C09374px) r0.A0C.get()).A02(r0.A0k, ((X.60V) X.1Hv.A03(r0, X.60V.class, (java.lang.Class) null)).A07(r304));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0800, code lost:
    
        if (r0 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0803, code lost:
    
        r0 = r0.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x080a, code lost:
    
        if (r0 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x080d, code lost:
    
        r0.A01.setVisibility(0);
        r0 = r0.A01;
        r0 = X.2IA.A01(r0);
        r0.A0C = X.GiZ.A00(r0);
        r0 = r0.A04();
        r0 = com.facebook.common.callercontext.CallerContext.A06(X.GoY.class);
        X.11T.A0F(r0, 0);
        X.7kZ.A00(r0, (X.4gJ) null, r0, (X.InterfaceC06384gn) null, r0, (java.lang.Boolean) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x084e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0859, code lost:
    
        r0.A01.setVisibility(8);
        r0.A01.A06(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x086c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x084f, code lost:
    
        r307 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e2, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0147, code lost:
    
        if (r0.A10 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0298, code lost:
    
        if ((X.DKC.A01(r0, r0) / r0) <= 0.15d) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x029b, code lost:
    
        r331 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x029e, code lost:
    
        r0 = r0.A05;
        r0 = r0.A02;
        r0 = r0.A0C;
        r0 = r0.A08;
        r0 = r0.A0F;
        com.google.common.base.Preconditions.checkArgument(X.AnonymousClass001.A1P(r0));
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02d6, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04eb, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04f4, code lost:
    
        if (r0 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x04f9, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04ff, code lost:
    
        r303 = "video_thumbnail_host";
        r307 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0523, code lost:
    
        r0.Bch(r303, r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x053f, code lost:
    
        r0.A00.Bch(com.facebook.proxygen.TraceFieldType.VideoId, r0.A0k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0548, code lost:
    
        r0 = r0.A0V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x054f, code lost:
    
        if (r0 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x057b, code lost:
    
        r0.A00.Bci("has_dash_manifest", X.AnonymousClass001.A1T(r0.A07));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0584, code lost:
    
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x058b, code lost:
    
        if (r0 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x058e, code lost:
    
        r310 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0595, code lost:
    
        r303 = "video_uri_host";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x05a2, code lost:
    
        if (r0.getHost() != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x05a5, code lost:
    
        r307 = "host_uri_null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x05ad, code lost:
    
        r310.Bch(r303, r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x05b6, code lost:
    
        r0 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x05bd, code lost:
    
        if (r0 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x05c0, code lost:
    
        r310 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x05c7, code lost:
    
        r303 = "video_hg_uri_host";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x05d4, code lost:
    
        if (r0.getHost() != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x05d7, code lost:
    
        r307 = "host_uri_null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x05df, code lost:
    
        r310.Bch(r303, r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x05e9, code lost:
    
        r307 = r0.getHost();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x05f3, code lost:
    
        r310 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x05fa, code lost:
    
        r303 = "video_hg_uri_host";
        r307 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0606, code lost:
    
        r307 = r0.getHost();
     */
    /* JADX WARN: Type inference failed for: r0v76, types: [com.facebook.drawee.view.DraweeView, com.facebook.drawee.fbpipeline.FbDraweeView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(com.facebook.messaging.montage.model.MontageCard r302) {
        /*
            Method dump skipped, instructions count: 3388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ht2.A04(com.facebook.messaging.montage.model.MontageCard):void");
    }
}
