package X;

import com.facebook.messaging.highlightstab.xsharelibraries.composer.HighlightsTabComposerBottomSheetFragment;
import com.facebook.messaging.highlightstab.xsharelibraries.composer.common.BaseHTBottomSheetDialogFragment;
import com.facebook.messaging.model.messages.Message;
import kotlin.jvm.functions.Function2;

/* renamed from: X.9w2, reason: invalid class name */
/* loaded from: 9w2.class */
public abstract class C9w2 implements AaX {
    public void AML(5PI r302, Message message) {
        if (this instanceof 8uA) {
            HighlightsTabComposerBottomSheetFragment highlightsTabComposerBottomSheetFragment = ((8uA) this).A00;
            2qR r0 = BaseHTBottomSheetDialogFragment.A05;
            Function2 function2 = highlightsTabComposerBottomSheetFragment.A03;
            if (function2 != null) {
                function2.invoke(r302, message);
            }
        }
    }

    public void C75() {
    }

    public void C76() {
    }
}
