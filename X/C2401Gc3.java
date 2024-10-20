package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.facebook.litho.LithoView;
import com.facebook.messaging.montage.composer.MontageComposerActivity;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbButton;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.BitSet;

/* renamed from: X.Gc3, reason: case insensitive filesystem */
/* loaded from: Gc3.class */
public final class C2401Gc3 extends 1pK implements JFq {
    public static final String __redex_internal_original_name = "RedialFragment";
    public TextView A00;
    public LithoView A01;
    public GrJ A02;
    public HqG A03;
    public C9l5 A04;
    public HbW A05;
    public JPS A06;
    public FbButton A07;
    public FbButton A08;
    public boolean A09;
    public final C1u2 A0A = 4YV.A0I();

    private final void A03() {
        int i = 8;
        int i2 = 0;
        if (this.A09) {
            i2 = 8;
            i = 0;
        }
        TextView textView = this.A00;
        if (textView != null) {
            textView.setVisibility(i);
        }
        FbButton fbButton = this.A07;
        if (fbButton != null) {
            fbButton.setVisibility(i2);
        }
        FbButton fbButton2 = this.A08;
        if (fbButton2 != null) {
            fbButton2.setVisibility(i2);
        }
    }

    public static final void A06(View view) {
        view.setTranslationY(TypedValue.applyDimension(1, 15.0f, 7zO.A0I(view.getContext())));
        view.setVisibility(0);
        view.animate().translationY(0.0f).setInterpolator(new DecelerateInterpolator()).alpha(1.0f).setDuration(180L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v139, types: [X.HtZ, java.lang.Object] */
    public static final void A07(C2401Gc3 c2401Gc3) {
        String str;
        GrJ grJ;
        C2699Glm c2699Glm = null;
        c2401Gc3.A01 = new LithoView(c2401Gc3.requireContext(), (AttributeSet) null);
        View A0F = 7zL.A0F(c2401Gc3, 2131363896);
        ViewGroup viewGroup = (ViewGroup) 7zL.A0F(c2401Gc3, 2131361908);
        C9l5 A0f = (c2401Gc3.A01 == null || (grJ = c2401Gc3.A02) == null) ? null : grJ.A0f(new 2S3(c2401Gc3, __redex_internal_original_name));
        c2401Gc3.A04 = A0f;
        if (A0f != null) {
            A0f.A04 = new J9s(c2401Gc3, 31);
            A0f.A03 = new AQh(27, c2401Gc3, viewGroup, A0F);
        }
        LithoView lithoView = c2401Gc3.A01;
        if (lithoView != null) {
            if (A0f != null) {
                1Iw r0 = lithoView.A09;
                11T.A0A(r0);
                if (A0f.A00 == null) {
                    2S4 r02 = A0f.A08;
                    Context context = A0f.A06;
                    IEI iei = (IEI) r02.A00(115943);
                    A0f.A00 = iei;
                    str = "audioRecordingAPI";
                    if (iei != null) {
                        iei.A0C(context, new IUh(1Lm.A00(context, A0f.A07, 65961), 1Bq.A00(68077), A0f), 0S2.A00);
                        IEI iei2 = A0f.A00;
                        if (iei2 != null) {
                            iei2.A02 = A0f.A09;
                        }
                    }
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                HtZ htZ = A0f.A02;
                HAN han = HAN.A05;
                if (htZ == null) {
                    11T.A0F(han, 1);
                    ?? obj = new Object();
                    ((HtZ) obj).A01 = han;
                    A0f.A02 = obj;
                } else {
                    htZ.A02(han);
                }
                C2666Gki c2666Gki = new C2666Gki(r0, new C2699Glm());
                MigColorScheme migColorScheme = A0f.A0A;
                C2699Glm c2699Glm2 = c2666Gki.A01;
                c2699Glm2.A06 = migColorScheme;
                BitSet bitSet = c2666Gki.A02;
                bitSet.set(2);
                c2699Glm2.A09 = new Ill(A0f);
                bitSet.set(1);
                HtZ htZ2 = A0f.A02;
                if (htZ2 == null) {
                    str = "stateController";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                c2699Glm2.A0A = htZ2;
                bitSet.set(7);
                c2699Glm2.A0B = (I5O) A0f.A0D.getValue();
                bitSet.set(10);
                MediaResource mediaResource = A0f.A01;
                c2699Glm2.A07 = mediaResource;
                bitSet.set(5);
                boolean z = false;
                if (mediaResource != null && mediaResource.A08 >= A0f.A05 - 500) {
                    z = true;
                }
                c2699Glm2.A0E = z;
                bitSet.set(4);
                c2699Glm2.A00 = new 8L3(822083583, migColorScheme.BKg(), migColorScheme.Chx(C1u7.A08), 822083583, migColorScheme.BKg(), 1);
                bitSet.set(6);
                c2699Glm2.A01 = new C2629Gje(false, true, 4);
                c2699Glm2.A02 = C9l5.A00(A0f);
                c2699Glm2.A08 = A0f.A0C;
                bitSet.set(0);
                c2699Glm2.A0C = null;
                bitSet.set(3);
                c2699Glm2.A03 = null;
                bitSet.set(8);
                c2699Glm2.A04 = null;
                bitSet.set(9);
                7zP.A1A(c2666Gki, bitSet, c2666Gki.A03);
                c2699Glm = c2699Glm2;
            }
            lithoView.A0y(c2699Glm);
        }
        LithoView lithoView2 = c2401Gc3.A01;
        if (lithoView2 != null) {
            lithoView2.setVisibility(0);
        }
        viewGroup.addView(c2401Gc3.A01);
        GOq.A0O(A0F).setDuration(180L).withEndAction(new Irf(A0F));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A08(C2401Gc3 c2401Gc3) {
        NavigationTrigger A03 = NavigationTrigger.A03("messenger_video_voice_mail");
        MontageComposerFragmentParams.Builder builder = new MontageComposerFragmentParams.Builder();
        builder.A0A = C6x3.A03;
        C6x4 c6x4 = C6x4.A0A;
        builder.A06 = c6x4;
        C6x1 c6x1 = C6x1.A02;
        builder.A09 = c6x1;
        builder.A03(11T.A03(c6x4));
        builder.A04(11T.A03(c6x1));
        builder.A0D = C6r6.A0a;
        builder.A0Z = true;
        0LS.A05(MontageComposerActivity.A12(c2401Gc3.requireContext(), builder.A00(), A03), c2401Gc3, 7377);
    }

    public 1iF A1R() {
        return GOq.A0U();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x006d, code lost:
    
        if (X.1BK.A0M(r0).AZk(36326799029851979L) == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2401Gc3.A1S(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0204 A[Catch: Exception -> 0x03e4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x03e4, blocks: (B:43:0x0097, B:45:0x00a1, B:47:0x00a8, B:48:0x00ad, B:49:0x00b2, B:50:0x00b7, B:64:0x00f0, B:65:0x00f9, B:68:0x0105, B:71:0x0280, B:72:0x0141, B:73:0x0148, B:74:0x014f, B:75:0x0158, B:76:0x015f, B:78:0x0168, B:79:0x016f, B:81:0x017b, B:83:0x0187, B:86:0x0195, B:90:0x01a5, B:92:0x01ae, B:93:0x01b5, B:94:0x01bc, B:95:0x01c3, B:96:0x01ca, B:97:0x01cf, B:98:0x01d6, B:99:0x01df, B:101:0x01ea, B:102:0x01f1, B:103:0x01f8, B:106:0x0204, B:107:0x020b, B:110:0x0217, B:111:0x021e, B:112:0x0225, B:113:0x022c, B:114:0x0233, B:116:0x0242, B:118:0x024a, B:120:0x0253, B:121:0x025a, B:123:0x0261, B:124:0x0266, B:125:0x026d, B:127:0x0278, B:129:0x02cb, B:131:0x02d4, B:132:0x02db, B:134:0x02e2, B:135:0x02e7, B:136:0x02ee, B:137:0x02f5, B:138:0x02fc, B:139:0x0303, B:140:0x030a, B:142:0x0315, B:143:0x0288, B:144:0x0290, B:145:0x0298, B:146:0x02a0, B:147:0x02a8, B:148:0x02b0, B:149:0x02b8, B:150:0x013c, B:54:0x00d0, B:55:0x00d4, B:59:0x00e2), top: B:42:0x0097 }] */
    @Override // X.JFq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 1415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2401Gc3.CfQ(X.JDB):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r302, int r303, android.content.Intent r304) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2401Gc3.onActivityResult(int, int, android.content.Intent):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1555445222);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132542463, viewGroup, false);
        0FI.A08(-1112620043, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(815701817);
        this.A07 = null;
        this.A08 = null;
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        GrJ grJ = this.A02;
        if (grJ != null) {
            grJ.A0X();
        }
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        0FI.A08(-764086780, A02);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.A09 = z;
        A03();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        C00m c00m;
        int A02 = 0FI.A02(1303216733);
        super/*androidx.fragment.app.Fragment*/.onStop();
        HqG hqG = this.A03;
        if (hqG != null) {
            hqG.A00();
        }
        C9l5 c9l5 = this.A04;
        if (c9l5 != null) {
            c9l5.A01();
        }
        C9l5 c9l52 = this.A04;
        if (c9l52 != null && (c00m = c9l52.A03) != null) {
            c00m.invoke();
        }
        0FI.A08(-1292928319, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        this.A09 = bundle2 != null ? bundle2.getBoolean("is_picture_in_picture_mode") : this.A09;
        this.A06 = 7zL.A0F(this, 2131362798);
        this.A00 = DKG.A0D(this, 2131362802);
        this.A07 = (FbButton) 7zL.A0F(this, 2131362859);
        this.A08 = (FbButton) 7zL.A0F(this, 2131367196);
        FbButton fbButton = this.A07;
        if (fbButton != null) {
            IKB.A00(fbButton, this, 7);
        }
        GrJ grJ = this.A02;
        if (grJ != null) {
            grJ.A0Y(this);
        }
    }
}
