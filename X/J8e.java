package X;

import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.call.gen.CallParticipant;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: J8e.class */
public final /* synthetic */ class J8e extends 01I implements Function1 {
    public static final J8e A00 = new J8e();

    public J8e() {
        super(1, HDl.class, "isBotAudioEnabled", "isBotAudioEnabled(Lcom/facebook/rsys/call/gen/CallModel;)Ljava/lang/Boolean;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        boolean z = true;
        Boolean bool = true;
        ArrayList arrayList = GOo.A0Y(obj).remoteParticipants;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (11T.A0O(((CallParticipant) obj2).userId, ConstantsKt.CAMERA_ID_FRONT)) {
                    break;
                }
            }
            CallParticipant callParticipant = (CallParticipant) obj2;
            if (callParticipant != null) {
                ArrayList arrayList2 = callParticipant.mediaState.audioStreams;
                11T.A09(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (((AudioStream) obj3).type == 9) {
                        break;
                    }
                }
                AudioStream audioStream = (AudioStream) obj3;
                if (audioStream == null) {
                    return null;
                }
                if (audioStream.streamStateDesired != 3) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
        }
        return bool;
    }
}
