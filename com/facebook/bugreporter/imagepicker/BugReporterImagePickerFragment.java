package com.facebook.bugreporter.imagepicker;

import X.08O;
import X.0FI;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1Bn;
import X.1Du;
import X.1ED;
import X.1Kd;
import X.1iF;
import X.1pK;
import X.2IA;
import X.7zL;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbN;
import X.AnonymousClass088;
import X.C00i;
import X.C02353ux;
import X.C08f;
import X.C2511Gfr;
import X.DKC;
import X.DKG;
import X.DKH;
import X.DQ6;
import X.ENN;
import X.Ev5;
import X.ExV;
import X.FXr;
import X.FXs;
import X.FY5;
import X.FwJ;
import X.FwL;
import X.LLQ;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import com.facebook.bugreporter.activity.bugreport.BugReportFragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.litho.LithoView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: BugReporterImagePickerFragment.class */
public class BugReporterImagePickerFragment extends 1pK {
    public LinearLayout A00;
    public BugReportFragment A01;
    public BugReporterImagePickerDoodleFragment A02;
    public Ev5 A03;
    public LithoView A04;
    public final AnonymousClass088 A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.07q, java.lang.Object] */
    public BugReporterImagePickerFragment() {
        1BQ A0D = AbH.A0D();
        this.A08 = A0D;
        this.A07 = DKC.A0W(this, 99435);
        this.A06 = 1BQ.A00();
        this.A05 = ((C08f) ((08O) A0D.get()).A01.get()).A07(new LLQ(this, 3), this, new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DQ6 A03(Uri uri, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, BugReporterImagePickerFragment bugReporterImagePickerFragment, boolean z) {
        FrameLayout frameLayout;
        if (bugReporterImagePickerFragment.A1P() == null) {
            AbN.A1Q(AbF.A0v(bugReporterImagePickerFragment.A07), 2131953562);
            frameLayout = null;
        } else {
            CallerContext callerContext = DQ6.A04;
            frameLayout = new FrameLayout(bugReporterImagePickerFragment.getContext(), null, 0);
            ((DQ6) frameLayout).A03 = false;
            View.inflate(frameLayout.getContext(), 2132542142, frameLayout);
            ((DQ6) frameLayout).A02 = (FbDraweeView) frameLayout.requireViewById(2131364556);
            ((DQ6) frameLayout).A01 = (ImageView) frameLayout.requireViewById(2131364555);
            ImageView imageView = (ImageView) frameLayout.requireViewById(2131364554);
            ((DQ6) frameLayout).A00 = imageView;
            imageView.setVisibility(4);
            ((DQ6) frameLayout).A01.setOnTouchListener(new FY5(frameLayout, 1));
            Resources resources = frameLayout.getResources();
            int A04 = DKC.A04(resources);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 48;
            layoutParams.setMargins(A04, 0, A04, 0);
            frameLayout.setLayoutParams(layoutParams);
            int dimensionPixelSize = resources.getDimensionPixelSize(2132279366);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(2132279366);
            2IA A01 = 2IA.A01(uri);
            A01.A06 = new C02353ux(dimensionPixelSize, dimensionPixelSize2);
            ((DQ6) frameLayout).A02.A0I(DQ6.A04, new C2511Gfr(frameLayout, 0), A01.A04());
            ((DQ6) frameLayout).A01.setOnClickListener(onClickListener);
            frameLayout.setOnClickListener(onClickListener2);
            if (z) {
                ((DQ6) frameLayout).A00.setVisibility(0);
                return frameLayout;
            }
        }
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(final Uri uri, BugReporterImagePickerFragment bugReporterImagePickerFragment, boolean z) {
        BugReportAttachmentMediaType bugReportAttachmentMediaType;
        FwJ A00;
        String str;
        A08(bugReporterImagePickerFragment);
        final Ev5 ev5 = bugReporterImagePickerFragment.A03;
        final Context requireContext = bugReporterImagePickerFragment.requireContext();
        ExV exV = bugReporterImagePickerFragment.A01.A02;
        FwL A002 = FwL.A00(bugReporterImagePickerFragment, 6);
        final BugReportAttachmentMediaSource bugReportAttachmentMediaSource = BugReportAttachmentMediaSource.A07;
        if (ev5.A00(requireContext, uri)) {
            z = false;
            DKG.A1U(exV.A0H, bugReportAttachmentMediaSource);
            bugReportAttachmentMediaType = BugReportAttachmentMediaType.A05;
            A00 = FwJ.A00(exV, ev5, 4);
            str = ".mp4";
        } else {
            DKG.A1U(exV.A0F, bugReportAttachmentMediaSource);
            bugReportAttachmentMediaType = BugReportAttachmentMediaType.A04;
            A00 = FwJ.A00(exV, ev5, 3);
            str = "";
        }
        ev5.A00.A03(ENN.A07);
        final BugReportAttachmentMediaType bugReportAttachmentMediaType2 = bugReportAttachmentMediaType;
        final String str2 = str;
        final boolean z2 = z;
        ListenableFuture D3C = ((1ED) ev5.A02.get()).D3C(new Callable() { // from class: X.G6t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Ev5 ev52 = ev5;
                String str3 = str2;
                boolean z3 = z2;
                Context context = requireContext;
                Uri uri2 = uri;
                BugReportAttachmentMediaType bugReportAttachmentMediaType3 = bugReportAttachmentMediaType2;
                BugReportAttachmentMediaSource bugReportAttachmentMediaSource2 = bugReportAttachmentMediaSource;
                OutputStream outputStream = null;
                try {
                    File A0m = DKE.A0m(F6t.A00().A07, 0Pz.A0h("bug_report_image_", str3, 1BL.A08(ev52.A01)));
                    FileOutputStream fileOutputStream = new FileOutputStream(A0m);
                    Uri fromFile = Uri.fromFile(A0m);
                    if (!z3) {
                        11I r0 = new 11I();
                        r0.A0A(context, uri2);
                        uri2 = Uri.fromFile(r0.A08());
                    }
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri2);
                    if (openInputStream == null) {
                        throw AnonymousClass001.A0Q("Input stream is null");
                    }
                    1SB.A00(openInputStream, fileOutputStream);
                    Parcelable.Creator creator = BugReportAttachment.CREATOR;
                    BugReportAttachment A003 = BugReportAttachment.Companion.A00(fromFile, bugReportAttachmentMediaSource2, bugReportAttachmentMediaType3, "BugReporterImagePickerFragment");
                    fileOutputStream.close();
                    return A003;
                } catch (Throwable th) {
                    if (0 != 0) {
                        outputStream.close();
                    }
                    throw th;
                }
            }
        });
        C00i c00i = ev5.A04;
        1Kd.A0D(c00i, A00, D3C);
        1Kd.A0D(c00i, A002, D3C);
    }

    public static void A07(View view, BugReporterImagePickerFragment bugReporterImagePickerFragment, BugReportAttachment bugReportAttachment) {
        BugReportFragment bugReportFragment = bugReporterImagePickerFragment.A01;
        if (bugReportFragment != null) {
            ExV exV = bugReportFragment.A02;
            List list = exV.A0t;
            if (list != null && !list.isEmpty()) {
                if (bugReportAttachment == 1BK.A0r(exV.A0t)) {
                    Map map = exV.A0v;
                    if (map instanceof ImmutableMap) {
                        exV.A01(map);
                    }
                    exV.A0v.put("original_screenshot_removed_or_replaced", "true");
                }
                exV.A0t.remove(bugReportAttachment);
            }
            ExV exV2 = bugReporterImagePickerFragment.A01.A02;
            DKG.A1U(exV2.A0G, bugReportAttachment.A00);
        }
        bugReporterImagePickerFragment.A00.removeView(view);
        A08(bugReporterImagePickerFragment);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ad, code lost:
    
        if (X.1BK.A0N(r301.A06).AZk(36314455293894604L) == false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A08(com.facebook.bugreporter.imagepicker.BugReporterImagePickerFragment r301) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bugreporter.imagepicker.BugReporterImagePickerFragment.A08(com.facebook.bugreporter.imagepicker.BugReporterImagePickerFragment):void");
    }

    public static void A09(BugReporterImagePickerFragment bugReporterImagePickerFragment, BugReportAttachment bugReportAttachment) {
        View A03 = A03(bugReportAttachment.A00(), FXs.A00(bugReportAttachment, bugReporterImagePickerFragment, 6), FXs.A00(bugReportAttachment, bugReporterImagePickerFragment, 7), bugReporterImagePickerFragment, false);
        if (A03 != null) {
            bugReporterImagePickerFragment.A00.addView(A03);
            A08(bugReporterImagePickerFragment);
        }
    }

    public 1iF A1R() {
        return DKG.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        BugReportFragment bugReportFragment;
        this.A03 = (Ev5) 1Bn.A0A(100312);
        Object obj = this.mParentFragment;
        Object context = getContext();
        if (obj instanceof BugReportFragment) {
            bugReportFragment = (BugReportFragment) obj;
        } else {
            if (!(context instanceof BugReportFragment)) {
                0fH.A17("BugReporterImagePickerFragment", "BugReporterImagePickerFragment should be embedded in contexts that implement the ImagePickerContainer interface. Currently `%s`.", new Object[]{context != null ? context.toString() : "null"});
                return;
            }
            bugReportFragment = (BugReportFragment) context;
        }
        this.A01 = bugReportFragment;
    }

    public /* synthetic */ void A1X(ActivityResult activityResult) {
        Intent intent = activityResult.A01;
        int i = activityResult.A00;
        super.onActivityResult(1, i, intent);
        if (i != -1 || intent == null || intent.getData() == null) {
            return;
        }
        A06(intent.getData(), this, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-1351628395);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        ImmutableList A0f = DKH.A0f(this.A01.A02.A0t);
        BugReportAttachment bugReportAttachment = this.A01.A02.A0J;
        ImmutableList of = bugReportAttachment == null ? ImmutableList.of() : ImmutableList.of((Object) bugReportAttachment);
        ImmutableList A0f2 = DKH.A0f(this.A01.A02.A0u);
        if (A0f != null && !A0f.isEmpty()) {
            1Du it = A0f.iterator();
            while (it.hasNext()) {
                A09(this, (BugReportAttachment) it.next());
            }
        }
        if (of != null && !of.isEmpty()) {
            Iterator it2 = of.iterator();
            while (it2.hasNext()) {
                View A03 = A03(((BugReportAttachment) it2.next()).A00(), FXr.A02(this, 25), null, this, true);
                if (A03 != null) {
                    this.A00.addView(A03);
                    A08(this);
                }
            }
        }
        if (A0f2 != null && !A0f2.isEmpty()) {
            Iterator it3 = A0f2.iterator();
            while (it3.hasNext()) {
                BugReportAttachment bugReportAttachment2 = (BugReportAttachment) it3.next();
                View A032 = A03(bugReportAttachment2.A00(), FXs.A00(bugReportAttachment2, this, 8), null, this, true);
                if (A032 != null) {
                    this.A00.addView(A032);
                    A08(this);
                }
            }
        }
        0FI.A08(-257764313, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-147374977);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542141);
        this.A00 = (LinearLayout) A08.requireViewById(2131364552);
        this.A04 = 7zL.A0b(A08, 2131364551);
        A08(this);
        0FI.A08(344402365, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(708031823);
        BugReporterImagePickerDoodleFragment bugReporterImagePickerDoodleFragment = this.A02;
        if (bugReporterImagePickerDoodleFragment != null) {
            bugReporterImagePickerDoodleFragment.A01 = null;
        }
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(-2062356905, A02);
    }
}
