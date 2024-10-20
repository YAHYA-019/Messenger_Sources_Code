package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.MontageComposerFragment;
import com.facebook.messaging.photos.editing.model.LayerPosition;
import java.util.Iterator;

/* loaded from: I9K.class */
public final class I9K {
    public final /* synthetic */ IQ1 A00;

    public I9K(IQ1 iq1) {
        this.A00 = iq1;
    }

    public static LayerPosition A00(I9K i9k) {
        IQ1 iq1 = i9k.A00;
        CallerContext callerContext = IQ1.A1m;
        Context context = iq1.A0I;
        int A00 = C0A8.A00(context, 150.0f);
        int width = iq1.A0K.getWidth();
        int A002 = C0A8.A00(context, 90.0f);
        Integer A0k = 4YU.A0k();
        0fH.A13("MontageComposerController", "getCenterTopPosition: left=%d, top=%d, right=%d, bottom=%d, width=%d, height=%d", new Object[]{A0k, Integer.valueOf(A00), A0k, A0k, Integer.valueOf(width), Integer.valueOf(A002)});
        return new LayerPosition(0, A00, 0, 0, width, A002);
    }

    public static void A01(I9K i9k, String str) {
        IQ1 iq1 = i9k.A00;
        CallerContext callerContext = IQ1.A1m;
        I8L i8l = (I8L) iq1.A0l.get();
        Hrw hrw = iq1.A1H;
        C6r6 c6r6 = hrw.A01.A0A;
        String str2 = iq1.A0C;
        boolean A01 = hrw.A01();
        ThreadKey threadKey = iq1.A1N.A0B.A04;
        if (!I8L.A01(i8l, c6r6) || str2 == null || i8l.A05) {
            return;
        }
        if (i8l.A04) {
            I8L.A00(HCY.A02, threadKey, i8l, c6r6, str2, str, A01);
            return;
        }
        1UG A08 = 1BK.A08(1Br.A02(i8l.A03), 1BJ.A00(1771));
        if (A08.isSampled()) {
            I6B.A02(A08, c6r6, true);
            AbstractC2326GOr.A1C(A08, str2, A01);
            A08.A7R("duration", str);
            A08.BZL();
        }
    }

    public void A02() {
        IQ1 iq1 = this.A00;
        CallerContext callerContext = IQ1.A1m;
        IDM idm = iq1.A1J;
        if (idm != null) {
            idm.A04();
            iq1.A1Q.Cws();
        }
        if (iq1.A1Q.Afb() == C6x4.A06) {
            C9lD c9lD = (C9lD) iq1.A11.get();
            if (C9lD.A01(c9lD, iq1.A0C)) {
                C9lD.A00(c9lD).flowMarkPoint(c9lD.A00, "camera_error");
            }
        }
    }

    public void A03() {
        IQ1 iq1 = this.A00;
        CallerContext callerContext = IQ1.A1m;
        if (iq1.A1P.A04() == C6x1.A02) {
            IQ1.A06(iq1);
            MontageComposerFragment montageComposerFragment = iq1.A1N;
            JF1 jf1 = montageComposerFragment.A04;
            if (jf1 != null) {
                jf1.CVa(montageComposerFragment.A0B);
            }
        }
    }

    public void A04() {
        IQ1 iq1 = this.A00;
        CallerContext callerContext = IQ1.A1m;
        IDa iDa = iq1.A1P;
        if (iDa != null) {
            iDa.A06(C6x1.A06, true);
            ((HrZ) iq1.A0R.get()).A00(iq1.A1N.A0A, iq1.A0C, "tap_text_base");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0.As7() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(X.Hio r302, com.facebook.ui.media.attachments.model.MediaResource r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9K.A05(X.Hio, com.facebook.ui.media.attachments.model.MediaResource, boolean):void");
    }

    public void A06(boolean z) {
        IQ1 iq1 = this.A00;
        CallerContext callerContext = IQ1.A1m;
        IWN iwn = iq1.A1Q;
        iwn.CrO(z);
        if (!iwn.BUM()) {
            iwn.AFg();
        }
        IDa iDa = iq1.A1P;
        C6x1 A04 = iDa.A04();
        I4q Aio = iDa.A03.A00.A1Q.Aio();
        Iterator it = iDa.A07.iterator();
        while (it.hasNext()) {
            GOn.A0m(it).A0N(A04, Aio);
        }
        if (iq1.A1N.A0B.A0I.contains(C6x1.A02)) {
            return;
        }
        boolean BUM = iwn.BUM();
        6KV r0 = iq1.A0M;
        if (BUM) {
            r0.A02();
        } else {
            r0.A04();
        }
    }
}
