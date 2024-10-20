package X;

import com.facebook.account.recovery.common.protocol.AccountRecoveryValidateFlashCallMethod$Params;
import com.facebook.account.recovery.common.protocol.AccountRecoveryValidateFlashCallMethod$Result;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: Fgl.class */
public final class Fgl implements 1Ro {
    public static final String __redex_internal_original_name = "AccountRecoveryValidateFlashCallMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        AccountRecoveryValidateFlashCallMethod$Params accountRecoveryValidateFlashCallMethod$Params = (AccountRecoveryValidateFlashCallMethod$Params) obj;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("cuid", accountRecoveryValidateFlashCallMethod$Params.A01);
        ImmutableList copyOf = ImmutableList.copyOf((Collection) accountRecoveryValidateFlashCallMethod$Params.A02);
        JSONArray jSONArray = new JSONArray();
        Iterator it = copyOf.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        A0u.put("encrypted_phone_numbers", jSONArray.toString());
        A0u.put("cli", accountRecoveryValidateFlashCallMethod$Params.A00);
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "accountRecoveryValidateFlashCall");
        A0T.A0F = "auth/flashcall_account_recovery";
        A0T.A02();
        A0T.A06(A0u);
        A0T.A06 = 0S2.A0C;
        A0T.A0L = true;
        return A0T.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return anonymousClass439.A00().A1W(AccountRecoveryValidateFlashCallMethod$Result.class);
    }
}
