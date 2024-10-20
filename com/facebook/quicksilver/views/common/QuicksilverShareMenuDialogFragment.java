package com.facebook.quicksilver.views.common;

import X.0FI;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1HG;
import X.1iF;
import X.AnonymousClass001;
import X.DKG;
import X.DZW;
import X.ENU;
import X.Efn;
import X.F6C;
import X.FAX;
import X.FY4;
import X.GDK;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment;
import com.facebook.quicksilver.QuicksilverActivity;

/* loaded from: QuicksilverShareMenuDialogFragment.class */
public final class QuicksilverShareMenuDialogFragment extends SlidingSheetDialogFragment implements CallerContextable {
    public Efn A00;
    public FAX A01;
    public static final CallerContext A07 = CallerContext.A06(QuicksilverShareMenuDialogFragment.class);
    public static final View.OnTouchListener A06 = new FY4(1);
    public final 1Br A03 = 1HG.A01(this, 82751);
    public final 1Br A02 = 1HG.A01(this, 98386);
    public final 1Br A05 = 1HG.A01(this, 98368);
    public final 1Br A04 = 1Bq.A00(83604);

    public void A0o() {
        super/*X.0D2*/.A0o();
        Efn efn = this.A00;
        if (efn != null) {
            QuicksilverActivity quicksilverActivity = efn.A00;
            DZW dzw = quicksilverActivity.A0E;
            if (dzw != null) {
                dzw.A1a(ENU.A04);
            }
            DKG.A0p(quicksilverActivity).A0C("share_menu_hide");
        }
    }

    public 1iF A17() {
        return DKG.A0H();
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        Activity A16 = A16();
        if (A16 instanceof GDK) {
            this.A01 = ((F6C) 1Br.A0B(this.A03)).A00;
            super/*X.0D2*/.onAttach(context);
        } else {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(A16);
            throw new ClassCastException(AnonymousClass001.A0d(" must implement ShareMenuHostingActivity", A0k));
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        Efn efn = this.A00;
        if (efn != null) {
            QuicksilverActivity quicksilverActivity = efn.A00;
            DZW dzw = quicksilverActivity.A0E;
            if (dzw != null) {
                dzw.A1a(ENU.A04);
            }
            DKG.A0p(quicksilverActivity).A0C("share_menu_hide");
        }
    }

    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(2113996113);
        super.onCreate(bundle);
        0FI.A08(829763695, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-789265123);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132543210, viewGroup, false);
        0FI.A08(-1255737498, A02);
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e0, code lost:
    
        if (r304 != null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.views.common.QuicksilverShareMenuDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
