package X;

import android.content.Context;
import android.text.Html;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.messaging.rtc.incall.impl.active.lobby.views.LobbyRootView;
import java.util.ArrayList;

/* loaded from: Cwk.class */
public final class Cwk implements AnonymousClass553 {
    public final /* synthetic */ LobbyRootView A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public Cwk(LobbyRootView lobbyRootView, String str, String str2) {
        this.A00 = lobbyRootView;
        this.A02 = str;
        this.A01 = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v84, types: [android.text.Spanned] */
    @Override // X.AnonymousClass553
    public final void onClick(View view) {
        LobbyRootView lobbyRootView = this.A00;
        By3 by3 = (By3) 1Br.A0B(lobbyRootView.A0N);
        Context context = lobbyRootView.A04;
        String str = this.A02;
        String str2 = this.A01;
        11T.A0F(context, 0);
        Context A00 = AnonymousClass016.A00(context, FragmentActivity.class);
        ArrayList A0s = AnonymousClass001.A0s();
        1Br r0 = by3.A04;
        if (1Br.A07(((C36) 1Br.A0B(r0)).A00).AZk(36317792483422046L)) {
            AnonymousClass001.A1J(A0s, 0);
        }
        if (!A0s.isEmpty() && A00 != null) {
            C00i c00i = by3.A05.A00;
            if (AbG.A0m(c00i).A06 != null) {
                String[] strArr = new String[A0s.size()];
                int size = A0s.size();
                for (int i = 0; i < size; i++) {
                    Number number = (Number) A0s.get(i);
                    if (number == null || number.intValue() != 0) {
                        throw AnonymousClass001.A0N("Option not found");
                    }
                    strArr[i] = ((C36) 1Br.A0B(r0)).A00();
                }
                if (AbG.A0m(c00i).A0P()) {
                    if (str == null) {
                        str = "";
                    }
                    str = Html.fromHtml(str);
                }
                String str3 = str;
                if (str2 != null) {
                    StringBuilder A0n = AnonymousClass001.A0n(str2);
                    A0n.append(' ');
                    str3 = AnonymousClass001.A0a(str3, A0n);
                }
                1Br.A0C(by3.A01);
                DR6 A0K = AbL.A0K(context, by3.A03);
                A0K.A03(str3);
                A0K.A01(new CRA(6, context, A0s, by3), strArr);
                JZj A04 = A0K.A04();
                A04.show();
                by3.A00 = A04;
                return;
            }
        }
        4zI.A03.A09("ReportRoomDialogHelper", "Failed to display Rooms lobby report menu", new Object[0]);
    }
}
