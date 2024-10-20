package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.model.SharedAlbumArgs;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import java.util.List;
import java.util.Set;

/* renamed from: X.9c5, reason: invalid class name */
/* loaded from: 9c5.class */
public final class C9c5 {
    public String A00;
    public final Context A01;
    public final View A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final SharedAlbumArgs A08;

    public C9c5(View view, SharedAlbumArgs sharedAlbumArgs) {
        11T.A0F(view, 1);
        this.A02 = view;
        this.A08 = sharedAlbumArgs;
        Context context = view.getContext();
        this.A01 = context;
        this.A07 = 1Bu.A00(83430);
        this.A03 = 1Bu.A00(67527);
        this.A06 = 7zM.A0g(context, 67784);
        this.A04 = 7zM.A0f(context);
        this.A05 = 1Bu.A00(68433);
        this.A00 = "";
    }

    public final void A00(Context context, final FbUserSession fbUserSession, final String str) {
        4YV.A1N(fbUserSession, str);
        new 1Iw(context);
        this.A00 = str;
        MigColorScheme A0m = 7zQ.A0m(this.A04);
        Context context2 = this.A01;
        EditText editText = new EditText(context2);
        editText.setText(SpannableStringBuilder.valueOf(this.A00));
        final int i = 1;
        editText.setSingleLine(true);
        editText.setTextColor(A0m.B4i());
        editText.setOnFocusChangeListener(new C9q0(this, 0));
        editText.addTextChangedListener(new 9pI(this, 6));
        int dimensionPixelSize = this.A02.getResources().getDimensionPixelSize(2132279310);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0);
        final LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        linearLayout.addView(editText, layoutParams);
        DR6 A02 = ((C5ic) 1Br.A0B(this.A03)).A02(context);
        A02.A00(2131956236);
        A02.A0I(linearLayout);
        A02.A0D(new DialogInterface.OnClickListener(linearLayout, fbUserSession, this, str, i) { // from class: X.9nk
            public final int A00;
            public final Object A01;
            public final Object A02;
            public final Object A03;
            public final String A04;

            {
                this.A00 = i;
                this.A03 = this;
                this.A04 = str;
                this.A02 = fbUserSession;
                this.A01 = linearLayout;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (this.A00 == 0) {
                    11T.A0F(dialogInterface, 0);
                    ((Handler) 1Br.A0B(((Hzk) this.A03).A02)).post((Runnable) this.A02);
                    dialogInterface.dismiss();
                    ((Set) this.A01).add(this.A04);
                    return;
                }
                C9c5 c9c5 = (C9c5) this.A03;
                if (!11T.A0O(4YU.A13(c9c5.A00), this.A04)) {
                    FbUserSession fbUserSession2 = (FbUserSession) this.A02;
                    if (0CU.A0O(c9c5.A00)) {
                        C00i c00i = c9c5.A07.A00;
                        String str2 = ((User) c00i.get()).A0X.firstName;
                        if (str2 == null) {
                            str2 = 7zL.A13((User) c00i.get());
                        }
                        String A0v = 1BK.A0v(c9c5.A01, str2, 2131955203);
                        11T.A0A(A0v);
                        c9c5.A00 = A0v;
                    }
                    Context context3 = c9c5.A01;
                    11T.A09(context3);
                    9ZC r0 = (9ZC) 1Lm.A05(context3, fbUserSession2, 68588);
                    SharedAlbumArgs sharedAlbumArgs = c9c5.A08;
                    ThreadKey threadKey = sharedAlbumArgs.A01;
                    long j = sharedAlbumArgs.A00;
                    String A13 = 4YU.A13(c9c5.A00);
                    AV3 A00 = AV3.A00(c9c5, 2);
                    7zQ.A1Y(threadKey, A13, 2);
                    4YV.A11(r0.A00).execute(new SEb(threadKey, r0, A13, A00, j));
                    9nJ.A03(C98N.ALBUM_RENAME_DIALOG, 98L.A02, threadKey, 7zQ.A0j(c9c5.A05), "click", "button_save", (List) null, (List) null, j);
                }
                C5fi.A01((View) this.A01);
            }
        }, 2131956235);
        C9oG.A01(A02, linearLayout, 59, 2131952729);
        A02.A0H(new IGZ(linearLayout, 16));
        7zN.A13(A02);
        9nJ A0j = 7zQ.A0j(this.A05);
        SharedAlbumArgs sharedAlbumArgs = this.A08;
        ThreadKey threadKey = sharedAlbumArgs.A01;
        long j = sharedAlbumArgs.A00;
        11T.A0F(threadKey, 0);
        9nJ.A03(C98N.ALBUM_RENAME_DIALOG, 98L.A02, threadKey, A0j, "impression", "none", (List) null, (List) null, j);
    }

    public final void A01(Context context, FbUserSession fbUserSession, C00m c00m) {
        11T.A0F(fbUserSession, 0);
        DR6 A02 = ((C5ic) 1Br.A0B(this.A03)).A02(context);
        A02.A00(2131955645);
        A02.A06(2131955644);
        C9oG.A01(A02, this, 57, 2131952729);
        A02.A0D(new C9nj(5, fbUserSession, c00m, this), 2131955643);
        7zN.A13(A02);
        9nJ A0j = 7zQ.A0j(this.A05);
        SharedAlbumArgs sharedAlbumArgs = this.A08;
        ThreadKey threadKey = sharedAlbumArgs.A01;
        long j = sharedAlbumArgs.A00;
        11T.A0F(threadKey, 0);
        9nJ.A03(C98N.ALBUM_DELETE_DIALOG, 98L.A02, threadKey, A0j, "impression", "none", (List) null, (List) null, j);
    }
}
