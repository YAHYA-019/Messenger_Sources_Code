package X;

import com.facebook.rsys.call.gen.CallParticipant;
import com.facebook.rsys.call.gen.ParticipantMediaState;
import com.facebook.rsys.callinfo.gen.UserProfile;
import com.facebook.rsys.video.gen.VideoStream;
import com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.Participant;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: M0s.class */
public final class M0s extends 01I implements Function1 {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public M0s(java.lang.Object r302, int r303) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M0s.<init>(java.lang.Object, int):void");
    }

    public static final Participant A00(CallParticipant callParticipant, boolean z, boolean z2) {
        KPk kPk;
        String str;
        11T.A0F(callParticipant, 0);
        UserProfile userProfile = callParticipant.userProfile;
        11T.A09(userProfile);
        switch (callParticipant.state) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                kPk = KPk.A03;
                break;
            case 7:
                kPk = KPk.A01;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                kPk = KPk.A02;
                break;
            case 12:
                kPk = KPk.A05;
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                kPk = KPk.A06;
                break;
            default:
                kPk = KPk.A04;
                break;
        }
        KEf newBuilder = Participant.newBuilder();
        String str2 = userProfile.userId;
        Participant participant = (Participant) KGw.A00(newBuilder);
        str2.getClass();
        participant.id_ = str2;
        String str3 = userProfile.name;
        if (str3 != null) {
            Participant participant2 = (Participant) KGw.A00(newBuilder);
            participant2.bitField0_ |= 1;
            participant2.name_ = str3;
        }
        if (z2 && (str = userProfile.profilePictureUrl) != null) {
            Participant participant3 = (Participant) KGw.A00(newBuilder);
            participant3.bitField0_ |= 2;
            participant3.profileImageUrl_ = str;
        }
        ((Participant) KGw.A00(newBuilder)).isSelf_ = z;
        ((Participant) KGw.A00(newBuilder)).state_ = kPk.getNumber();
        return (Participant) newBuilder.A05();
    }

    public static final KPl A01(CallParticipant callParticipant) {
        ArrayList arrayList;
        Object obj;
        ParticipantMediaState participantMediaState = callParticipant.mediaState;
        if (participantMediaState != null && (arrayList = participantMediaState.videoStreams) != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((VideoStream) obj).streamInfo.streamType == 1) {
                    break;
                }
            }
            VideoStream videoStream = (VideoStream) obj;
            if (videoStream != null) {
                int i = videoStream.streamState;
                if (Integer.valueOf(i) != null) {
                    if (i == 0) {
                        return KPl.A02;
                    }
                    if (i == 1) {
                        return KPl.A05;
                    }
                    if (i == 2) {
                        return KPl.A06;
                    }
                    if (i == 3) {
                        return KPl.A03;
                    }
                    if (i == 4) {
                        return KPl.A04;
                    }
                }
            }
        }
        return KPl.A07;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:647:0x1bce
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0f36  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x117c  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x1202  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x131f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x15bf  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x1b8b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a5  */
    /* JADX WARN: Type inference failed for: r0v1295, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v733, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v814, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 7122
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M0s.invoke(java.lang.Object):java.lang.Object");
    }
}
