package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiBotContent;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState;

/* renamed from: X.9rr, reason: invalid class name */
/* loaded from: 9rr.class */
public final class C9rr implements 2JQ {
    public final int A00;

    public C9rr(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object AI2(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                N0C.A00();
                return MetaAiBotContent.createFromMcfType(mcfReference);
            case 1:
                N0C.A00();
                return MetaAiVoiceState.createFromMcfType(mcfReference);
            default:
                return null;
        }
    }

    public Class Ay5() {
        switch (this.A00) {
            case 0:
                return MetaAiBotContent.class;
            case 1:
                return MetaAiVoiceState.class;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public long BHg() {
        long j;
        switch (this.A00) {
            case 0:
                N0C.A00();
                j = MetaAiBotContent.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId = MetaAiBotContent.nativeGetMcfTypeId();
                    MetaAiBotContent.sMcfTypeId = nativeGetMcfTypeId;
                    return nativeGetMcfTypeId;
                }
                return j;
            case 1:
                N0C.A00();
                j = MetaAiVoiceState.sMcfTypeId;
                if (j == 0) {
                    long nativeGetMcfTypeId2 = MetaAiVoiceState.nativeGetMcfTypeId();
                    MetaAiVoiceState.sMcfTypeId = nativeGetMcfTypeId2;
                    return nativeGetMcfTypeId2;
                }
                return j;
            default:
                j = 0;
                return j;
        }
    }
}
