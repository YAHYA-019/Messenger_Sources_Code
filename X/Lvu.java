package X;

import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: Lvu.class */
public final class Lvu implements 5Yt {
    public static final Lvu A00;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Yt, java.lang.Object, X.Lvu] */
    static {
        ?? obj = new Object();
        A00 = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.meta.flytrap.attachment.model.BugReportAttachment", obj, 5);
        pluginGeneratedSerialDescriptor.A01("path", false);
        pluginGeneratedSerialDescriptor.A01("generatorName", false);
        pluginGeneratedSerialDescriptor.A01("mediaType", false);
        pluginGeneratedSerialDescriptor.A01("mediaSource", false);
        pluginGeneratedSerialDescriptor.A01("async", true);
        A01 = pluginGeneratedSerialDescriptor;
    }

    public 5Yu[] childSerializers() {
        5Yu[] r0 = BugReportAttachment.A05;
        5Yu r02 = 5ZL.A01;
        return new 5Yu[]{r02, r02, r0[2], r0[3], Lv3.A00};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        11T.A0F(decoder, 0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Z6 ABn = decoder.ABn(pluginGeneratedSerialDescriptor);
        5Yu[] r0 = BugReportAttachment.A05;
        String str = null;
        String str2 = null;
        BugReportAttachmentMediaType bugReportAttachmentMediaType = null;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource = null;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            int ALu = ABn.ALu(pluginGeneratedSerialDescriptor);
            if (ALu == -1) {
                ABn.AQH(pluginGeneratedSerialDescriptor);
                return new BugReportAttachment(bugReportAttachmentMediaSource, bugReportAttachmentMediaType, str, str2, i2, z);
            }
            if (ALu == 0) {
                str = ABn.AMG(pluginGeneratedSerialDescriptor, 0);
                i = i2 | 1;
            } else if (ALu == 1) {
                str2 = ABn.AMG(pluginGeneratedSerialDescriptor, 1);
                i = i2 | 2;
            } else if (ALu == 2) {
                bugReportAttachmentMediaType = (BugReportAttachmentMediaType) JQz.A0h(bugReportAttachmentMediaType, pluginGeneratedSerialDescriptor, ABn, r0, 2);
                i = i2 | 4;
            } else if (ALu == 3) {
                bugReportAttachmentMediaSource = (BugReportAttachmentMediaSource) JQz.A0h(bugReportAttachmentMediaSource, pluginGeneratedSerialDescriptor, ABn, r0, 3);
                i = i2 | 8;
            } else {
                if (ALu != 4) {
                    throw M9V.A00(ALu);
                }
                z = ABn.ALn(pluginGeneratedSerialDescriptor, 4);
                i = i2 | 16;
            }
        }
    }

    public SerialDescriptor getDescriptor() {
        return A01;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BugReportAttachment bugReportAttachment = (BugReportAttachment) obj;
        boolean A1X = 1BL.A1X(encoder, bugReportAttachment);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = A01;
        5Za ABo = encoder.ABo(pluginGeneratedSerialDescriptor);
        5Yv[] r0 = BugReportAttachment.A05;
        ABo.AQ0(bugReportAttachment.A03, pluginGeneratedSerialDescriptor, 0);
        ABo.AQ0(bugReportAttachment.A02, pluginGeneratedSerialDescriptor, A1X ? 1 : 0);
        ABo.APw(bugReportAttachment.A01, r0[2], pluginGeneratedSerialDescriptor, 2);
        ABo.APw(bugReportAttachment.A00, r0[3], pluginGeneratedSerialDescriptor, 3);
        if (ABo.CxY(pluginGeneratedSerialDescriptor, 4) || bugReportAttachment.A04 != A1X) {
            ABo.APg(pluginGeneratedSerialDescriptor, 4, bugReportAttachment.A04);
        }
        ABo.AQH(pluginGeneratedSerialDescriptor);
    }

    public 5Yu[] typeParametersSerializers() {
        return KbQ.A00;
    }
}
