package com.facebook.messaging.threadview.messagelist.item.video;

import X.0FI;
import X.1BL;
import X.1iF;
import X.2Ov;
import X.6F2;
import X.6cM;
import X.81M;
import X.C52j;
import X.C7oc;
import X.IGa;
import X.Rk8;
import X.Rrn;
import X.S8V;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.threadview.attachment.video.VideoMessageContainer$VideoState;
import com.google.common.collect.ImmutableSet;

/* loaded from: ThreadViewVideoDialogFragment.class */
public class ThreadViewVideoDialogFragment extends 2Ov {
    public VideoMessageContainer$VideoState A00;
    public 6cM A01;
    public C7oc A02;
    public Message A03;
    public final 81M A05 = new Rrn(this);
    public final ViewTreeObserver.OnGlobalLayoutListener A04 = new Rk8(this);

    private void A05(Bundle bundle) {
        if (bundle.containsKey("messageKey")) {
            this.A03 = (Message) bundle.getParcelable("messageKey");
        }
        if (bundle.containsKey("videoStateKey")) {
            this.A00 = (VideoMessageContainer$VideoState) bundle.getParcelable("videoStateKey");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(ThreadViewVideoDialogFragment threadViewVideoDialogFragment) {
        C7oc c7oc = threadViewVideoDialogFragment.A02;
        if (c7oc != null) {
            6F2 r0 = c7oc.A00;
            ImmutableSet immutableSet = 6F2.A4P;
            r0.A0y = null;
        }
        6cM r02 = threadViewVideoDialogFragment.A01;
        if (r02 != null) {
            r02.getViewTreeObserver().removeOnGlobalLayoutListener(threadViewVideoDialogFragment.A04);
        }
        if (threadViewVideoDialogFragment.isAdded()) {
            threadViewVideoDialogFragment.A0p();
        }
    }

    public Dialog A0n(Bundle bundle) {
        A0g(2, 2132608340);
        Dialog A0n = super.A0n(bundle);
        A0n.setOnKeyListener(new IGa(this, 2));
        return A0n;
    }

    public 1iF A17() {
        return new 1iF(308851093610228L);
    }

    public boolean Bkd() {
        6cM r0 = this.A01;
        if (r0 != null) {
            r0.A0Z(C52j.A2Z);
        }
        A06(this);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(583944075);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle != null) {
            A05(bundle);
        } else if (bundle2 != null) {
            A05(bundle2);
        }
        0FI.A08(-779274338, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1448609336);
        FbUserSession A0F = 1BL.A0F();
        CallerContext callerContext = 6cM.A1k;
        6cM r0 = new 6cM(getContext(), A0F);
        this.A01 = r0;
        r0.A0Y(this.A03);
        this.A01.A0D = getChildFragmentManager();
        6cM r02 = this.A01;
        r02.A0r = this.A05;
        r02.A19 = true;
        0FI.A08(-942708751, A02);
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(157246394);
        super/*androidx.fragment.app.Fragment*/.onPause();
        6cM r0 = this.A01;
        if (r0 != null) {
            r0.getViewTreeObserver().removeOnGlobalLayoutListener(this.A04);
            this.A00 = this.A01.A0W();
        }
        0FI.A08(-1440942107, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(760410660);
        super/*androidx.fragment.app.Fragment*/.onResume();
        6cM r0 = this.A01;
        if (r0 != null) {
            r0.getViewTreeObserver().addOnGlobalLayoutListener(this.A04);
            this.A01.post(new S8V(this));
        }
        0FI.A08(-275385583, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putParcelable("messageKey", this.A03);
        6cM r0 = this.A01;
        if (r0 != null) {
            bundle.putParcelable("videoStateKey", r0.A0W());
        }
    }
}
