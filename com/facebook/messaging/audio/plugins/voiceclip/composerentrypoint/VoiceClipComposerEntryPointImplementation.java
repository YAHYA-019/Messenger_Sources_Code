package com.facebook.messaging.audio.plugins.voiceclip.composerentrypoint;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.5II;
import X.6Qf;
import X.6Qi;
import X.C1td;
import X.C1u3;
import X.C6fo;
import X.C6g3;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: VoiceClipComposerEntryPointImplementation.class */
public final class VoiceClipComposerEntryPointImplementation {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final Context A03;
    public final FbUserSession A04;
    public final 6Qi A05;
    public final 6Qf A06;
    public final C6fo A07;
    public final ThreadKey A08;
    public final ThreadSummary A09;
    public final Capabilities A0A;

    public VoiceClipComposerEntryPointImplementation(Context context, FbUserSession fbUserSession, 6Qi r304, 6Qf r305, C6fo c6fo, ThreadKey threadKey, ThreadSummary threadSummary, Capabilities capabilities) {
        11T.A0F(fbUserSession, 1);
        11T.A0F(c6fo, 2);
        11T.A0F(threadKey, 3);
        11T.A0F(capabilities, 5);
        11T.A0F(r304, 6);
        11T.A0F(r305, 7);
        11T.A0F(context, 8);
        this.A04 = fbUserSession;
        this.A07 = c6fo;
        this.A08 = threadKey;
        this.A09 = threadSummary;
        this.A0A = capabilities;
        this.A05 = r304;
        this.A06 = r305;
        this.A03 = context;
        this.A00 = 1Bu.A00(116067);
        this.A01 = 1Bq.A00(68025);
        this.A02 = 1Bq.A00(17077);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C6g3 A00() {
        Object obj;
        Object obj2;
        C1u3 c1u3 = C1u3.A4P;
        C6fo c6fo = this.A07;
        Context context = this.A03;
        C6fo c6fo2 = C6fo.A04;
        int i = 2131954671;
        if (c6fo == c6fo2) {
            i = 2131963247;
        }
        String string = context.getString(i);
        11T.A0A(string);
        C1td c1td = C1td.A02;
        final 6Qi r0 = this.A05;
        final 6Qf r02 = this.A06;
        if (c6fo == c6fo2) {
            obj = null;
            obj2 = null;
        } else {
            obj = new Object() { // from class: X.6gk
                public final void A00() {
                    6Qe r03 = r02;
                    ((OneLineComposerView) r03.A00.A0A).A0j.A00(0S2.A00);
                    OneLineComposerView oneLineComposerView = (OneLineComposerView) r0.A00.A0A;
                    oneLineComposerView.A0y = true;
                    OneLineComposerView.A0A(oneLineComposerView.A1Q, oneLineComposerView);
                }
            };
            obj2 = new Object() { // from class: X.6gl
            };
        }
        return new C6g3(null, c1u3, obj, obj2, c1td, string, "voice_clip", false, false, false);
    }

    public final void A01() {
        if (this.A07 == C6fo.A04) {
            this.A06.A00.A09.A09("voice_clip", "upload_audio_interstitial");
            ((5II) 1Br.A0B(this.A01)).A0A("composer_tab_selected");
        } else {
            OneLineComposerView oneLineComposerView = (OneLineComposerView) this.A05.A00.A0A;
            oneLineComposerView.A0y = false;
            oneLineComposerView.A0p = null;
            OneLineComposerView.A0A(oneLineComposerView.A1Q, oneLineComposerView);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
    
        if (r303 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d9, code lost:
    
        if (r0.A03() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f2, code lost:
    
        if (((X.6PV) r301.A00.A00.get()).A01() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.audio.plugins.voiceclip.composerentrypoint.VoiceClipComposerEntryPointImplementation.A02():boolean");
    }
}
