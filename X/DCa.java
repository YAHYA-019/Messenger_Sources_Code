package X;

import com.facebook.messaging.communitymessaging.model.MessengerApprovalMode;
import java.util.LinkedHashMap;

/* loaded from: DCa.class */
public final class DCa extends C00q implements C00m {
    public static final DCa A00 = new DCa();

    public DCa() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        MessengerApprovalMode[] values = MessengerApprovalMode.values();
        int length = values.length;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbL.A00(length));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return linkedHashMap;
            }
            MessengerApprovalMode messengerApprovalMode = values[i2];
            1BK.A1O(messengerApprovalMode, linkedHashMap, messengerApprovalMode.value);
            i = i2 + 1;
        }
    }
}
