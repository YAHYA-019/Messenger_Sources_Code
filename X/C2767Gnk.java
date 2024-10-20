package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.ViewGroup;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.MontageComposerFragment;
import com.facebook.messaging.montage.composer.capturebutton.CaptureButton;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Gnk, reason: case insensitive filesystem */
/* loaded from: Gnk.class */
public final class C2767Gnk extends IFM {
    public C2137Deq A00;
    public IKw A01;
    public CaptureButton A02;
    public boolean A03;
    public boolean A04;
    public 1BY A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final Hae A09;
    public final Hrw A0A;
    public final String A0B;
    public final C00i A0C;
    public final Had A0D;

    public C2767Gnk(ViewGroup viewGroup, 1BO r303, Had had, Hae hae, Hrw hrw, String str) {
        super(viewGroup, hrw, C6x1.A02);
        this.A0C = 1BV.A01((1BY) null, 115935);
        this.A08 = 1BV.A01((1BY) null, 85041);
        this.A07 = 1BV.A01((1BY) null, 115979);
        this.A06 = 1BV.A01((1BY) null, 66448);
        this.A05 = 7zL.A0Q(r303);
        this.A0A = hrw;
        this.A0D = had;
        this.A09 = hae;
        this.A0B = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
    
        if (r0.A19() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (((X.5Q1) r302.A0C.get()).A01() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(android.view.ViewGroup r301, X.C2767Gnk r302) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2767Gnk.A00(android.view.ViewGroup, X.Gnk):void");
    }

    public static void A01(C2767Gnk c2767Gnk) {
        C2137Deq c2137Deq = c2767Gnk.A00;
        if (c2137Deq != null && ((FIU) c2137Deq).A0Z) {
            c2137Deq.A06();
            c2767Gnk.A00 = null;
        }
        if (c2767Gnk.A03) {
            I8L i8l = (I8L) c2767Gnk.A07.get();
            Hrw hrw = c2767Gnk.A0A;
            C6r6 c6r6 = hrw.A01.A0A;
            String str = c2767Gnk.A0B;
            boolean A01 = hrw.A01();
            if (!I8L.A01(i8l, c6r6) || str == null || i8l.A05) {
                return;
            }
            1UG A08 = 1BK.A08(1Br.A02(i8l.A03), "msg_camera_did_close_record_tooltip");
            if (A08.isSampled() && A08.isSampled()) {
                I6B.A02(A08, c6r6, true);
                AbstractC2326GOr.A1C(A08, str, A01);
                A08.BZL();
            }
        }
    }

    public void A0F() {
        super.A0F();
        A01(this);
        if (A0D().A00 == HAE.A02) {
            this.A04 = false;
            this.A03 = false;
        }
    }

    public void A0H() {
        C6x4 c6x4;
        CaptureButton captureButton;
        C2137Deq c2137Deq;
        super.A0H();
        CaptureButton captureButton2 = this.A02;
        if (captureButton2 != null && captureButton2.getVisibility() == 0 && A0E() == H9e.A02) {
            C00i c00i = this.A08;
            FbSharedPreferences A00 = 53I.A00(IFM.A04(c00i));
            1G2 r0 = 4LQ.A0V;
            if (A00.ArU(r0, 0) < 3 && !this.A04 && ((c2137Deq = this.A00) == null || !((FIU) c2137Deq).A0Z)) {
                Hrw hrw = this.A0A;
                ImmutableList immutableList = hrw.A00.A1N.A0B.A0H;
                C6x4 c6x42 = C6x4.A06;
                if (immutableList.contains(c6x42) && hrw.A02.Afb() != c6x42) {
                    C2137Deq c2137Deq2 = this.A00;
                    if (c2137Deq2 == null) {
                        HzT hzT = (HzT) c00i.get();
                        Context context = this.A02.getContext();
                        J5w j5w = new J5w(this, 2);
                        11T.A0F(context, 0);
                        String A1A = AbJ.A1A(1BK.A0u(context, 2131960509));
                        1Bn.A0E((Context) null, hzT.A00.A00, 67680);
                        EC2 A002 = CFx.A00(context, IKE.A00(j5w, 92), 7zQ.A0m(hzT.A02), A1A, "Link");
                        String A13 = AbK.A13(context, A1A, 2131960508);
                        0Dc r02 = new 0Dc(context.getResources());
                        r02.A02(A13);
                        r02.A05(A002, A1A, A1A, 33);
                        c2137Deq2 = HzT.A00(context, hzT, new SpannableString(r02.A01), 5000);
                        this.A00 = c2137Deq2;
                    }
                    c2137Deq2.A0C(this.A02);
                    I8L i8l = (I8L) this.A07.get();
                    String str = this.A0B;
                    if (str != null && !i8l.A05) {
                        AbstractC2326GOr.A1P(1Br.A02(i8l.A03), "msg_camera_did_show_roll_call_tooltip", str);
                    }
                    53I A04 = IFM.A04(c00i);
                    7zO.A1T(53I.A00(A04).edit(), r0, 53I.A00(A04).ArU(r0, 0));
                    this.A04 = true;
                }
            }
        }
        if (this.A04) {
            return;
        }
        C00i c00i2 = this.A06;
        if (((81U) c00i2.get()).A01()) {
            c00i2.get();
            Hrw hrw2 = this.A0A;
            IWN iwn = hrw2.A02;
            C6x4 Afb = iwn.Afb();
            MontageComposerFragment montageComposerFragment = hrw2.A01;
            ThreadKey threadKey = montageComposerFragment.A0B.A04;
            if (Afb == null || threadKey == null || Afb != (c6x4 = C6x4.A05) || threadKey.A12() || threadKey.A1B() || !threadKey.A1L() || (captureButton = this.A02) == null || captureButton.getVisibility() != 0 || A0E() != H9e.A02) {
                return;
            }
            C00i c00i3 = this.A08;
            FbSharedPreferences A003 = 53I.A00(IFM.A04(c00i3));
            1G2 r03 = 4LQ.A0T;
            if (A003.ArU(r03, 0) >= 3 || this.A03) {
                return;
            }
            C2137Deq c2137Deq3 = this.A00;
            if ((c2137Deq3 == null || !((FIU) c2137Deq3).A0Z) && iwn.Afb() == c6x4) {
                if (c2137Deq3 == null) {
                    HzT hzT2 = (HzT) c00i3.get();
                    Context context2 = this.A02.getContext();
                    11T.A0F(context2, 0);
                    String A0u = 1BK.A0u(context2, 2131960538);
                    0Dc r04 = new 0Dc(context2.getResources());
                    r04.A02(A0u);
                    c2137Deq3 = HzT.A00(context2, hzT2, new SpannableString(r04.A01), 5000);
                    this.A00 = c2137Deq3;
                }
                c2137Deq3.A0C(this.A02);
                I8L i8l2 = (I8L) this.A07.get();
                C6r6 c6r6 = montageComposerFragment.A0A;
                String str2 = this.A0B;
                boolean A01 = hrw2.A01();
                if (I8L.A01(i8l2, c6r6) && str2 != null && !i8l2.A05) {
                    1UG A08 = 1BK.A08(1Br.A02(i8l2.A03), "msg_camera_did_view_record_tooltip");
                    if (A08.isSampled() && A08.isSampled()) {
                        I6B.A02(A08, c6r6, true);
                        AbstractC2326GOr.A1C(A08, str2, A01);
                        A08.BZL();
                    }
                }
                53I A042 = IFM.A04(c00i3);
                7zO.A1T(53I.A00(A042).edit(), r03, 53I.A00(A042).ArU(r03, 0));
                this.A03 = true;
            }
        }
    }
}
