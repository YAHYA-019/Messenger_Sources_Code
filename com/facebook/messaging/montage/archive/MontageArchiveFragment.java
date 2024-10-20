package com.facebook.messaging.montage.archive;

import X.0D2;
import X.0FI;
import X.1BJ;
import X.1BL;
import X.1Bi;
import X.1HH;
import X.1Iw;
import X.1Lo;
import X.1iF;
import X.1yM;
import X.2JX;
import X.2Ob;
import X.2Ov;
import X.2cK;
import X.2cM;
import X.4YU;
import X.7zL;
import X.7zM;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.AbK;
import X.C00i;
import X.C0et;
import X.C21N;
import X.C5d1;
import X.CZF;
import X.Czk;
import X.HGG;
import X.QCh;
import X.QIb;
import X.RFn;
import X.RJC;
import android.app.Dialog;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxCallback;
import java.util.BitSet;
import java.util.Locale;

/* loaded from: MontageArchiveFragment.class */
public class MontageArchiveFragment extends 2Ov {
    public TextView A00;
    public Toolbar A01;
    public FbUserSession A02;
    public C0et A03;
    public 2JX A04;
    public C00i A05;
    public 1Iw A06;
    public LithoView A07;
    public RJC A08;
    public HGG A09;
    public MigColorScheme A0A;
    public C00i A0D;
    public final C00i A0G = new 1HH(this, 67720);
    public final 1yM A0E = (1yM) 1Bi.A03(16885);
    public final C00i A0H = AbH.A0I();
    public final C00i A0I = AbF.A0S(this, 49802);
    public final C00i A0F = AbF.A0S(this, 50185);
    public boolean A0B = false;
    public boolean A0C = false;
    public final MailboxCallback A0J = Czk.A00(this, 58);

    /* JADX WARN: Multi-variable type inference failed */
    public static void A05(MontageArchiveFragment montageArchiveFragment) {
        if (montageArchiveFragment.getContext() != null) {
            C00i c00i = montageArchiveFragment.A0I;
            C5d1 c5d1 = (C5d1) c00i.get();
            C21N c21n = (C21N) 4YU.A0p(montageArchiveFragment.A0D);
            if (c5d1.A02 == null) {
                c5d1.A02 = c21n;
            }
            C5d1 c5d12 = (C5d1) c00i.get();
            MailboxCallback mailboxCallback = montageArchiveFragment.A0J;
            if (c5d12.A01 == null) {
                c5d12.A01 = mailboxCallback;
            }
            ((C5d1) c00i.get()).A00();
        }
    }

    public Dialog A0n(Bundle bundle) {
        A0g(2, 2132608344);
        return super.A0n(bundle);
    }

    public 1iF A17() {
        return AbF.A0C(1567251216773138L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(759662167);
        super.onCreate(bundle);
        this.A02 = 1BL.A0G(this);
        this.A03 = AbJ.A0E();
        this.A0A = AbK.A0h(this);
        this.A05 = 1Lo.A02(this.A02, this, 67425);
        this.A0D = 1Lo.A02(this.A02, this, 33124);
        0FI.A08(-191944240, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(963926956);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542613);
        Window window = ((0D2) this).A01.getWindow();
        window.setSoftInputMode(16);
        window.addFlags(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
        window.addFlags(256);
        window.setStatusBarColor(getContext().getColor(2132214505));
        0FI.A08(-636263212, A02);
        return A08;
    }

    public void onDestroy() {
        Object A0b;
        2Ob A08;
        int A02 = 0FI.A02(1641875828);
        RJC rjc = this.A08;
        if (rjc != null && (A0b = rjc.A00.A0b(1BJ.A00(100))) != null && (A08 = MontageViewerFragment.A08((MontageViewerFragment) A0b)) != null) {
            A08.onResume();
        }
        super.onDestroy();
        0FI.A08(-1677060435, A02);
    }

    public void onStart() {
        int i;
        int A02 = 0FI.A02(525887000);
        super/*X.0D2*/.onStart();
        Dialog dialog = ((0D2) this).A01;
        if (dialog == null) {
            i = -544288465;
        } else {
            dialog.getWindow().setWindowAnimations(2132607636);
            i = 74024822;
        }
        0FI.A08(i, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LithoView lithoView = (LithoView) 7zL.A0F(this, 2131367688);
        this.A07 = lithoView;
        this.A06 = lithoView.A09;
        Toolbar toolbar = (Toolbar) 7zL.A0F(this, 2131367687);
        this.A01 = toolbar;
        TextView A06 = AbF.A06(toolbar, 2131368123);
        this.A00 = A06;
        A06.setText(2131960461);
        this.A01.A0L(2131953159);
        this.A01.A0Q(CZF.A00(this, 2));
        RFn rFn = new RFn(this);
        Toolbar toolbar2 = this.A01;
        MigColorScheme migColorScheme = this.A0A;
        migColorScheme.getClass();
        MigColorScheme.A00(toolbar2, migColorScheme);
        Drawable A0E = this.A01.A0E();
        if (A0E != null) {
            MigColorScheme migColorScheme2 = this.A0A;
            migColorScheme2.getClass();
            A0E.setColorFilter(migColorScheme2.B4h(), PorterDuff.Mode.MULTIPLY);
        }
        TextView textView = this.A00;
        MigColorScheme migColorScheme3 = this.A0A;
        migColorScheme3.getClass();
        AbH.A1M(textView, migColorScheme3);
        Locale locale = 4YU.A0B(this.A06.A0D).locale;
        if (Locale.getDefault() != locale) {
            Locale.setDefault(locale);
        }
        LithoView lithoView2 = this.A07;
        2cM A01 = 2cK.A01(this.A06, (String) null, 0);
        QCh qCh = new QCh(this.A06, new QIb());
        MigColorScheme migColorScheme4 = this.A0A;
        migColorScheme4.getClass();
        7zM.A1O(qCh, migColorScheme4);
        qCh.A0R();
        QIb qIb = qCh.A01;
        qIb.A00 = rFn;
        BitSet bitSet = qCh.A02;
        bitSet.set(0);
        MigColorScheme migColorScheme5 = this.A0A;
        migColorScheme5.getClass();
        qIb.A01 = migColorScheme5;
        bitSet.set(1);
        AbJ.A1R(A01, qCh, qIb, bitSet, qCh.A03);
        lithoView2.A0y(A01.A00);
    }
}
