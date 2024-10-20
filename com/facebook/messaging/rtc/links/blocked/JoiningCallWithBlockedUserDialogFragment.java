package com.facebook.messaging.rtc.links.blocked;

import X.0FI;
import X.1BL;
import X.1BV;
import X.1Lo;
import X.1iF;
import X.2Ov;
import X.7zL;
import X.Aa9;
import X.C00i;
import X.C1rs;
import X.C8ul;
import X.EAX;
import X.FeI;
import X.JDB;
import X.JFq;
import X.QDQ;
import X.QLx;
import X.RrA;
import X.RrJ;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: JoiningCallWithBlockedUserDialogFragment.class */
public class JoiningCallWithBlockedUserDialogFragment extends 2Ov implements JFq {
    public C00i A00;
    public LithoView A01;
    public Aa9 A02;
    public C8ul A04;
    public final C00i A05 = new 1BV(this, 16979);
    public Aa9 A03 = new RrA(this);

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        this.A01.getClass();
        EAX eax = new EAX(getContext());
        eax.A0A(FeI.A00);
        eax.A0L = true;
        eax.A0C(false);
        eax.setCancelable(true);
        eax.setCanceledOnTouchOutside(false);
        eax.setContentView(this.A01);
        return eax;
    }

    public 1iF A17() {
        return new 1iF(322006035685628L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        RrJ rrJ = (RrJ) jdb;
        if (this.A01 == null || getContext() == null) {
            return;
        }
        LithoView lithoView = this.A01;
        QDQ qdq = new QDQ(lithoView.A09, new QLx());
        ImmutableList immutableList = rrJ.A00;
        QLx qLx = qdq.A01;
        qLx.A04 = immutableList;
        BitSet bitSet = qdq.A02;
        bitSet.set(0);
        qLx.A03 = rrJ.A02;
        bitSet.set(3);
        qLx.A02 = rrJ.A01;
        bitSet.set(2);
        qLx.A00 = this.A03;
        bitSet.set(1);
        qLx.A01 = (MigColorScheme) this.A05.get();
        C1rs.A02(bitSet, qdq.A03);
        qdq.A0J();
        lithoView.A0y(qLx);
    }

    public void onCancel(DialogInterface dialogInterface) {
        Aa9 aa9 = this.A02;
        if (aa9 != null) {
            aa9.onCancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-619922571);
        super.onCreate(bundle);
        this.A00 = 1Lo.A02(1BL.A0G(this), this, 67965);
        this.A01 = new LithoView(7zL.A0W(getContext()));
        C8ul c8ul = (C8ul) new 1BV(this, 68765).get();
        this.A04 = c8ul;
        c8ul.A0Y(this);
        0FI.A08(1295040787, A02);
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-1577749217);
        C8ul c8ul = this.A04;
        if (c8ul != null) {
            c8ul.A0X();
        }
        super.onDestroy();
        0FI.A08(293755754, A02);
    }
}
