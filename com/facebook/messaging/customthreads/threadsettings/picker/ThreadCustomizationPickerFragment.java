package com.facebook.messaging.customthreads.threadsettings.picker;

import X.0D2;
import X.0FI;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Du;
import X.1Iw;
import X.1LI;
import X.1Lo;
import X.1MV;
import X.3Dm;
import X.3Do;
import X.3UZ;
import X.3XF;
import X.77G;
import X.7zK;
import X.9Z6;
import X.AnonymousClass001;
import X.C00i;
import X.C1rs;
import X.C36d;
import X.C5xl;
import X.C5yh;
import X.C8hw;
import X.C8o1;
import X.C9bf;
import X.DGr;
import X.GOm;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.fbavatar.config.AvatarConfigRepository;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.BitSet;

/* loaded from: ThreadCustomizationPickerFragment.class */
public class ThreadCustomizationPickerFragment extends SlidingSheetDialogFragment {
    public FbUserSession A00;
    public C00i A02;
    public C00i A03;
    public LithoView A04;
    public DGr A06;
    public ThreadKey A07;
    public ThreadSummary A08;
    public C9bf A09;
    public MigColorScheme A0A;
    public C00i A0C;
    public C00i A0D;
    public C00i A0E;
    public 3Do A0F;
    public final C00i A0H = 1BQ.A02(50079);
    public ImmutableList A0B = ImmutableList.of();
    public 3Dm A05 = 3Dm.A03;
    public TriState A01 = TriState.NO;
    public final Handler A0G = AnonymousClass001.A07();

    /* JADX WARN: Multi-variable type inference failed */
    public static 1LI A05(1Iw r301, ThreadCustomizationPickerFragment threadCustomizationPickerFragment, 3Dm r303, MigColorScheme migColorScheme, ImmutableList immutableList) {
        threadCustomizationPickerFragment.A05 = r303;
        threadCustomizationPickerFragment.A0B = immutableList;
        ThreadThemeInfo threadThemeInfo = (ThreadThemeInfo) threadCustomizationPickerFragment.mArguments.getParcelable(7zK.A00(45));
        boolean z = false;
        if (threadThemeInfo != null && threadThemeInfo.A0T != -1) {
            1Du it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (((ThreadThemeInfo) it.next()).A0S == threadThemeInfo.A0S) {
                    break;
                }
            }
        }
        ThreadSummary threadSummary = threadCustomizationPickerFragment.A08;
        ImmutableMap immutableMap = threadSummary != null ? threadSummary.A1S : RegularImmutableMap.A03;
        3Do r0 = threadCustomizationPickerFragment.A0F;
        3Do r02 = 3Do.A04;
        String A00 = GOm.A00(93);
        if (r0 == r02 || r0 == 3Do.A02) {
            FbUserSession fbUserSession = threadCustomizationPickerFragment.A00;
            fbUserSession.getClass();
            return new C8hw(fbUserSession, threadCustomizationPickerFragment.A01, r301, threadCustomizationPickerFragment.A06, (ThreadCustomization) threadCustomizationPickerFragment.mArguments.getParcelable(A00), threadCustomizationPickerFragment.A09, migColorScheme, threadThemeInfo, AnonymousClass001.A1W(threadCustomizationPickerFragment.A0F, 3Do.A02));
        }
        C36d c36d = new C36d(r301, new C8o1());
        C8o1 c8o1 = c36d.A01;
        c8o1.A01 = r303;
        BitSet bitSet = c36d.A02;
        bitSet.set(2);
        c8o1.A06 = immutableList;
        bitSet.set(0);
        c8o1.A04 = migColorScheme;
        bitSet.set(1);
        c8o1.A00 = new 9Z6(threadCustomizationPickerFragment, migColorScheme, threadThemeInfo, z);
        bitSet.set(4);
        c8o1.A03 = (ThreadCustomization) threadCustomizationPickerFragment.mArguments.getParcelable(A00);
        bitSet.set(6);
        c8o1.A05 = threadThemeInfo;
        bitSet.set(7);
        c8o1.A08 = z;
        bitSet.set(3);
        c8o1.A02 = threadCustomizationPickerFragment.A0F;
        c8o1.A07 = immutableMap;
        bitSet.set(5);
        c8o1.A09 = ((77G) threadCustomizationPickerFragment.A02.get()).A01();
        C1rs.A05(bitSet, c36d.A03, 8);
        c36d.A0J();
        return c8o1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x010f, code lost:
    
        if (r0.AZk(36316619965409593L) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A06(X.1Iw r301, com.facebook.messaging.customthreads.threadsettings.picker.ThreadCustomizationPickerFragment r302) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.customthreads.threadsettings.picker.ThreadCustomizationPickerFragment.A06(X.1Iw, com.facebook.messaging.customthreads.threadsettings.picker.ThreadCustomizationPickerFragment):void");
    }

    public static void A07(1Iw r301, ThreadCustomizationPickerFragment threadCustomizationPickerFragment) {
        LithoView lithoView = threadCustomizationPickerFragment.A04;
        if (lithoView != null) {
            lithoView.A0x(A05(r301, threadCustomizationPickerFragment, 3Dm.A02, threadCustomizationPickerFragment.A0A, ImmutableList.of()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-64864844);
        super.onCreate(bundle);
        this.A0E = 1BV.A00(114945);
        this.A0D = 1BV.A00(84531);
        this.A03 = 1BV.A00(66208);
        this.A02 = 1BQ.A02(66663);
        FbUserSession A0G = 1BL.A0G(this);
        this.A00 = A0G;
        Context requireContext = requireContext();
        Integer num = 1Lo.A05;
        this.A0C = new 1MV(requireContext, A0G, 66451);
        Bundle bundle2 = this.mArguments;
        this.A0A = (MigColorScheme) ((bundle2 == null || bundle2.getParcelable("color_scheme") == null) ? 1Bn.A0E(requireContext(), (1BY) null, 16979) : this.mArguments.getParcelable("color_scheme"));
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            this.A07 = (ThreadKey) bundle3.getParcelable("thread_key");
        }
        if (this.A07 != null) {
            ((C5xl) 1Bi.A03(67528)).ASY(this.A07).observe(this, new 3UZ(this, 0));
        }
        0FI.A08(-2002702702, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1695623469);
        Preconditions.checkNotNull(this.mArguments, "Please use newInstance() to create");
        this.A0F = 3Do.valueOf(bundle != null ? bundle.getString("picker_type") : this.mArguments.getString("picker_type"));
        1Iw r0 = new 1Iw(getContext());
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && dialog.getWindow() != null) {
            ((0D2) this).A01.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        if (((C5yh) this.A0C.get()).A01()) {
            this.A01 = TriState.UNSET;
        }
        LithoView lithoView = new LithoView(r0, (AttributeSet) null);
        this.A04 = lithoView;
        lithoView.A0x(A05(r0, this, 3Dm.A03, this.A0A, ImmutableList.of()));
        if (((C5yh) this.A0C.get()).A01()) {
            FbUserSession fbUserSession = this.A00;
            fbUserSession.getClass();
            ((AvatarConfigRepository) 1Lo.A04(requireContext(), fbUserSession, (1BY) null, 66197)).A02(new 3XF(r0, this));
        } else {
            A06(r0, this);
        }
        LithoView lithoView2 = this.A04;
        0FI.A08(-250575175, A02);
        return lithoView2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putString("picker_type", this.A0F.name());
    }
}
