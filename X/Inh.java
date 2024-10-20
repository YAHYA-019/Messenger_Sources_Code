package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.messaging.montage.viewer.seensheet.MontageViewerFollowerSeenCountSubscription;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.RegularImmutableSet;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: Inh.class */
public final class Inh implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Inh(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }

    public static 2JX A00(2JY r301, MontageViewerFollowerSeenCountSubscription montageViewerFollowerSeenCountSubscription) {
        montageViewerFollowerSeenCountSubscription.A00 = r301.getIntValue(-1562837835);
        montageViewerFollowerSeenCountSubscription.A03 = IF7.A07(r301.A0K(-80658447, 2JX.class, -608186141).A0c(2050018379, C80d.class, -715080091));
        return r301.A0K(-678271974, 2JX.class, -942313021);
    }

    public static void A01(MontageViewerFollowerSeenCountSubscription montageViewerFollowerSeenCountSubscription, Inh inh) {
        if (09K.A00(montageViewerFollowerSeenCountSubscription.A03)) {
            Bundle bundle = new Bundle();
            bundle.putString("messageId", ((HU4) inh.A02).A00);
            bundle.putParcelableArrayList("overlays", new ArrayList<>(montageViewerFollowerSeenCountSubscription.A03));
            1Ho.A00(((BlueServiceOperationFactory) montageViewerFollowerSeenCountSubscription.A06.get()).newInstance_DEPRECATED(1BJ.A00(2120), bundle, 1, CallerContext.A06(MontageViewerFollowerSeenCountSubscription.class)), true);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onFailure(Throwable th) {
        String str;
        String str2;
        4zJ r307;
        Object[] objArr;
        String str3;
        String str4;
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                ((Hty) this.A03).A01 = false;
                7zL.A1T(this.A01, th);
                return;
            case 1:
                HiG hiG = (HiG) this.A02;
                MediaResource mediaResource = (MediaResource) this.A03;
                11T.A0F(mediaResource, 0);
                IWc.A00(hiG.A01, hiG.A02, hiG.A04, mediaResource, hiG.A00, hiG.A05);
                return;
            case 2:
                0fH.A0p("MediaViewInfo", "Failed to fetch message sender id for attachment", th);
                return;
            case 3:
            default:
                return;
            case 4:
                11T.A0F(th, 0);
                ((JIT) this.A01).Buh((EffectItem) this.A02, th);
                I98 i98 = (I98) this.A03;
                LinkedBlockingQueue linkedBlockingQueue = i98.A06;
                linkedBlockingQueue.remove();
                if (linkedBlockingQueue.isEmpty()) {
                    return;
                }
                I98.A01(i98);
                return;
            case 5:
                ((H51) this.A02).A07.setVisibility(DKG.A00(((I2Q) ((GWi) this.A01).A06.get()).A01((EffectItem) ((BaseItem) this.A03)) ? 1 : 0));
                return;
            case 6:
                ((JFK) this.A02).CI0((Haz) this.A03);
                return;
            case 7:
            case 9:
                str = "com.facebook.messaging.montage.viewer.seensheet.MontageViewerFollowerSeenCountSubscription";
                str2 = "Error querying followers_seen_count";
                0fH.A0r(str, str2, th);
                return;
            case 8:
                str = "com.facebook.messaging.montage.viewer.seensheet.MontageViewerFollowerSeenCountSubscription";
                str2 = "Error subscribing followers_seen_count";
                0fH.A0r(str, str2, th);
                return;
            case 10:
                11T.A0F(th, 0);
                1FX r0 = (1FX) this.A02;
                Hkc hkc = (Hkc) this.A01;
                RegularImmutableSet regularImmutableSet = RegularImmutableSet.A05;
                hkc.A06 = regularImmutableSet;
                C1pq.A08("threadAdminIds", regularImmutableSet);
                r0.set(hkc);
                r307 = 4zI.A03;
                objArr = new Object[0];
                str3 = "RosterSheetPresenter";
                str4 = "Failed to get list of admins through msys";
                r307.A02(str3, str4, th, objArr);
                return;
            case 11:
                11T.A0F(th, 0);
                CallerContext callerContext = H54.A09;
                0fH.A0N(H54.class, DKB.A00(230), th, new Object[0]);
                return;
            case 12:
                11T.A0F(th, 0);
                ((5VC) this.A02).Bw3((FbUserSession) this.A01, th);
                I6E.A00(HCL.A0W, null, null, 1BK.A1D("exception", th.toString()));
                4zI.A03.A06("RtcInitializer", "Async engine init failed", new Object[]{th});
                0cQ.A04(Thread.currentThread(), th);
                throw 0Q8.createAndThrow();
            case 13:
                r307 = AbstractC2326GOr.A0U(th);
                objArr = new Object[]{(ThreadKey) this.A02};
                str3 = "RtcFetchThreadHelper";
                str4 = "Failed to fetch ThreadSummary for thread %s";
                r307.A02(str3, str4, th, objArr);
                return;
            case 14:
                0fH.A0z("StickerDrawable", "Error loading sticker %s", th, new Object[]{((C6qc) this.A03).A06});
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03d5 A[Catch: all -> 0x05c6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x05c6, blocks: (B:25:0x00be, B:26:0x00c3, B:27:0x00ca, B:28:0x00d3, B:29:0x00da, B:30:0x00e1, B:31:0x00e8, B:33:0x00f5, B:34:0x00fa, B:36:0x010c, B:37:0x0113, B:38:0x011a, B:40:0x0123, B:42:0x012d, B:43:0x0134, B:46:0x0142, B:48:0x0157, B:53:0x0171, B:54:0x0178, B:56:0x0186, B:57:0x018d, B:58:0x0194, B:60:0x01a2, B:61:0x01a9, B:63:0x01b7, B:64:0x01be, B:65:0x01c5, B:67:0x01d3, B:71:0x01e6, B:75:0x01f6, B:77:0x0204, B:81:0x0217, B:85:0x0227, B:87:0x0235, B:91:0x0248, B:95:0x0258, B:97:0x0264, B:99:0x026d, B:101:0x027b, B:102:0x0281, B:103:0x02a4, B:105:0x02ad, B:106:0x02b5, B:109:0x02c3, B:111:0x02cc, B:113:0x02d6, B:114:0x02df, B:119:0x02ef, B:129:0x0326, B:133:0x0340, B:137:0x035c, B:140:0x0368, B:141:0x036f, B:142:0x0376, B:145:0x0384, B:147:0x039b, B:148:0x03a2, B:149:0x03a9, B:150:0x03b0, B:152:0x03be, B:153:0x03c7, B:156:0x03d5, B:157:0x03dc, B:159:0x03ea, B:160:0x03f1, B:161:0x03f8, B:163:0x0406, B:165:0x0419, B:167:0x042a, B:168:0x0431, B:170:0x043a, B:172:0x0443, B:173:0x044a, B:174:0x0451, B:175:0x0458, B:177:0x0461, B:178:0x0467, B:180:0x0471, B:182:0x0492, B:184:0x049d, B:240:0x03b9), top: B:24:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04f7 A[Catch: all -> 0x05bc, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x05bc, blocks: (B:191:0x04be, B:192:0x04c5, B:193:0x04cc, B:195:0x04d5, B:196:0x04da, B:197:0x04e0, B:198:0x04e9, B:201:0x04f7, B:202:0x04fe, B:204:0x050c, B:205:0x0513, B:206:0x051a, B:208:0x0522, B:211:0x052d, B:212:0x0533, B:214:0x053d, B:216:0x0560, B:218:0x056b), top: B:190:0x04be }] */
    /* JADX WARN: Type inference failed for: r311v36 */
    /* JADX WARN: Type inference failed for: r311v37 */
    /* JADX WARN: Type inference failed for: r311v53, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 3021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Inh.onSuccess(java.lang.Object):void");
    }
}
