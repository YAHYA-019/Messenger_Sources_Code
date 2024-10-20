package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.workmessaging.fragment.WorkMessagingFragmentWrapperActivity;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9y4, reason: invalid class name */
/* loaded from: 9y4.class */
public final class C9y4 implements 6Ge {
    public final 1Br A02 = 7zM.A0U();
    public final 1Br A01 = 1Bu.A00(81928);
    public final 1Br A03 = 1Bu.A00(68637);
    public final 1Br A00 = 1Bu.A00(147825);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9g5] */
    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        ?? obj = new Object();
        obj.A02 = BNO.A0j.id;
        obj.A04 = parcelable;
        obj.A03 = 2131959684;
        C9g5.A00(C1u3.A1u, 7zP.A0S(this.A02), obj);
        obj.A06 = "select_and_copy";
        return new MenuDialogItem((C9g5) obj);
    }

    public String AaH() {
        return "CLick on Menu Item: Select and Copy";
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        4YV.A1M(context, 0, message);
        7zU.A1Q((C3E) 1Br.A0B(this.A01), BNO.A0j);
        ImmutableList immutableList = C1q7.A07;
        String A07 = C1q7.A07(message, false);
        if (A07 == null) {
            return false;
        }
        1Br.A0C(this.A00);
        Bundle bundle = new Bundle(1);
        bundle.putString("SELECT_AND_COPY_TEXT", A07);
        Intent A0D = C3o5.A0D(context, WorkMessagingFragmentWrapperActivity.class);
        A0D.putExtra("WMFragmentWrapper_FragmentKey", 4);
        A0D.putExtra("WMFragmentWrapper_FragmentArgs", bundle);
        A0D.putExtra("WMFragmentWrapper_FragmentTag", (String) null);
        1BK.A0W().A0A(context, A0D);
        return false;
    }

    public boolean Cyd(Context context, Parcelable parcelable, Message message, ThreadSummary threadSummary, Capabilities capabilities, boolean z) {
        11T.A0F(message, 1);
        if (!1Br.A07(((9Km) 1Br.A0B(this.A03)).A00).AZk(36325158352343409L) || C1q7.A0p(message)) {
            return false;
        }
        return (threadSummary == null || !ThreadKey.A0d(threadSummary.A0n)) && (1JF.A0B(C1q7.A07(message, false)) ^ true);
    }
}
