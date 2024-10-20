package com.facebook.messaging.neue.nux.profilepic;

import X.0FI;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1ED;
import X.1HH;
import X.1lN;
import X.53U;
import X.6KV;
import X.7zL;
import X.82O;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbL;
import X.AbR;
import X.AnonymousClass536;
import X.C00i;
import X.C1rs;
import X.C62j;
import X.C66i;
import X.Cm3;
import X.FAJ;
import X.FFh;
import X.GOo;
import X.GOp;
import X.GzL;
import X.HUJ;
import X.HdL;
import X.Hfd;
import X.Hom;
import X.Hy4;
import X.IES;
import X.IKE;
import X.QCr;
import X.QLt;
import X.Qpb;
import X.RjO;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.media.mediapicker.dialog.PickMediaDialogFragment;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: PartialNuxCameraFragment.class */
public final class PartialNuxCameraFragment extends NuxFragment implements 1lN {
    public Bitmap A00;
    public Bitmap A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public Animation A07;
    public IES A08;
    public Hom A09;
    public Hfd A0A;
    public 6KV A0B;
    public C00i A0C;
    public LithoView A0D;
    public FAJ A0E;
    public 53U A0F;
    public C66i A0G;
    public 1ED A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public ViewStub A0N;
    public 82O A0O;
    public AbR A0P;
    public C62j A0Q;
    public final C00i A0V = 1BQ.A01();
    public final C00i A0U = AbH.A0E();
    public final FFh A0Y = (FFh) 1Bi.A03(100123);
    public final C00i A0W = AbH.A0c(this);
    public final AnonymousClass536 A0T = GOp.A0E();
    public final C00i A0X = new 1HH(this, 99435);
    public final View.OnClickListener A0R = IKE.A00(this, ActionId.RTMP_STREAM_PREPARED);
    public final View.OnClickListener A0S = IKE.A00(this, ActionId.VIDEO_PLAYING);

    private void A03() {
        this.A03.setVisibility(4);
        this.A0D.setVisibility(0);
        LithoView lithoView = this.A0D;
        QCr qCr = new QCr(lithoView.A09, new QLt());
        MigColorScheme A0p = AbF.A0p(this.A0W);
        QLt qLt = qCr.A01;
        qLt.A03 = A0p;
        BitSet bitSet = qCr.A02;
        bitSet.set(0);
        qLt.A02 = this.A0R;
        bitSet.set(2);
        qLt.A01 = this.A0S;
        bitSet.set(1);
        C1rs.A03(bitSet, qCr.A03);
        qCr.A0J();
        lithoView.A0x(qLt);
    }

    public static void A06(PartialNuxCameraFragment partialNuxCameraFragment) {
        IES ies = partialNuxCameraFragment.A08;
        IES.A02(ies);
        IES.A00(Qpb.A0B, ies);
        IES.A01(new Hy4(Qpb.A0D), ies);
        partialNuxCameraFragment.A0G.A07(0.0d);
        TextureView textureView = partialNuxCameraFragment.A0A.A02.A01;
        if (textureView instanceof SurfaceView) {
            AbH.A1K(textureView, GOo.A0A(textureView).getColor(2132213791, null));
        }
        partialNuxCameraFragment.A03();
    }

    public static void A07(PartialNuxCameraFragment partialNuxCameraFragment) {
        partialNuxCameraFragment.A0F.AHP(new GzL(partialNuxCameraFragment, 4), "android.permission.CAMERA");
    }

    public static void A08(PartialNuxCameraFragment partialNuxCameraFragment) {
        IES ies = partialNuxCameraFragment.A08;
        IES.A02(ies);
        float f = ies.A07;
        int measuredHeight = partialNuxCameraFragment.A0L.getMeasuredHeight();
        int i = (int) (measuredHeight * f);
        ViewGroup.LayoutParams layoutParams = partialNuxCameraFragment.A02.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = measuredHeight;
        float f2 = ((i - measuredHeight) / 2) + 2;
        partialNuxCameraFragment.A02.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = partialNuxCameraFragment.A04.getLayoutParams();
        layoutParams2.width = measuredHeight;
        layoutParams2.height = measuredHeight;
        partialNuxCameraFragment.A04.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = partialNuxCameraFragment.A0J.getLayoutParams();
        int i2 = (int) f2;
        layoutParams3.width = i2;
        layoutParams3.height = measuredHeight;
        partialNuxCameraFragment.A0J.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = partialNuxCameraFragment.A0I.getLayoutParams();
        layoutParams4.width = i2;
        layoutParams4.height = measuredHeight;
        partialNuxCameraFragment.A0I.setLayoutParams(layoutParams4);
        partialNuxCameraFragment.A04.setAlpha(0.8f);
    }

    public static void A09(PartialNuxCameraFragment partialNuxCameraFragment) {
        IES ies = partialNuxCameraFragment.A08;
        IES.A02(ies);
        float f = ies.A07;
        int measuredWidth = partialNuxCameraFragment.A0L.getMeasuredWidth();
        int i = (int) (measuredWidth / f);
        ViewGroup.LayoutParams layoutParams = partialNuxCameraFragment.A02.getLayoutParams();
        layoutParams.width = measuredWidth;
        layoutParams.height = i;
        float f2 = ((i - measuredWidth) / 2) + 2;
        partialNuxCameraFragment.A02.setTranslationY(GOo.A0A(partialNuxCameraFragment.A0L).getDimensionPixelSize(2132279345) - f2);
        partialNuxCameraFragment.A02.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = partialNuxCameraFragment.A04.getLayoutParams();
        layoutParams2.width = measuredWidth;
        layoutParams2.height = measuredWidth;
        partialNuxCameraFragment.A04.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = partialNuxCameraFragment.A0J.getLayoutParams();
        layoutParams3.width = measuredWidth;
        int i2 = (int) f2;
        layoutParams3.height = i2;
        partialNuxCameraFragment.A0J.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = partialNuxCameraFragment.A0I.getLayoutParams();
        layoutParams4.width = measuredWidth;
        layoutParams4.height = i2;
        partialNuxCameraFragment.A0I.setLayoutParams(layoutParams4);
        partialNuxCameraFragment.A04.setAlpha(0.8f);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0A(com.facebook.messaging.neue.nux.profilepic.PartialNuxCameraFragment r301, int r302, int r303) {
        /*
            r0 = r302
            r1 = r303
            int r0 = java.lang.Math.min(r0, r1)
            r304 = r0
            r0 = r301
            X.Hom r0 = r0.A09
            r305 = r0
            r0 = r305
            java.lang.Class r0 = r0.getClass()
            r0 = r301
            android.graphics.Bitmap r0 = r0.A01
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L90
            r0 = r306
            int r0 = r0.getWidth()
            r307 = r0
            r0 = r307
            r1 = r302
            if (r0 != r1) goto L8b
            r0 = r306
            int r0 = r0.getHeight()
            r307 = r0
            r0 = r307
            r1 = r303
            if (r0 != r1) goto L8b
        L37:
            r0 = r301
            r1 = r306
            r0.A01 = r1
            r0 = r301
            X.Hom r0 = r0.A09
            r305 = r0
            r0 = r305
            java.lang.Class r0 = r0.getClass()
            r0 = r301
            android.graphics.Bitmap r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L7a
            r0 = r306
            int r0 = r0.getWidth()
            r307 = r0
            r0 = r307
            r1 = r304
            if (r0 != r1) goto L75
            r0 = r306
            int r0 = r0.getHeight()
            r307 = r0
            r0 = r307
            r1 = r304
            if (r0 != r1) goto L75
        L6e:
            r0 = r301
            r1 = r306
            r0.A00 = r1
            return
        L75:
            r0 = r306
            r0.recycle()
        L7a:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r305 = r0
            r0 = r304
            r1 = r304
            r2 = r305
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r306 = r0
            goto L6e
        L8b:
            r0 = r306
            r0.recycle()
        L90:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r305 = r0
            r0 = r302
            r1 = r303
            r2 = r305
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r306 = r0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.neue.nux.profilepic.PartialNuxCameraFragment.A0A(com.facebook.messaging.neue.nux.profilepic.PartialNuxCameraFragment, int, int):void");
    }

    @Override // com.facebook.base.fragment.AbstractNavigableFragment
    public void A1X() {
        if (this.A0G.A09.A00 == 1.0d) {
            this.A03.setVisibility(0);
            this.A0D.setVisibility(4);
            if (this.A0A.A02.A00 != null) {
                A07(this);
            }
        } else {
            A03();
        }
        IES ies = this.A08;
        IES.A02(ies);
        if (ies.A0B) {
            this.A06.setVisibility(4);
        }
        this.A0B.A02();
    }

    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public String A1b() {
        return "take_profile_picture";
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x024c, code lost:
    
        if (r0.A02 == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x028f, code lost:
    
        if (r311 >= 0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023c  */
    @Override // com.facebook.messaging.neue.nux.NuxFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1c(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.neue.nux.profilepic.PartialNuxCameraFragment.A1c(android.os.Bundle):void");
    }

    public String AWg() {
        return "orca_nux_camera";
    }

    public Long Am7() {
        return 252356926025912L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof PickMediaDialogFragment) {
            ((PickMediaDialogFragment) fragment).A07 = new Cm3(this, 3);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(2088035038);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2131558416);
        0FI.A08(892434599, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-1882847125);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
            this.A01 = null;
        }
        Bitmap bitmap2 = this.A00;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.A00 = null;
        }
        0FI.A08(-59666843, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(877524875);
        super/*androidx.fragment.app.Fragment*/.onPause();
        IES ies = this.A08;
        IES.A02(ies);
        IES.A00(Qpb.A0B, ies);
        IES.A01(new Hy4(Qpb.A0D), ies);
        IES ies2 = this.A08;
        ies2.getClass();
        ies2.A06();
        this.A0B.A04();
        0FI.A08(-1911264648, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        82O r0 = this.A0O;
        r0.getClass();
        this.A0B = r0.A00(getContext());
        this.A0L = 7zL.A0F(this, 2131363341);
        this.A02 = 7zL.A0F(this, 2131362819);
        this.A04 = 7zL.A0F(this, 2131362841);
        this.A0J = 7zL.A0F(this, 2131362843);
        this.A0I = 7zL.A0F(this, 2131362842);
        this.A0N = GOp.A0D(this, 2131362848);
        this.A0K = 7zL.A0F(this, 2131364277);
        this.A05 = 7zL.A0F(this, 2131362829);
        this.A0M = 7zL.A0F(this, 2131367870);
        this.A06 = 7zL.A0F(this, 2131364165);
        this.A0D = (LithoView) 7zL.A0F(this, 2131361997);
        this.A03 = 7zL.A0F(this, 2131362821);
        IKE.A01(this.A0K, this, ActionId.RTMP_CONNECTION_CONNECTED);
        IKE.A01(this.A0M, this, ActionId.RTMP_CONNECTION_FAILED);
        IKE.A01(this.A06, this, ActionId.RTMP_CONNECTION_INTERCEPTED);
        AbR abR = this.A0P;
        IES ies = this.A08;
        ies.getClass();
        View view2 = this.A02;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            Hfd hfd = new Hfd(view2, ies);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0A = hfd;
            ViewStub viewStub = this.A0N;
            HdL hdL = hfd.A02;
            viewStub.setLayoutResource(2132543197);
            TextureView textureView = (TextureView) viewStub.inflate();
            hdL.A01 = textureView;
            textureView.setSurfaceTextureListener(new RjO(hdL));
            this.A0A.A00 = new HUJ(this);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
