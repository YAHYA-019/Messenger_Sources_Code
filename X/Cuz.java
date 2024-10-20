package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: Cuz.class */
public final class Cuz implements 6Ge {
    public final 1Br A00;
    public final 1Br A01;

    public Cuz(Context context) {
        11T.A0F(context, 1);
        this.A00 = 1HG.A00(context, 99435);
        this.A01 = 1BK.A0C();
    }

    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        C9g5 A0c = AbF.A0c();
        A0c.A02 = BNO.A04.id;
        A0c.A06 = "add_to_personal_task";
        A0c.A00 = 2132214317;
        A0c.A01 = 2132411630;
        A0c.A03 = 2131959578;
        return new MenuDialogItem(A0c);
    }

    public String AaH() {
        return "CLick on Menu Item: AddPersonalTask";
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        String str;
        4YV.A1M(context, 0, message);
        BjM bjM = (BjM) 1Bn.A0A(82014);
        String A0x = 4YU.A0x(message);
        str = "";
        str = A0x != null ? new C04t("[^\\d\\s\\w\\p{Punct}]").A00(A0x, str) : "";
        BjK bjK = new BjK(this);
        CfG cfG = new CfG(context, 2131968153);
        cfG.ABm();
        C1689Apv c1689Apv = new C1689Apv();
        4YV.A1A(4YU.A0J(GraphQlCallInput.A02, str, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), ((2Jf) c1689Apv).A00, "input");
        5Dh r0 = new 5Dh(c1689Apv);
        AbstractC05414dq A06 = 1VX.A06(FbInjector.A00(), 1BL.A0E());
        4YV.A1B(r0);
        1Br.A0D(bjM.A00, new D4o(bjK, cfG, 15), A06.A06(r0));
        return true;
    }

    public boolean Cyd(Context context, Parcelable parcelable, Message message, ThreadSummary threadSummary, Capabilities capabilities, boolean z) {
        11T.A0F(message, 1);
        return false;
    }
}
