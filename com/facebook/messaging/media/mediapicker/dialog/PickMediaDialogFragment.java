package com.facebook.messaging.media.mediapicker.dialog;

import X.08O;
import X.0FI;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1ED;
import X.1GU;
import X.1iF;
import X.2Ov;
import X.48U;
import X.53S;
import X.53U;
import X.5HP;
import X.5HV;
import X.7zO;
import X.AbF;
import X.AbI;
import X.AbJ;
import X.AnonymousClass002;
import X.AnonymousClass536;
import X.C01s;
import X.C6kg;
import X.F8q;
import X.GOp;
import X.GzP;
import X.H9H;
import X.Hdi;
import X.JJz;
import X.K92;
import android.R;
import android.app.Dialog;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.messaging.media.mediapicker.dialog.params.PickMediaDialogParams;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* loaded from: PickMediaDialogFragment.class */
public class PickMediaDialogFragment extends 2Ov {
    public ContentResolver A00;
    public Uri A01;
    public Uri A02;
    public Bundle A03;
    public C01s A04;
    public 1GU A05;
    public AnonymousClass536 A06;
    public JJz A07;
    public PickMediaDialogParams A08;
    public 08O A09;
    public 5HV A0A;
    public F8q A0B;
    public ListenableFuture A0C;
    public 1ED A0D;
    public Executor A0E;
    public Hdi A0F;
    public C6kg A0G;

    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.fragment.app.Fragment, com.facebook.messaging.media.mediapicker.dialog.PickMediaDialogFragment, X.2Ov] */
    public static PickMediaDialogFragment A05(PickMediaDialogParams pickMediaDialogParams) {
        boolean z = false;
        if (pickMediaDialogParams.A01 == H9H.A01) {
            ImmutableSet immutableSet = pickMediaDialogParams.A02;
            Preconditions.checkArgument(AbJ.A1U(immutableSet.size(), 1));
            Preconditions.checkArgument(immutableSet.contains(5HP.A0F));
        }
        if (pickMediaDialogParams.A00 != null) {
            ImmutableSet immutableSet2 = pickMediaDialogParams.A02;
            if (immutableSet2.size() == 1) {
                z = true;
            }
            Preconditions.checkArgument(z);
            Preconditions.checkArgument(immutableSet2.contains(5HP.A0F));
        }
        ?? r0 = new 2Ov();
        Bundle A05 = 1BK.A05();
        A05.putParcelable(K92.__redex_internal_original_name, pickMediaDialogParams);
        r0.setArguments(A05);
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(PickMediaDialogFragment pickMediaDialogFragment) {
        if (pickMediaDialogFragment.isAdded()) {
            JJz jJz = pickMediaDialogFragment.A07;
            if (jJz != null) {
                jJz.Bn5();
            }
            pickMediaDialogFragment.A0p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A07(PickMediaDialogFragment pickMediaDialogFragment) {
        if (pickMediaDialogFragment.isAdded()) {
            JJz jJz = pickMediaDialogFragment.A07;
            if (jJz != null) {
                jJz.onError();
            }
            pickMediaDialogFragment.A0p();
        }
    }

    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        A0n.setCanceledOnTouchOutside(true);
        return A0n;
    }

    public 1iF A17() {
        return AbF.A0C(1060323827715574L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-1437206651);
        super.onActivityCreated(bundle);
        this.A03 = bundle;
        53U A01 = ((53S) 7zO.A0l(this, 49478)).A01(this);
        ArrayList A17 = 1BK.A17(Arrays.asList(48U.A00));
        if (this.A08.A01 == H9H.A01) {
            A17.add("android.permission.CAMERA");
        }
        A01.AHR(new GzP(this, 0), AnonymousClass002.A0b(A17));
        0FI.A08(2087297159, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r302, int r303, android.content.Intent r304) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.mediapicker.dialog.PickMediaDialogFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(646940118);
        super.onCreate(bundle);
        this.A00 = (ContentResolver) 7zO.A0m(this, 100181);
        this.A04 = 1BL.A0I();
        this.A0A = GOp.A0z();
        this.A0G = (C6kg) 1Bi.A03(50135);
        this.A0F = (Hdi) 1Bi.A03(99677);
        this.A06 = GOp.A0E();
        this.A09 = (08O) 1Bi.A03(6);
        this.A0B = (F8q) 7zO.A0m(this, 99435);
        this.A0D = (1ED) 1Bi.A03(16431);
        this.A0E = AbJ.A1D();
        this.A05 = AbI.A0A();
        A0g(2, R.style.Theme.Translucent.NoTitleBar);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A08 = (PickMediaDialogParams) bundle2.getParcelable(K92.__redex_internal_original_name);
        }
        if (bundle != null) {
            this.A01 = (Uri) bundle.getParcelable("tmp_camera_file");
            this.A02 = (Uri) bundle.getParcelable("tmp_crop_file");
        }
        0FI.A08(-232539447, A02);
    }

    public void onDestroy() {
        int A02 = 0FI.A02(405032069);
        super.onDestroy();
        7zO.A1X(this.A0C);
        0FI.A08(-522668769, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putParcelable("tmp_camera_file", this.A01);
        bundle.putParcelable("tmp_crop_file", this.A02);
    }
}
