package com.facebook.bugreporter.imagepicker;

import X.0FI;
import X.1Bi;
import X.1Bn;
import X.1ED;
import X.1iF;
import X.2MR;
import X.2Ov;
import X.6KV;
import X.7zL;
import X.7zM;
import X.82O;
import X.AbJ;
import X.AnonymousClass536;
import X.C00i;
import X.DKC;
import X.DKG;
import X.Ekq;
import X.FXr;
import X.GHs;
import X.InterfaceC07034in;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.drawingview.DrawingView;
import java.util.concurrent.Executor;

/* loaded from: BugReporterImagePickerDoodleFragment.class */
public class BugReporterImagePickerDoodleFragment extends 2Ov implements CallerContextable {
    public static final CallerContext A0C = CallerContext.A06(BugReporterImagePickerDoodleFragment.class);
    public FrameLayout A00;
    public Ekq A01;
    public GHs A02;
    public 1ED A03;
    public Executor A04;
    public View A05;
    public 6KV A06;
    public FbDraweeView A07;
    public DrawingView A08;
    public 82O A09;
    public final AnonymousClass536 A0A = (AnonymousClass536) 1Bi.A03(49473);
    public final C00i A0B = DKC.A0W(this, 99435);

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        A0n.setTitle(getString(2131953560));
        A0n.setCanceledOnTouchOutside(true);
        return A0n;
    }

    public void A0p() {
        super/*X.0D2*/.A0p();
        this.A06.A04();
    }

    public 1iF A17() {
        return DKG.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-990633191);
        super.onActivityCreated(bundle);
        FbDraweeView fbDraweeView = (FbDraweeView) 7zL.A0F(this, 2131367111);
        this.A07 = fbDraweeView;
        fbDraweeView.A0G((Uri) requireArguments().getParcelable("arg_screenshot_bitmap_uri"), A0C);
        this.A07.A0M(InterfaceC07034in.A04);
        DrawingView drawingView = (DrawingView) 7zL.A0F(this, 2131363701);
        this.A08 = drawingView;
        int A022 = 7zM.A02(getContext(), 2MR.A1v);
        drawingView.A0A.setColor(A022);
        drawingView.A05 = A022;
        this.A08.A0L = false;
        View A0F = 7zL.A0F(this, 2131362119);
        this.A05 = A0F;
        FXr.A03(A0F, this, 21);
        this.A00 = (FrameLayout) 7zL.A0F(this, 2131364548);
        0FI.A08(-630759184, A02);
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1994460530);
        super.onCreate(bundle);
        this.A03 = (1ED) 1Bi.A03(16469);
        this.A04 = AbJ.A1D();
        this.A09 = (82O) 1Bn.A0A(65571);
        this.A02 = (GHs) 1Bi.A03(115060);
        0FI.A08(-1597401256, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-499087991);
        View inflate = layoutInflater.inflate(2132541633, viewGroup);
        0FI.A08(1460794979, A02);
        return inflate;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-2045894693);
        super.onDestroy();
        this.A06.A04();
        0FI.A08(-1121259953, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(627004251);
        super/*X.0D2*/.onStart();
        6KV A00 = this.A09.A00(getContext());
        this.A06 = A00;
        A00.A02();
        0FI.A08(-1031191636, A02);
    }

    public void onStop() {
        int A02 = 0FI.A02(-1406101894);
        super/*X.0D2*/.onStop();
        this.A06.A04();
        0FI.A08(-1194222333, A02);
    }
}
